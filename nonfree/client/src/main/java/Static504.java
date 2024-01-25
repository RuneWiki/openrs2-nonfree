import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static504 {

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "I")
	private static int anInt8368;

	@OriginalMember(owner = "client!tfa", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString91;

	@OriginalMember(owner = "client!tfa", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString92;

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "Z")
	private static boolean aBoolean601 = false;

	@OriginalMember(owner = "client!tfa", name = "d", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable6 = new Hashtable(16);

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method6800(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		aString92 = arg0;
		anInt8368 = arg1;
		try {
			aString91 = System.getProperty("user.home");
			if (aString91 != null) {
				aString91 = aString91 + "/";
			}
		} catch (@Pc(19) Exception local19) {
		}
		aBoolean601 = true;
		if (aString91 == null) {
			aString91 = "~/";
		}
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public static File method6801(@OriginalArg(1) String arg0) {
		return method6802(aString92, anInt8368, arg0);
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)Ljava/io/File;")
	public static File method6802(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean601) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable6.get(arg2);
		if (local11 != null) {
			return local11;
		}
		@Pc(50) String[] local50 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString91, "/tmp/", "" };
		@Pc(73) String[] local73 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(80) int local80 = 0; local80 < 2; local80++) {
			for (@Pc(83) int local83 = 0; local83 < local73.length; local83++) {
				for (@Pc(86) int local86 = 0; local86 < local50.length; local86++) {
					@Pc(117) String local117 = local50[local86] + local73[local83] + "/" + (arg0 == null ? "" : arg0 + "/") + arg2;
					@Pc(119) RandomAccessFile local119 = null;
					try {
						@Pc(124) File local124 = new File(local117);
						if (local80 != 0 || local124.exists()) {
							@Pc(136) String local136 = local50[local86];
							if (local80 != 1 || local136.length() <= 0 || (new File(local136)).exists()) {
								(new File(local50[local86] + local73[local83])).mkdir();
								if (arg0 != null) {
									(new File(local50[local86] + local73[local83] + "/" + arg0)).mkdir();
								}
								local119 = new RandomAccessFile(local124, "rw");
								@Pc(200) int local200 = local119.read();
								local119.seek(0L);
								local119.write(local200);
								local119.seek(0L);
								local119.close();
								aHashtable6.put(arg2, local124);
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
