import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
	private static int anInt6812;

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString96;

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString97;

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "Z")
	private static boolean aBoolean549 = false;

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable5 = new Hashtable(16);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method5829(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		anInt6812 = arg1;
		aString97 = arg0;
		try {
			aString96 = System.getProperty("user.home");
			if (aString96 != null) {
				aString96 = aString96 + "/";
			}
		} catch (@Pc(23) Exception local23) {
		}
		aBoolean549 = true;
		if (aString96 == null) {
			aString96 = "~/";
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/io/File;")
	public static File method5830(@OriginalArg(1) String arg0) {
		return method5831(arg0, aString97, anInt6812);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
	public static File method5831(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (!aBoolean549) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable5.get(arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(55) String[] local55 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString96, "/tmp/", "" };
		@Pc(78) String[] local78 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(80) int local80 = 0; local80 < 2; local80++) {
			for (@Pc(83) int local83 = 0; local83 < local78.length; local83++) {
				for (@Pc(86) int local86 = 0; local86 < local55.length; local86++) {
					@Pc(117) String local117 = local55[local86] + local78[local83] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
					@Pc(119) RandomAccessFile local119 = null;
					try {
						@Pc(124) File local124 = new File(local117);
						if (local80 != 0 || local124.exists()) {
							@Pc(133) String local133 = local55[local86];
							if (local80 != 1 || local133.length() <= 0 || (new File(local133)).exists()) {
								(new File(local55[local86] + local78[local83])).mkdir();
								if (arg1 != null) {
									(new File(local55[local86] + local78[local83] + "/" + arg1)).mkdir();
								}
								local119 = new RandomAccessFile(local124, "rw");
								@Pc(197) int local197 = local119.read();
								local119.seek(0L);
								local119.write(local197);
								local119.seek(0L);
								local119.close();
								aHashtable5.put(arg0, local124);
								return local124;
							}
						}
					} catch (@Pc(216) Exception local216) {
						try {
							if (local119 != null) {
								local119.close();
							}
						} catch (@Pc(224) Exception local224) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}
}
