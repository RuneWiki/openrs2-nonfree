import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class166 {

	@OriginalMember(owner = "client!k", name = "g", descriptor = "[[Lclient!mu;")
	private Class211[][] aClass211ArrayArray1;

	@OriginalMember(owner = "client!k", name = "e", descriptor = "Lclient!rk;")
	private final Class59_Sub3 aClass59_Sub3_1;

	@OriginalMember(owner = "client!k", name = "b", descriptor = "Lclient!jaa;")
	private final Class14_Sub3 aClass14_Sub3_22;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "I")
	public final int anInt4900;

	@OriginalMember(owner = "client!k", name = "o", descriptor = "I")
	private final int anInt4910;

	@OriginalMember(owner = "client!k", name = "d", descriptor = "I")
	private final int anInt4902;

	@OriginalMember(owner = "client!k", name = "l", descriptor = "[B")
	public final byte[] aByteArray57;

	@OriginalMember(owner = "client!k", name = "j", descriptor = "I")
	private final int anInt4906;

	@OriginalMember(owner = "client!k", name = "h", descriptor = "I")
	private final int anInt4904;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lclient!jaa;Lclient!rk;)V")
	public Class166(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) Class59_Sub3 arg1) {
		this.aClass59_Sub3_1 = arg1;
		this.aClass14_Sub3_22 = arg0;
		this.anInt4900 = (this.aClass59_Sub3_1.anInt9640 * this.aClass59_Sub3_1.anInt9641 >> this.aClass14_Sub3_22.anInt4556) + 2;
		this.anInt4910 = (this.aClass59_Sub3_1.anInt9639 * this.aClass59_Sub3_1.anInt9641 >> this.aClass14_Sub3_22.anInt4556) + 2;
		this.anInt4902 = this.aClass14_Sub3_22.anInt4556 + 7 - this.aClass59_Sub3_1.anInt9638;
		this.aByteArray57 = new byte[this.anInt4910 * this.anInt4900];
		this.anInt4906 = this.aClass59_Sub3_1.anInt9640 >> this.anInt4902;
		this.anInt4904 = this.aClass59_Sub3_1.anInt9639 >> this.anInt4902;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IILclient!w;B)V")
	public void method4240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub2_Sub14 arg2) {
		@Pc(6) Class6_Sub2_Sub14_Sub2 local6 = (Class6_Sub2_Sub14_Sub2) arg2;
		arg1 += local6.anInt9053 + 1;
		arg0 += local6.anInt9058 + 1;
		@Pc(27) int local27 = this.anInt4900 * arg1 + arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt9052;
		@Pc(35) int local35 = local6.anInt9051;
		@Pc(49) int local49 = this.anInt4900 - local35;
		@Pc(51) int local51 = 0;
		@Pc(58) int local58;
		if (arg1 <= 0) {
			local58 = 1 - arg1;
			local29 = local35 * local58;
			local32 -= local58;
			arg1 = 1;
			local27 += this.anInt4900 * local58;
		}
		if (local32 + arg1 >= this.anInt4910) {
			local58 = local32 + arg1 + 1 - this.anInt4910;
			local32 -= local58;
		}
		if (arg0 <= 0) {
			local58 = 1 - arg0;
			local29 += local58;
			local35 -= local58;
			arg0 = 1;
			local49 += local58;
			local27 += local58;
			local51 = local58;
		}
		if (local35 + arg0 >= this.anInt4900) {
			local58 = arg0 + local35 + 1 - this.anInt4900;
			local51 += local58;
			local49 += local58;
			local35 -= local58;
		}
		if (local35 > 0 && local32 > 0) {
			Static115.method2015(local35, this.aByteArray57, local32, local51, local6.aByteArray114, local27, local29, local49);
			this.method4246(arg0, local32, arg1, local35);
		}
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V")
	public void method4242() {
		this.aClass211ArrayArray1 = new Class211[this.anInt4906][this.anInt4904];
		for (@Pc(22) int local22 = 0; local22 < this.anInt4904; local22++) {
			for (@Pc(26) int local26 = 0; local26 < this.anInt4906; local26++) {
				this.aClass211ArrayArray1[local26][local22] = new Class211(this.aClass14_Sub3_22, this, this.aClass59_Sub3_1, local26, local22, this.anInt4902, local26 * 128 + 1, local22 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ZI[[ZIII)V")
	public void method4244(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.aClass14_Sub3_22.method3921(false);
		this.aClass14_Sub3_22.method3965(false);
		this.aClass14_Sub3_22.method3962(-2);
		this.aClass14_Sub3_22.method3925(1);
		this.aClass14_Sub3_22.method3937(1);
		@Pc(41) float local41 = 1.0F / (float) (this.aClass14_Sub3_22.anInt4555 * 128);
		@Pc(45) int local45;
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(61) int local61;
		@Pc(68) int local68;
		@Pc(75) int local75;
		@Pc(77) int local77;
		if (arg0) {
			for (local45 = 0; local45 < this.anInt4904; local45++) {
				local52 = local45 << this.anInt4902;
				local59 = local45 + 1 << this.anInt4902;
				label128: for (local61 = 0; local61 < this.anInt4906; local61++) {
					local68 = local61 << this.anInt4902;
					local75 = local61 + 1 << this.anInt4902;
					for (local77 = local68; local77 < local75; local77++) {
						if (local77 - arg4 >= -arg3 && arg3 >= local77 - arg4) {
							for (@Pc(97) int local97 = local52; local97 < local59; local97++) {
								if (-arg3 <= local97 - arg1 && arg3 >= local97 - arg1 && arg2[local77 + arg3 - arg4][local97 + arg3 - arg1]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local41, local41, 1.0F);
									OpenGL.glTranslatef((float) -local61 / local41, (float) -local45 / local41, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass211ArrayArray1[local61][local45].method5115();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local45 = 0; local45 < this.anInt4904; local45++) {
				local52 = local45 << this.anInt4902;
				local59 = local45 + 1 << this.anInt4902;
				for (local61 = 0; local61 < this.anInt4906; local61++) {
					local68 = 0;
					local75 = local61 << this.anInt4902;
					local77 = local61 + 1 << this.anInt4902;
					@Pc(229) Class6_Sub21_Sub1 local229 = this.aClass14_Sub3_22.aClass6_Sub21_Sub1_1;
					local229.anInt7338 = 0;
					for (@Pc(234) int local234 = local52; local234 < local59; local234++) {
						if (-arg3 <= local234 - arg1 && arg3 >= local234 - arg1) {
							@Pc(257) int local257 = this.aClass59_Sub3_1.anInt9640 * local234 + local75;
							for (@Pc(259) int local259 = local75; local259 < local77; local259++) {
								if (-arg3 <= local259 - arg4 && local259 - arg4 <= arg3 && arg2[arg3 + local259 - arg4][local234 + arg3 - arg1]) {
									@Pc(296) short[] local296 = this.aClass59_Sub3_1.aShortArrayArray9[local257];
									if (local296 != null) {
										@Pc(304) int local304;
										if (this.aClass14_Sub3_22.aBoolean298) {
											for (local304 = 0; local304 < local296.length; local304++) {
												local68++;
												local229.method6052(local296[local304] & 0xFFFF);
											}
										} else {
											for (local304 = 0; local304 < local296.length; local304++) {
												local229.method6032(local296[local304] & 0xFFFF);
												local68++;
											}
										}
									}
								}
								local257++;
							}
						}
					}
					if (local68 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local41, local41, 1.0F);
						OpenGL.glTranslatef((float) -local61 / local41, (float) -local45 / local41, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass211ArrayArray1[local61][local45].method5112(local229.aByteArray93, local68);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IBILclient!w;)V")
	public void method4245(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6_Sub2_Sub14 arg2) {
		@Pc(6) Class6_Sub2_Sub14_Sub2 local6 = (Class6_Sub2_Sub14_Sub2) arg2;
		arg1 += local6.anInt9058 + 1;
		arg0 += local6.anInt9053 + 1;
		@Pc(27) int local27 = arg1 + this.anInt4900 * arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt9052;
		@Pc(35) int local35 = local6.anInt9051;
		@Pc(41) int local41 = this.anInt4900 - local35;
		@Pc(43) int local43 = 0;
		@Pc(50) int local50;
		if (arg0 <= 0) {
			local50 = 1 - arg0;
			local27 += local50 * this.anInt4900;
			local32 -= local50;
			local29 = local35 * local50;
			arg0 = 1;
		}
		if (arg0 + local32 >= this.anInt4910) {
			local50 = local32 + arg0 + 1 - this.anInt4910;
			local32 -= local50;
		}
		if (arg1 <= 0) {
			local50 = 1 - arg1;
			local43 = local50;
			local41 += local50;
			arg1 = 1;
			local27 += local50;
			local29 += local50;
			local35 -= local50;
		}
		if (this.anInt4900 <= arg1 + local35) {
			local50 = local35 + arg1 + 1 - this.anInt4900;
			local43 += local50;
			local35 -= local50;
			local41 += local50;
		}
		if (local35 > 0 && local32 > 0) {
			Static264.method4420(local27, this.aByteArray57, local35, local41, local6.aByteArray114, local43, local32, local29);
			this.method4246(arg1, local32, arg0, local35);
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIB)V")
	private void method4246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass211ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg0 - 1 >> 7;
		@Pc(31) int local31 = arg3 + arg0 - 1 - 1 >> 7;
		@Pc(37) int local37 = arg2 - 1 >> 7;
		@Pc(45) int local45 = arg1 + arg2 - 2 >> 7;
		for (@Pc(47) int local47 = local15; local47 <= local31; local47++) {
			@Pc(54) Class211[] local54 = this.aClass211ArrayArray1[local47];
			for (@Pc(56) int local56 = local37; local56 <= local45; local56++) {
				local54[local56].aBoolean418 = true;
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILclient!w;II)Z")
	public boolean method4247(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub2_Sub14 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class6_Sub2_Sub14_Sub2 local6 = (Class6_Sub2_Sub14_Sub2) arg1;
		arg0 += local6.anInt9058 + 1;
		arg2 += local6.anInt9053 + 1;
		@Pc(27) int local27 = arg2 * this.anInt4900 + arg0;
		@Pc(30) int local30 = local6.anInt9052;
		@Pc(33) int local33 = local6.anInt9051;
		@Pc(39) int local39 = this.anInt4900 - local33;
		@Pc(46) int local46;
		if (arg2 <= 0) {
			local46 = 1 - arg2;
			local30 -= local46;
			local27 += this.anInt4900 * local46;
			arg2 = 1;
		}
		if (local30 + arg2 >= this.anInt4910) {
			local46 = local30 + arg2 + 1 - this.anInt4910;
			local30 -= local46;
		}
		if (arg0 <= 0) {
			local46 = 1 - arg0;
			arg0 = 1;
			local27 += local46;
			local39 += local46;
			local33 -= local46;
		}
		if (this.anInt4900 <= arg0 + local33) {
			local46 = arg0 + local33 + 1 - this.anInt4900;
			local39 += local46;
			local33 -= local46;
		}
		if (local33 > 0 && local30 > 0) {
			local39 += this.anInt4900 * 7;
			return Static400.method5856(local27, local33, local39, this.aByteArray57, local30);
		} else {
			return false;
		}
	}
}
