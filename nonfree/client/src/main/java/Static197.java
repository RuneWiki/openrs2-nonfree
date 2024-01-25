import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString36;

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
	private static int anInt3227;

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString37;

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "Z")
	private static boolean aBoolean305 = false;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IZ)Ljava/io/File;")
	public static File method2799(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (!aBoolean305) {
			throw new RuntimeException("");
		}
		@Pc(12) File local12 = (File) aHashtable2.get(arg1);
		if (local12 != null) {
			return local12;
		}
		@Pc(64) String[] local64 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString36, "/tmp/", "" };
		@Pc(91) String[] local91 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(102) int local102 = 0; local102 < 2; local102++) {
			for (@Pc(105) int local105 = 0; local105 < local91.length; local105++) {
				for (@Pc(108) int local108 = 0; local108 < local64.length; local108++) {
					@Pc(140) String local140 = local64[local108] + local91[local105] + "/" + (arg0 == null ? "" : arg0 + "/") + arg1;
					@Pc(142) RandomAccessFile local142 = null;
					try {
						@Pc(147) File local147 = new File(local140);
						if (local102 != 0 || local147.exists()) {
							@Pc(161) String local161 = local64[local108];
							if (local102 != 1 || local161.length() <= 0 || (new File(local161)).exists()) {
								(new File(local64[local108] + local91[local105])).mkdir();
								if (arg0 != null) {
									(new File(local64[local108] + local91[local105] + "/" + arg0)).mkdir();
								}
								local142 = new RandomAccessFile(local147, "rw");
								@Pc(233) int local233 = local142.read();
								local142.seek(0L);
								local142.write(local233);
								local142.seek(0L);
								local142.close();
								aHashtable2.put(arg1, local147);
								return local147;
							}
						}
					} catch (@Pc(252) Exception local252) {
						try {
							if (local142 != null) {
								local142.close();
							}
						} catch (@Pc(260) Exception local260) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/io/File;")
	public static File method2800(@OriginalArg(0) String arg0) {
		return method2799(aString37, arg0, anInt3227);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/lang/String;BI)V")
	public static void method2801(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		aString37 = arg0;
		anInt3227 = arg1;
		try {
			aString36 = System.getProperty("user.home");
			if (aString36 != null) {
				aString36 = aString36 + "/";
			}
		} catch (@Pc(21) Exception local21) {
		}
		aBoolean305 = true;
		if (aString36 == null) {
			aString36 = "~/";
		}
	}
}
