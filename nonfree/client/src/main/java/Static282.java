import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString38;

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString39;

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString40;

	@OriginalMember(owner = "client!nv", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString41;

	@OriginalMember(owner = "client!nv", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString42;

	@OriginalMember(owner = "client!nv", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString43;

	@OriginalMember(owner = "client!nv", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString44;

	@OriginalMember(owner = "client!nv", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!nv", name = "y", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!nv", name = "k", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "client!nv", name = "m", descriptor = "I")
	public static int anInt5394 = 3;

	@OriginalMember(owner = "client!nv", name = "x", descriptor = "J")
	public static volatile long aLong147 = 0L;

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZLjava/lang/String;ILjava/lang/String;)Ljava/io/File;")
	public static File method4164(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(13) File local13 = (File) aHashtable2.get(arg0);
		if (local13 != null) {
			return local13;
		}
		@Pc(52) String[] local52 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString43, "/tmp/", "" };
		@Pc(75) String[] local75 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(77) int local77 = 0; local77 < 2; local77++) {
			for (@Pc(80) int local80 = 0; local80 < local75.length; local80++) {
				for (@Pc(83) int local83 = 0; local83 < local52.length; local83++) {
					@Pc(114) String local114 = local52[local83] + local75[local80] + "/" + (arg2 == null ? "" : arg2 + "/") + arg0;
					@Pc(116) RandomAccessFile local116 = null;
					try {
						@Pc(121) File local121 = new File(local114);
						if (local77 != 0 || local121.exists()) {
							@Pc(130) String local130 = local52[local83];
							if (local77 != 1 || local130.length() <= 0 || (new File(local130)).exists()) {
								(new File(local52[local83] + local75[local80])).mkdir();
								if (arg2 != null) {
									(new File(local52[local83] + local75[local80] + "/" + arg2)).mkdir();
								}
								local116 = new RandomAccessFile(local121, "rw");
								@Pc(193) int local193 = local116.read();
								local116.seek(0L);
								local116.write(local193);
								local116.seek(0L);
								local116.close();
								aHashtable2.put(arg0, local121);
								return local121;
							}
						}
					} catch (@Pc(212) Exception local212) {
						try {
							if (local116 != null) {
								local116.close();
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
