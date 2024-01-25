import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!od", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString43;

	@OriginalMember(owner = "client!od", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString44;

	@OriginalMember(owner = "client!od", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString46;

	@OriginalMember(owner = "client!od", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString47;

	@OriginalMember(owner = "client!od", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString48;

	@OriginalMember(owner = "client!od", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString49;

	@OriginalMember(owner = "client!od", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString50;

	@OriginalMember(owner = "client!od", name = "x", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!od", name = "y", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!od", name = "m", descriptor = "I")
	public static final int anInt4930 = 3;

	@OriginalMember(owner = "client!od", name = "q", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "client!od", name = "v", descriptor = "J")
	public static volatile long aLong154 = 0L;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)Ljava/io/File;")
	public static File method4098(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		@Pc(4) File local4 = (File) aHashtable2.get(arg2);
		if (local4 != null) {
			return local4;
		}
		@Pc(43) String[] local43 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString49, "/tmp/", "" };
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
								@Pc(192) int local192 = local112.read();
								local112.seek(0L);
								local112.write(local192);
								local112.seek(0L);
								local112.close();
								aHashtable2.put(arg2, local117);
								return local117;
							}
						}
					} catch (@Pc(211) Exception local211) {
						try {
							if (local112 != null) {
								local112.close();
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
