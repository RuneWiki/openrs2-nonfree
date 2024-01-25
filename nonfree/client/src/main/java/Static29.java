import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString6;

	@OriginalMember(owner = "client!bba", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString7;

	@OriginalMember(owner = "client!bba", name = "e", descriptor = "I")
	private static int anInt668;

	@OriginalMember(owner = "client!bba", name = "b", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable1 = new Hashtable(16);

	@OriginalMember(owner = "client!bba", name = "d", descriptor = "Z")
	private static boolean aBoolean58 = false;

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
	public static File method644(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean58) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable1.get(arg2);
		if (local11 != null) {
			return local11;
		}
		@Pc(55) String[] local55 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString7, "/tmp/", "" };
		@Pc(78) String[] local78 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(80) int local80 = 0; local80 < 2; local80++) {
			for (@Pc(83) int local83 = 0; local83 < local78.length; local83++) {
				for (@Pc(86) int local86 = 0; local86 < local55.length; local86++) {
					@Pc(117) String local117 = local55[local86] + local78[local83] + "/" + (arg1 == null ? "" : arg1 + "/") + arg2;
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
								aHashtable1.put(arg2, local124);
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

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method645(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		aString6 = arg1;
		anInt668 = arg0;
		try {
			aString7 = System.getProperty("user.home");
			if (aString7 != null) {
				aString7 = aString7 + "/";
			}
		} catch (@Pc(24) Exception local24) {
		}
		aBoolean58 = true;
		if (aString7 == null) {
			aString7 = "~/";
		}
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public static File method646(@OriginalArg(1) String arg0) {
		return method644(anInt668, aString6, arg0);
	}
}
