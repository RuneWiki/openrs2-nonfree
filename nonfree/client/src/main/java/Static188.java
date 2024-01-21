import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!ue", name = "D", descriptor = "I")
	public static int anInt4443;

	@OriginalMember(owner = "client!ue", name = "I", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray32;

	@OriginalMember(owner = "client!ue", name = "t", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_2033 = Static187.method3089("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!ue", name = "A", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_2035 = Static187.method3089("Unable to connect)3");

	@OriginalMember(owner = "client!ue", name = "v", descriptor = "Lclient!vd;")
	public static Class92 aClass92_2034 = aClass92_2035;

	@OriginalMember(owner = "client!ue", name = "x", descriptor = "I")
	public static int anInt4439 = 0;

	@OriginalMember(owner = "client!ue", name = "B", descriptor = "Lclient!vd;")
	public static Class92 aClass92_2036 = aClass92_2035;

	@OriginalMember(owner = "client!ue", name = "G", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_2038 = Static187.method3089("Starting 3d library");

	@OriginalMember(owner = "client!ue", name = "E", descriptor = "Lclient!vd;")
	public static Class92 aClass92_2037 = aClass92_2038;

	@OriginalMember(owner = "client!ue", name = "J", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_2039 = Static187.method3089("Bitte geben Sie Ihr Passwort ein)3");

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZILclient!ve;Lclient!s;)V")
	public static void method3363(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub1 arg1, @OriginalArg(3) Class83 arg2) {
		@Pc(3) byte[] local3 = null;
		@Pc(5) Class20 local5 = Static164.aClass20_18;
		synchronized (Static164.aClass20_18) {
			for (@Pc(12) Class1_Sub23 local12 = (Class1_Sub23) Static164.aClass20_18.method467(); local12 != null; local12 = (Class1_Sub23) Static164.aClass20_18.method468()) {
				if (local12.aLong251 == (long) arg0 && arg2 == local12.aClass83_1 && local12.anInt3194 == 0) {
					local3 = local12.aByteArray45;
					break;
				}
			}
		}
		if (local3 == null) {
			@Pc(67) byte[] local67 = arg2.method2606(arg0);
			arg1.method3281(local67, true, arg2, arg0);
		} else {
			arg1.method3281(local3, true, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIII)I")
	public static int method3364(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg0 & 0x1) == 1) {
			@Pc(11) int local11 = arg3;
			arg3 = arg4;
			arg4 = local11;
		}
		@Pc(19) int local19 = arg2 & 0x3;
		if (local19 == 0) {
			return arg5;
		} else if (local19 == 1) {
			return arg1;
		} else if (local19 == 2) {
			return 1 + 7 - arg3 - arg5;
		} else {
			return 7 + 1 - arg1 - arg4;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(JI)V")
	public static void method3365(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(12) InterruptedException local12) {
		}
	}
}
