import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!eja", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString19;

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString20;

	@OriginalMember(owner = "client!eja", name = "b", descriptor = "I")
	private static int anInt2622;

	@OriginalMember(owner = "client!eja", name = "e", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable3 = new Hashtable(16);

	@OriginalMember(owner = "client!eja", name = "d", descriptor = "Z")
	private static boolean aBoolean206 = false;

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
	public static File method2563(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean206) {
			throw new RuntimeException("");
		}
		@Pc(18) File local18 = (File) aHashtable3.get(arg2);
		if (local18 != null) {
			return local18;
		}
		@Pc(70) String[] local70 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString20, "/tmp/", "" };
		@Pc(97) String[] local97 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(99) int local99 = 0; local99 < 2; local99++) {
			for (@Pc(102) int local102 = 0; local102 < local97.length; local102++) {
				for (@Pc(105) int local105 = 0; local105 < local70.length; local105++) {
					@Pc(137) String local137 = local70[local105] + local97[local102] + "/" + (arg1 == null ? "" : arg1 + "/") + arg2;
					@Pc(139) RandomAccessFile local139 = null;
					try {
						@Pc(144) File local144 = new File(local137);
						if (local99 != 0 || local144.exists()) {
							@Pc(155) String local155 = local70[local105];
							if (local99 != 1 || local155.length() <= 0 || (new File(local155)).exists()) {
								(new File(local70[local105] + local97[local102])).mkdir();
								if (arg1 != null) {
									(new File(local70[local105] + local97[local102] + "/" + arg1)).mkdir();
								}
								local139 = new RandomAccessFile(local144, "rw");
								@Pc(227) int local227 = local139.read();
								local139.seek(0L);
								local139.write(local227);
								local139.seek(0L);
								local139.close();
								aHashtable3.put(arg2, local144);
								return local144;
							}
						}
					} catch (@Pc(246) Exception local246) {
						try {
							if (local139 != null) {
								local139.close();
							}
						} catch (@Pc(254) Exception local254) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	public static void method2564(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		anInt2622 = arg1;
		aString19 = arg0;
		try {
			aString20 = System.getProperty("user.home");
			if (aString20 != null) {
				aString20 = aString20 + "/";
			}
		} catch (@Pc(28) Exception local28) {
		}
		aBoolean206 = true;
		if (aString20 == null) {
			aString20 = "~/";
		}
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/io/File;")
	public static File method2565(@OriginalArg(0) String arg0) {
		return method2563(anInt2622, aString19, arg0);
	}
}
