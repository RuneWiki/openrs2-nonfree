import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString68;

	@OriginalMember(owner = "client!ul", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString69;

	@OriginalMember(owner = "client!ul", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString70;

	@OriginalMember(owner = "client!ul", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString71;

	@OriginalMember(owner = "client!ul", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString72;

	@OriginalMember(owner = "client!ul", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString74;

	@OriginalMember(owner = "client!ul", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString75;

	@OriginalMember(owner = "client!ul", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!ul", name = "x", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
	public static final int anInt7272 = 3;

	@OriginalMember(owner = "client!ul", name = "o", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "client!ul", name = "y", descriptor = "J")
	public static volatile long aLong210 = 0L;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)Ljava/io/File;")
	public static File method5823(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		@Pc(4) File local4 = (File) aHashtable2.get(arg1);
		if (local4 != null) {
			return local4;
		}
		@Pc(43) String[] local43 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString75, "/tmp/", "" };
		@Pc(71) String[] local71 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(73) int local73 = 0; local73 < 2; local73++) {
			for (@Pc(76) int local76 = 0; local76 < local71.length; local76++) {
				for (@Pc(79) int local79 = 0; local79 < local43.length; local79++) {
					@Pc(110) String local110 = local43[local79] + local71[local76] + "/" + (arg2 == null ? "" : arg2 + "/") + arg1;
					@Pc(112) RandomAccessFile local112 = null;
					try {
						@Pc(117) File local117 = new File(local110);
						if (local73 != 0 || local117.exists()) {
							@Pc(129) String local129 = local43[local79];
							if (local73 != 1 || local129.length() <= 0 || (new File(local129)).exists()) {
								(new File(local43[local79] + local71[local76])).mkdir();
								if (arg2 != null) {
									(new File(local43[local79] + local71[local76] + "/" + arg2)).mkdir();
								}
								local112 = new RandomAccessFile(local117, "rw");
								@Pc(195) int local195 = local112.read();
								local112.seek(0L);
								local112.write(local195);
								local112.seek(0L);
								local112.close();
								aHashtable2.put(arg1, local117);
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
