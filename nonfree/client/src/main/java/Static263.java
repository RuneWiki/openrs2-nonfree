import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!ra", name = "O", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!ra", name = "G", descriptor = "I")
	public static int anInt5386 = -1;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!ms;B)V")
	public static void method4564(@OriginalArg(0) Class137 arg0) {
		@Pc(6) int local6 = arg0.anInt4093;
		if (local6 == 327) {
			arg0.anInt4120 = 150;
			arg0.anInt4114 = (int) (Math.sin((double) Static293.anInt5807 / 40.0D) * 256.0D) & 0x3FFF;
			arg0.anInt4108 = 5;
			arg0.anInt4050 = -1;
		} else if (local6 == 328) {
			if (Static156.aClass67_Sub3_Sub3_Sub2_2.aString50 == null) {
				arg0.anInt4050 = 0;
				arg0.anInt4054 = 0;
			} else {
				arg0.anInt4120 = 150;
				arg0.anInt4114 = (int) (Math.sin((double) Static293.anInt5807 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt4108 = 5;
				arg0.anInt4050 = 2047;
				arg0.anInt4054 = Static113.method1751(Static156.aClass67_Sub3_Sub3_Sub2_2.aString50);
				arg0.anInt4076 = Static156.aClass67_Sub3_Sub3_Sub2_2.anInt5040;
				arg0.anInt4104 = Static156.aClass67_Sub3_Sub3_Sub2_2.anInt5018;
				arg0.anInt4099 = 0;
				arg0.anInt4091 = Static156.aClass67_Sub3_Sub3_Sub2_2.anInt5021;
			}
		}
	}
}
