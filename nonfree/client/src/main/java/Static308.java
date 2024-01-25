import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
	public static int anInt6034;

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "Z")
	public static final boolean aBoolean498 = false;

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "Z")
	public static boolean aBoolean499 = false;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!wm;B)I")
	public static int method5235(@OriginalArg(0) Class10_Sub1_Sub2 arg0) {
		if (arg0.anInt4011 == 0) {
			return 0;
		}
		@Pc(35) int local35;
		@Pc(42) int local42;
		if (arg0.anInt4061 != -1 && arg0.anInt4061 < 32768) {
			@Pc(26) Class10_Sub1_Sub2_Sub1 local26 = Static178.aClass10_Sub1_Sub2_Sub1Array1[arg0.anInt4061];
			if (local26 != null) {
				local35 = arg0.anInt6728 - local26.anInt6728;
				local42 = arg0.anInt6726 - local26.anInt6726;
				if (local35 != 0 || local42 != 0) {
					arg0.method3409((int) (Math.atan2((double) local35, (double) local42) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		@Pc(82) int local82;
		if (arg0.anInt4061 >= 32768) {
			local82 = arg0.anInt4061 - 32768;
			if (Static301.anInt6030 == local82) {
				local82 = 2047;
			}
			@Pc(95) Class10_Sub1_Sub2_Sub2 local95 = Static202.aClass10_Sub1_Sub2_Sub2Array1[local82];
			if (local95 != null) {
				local42 = arg0.anInt6728 - local95.anInt6728;
				@Pc(110) int local110 = arg0.anInt6726 - local95.anInt6726;
				if (local42 != 0 || local110 != 0) {
					arg0.method3409((int) (Math.atan2((double) local42, (double) local110) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if ((arg0.anInt4015 != 0 || arg0.anInt4053 != 0) && (arg0.anInt4088 == 0 || arg0.anInt4081 > 0)) {
			local82 = arg0.anInt6728 - (arg0.anInt4015 - Static92.anInt1755 - Static92.anInt1755) * 64;
			local35 = arg0.anInt6726 - (arg0.anInt4053 - Static98.anInt1911 - Static98.anInt1911) * 64;
			if (local82 != 0 || local35 != 0) {
				arg0.method3409((int) (Math.atan2((double) local82, (double) local35) * 2607.5945876176133D) & 0x3FFF);
			}
			arg0.anInt4053 = 0;
			arg0.anInt4015 = 0;
		}
		return arg0.method3410();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIBII)V")
	public static void method5236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg4 - arg2;
		@Pc(14) int local14 = arg2 + arg6;
		for (@Pc(16) int local16 = arg6; local16 < local14; local16++) {
			Static244.method5351(arg3, arg0, Static319.anIntArrayArray31[local16], arg5);
		}
		for (@Pc(32) int local32 = arg4; local32 > local10; local32--) {
			Static244.method5351(arg3, arg0, Static319.anIntArrayArray31[local32], arg5);
		}
		@Pc(54) int local54 = arg2 + arg3;
		@Pc(59) int local59 = arg0 - arg2;
		for (@Pc(61) int local61 = local14; local61 <= local10; local61++) {
			@Pc(67) int[] local67 = Static319.anIntArrayArray31[local61];
			Static244.method5351(arg3, local54, local67, arg5);
			Static244.method5351(local54, local59, local67, arg1);
			Static244.method5351(local59, arg0, local67, arg5);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!lm;ILclient!lm;)V")
	public static void method5237(@OriginalArg(0) Class134 arg0, @OriginalArg(2) Class134 arg1) {
		Static166.aClass134_74 = arg0;
		Static348.aClass134_136 = arg1;
		Static348.aClass134_136.method3020(34);
	}
}
