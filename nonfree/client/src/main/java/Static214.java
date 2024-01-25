import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "I")
	public static int anInt10029;

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIII)I")
	public static int method8568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg0;
		} else if (local3 == 2) {
			return 4095 - arg2;
		} else {
			return 4095 - arg0;
		}
	}

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "(III)V")
	public static void method8569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class128 local7 = Static283.aClass128ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static370.method5508(local7.aClass4_Sub1_Sub2_2);
		Static370.method5508(local7.aClass4_Sub1_Sub2_1);
		if (local7.aClass4_Sub1_Sub2_2 != null) {
			local7.aClass4_Sub1_Sub2_2 = null;
		}
		if (local7.aClass4_Sub1_Sub2_1 != null) {
			local7.aClass4_Sub1_Sub2_1 = null;
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(III)V")
	public static void method8571(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static310.anInt5335 != 0) {
			if (arg0 >= 0) {
				Static507.anIntArray604[arg0] = arg1;
			} else {
				for (@Pc(17) int local17 = 0; local17 < 16; local17++) {
					Static507.anIntArray604[local17] = arg1;
				}
			}
		}
		Static445.aClass5_Sub4_Sub2_6.method1825(arg1, arg0);
	}
}
