import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class28 {

	@OriginalMember(owner = "client!c", name = "h", descriptor = "[[Lclient!gi;")
	private Class86[][] aClass86ArrayArray1;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "Lclient!ch;")
	private final Class33_Sub1 aClass33_Sub1_1;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "Lclient!qi;")
	private final Class82_Sub2 aClass82_Sub2_11;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "I")
	public final int anInt674;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "I")
	private final int anInt670;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "I")
	private final int anInt672;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "[B")
	public final byte[] aByteArray15;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "I")
	private final int anInt673;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "I")
	private final int anInt671;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Lclient!qi;Lclient!ch;)V")
	public Class28(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) Class33_Sub1 arg1) {
		this.aClass33_Sub1_1 = arg1;
		this.aClass82_Sub2_11 = arg0;
		this.anInt674 = (this.aClass33_Sub1_1.anInt753 * this.aClass33_Sub1_1.anInt4627 >> this.aClass82_Sub2_11.anInt5194) + 2;
		this.anInt670 = (this.aClass33_Sub1_1.anInt4626 * this.aClass33_Sub1_1.anInt753 >> this.aClass82_Sub2_11.anInt5194) + 2;
		this.anInt672 = this.aClass82_Sub2_11.anInt5194 + 7 - this.aClass33_Sub1_1.anInt750;
		this.aByteArray15 = new byte[this.anInt674 * this.anInt670];
		this.anInt673 = this.aClass33_Sub1_1.anInt4627 >> this.anInt672;
		this.anInt671 = this.aClass33_Sub1_1.anInt4626 >> this.anInt672;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IZB[[ZII)V")
	public void method711(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(3) opengl local3 = this.aClass82_Sub2_11.anOpengl2;
		this.aClass82_Sub2_11.method4561();
		this.aClass82_Sub2_11.method4574(false);
		this.aClass82_Sub2_11.method4573(false);
		this.aClass82_Sub2_11.method4569();
		this.aClass82_Sub2_11.method4618(0);
		this.aClass82_Sub2_11.method4575(1);
		@Pc(50) float local50 = 1.0F / (float) (this.aClass82_Sub2_11.anInt5201 * 128);
		@Pc(54) int local54;
		@Pc(63) int local63;
		@Pc(70) int local70;
		@Pc(72) int local72;
		@Pc(78) int local78;
		@Pc(83) int local83;
		@Pc(90) int local90;
		if (arg1) {
			for (local54 = 0; local54 < this.anInt671; local54++) {
				local63 = local54 << this.anInt672;
				local70 = local54 + 1 << this.anInt672;
				label84: for (local72 = 0; local72 < this.anInt673; local72++) {
					local78 = local72 << this.anInt672;
					local83 = local72 + 1 << this.anInt672;
					for (local90 = local78; local90 < local83; local90++) {
						if (local90 - arg4 >= -arg0 && local90 - arg4 <= arg0) {
							for (@Pc(343) int local343 = local63; local343 < local70; local343++) {
								if (local343 - arg3 >= -arg0 && local343 - arg3 <= arg0 && arg2[arg0 + local90 - arg4][arg0 + local343 - arg3]) {
									local3.glMatrixMode(5890);
									local3.glLoadIdentity();
									local3.glScalef(local50, local50, 1.0F);
									local3.glTranslatef((float) -local72 / local50, (float) -local54 / local50, 1.0F);
									local3.glMatrixMode(5888);
									this.aClass86ArrayArray1[local72][local54].method2151();
									continue label84;
								}
							}
						}
					}
				}
			}
		} else {
			for (local54 = 0; local54 < this.anInt671; local54++) {
				local63 = local54 << this.anInt672;
				local70 = local54 + 1 << this.anInt672;
				for (local72 = 0; local72 < this.anInt673; local72++) {
					local78 = 0;
					local83 = local72 << this.anInt672;
					local90 = local72 + 1 << this.anInt672;
					@Pc(92) Class2_Sub13 local92 = Static36.aClass2_Sub13_5;
					local92.anInt4788 = 0;
					for (@Pc(97) int local97 = local63; local97 < local70; local97++) {
						if (local97 - arg3 >= -arg0 && local97 - arg3 <= arg0) {
							@Pc(130) int local130 = local83 + local97 * this.aClass33_Sub1_1.anInt4627;
							for (@Pc(132) int local132 = local83; local132 < local90; local132++) {
								if (-arg0 <= local132 - arg4 && arg0 >= local132 - arg4 && arg2[local132 + arg0 - arg4][local97 + arg0 - arg3]) {
									@Pc(178) short[] local178 = this.aClass33_Sub1_1.aShortArrayArray5[local130];
									if (local178 != null) {
										@Pc(187) int local187;
										if (this.aClass82_Sub2_11.aBoolean403) {
											for (local187 = 0; local187 < local178.length; local187++) {
												local78++;
												local92.method4199(local178[local187] & 0xFFFF);
											}
										} else {
											for (local187 = 0; local187 < local178.length; local187++) {
												local92.method4243(local178[local187] & 0xFFFF);
												local78++;
											}
										}
									}
								}
								local130++;
							}
						}
					}
					if (local78 > 0) {
						local3.glMatrixMode(5890);
						local3.glLoadIdentity();
						local3.glScalef(local50, local50, 1.0F);
						local3.glTranslatef((float) -local72 / local50, (float) -local54 / local50, 1.0F);
						local3.glMatrixMode(5888);
						this.aClass86ArrayArray1[local72][local54].method2152(local92.aByteArray77, local78);
					}
				}
			}
		}
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
	public void method712() {
		this.aClass86ArrayArray1 = new Class86[this.anInt673][this.anInt671];
		for (@Pc(14) int local14 = 0; local14 < this.anInt671; local14++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt673; local24++) {
				this.aClass86ArrayArray1[local24][local14] = new Class86(this.aClass82_Sub2_11, this, this.aClass33_Sub1_1, local24, local14, this.anInt672, local24 * 128 + 1, local14 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!mr;IZI)V")
	public void method713(@OriginalArg(0) Class2_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class2_Sub1_Sub6_Sub1 local2 = (Class2_Sub1_Sub6_Sub1) arg0;
		arg1 += local2.anInt2651 + 1;
		arg2 += local2.anInt2650 + 1;
		@Pc(27) int local27 = this.anInt674 * arg2 + arg1;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local2.anInt2648;
		@Pc(35) int local35 = local2.anInt2649;
		@Pc(41) int local41 = this.anInt674 - local35;
		@Pc(52) int local52;
		if (arg2 <= 0) {
			local52 = 1 - arg2;
			local29 = local35 * local52;
			local27 += local52 * this.anInt674;
			local32 -= local52;
			arg2 = 1;
		}
		@Pc(73) int local73 = 0;
		if (this.anInt670 <= local32 + arg2) {
			local52 = local32 + arg2 + 1 - this.anInt670;
			local32 -= local52;
		}
		if (arg1 <= 0) {
			local52 = 1 - arg1;
			local41 += local52;
			arg1 = 1;
			local29 += local52;
			local27 += local52;
			local73 = local52;
			local35 -= local52;
		}
		if (local35 + arg1 >= this.anInt674) {
			local52 = local35 + arg1 + 1 - this.anInt674;
			local73 += local52;
			local35 -= local52;
			local41 += local52;
		}
		if (local35 > 0 && local32 > 0) {
			Static393.method710(local29, local2.aByteArray45, local35, local27, this.aByteArray15, local41, local32, local73);
			this.method716(arg1, arg2, local32, local35);
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!mr;II)V")
	public void method714(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub6 arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class2_Sub1_Sub6_Sub1 local2 = (Class2_Sub1_Sub6_Sub1) arg1;
		arg2 += local2.anInt2650 + 1;
		arg0 += local2.anInt2651 + 1;
		@Pc(23) int local23 = arg0 + arg2 * this.anInt674;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt2648;
		@Pc(31) int local31 = local2.anInt2649;
		@Pc(36) int local36 = this.anInt674 - local31;
		@Pc(38) int local38 = 0;
		@Pc(53) int local53;
		if (arg2 <= 0) {
			local53 = 1 - arg2;
			local28 -= local53;
			local23 += this.anInt674 * local53;
			arg2 = 1;
			local25 = local31 * local53;
		}
		if (this.anInt670 <= local28 + arg2) {
			local53 = local28 + arg2 + 1 - this.anInt670;
			local28 -= local53;
		}
		if (arg0 <= 0) {
			local53 = 1 - arg0;
			local23 += local53;
			local25 += local53;
			local36 += local53;
			local31 -= local53;
			arg0 = 1;
			local38 = local53;
		}
		if (this.anInt674 <= arg0 + local31) {
			local53 = arg0 + local31 + 1 - this.anInt674;
			local38 += local53;
			local31 -= local53;
			local36 += local53;
		}
		if (local31 > 0 && local28 > 0) {
			Static393.method717(this.aByteArray15, local25, local2.aByteArray45, local36, local38, local28, local31, local23);
			this.method716(arg0, arg2, local28, local31);
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIILclient!mr;)Z")
	public boolean method715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub1_Sub6 arg2) {
		@Pc(2) Class2_Sub1_Sub6_Sub1 local2 = (Class2_Sub1_Sub6_Sub1) arg2;
		arg1 += local2.anInt2651 + 1;
		arg0 += local2.anInt2650 + 1;
		@Pc(23) int local23 = arg0 * this.anInt674 + arg1;
		@Pc(26) int local26 = local2.anInt2648;
		@Pc(29) int local29 = local2.anInt2649;
		@Pc(35) int local35 = this.anInt674 - local29;
		@Pc(41) int local41;
		if (arg0 <= 0) {
			local41 = 1 - arg0;
			arg0 = 1;
			local26 -= local41;
			local23 += local41 * this.anInt674;
		}
		if (arg0 + local26 >= this.anInt670) {
			local41 = arg0 + local26 + 1 - this.anInt670;
			local26 -= local41;
		}
		if (arg1 <= 0) {
			local41 = 1 - arg1;
			local29 -= local41;
			local23 += local41;
			arg1 = 1;
			local35 += local41;
		}
		if (this.anInt674 <= local29 + arg1) {
			local41 = local29 + arg1 + 1 - this.anInt674;
			local35 += local41;
			local29 -= local41;
		}
		if (local29 > 0 && local26 > 0) {
			local35 += this.anInt674 * 7;
			return Static393.method718(local26, this.aByteArray15, local29, local23, local35);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII)V")
	private void method716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass86ArrayArray1 == null) {
			return;
		}
		@Pc(10) int local10 = arg0 - 1 >> 7;
		@Pc(21) int local21 = arg0 + arg3 - 1 - 1 >> 7;
		@Pc(27) int local27 = arg1 - 1 >> 7;
		@Pc(37) int local37 = arg1 + arg2 - 1 - 1 >> 7;
		for (@Pc(46) int local46 = local10; local46 <= local21; local46++) {
			@Pc(58) Class86[] local58 = this.aClass86ArrayArray1[local46];
			for (@Pc(60) int local60 = local27; local60 <= local37; local60++) {
				local58[local60].aBoolean176 = true;
			}
		}
	}
}
