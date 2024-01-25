import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
	public static int anInt2054;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!qd;IIIILclient!tt;Lclient!eca;)V")
	public static void method1935(@OriginalArg(0) int arg0, @OriginalArg(1) Class242 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class6_Sub1_Sub2_Sub2 arg5, @OriginalArg(7) Class6_Sub1_Sub2_Sub1 arg6) {
		@Pc(12) Class3_Sub16 local12 = new Class3_Sub16();
		local12.anInt2636 = arg2 << 9;
		local12.anInt2633 = arg0;
		local12.anInt2630 = arg3 << 9;
		if (arg1 != null) {
			local12.aClass242_1 = arg1;
			@Pc(33) int local33 = arg1.anInt7195;
			@Pc(36) int local36 = arg1.anInt7193;
			if (arg4 == 1 || arg4 == 3) {
				local33 = arg1.anInt7193;
				local36 = arg1.anInt7195;
			}
			local12.anInt2635 = arg1.anInt7207;
			local12.anInt2623 = arg1.anInt7182;
			local12.aBoolean197 = arg1.aBoolean480;
			local12.anInt2622 = arg1.anInt7162;
			local12.anInt2632 = arg1.anInt7205 << 9;
			local12.anInt2625 = arg1.anInt7187;
			local12.anInt2637 = arg3 + local36 << 9;
			local12.anIntArray264 = arg1.anIntArray635;
			local12.aBoolean195 = arg1.aBoolean481;
			local12.anInt2627 = local33 + arg2 << 9;
			if (arg1.anIntArray632 != null) {
				local12.aBoolean196 = true;
				local12.method2231();
			}
			if (local12.anIntArray264 != null) {
				local12.anInt2631 = local12.anInt2625 + (int) ((double) (local12.anInt2635 - local12.anInt2625) * Math.random());
			}
			Static529.aClass71_66.method2076(local12);
		} else if (arg5 != null) {
			local12.aClass6_Sub1_Sub2_Sub2_2 = arg5;
			@Pc(140) Class230 local140 = arg5.aClass230_1;
			if (local140.anIntArray627 != null) {
				local12.aBoolean196 = true;
				local140 = local140.method5898(Static127.aClass215_1);
			}
			if (local140 != null) {
				local12.anInt2637 = arg3 + local140.anInt7040 << 9;
				local12.anInt2627 = arg2 + local140.anInt7040 << 9;
				local12.anInt2622 = Static90.method1815(arg5);
				local12.anInt2623 = local140.anInt7025;
				local12.aBoolean197 = local140.aBoolean450;
				local12.anInt2632 = local140.anInt7054 << 9;
			}
			Static239.aClass71_41.method2076(local12);
		} else if (arg6 != null) {
			local12.aClass6_Sub1_Sub2_Sub1_2 = arg6;
			local12.anInt2627 = arg6.method7083() + arg2 << 9;
			local12.anInt2637 = arg3 + arg6.method7083() << 9;
			local12.anInt2622 = Static475.method7097(arg6);
			local12.anInt2623 = arg6.anInt2286;
			local12.anInt2632 = arg6.anInt2317 << 9;
			local12.aBoolean197 = arg6.aBoolean162;
			Static25.aClass267_1.method6640(local12, (long) arg6.anInt8587);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
	public static void method1936() {
		if (Static405.aBoolean520) {
			return;
		}
		Static256.aBoolean354 = true;
		Static405.aBoolean520 = true;
		if (Static7.aClass3_Sub15_Sub1_1.aBoolean604) {
			Static487.aFloat258 = (int) Static487.aFloat258 - 65 & 0xFFFFFF80;
		} else {
			Static479.aFloat252 += (-Static479.aFloat252 - 24.0F) / 2.0F;
		}
	}
}
