import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "Lclient!te;")
	public static Class235 aClass235_1;

	@OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
	public static int anInt4984;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
	public static int anInt4981 = 0;

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "[Lclient!ab;")
	public static final Class3[] aClass3Array1 = new Class3[16];

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)V")
	public static void method3928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class36 local7 = Static175.aClass36ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class36 local28 = Static175.aClass36ArrayArrayArray1[local9][arg0][arg1] = Static175.aClass36ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte4--;
				for (@Pc(40) Class195 local40 = local28.aClass195_1; local40 != null; local40 = local40.aClass195_2) {
					@Pc(44) Class11_Sub5 local44 = local40.aClass11_Sub5_1;
					if (local44.aShort108 == arg0 && local44.aShort109 == arg1) {
						local44.aByte101--;
					}
				}
			}
		}
		if (Static175.aClass36ArrayArrayArray1[0][arg0][arg1] == null) {
			Static175.aClass36ArrayArrayArray1[0][arg0][arg1] = new Class36(0, arg0, arg1);
			Static175.aClass36ArrayArrayArray1[0][arg0][arg1].aByte2 = 1;
		}
		Static175.aClass36ArrayArrayArray1[0][arg0][arg1].aClass36_1 = local7;
		Static175.aClass36ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
	public static void method3929() {
		if (Static157.aBoolean179) {
			return;
		}
		if (Static434.aClass165_Sub1_1.aBoolean290) {
			Static37.aFloat9 = (int) Static37.aFloat9 - 65 & 0xFFFFFF80;
		} else {
			Static417.aFloat93 += (-Static417.aFloat93 - 24.0F) / 2.0F;
		}
		Static94.aBoolean395 = true;
		Static157.aBoolean179 = true;
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)[Lclient!cg;")
	public static Class37[] method3931() {
		return new Class37[] { Static278.aClass37_16, Static118.aClass37_8, Static447.aClass37_20, Static390.aClass37_17, Static97.aClass37_6, Static271.aClass37_15, Static464.aClass37_10, Static174.aClass37_12, Static125.aClass37_13, Static266.aClass37_14, Static438.aClass37_19, Static391.aClass37_18, Static43.aClass37_5, Static164.aClass37_11 };
	}
}
