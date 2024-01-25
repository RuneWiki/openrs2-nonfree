import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!qh", name = "j", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_88 = new Class217(81, 2);

	@OriginalMember(owner = "client!qh", name = "k", descriptor = "J")
	public static long aLong167 = 0L;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!ob;I)I")
	public static int method4384(@OriginalArg(0) Class7_Sub2_Sub3 arg0) {
		if (arg0.anInt4363 == 0) {
			return 0;
		}
		@Pc(54) int local54;
		@Pc(61) int local61;
		if (arg0.anInt4332 != -1) {
			@Pc(20) Class7_Sub2_Sub3 local20 = null;
			if (arg0.anInt4332 < 32768) {
				local20 = Static139.aClass7_Sub2_Sub3_Sub1Array11[arg0.anInt4332];
			} else if (arg0.anInt4332 >= 32768) {
				local20 = Static361.aClass7_Sub2_Sub3_Sub2Array1[arg0.anInt4332 - 32768];
			}
			if (local20 != null) {
				local54 = arg0.anInt4318 - local20.anInt4318;
				local61 = arg0.anInt4321 - local20.anInt4321;
				if (local54 != 0 || local61 != 0) {
					arg0.method3506((int) (Math.atan2((double) local54, (double) local61) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class7_Sub2_Sub3_Sub2) {
			@Pc(87) Class7_Sub2_Sub3_Sub2 local87 = (Class7_Sub2_Sub3_Sub2) arg0;
			if (local87.anInt4443 != -1 && (local87.anInt4404 == 0 || local87.anInt4405 > 0)) {
				local87.method3506(local87.anInt4443);
				local87.anInt4443 = -1;
			}
		} else if (arg0 instanceof Class7_Sub2_Sub3_Sub1) {
			@Pc(117) Class7_Sub2_Sub3_Sub1 local117 = (Class7_Sub2_Sub3_Sub1) arg0;
			if (local117.anInt681 != -1 && (local117.anInt4404 == 0 || local117.anInt4405 > 0)) {
				local54 = local117.anInt4318 - (local117.anInt681 - Static223.anInt7618 - Static223.anInt7618) * 64;
				local61 = local117.anInt4321 - (local117.anInt687 - Static57.anInt5085 - Static57.anInt5085) * 64;
				if (local54 != 0 || local61 != 0) {
					local117.method3506((int) (Math.atan2((double) local54, (double) local61) * 2607.5945876176133D) & 0x3FFF);
				}
				local117.anInt681 = -1;
			}
		}
		return arg0.method3512();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIBIIII)V")
	public static void method4386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static55.method1137(arg5)) {
			return;
		}
		if (Static111.aClass156ArrayArray1[arg5] == null) {
			Static53.method1124(Static178.aClass156ArrayArray2[arg5], -1, arg6, arg0, arg7, arg4, arg1, arg2, arg3, arg8);
		} else {
			Static53.method1124(Static111.aClass156ArrayArray1[arg5], -1, arg6, arg0, arg7, arg4, arg1, arg2, arg3, arg8);
		}
	}
}
