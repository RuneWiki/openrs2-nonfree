import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
	private static int anInt684;

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString5;

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString6;

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "Z")
	private static boolean aBoolean49 = false;

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable1 = new Hashtable(16);

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public static File method603(@OriginalArg(1) String arg0) {
		return method605(aString5, anInt684, arg0);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method604(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		anInt684 = arg0;
		aString5 = arg1;
		try {
			aString6 = System.getProperty("user.home");
			if (aString6 != null) {
				aString6 = aString6 + "/";
			}
		} catch (@Pc(28) Exception local28) {
		}
		if (aString6 == null) {
			aString6 = "~/";
		}
		aBoolean49 = true;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/io/File;")
	public static File method605(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (!aBoolean49) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable1.get(arg2);
		if (local11 != null) {
			return local11;
		}
		@Pc(50) String[] local50 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString6, "/tmp/", "" };
		@Pc(73) String[] local73 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(75) int local75 = 0; local75 < 2; local75++) {
			for (@Pc(78) int local78 = 0; local78 < local73.length; local78++) {
				for (@Pc(81) int local81 = 0; local81 < local50.length; local81++) {
					@Pc(112) String local112 = local50[local81] + local73[local78] + "/" + (arg0 == null ? "" : arg0 + "/") + arg2;
					@Pc(114) RandomAccessFile local114 = null;
					try {
						@Pc(119) File local119 = new File(local112);
						if (local75 != 0 || local119.exists()) {
							@Pc(128) String local128 = local50[local81];
							if (local75 != 1 || local128.length() <= 0 || (new File(local128)).exists()) {
								(new File(local50[local81] + local73[local78])).mkdir();
								if (arg0 != null) {
									(new File(local50[local81] + local73[local78] + "/" + arg0)).mkdir();
								}
								local114 = new RandomAccessFile(local119, "rw");
								@Pc(189) int local189 = local114.read();
								local114.seek(0L);
								local114.write(local189);
								local114.seek(0L);
								local114.close();
								aHashtable1.put(arg2, local119);
								return local119;
							}
						}
					} catch (@Pc(208) Exception local208) {
						try {
							if (local114 != null) {
								local114.close();
							}
						} catch (@Pc(216) Exception local216) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}
}
