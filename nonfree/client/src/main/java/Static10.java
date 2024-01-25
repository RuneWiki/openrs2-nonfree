import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!af", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString1;

	@OriginalMember(owner = "client!af", name = "c", descriptor = "I")
	private static int anInt128;

	@OriginalMember(owner = "client!af", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString2;

	@OriginalMember(owner = "client!af", name = "d", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable1 = new Hashtable(16);

	@OriginalMember(owner = "client!af", name = "a", descriptor = "Z")
	private static boolean aBoolean9 = false;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method147(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		aString2 = arg0;
		anInt128 = arg1;
		try {
			aString1 = System.getProperty("user.home");
			if (aString1 != null) {
				aString1 = aString1 + "/";
			}
		} catch (@Pc(32) Exception local32) {
		}
		if (aString1 == null) {
			aString1 = "~/";
		}
		aBoolean9 = true;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ZLjava/lang/String;ILjava/lang/String;)Ljava/io/File;")
	public static File method148(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean9) {
			throw new RuntimeException("");
		}
		@Pc(12) File local12 = (File) aHashtable1.get(arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(64) String[] local64 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString1, "/tmp/", "" };
		@Pc(98) String[] local98 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(100) int local100 = 0; local100 < 2; local100++) {
			for (@Pc(103) int local103 = 0; local103 < local98.length; local103++) {
				for (@Pc(106) int local106 = 0; local106 < local64.length; local106++) {
					@Pc(138) String local138 = local64[local106] + local98[local103] + "/" + (arg2 == null ? "" : arg2 + "/") + arg0;
					@Pc(140) RandomAccessFile local140 = null;
					try {
						@Pc(145) File local145 = new File(local138);
						if (local100 != 0 || local145.exists()) {
							@Pc(159) String local159 = local64[local106];
							if (local100 != 1 || local159.length() <= 0 || (new File(local159)).exists()) {
								(new File(local64[local106] + local98[local103])).mkdir();
								if (arg2 != null) {
									(new File(local64[local106] + local98[local103] + "/" + arg2)).mkdir();
								}
								local140 = new RandomAccessFile(local145, "rw");
								@Pc(228) int local228 = local140.read();
								local140.seek(0L);
								local140.write(local228);
								local140.seek(0L);
								local140.close();
								aHashtable1.put(arg0, local145);
								return local145;
							}
						}
					} catch (@Pc(247) Exception local247) {
						try {
							if (local140 != null) {
								local140.close();
							}
						} catch (@Pc(255) Exception local255) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public static File method149(@OriginalArg(0) String arg0) {
		return method148(arg0, anInt128, aString2);
	}
}
