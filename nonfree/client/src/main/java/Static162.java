import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString33;

	@OriginalMember(owner = "client!hs", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString34;

	@OriginalMember(owner = "client!hs", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString35;

	@OriginalMember(owner = "client!hs", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString36;

	@OriginalMember(owner = "client!hs", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString37;

	@OriginalMember(owner = "client!hs", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString38;

	@OriginalMember(owner = "client!hs", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString39;

	@OriginalMember(owner = "client!hs", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!hs", name = "y", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!hs", name = "p", descriptor = "I")
	public static final int anInt3462 = 3;

	@OriginalMember(owner = "client!hs", name = "q", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "client!hs", name = "x", descriptor = "J")
	public static volatile long aLong102 = 0L;

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
	public static File method2826(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		@Pc(4) File local4 = (File) aHashtable2.get(arg1);
		if (local4 != null) {
			return local4;
		}
		@Pc(51) String[] local51 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString36, "/tmp/", "" };
		@Pc(74) String[] local74 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(76) int local76 = 0; local76 < 2; local76++) {
			for (@Pc(79) int local79 = 0; local79 < local74.length; local79++) {
				for (@Pc(82) int local82 = 0; local82 < local51.length; local82++) {
					@Pc(113) String local113 = local51[local82] + local74[local79] + "/" + (arg0 == null ? "" : arg0 + "/") + arg1;
					@Pc(115) RandomAccessFile local115 = null;
					try {
						@Pc(120) File local120 = new File(local113);
						if (local76 != 0 || local120.exists()) {
							@Pc(132) String local132 = local51[local82];
							if (local76 != 1 || local132.length() <= 0 || (new File(local132)).exists()) {
								(new File(local51[local82] + local74[local79])).mkdir();
								if (arg0 != null) {
									(new File(local51[local82] + local74[local79] + "/" + arg0)).mkdir();
								}
								local115 = new RandomAccessFile(local120, "rw");
								@Pc(193) int local193 = local115.read();
								local115.seek(0L);
								local115.write(local193);
								local115.seek(0L);
								local115.close();
								aHashtable2.put(arg1, local120);
								return local120;
							}
						}
					} catch (@Pc(212) Exception local212) {
						try {
							if (local115 != null) {
								local115.close();
							}
						} catch (@Pc(220) Exception local220) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}
}
