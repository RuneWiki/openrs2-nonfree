import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString39;

	@OriginalMember(owner = "client!qn", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString40;

	@OriginalMember(owner = "client!qn", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString41;

	@OriginalMember(owner = "client!qn", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString42;

	@OriginalMember(owner = "client!qn", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString43;

	@OriginalMember(owner = "client!qn", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString44;

	@OriginalMember(owner = "client!qn", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString45;

	@OriginalMember(owner = "client!qn", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!qn", name = "y", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!qn", name = "m", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable1 = new Hashtable(16);

	@OriginalMember(owner = "client!qn", name = "s", descriptor = "I")
	public static final int anInt5594 = 3;

	@OriginalMember(owner = "client!qn", name = "x", descriptor = "J")
	public static volatile long aLong161 = 0L;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;")
	public static File method4701(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(12) File local12 = (File) aHashtable1.get(arg1);
		if (local12 != null) {
			return local12;
		}
		@Pc(51) String[] local51 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString42, "/tmp/", "" };
		@Pc(74) String[] local74 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(76) int local76 = 0; local76 < 2; local76++) {
			for (@Pc(79) int local79 = 0; local79 < local74.length; local79++) {
				for (@Pc(82) int local82 = 0; local82 < local51.length; local82++) {
					@Pc(113) String local113 = local51[local82] + local74[local79] + "/" + (arg0 == null ? "" : arg0 + "/") + arg1;
					@Pc(115) RandomAccessFile local115 = null;
					try {
						@Pc(120) File local120 = new File(local113);
						if (local76 != 0 || local120.exists()) {
							@Pc(129) String local129 = local51[local82];
							if (local76 != 1 || local129.length() <= 0 || (new File(local129)).exists()) {
								(new File(local51[local82] + local74[local79])).mkdir();
								if (arg0 != null) {
									(new File(local51[local82] + local74[local79] + "/" + arg0)).mkdir();
								}
								local115 = new RandomAccessFile(local120, "rw");
								@Pc(192) int local192 = local115.read();
								local115.seek(0L);
								local115.write(local192);
								local115.seek(0L);
								local115.close();
								aHashtable1.put(arg1, local120);
								return local120;
							}
						}
					} catch (@Pc(211) Exception local211) {
						try {
							if (local115 != null) {
								local115.close();
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
