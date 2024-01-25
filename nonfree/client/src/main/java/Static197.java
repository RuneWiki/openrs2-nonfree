import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!js", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString26;

	@OriginalMember(owner = "client!js", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString27;

	@OriginalMember(owner = "client!js", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString28;

	@OriginalMember(owner = "client!js", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString29;

	@OriginalMember(owner = "client!js", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString30;

	@OriginalMember(owner = "client!js", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString32;

	@OriginalMember(owner = "client!js", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString33;

	@OriginalMember(owner = "client!js", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!js", name = "x", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!js", name = "d", descriptor = "I")
	public static final int anInt3816 = 3;

	@OriginalMember(owner = "client!js", name = "t", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "client!js", name = "y", descriptor = "J")
	public static volatile long aLong101 = 0L;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ILjava/lang/String;ZLjava/lang/String;)Ljava/io/File;")
	public static File method3044(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		@Pc(4) File local4 = (File) aHashtable2.get(arg2);
		if (local4 != null) {
			return local4;
		}
		@Pc(43) String[] local43 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString33, "/tmp/", "" };
		@Pc(75) String[] local75 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(77) int local77 = 0; local77 < 2; local77++) {
			for (@Pc(80) int local80 = 0; local80 < local75.length; local80++) {
				for (@Pc(83) int local83 = 0; local83 < local43.length; local83++) {
					@Pc(114) String local114 = local43[local83] + local75[local80] + "/" + (arg1 == null ? "" : arg1 + "/") + arg2;
					@Pc(116) RandomAccessFile local116 = null;
					try {
						@Pc(121) File local121 = new File(local114);
						if (local77 != 0 || local121.exists()) {
							@Pc(130) String local130 = local43[local83];
							if (local77 != 1 || local130.length() <= 0 || (new File(local130)).exists()) {
								(new File(local43[local83] + local75[local80])).mkdir();
								if (arg1 != null) {
									(new File(local43[local83] + local75[local80] + "/" + arg1)).mkdir();
								}
								local116 = new RandomAccessFile(local121, "rw");
								@Pc(194) int local194 = local116.read();
								local116.seek(0L);
								local116.write(local194);
								local116.seek(0L);
								local116.close();
								aHashtable2.put(arg2, local121);
								return local121;
							}
						}
					} catch (@Pc(213) Exception local213) {
						try {
							if (local116 != null) {
								local116.close();
							}
						} catch (@Pc(221) Exception local221) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}
}
