import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!oca", name = "I", descriptor = "[Lclient!jm;")
	public static final Class163[] aClass163Array1 = new Class163[100];

	@OriginalMember(owner = "client!oca", name = "ib", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_90 = new Class218(108, 2);

	@OriginalMember(owner = "client!oca", name = "Jb", descriptor = "[I")
	public static final int[] anIntArray467 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!oca", name = "Kc", descriptor = "[I")
	public static int[] anIntArray471 = new int[2];

	@OriginalMember(owner = "client!oca", name = "Mc", descriptor = "I")
	public static int anInt7540 = 104;

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method6305(@OriginalArg(0) Class33 arg0) {
		Static498.aClass148Array1 = new Class148[Static393.anIntArray156.length];
		for (@Pc(11) int local11 = 0; local11 < Static393.anIntArray156.length; local11++) {
			@Pc(22) int local22 = Static393.anIntArray156[local11];
			@Pc(27) Class315 local27 = Static494.method7247(Static359.aClass181_114, local22);
			@Pc(35) Class25 local35 = arg0.method6202(local27, Static649.method617(Static452.aClass181_87, local22));
			Static498.aClass148Array1[local11] = new Class148(local35, local27);
		}
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(FIFF)I")
	public static int method6308(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(17) float local17 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(26) float local26 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(35) float local35 = arg1 < 0.0F ? -arg1 : arg1;
		if (local17 < local26 && local35 < local26) {
			return arg2 > 0.0F ? 0 : 1;
		} else if (local35 > local17 && local26 < local35) {
			return arg1 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(IIIII)Z")
	public static boolean method6311(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static244.aByteArrayArrayArray10[0][arg0][arg3] & 0x2) != 0) {
			return true;
		} else if ((Static244.aByteArrayArrayArray10[arg2][arg0][arg3] & 0x10) == 0) {
			return Static525.method7487(arg0, arg2, arg3) == arg1;
		} else {
			return false;
		}
	}
}
