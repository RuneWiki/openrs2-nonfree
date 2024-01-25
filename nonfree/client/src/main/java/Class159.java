import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class159 {

	@OriginalMember(owner = "client!m", name = "p", descriptor = "[[Lclient!fb;")
	private Class72[][] aClass72ArrayArray1;

	@OriginalMember(owner = "client!m", name = "k", descriptor = "Lclient!rl;")
	private final Class66_Sub2 aClass66_Sub2_22;

	@OriginalMember(owner = "client!m", name = "f", descriptor = "Lclient!gb;")
	private final Class86_Sub1 aClass86_Sub1_2;

	@OriginalMember(owner = "client!m", name = "n", descriptor = "I")
	public final int anInt4367;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "I")
	private final int anInt4356;

	@OriginalMember(owner = "client!m", name = "r", descriptor = "I")
	private final int anInt4369;

	@OriginalMember(owner = "client!m", name = "q", descriptor = "[B")
	public final byte[] aByteArray53;

	@OriginalMember(owner = "client!m", name = "o", descriptor = "I")
	private final int anInt4368;

	@OriginalMember(owner = "client!m", name = "h", descriptor = "I")
	private final int anInt4362;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!rl;Lclient!gb;)V")
	public Class159(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) Class86_Sub1 arg1) {
		this.aClass66_Sub2_22 = arg0;
		this.aClass86_Sub1_2 = arg1;
		this.anInt4367 = (this.aClass86_Sub1_2.anInt8047 * this.aClass86_Sub1_2.anInt8050 >> this.aClass66_Sub2_22.anInt6141) + 2;
		this.anInt4356 = (this.aClass86_Sub1_2.anInt8049 * this.aClass86_Sub1_2.anInt8050 >> this.aClass66_Sub2_22.anInt6141) + 2;
		this.anInt4369 = this.aClass66_Sub2_22.anInt6141 + 7 - this.aClass86_Sub1_2.anInt8051;
		this.aByteArray53 = new byte[this.anInt4356 * this.anInt4367];
		this.anInt4368 = this.aClass86_Sub1_2.anInt8047 >> this.anInt4369;
		this.anInt4362 = this.aClass86_Sub1_2.anInt8049 >> this.anInt4369;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Z[[ZIIII)V")
	public void method3668(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aClass66_Sub2_22.method5110(false);
		this.aClass66_Sub2_22.method5134(false);
		this.aClass66_Sub2_22.method5093(-2);
		this.aClass66_Sub2_22.method5140(1);
		this.aClass66_Sub2_22.method5078(1);
		@Pc(39) float local39 = 1.0F / (float) (this.aClass66_Sub2_22.anInt6142 * 128);
		@Pc(43) int local43;
		@Pc(50) int local50;
		@Pc(57) int local57;
		@Pc(59) int local59;
		@Pc(63) int local63;
		@Pc(68) int local68;
		@Pc(75) int local75;
		if (arg0) {
			for (local43 = 0; local43 < this.anInt4362; local43++) {
				local50 = local43 << this.anInt4369;
				local57 = local43 + 1 << this.anInt4369;
				label81: for (local59 = 0; local59 < this.anInt4368; local59++) {
					local63 = local59 << this.anInt4369;
					local68 = local59 + 1 << this.anInt4369;
					for (local75 = local63; local75 < local68; local75++) {
						if (-arg2 <= local75 - arg4 && arg2 >= local75 - arg4) {
							for (@Pc(323) int local323 = local50; local323 < local57; local323++) {
								if (local323 - arg3 >= -arg2 && local323 - arg3 <= arg2 && arg1[local75 + arg2 - arg4][local323 + arg2 - arg3]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local39, local39, 1.0F);
									OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass72ArrayArray1[local59][local43].method1847();
									continue label81;
								}
							}
						}
					}
				}
			}
		} else {
			for (local43 = 0; local43 < this.anInt4362; local43++) {
				local50 = local43 << this.anInt4369;
				local57 = local43 + 1 << this.anInt4369;
				for (local59 = 0; local59 < this.anInt4368; local59++) {
					local63 = 0;
					local68 = local59 << this.anInt4369;
					local75 = local59 + 1 << this.anInt4369;
					@Pc(77) Class6_Sub1 local77 = Static196.aClass6_Sub1_1;
					local77.anInt7898 = 0;
					for (@Pc(82) int local82 = local50; local82 < local57; local82++) {
						if (local82 - arg3 >= -arg2 && local82 - arg3 <= arg2) {
							@Pc(109) int local109 = local68 + this.aClass86_Sub1_2.anInt8047 * local82;
							for (@Pc(111) int local111 = local68; local111 < local75; local111++) {
								if (local111 - arg4 >= -arg2 && local111 - arg4 <= arg2 && arg1[local111 + arg2 - arg4][arg2 + local82 - arg3]) {
									@Pc(148) short[] local148 = this.aClass86_Sub1_2.aShortArrayArray6[local109];
									if (local148 != null) {
										@Pc(156) int local156;
										if (this.aClass66_Sub2_22.aBoolean373) {
											for (local156 = 0; local156 < local148.length; local156++) {
												local63++;
												local77.method6453(local148[local156] & 0xFFFF);
											}
										} else {
											for (local156 = 0; local156 < local148.length; local156++) {
												local63++;
												local77.method6480(local148[local156] & 0xFFFF);
											}
										}
									}
								}
								local109++;
							}
						}
					}
					if (local63 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local39, local39, 1.0F);
						OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass72ArrayArray1[local59][local43].method1846(local63, local77.aByteArray96);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZIILclient!ss;)V")
	public void method3669(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6_Sub2_Sub10 arg2) {
		@Pc(6) Class6_Sub2_Sub10_Sub1 local6 = (Class6_Sub2_Sub10_Sub1) arg2;
		arg0 += local6.anInt4269 + 1;
		arg1 += local6.anInt4265 + 1;
		@Pc(27) int local27 = arg0 * this.anInt4367 + arg1;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt4272;
		@Pc(35) int local35 = local6.anInt4262;
		@Pc(41) int local41 = this.anInt4367 - local35;
		@Pc(51) int local51;
		if (arg0 <= 0) {
			local51 = 1 - arg0;
			local32 -= local51;
			local29 = local35 * local51;
			arg0 = 1;
			local27 += local51 * this.anInt4367;
		}
		@Pc(83) int local83 = 0;
		if (local32 + arg0 >= this.anInt4356) {
			local51 = arg0 + local32 + 1 - this.anInt4356;
			local32 -= local51;
		}
		if (arg1 <= 0) {
			local51 = 1 - arg1;
			local41 += local51;
			local83 = local51;
			arg1 = 1;
			local35 -= local51;
			local27 += local51;
			local29 += local51;
		}
		if (this.anInt4367 <= arg1 + local35) {
			local51 = local35 + arg1 + 1 - this.anInt4367;
			local35 -= local51;
			local41 += local51;
			local83 += local51;
		}
		if (local35 > 0 && local32 > 0) {
			Static406.method6005(local35, local6.aByteArray51, this.aByteArray53, local29, local32, local41, local83, local27);
			this.method3675(local32, arg0, local35, arg1);
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
	public void method3670() {
		this.aClass72ArrayArray1 = new Class72[this.anInt4368][this.anInt4362];
		for (@Pc(14) int local14 = 0; local14 < this.anInt4362; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt4368; local18++) {
				this.aClass72ArrayArray1[local18][local14] = new Class72(this.aClass66_Sub2_22, this, this.aClass86_Sub1_2, local18, local14, this.anInt4369, local18 * 128 + 1, local14 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!ss;III)Z")
	public boolean method3673(@OriginalArg(0) Class6_Sub2_Sub10 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class6_Sub2_Sub10_Sub1 local6 = (Class6_Sub2_Sub10_Sub1) arg0;
		arg2 += local6.anInt4269 + 1;
		arg1 += local6.anInt4265 + 1;
		@Pc(27) int local27 = this.anInt4367 * arg2 + arg1;
		@Pc(30) int local30 = local6.anInt4272;
		@Pc(38) int local38 = local6.anInt4262;
		@Pc(48) int local48;
		if (arg2 <= 0) {
			local48 = 1 - arg2;
			arg2 = 1;
			local27 += this.anInt4367 * local48;
			local30 -= local48;
		}
		@Pc(67) int local67 = this.anInt4367 - local38;
		if (this.anInt4356 <= arg2 + local30) {
			local48 = local30 + arg2 + 1 - this.anInt4356;
			local30 -= local48;
		}
		if (arg1 <= 0) {
			local48 = 1 - arg1;
			local67 += local48;
			local38 -= local48;
			local27 += local48;
			arg1 = 1;
		}
		if (arg1 + local38 >= this.anInt4367) {
			local48 = local38 + arg1 + 1 - this.anInt4367;
			local67 += local48;
			local38 -= local48;
		}
		if (local38 > 0 && local30 > 0) {
			local67 += this.anInt4367 * 7;
			return Static26.method689(local38, local27, local67, local30, this.aByteArray53);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZLclient!ss;II)V")
	public void method3674(@OriginalArg(1) Class6_Sub2_Sub10 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class6_Sub2_Sub10_Sub1 local6 = (Class6_Sub2_Sub10_Sub1) arg0;
		arg2 += local6.anInt4265 + 1;
		arg1 += local6.anInt4269 + 1;
		@Pc(27) int local27 = this.anInt4367 * arg1 + arg2;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt4272;
		@Pc(35) int local35 = local6.anInt4262;
		@Pc(41) int local41 = this.anInt4367 - local35;
		@Pc(43) int local43 = 0;
		@Pc(50) int local50;
		if (arg1 <= 0) {
			local50 = 1 - arg1;
			local29 = local35 * local50;
			local27 += this.anInt4367 * local50;
			arg1 = 1;
			local32 -= local50;
		}
		if (this.anInt4356 <= local32 + arg1) {
			local50 = arg1 + local32 + 1 - this.anInt4356;
			local32 -= local50;
		}
		if (arg2 <= 0) {
			local50 = 1 - arg2;
			arg2 = 1;
			local35 -= local50;
			local41 += local50;
			local29 += local50;
			local43 = local50;
			local27 += local50;
		}
		if (this.anInt4367 <= arg2 + local35) {
			local50 = local35 + arg2 + 1 - this.anInt4367;
			local43 += local50;
			local35 -= local50;
			local41 += local50;
		}
		if (local35 > 0 && local32 > 0) {
			Static14.method389(local43, local41, local27, local35, this.aByteArray53, local29, local32, local6.aByteArray51);
			this.method3675(local32, arg1, local35, arg2);
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IBIII)V")
	private void method3675(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass72ArrayArray1 == null) {
			return;
		}
		@Pc(23) int local23 = arg3 - 1 >> 7;
		@Pc(33) int local33 = arg2 + arg3 - 1 - 1 >> 7;
		@Pc(39) int local39 = arg1 - 1 >> 7;
		@Pc(49) int local49 = arg0 + arg1 - 1 - 1 >> 7;
		for (@Pc(51) int local51 = local23; local51 <= local33; local51++) {
			@Pc(58) Class72[] local58 = this.aClass72ArrayArray1[local51];
			for (@Pc(60) int local60 = local39; local60 <= local49; local60++) {
				local58[local60].aBoolean153 = true;
			}
		}
	}
}
