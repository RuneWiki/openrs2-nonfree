import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wha")
public final class Class374 {

	@OriginalMember(owner = "client!wha", name = "f", descriptor = "[[Lclient!lg;")
	private Class189[][] aClass189ArrayArray1;

	@OriginalMember(owner = "client!wha", name = "c", descriptor = "Lclient!mh;")
	private final Class199_Sub2 aClass199_Sub2_3;

	@OriginalMember(owner = "client!wha", name = "q", descriptor = "Lclient!wh;")
	private final Class100_Sub3 aClass100_Sub3_42;

	@OriginalMember(owner = "client!wha", name = "d", descriptor = "I")
	public final int anInt10634;

	@OriginalMember(owner = "client!wha", name = "h", descriptor = "I")
	private final int anInt10637;

	@OriginalMember(owner = "client!wha", name = "i", descriptor = "[B")
	public final byte[] aByteArray124;

	@OriginalMember(owner = "client!wha", name = "n", descriptor = "I")
	private final int anInt10642;

	@OriginalMember(owner = "client!wha", name = "b", descriptor = "I")
	private final int anInt10633;

	@OriginalMember(owner = "client!wha", name = "e", descriptor = "I")
	private final int anInt10635;

	@OriginalMember(owner = "client!wha", name = "<init>", descriptor = "(Lclient!wh;Lclient!mh;)V")
	public Class374(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) Class199_Sub2 arg1) {
		this.aClass199_Sub2_3 = arg1;
		this.aClass100_Sub3_42 = arg0;
		this.anInt10634 = (this.aClass199_Sub2_3.anInt10111 * this.aClass199_Sub2_3.anInt10112 >> this.aClass100_Sub3_42.anInt10587) + 2;
		this.anInt10637 = (this.aClass199_Sub2_3.anInt10110 * this.aClass199_Sub2_3.anInt10112 >> this.aClass100_Sub3_42.anInt10587) + 2;
		this.aByteArray124 = new byte[this.anInt10637 * this.anInt10634];
		this.anInt10642 = this.aClass100_Sub3_42.anInt10587 + 7 - this.aClass199_Sub2_3.anInt10104;
		this.anInt10633 = this.aClass199_Sub2_3.anInt10111 >> this.anInt10642;
		this.anInt10635 = this.aClass199_Sub2_3.anInt10110 >> this.anInt10642;
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(IIIIB)V")
	private void method8942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass189ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg2 - 1 >> 7;
		@Pc(25) int local25 = arg0 + arg2 - 1 - 1 >> 7;
		@Pc(35) int local35 = arg1 - 1 >> 7;
		@Pc(45) int local45 = arg3 + arg1 - 1 - 1 >> 7;
		for (@Pc(47) int local47 = local15; local47 <= local25; local47++) {
			@Pc(54) Class189[] local54 = this.aClass189ArrayArray1[local47];
			for (@Pc(56) int local56 = local35; local56 <= local45; local56++) {
				local54[local56].aBoolean401 = true;
			}
		}
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(Lclient!r;III)V")
	public void method8943(@OriginalArg(0) Class6_Sub2_Sub16 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class6_Sub2_Sub16_Sub1 local6 = (Class6_Sub2_Sub16_Sub1) arg0;
		arg2 += local6.anInt7425 + 1;
		arg1 += local6.anInt7426 + 1;
		@Pc(27) int local27 = arg1 + arg2 * this.anInt10634;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt7424;
		@Pc(35) int local35 = local6.anInt7422;
		@Pc(41) int local41 = this.anInt10634 - local35;
		@Pc(47) int local47;
		if (arg2 <= 0) {
			local47 = 1 - arg2;
			arg2 = 1;
			local29 = local47 * local35;
			local27 += this.anInt10634 * local47;
			local32 -= local47;
		}
		@Pc(68) int local68 = 0;
		if (this.anInt10637 <= arg2 + local32) {
			local47 = arg2 + local32 + 1 - this.anInt10637;
			local32 -= local47;
		}
		if (arg1 <= 0) {
			local47 = 1 - arg1;
			local35 -= local47;
			local68 = local47;
			arg1 = 1;
			local27 += local47;
			local29 += local47;
			local41 += local47;
		}
		if (this.anInt10634 <= local35 + arg1) {
			local47 = local35 + arg1 + 1 - this.anInt10634;
			local35 -= local47;
			local41 += local47;
			local68 += local47;
		}
		if (local35 > 0 && local32 > 0) {
			Static61.method1085(this.aByteArray124, local41, local35, local27, local29, local32, local68, local6.aByteArray72);
			this.method8942(local35, arg2, arg1, local32);
		}
	}

	@OriginalMember(owner = "client!wha", name = "b", descriptor = "(Lclient!r;III)V")
	public void method8944(@OriginalArg(0) Class6_Sub2_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class6_Sub2_Sub16_Sub1 local12 = (Class6_Sub2_Sub16_Sub1) arg0;
		arg2 += local12.anInt7426 + 1;
		arg1 += local12.anInt7425 + 1;
		@Pc(33) int local33 = arg2 + arg1 * this.anInt10634;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = local12.anInt7424;
		@Pc(41) int local41 = local12.anInt7422;
		@Pc(47) int local47 = this.anInt10634 - local41;
		@Pc(49) int local49 = 0;
		@Pc(56) int local56;
		if (arg1 <= 0) {
			local56 = 1 - arg1;
			local38 -= local56;
			local35 = local56 * local41;
			local33 += local56 * this.anInt10634;
			arg1 = 1;
		}
		if (this.anInt10637 <= arg1 + local38) {
			local56 = local38 + arg1 + 1 - this.anInt10637;
			local38 -= local56;
		}
		if (arg2 <= 0) {
			local56 = 1 - arg2;
			local49 = local56;
			local41 -= local56;
			local35 += local56;
			local33 += local56;
			arg2 = 1;
			local47 += local56;
		}
		if (arg2 + local41 >= this.anInt10634) {
			local56 = local41 + arg2 + 1 - this.anInt10634;
			local41 -= local56;
			local47 += local56;
			local49 += local56;
		}
		if (local41 > 0 && local38 > 0) {
			Static388.method6216(this.aByteArray124, local12.aByteArray72, local49, local38, local35, local33, local47, local41);
			this.method8942(local41, arg1, arg2, local38);
		}
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(IILclient!r;I)Z")
	public boolean method8946(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub2_Sub16 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class6_Sub2_Sub16_Sub1 local6 = (Class6_Sub2_Sub16_Sub1) arg1;
		arg2 += local6.anInt7425 + 1;
		arg0 += local6.anInt7426 + 1;
		@Pc(27) int local27 = this.anInt10634 * arg2 + arg0;
		@Pc(30) int local30 = local6.anInt7424;
		@Pc(41) int local41 = local6.anInt7422;
		@Pc(47) int local47 = this.anInt10634 - local41;
		@Pc(56) int local56;
		if (arg2 <= 0) {
			local56 = 1 - arg2;
			local30 -= local56;
			local27 += this.anInt10634 * local56;
			arg2 = 1;
		}
		if (local30 + arg2 >= this.anInt10637) {
			local56 = local30 + arg2 + 1 - this.anInt10637;
			local30 -= local56;
		}
		if (arg0 <= 0) {
			local56 = 1 - arg0;
			local47 += local56;
			local41 -= local56;
			local27 += local56;
			arg0 = 1;
		}
		if (local41 + arg0 >= this.anInt10634) {
			local56 = arg0 + local41 + 1 - this.anInt10634;
			local41 -= local56;
			local47 += local56;
		}
		if (local41 > 0 && local30 > 0) {
			local47 += this.anInt10634 * 7;
			return Static363.method5758(local47, this.aByteArray124, local41, local30, local27);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(III[[ZZI)V")
	public void method8947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean[][] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		this.aClass100_Sub3_42.method8926(false);
		this.aClass100_Sub3_42.method8864(false);
		this.aClass100_Sub3_42.method8895(-2);
		this.aClass100_Sub3_42.method8903(1);
		this.aClass100_Sub3_42.method8876(1);
		@Pc(46) float local46 = 1.0F / (float) (this.aClass100_Sub3_42.anInt10586 * 128);
		@Pc(50) int local50;
		@Pc(57) int local57;
		@Pc(64) int local64;
		@Pc(66) int local66;
		@Pc(70) int local70;
		@Pc(75) int local75;
		@Pc(82) int local82;
		if (arg3) {
			for (local50 = 0; local50 < this.anInt10635; local50++) {
				local57 = local50 << this.anInt10642;
				local64 = local50 + 1 << this.anInt10642;
				label81: for (local66 = 0; local66 < this.anInt10633; local66++) {
					local70 = local66 << this.anInt10642;
					local75 = local66 + 1 << this.anInt10642;
					for (local82 = local70; local82 < local75; local82++) {
						if (-arg0 <= local82 - arg1 && local82 - arg1 <= arg0) {
							for (@Pc(318) int local318 = local57; local318 < local64; local318++) {
								if (-arg0 <= local318 - arg4 && arg0 >= local318 - arg4 && arg2[arg0 + local82 - arg1][local318 + arg0 - arg4]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local46, local46, 1.0F);
									OpenGL.glTranslatef((float) -local66 / local46, (float) -local50 / local46, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass189ArrayArray1[local66][local50].method5239();
									continue label81;
								}
							}
						}
					}
				}
			}
		} else {
			for (local50 = 0; local50 < this.anInt10635; local50++) {
				local57 = local50 << this.anInt10642;
				local64 = local50 + 1 << this.anInt10642;
				for (local66 = 0; local66 < this.anInt10633; local66++) {
					local70 = 0;
					local75 = local66 << this.anInt10642;
					local82 = local66 + 1 << this.anInt10642;
					@Pc(86) Class6_Sub40_Sub1 local86 = this.aClass100_Sub3_42.aClass6_Sub40_Sub1_3;
					local86.anInt10169 = 0;
					for (@Pc(91) int local91 = local57; local91 < local64; local91++) {
						if (-arg0 <= local91 - arg4 && arg0 >= local91 - arg4) {
							@Pc(113) int local113 = local75 + local91 * this.aClass199_Sub2_3.anInt10111;
							for (@Pc(115) int local115 = local75; local115 < local82; local115++) {
								if (local115 - arg1 >= -arg0 && arg0 >= local115 - arg1 && arg2[local115 + arg0 - arg1][arg0 + local91 - arg4]) {
									@Pc(156) short[] local156 = this.aClass199_Sub2_3.aShortArrayArray9[local113];
									if (local156 != null) {
										@Pc(164) int local164;
										if (this.aClass100_Sub3_42.aBoolean700) {
											for (local164 = 0; local164 < local156.length; local164++) {
												local86.method8561(local156[local164] & 0xFFFF);
												local70++;
											}
										} else {
											for (local164 = 0; local164 < local156.length; local164++) {
												local70++;
												local86.method8617(local156[local164] & 0xFFFF);
											}
										}
									}
								}
								local113++;
							}
						}
					}
					if (local70 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local46, local46, 1.0F);
						OpenGL.glTranslatef((float) -local66 / local46, (float) -local50 / local46, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass189ArrayArray1[local66][local50].method5237(local70, local86.aByteArray113);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(B)V")
	public void method8948() {
		this.aClass189ArrayArray1 = new Class189[this.anInt10633][this.anInt10635];
		for (@Pc(20) int local20 = 0; local20 < this.anInt10635; local20++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt10633; local24++) {
				this.aClass189ArrayArray1[local24][local20] = new Class189(this.aClass100_Sub3_42, this, this.aClass199_Sub2_3, local24, local20, this.anInt10642, local24 * 128 + 1, local20 * 128 + 1);
			}
		}
	}
}
