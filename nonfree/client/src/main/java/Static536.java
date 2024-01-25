import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static536 {

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "I")
	public static final int anInt9014 = 52;

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "Lclient!qk;")
	public static final Class304 aClass304_12 = new Class304();

	@OriginalMember(owner = "client!qu", name = "f", descriptor = "Lclient!iia;")
	public static final Interface10 anInterface10_3 = new Class112();

	@OriginalMember(owner = "client!qu", name = "h", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_92 = new Class286(27, 7);

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lclient!av;Lclient!ha;III)V")
	public static void method7527(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class67 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(24) int local24 = 63; local24 >= 0; local24--) {
			@Pc(42) int local42 = 0x3F | 0x380 | (local24 & 0x3F) << 10;
			Static533.method7508(false, true);
			@Pc(50) int local50 = Static305.anIntArray309[local42];
			Static246.method3750(false, true);
			arg1.aa(arg2, ((63 - local24) * arg0.anInt569 >> 6) + arg3, arg0.anInt509, (arg0.anInt569 >> 6) + 1, local50, 0);
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIIZIII)V")
	public static void method7528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static236.anInt4478 = arg2;
		Static393.anInt7056 = arg5;
		Static390.anInt7029 = arg0;
		Static16.anInt288 = arg4;
		Static161.anInt2963 = arg1;
		if (arg3 && Static16.anInt288 >= 100) {
			Static235.anInt4471 = Static393.anInt7056 * 512 + 256;
			Static173.anInt3144 = Static161.anInt2963 * 512 + 256;
			Static376.anInt6408 = Static505.method7237(Static712.anInt11117, Static235.anInt4471, Static173.anInt3144) - Static390.anInt7029;
		}
		Static175.anInt10579 = 2;
		Static573.anInt9429 = -1;
		Static283.anInt5140 = -1;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(CB)Z")
	public static boolean method7529(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(BLclient!rba;)Lclient!ww;")
	public static Class130_Sub4 method7530(@OriginalArg(1) Class3_Sub28 arg0) {
		return new Class130_Sub4(arg0.method5281(), arg0.method5281(), arg0.method5281(), arg0.method5281(), arg0.method5307(), arg0.method5322(-38));
	}
}
