import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString26;

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString27;

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
	private static int anInt1814;

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable4 = new Hashtable(16);

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "Z")
	private static boolean aBoolean139 = false;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/io/File;")
	public static File method1513(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (!aBoolean139) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable4.get(arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(50) String[] local50 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString27, "/tmp/", "" };
		@Pc(73) String[] local73 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(83) int local83 = 0; local83 < 2; local83++) {
			for (@Pc(86) int local86 = 0; local86 < local73.length; local86++) {
				for (@Pc(89) int local89 = 0; local89 < local50.length; local89++) {
					@Pc(120) String local120 = local50[local89] + local73[local86] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
					@Pc(122) RandomAccessFile local122 = null;
					try {
						@Pc(127) File local127 = new File(local120);
						if (local83 != 0 || local127.exists()) {
							@Pc(139) String local139 = local50[local89];
							if (local83 != 1 || local139.length() <= 0 || (new File(local139)).exists()) {
								(new File(local50[local89] + local73[local86])).mkdir();
								if (arg1 != null) {
									(new File(local50[local89] + local73[local86] + "/" + arg1)).mkdir();
								}
								local122 = new RandomAccessFile(local127, "rw");
								@Pc(205) int local205 = local122.read();
								local122.seek(0L);
								local122.write(local205);
								local122.seek(0L);
								local122.close();
								aHashtable4.put(arg0, local127);
								return local127;
							}
						}
					} catch (@Pc(224) Exception local224) {
						try {
							if (local122 != null) {
								local122.close();
							}
						} catch (@Pc(232) Exception local232) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public static File method1514(@OriginalArg(1) String arg0) {
		return method1513(arg0, aString26, anInt1814);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/lang/String;BI)V")
	public static void method1515(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		aString26 = arg0;
		anInt1814 = arg1;
		try {
			aString27 = System.getProperty("user.home");
			if (aString27 != null) {
				aString27 = aString27 + "/";
			}
		} catch (@Pc(28) Exception local28) {
		}
		aBoolean139 = true;
		if (aString27 == null) {
			aString27 = "~/";
		}
	}
}
