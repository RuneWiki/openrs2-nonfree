import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "Lclient!ve;")
	public static Class3_Sub1 aClass3_Sub1_3;

	@OriginalMember(owner = "client!ag", name = "q", descriptor = "[I")
	public static int[] anIntArray17;

	@OriginalMember(owner = "client!ag", name = "u", descriptor = "I")
	public static int anInt157;

	@OriginalMember(owner = "client!ag", name = "k", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_59 = Static187.method3089("Service unavailable)3");

	@OriginalMember(owner = "client!ag", name = "m", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_60 = aClass92_59;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)V")
	public static void method125(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static24.method463(arg0)) {
			Static194.method3187(arg1, Static194.aClass11ArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
	public static void method128() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIILclient!ba;II)V")
	public static void method133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class11 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static192.aBoolean230) {
			Static191.anInt4168 = 32;
		} else {
			Static191.anInt4168 = 0;
		}
		Static192.aBoolean230 = false;
		@Pc(124) int local124;
		if (Static85.anInt1857 != 0) {
			if (arg1 <= arg3 && arg1 + 16 > arg3 && arg5 <= arg6 && arg6 < arg5 + 16) {
				arg4.anInt297 -= 4;
				Static73.method1118(arg4);
			} else if (arg1 <= arg3 && arg3 < arg1 + 16 && arg6 >= arg5 + arg2 - 16 && arg5 + arg2 > arg6) {
				arg4.anInt297 += 4;
				Static73.method1118(arg4);
			} else if (arg3 >= arg1 - Static191.anInt4168 && arg1 + Static191.anInt4168 + 16 > arg3 && arg5 + 16 <= arg6 && arg2 + arg5 - 16 > arg6) {
				local124 = (arg2 - 32) * arg2 / arg0;
				if (local124 < 8) {
					local124 = 8;
				}
				@Pc(136) int local136 = arg2 - local124 - 32;
				@Pc(147) int local147 = arg6 - arg5 - local124 / 2 - 16;
				arg4.anInt297 = (arg0 - arg2) * local147 / local136;
				Static73.method1118(arg4);
				Static192.aBoolean230 = true;
			}
		}
		if (Static199.anInt4342 == 0) {
			return;
		}
		local124 = arg4.anInt312;
		if (arg1 - local124 <= arg3 && arg5 <= arg6 && arg3 < arg1 + 16 && arg2 + arg5 >= arg6) {
			arg4.anInt297 += Static199.anInt4342 * 45;
			Static73.method1118(arg4);
			return;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z[B)Lclient!r;")
	public static Class1_Sub3_Sub1_Sub3_Sub1 method139(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(18) Class1_Sub3_Sub1_Sub3_Sub1 local18 = new Class1_Sub3_Sub1_Sub3_Sub1(arg0, Static154.anIntArray285, Static193.anIntArray276, Static164.anIntArray302, Static76.anIntArray133, Static209.anIntArray365, Static143.aByteArrayArray6);
			Static145.method2153();
			return local18;
		}
	}
}
