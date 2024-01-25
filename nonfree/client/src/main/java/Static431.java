import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString67;

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
	private static int anInt7247;

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString68;

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "Z")
	private static boolean aBoolean543 = false;

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable5 = new Hashtable(16);

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public static File method6074(@OriginalArg(1) String arg0) {
		return method6076(arg0, anInt7247, aString67);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method6075(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		aString67 = arg1;
		anInt7247 = arg0;
		try {
			aString68 = System.getProperty("user.home");
			if (aString68 != null) {
				aString68 = aString68 + "/";
			}
		} catch (@Pc(28) Exception local28) {
		}
		aBoolean543 = true;
		if (aString68 == null) {
			aString68 = "~/";
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/io/File;")
	public static File method6076(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (!aBoolean543) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable5.get(arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(57) String[] local57 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString68, "/tmp/", "" };
		@Pc(80) String[] local80 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(82) int local82 = 0; local82 < 2; local82++) {
			for (@Pc(85) int local85 = 0; local85 < local80.length; local85++) {
				for (@Pc(88) int local88 = 0; local88 < local57.length; local88++) {
					@Pc(119) String local119 = local57[local88] + local80[local85] + "/" + (arg2 == null ? "" : arg2 + "/") + arg0;
					@Pc(121) RandomAccessFile local121 = null;
					try {
						@Pc(126) File local126 = new File(local119);
						if (local82 != 0 || local126.exists()) {
							@Pc(135) String local135 = local57[local88];
							if (local82 != 1 || local135.length() <= 0 || (new File(local135)).exists()) {
								(new File(local57[local88] + local80[local85])).mkdir();
								if (arg2 != null) {
									(new File(local57[local88] + local80[local85] + "/" + arg2)).mkdir();
								}
								local121 = new RandomAccessFile(local126, "rw");
								@Pc(199) int local199 = local121.read();
								local121.seek(0L);
								local121.write(local199);
								local121.seek(0L);
								local121.close();
								aHashtable5.put(arg0, local126);
								return local126;
							}
						}
					} catch (@Pc(218) Exception local218) {
						try {
							if (local121 != null) {
								local121.close();
							}
						} catch (@Pc(226) Exception local226) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}
}
