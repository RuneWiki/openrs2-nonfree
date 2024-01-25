import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static491 {

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "I")
	private static int anInt7849;

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString74;

	@OriginalMember(owner = "client!rda", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString75;

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "Z")
	private static boolean aBoolean559 = false;

	@OriginalMember(owner = "client!rda", name = "e", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable4 = new Hashtable(16);

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/io/File;")
	public static File method6874(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (!aBoolean559) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable4.get(arg1);
		if (local11 != null) {
			return local11;
		}
		@Pc(50) String[] local50 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString75, "/tmp/", "" };
		@Pc(73) String[] local73 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(75) int local75 = 0; local75 < 2; local75++) {
			for (@Pc(78) int local78 = 0; local78 < local73.length; local78++) {
				for (@Pc(81) int local81 = 0; local81 < local50.length; local81++) {
					@Pc(112) String local112 = local50[local81] + local73[local78] + "/" + (arg0 == null ? "" : arg0 + "/") + arg1;
					@Pc(114) RandomAccessFile local114 = null;
					try {
						@Pc(119) File local119 = new File(local112);
						if (local75 != 0 || local119.exists()) {
							@Pc(131) String local131 = local50[local81];
							if (local75 != 1 || local131.length() <= 0 || (new File(local131)).exists()) {
								(new File(local50[local81] + local73[local78])).mkdir();
								if (arg0 != null) {
									(new File(local50[local81] + local73[local78] + "/" + arg0)).mkdir();
								}
								local114 = new RandomAccessFile(local119, "rw");
								@Pc(192) int local192 = local114.read();
								local114.seek(0L);
								local114.write(local192);
								local114.seek(0L);
								local114.close();
								aHashtable4.put(arg1, local119);
								return local119;
							}
						}
					} catch (@Pc(211) Exception local211) {
						try {
							if (local114 != null) {
								local114.close();
							}
						} catch (@Pc(219) Exception local219) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public static File method6875(@OriginalArg(0) String arg0) {
		return method6874(aString74, arg0, anInt7849);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method6876(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		aString74 = arg1;
		anInt7849 = arg0;
		try {
			aString75 = System.getProperty("user.home");
			if (aString75 != null) {
				aString75 = aString75 + "/";
			}
		} catch (@Pc(23) Exception local23) {
		}
		aBoolean559 = true;
		if (aString75 == null) {
			aString75 = "~/";
		}
	}
}
