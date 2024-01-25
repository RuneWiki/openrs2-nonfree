import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!of", name = "c", descriptor = "Lclient!um;")
	public static Class243 aClass243_162;

	@OriginalMember(owner = "client!of", name = "d", descriptor = "B")
	public static byte aByte58;

	@OriginalMember(owner = "client!of", name = "e", descriptor = "I")
	public static int anInt4647 = 0;

	@OriginalMember(owner = "client!of", name = "g", descriptor = "Z")
	public static boolean aBoolean330 = false;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BI)S")
	public static short method3688(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(37) int local37 = local19 > 64 ? (127 - local19) * local15 >> 7 : local15 * local19 >> 7;
		@Pc(47) int local47 = local19 + local37;
		@Pc(55) int local55;
		if (local47 == 0) {
			local55 = local37 << 1;
		} else {
			local55 = (local37 << 8) / local47;
		}
		return (short) (local47 | local9 << 10 | local55 >> 4 << 7);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IBIII)V")
	public static void method3689(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static3.anInt45 <= arg0 - arg2 && Static112.anInt1900 >= arg2 + arg0 && arg1 - arg2 >= Static356.anInt5817 && Static3.anInt46 >= arg2 + arg1) {
			Static7.method99(arg2, arg1, arg0, arg3);
		} else {
			Static183.method2498(arg1, arg3, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BLclient!fh;)Lclient!rk;")
	public static Class209 method3691(@OriginalArg(1) Class5_Sub15 arg0) {
		@Pc(12) Class209 local12 = new Class209();
		local12.anInt5847 = arg0.method5598();
		local12.aClass5_Sub2_Sub15_1 = Static407.aClass20_2.method458(local12.anInt5847);
		return local12;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(IIIII)V")
	public static void method3692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static216.aClass1_Sub1_1.anInt4512 != 0 && arg3 != 0 && Static344.anInt5625 < 50 && arg0 != -1) {
			Static113.aClass75Array1[Static344.anInt5625++] = new Class75((byte) 2, arg0, arg3, arg2, arg1, 0);
		}
	}
}
