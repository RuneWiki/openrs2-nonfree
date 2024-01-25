import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hha")
public final class Class154 {

	@OriginalMember(owner = "client!hha", name = "m", descriptor = "[[Lclient!qc;")
	private Class294[][] aClass294ArrayArray1;

	@OriginalMember(owner = "client!hha", name = "f", descriptor = "Lclient!lja;")
	private final Class159_Sub2 aClass159_Sub2_1;

	@OriginalMember(owner = "client!hha", name = "j", descriptor = "Lclient!pi;")
	private final Class144_Sub3 aClass144_Sub3_12;

	@OriginalMember(owner = "client!hha", name = "o", descriptor = "I")
	public int anInt4342;

	@OriginalMember(owner = "client!hha", name = "g", descriptor = "I")
	private final int anInt4345;

	@OriginalMember(owner = "client!hha", name = "b", descriptor = "[B")
	public final byte[] aByteArray53;

	@OriginalMember(owner = "client!hha", name = "n", descriptor = "I")
	private final int anInt4337;

	@OriginalMember(owner = "client!hha", name = "s", descriptor = "I")
	private final int anInt4343;

	@OriginalMember(owner = "client!hha", name = "p", descriptor = "I")
	private final int anInt4335;

	@OriginalMember(owner = "client!hha", name = "<init>", descriptor = "(Lclient!pi;Lclient!lja;)V")
	public Class154(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) Class159_Sub2 arg1) {
		this.aClass159_Sub2_1 = arg1;
		this.aClass144_Sub3_12 = arg0;
		this.anInt4342 = (this.aClass159_Sub2_1.anInt9504 * this.aClass159_Sub2_1.anInt9502 >> this.aClass144_Sub3_12.anInt8053) + 2;
		this.anInt4345 = (this.aClass159_Sub2_1.anInt9506 * this.aClass159_Sub2_1.anInt9502 >> this.aClass144_Sub3_12.anInt8053) + 2;
		this.aByteArray53 = new byte[this.anInt4342 * this.anInt4345];
		this.anInt4337 = this.aClass144_Sub3_12.anInt8053 + 7 - this.aClass159_Sub2_1.anInt9501;
		this.anInt4343 = this.aClass159_Sub2_1.anInt9504 >> this.anInt4337;
		this.anInt4335 = this.aClass159_Sub2_1.anInt9506 >> this.anInt4337;
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(IIIZ[[ZI)V")
	public void method3813(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean[][] arg3, @OriginalArg(5) int arg4) {
		this.aClass144_Sub3_12.method7015(false);
		this.aClass144_Sub3_12.method7040(false);
		this.aClass144_Sub3_12.method7053(-2);
		this.aClass144_Sub3_12.method6988(1);
		this.aClass144_Sub3_12.method7054(1);
		@Pc(41) float local41 = 1.0F / (float) (this.aClass144_Sub3_12.anInt8052 * 128);
		@Pc(45) int local45;
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(61) int local61;
		@Pc(68) int local68;
		@Pc(75) int local75;
		@Pc(77) int local77;
		if (arg2) {
			for (local45 = 0; local45 < this.anInt4335; local45++) {
				local52 = local45 << this.anInt4337;
				local59 = local45 + 1 << this.anInt4337;
				label128: for (local61 = 0; local61 < this.anInt4343; local61++) {
					local68 = local61 << this.anInt4337;
					local75 = local61 + 1 << this.anInt4337;
					for (local77 = local68; local77 < local75; local77++) {
						if (-arg1 <= local77 - arg4 && arg1 >= local77 - arg4) {
							for (@Pc(101) int local101 = local52; local101 < local59; local101++) {
								if (-arg1 <= local101 - arg0 && local101 - arg0 <= arg1 && arg3[local77 + arg1 - arg4][local101 + arg1 - arg0]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local41, local41, 1.0F);
									OpenGL.glTranslatef((float) -local61 / local41, (float) -local45 / local41, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass294ArrayArray1[local61][local45].method7338();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local45 = 0; local45 < this.anInt4335; local45++) {
				local52 = local45 << this.anInt4337;
				local59 = local45 + 1 << this.anInt4337;
				for (local61 = 0; local61 < this.anInt4343; local61++) {
					local68 = 0;
					local75 = local61 << this.anInt4337;
					local77 = local61 + 1 << this.anInt4337;
					@Pc(259) Class14_Sub21_Sub1 local259 = this.aClass144_Sub3_12.aClass14_Sub21_Sub1_2;
					local259.anInt8936 = 0;
					for (@Pc(264) int local264 = local52; local264 < local59; local264++) {
						if (local264 - arg0 >= -arg1 && local264 - arg0 <= arg1) {
							@Pc(291) int local291 = local75 + this.aClass159_Sub2_1.anInt9504 * local264;
							for (@Pc(293) int local293 = local75; local293 < local77; local293++) {
								if (-arg1 <= local293 - arg4 && arg1 >= local293 - arg4 && arg3[local293 + arg1 - arg4][arg1 + local264 - arg0]) {
									@Pc(344) short[] local344 = this.aClass159_Sub2_1.aShortArrayArray2[local291];
									if (local344 != null) {
										@Pc(354) int local354;
										if (this.aClass144_Sub3_12.aBoolean557) {
											for (local354 = 0; local354 < local344.length; local354++) {
												local68++;
												local259.method7751(local344[local354] & 0xFFFF);
											}
										} else {
											for (local354 = 0; local354 < local344.length; local354++) {
												local259.method7722(local344[local354] & 0xFFFF);
												local68++;
											}
										}
									}
								}
								local291++;
							}
						}
					}
					if (local68 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local41, local41, 1.0F);
						OpenGL.glTranslatef((float) -local61 / local41, (float) -local45 / local41, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass294ArrayArray1[local61][local45].method7342(local259.aByteArray99, local68);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(BIIII)V")
	private void method3815(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass294ArrayArray1 == null) {
			return;
		}
		@Pc(16) int local16 = arg0 - 1 >> 7;
		@Pc(26) int local26 = arg3 + arg0 - 1 - 1 >> 7;
		@Pc(32) int local32 = arg2 - 1 >> 7;
		@Pc(50) int local50 = arg2 + arg1 - 1 - 1 >> 7;
		for (@Pc(52) int local52 = local16; local52 <= local26; local52++) {
			@Pc(59) Class294[] local59 = this.aClass294ArrayArray1[local52];
			for (@Pc(61) int local61 = local32; local61 <= local50; local61++) {
				local59[local61].aBoolean594 = true;
			}
		}
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(I)V")
	public void method3817() {
		this.aClass294ArrayArray1 = new Class294[this.anInt4343][this.anInt4335];
		for (@Pc(14) int local14 = 0; local14 < this.anInt4335; local14++) {
			for (@Pc(20) int local20 = 0; local20 < this.anInt4343; local20++) {
				this.aClass294ArrayArray1[local20][local14] = new Class294(this.aClass144_Sub3_12, this, this.aClass159_Sub2_1, local20, local14, this.anInt4337, local20 * 128 + 1, local14 * 128 + 1);
			}
		}
		if (90 <= 76) {
			this.anInt4342 = 40;
		}
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(Lclient!r;BII)V")
	public void method3818(@OriginalArg(0) Class14_Sub2_Sub5 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class14_Sub2_Sub5_Sub2 local17 = (Class14_Sub2_Sub5_Sub2) arg0;
		arg1 += local17.anInt10655 + 1;
		arg2 += local17.anInt10650 + 1;
		@Pc(39) int local39 = arg2 + this.anInt4342 * arg1;
		@Pc(41) int local41 = 0;
		@Pc(44) int local44 = local17.anInt10649;
		@Pc(47) int local47 = local17.anInt10658;
		@Pc(53) int local53 = this.anInt4342 - local47;
		@Pc(55) int local55 = 0;
		@Pc(61) int local61;
		if (arg1 <= 0) {
			local61 = 1 - arg1;
			local39 += local61 * this.anInt4342;
			local44 -= local61;
			local41 = local47 * local61;
			arg1 = 1;
		}
		if (arg1 + local44 >= this.anInt4345) {
			local61 = arg1 + local44 + 1 - this.anInt4345;
			local44 -= local61;
		}
		if (arg2 <= 0) {
			local61 = 1 - arg2;
			local41 += local61;
			local39 += local61;
			local53 += local61;
			local55 = local61;
			arg2 = 1;
			local47 -= local61;
		}
		if (local47 + arg2 >= this.anInt4342) {
			local61 = local47 + arg2 + 1 - this.anInt4342;
			local55 += local61;
			local53 += local61;
			local47 -= local61;
		}
		if (local47 > 0 && local44 > 0) {
			Static536.method7902(local47, local41, local17.aByteArray107, local53, this.aByteArray53, local39, local44, local55);
			this.method3815(arg2, local44, arg1, local47);
		}
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(IBILclient!r;)V")
	public void method3819(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class14_Sub2_Sub5 arg2) {
		@Pc(6) Class14_Sub2_Sub5_Sub2 local6 = (Class14_Sub2_Sub5_Sub2) arg2;
		arg0 += local6.anInt10655 + 1;
		arg1 += local6.anInt10650 + 1;
		@Pc(28) int local28 = arg1 + this.anInt4342 * arg0;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt10649;
		@Pc(36) int local36 = local6.anInt10658;
		@Pc(42) int local42 = this.anInt4342 - local36;
		@Pc(44) int local44 = 0;
		@Pc(53) int local53;
		if (arg0 <= 0) {
			local53 = 1 - arg0;
			local30 = local36 * local53;
			arg0 = 1;
			local33 -= local53;
			local28 += local53 * this.anInt4342;
		}
		if (this.anInt4345 <= arg0 + local33) {
			local53 = local33 + arg0 + 1 - this.anInt4345;
			local33 -= local53;
		}
		if (arg1 <= 0) {
			local53 = 1 - arg1;
			local28 += local53;
			local36 -= local53;
			local30 += local53;
			local44 = local53;
			arg1 = 1;
			local42 += local53;
		}
		if (this.anInt4342 <= local36 + arg1) {
			local53 = arg1 + local36 + 1 - this.anInt4342;
			local42 += local53;
			local44 += local53;
			local36 -= local53;
		}
		if (local36 > 0 && local33 > 0) {
			Static321.method5057(local36, local33, local42, local6.aByteArray107, local44, local28, this.aByteArray53, local30);
			this.method3815(arg1, local33, arg0, local36);
		}
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(IILclient!r;I)Z")
	public boolean method3820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class14_Sub2_Sub5 arg2) {
		@Pc(6) Class14_Sub2_Sub5_Sub2 local6 = (Class14_Sub2_Sub5_Sub2) arg2;
		arg0 += local6.anInt10650 + 1;
		arg1 += local6.anInt10655 + 1;
		@Pc(27) int local27 = this.anInt4342 * arg1 + arg0;
		@Pc(30) int local30 = local6.anInt10649;
		@Pc(33) int local33 = local6.anInt10658;
		@Pc(39) int local39 = this.anInt4342 - local33;
		@Pc(46) int local46;
		if (arg1 <= 0) {
			local46 = 1 - arg1;
			arg1 = 1;
			local27 += this.anInt4342 * local46;
			local30 -= local46;
		}
		if (local30 + arg1 >= this.anInt4345) {
			local46 = local30 + arg1 + 1 - this.anInt4345;
			local30 -= local46;
		}
		if (arg0 <= 0) {
			local46 = 1 - arg0;
			local39 += local46;
			local27 += local46;
			arg0 = 1;
			local33 -= local46;
		}
		if (this.anInt4342 <= local33 + arg0) {
			local46 = local33 + arg0 + 1 - this.anInt4342;
			local33 -= local46;
			local39 += local46;
		}
		if (local33 > 0 && local30 > 0) {
			local39 += this.anInt4342 * 7;
			return Static525.method7788(local39, this.aByteArray53, local30, local27, local33);
		} else {
			return false;
		}
	}
}
