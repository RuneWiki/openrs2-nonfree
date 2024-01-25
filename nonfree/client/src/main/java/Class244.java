import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class244 {

	@OriginalMember(owner = "client!nr", name = "f", descriptor = "[[Lclient!lca;")
	private Class209[][] aClass209ArrayArray1;

	@OriginalMember(owner = "client!nr", name = "i", descriptor = "Lclient!ed;")
	private final Class91_Sub1 aClass91_Sub1_2;

	@OriginalMember(owner = "client!nr", name = "l", descriptor = "Lclient!bi;")
	private final Class13_Sub2 aClass13_Sub2_31;

	@OriginalMember(owner = "client!nr", name = "r", descriptor = "I")
	public final int anInt6706;

	@OriginalMember(owner = "client!nr", name = "n", descriptor = "I")
	private final int anInt6705;

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "[B")
	public final byte[] aByteArray69;

	@OriginalMember(owner = "client!nr", name = "g", descriptor = "I")
	private final int anInt6700;

	@OriginalMember(owner = "client!nr", name = "h", descriptor = "I")
	private final int anInt6701;

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "I")
	private final int anInt6697;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Lclient!bi;Lclient!ed;)V")
	public Class244(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) Class91_Sub1 arg1) {
		this.aClass91_Sub1_2 = arg1;
		this.aClass13_Sub2_31 = arg0;
		this.anInt6706 = (this.aClass91_Sub1_2.anInt8647 * this.aClass91_Sub1_2.anInt8650 >> this.aClass13_Sub2_31.anInt1075) + 2;
		this.anInt6705 = (this.aClass91_Sub1_2.anInt8647 * this.aClass91_Sub1_2.anInt8645 >> this.aClass13_Sub2_31.anInt1075) + 2;
		this.aByteArray69 = new byte[this.anInt6705 * this.anInt6706];
		this.anInt6700 = this.aClass13_Sub2_31.anInt1075 + 7 - this.aClass91_Sub1_2.anInt8641;
		this.anInt6701 = this.aClass91_Sub1_2.anInt8650 >> this.anInt6700;
		this.anInt6697 = this.aClass91_Sub1_2.anInt8645 >> this.anInt6700;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILclient!r;II)Z")
	public boolean method5756(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7_Sub17 arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class2_Sub7_Sub17_Sub1 local14 = (Class2_Sub7_Sub17_Sub1) arg1;
		arg0 += local14.anInt9887 + 1;
		arg2 += local14.anInt9888 + 1;
		@Pc(35) int local35 = this.anInt6706 * arg0 + arg2;
		@Pc(38) int local38 = local14.anInt9882;
		@Pc(41) int local41 = local14.anInt9884;
		@Pc(48) int local48;
		if (arg0 <= 0) {
			local48 = 1 - arg0;
			arg0 = 1;
			local38 -= local48;
			local35 += this.anInt6706 * local48;
		}
		@Pc(67) int local67 = this.anInt6706 - local41;
		if (local38 + arg0 >= this.anInt6705) {
			local48 = arg0 + local38 + 1 - this.anInt6705;
			local38 -= local48;
		}
		if (arg2 <= 0) {
			local48 = 1 - arg2;
			local67 += local48;
			local35 += local48;
			local41 -= local48;
			arg2 = 1;
		}
		if (arg2 + local41 >= this.anInt6706) {
			local48 = local41 + arg2 + 1 - this.anInt6706;
			local67 += local48;
			local41 -= local48;
		}
		if (local41 > 0 && local38 > 0) {
			local67 += this.anInt6706 * 7;
			return Static112.method2013(local67, this.aByteArray69, local41, local38, local35);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "([[ZZIIII)V")
	public void method5758(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aClass13_Sub2_31.method1022(false);
		this.aClass13_Sub2_31.method1062(false);
		this.aClass13_Sub2_31.method1023(-2);
		this.aClass13_Sub2_31.method1046(1);
		this.aClass13_Sub2_31.method1090(1);
		@Pc(43) float local43 = 1.0F / (float) (this.aClass13_Sub2_31.anInt1074 * 128);
		@Pc(47) int local47;
		@Pc(54) int local54;
		@Pc(61) int local61;
		@Pc(63) int local63;
		@Pc(70) int local70;
		@Pc(77) int local77;
		@Pc(79) int local79;
		if (arg1) {
			for (local47 = 0; local47 < this.anInt6697; local47++) {
				local54 = local47 << this.anInt6700;
				local61 = local47 + 1 << this.anInt6700;
				label128: for (local63 = 0; local63 < this.anInt6701; local63++) {
					local70 = local63 << this.anInt6700;
					local77 = local63 + 1 << this.anInt6700;
					for (local79 = local70; local79 < local77; local79++) {
						if (local79 - arg3 >= -arg4 && local79 - arg3 <= arg4) {
							for (@Pc(99) int local99 = local54; local99 < local61; local99++) {
								if (-arg4 <= local99 - arg2 && local99 - arg2 <= arg4 && arg0[local79 + arg4 - arg3][local99 + arg4 - arg2]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local43, local43, 1.0F);
									OpenGL.glTranslatef((float) -local63 / local43, (float) -local47 / local43, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass209ArrayArray1[local63][local47].method4875();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local47 = 0; local47 < this.anInt6697; local47++) {
				local54 = local47 << this.anInt6700;
				local61 = local47 + 1 << this.anInt6700;
				for (local63 = 0; local63 < this.anInt6701; local63++) {
					local70 = 0;
					local77 = local63 << this.anInt6700;
					local79 = local63 + 1 << this.anInt6700;
					@Pc(229) Class2_Sub17_Sub2 local229 = this.aClass13_Sub2_31.aClass2_Sub17_Sub2_1;
					local229.anInt3378 = 0;
					for (@Pc(234) int local234 = local54; local234 < local61; local234++) {
						if (-arg4 <= local234 - arg2 && local234 - arg2 <= arg4) {
							@Pc(262) int local262 = local234 * this.aClass91_Sub1_2.anInt8650 + local77;
							for (@Pc(264) int local264 = local77; local264 < local79; local264++) {
								if (local264 - arg3 >= -arg4 && arg4 >= local264 - arg3 && arg0[arg4 + local264 - arg3][arg4 + local234 - arg2]) {
									@Pc(301) short[] local301 = this.aClass91_Sub1_2.aShortArrayArray3[local262];
									if (local301 != null) {
										@Pc(309) int local309;
										if (this.aClass13_Sub2_31.aBoolean102) {
											for (local309 = 0; local309 < local301.length; local309++) {
												local70++;
												local229.method2879(local301[local309] & 0xFFFF);
											}
										} else {
											for (local309 = 0; local309 < local301.length; local309++) {
												local70++;
												local229.method2878(local301[local309] & 0xFFFF);
											}
										}
									}
								}
								local262++;
							}
						}
					}
					if (local70 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local43, local43, 1.0F);
						OpenGL.glTranslatef((float) -local63 / local43, (float) -local47 / local43, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass209ArrayArray1[local63][local47].method4871(local70, local229.aByteArray26);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!r;IIB)V")
	public void method5759(@OriginalArg(0) Class2_Sub7_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class2_Sub7_Sub17_Sub1 local6 = (Class2_Sub7_Sub17_Sub1) arg0;
		arg1 += local6.anInt9887 + 1;
		arg2 += local6.anInt9888 + 1;
		@Pc(27) int local27 = this.anInt6706 * arg1 + arg2;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt9882;
		@Pc(41) int local41 = local6.anInt9884;
		@Pc(47) int local47 = this.anInt6706 - local41;
		@Pc(49) int local49 = 0;
		@Pc(59) int local59;
		if (arg1 <= 0) {
			local59 = 1 - arg1;
			local32 -= local59;
			local27 += this.anInt6706 * local59;
			arg1 = 1;
			local29 = local41 * local59;
		}
		if (this.anInt6705 <= arg1 + local32) {
			local59 = arg1 + local32 + 1 - this.anInt6705;
			local32 -= local59;
		}
		if (arg2 <= 0) {
			local59 = 1 - arg2;
			local49 = local59;
			local29 += local59;
			local41 -= local59;
			local27 += local59;
			local47 += local59;
			arg2 = 1;
		}
		if (arg2 + local41 >= this.anInt6706) {
			local59 = arg2 + local41 + 1 - this.anInt6706;
			local49 += local59;
			local41 -= local59;
			local47 += local59;
		}
		if (local41 > 0 && local32 > 0) {
			Static348.method5238(local29, local6.aByteArray102, this.aByteArray69, local32, local47, local41, local27, local49);
			this.method5760(arg1, local32, arg2, local41);
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIBI)V")
	private void method5760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass209ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg2 - 1 >> 7;
		@Pc(25) int local25 = arg3 + arg2 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg0 - 1 >> 7;
		@Pc(41) int local41 = arg1 + arg0 - 1 - 1 >> 7;
		for (@Pc(53) int local53 = local15; local53 <= local25; local53++) {
			@Pc(60) Class209[] local60 = this.aClass209ArrayArray1[local53];
			for (@Pc(62) int local62 = local31; local62 <= local41; local62++) {
				local60[local62].aBoolean409 = true;
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(I)V")
	public void method5761() {
		this.aClass209ArrayArray1 = new Class209[this.anInt6701][this.anInt6697];
		for (@Pc(14) int local14 = 0; local14 < this.anInt6697; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt6701; local18++) {
				this.aClass209ArrayArray1[local18][local14] = new Class209(this.aClass13_Sub2_31, this, this.aClass91_Sub1_2, local18, local14, this.anInt6700, local18 * 128 + 1, local14 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIILclient!r;)V")
	public void method5762(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub7_Sub17 arg2) {
		@Pc(6) Class2_Sub7_Sub17_Sub1 local6 = (Class2_Sub7_Sub17_Sub1) arg2;
		arg0 += local6.anInt9887 + 1;
		arg1 += local6.anInt9888 + 1;
		@Pc(27) int local27 = arg0 * this.anInt6706 + arg1;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt9882;
		@Pc(35) int local35 = local6.anInt9884;
		@Pc(41) int local41 = this.anInt6706 - local35;
		@Pc(51) int local51;
		if (arg0 <= 0) {
			local51 = 1 - arg0;
			local29 = local51 * local35;
			arg0 = 1;
			local27 += this.anInt6706 * local51;
			local32 -= local51;
		}
		@Pc(72) int local72 = 0;
		if (this.anInt6705 <= local32 + arg0) {
			local51 = local32 + arg0 + 1 - this.anInt6705;
			local32 -= local51;
		}
		if (arg1 <= 0) {
			local51 = 1 - arg1;
			local72 = local51;
			local41 += local51;
			arg1 = 1;
			local35 -= local51;
			local29 += local51;
			local27 += local51;
		}
		if (local35 + arg1 >= this.anInt6706) {
			local51 = local35 + arg1 + 1 - this.anInt6706;
			local72 += local51;
			local41 += local51;
			local35 -= local51;
		}
		if (local35 > 0 && local32 > 0) {
			Static448.method6405(local27, local6.aByteArray102, this.aByteArray69, local35, local72, local29, local32, local41);
			this.method5760(arg0, local32, arg1, local35);
		}
	}
}
