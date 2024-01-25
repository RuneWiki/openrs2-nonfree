import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class174 {

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "[[Lclient!wga;")
	private Class375[][] aClass375ArrayArray1;

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "Lclient!mu;")
	private final Class40_Sub2 aClass40_Sub2_2;

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "Lclient!rda;")
	private final Class126_Sub3 aClass126_Sub3_17;

	@OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
	public final int anInt4414;

	@OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
	private final int anInt4416;

	@OriginalMember(owner = "client!jl", name = "l", descriptor = "[B")
	public final byte[] aByteArray39;

	@OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
	private final int anInt4411;

	@OriginalMember(owner = "client!jl", name = "n", descriptor = "I")
	private final int anInt4417;

	@OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
	private final int anInt4419;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lclient!rda;Lclient!mu;)V")
	public Class174(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) Class40_Sub2 arg1) {
		this.aClass40_Sub2_2 = arg1;
		this.aClass126_Sub3_17 = arg0;
		this.anInt4414 = (this.aClass40_Sub2_2.anInt9918 * this.aClass40_Sub2_2.anInt9920 >> this.aClass126_Sub3_17.anInt8271) + 2;
		this.anInt4416 = (this.aClass40_Sub2_2.anInt9923 * this.aClass40_Sub2_2.anInt9918 >> this.aClass126_Sub3_17.anInt8271) + 2;
		this.aByteArray39 = new byte[this.anInt4416 * this.anInt4414];
		this.anInt4411 = this.aClass126_Sub3_17.anInt8271 + 7 - this.aClass40_Sub2_2.anInt9919;
		this.anInt4417 = this.aClass40_Sub2_2.anInt9920 >> this.anInt4411;
		this.anInt4419 = this.aClass40_Sub2_2.anInt9923 >> this.anInt4411;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!r;ZII)V")
	public void method4033(@OriginalArg(0) Class5_Sub4_Sub10 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class5_Sub4_Sub10_Sub1 local6 = (Class5_Sub4_Sub10_Sub1) arg0;
		arg2 += local6.anInt3787 + 1;
		arg1 += local6.anInt3784 + 1;
		@Pc(28) int local28 = arg2 + arg1 * this.anInt4414;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt3782;
		@Pc(36) int local36 = local6.anInt3786;
		@Pc(41) int local41 = this.anInt4414 - local36;
		@Pc(51) int local51;
		if (arg1 <= 0) {
			local51 = 1 - arg1;
			arg1 = 1;
			local33 -= local51;
			local30 = local51 * local36;
			local28 += this.anInt4414 * local51;
		}
		@Pc(72) int local72 = 0;
		if (arg1 + local33 >= this.anInt4416) {
			local51 = arg1 + local33 + 1 - this.anInt4416;
			local33 -= local51;
		}
		if (arg2 <= 0) {
			local51 = 1 - arg2;
			local41 += local51;
			local30 += local51;
			local36 -= local51;
			local28 += local51;
			local72 = local51;
			arg2 = 1;
		}
		if (this.anInt4414 <= local36 + arg2) {
			local51 = arg2 + local36 + 1 - this.anInt4414;
			local36 -= local51;
			local72 += local51;
			local41 += local51;
		}
		if (local36 > 0 && local33 > 0) {
			Static246.method3760(local33, this.aByteArray39, local6.aByteArray32, local30, local72, local28, local36, local41);
			this.method4038(local33, local36, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIILclient!r;)Z")
	public boolean method4034(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub4_Sub10 arg2) {
		@Pc(6) Class5_Sub4_Sub10_Sub1 local6 = (Class5_Sub4_Sub10_Sub1) arg2;
		arg0 += local6.anInt3787 + 1;
		arg1 += local6.anInt3784 + 1;
		@Pc(33) int local33 = arg0 + this.anInt4414 * arg1;
		@Pc(36) int local36 = local6.anInt3782;
		@Pc(39) int local39 = local6.anInt3786;
		@Pc(46) int local46;
		if (arg1 <= 0) {
			local46 = 1 - arg1;
			local36 -= local46;
			arg1 = 1;
			local33 += this.anInt4414 * local46;
		}
		@Pc(65) int local65 = this.anInt4414 - local39;
		if (this.anInt4416 <= local36 + arg1) {
			local46 = local36 + arg1 + 1 - this.anInt4416;
			local36 -= local46;
		}
		if (arg0 <= 0) {
			local46 = 1 - arg0;
			arg0 = 1;
			local33 += local46;
			local39 -= local46;
			local65 += local46;
		}
		if (local39 + arg0 >= this.anInt4414) {
			local46 = local39 + arg0 + 1 - this.anInt4414;
			local39 -= local46;
			local65 += local46;
		}
		if (local39 > 0 && local36 > 0) {
			local65 += this.anInt4414 * 7;
			return Static299.method4346(local36, local65, this.aByteArray39, local33, local39);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!r;III)V")
	public void method4035(@OriginalArg(0) Class5_Sub4_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class5_Sub4_Sub10_Sub1 local6 = (Class5_Sub4_Sub10_Sub1) arg0;
		arg2 += local6.anInt3784 + 1;
		arg1 += local6.anInt3787 + 1;
		@Pc(28) int local28 = arg1 + arg2 * this.anInt4414;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt3782;
		@Pc(36) int local36 = local6.anInt3786;
		@Pc(42) int local42 = this.anInt4414 - local36;
		@Pc(49) int local49;
		if (arg2 <= 0) {
			local49 = 1 - arg2;
			local33 -= local49;
			arg2 = 1;
			local28 += local49 * this.anInt4414;
			local30 = local49 * local36;
		}
		@Pc(70) int local70 = 0;
		if (this.anInt4416 <= local33 + arg2) {
			local49 = local33 + arg2 + 1 - this.anInt4416;
			local33 -= local49;
		}
		if (arg1 <= 0) {
			local49 = 1 - arg1;
			local28 += local49;
			local42 += local49;
			arg1 = 1;
			local30 += local49;
			local36 -= local49;
			local70 = local49;
		}
		if (this.anInt4414 <= arg1 + local36) {
			local49 = arg1 + local36 + 1 - this.anInt4414;
			local42 += local49;
			local70 += local49;
			local36 -= local49;
		}
		if (local36 > 0 && local33 > 0) {
			Static116.method1667(local28, local6.aByteArray32, local33, local30, local36, local42, local70, this.aByteArray39);
			this.method4038(local33, local36, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
	public void method4036() {
		this.aClass375ArrayArray1 = new Class375[this.anInt4417][this.anInt4419];
		for (@Pc(14) int local14 = 0; local14 < this.anInt4419; local14++) {
			for (@Pc(29) int local29 = 0; local29 < this.anInt4417; local29++) {
				this.aClass375ArrayArray1[local29][local14] = new Class375(this.aClass126_Sub3_17, this, this.aClass40_Sub2_2, local29, local14, this.anInt4411, local29 * 128 + 1, local14 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(I[[ZIZII)V")
	public void method4037(@OriginalArg(1) boolean[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aClass126_Sub3_17.method7102(false);
		this.aClass126_Sub3_17.method7094(false);
		this.aClass126_Sub3_17.method7106(-2);
		this.aClass126_Sub3_17.method7105(1);
		this.aClass126_Sub3_17.method7109(1);
		@Pc(41) float local41 = 1.0F / (float) (this.aClass126_Sub3_17.anInt8273 * 128);
		@Pc(45) int local45;
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(61) int local61;
		@Pc(65) int local65;
		@Pc(70) int local70;
		@Pc(77) int local77;
		if (arg2) {
			for (local45 = 0; local45 < this.anInt4419; local45++) {
				local52 = local45 << this.anInt4411;
				local59 = local45 + 1 << this.anInt4411;
				label81: for (local61 = 0; local61 < this.anInt4417; local61++) {
					local65 = local61 << this.anInt4411;
					local70 = local61 + 1 << this.anInt4411;
					for (local77 = local65; local77 < local70; local77++) {
						if (local77 - arg4 >= -arg1 && arg1 >= local77 - arg4) {
							for (@Pc(326) int local326 = local52; local326 < local59; local326++) {
								if (local326 - arg3 >= -arg1 && local326 - arg3 <= arg1 && arg0[local77 + arg1 - arg4][local326 + arg1 - arg3]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local41, local41, 1.0F);
									OpenGL.glTranslatef((float) -local61 / local41, (float) -local45 / local41, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass375ArrayArray1[local61][local45].method8756();
									continue label81;
								}
							}
						}
					}
				}
			}
		} else {
			for (local45 = 0; local45 < this.anInt4419; local45++) {
				local52 = local45 << this.anInt4411;
				local59 = local45 + 1 << this.anInt4411;
				for (local61 = 0; local61 < this.anInt4417; local61++) {
					local65 = 0;
					local70 = local61 << this.anInt4411;
					local77 = local61 + 1 << this.anInt4411;
					@Pc(81) Class5_Sub12_Sub1 local81 = this.aClass126_Sub3_17.aClass5_Sub12_Sub1_2;
					local81.anInt10154 = 0;
					for (@Pc(86) int local86 = local52; local86 < local59; local86++) {
						if (local86 - arg3 >= -arg1 && local86 - arg3 <= arg1) {
							@Pc(113) int local113 = this.aClass40_Sub2_2.anInt9920 * local86 + local70;
							for (@Pc(115) int local115 = local70; local115 < local77; local115++) {
								if (-arg1 <= local115 - arg4 && arg1 >= local115 - arg4 && arg0[local115 + arg1 - arg4][local86 + arg1 - arg3]) {
									@Pc(153) short[] local153 = this.aClass40_Sub2_2.aShortArrayArray10[local113];
									if (local153 != null) {
										@Pc(161) int local161;
										if (this.aClass126_Sub3_17.aBoolean674) {
											for (local161 = 0; local161 < local153.length; local161++) {
												local81.method8655(local153[local161] & 0xFFFF);
												local65++;
											}
										} else {
											for (local161 = 0; local161 < local153.length; local161++) {
												local81.method8643(local153[local161] & 0xFFFF);
												local65++;
											}
										}
									}
								}
								local113++;
							}
						}
					}
					if (local65 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local41, local41, 1.0F);
						OpenGL.glTranslatef((float) -local61 / local41, (float) -local45 / local41, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass375ArrayArray1[local61][local45].method8761(local81.aByteArray104, local65);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IZIII)V")
	private void method4038(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass375ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg3 - 1 >> 7;
		@Pc(25) int local25 = arg3 + arg1 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg2 - 1 >> 7;
		@Pc(41) int local41 = arg2 + arg0 - 1 - 1 >> 7;
		for (@Pc(43) int local43 = local15; local43 <= local25; local43++) {
			@Pc(50) Class375[] local50 = this.aClass375ArrayArray1[local43];
			for (@Pc(52) int local52 = local31; local52 <= local41; local52++) {
				local50[local52].aBoolean831 = true;
			}
		}
	}
}
