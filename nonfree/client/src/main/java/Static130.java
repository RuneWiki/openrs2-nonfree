import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "F")
	public static float aFloat32;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "[I")
	public static int[] anIntArray192;

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "[F")
	public static final float[] aFloatArray9 = new float[4];

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
	public static int anInt2933 = 0;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)Z")
	public static boolean method2554(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILclient!oi;)I")
	public static int method2555(@OriginalArg(1) Class3_Sub40 arg0) {
		@Pc(7) String local7 = Static526.method7770(arg0);
		@Pc(9) int[] local9 = null;
		if (Static211.method3720(arg0.anInt7324)) {
			local9 = Static517.aClass23_2.method901((int) arg0.aLong191).anIntArray18;
		} else if (arg0.anInt7316 != -1) {
			local9 = Static517.aClass23_2.method901(arg0.anInt7316).anIntArray18;
		} else if (Static566.method8142(arg0.anInt7324)) {
			@Pc(85) Class3_Sub46 local85 = (Class3_Sub46) Static331.aClass25_25.method946((long) arg0.aLong191);
			if (local85 != null) {
				@Pc(90) Class2_Sub2_Sub1_Sub2 local90 = local85.aClass2_Sub2_Sub1_Sub2_2;
				@Pc(93) Class169 local93 = local90.aClass169_1;
				if (local93.anIntArray306 != null) {
					local93 = local93.method4177(Static588.aClass322_1);
				}
				if (local93 != null) {
					local9 = local93.anIntArray305;
				}
			}
		} else if (Static127.method2533(arg0.anInt7324)) {
			@Pc(54) Class292 local54;
			if (arg0.anInt7324 == 1004) {
				local54 = Static253.aClass146_2.method3356((int) arg0.aLong191);
			} else {
				local54 = Static253.aClass146_2.method3356((int) (arg0.aLong191 >>> 32 & 0x7FFFFFFFL));
			}
			if (local54.anIntArray571 != null) {
				local54 = local54.method7198(Static588.aClass322_1);
			}
			if (local54 != null) {
				local9 = local54.anIntArray574;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static260.method4598(local9);
		}
		@Pc(139) int local139 = Static9.aClass297_1.method7321(local7, Static528.aClass37Array11);
		if (arg0.aBoolean621) {
			local139 += Static284.aClass37_32.QA() + 4;
		}
		return local139;
	}
}
