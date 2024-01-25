import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!nca", name = "f", descriptor = "I")
	public static int anInt6985;

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "[Lclient!fia;")
	public static Class45[] aClass45Array24;

	@OriginalMember(owner = "client!nca", name = "g", descriptor = "I")
	public static int anInt6980 = -1;

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_181 = new Class160(89, -2);

	@OriginalMember(owner = "client!nca", name = "j", descriptor = "Z")
	public static boolean aBoolean493 = false;

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(BII)I")
	public static int method6095(@OriginalArg(2) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(48) int local48 = (arg0 & 0x7F) * 96 >> 7;
			if (local48 < 2) {
				local48 = 2;
			} else if (local48 > 126) {
				local48 = 126;
			}
			return local48 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIIBLclient!gg;Lclient!fr;Lclient!gba;I)V")
	public static void method6096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class4_Sub3_Sub3_Sub3_Sub2 arg3, @OriginalArg(5) Class4_Sub3_Sub3_Sub3_Sub1 arg4, @OriginalArg(6) Class128 arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class14_Sub42 local7 = new Class14_Sub42();
		local7.anInt9535 = arg6 << 9;
		local7.anInt9541 = arg1;
		local7.anInt9546 = arg0 << 9;
		if (arg5 != null) {
			local7.aClass128_1 = arg5;
			@Pc(33) int local33 = arg5.anInt2959;
			@Pc(36) int local36 = arg5.anInt2975;
			if (arg2 == 1 || arg2 == 3) {
				local36 = arg5.anInt2959;
				local33 = arg5.anInt2975;
			}
			local7.anInt9542 = arg5.anInt2971 << 9;
			local7.aBoolean659 = arg5.aBoolean217;
			local7.anInt9536 = local36 + arg6 << 9;
			local7.anInt9531 = arg5.anInt2990;
			local7.anInt9539 = arg5.anInt2966;
			local7.anInt9534 = local33 + arg0 << 9;
			local7.anInt9545 = arg5.anInt2968;
			local7.anInt9543 = arg5.anInt2958;
			local7.anInt9537 = arg5.anInt2985;
			local7.aBoolean660 = arg5.aBoolean218;
			local7.anInt9550 = arg5.anInt2950 << 9;
			local7.anInt9547 = arg5.anInt2963;
			local7.anIntArray497 = arg5.anIntArray178;
			if (arg5.anIntArray179 != null) {
				local7.aBoolean658 = true;
				local7.method8234();
			}
			if (local7.anIntArray497 != null) {
				local7.anInt9538 = local7.anInt9539 + (int) ((double) (local7.anInt9537 - local7.anInt9539) * Math.random());
			}
			Static618.aClass32_66.method582(local7);
		} else if (arg4 != null) {
			local7.aClass4_Sub3_Sub3_Sub3_Sub1_1 = arg4;
			@Pc(222) Class362 local222 = arg4.aClass362_1;
			if (local222.lb != null) {
				local7.aBoolean658 = true;
				local222 = local222.method8641(Static188.aClass238_1);
			}
			if (local222 != null) {
				local7.anInt9534 = arg0 + local222.anInt10069 << 9;
				local7.anInt9536 = local222.anInt10069 + arg6 << 9;
				local7.anInt9545 = Static420.method6288(arg4);
				local7.anInt9531 = local222.anInt10079;
				local7.anInt9543 = local222.anInt10078;
				local7.aBoolean659 = local222.aBoolean697;
				local7.anInt9547 = local222.anInt10096;
				local7.anInt9542 = local222.anInt10085 << 9;
				local7.anInt9550 = local222.anInt10082 << 9;
			}
			Static489.aClass32_57.method582(local7);
		} else if (arg3 != null) {
			local7.aClass4_Sub3_Sub3_Sub3_Sub2_2 = arg3;
			local7.anInt9534 = arg3.method2870(0) + arg0 << 9;
			local7.anInt9536 = arg6 + arg3.method2870(0) << 9;
			local7.anInt9545 = Static254.method4274(arg3);
			local7.anInt9547 = 256;
			local7.anInt9543 = arg3.anInt3323;
			local7.anInt9531 = 256;
			local7.anInt9550 = 0;
			local7.anInt9542 = arg3.anInt3309 << 9;
			local7.aBoolean659 = arg3.aBoolean247;
			Static341.aClass125_19.method2626(local7, (long) arg3.anInt3238);
			return;
		}
	}
}
