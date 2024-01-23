import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!ck", name = "ab", descriptor = "Lclient!ph;")
	public static Class138 aClass138_8;

	@OriginalMember(owner = "client!ck", name = "Q", descriptor = "I")
	public static int anInt613 = 0;

	@OriginalMember(owner = "client!ck", name = "U", descriptor = "I")
	public static int anInt617 = 0;

	@OriginalMember(owner = "client!ck", name = "Z", descriptor = "I")
	public static int anInt622 = 0;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(JIBI)Z")
	public static boolean method580(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18 = (int) arg0 >> 14 & 0x1F;
		@Pc(25) int local25 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
		@Pc(32) int local32 = (int) arg0 >> 20 & 0x3;
		if (local18 == 10 || local18 == 11 || local18 == 22) {
			@Pc(69) Class43 local69 = Static189.method3080(local25);
			@Pc(80) int local80;
			@Pc(83) int local83;
			if (local32 == 0 || local32 == 2) {
				local80 = local69.anInt1185;
				local83 = local69.anInt1153;
			} else {
				local80 = local69.anInt1153;
				local83 = local69.anInt1185;
			}
			@Pc(94) int local94 = local69.anInt1161;
			if (local32 != 0) {
				local94 = (local94 << local32 & 0xF) + (local94 >> 4 - local32);
			}
			Static234.method3703(local83, local80, Static229.aClass22_Sub3_Sub2_2.anIntArray427[0], 0, 0, local94, Static229.aClass22_Sub3_Sub2_2.anIntArray424[0], arg1, arg2);
		} else {
			Static234.method3703(0, 0, Static229.aClass22_Sub3_Sub2_2.anIntArray427[0], local18 + 1, local32, 0, Static229.aClass22_Sub3_Sub2_2.anIntArray424[0], arg1, arg2);
		}
		return true;
	}

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "(I)Lclient!uo;")
	public static Class182_Sub1 method581() {
		return Static303.anInt5733 >= Static29.aClass182_Sub1Array1.length ? null : Static29.aClass182_Sub1Array1[Static303.anInt5733++];
	}
}
