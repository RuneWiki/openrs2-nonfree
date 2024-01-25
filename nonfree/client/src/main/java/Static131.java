import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "I")
	private static int anInt2838;

	@OriginalMember(owner = "client!fda", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString21;

	@OriginalMember(owner = "client!fda", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString22;

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable3 = new Hashtable(16);

	@OriginalMember(owner = "client!fda", name = "d", descriptor = "Z")
	private static boolean aBoolean213 = false;

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method2638(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		aString22 = arg1;
		anInt2838 = arg0;
		try {
			aString21 = System.getProperty("user.home");
			if (aString21 != null) {
				aString21 = aString21 + "/";
			}
		} catch (@Pc(19) Exception local19) {
		}
		aBoolean213 = true;
		if (aString21 == null) {
			aString21 = "~/";
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public static File method2639(@OriginalArg(0) String arg0) {
		return method2640(aString22, arg0, anInt2838);
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)Ljava/io/File;")
	public static File method2640(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (!aBoolean213) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable3.get(arg1);
		if (local11 != null) {
			return local11;
		}
		@Pc(50) String[] local50 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString21, "/tmp/", "" };
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
								aHashtable3.put(arg1, local119);
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
}
