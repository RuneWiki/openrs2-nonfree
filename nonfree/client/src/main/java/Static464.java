import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!od;B)V")
	public static void method6363(@OriginalArg(0) Class25_Sub10 arg0) {
		arg0.aClass25_Sub2_2 = null;
		@Pc(16) int local16 = arg0.aClass25_Sub1Array1.length;
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			arg0.aClass25_Sub1Array1[local18].aBoolean21 = false;
		}
		@Pc(36) Class269[] local36 = Class200.aClass269Array1;
		synchronized (Class200.aClass269Array1) {
			if (local16 < Class200.aClass269Array1.length && Static73.anIntArray439[local16] < 200) {
				Class200.aClass269Array1[local16].method5977(arg0);
				@Pc(59) int local59 = Static73.anIntArray439[local16]++;
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILjava/awt/Canvas;Lclient!fa;)Lclient!r;")
	public static Class31 method6364(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Interface4 arg1) {
		return new Class31_Sub3(arg0, arg1);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V")
	public static void method6365() {
		Static31.anInt499 = 0;
		for (@Pc(17) int local17 = 0; local17 < 2048; local17++) {
			Static173.aClass3_Sub26Array1[local17] = null;
			Static112.aByteArray56[local17] = 1;
			Static267.aClass286Array1[local17] = null;
		}
	}
}
