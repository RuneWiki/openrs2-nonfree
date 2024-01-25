import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "I")
	private static int anInt3918;

	@OriginalMember(owner = "client!iba", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString40;

	@OriginalMember(owner = "client!iba", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString41;

	@OriginalMember(owner = "client!iba", name = "d", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable5 = new Hashtable(16);

	@OriginalMember(owner = "client!iba", name = "e", descriptor = "Z")
	private static boolean aBoolean281 = false;

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/io/File;")
	public static File method3209(@OriginalArg(0) String arg0) {
		return method3210(anInt3918, aString40, arg0);
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILjava/lang/String;BLjava/lang/String;)Ljava/io/File;")
	public static File method3210(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean281) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable5.get(arg2);
		if (local11 != null) {
			return local11;
		}
		@Pc(50) String[] local50 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString41, "/tmp/", "" };
		@Pc(73) String[] local73 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(75) int local75 = 0; local75 < 2; local75++) {
			for (@Pc(78) int local78 = 0; local78 < local73.length; local78++) {
				for (@Pc(81) int local81 = 0; local81 < local50.length; local81++) {
					@Pc(112) String local112 = local50[local81] + local73[local78] + "/" + (arg1 == null ? "" : arg1 + "/") + arg2;
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
								@Pc(195) int local195 = local114.read();
								local114.seek(0L);
								local114.write(local195);
								local114.seek(0L);
								local114.close();
								aHashtable5.put(arg2, local119);
								return local119;
							}
						}
					} catch (@Pc(214) Exception local214) {
						try {
							if (local114 != null) {
								local114.close();
							}
						} catch (@Pc(222) Exception local222) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method3211(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		anInt3918 = arg1;
		aString40 = arg0;
		try {
			aString41 = System.getProperty("user.home");
			if (aString41 != null) {
				aString41 = aString41 + "/";
			}
		} catch (@Pc(19) Exception local19) {
		}
		if (aString41 == null) {
			aString41 = "~/";
		}
		aBoolean281 = true;
	}
}
