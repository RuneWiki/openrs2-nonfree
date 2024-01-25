import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString24;

	@OriginalMember(owner = "client!kj", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString25;

	@OriginalMember(owner = "client!kj", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString26;

	@OriginalMember(owner = "client!kj", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString27;

	@OriginalMember(owner = "client!kj", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString28;

	@OriginalMember(owner = "client!kj", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString29;

	@OriginalMember(owner = "client!kj", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString31;

	@OriginalMember(owner = "client!kj", name = "x", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!kj", name = "y", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
	public static final int anInt3860 = 3;

	@OriginalMember(owner = "client!kj", name = "u", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "client!kj", name = "w", descriptor = "J")
	public static volatile long aLong119 = 0L;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/io/File;")
	public static File method3203(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(4) File local4 = (File) aHashtable2.get(arg2);
		if (local4 != null) {
			return local4;
		}
		@Pc(48) String[] local48 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString28, "/tmp/", "" };
		@Pc(71) String[] local71 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(73) int local73 = 0; local73 < 2; local73++) {
			for (@Pc(76) int local76 = 0; local76 < local71.length; local76++) {
				for (@Pc(79) int local79 = 0; local79 < local48.length; local79++) {
					@Pc(110) String local110 = local48[local79] + local71[local76] + "/" + (arg0 == null ? "" : arg0 + "/") + arg2;
					@Pc(112) RandomAccessFile local112 = null;
					try {
						@Pc(117) File local117 = new File(local110);
						if (local73 != 0 || local117.exists()) {
							@Pc(129) String local129 = local48[local79];
							if (local73 != 1 || local129.length() <= 0 || (new File(local129)).exists()) {
								(new File(local48[local79] + local71[local76])).mkdir();
								if (arg0 != null) {
									(new File(local48[local79] + local71[local76] + "/" + arg0)).mkdir();
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
