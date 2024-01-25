import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "J")
	public static long aLong216;

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "Z")
	public static boolean aBoolean578 = false;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIILclient!ha;IIIILclient!wc;III)V")
	public static void method6421(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class87 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class2_Sub5_Sub20 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg8 > arg9 && arg8 < arg9 + arg4 && arg6 > arg10 - 13 && arg10 + 3 > arg6 && arg7.aBoolean742) {
			arg5 = arg0;
		}
		@Pc(28) int[] local28 = null;
		if (Static565.method7812(arg7.anInt10077)) {
			local28 = Static570.aClass267_2.method6597((int) arg7.aLong278).anIntArray506;
		} else if (arg7.anInt10075 != -1) {
			local28 = Static570.aClass267_2.method6597(arg7.anInt10075).anIntArray506;
		} else if (Static539.method7533(arg7.anInt10077)) {
			@Pc(96) Class2_Sub51 local96 = (Class2_Sub51) Static357.aClass222_23.method5468((long) arg7.aLong278);
			if (local96 != null) {
				@Pc(101) Class11_Sub1_Sub1_Sub2_Sub2 local101 = local96.aClass11_Sub1_Sub1_Sub2_Sub2_2;
				@Pc(104) Class236 local104 = local101.aClass236_1;
				if (local104.anIntArray462 != null) {
					local104 = local104.method5779(Static438.aClass198_1);
				}
				if (local104 != null) {
					local28 = local104.anIntArray464;
				}
			}
		} else if (Static542.method7600(arg7.anInt10077)) {
			@Pc(65) Class350 local65;
			if (arg7.anInt10077 == 1012) {
				local65 = Static619.aClass281_4.method6734((int) arg7.aLong278);
			} else {
				local65 = Static619.aClass281_4.method6734((int) (arg7.aLong278 >>> 32 & 0x7FFFFFFFL));
			}
			if (local65.anIntArray665 != null) {
				local65 = local65.method8080(Static438.aClass198_1);
			}
			if (local65 != null) {
				local28 = local65.anIntArray666;
			}
		}
		@Pc(138) String local138 = Static603.method8360(arg7);
		if (local28 != null) {
			local138 = local138 + Static550.method7655(local28);
		}
		Static4.aClass64_1.method7506(arg5, arg9 + 3, arg10, local138, Static185.aClass20Array5, Static67.anIntArray140);
		if (arg7.aBoolean743) {
			Static165.aClass20_6.method4582(arg9 + Static240.aClass114_19.method3015(local138) + 5, arg10 + -12);
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(FIFF)F")
	public static float method6423(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return arg2 + (arg0 - arg2) * arg1;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)I")
	public static int method6425(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 >>> 31;
		return (arg1 + local12) / arg0 - local12;
	}
}
