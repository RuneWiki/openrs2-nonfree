import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!en", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString22;

	@OriginalMember(owner = "client!en", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString23;

	@OriginalMember(owner = "client!en", name = "e", descriptor = "I")
	private static int anInt3198;

	@OriginalMember(owner = "client!en", name = "b", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable7 = new Hashtable(16);

	@OriginalMember(owner = "client!en", name = "c", descriptor = "Z")
	private static boolean aBoolean250 = false;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	public static void method2911(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		aString23 = arg0;
		anInt3198 = arg1;
		try {
			aString22 = System.getProperty("user.home");
			if (aString22 != null) {
				aString22 = aString22 + "/";
			}
		} catch (@Pc(26) Exception local26) {
		}
		if (aString22 == null) {
			aString22 = "~/";
		}
		aBoolean250 = true;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public static File method2912(@OriginalArg(0) String arg0) {
		return method2913(aString23, arg0, anInt3198);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;I)Ljava/io/File;")
	public static File method2913(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (!aBoolean250) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable7.get(arg1);
		if (local11 != null) {
			return local11;
		}
		@Pc(50) String[] local50 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString22, "/tmp/", "" };
		@Pc(73) String[] local73 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(75) int local75 = 0; local75 < 2; local75++) {
			for (@Pc(78) int local78 = 0; local78 < local73.length; local78++) {
				for (@Pc(81) int local81 = 0; local81 < local50.length; local81++) {
					@Pc(112) String local112 = local50[local81] + local73[local78] + "/" + (arg0 == null ? "" : arg0 + "/") + arg1;
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
								@Pc(191) int local191 = local114.read();
								local114.seek(0L);
								local114.write(local191);
								local114.seek(0L);
								local114.close();
								aHashtable7.put(arg1, local119);
								return local119;
							}
						}
					} catch (@Pc(210) Exception local210) {
						try {
							if (local114 != null) {
								local114.close();
							}
						} catch (@Pc(218) Exception local218) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}
}
