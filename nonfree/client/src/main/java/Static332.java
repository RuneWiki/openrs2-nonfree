import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
	public static int anInt5338;

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
	public static int anInt5342;

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
	public static int anInt5343;

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "Lclient!wia;")
	public static Class403 aClass403_1;

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
	public static int anInt5339 = 0;

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "Z")
	public static boolean aBoolean354 = false;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
	public static int anInt5345 = 0;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([BZI)I")
	public static int method4777(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static371.method5084(0, arg0, arg1);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIZI)V")
	public static void method4778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg2 + Static291.anInt4448;
		@Pc(14) int local14 = arg0 + Static189.anInt3243;
		if (Static448.aClass364ArrayArrayArray2 == null || arg2 < 0 || arg0 < 0 || Static497.anInt7926 <= arg2 || Static646.anInt9979 <= arg0 || Static580.aClass3_Sub22_24.aClass21_Sub15_2.method5064() == 0 && Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aByte139 != arg1) {
			return;
		}
		@Pc(69) long local69 = (long) (arg1 << 28 | local14 << 14 | local9);
		@Pc(75) Class3_Sub28 local75 = (Class3_Sub28) Static113.aClass313_9.method7104(local69);
		if (local75 == null) {
			Static642.method8455(arg1, arg2, arg0);
			return;
		}
		@Pc(90) Class3_Sub30 local90 = (Class3_Sub30) local75.aClass342_37.method7644();
		if (local90 == null) {
			Static642.method8455(arg1, arg2, arg0);
			return;
		}
		@Pc(105) Class9_Sub1_Sub5_Sub1 local105 = (Class9_Sub1_Sub5_Sub1) Static642.method8455(arg1, arg2, arg0);
		if (local105 == null) {
			local105 = new Class9_Sub1_Sub5_Sub1(arg2 << 9, Static477.aClass259Array3[arg1].method9295(arg0, arg2), arg0 << 9, arg1, arg1);
		} else {
			local105.anInt6742 = local105.anInt6740 = -1;
		}
		local105.anInt6743 = local90.anInt4369;
		local105.anInt6738 = local90.anInt4371;
		label56: while (true) {
			@Pc(150) Class3_Sub30 local150 = (Class3_Sub30) local75.aClass342_37.method7650();
			if (local150 == null) {
				break;
			}
			if (local105.anInt6738 != local150.anInt4371) {
				local105.anInt6742 = local150.anInt4371;
				local105.anInt6727 = local150.anInt4369;
				while (true) {
					@Pc(177) Class3_Sub30 local177 = (Class3_Sub30) local75.aClass342_37.method7650();
					if (local177 == null) {
						break label56;
					}
					if (local105.anInt6738 != local177.anInt4371 && local177.anInt4371 != local105.anInt6742) {
						local105.anInt6740 = local177.anInt4371;
						local105.anInt6731 = local177.anInt4369;
					}
				}
			}
		}
		@Pc(227) int local227 = Static77.method1633((arg0 << 9) + 256, (arg2 << 9) - -256, arg1);
		local105.anInt6741 = 0;
		local105.aByte140 = (byte) arg1;
		local105.anInt10694 = arg2 << 9;
		local105.anInt10690 = local227;
		local105.aByte139 = (byte) arg1;
		local105.anInt10695 = arg0 << 9;
		if (Static574.method7435(arg2, arg0)) {
			local105.aByte140++;
		}
		Static298.method4188(arg1, arg2, arg0, local227, local105);
	}
}
