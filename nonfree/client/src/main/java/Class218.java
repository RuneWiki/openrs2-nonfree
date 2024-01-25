import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public final class Class218 {

	@OriginalMember(owner = "client!mw", name = "i", descriptor = "[[Lclient!ah;")
	private Class12[][] aClass12ArrayArray1;

	@OriginalMember(owner = "client!mw", name = "c", descriptor = "Lclient!mh;")
	private final Class62_Sub2 aClass62_Sub2_1;

	@OriginalMember(owner = "client!mw", name = "g", descriptor = "Lclient!ap;")
	private final Class9_Sub2 aClass9_Sub2_23;

	@OriginalMember(owner = "client!mw", name = "k", descriptor = "I")
	public final int anInt6200;

	@OriginalMember(owner = "client!mw", name = "r", descriptor = "I")
	private final int anInt6205;

	@OriginalMember(owner = "client!mw", name = "j", descriptor = "[B")
	public final byte[] aByteArray72;

	@OriginalMember(owner = "client!mw", name = "d", descriptor = "I")
	private final int anInt6197;

	@OriginalMember(owner = "client!mw", name = "m", descriptor = "I")
	private final int anInt6202;

	@OriginalMember(owner = "client!mw", name = "e", descriptor = "I")
	private final int anInt6198;

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lclient!ap;Lclient!mh;)V")
	public Class218(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) Class62_Sub2 arg1) {
		this.aClass62_Sub2_1 = arg1;
		this.aClass9_Sub2_23 = arg0;
		this.anInt6200 = (this.aClass62_Sub2_1.anInt9881 * this.aClass62_Sub2_1.anInt9884 >> this.aClass9_Sub2_23.anInt811) + 2;
		this.anInt6205 = (this.aClass62_Sub2_1.anInt9884 * this.aClass62_Sub2_1.anInt9885 >> this.aClass9_Sub2_23.anInt811) + 2;
		this.aByteArray72 = new byte[this.anInt6200 * this.anInt6205];
		this.anInt6197 = this.aClass9_Sub2_23.anInt811 + 7 - this.aClass62_Sub2_1.anInt9883;
		this.anInt6202 = this.aClass62_Sub2_1.anInt9881 >> this.anInt6197;
		this.anInt6198 = this.aClass62_Sub2_1.anInt9885 >> this.anInt6197;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)V")
	public void method5294() {
		this.aClass12ArrayArray1 = new Class12[this.anInt6202][this.anInt6198];
		for (@Pc(23) int local23 = 0; local23 < this.anInt6198; local23++) {
			for (@Pc(27) int local27 = 0; local27 < this.anInt6202; local27++) {
				this.aClass12ArrayArray1[local27][local23] = new Class12(this.aClass9_Sub2_23, this, this.aClass62_Sub2_1, local27, local23, this.anInt6197, local27 * 128 + 1, local23 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lclient!w;III)Z")
	public boolean method5295(@OriginalArg(0) Class6_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class6_Sub4_Sub2_Sub1 local6 = (Class6_Sub4_Sub2_Sub1) arg0;
		arg1 += local6.anInt1438 + 1;
		arg2 += local6.anInt1437 + 1;
		@Pc(27) int local27 = arg2 * this.anInt6200 + arg1;
		@Pc(30) int local30 = local6.anInt1434;
		@Pc(33) int local33 = local6.anInt1433;
		@Pc(39) int local39;
		if (arg2 <= 0) {
			local39 = 1 - arg2;
			local27 += local39 * this.anInt6200;
			local30 -= local39;
			arg2 = 1;
		}
		@Pc(57) int local57 = this.anInt6200 - local33;
		if (this.anInt6205 <= local30 + arg2) {
			local39 = arg2 + local30 + 1 - this.anInt6205;
			local30 -= local39;
		}
		if (arg1 <= 0) {
			local39 = 1 - arg1;
			arg1 = 1;
			local27 += local39;
			local33 -= local39;
			local57 += local39;
		}
		if (local33 + arg1 >= this.anInt6200) {
			local39 = local33 + arg1 + 1 - this.anInt6200;
			local33 -= local39;
			local57 += local39;
		}
		if (local33 > 0 && local30 > 0) {
			local57 += this.anInt6200 * 7;
			return Static532.method7734(local30, this.aByteArray72, local57, local27, local33);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IILclient!w;I)V")
	public void method5296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub4_Sub2 arg2) {
		@Pc(12) Class6_Sub4_Sub2_Sub1 local12 = (Class6_Sub4_Sub2_Sub1) arg2;
		arg1 += local12.anInt1438 + 1;
		arg0 += local12.anInt1437 + 1;
		@Pc(33) int local33 = this.anInt6200 * arg0 + arg1;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = local12.anInt1434;
		@Pc(41) int local41 = local12.anInt1433;
		@Pc(47) int local47 = this.anInt6200 - local41;
		@Pc(49) int local49 = 0;
		@Pc(59) int local59;
		if (arg0 <= 0) {
			local59 = 1 - arg0;
			arg0 = 1;
			local38 -= local59;
			local33 += local59 * this.anInt6200;
			local35 = local59 * local41;
		}
		if (this.anInt6205 <= local38 + arg0) {
			local59 = local38 + arg0 + 1 - this.anInt6205;
			local38 -= local59;
		}
		if (arg1 <= 0) {
			local59 = 1 - arg1;
			local41 -= local59;
			local35 += local59;
			local49 = local59;
			arg1 = 1;
			local47 += local59;
			local33 += local59;
		}
		if (local41 + arg1 >= this.anInt6200) {
			local59 = local41 + arg1 + 1 - this.anInt6200;
			local41 -= local59;
			local49 += local59;
			local47 += local59;
		}
		if (local41 > 0 && local38 > 0) {
			Static515.method7174(local33, local35, local47, local41, local38, local12.aByteArray34, this.aByteArray72, local49);
			this.method5299(arg0, local38, arg1, local41);
		}
	}

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "(IILclient!w;I)V")
	public void method5297(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub4_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class6_Sub4_Sub2_Sub1 local6 = (Class6_Sub4_Sub2_Sub1) arg1;
		arg2 += local6.anInt1437 + 1;
		arg0 += local6.anInt1438 + 1;
		@Pc(27) int local27 = this.anInt6200 * arg2 + arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt1434;
		@Pc(35) int local35 = local6.anInt1433;
		@Pc(40) int local40 = this.anInt6200 - local35;
		if (arg2 <= 0) {
			@Pc(47) int local47 = 1 - arg2;
			local27 += this.anInt6200 * local47;
			local32 -= local47;
			local29 = local47 * local35;
			arg2 = 1;
		}
		@Pc(76) int local76 = 0;
		@Pc(96) int local96;
		if (arg2 + local32 >= this.anInt6205) {
			local96 = local32 + arg2 + 1 - this.anInt6205;
			local32 -= local96;
		}
		if (arg0 <= 0) {
			local96 = 1 - arg0;
			arg0 = 1;
			local29 += local96;
			local76 = local96;
			local27 += local96;
			local40 += local96;
			local35 -= local96;
		}
		if (this.anInt6200 <= arg0 + local35) {
			local96 = local35 + arg0 + 1 - this.anInt6200;
			local76 += local96;
			local35 -= local96;
			local40 += local96;
		}
		if (local35 > 0 && local32 > 0) {
			Static232.method4111(this.aByteArray72, local6.aByteArray34, local76, local35, local29, local32, local40, local27);
			this.method5299(arg2, local32, arg0, local35);
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIIII)V")
	private void method5299(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass12ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg2 - 1 >> 7;
		@Pc(23) int local23 = arg2 + arg3 - 2 >> 7;
		@Pc(29) int local29 = arg0 - 1 >> 7;
		@Pc(43) int local43 = arg1 + arg0 - 1 - 1 >> 7;
		for (@Pc(45) int local45 = local15; local45 <= local23; local45++) {
			@Pc(52) Class12[] local52 = this.aClass12ArrayArray1[local45];
			for (@Pc(54) int local54 = local29; local54 <= local43; local54++) {
				local52[local54].aBoolean32 = true;
			}
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIZII[[Z)V")
	public void method5300(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean[][] arg4) {
		this.aClass9_Sub2_23.method826(false);
		this.aClass9_Sub2_23.method808(false);
		this.aClass9_Sub2_23.method747(-2);
		this.aClass9_Sub2_23.method822(1);
		this.aClass9_Sub2_23.method804(1);
		@Pc(49) float local49 = 1.0F / (float) (this.aClass9_Sub2_23.anInt809 * 128);
		@Pc(53) int local53;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(69) int local69;
		@Pc(76) int local76;
		@Pc(83) int local83;
		@Pc(85) int local85;
		if (arg1) {
			for (local53 = 0; local53 < this.anInt6198; local53++) {
				local60 = local53 << this.anInt6197;
				local67 = local53 + 1 << this.anInt6197;
				label128: for (local69 = 0; local69 < this.anInt6202; local69++) {
					local76 = local69 << this.anInt6197;
					local83 = local69 + 1 << this.anInt6197;
					for (local85 = local76; local85 < local83; local85++) {
						if (-arg3 <= local85 - arg0 && arg3 >= local85 - arg0) {
							for (@Pc(106) int local106 = local60; local106 < local67; local106++) {
								if (-arg3 <= local106 - arg2 && arg3 >= local106 - arg2 && arg4[local85 + arg3 - arg0][local106 + arg3 - arg2]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local49, local49, 1.0F);
									OpenGL.glTranslatef((float) -local69 / local49, (float) -local53 / local49, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass12ArrayArray1[local69][local53].method622();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local53 = 0; local53 < this.anInt6198; local53++) {
				local60 = local53 << this.anInt6197;
				local67 = local53 + 1 << this.anInt6197;
				for (local69 = 0; local69 < this.anInt6202; local69++) {
					local76 = 0;
					local83 = local69 << this.anInt6197;
					local85 = local69 + 1 << this.anInt6197;
					@Pc(244) Class6_Sub26_Sub1 local244 = this.aClass9_Sub2_23.aClass6_Sub26_Sub1_1;
					local244.anInt5769 = 0;
					for (@Pc(249) int local249 = local60; local249 < local67; local249++) {
						if (-arg3 <= local249 - arg2 && local249 - arg2 <= arg3) {
							@Pc(276) int local276 = local83 + this.aClass62_Sub2_1.anInt9881 * local249;
							for (@Pc(278) int local278 = local83; local278 < local85; local278++) {
								if (-arg3 <= local278 - arg0 && arg3 >= local278 - arg0 && arg4[arg3 + local278 - arg0][local249 + arg3 - arg2]) {
									@Pc(315) short[] local315 = this.aClass62_Sub2_1.aShortArrayArray5[local276];
									if (local315 != null) {
										@Pc(323) int local323;
										if (this.aClass9_Sub2_23.aBoolean65) {
											for (local323 = 0; local323 < local315.length; local323++) {
												local76++;
												local244.method4962(local315[local323] & 0xFFFF);
											}
										} else {
											for (local323 = 0; local323 < local315.length; local323++) {
												local244.method4993(local315[local323] & 0xFFFF);
												local76++;
											}
										}
									}
								}
								local276++;
							}
						}
					}
					if (local76 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local49, local49, 1.0F);
						OpenGL.glTranslatef((float) -local69 / local49, (float) -local53 / local49, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass12ArrayArray1[local69][local53].method620(local76, local244.aByteArray65);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}
}
