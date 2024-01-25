import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "I")
	private static int anInt8019;

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString96;

	@OriginalMember(owner = "client!ov", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString97;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "Z")
	private static boolean aBoolean594 = false;

	@OriginalMember(owner = "client!ov", name = "e", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable6 = new Hashtable(16);

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public static File method7165(@OriginalArg(1) String arg0) {
		return method7166(aString96, anInt8019, arg0);
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)Ljava/io/File;")
	public static File method7166(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean594) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable6.get(arg2);
		if (local11 != null) {
			return local11;
		}
		@Pc(50) String[] local50 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString97, "/tmp/", "" };
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
								@Pc(192) int local192 = local114.read();
								local114.seek(0L);
								local114.write(local192);
								local114.seek(0L);
								local114.close();
								aHashtable6.put(arg2, local119);
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

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(BLjava/lang/String;I)V")
	public static void method7167(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		anInt8019 = arg1;
		aString96 = arg0;
		try {
			aString97 = System.getProperty("user.home");
			if (aString97 != null) {
				aString97 = aString97 + "/";
			}
		} catch (@Pc(26) Exception local26) {
		}
		if (aString97 == null) {
			aString97 = "~/";
		}
		aBoolean594 = true;
	}
}
