import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "Lclient!vv;")
	public static Class350 aClass350_1;

	@OriginalMember(owner = "client!oi", name = "i", descriptor = "Lclient!f;")
	public static Class10 aClass10_29;

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString69 = null;

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "Lclient!br;")
	public static final Class37 aClass37_5 = new Class37("", 16);

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!r;B)V")
	public static void method5520(@OriginalArg(0) Class12 arg0) {
		if (Static76.anInt1848 != Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aByte116 && (Static118.aClass293ArrayArrayArray14 != null && Static445.method3383(Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aByte116, arg0))) {
			Static76.anInt1848 = Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aByte116;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIII)V")
	public static void method5522(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(90) Class293 local90 = Static118.aClass293ArrayArrayArray14[arg3][arg0][arg2];
		if (local90 != null) {
			if (arg1 == 1) {
				local90.aShort78 = 0;
			} else if (arg1 == 2) {
				local90.aShort77 = 0;
			}
		}
		Static486.method6807();
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(IIIII)V")
	public static void method5523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static105.anIntArrayArray12 != null) {
			Static105.anIntArrayArray12[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static395.aShortArrayArray8 != null) {
			Static395.aShortArrayArray8[arg0][arg1] = (short) arg3;
		}
		if (Static208.aByteArrayArray27 != null) {
			Static208.aByteArrayArray27[arg0][arg1] = (byte) arg4;
		}
	}
}
