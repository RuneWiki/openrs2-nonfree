import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!we", name = "g", descriptor = "Lclient!dc;")
	public static Class17_Sub1 aClass17_Sub1_21;

	@OriginalMember(owner = "client!we", name = "e", descriptor = "Lclient!v;")
	public static Class76 aClass76_1322 = Static134.method2017("");

	@OriginalMember(owner = "client!we", name = "a", descriptor = "Lclient!v;")
	public static Class76 aClass76_1321 = aClass76_1322;

	@OriginalMember(owner = "client!we", name = "b", descriptor = "Lclient!ua;")
	public static Class72 aClass72_29 = new Class72(30);

	@OriginalMember(owner = "client!we", name = "k", descriptor = "Lclient!v;")
	private static Class76 aClass76_1326 = Static134.method2017("Prepared visibility map");

	@OriginalMember(owner = "client!we", name = "h", descriptor = "Lclient!v;")
	public static Class76 aClass76_1323 = aClass76_1326;

	@OriginalMember(owner = "client!we", name = "i", descriptor = "Lclient!v;")
	private static Class76 aClass76_1324 = Static134.method2017("Please try again)3");

	@OriginalMember(owner = "client!we", name = "j", descriptor = "Lclient!v;")
	public static Class76 aClass76_1325 = aClass76_1324;

	@OriginalMember(owner = "client!we", name = "l", descriptor = "[I")
	public static int[] anIntArray408 = new int[5];

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V")
	public static void method2012() {
		aClass76_1322 = null;
		aClass17_Sub1_21 = null;
		aClass76_1324 = null;
		aClass76_1326 = null;
		aClass76_1321 = null;
		aClass72_29 = null;
		aClass76_1325 = null;
		anIntArray408 = null;
		aClass76_1323 = null;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!dc;IILclient!qb;)V")
	public static void method2013(@OriginalArg(0) Class17_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class58 arg2) {
		@Pc(7) byte[] local7 = null;
		@Pc(9) Class78 local9 = Static8.aClass78_1;
		synchronized (Static8.aClass78_1) {
			for (@Pc(16) Class4_Sub5 local16 = (Class4_Sub5) Static8.aClass78_1.method1916(); local16 != null; local16 = (Class4_Sub5) Static8.aClass78_1.method1920()) {
				if (local16.aLong99 == (long) arg1 && local16.aClass58_1 == arg2 && local16.anInt243 == 0) {
					local7 = local16.aByteArray3;
					break;
				}
			}
		}
		if (local7 == null) {
			@Pc(75) byte[] local75 = arg2.method1509(arg1);
			arg0.method304(true, arg1, local75, arg2);
		} else {
			arg0.method304(true, arg1, local7, arg2);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(III)I")
	public static int method2014(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = (arg0 & 0x7F) * arg1 / 128;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(B[BZ)Ljava/lang/Object;")
	public static Object method2015(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static119.aBoolean150) {
			try {
				@Pc(23) Class34 local23 = (Class34) Class.forName("Class34_Sub1").getDeclaredConstructor().newInstance();
				local23.method1457(arg0);
				return local23;
			} catch (@Pc(30) Throwable local30) {
				Static119.aBoolean150 = true;
			}
		}
		return arg0;
	}
}
