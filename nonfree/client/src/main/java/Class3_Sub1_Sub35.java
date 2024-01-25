import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class3_Sub1_Sub35 extends Class3_Sub1 {

	@OriginalMember(owner = "client!tf", name = "I", descriptor = "I")
	private int anInt5591 = 1;

	@OriginalMember(owner = "client!tf", name = "J", descriptor = "I")
	private int anInt5592 = 1;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub35() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5541(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass206_41.method4681(arg0);
		if (super.aClass206_41.aBoolean409) {
			@Pc(28) int local28 = this.anInt5592 + this.anInt5592 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(40) int local40 = this.anInt5591 + this.anInt5591 + 1;
			@Pc(44) int local44 = 65536 / local40;
			@Pc(47) int[][][] local47 = new int[local28][][];
			@Pc(71) int local71;
			@Pc(73) int local73;
			for (@Pc(53) int local53 = arg0 - this.anInt5592; local53 <= this.anInt5592 + arg0; local53++) {
				@Pc(63) int[][] local63 = this.method5551(0, local53 & Static300.anInt5187);
				@Pc(67) int[][] local67 = new int[3][Static238.anInt4221];
				@Pc(69) int local69 = 0;
				local71 = 0;
				local73 = 0;
				@Pc(77) int[] local77 = local63[0];
				@Pc(81) int[] local81 = local63[1];
				@Pc(85) int[] local85 = local63[2];
				for (@Pc(89) int local89 = -this.anInt5591; local89 <= this.anInt5591; local89++) {
					@Pc(95) int local95 = local89 & Static171.anInt3000;
					local71 += local81[local95];
					local73 += local85[local95];
					local69 += local77[local95];
				}
				@Pc(126) int[] local126 = local67[0];
				@Pc(130) int[] local130 = local67[1];
				@Pc(134) int[] local134 = local67[2];
				@Pc(136) int local136 = 0;
				while (Static238.anInt4221 > local136) {
					local126[local136] = local44 * local69 >> 16;
					local130[local136] = local71 * local44 >> 16;
					local134[local136] = local44 * local73 >> 16;
					@Pc(170) int local170 = local136 - this.anInt5591 & Static171.anInt3000;
					local73 -= local85[local170];
					local71 -= local81[local170];
					local136++;
					local69 -= local77[local170];
					@Pc(196) int local196 = local136 + this.anInt5591 & Static171.anInt3000;
					local69 += local77[local196];
					local71 += local81[local196];
					local73 += local85[local196];
				}
				local47[this.anInt5592 + local53 - arg0] = local67;
			}
			@Pc(245) int[] local245 = local11[0];
			@Pc(249) int[] local249 = local11[1];
			@Pc(253) int[] local253 = local11[2];
			for (local71 = 0; local71 < Static238.anInt4221; local71++) {
				local73 = 0;
				@Pc(261) int local261 = 0;
				@Pc(263) int local263 = 0;
				for (@Pc(265) int local265 = 0; local265 < local28; local265++) {
					@Pc(271) int[][] local271 = local47[local265];
					local73 += local271[0][local71];
					local261 += local271[1][local71];
					local263 += local271[2][local71];
				}
				local245[local71] = local73 * local32 >> 16;
				local249[local71] = local32 * local261 >> 16;
				local253[local71] = local32 * local263 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5550(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass4_41.method61(arg0);
		if (super.aClass4_41.aBoolean7) {
			@Pc(25) int local25 = this.anInt5592 + this.anInt5592 + 1;
			@Pc(29) int local29 = 65536 / local25;
			@Pc(37) int local37 = this.anInt5591 + this.anInt5591 + 1;
			@Pc(41) int local41 = 65536 / local37;
			@Pc(44) int[][] local44 = new int[local25][];
			@Pc(65) int local65;
			for (@Pc(50) int local50 = arg0 - this.anInt5592; local50 <= arg0 + this.anInt5592; local50++) {
				@Pc(60) int[] local60 = this.method5547(Static300.anInt5187 & local50, 0);
				@Pc(63) int[] local63 = new int[Static238.anInt4221];
				local65 = 0;
				for (@Pc(69) int local69 = -this.anInt5591; local69 <= this.anInt5591; local69++) {
					local65 += local60[local69 & Static171.anInt3000];
				}
				@Pc(90) int local90 = 0;
				while (local90 < Static238.anInt4221) {
					local63[local90] = local65 * local41 >> 16;
					local65 -= local60[Static171.anInt3000 & local90 - this.anInt5591];
					local90++;
					local65 += local60[this.anInt5591 + local90 & Static171.anInt3000];
				}
				local44[this.anInt5592 + local50 - arg0] = local63;
			}
			for (@Pc(147) int local147 = 0; local147 < Static238.anInt4221; local147++) {
				@Pc(151) int local151 = 0;
				for (local65 = 0; local65 < local25; local65++) {
					local151 += local44[local65][local147];
				}
				local13[local147] = local29 * local151 >> 16;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!rp;BI)V")
	@Override
	public void method5545(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5591 = arg0.method2739();
		} else if (arg1 == 1) {
			this.anInt5592 = arg0.method2739();
		} else if (arg1 == 2) {
			super.aBoolean487 = arg0.method2739() == 1;
		}
	}
}
