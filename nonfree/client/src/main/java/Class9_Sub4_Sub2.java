import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class9_Sub4_Sub2 extends Class9_Sub4 {

	@OriginalMember(owner = "client!sj", name = "Yb", descriptor = "Lclient!k;")
	public Class1_Sub1_Sub9 aClass1_Sub1_Sub9_1;

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "()I")
	@Override
	public int method2902() {
		return super.anInt3936;
	}

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method2907() {
		return this.aClass1_Sub1_Sub9_1 != null;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass1_Sub1_Sub9_1 == null) {
			return;
		}
		@Pc(25) Class1_Sub1_Sub21 local25 = super.anInt3896 != -1 && super.anInt3906 == 0 ? Static74.method1343(super.anInt3896) : null;
		@Pc(43) Class1_Sub1_Sub21 local43 = super.anInt3905 == -1 || super.anInt3905 == super.anInt3932 && local25 != null ? null : Static74.method1343(super.anInt3905);
		@Pc(54) Class9_Sub2 local54 = this.aClass1_Sub1_Sub9_1.method1743(super.anInt3897, local25, local43, super.anInt3948);
		if (local54 == null) {
			return;
		}
		@Pc(59) int local59 = 0;
		super.anInt3936 = local54.method2902();
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass1_Sub1_Sub9_1.aShort25 != 0 && this.aClass1_Sub1_Sub9_1.aShort24 != 0) {
			@Pc(82) short local82 = this.aClass1_Sub1_Sub9_1.aShort25;
			@Pc(86) int local86 = Class46.anIntArray225[arg0];
			@Pc(90) int local90 = Class46.anIntArray226[arg0];
			@Pc(95) int local95 = -local82 / 2;
			@Pc(99) short local99 = this.aClass1_Sub1_Sub9_1.aShort24;
			@Pc(104) int local104 = -local99 / 2;
			@Pc(115) int local115 = local104 * local90 + local86 * local95 >> 16;
			@Pc(126) int local126 = local86 * local104 - local95 * local90 >> 16;
			@Pc(138) int local138 = Static165.method2268(local126 + super.anInt3903, Static180.anInt3841, local115 + super.anInt3925);
			@Pc(142) int local142 = local82 / 2;
			@Pc(147) int local147 = -local99 / 2;
			@Pc(157) int local157 = local86 * local142 + local147 * local90 >> 16;
			@Pc(167) int local167 = local147 * local86 - local90 * local142 >> 16;
			@Pc(172) int local172 = -local82 / 2;
			@Pc(186) int local186 = Static165.method2268(super.anInt3903 + local167, Static180.anInt3841, super.anInt3925 + local157);
			@Pc(190) int local190 = local99 / 2;
			@Pc(201) int local201 = local190 * local86 - local172 * local90 >> 16;
			@Pc(211) int local211 = local86 * local172 + local190 * local90 >> 16;
			@Pc(223) int local223 = Static165.method2268(local201 + super.anInt3903, Static180.anInt3841, local211 + super.anInt3925);
			@Pc(227) int local227 = local82 / 2;
			@Pc(231) int local231 = local99 / 2;
			@Pc(242) int local242 = local90 * local231 + local227 * local86 >> 16;
			@Pc(253) int local253 = local231 * local86 - local90 * local227 >> 16;
			@Pc(265) int local265 = Static165.method2268(local253 + super.anInt3903, Static180.anInt3841, super.anInt3925 + local242);
			local65 = local138 + local265;
			@Pc(277) int local277 = local186 > local138 ? local138 : local186;
			if (local65 > local223 + local186) {
				local65 = local223 + local186;
			}
			@Pc(297) int local297 = local138 < local223 ? local138 : local223;
			@Pc(308) int local308 = local186 >= local265 ? local265 : local186;
			@Pc(319) int local319 = local223 >= local265 ? local265 : local223;
			local67 = (int) (Math.atan2((double) (local277 - local319), (double) local99) * 325.95D) & 0x7FF;
			if (local67 != 0) {
				local54.method1698(local67);
			}
			local59 = (int) (Math.atan2((double) (local297 - local308), (double) local82) * 325.95D) & 0x7FF;
			if (local59 != 0) {
				local54.method1702(local59);
			}
			local65 = (local65 >> 1) - super.anInt3927;
			if (local65 != 0) {
				local54.method1694(0, local65, 0);
			}
		}
		@Pc(379) Class9_Sub2 local379 = null;
		if (super.anInt3914 != -1 && super.anInt3893 != -1) {
			@Pc(394) Class1_Sub1_Sub4 local394 = Static191.method2988(super.anInt3914);
			local379 = local394.method326(super.anInt3893);
			if (local379 != null) {
				local379.method1694(0, -super.anInt3934, 0);
				if (local394.aBoolean37) {
					if (local67 != 0) {
						local379.method1698(local67);
					}
					if (local59 != 0) {
						local379.method1702(local59);
					}
					if (local65 != 0) {
						local379.method1694(0, local65, 0);
					}
				}
			}
		}
		if (local379 != null) {
			local54 = ((Class9_Sub2_Sub1) local54).method1715(local379);
		}
		if (this.aClass1_Sub1_Sub9_1.anInt2329 == 1) {
			local54.aBoolean122 = true;
		}
		local54.method2903(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}
}
