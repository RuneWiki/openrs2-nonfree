import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static563 {

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "I")
	private static int anInt9566;

	@OriginalMember(owner = "client!wca", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString108;

	@OriginalMember(owner = "client!wca", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString109;

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "Z")
	private static boolean aBoolean708 = false;

	@OriginalMember(owner = "client!wca", name = "d", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable7 = new Hashtable(16);

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method7981(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		anInt9566 = arg1;
		aString108 = arg0;
		try {
			aString109 = System.getProperty("user.home");
			if (aString109 != null) {
				aString109 = aString109 + "/";
			}
		} catch (@Pc(25) Exception local25) {
		}
		if (aString109 == null) {
			aString109 = "~/";
		}
		aBoolean708 = true;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/io/File;")
	public static File method7982(@OriginalArg(0) String arg0) {
		return method7983(arg0, aString108, anInt9566);
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
	public static File method7983(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		if (!aBoolean708) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable7.get(arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(55) String[] local55 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString109, "/tmp/", "" };
		@Pc(78) String[] local78 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(80) int local80 = 0; local80 < 2; local80++) {
			for (@Pc(83) int local83 = 0; local83 < local78.length; local83++) {
				for (@Pc(86) int local86 = 0; local86 < local55.length; local86++) {
					@Pc(117) String local117 = local55[local86] + local78[local83] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
					@Pc(119) RandomAccessFile local119 = null;
					try {
						@Pc(124) File local124 = new File(local117);
						if (local80 != 0 || local124.exists()) {
							@Pc(136) String local136 = local55[local86];
							if (local80 != 1 || local136.length() <= 0 || (new File(local136)).exists()) {
								(new File(local55[local86] + local78[local83])).mkdir();
								if (arg1 != null) {
									(new File(local55[local86] + local78[local83] + "/" + arg1)).mkdir();
								}
								local119 = new RandomAccessFile(local124, "rw");
								@Pc(200) int local200 = local119.read();
								local119.seek(0L);
								local119.write(local200);
								local119.seek(0L);
								local119.close();
								aHashtable7.put(arg0, local124);
								return local124;
							}
						}
					} catch (@Pc(219) Exception local219) {
						try {
							if (local119 != null) {
								local119.close();
							}
						} catch (@Pc(227) Exception local227) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}
}
