import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3 {

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "[I")
	public static final int[] anIntArray1 = new int[99];

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "[[Lclient!ku;")
	private Class146[][] aClass146ArrayArray1;

	@OriginalMember(owner = "client!ab", name = "t", descriptor = "Lclient!pp;")
	private final Class70_Sub2 aClass70_Sub2_1;

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "Lclient!qg;")
	private final Class121_Sub2 aClass121_Sub2_1;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
	public final int anInt45;

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
	private final int anInt54;

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
	private final int anInt53;

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "[B")
	public final byte[] aByteArray1;

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
	private final int anInt48;

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
	private final int anInt49;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 99; local6++) {
			@Pc(11) int local11 = local6 + 1;
			@Pc(24) int local24 = (int) (Math.pow(2.0D, (double) local11 / 7.0D) * 300.0D + (double) local11);
			local4 += local24;
			anIntArray1[local6] = local4 / 4;
		}
	}

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lclient!qg;Lclient!pp;)V")
	public Class3(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) Class70_Sub2 arg1) {
		this.aClass70_Sub2_1 = arg1;
		this.aClass121_Sub2_1 = arg0;
		this.anInt45 = (this.aClass70_Sub2_1.anInt5251 * this.aClass70_Sub2_1.anInt5252 >> this.aClass121_Sub2_1.anInt5936) + 2;
		this.anInt54 = (this.aClass70_Sub2_1.anInt5252 * this.aClass70_Sub2_1.anInt5250 >> this.aClass121_Sub2_1.anInt5936) + 2;
		this.anInt53 = this.aClass121_Sub2_1.anInt5936 + 7 - this.aClass70_Sub2_1.anInt5253;
		this.aByteArray1 = new byte[this.anInt54 * this.anInt45];
		this.anInt48 = this.aClass70_Sub2_1.anInt5251 >> this.anInt53;
		this.anInt49 = this.aClass70_Sub2_1.anInt5250 >> this.anInt53;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	public void method39() {
		this.aClass146ArrayArray1 = new Class146[this.anInt48][this.anInt49];
		for (@Pc(14) int local14 = 0; local14 < this.anInt49; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt48; local18++) {
				this.aClass146ArrayArray1[local18][local14] = new Class146(this.aClass121_Sub2_1, this, this.aClass70_Sub2_1, local18, local14, this.anInt53, local18 * 128 + 1, local14 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IILclient!j;I)V")
	public void method42(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class1_Sub1_Sub3_Sub1 local6 = (Class1_Sub1_Sub3_Sub1) arg1;
		arg2 += local6.anInt724 + 1;
		arg0 += local6.anInt727 + 1;
		@Pc(27) int local27 = this.anInt45 * arg0 + arg2;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt725;
		@Pc(40) int local40 = local6.anInt726;
		@Pc(46) int local46 = this.anInt45 - local40;
		@Pc(48) int local48 = 0;
		@Pc(55) int local55;
		if (arg0 <= 0) {
			local55 = 1 - arg0;
			local32 -= local55;
			local29 = local40 * local55;
			local27 += this.anInt45 * local55;
			arg0 = 1;
		}
		if (this.anInt54 <= local32 + arg0) {
			local55 = arg0 + local32 + 1 - this.anInt54;
			local32 -= local55;
		}
		if (arg2 <= 0) {
			local55 = 1 - arg2;
			local40 -= local55;
			arg2 = 1;
			local46 += local55;
			local48 = local55;
			local27 += local55;
			local29 += local55;
		}
		if (this.anInt45 <= local40 + arg2) {
			local55 = arg2 + local40 + 1 - this.anInt45;
			local40 -= local55;
			local46 += local55;
			local48 += local55;
		}
		if (local40 > 0 && local32 > 0) {
			Static236.method3450(local46, local27, local40, local48, this.aByteArray1, local32, local6.aByteArray7, local29);
			this.method46(local40, arg2, local32, arg0);
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IB[[ZIZI)V")
	public void method43(@OriginalArg(0) int arg0, @OriginalArg(2) boolean[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		this.aClass121_Sub2_1.method4663(false);
		this.aClass121_Sub2_1.method4691(false);
		this.aClass121_Sub2_1.method4647(-2);
		this.aClass121_Sub2_1.method4707(1);
		this.aClass121_Sub2_1.method4700(1);
		@Pc(47) float local47 = 1.0F / (float) (this.aClass121_Sub2_1.anInt5937 * 128);
		@Pc(51) int local51;
		@Pc(58) int local58;
		@Pc(65) int local65;
		@Pc(67) int local67;
		@Pc(71) int local71;
		@Pc(76) int local76;
		@Pc(83) int local83;
		if (arg3) {
			for (local51 = 0; local51 < this.anInt49; local51++) {
				local58 = local51 << this.anInt53;
				local65 = local51 + 1 << this.anInt53;
				label81: for (local67 = 0; local67 < this.anInt48; local67++) {
					local71 = local67 << this.anInt53;
					local76 = local67 + 1 << this.anInt53;
					for (local83 = local71; local83 < local76; local83++) {
						if (-arg2 <= local83 - arg0 && arg2 >= local83 - arg0) {
							for (@Pc(312) int local312 = local58; local312 < local65; local312++) {
								if (local312 - arg4 >= -arg2 && arg2 >= local312 - arg4 && arg1[local83 + arg2 - arg0][arg2 + local312 - arg4]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local47, local47, 1.0F);
									OpenGL.glTranslatef((float) -local67 / local47, (float) -local51 / local47, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass146ArrayArray1[local67][local51].method3245();
									continue label81;
								}
							}
						}
					}
				}
			}
		} else {
			for (local51 = 0; local51 < this.anInt49; local51++) {
				local58 = local51 << this.anInt53;
				local65 = local51 + 1 << this.anInt53;
				for (local67 = 0; local67 < this.anInt48; local67++) {
					local71 = 0;
					local76 = local67 << this.anInt53;
					local83 = local67 + 1 << this.anInt53;
					@Pc(85) Class1_Sub14 local85 = Static53.aClass1_Sub14_1;
					local85.anInt5695 = 0;
					for (@Pc(90) int local90 = local58; local90 < local65; local90++) {
						if (-arg2 <= local90 - arg4 && arg2 >= local90 - arg4) {
							@Pc(112) int local112 = local90 * this.aClass70_Sub2_1.anInt5251 + local76;
							for (@Pc(114) int local114 = local76; local114 < local83; local114++) {
								if (-arg2 <= local114 - arg0 && local114 - arg0 <= arg2 && arg1[arg2 + local114 - arg0][local90 + arg2 - arg4]) {
									@Pc(148) short[] local148 = this.aClass70_Sub2_1.aShortArrayArray6[local112];
									if (local148 != null) {
										@Pc(156) int local156;
										if (this.aClass121_Sub2_1.aBoolean471) {
											for (local156 = 0; local156 < local148.length; local156++) {
												local71++;
												local85.method4504(local148[local156] & 0xFFFF);
											}
										} else {
											for (local156 = 0; local156 < local148.length; local156++) {
												local85.method4493(local148[local156] & 0xFFFF);
												local71++;
											}
										}
									}
								}
								local112++;
							}
						}
					}
					if (local71 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local47, local47, 1.0F);
						OpenGL.glTranslatef((float) -local67 / local47, (float) -local51 / local47, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass146ArrayArray1[local67][local51].method3246(local71, local85.aByteArray65);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIILclient!j;)V")
	public void method44(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub1_Sub3 arg2) {
		@Pc(6) Class1_Sub1_Sub3_Sub1 local6 = (Class1_Sub1_Sub3_Sub1) arg2;
		arg1 += local6.anInt724 + 1;
		arg0 += local6.anInt727 + 1;
		@Pc(34) int local34 = arg1 + this.anInt45 * arg0;
		@Pc(36) int local36 = 0;
		@Pc(39) int local39 = local6.anInt725;
		@Pc(42) int local42 = local6.anInt726;
		@Pc(48) int local48 = this.anInt45 - local42;
		@Pc(54) int local54;
		if (arg0 <= 0) {
			local54 = 1 - arg0;
			local36 = local54 * local42;
			local34 += this.anInt45 * local54;
			local39 -= local54;
			arg0 = 1;
		}
		@Pc(75) int local75 = 0;
		if (local39 + arg0 >= this.anInt54) {
			local54 = local39 + arg0 + 1 - this.anInt54;
			local39 -= local54;
		}
		if (arg1 <= 0) {
			local54 = 1 - arg1;
			local42 -= local54;
			arg1 = 1;
			local34 += local54;
			local75 = local54;
			local48 += local54;
			local36 += local54;
		}
		if (local42 + arg1 >= this.anInt45) {
			local54 = arg1 + local42 + 1 - this.anInt45;
			local48 += local54;
			local75 += local54;
			local42 -= local54;
		}
		if (local42 > 0 && local39 > 0) {
			Static397.method5464(local75, local34, this.aByteArray1, local48, local42, local36, local6.aByteArray7, local39);
			this.method46(local42, arg1, local39, arg0);
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!j;IZI)Z")
	public boolean method45(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class1_Sub1_Sub3_Sub1 local11 = (Class1_Sub1_Sub3_Sub1) arg0;
		arg2 += local11.anInt724 + 1;
		arg1 += local11.anInt727 + 1;
		@Pc(32) int local32 = arg2 + arg1 * this.anInt45;
		@Pc(35) int local35 = local11.anInt725;
		@Pc(38) int local38 = local11.anInt726;
		@Pc(47) int local47;
		if (arg1 <= 0) {
			local47 = 1 - arg1;
			local35 -= local47;
			arg1 = 1;
			local32 += local47 * this.anInt45;
		}
		@Pc(66) int local66 = this.anInt45 - local38;
		if (this.anInt54 <= local35 + arg1) {
			local47 = local35 + arg1 + 1 - this.anInt54;
			local35 -= local47;
		}
		if (arg2 <= 0) {
			local47 = 1 - arg2;
			local32 += local47;
			arg2 = 1;
			local38 -= local47;
			local66 += local47;
		}
		if (local38 + arg2 >= this.anInt45) {
			local47 = local38 + arg2 + 1 - this.anInt45;
			local38 -= local47;
			local66 += local47;
		}
		if (local38 > 0 && local35 > 0) {
			local66 += this.anInt45 * 7;
			return Static131.method2037(local32, local66, local38, local35, this.aByteArray1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(IIIII)V")
	private void method46(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass146ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg1 - 1 >> 7;
		@Pc(25) int local25 = arg0 + arg1 - 1 - 1 >> 7;
		@Pc(39) int local39 = arg3 - 1 >> 7;
		@Pc(50) int local50 = arg3 + arg2 - 1 - 1 >> 7;
		for (@Pc(52) int local52 = local15; local52 <= local25; local52++) {
			@Pc(59) Class146[] local59 = this.aClass146ArrayArray1[local52];
			for (@Pc(61) int local61 = local39; local61 <= local50; local61++) {
				local59[local61].aBoolean312 = true;
			}
		}
	}
}
