import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
	private static int anInt6980;

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString77;

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString78;

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "Z")
	private static boolean aBoolean499 = false;

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable7 = new Hashtable(16);

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/io/File;")
	public static File method5999(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (!aBoolean499) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable7.get(arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(50) String[] local50 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString78, "/tmp/", "" };
		@Pc(73) String[] local73 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(75) int local75 = 0; local75 < 2; local75++) {
			for (@Pc(78) int local78 = 0; local78 < local73.length; local78++) {
				for (@Pc(81) int local81 = 0; local81 < local50.length; local81++) {
					@Pc(112) String local112 = local50[local81] + local73[local78] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
					@Pc(114) RandomAccessFile local114 = null;
					try {
						@Pc(119) File local119 = new File(local112);
						if (local75 != 0 || local119.exists()) {
							@Pc(131) String local131 = local50[local81];
							if (local75 != 1 || local131.length() <= 0 || (new File(local131)).exists()) {
								(new File(local50[local81] + local73[local78])).mkdir();
								if (arg1 != null) {
									(new File(local50[local81] + local73[local78] + "/" + arg1)).mkdir();
								}
								local114 = new RandomAccessFile(local119, "rw");
								@Pc(194) int local194 = local114.read();
								local114.seek(0L);
								local114.write(local194);
								local114.seek(0L);
								local114.close();
								aHashtable7.put(arg0, local119);
								return local119;
							}
						}
					} catch (@Pc(213) Exception local213) {
						try {
							if (local114 != null) {
								local114.close();
							}
						} catch (@Pc(221) Exception local221) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public static File method6000(@OriginalArg(0) String arg0) {
		return method5999(arg0, aString77, anInt6980);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method6001(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		anInt6980 = arg0;
		aString77 = arg1;
		try {
			aString78 = System.getProperty("user.home");
			if (aString78 != null) {
				aString78 = aString78 + "/";
			}
		} catch (@Pc(19) Exception local19) {
		}
		if (aString78 == null) {
			aString78 = "~/";
		}
		aBoolean499 = true;
	}
}
