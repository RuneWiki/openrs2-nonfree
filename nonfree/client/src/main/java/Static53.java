import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!br", name = "a", descriptor = "I")
	private static int anInt1883;

	@OriginalMember(owner = "client!br", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString12;

	@OriginalMember(owner = "client!br", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString13;

	@OriginalMember(owner = "client!br", name = "b", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable4 = new Hashtable(16);

	@OriginalMember(owner = "client!br", name = "d", descriptor = "Z")
	private static boolean aBoolean160 = false;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
	public static File method1774(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean160) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable4.get(arg1);
		if (local11 != null) {
			return local11;
		}
		@Pc(50) String[] local50 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString12, "/tmp/", "" };
		@Pc(73) String[] local73 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(75) int local75 = 0; local75 < 2; local75++) {
			for (@Pc(78) int local78 = 0; local78 < local73.length; local78++) {
				for (@Pc(81) int local81 = 0; local81 < local50.length; local81++) {
					@Pc(112) String local112 = local50[local81] + local73[local78] + "/" + (arg2 == null ? "" : arg2 + "/") + arg1;
					@Pc(114) RandomAccessFile local114 = null;
					try {
						@Pc(119) File local119 = new File(local112);
						if (local75 != 0 || local119.exists()) {
							@Pc(128) String local128 = local50[local81];
							if (local75 != 1 || local128.length() <= 0 || (new File(local128)).exists()) {
								(new File(local50[local81] + local73[local78])).mkdir();
								if (arg2 != null) {
									(new File(local50[local81] + local73[local78] + "/" + arg2)).mkdir();
								}
								local114 = new RandomAccessFile(local119, "rw");
								@Pc(191) int local191 = local114.read();
								local114.seek(0L);
								local114.write(local191);
								local114.seek(0L);
								local114.close();
								aHashtable4.put(arg1, local119);
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

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(BLjava/lang/String;I)V")
	public static void method1775(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		anInt1883 = arg1;
		aString13 = arg0;
		try {
			aString12 = System.getProperty("user.home");
			if (aString12 != null) {
				aString12 = aString12 + "/";
			}
		} catch (@Pc(24) Exception local24) {
		}
		aBoolean160 = true;
		if (aString12 == null) {
			aString12 = "~/";
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public static File method1776(@OriginalArg(1) String arg0) {
		return method1774(anInt1883, arg0, aString13);
	}
}
