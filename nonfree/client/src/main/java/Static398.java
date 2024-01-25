import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString179;

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "I")
	private static int anInt7003;

	@OriginalMember(owner = "client!ow", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString180;

	@OriginalMember(owner = "client!ow", name = "c", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable6 = new Hashtable(16);

	@OriginalMember(owner = "client!ow", name = "e", descriptor = "Z")
	private static boolean aBoolean482 = false;

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;")
	public static File method5597(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (!aBoolean482) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable6.get(arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(50) String[] local50 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString179, "/tmp/", "" };
		@Pc(73) String[] local73 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(75) int local75 = 0; local75 < 2; local75++) {
			for (@Pc(82) int local82 = 0; local82 < local73.length; local82++) {
				for (@Pc(85) int local85 = 0; local85 < local50.length; local85++) {
					@Pc(116) String local116 = local50[local85] + local73[local82] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
					@Pc(118) RandomAccessFile local118 = null;
					try {
						@Pc(123) File local123 = new File(local116);
						if (local75 != 0 || local123.exists()) {
							@Pc(135) String local135 = local50[local85];
							if (local75 != 1 || local135.length() <= 0 || (new File(local135)).exists()) {
								(new File(local50[local85] + local73[local82])).mkdir();
								if (arg1 != null) {
									(new File(local50[local85] + local73[local82] + "/" + arg1)).mkdir();
								}
								local118 = new RandomAccessFile(local123, "rw");
								@Pc(199) int local199 = local118.read();
								local118.seek(0L);
								local118.write(local199);
								local118.seek(0L);
								local118.close();
								aHashtable6.put(arg0, local123);
								return local123;
							}
						}
					} catch (@Pc(218) Exception local218) {
						try {
							if (local118 != null) {
								local118.close();
							}
						} catch (@Pc(226) Exception local226) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public static File method5598(@OriginalArg(0) String arg0) {
		return method5597(arg0, aString180, anInt7003);
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method5599(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		anInt7003 = arg0;
		aString180 = arg1;
		try {
			aString179 = System.getProperty("user.home");
			if (aString179 != null) {
				aString179 = aString179 + "/";
			}
		} catch (@Pc(19) Exception local19) {
		}
		aBoolean482 = true;
		if (aString179 == null) {
			aString179 = "~/";
		}
	}
}
