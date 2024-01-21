import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class1_Sub2_Sub1_Sub3_Sub2 extends Class1_Sub2_Sub1_Sub3 {

	@OriginalMember(owner = "client!qh", name = "uc", descriptor = "Lclient!ea;")
	public Class1_Sub2_Sub5 aClass1_Sub2_Sub5_1;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass1_Sub2_Sub5_1 == null) {
			return;
		}
		@Pc(24) Class1_Sub2_Sub18 local24 = super.anInt3024 != -1 && super.anInt3037 == 0 ? Static73.method1277(super.anInt3024) : null;
		@Pc(43) Class1_Sub2_Sub18 local43 = super.anInt3054 == -1 || super.anInt3054 == super.anInt3009 && local24 != null ? null : Static73.method1277(super.anInt3054);
		@Pc(54) Class1_Sub2_Sub1_Sub4 local54 = this.aClass1_Sub2_Sub5_1.method758(super.anInt3013, local43, local24, super.anInt3046);
		if (local54 == null) {
			return;
		}
		local54.method1459();
		super.aShort36 = local54.aShort36;
		if (this.aClass1_Sub2_Sub5_1.aShort6 != 0 && this.aClass1_Sub2_Sub5_1.aShort5 != 0) {
			@Pc(78) int local78 = Class1_Sub2_Sub2_Sub1.anIntArray30[arg0];
			@Pc(82) short local82 = this.aClass1_Sub2_Sub5_1.aShort5;
			@Pc(86) short local86 = this.aClass1_Sub2_Sub5_1.aShort6;
			@Pc(90) int local90 = Class1_Sub2_Sub2_Sub1.anIntArray33[arg0];
			@Pc(95) int local95 = -local86 / 2;
			@Pc(100) int local100 = -local82 / 2;
			@Pc(110) int local110 = local95 * local90 + local78 * local100 >> 16;
			@Pc(121) int local121 = local90 * local100 - local78 * local95 >> 16;
			@Pc(133) int local133 = Static102.method1694(local110 + super.anInt3040, Static44.anInt1086, local121 + super.anInt3026);
			@Pc(138) int local138 = -local82 / 2;
			@Pc(142) int local142 = local86 / 2;
			@Pc(152) int local152 = local138 * local78 + local142 * local90 >> 16;
			@Pc(163) int local163 = local90 * local138 - local142 * local78 >> 16;
			@Pc(176) int local176 = Static102.method1694(super.anInt3040 + local152, Static44.anInt1086, super.anInt3026 + local163);
			@Pc(181) int local181 = -local86 / 2;
			@Pc(185) int local185 = local82 / 2;
			@Pc(195) int local195 = local90 * local181 + local185 * local78 >> 16;
			@Pc(205) int local205 = local90 * local185 - local78 * local181 >> 16;
			@Pc(217) int local217 = Static102.method1694(local195 + super.anInt3040, Static44.anInt1086, local205 + super.anInt3026);
			@Pc(221) int local221 = local86 / 2;
			@Pc(225) int local225 = local82 / 2;
			@Pc(235) int local235 = local221 * local90 + local78 * local225 >> 16;
			@Pc(246) int local246 = local90 * local225 - local221 * local78 >> 16;
			@Pc(259) int local259 = Static102.method1694(super.anInt3040 + local235, Static44.anInt1086, local246 + super.anInt3026);
			@Pc(270) int local270 = local133 < local176 ? local133 : local176;
			@Pc(277) int local277 = local176 >= local259 ? local259 : local176;
			@Pc(284) int local284 = local259 <= local217 ? local259 : local217;
			@Pc(291) int local291 = local217 > local133 ? local133 : local217;
			@Pc(302) int local302 = (local291 + local284 + local270 + local277) / 4;
			@Pc(316) int local316 = (int) (Math.atan2((double) (local270 - local284), (double) local82) * 320.0D) & 0x7FF;
			local54.method1447(local316);
			@Pc(333) int local333 = (int) (Math.atan2((double) (local291 - local277), (double) local86) * 320.0D) & 0x7FF;
			local54.method1460(local333);
			local54.method1458(0, local302 - super.anInt3012, 0);
		}
		@Pc(347) Class1_Sub2_Sub1_Sub4 local347 = null;
		if (super.anInt3028 != -1 && super.anInt3058 != -1) {
			local347 = Static67.method1207(super.anInt3028).method912(super.anInt3058);
			if (local347 != null) {
				local347.method1458(0, -super.anInt3042, 0);
			}
		}
		if (local347 != null) {
			local54 = ((Class1_Sub2_Sub1_Sub4_Sub1) local54).method1470(local347);
		}
		if (this.aClass1_Sub2_Sub5_1.anInt1010 == 1) {
			local54.aBoolean81 = true;
		}
		local54.method2784(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method2363() {
		return this.aClass1_Sub2_Sub5_1 != null;
	}
}
