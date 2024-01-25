import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static652 {

	@OriginalMember(owner = "client!waa", name = "d", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_90 = new Class289(59, -1);

	@OriginalMember(owner = "client!waa", name = "i", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_247 = new Class179(19, 6);

	@OriginalMember(owner = "client!waa", name = "j", descriptor = "I")
	public static final int anInt6475 = 1;

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(ILclient!gga;)Lclient!hu;")
	public static Class63_Sub2 method5478(@OriginalArg(1) Class6_Sub23 arg0) {
		@Pc(7) Class63 local7 = Static583.method8067(arg0);
		@Pc(18) int local18 = arg0.method8369();
		@Pc(22) int local22 = arg0.method8369();
		return new Class63_Sub2(local7.aClass7_9, local7.aClass249_12, local7.anInt8533, local7.anInt8532, local7.anInt8537, local7.anInt8536, local7.anInt8538, local7.anInt8535, local7.anInt8534, local18, local22);
	}

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "(Z)V")
	public static void method5481() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static542.aBooleanArray30[local7] = false;
		}
		Static359.anInt6157 = 0;
		Static14.anInt433 = 0;
		Static505.anInt8478 = -1;
		Static258.anInt4491 = -1;
		Static601.anInt9806 = -1;
		Static367.anInt6283 = -1;
		Static407.anInt6820 = 1;
	}
}
