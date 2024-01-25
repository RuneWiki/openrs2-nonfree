import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString78;

	@OriginalMember(owner = "client!nea", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString79;

	@OriginalMember(owner = "client!nea", name = "d", descriptor = "I")
	private static int anInt6014;

	@OriginalMember(owner = "client!nea", name = "c", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable5 = new Hashtable(16);

	@OriginalMember(owner = "client!nea", name = "e", descriptor = "Z")
	private static boolean aBoolean470 = false;

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
	public static File method5045(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean470) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable5.get(arg2);
		if (local11 != null) {
			return local11;
		}
		@Pc(50) String[] local50 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString79, "/tmp/", "" };
		@Pc(73) String[] local73 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(81) int local81 = 0; local81 < 2; local81++) {
			for (@Pc(84) int local84 = 0; local84 < local73.length; local84++) {
				for (@Pc(87) int local87 = 0; local87 < local50.length; local87++) {
					@Pc(118) String local118 = local50[local87] + local73[local84] + "/" + (arg1 == null ? "" : arg1 + "/") + arg2;
					@Pc(120) RandomAccessFile local120 = null;
					try {
						@Pc(125) File local125 = new File(local118);
						if (local81 != 0 || local125.exists()) {
							@Pc(134) String local134 = local50[local87];
							if (local81 != 1 || local134.length() <= 0 || (new File(local134)).exists()) {
								(new File(local50[local87] + local73[local84])).mkdir();
								if (arg1 != null) {
									(new File(local50[local87] + local73[local84] + "/" + arg1)).mkdir();
								}
								local120 = new RandomAccessFile(local125, "rw");
								@Pc(195) int local195 = local120.read();
								local120.seek(0L);
								local120.write(local195);
								local120.seek(0L);
								local120.close();
								aHashtable5.put(arg2, local125);
								return local125;
							}
						}
					} catch (@Pc(214) Exception local214) {
						try {
							if (local120 != null) {
								local120.close();
							}
						} catch (@Pc(222) Exception local222) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(BLjava/lang/String;)Ljava/io/File;")
	public static File method5046(@OriginalArg(1) String arg0) {
		return method5045(anInt6014, aString78, arg0);
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method5047(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		anInt6014 = arg1;
		aString78 = arg0;
		try {
			aString79 = System.getProperty("user.home");
			if (aString79 != null) {
				aString79 = aString79 + "/";
			}
		} catch (@Pc(26) Exception local26) {
		}
		if (aString79 == null) {
			aString79 = "~/";
		}
		aBoolean470 = true;
	}
}
