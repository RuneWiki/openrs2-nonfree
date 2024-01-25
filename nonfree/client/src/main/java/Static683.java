import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static683 {

	@OriginalMember(owner = "client!vha", name = "b", descriptor = "I")
	private static int anInt10804;

	@OriginalMember(owner = "client!vha", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString130;

	@OriginalMember(owner = "client!vha", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString131;

	@OriginalMember(owner = "client!vha", name = "e", descriptor = "Z")
	private static boolean aBoolean780 = false;

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable7 = new Hashtable(16);

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/io/File;")
	public static File method9022(@OriginalArg(0) String arg0) {
		return method9023(aString131, arg0, anInt10804);
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)Ljava/io/File;")
	public static File method9023(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (!aBoolean780) {
			throw new RuntimeException("");
		}
		@Pc(19) File local19 = (File) aHashtable7.get(arg1);
		if (local19 != null) {
			return local19;
		}
		@Pc(71) String[] local71 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString130, "/tmp/", "" };
		@Pc(98) String[] local98 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(100) int local100 = 0; local100 < 2; local100++) {
			for (@Pc(103) int local103 = 0; local103 < local98.length; local103++) {
				for (@Pc(106) int local106 = 0; local106 < local71.length; local106++) {
					@Pc(138) String local138 = local71[local106] + local98[local103] + "/" + (arg0 == null ? "" : arg0 + "/") + arg1;
					@Pc(140) RandomAccessFile local140 = null;
					try {
						@Pc(145) File local145 = new File(local138);
						if (local100 != 0 || local145.exists()) {
							@Pc(156) String local156 = local71[local106];
							if (local100 != 1 || local156.length() <= 0 || (new File(local156)).exists()) {
								(new File(local71[local106] + local98[local103])).mkdir();
								if (arg0 != null) {
									(new File(local71[local106] + local98[local103] + "/" + arg0)).mkdir();
								}
								local140 = new RandomAccessFile(local145, "rw");
								@Pc(230) int local230 = local140.read();
								local140.seek(0L);
								local140.write(local230);
								local140.seek(0L);
								local140.close();
								aHashtable7.put(arg1, local145);
								return local145;
							}
						}
					} catch (@Pc(249) Exception local249) {
						try {
							if (local140 != null) {
								local140.close();
							}
						} catch (@Pc(257) Exception local257) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method9024(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		aString131 = arg1;
		anInt10804 = arg0;
		try {
			aString130 = System.getProperty("user.home");
			if (aString130 != null) {
				aString130 = aString130 + "/";
			}
		} catch (@Pc(21) Exception local21) {
		}
		aBoolean780 = true;
		if (aString130 == null) {
			aString130 = "~/";
		}
	}
}
