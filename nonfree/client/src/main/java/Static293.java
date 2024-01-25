import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!or", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString136;

	@OriginalMember(owner = "client!or", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString138;

	@OriginalMember(owner = "client!or", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString139;

	@OriginalMember(owner = "client!or", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString140;

	@OriginalMember(owner = "client!or", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString141;

	@OriginalMember(owner = "client!or", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString142;

	@OriginalMember(owner = "client!or", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString143;

	@OriginalMember(owner = "client!or", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!or", name = "x", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!or", name = "o", descriptor = "I")
	public static final int anInt4810 = 3;

	@OriginalMember(owner = "client!or", name = "v", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable1 = new Hashtable(16);

	@OriginalMember(owner = "client!or", name = "y", descriptor = "J")
	public static volatile long aLong162 = 0L;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/io/File;")
	public static File method3906(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(4) File local4 = (File) aHashtable1.get(arg2);
		if (local4 != null) {
			return local4;
		}
		@Pc(43) String[] local43 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString136, "/tmp/", "" };
		@Pc(66) String[] local66 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(73) int local73 = 0; local73 < 2; local73++) {
			for (@Pc(76) int local76 = 0; local76 < local66.length; local76++) {
				for (@Pc(79) int local79 = 0; local79 < local43.length; local79++) {
					@Pc(110) String local110 = local43[local79] + local66[local76] + "/" + (arg0 == null ? "" : arg0 + "/") + arg2;
					@Pc(112) RandomAccessFile local112 = null;
					try {
						@Pc(117) File local117 = new File(local110);
						if (local73 != 0 || local117.exists()) {
							@Pc(126) String local126 = local43[local79];
							if (local73 != 1 || local126.length() <= 0 || (new File(local126)).exists()) {
								(new File(local43[local79] + local66[local76])).mkdir();
								if (arg0 != null) {
									(new File(local43[local79] + local66[local76] + "/" + arg0)).mkdir();
								}
								local112 = new RandomAccessFile(local117, "rw");
								@Pc(187) int local187 = local112.read();
								local112.seek(0L);
								local112.write(local187);
								local112.seek(0L);
								local112.close();
								aHashtable1.put(arg2, local117);
								return local117;
							}
						}
					} catch (@Pc(206) Exception local206) {
						try {
							if (local112 != null) {
								local112.close();
							}
						} catch (@Pc(214) Exception local214) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}
}
