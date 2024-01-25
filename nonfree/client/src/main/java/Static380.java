import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString165;

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString166;

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString167;

	@OriginalMember(owner = "client!pq", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString168;

	@OriginalMember(owner = "client!pq", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString169;

	@OriginalMember(owner = "client!pq", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString170;

	@OriginalMember(owner = "client!pq", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString172;

	@OriginalMember(owner = "client!pq", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!pq", name = "x", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!pq", name = "o", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable5 = new Hashtable(16);

	@OriginalMember(owner = "client!pq", name = "t", descriptor = "I")
	public static final int anInt6743 = 3;

	@OriginalMember(owner = "client!pq", name = "y", descriptor = "J")
	public static volatile long aLong192 = 0L;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IZ)Ljava/io/File;")
	public static File method6077(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(4) File local4 = (File) aHashtable5.get(arg0);
		if (local4 != null) {
			return local4;
		}
		@Pc(43) String[] local43 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString169, "/tmp/", "" };
		@Pc(66) String[] local66 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(73) int local73 = 0; local73 < 2; local73++) {
			for (@Pc(76) int local76 = 0; local76 < local66.length; local76++) {
				for (@Pc(79) int local79 = 0; local79 < local43.length; local79++) {
					@Pc(110) String local110 = local43[local79] + local66[local76] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
					@Pc(112) RandomAccessFile local112 = null;
					try {
						@Pc(117) File local117 = new File(local110);
						if (local73 != 0 || local117.exists()) {
							@Pc(129) String local129 = local43[local79];
							if (local73 != 1 || local129.length() <= 0 || (new File(local129)).exists()) {
								(new File(local43[local79] + local66[local76])).mkdir();
								if (arg1 != null) {
									(new File(local43[local79] + local66[local76] + "/" + arg1)).mkdir();
								}
								local112 = new RandomAccessFile(local117, "rw");
								@Pc(195) int local195 = local112.read();
								local112.seek(0L);
								local112.write(local195);
								local112.seek(0L);
								local112.close();
								aHashtable5.put(arg0, local117);
								return local117;
							}
						}
					} catch (@Pc(214) Exception local214) {
						try {
							if (local112 != null) {
								local112.close();
							}
						} catch (@Pc(222) Exception local222) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}
}
