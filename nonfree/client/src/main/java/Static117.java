import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString23;

	@OriginalMember(owner = "client!fq", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString24;

	@OriginalMember(owner = "client!fq", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString26;

	@OriginalMember(owner = "client!fq", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString27;

	@OriginalMember(owner = "client!fq", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString28;

	@OriginalMember(owner = "client!fq", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString29;

	@OriginalMember(owner = "client!fq", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString30;

	@OriginalMember(owner = "client!fq", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!fq", name = "y", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!fq", name = "k", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable1 = new Hashtable(16);

	@OriginalMember(owner = "client!fq", name = "t", descriptor = "I")
	public static final int anInt2198 = 3;

	@OriginalMember(owner = "client!fq", name = "x", descriptor = "J")
	public static volatile long aLong66 = 0L;

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;I)Ljava/io/File;")
	public static File method1866(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(4) File local4 = (File) aHashtable1.get(arg1);
		if (local4 != null) {
			return local4;
		}
		@Pc(52) String[] local52 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString23, "/tmp/", "" };
		@Pc(75) String[] local75 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(77) int local77 = 0; local77 < 2; local77++) {
			for (@Pc(80) int local80 = 0; local80 < local75.length; local80++) {
				for (@Pc(83) int local83 = 0; local83 < local52.length; local83++) {
					@Pc(114) String local114 = local52[local83] + local75[local80] + "/" + (arg0 == null ? "" : arg0 + "/") + arg1;
					@Pc(116) RandomAccessFile local116 = null;
					try {
						@Pc(121) File local121 = new File(local114);
						if (local77 != 0 || local121.exists()) {
							@Pc(130) String local130 = local52[local83];
							if (local77 != 1 || local130.length() <= 0 || (new File(local130)).exists()) {
								(new File(local52[local83] + local75[local80])).mkdir();
								if (arg0 != null) {
									(new File(local52[local83] + local75[local80] + "/" + arg0)).mkdir();
								}
								local116 = new RandomAccessFile(local121, "rw");
								@Pc(196) int local196 = local116.read();
								local116.seek(0L);
								local116.write(local196);
								local116.seek(0L);
								local116.close();
								aHashtable1.put(arg1, local121);
								return local121;
							}
						}
					} catch (@Pc(215) Exception local215) {
						try {
							if (local116 != null) {
								local116.close();
							}
						} catch (@Pc(223) Exception local223) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}
}
