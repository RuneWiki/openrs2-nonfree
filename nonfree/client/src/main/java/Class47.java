import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class47 {

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "[[Lclient!df;")
	private Class60[][] aClass60ArrayArray1;

	@OriginalMember(owner = "client!cg", name = "i", descriptor = "Lclient!ac;")
	private final Class5_Sub1 aClass5_Sub1_10;

	@OriginalMember(owner = "client!cg", name = "l", descriptor = "Lclient!ok;")
	private final Class245_Sub1 aClass245_Sub1_1;

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
	public final int anInt2312;

	@OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
	private final int anInt2319;

	@OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
	private final int anInt2317;

	@OriginalMember(owner = "client!cg", name = "n", descriptor = "[B")
	public final byte[] aByteArray12;

	@OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
	private final int anInt2320;

	@OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
	private final int anInt2315;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lclient!ac;Lclient!ok;)V")
	public Class47(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) Class245_Sub1 arg1) {
		this.aClass5_Sub1_10 = arg0;
		this.aClass245_Sub1_1 = arg1;
		this.anInt2312 = (this.aClass245_Sub1_1.anInt9291 * this.aClass245_Sub1_1.anInt9289 >> this.aClass5_Sub1_10.anInt360) + 2;
		this.anInt2319 = (this.aClass245_Sub1_1.anInt9290 * this.aClass245_Sub1_1.anInt9291 >> this.aClass5_Sub1_10.anInt360) + 2;
		this.anInt2317 = this.aClass5_Sub1_10.anInt360 + 7 - this.aClass245_Sub1_1.anInt9286;
		this.aByteArray12 = new byte[this.anInt2312 * this.anInt2319];
		this.anInt2320 = this.aClass245_Sub1_1.anInt9289 >> this.anInt2317;
		this.anInt2315 = this.aClass245_Sub1_1.anInt9290 >> this.anInt2317;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZII[[ZBI)V")
	public void method2010(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(5) int arg4) {
		this.aClass5_Sub1_10.method340(false);
		this.aClass5_Sub1_10.method364(false);
		this.aClass5_Sub1_10.method323(-2);
		this.aClass5_Sub1_10.method385(1);
		this.aClass5_Sub1_10.method359(1);
		@Pc(43) float local43 = 1.0F / (float) (this.aClass5_Sub1_10.anInt359 * 128);
		@Pc(47) int local47;
		@Pc(54) int local54;
		@Pc(61) int local61;
		@Pc(63) int local63;
		@Pc(67) int local67;
		@Pc(72) int local72;
		@Pc(79) int local79;
		if (arg0) {
			for (local47 = 0; local47 < this.anInt2315; local47++) {
				local54 = local47 << this.anInt2317;
				local61 = local47 + 1 << this.anInt2317;
				label81: for (local63 = 0; local63 < this.anInt2320; local63++) {
					local67 = local63 << this.anInt2317;
					local72 = local63 + 1 << this.anInt2317;
					for (local79 = local67; local79 < local72; local79++) {
						if (local79 - arg2 >= -arg1 && arg1 >= local79 - arg2) {
							for (@Pc(333) int local333 = local54; local333 < local61; local333++) {
								if (local333 - arg4 >= -arg1 && arg1 >= local333 - arg4 && arg3[arg1 + local79 - arg2][arg1 + local333 - arg4]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local43, local43, 1.0F);
									OpenGL.glTranslatef((float) -local63 / local43, (float) -local47 / local43, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass60ArrayArray1[local63][local47].method2329();
									continue label81;
								}
							}
						}
					}
				}
			}
		} else {
			for (local47 = 0; local47 < this.anInt2315; local47++) {
				local54 = local47 << this.anInt2317;
				local61 = local47 + 1 << this.anInt2317;
				for (local63 = 0; local63 < this.anInt2320; local63++) {
					local67 = 0;
					local72 = local63 << this.anInt2317;
					local79 = local63 + 1 << this.anInt2317;
					@Pc(83) Class6_Sub8_Sub2 local83 = this.aClass5_Sub1_10.aClass6_Sub8_Sub2_1;
					local83.anInt10061 = 0;
					for (@Pc(88) int local88 = local54; local88 < local61; local88++) {
						if (local88 - arg4 >= -arg1 && local88 - arg4 <= arg1) {
							@Pc(113) int local113 = local72 + local88 * this.aClass245_Sub1_1.anInt9289;
							for (@Pc(115) int local115 = local72; local115 < local79; local115++) {
								if (-arg1 <= local115 - arg2 && local115 - arg2 <= arg1 && arg3[local115 + arg1 - arg2][arg1 + local88 - arg4]) {
									@Pc(156) short[] local156 = this.aClass245_Sub1_1.aShortArrayArray24[local113];
									if (local156 != null) {
										@Pc(164) int local164;
										if (this.aClass5_Sub1_10.aBoolean24) {
											for (local164 = 0; local164 < local156.length; local164++) {
												local67++;
												local83.method8241(local156[local164] & 0xFFFF);
											}
										} else {
											for (local164 = 0; local164 < local156.length; local164++) {
												local67++;
												local83.method8264(local156[local164] & 0xFFFF);
											}
										}
									}
								}
								local113++;
							}
						}
					}
					if (local67 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local43, local43, 1.0F);
						OpenGL.glTranslatef((float) -local63 / local43, (float) -local47 / local43, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass60ArrayArray1[local63][local47].method2330(local67, local83.aByteArray102);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
	public void method2011() {
		this.aClass60ArrayArray1 = new Class60[this.anInt2320][this.anInt2315];
		for (@Pc(14) int local14 = 0; local14 < this.anInt2315; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt2320; local18++) {
				this.aClass60ArrayArray1[local18][local14] = new Class60(this.aClass5_Sub1_10, this, this.aClass245_Sub1_1, local18, local14, this.anInt2317, local18 * 128 + 1, local14 * 128 - -1);
			}
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIZLclient!r;)V")
	public void method2012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class6_Sub5_Sub10 arg2) {
		@Pc(6) Class6_Sub5_Sub10_Sub1 local6 = (Class6_Sub5_Sub10_Sub1) arg2;
		arg1 += local6.anInt3265 + 1;
		arg0 += local6.anInt3260 + 1;
		@Pc(27) int local27 = this.anInt2312 * arg0 + arg1;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt3266;
		@Pc(35) int local35 = local6.anInt3264;
		@Pc(41) int local41 = this.anInt2312 - local35;
		@Pc(43) int local43 = 0;
		@Pc(50) int local50;
		if (arg0 <= 0) {
			local50 = 1 - arg0;
			local32 -= local50;
			arg0 = 1;
			local27 += local50 * this.anInt2312;
			local29 = local35 * local50;
		}
		if (this.anInt2319 <= local32 + arg0) {
			local50 = arg0 + local32 + 1 - this.anInt2319;
			local32 -= local50;
		}
		if (arg1 <= 0) {
			local50 = 1 - arg1;
			local35 -= local50;
			local27 += local50;
			local43 = local50;
			local29 += local50;
			arg1 = 1;
			local41 += local50;
		}
		if (arg1 + local35 >= this.anInt2312) {
			local50 = arg1 + local35 + 1 - this.anInt2312;
			local35 -= local50;
			local41 += local50;
			local43 += local50;
		}
		if (local35 > 0 && local32 > 0) {
			Static350.method5734(local32, local27, local29, local6.aByteArray19, this.aByteArray12, local43, local41, local35);
			this.method2016(local32, local35, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BIILclient!r;)V")
	public void method2014(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6_Sub5_Sub10 arg2) {
		@Pc(11) Class6_Sub5_Sub10_Sub1 local11 = (Class6_Sub5_Sub10_Sub1) arg2;
		arg1 += local11.anInt3265 + 1;
		arg0 += local11.anInt3260 + 1;
		@Pc(32) int local32 = arg1 + this.anInt2312 * arg0;
		@Pc(34) int local34 = 0;
		@Pc(37) int local37 = local11.anInt3266;
		@Pc(40) int local40 = local11.anInt3264;
		@Pc(46) int local46 = this.anInt2312 - local40;
		@Pc(48) int local48 = 0;
		@Pc(57) int local57;
		if (arg0 <= 0) {
			local57 = 1 - arg0;
			local34 = local40 * local57;
			arg0 = 1;
			local37 -= local57;
			local32 += this.anInt2312 * local57;
		}
		if (local37 + arg0 >= this.anInt2319) {
			local57 = local37 + arg0 + 1 - this.anInt2319;
			local37 -= local57;
		}
		if (arg1 <= 0) {
			local57 = 1 - arg1;
			arg1 = 1;
			local48 = local57;
			local32 += local57;
			local40 -= local57;
			local34 += local57;
			local46 += local57;
		}
		if (this.anInt2312 <= arg1 + local40) {
			local57 = local40 + arg1 + 1 - this.anInt2312;
			local40 -= local57;
			local46 += local57;
			local48 += local57;
		}
		if (local40 > 0 && local37 > 0) {
			Static168.method3191(local48, this.aByteArray12, local37, local11.aByteArray19, local34, local46, local32, local40);
			this.method2016(local37, local40, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!r;III)Z")
	public boolean method2015(@OriginalArg(0) Class6_Sub5_Sub10 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class6_Sub5_Sub10_Sub1 local6 = (Class6_Sub5_Sub10_Sub1) arg0;
		arg1 += local6.anInt3265 + 1;
		arg2 += local6.anInt3260 + 1;
		@Pc(27) int local27 = arg2 * this.anInt2312 + arg1;
		@Pc(30) int local30 = local6.anInt3266;
		@Pc(33) int local33 = local6.anInt3264;
		@Pc(39) int local39 = this.anInt2312 - local33;
		@Pc(45) int local45;
		if (arg2 <= 0) {
			local45 = 1 - arg2;
			arg2 = 1;
			local27 += this.anInt2312 * local45;
			local30 -= local45;
		}
		if (arg2 + local30 >= this.anInt2319) {
			local45 = local30 + arg2 + 1 - this.anInt2319;
			local30 -= local45;
		}
		if (arg1 <= 0) {
			local45 = 1 - arg1;
			local33 -= local45;
			local27 += local45;
			local39 += local45;
			arg1 = 1;
		}
		if (arg1 + local33 >= this.anInt2312) {
			local45 = local33 + arg1 + 1 - this.anInt2312;
			local39 += local45;
			local33 -= local45;
		}
		if (local33 > 0 && local30 > 0) {
			local39 += this.anInt2312 * 7;
			return Static249.method4433(local27, local39, local33, this.aByteArray12, local30);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIZ)V")
	private void method2016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass60ArrayArray1 == null) {
			return;
		}
		@Pc(19) int local19 = arg2 - 1 >> 7;
		@Pc(27) int local27 = arg1 + arg2 - 2 >> 7;
		@Pc(33) int local33 = arg3 - 1 >> 7;
		@Pc(44) int local44 = arg3 + arg0 - 1 - 1 >> 7;
		for (@Pc(46) int local46 = local19; local46 <= local27; local46++) {
			@Pc(53) Class60[] local53 = this.aClass60ArrayArray1[local46];
			for (@Pc(55) int local55 = local33; local55 <= local44; local55++) {
				local53[local55].aBoolean216 = true;
			}
		}
	}
}
