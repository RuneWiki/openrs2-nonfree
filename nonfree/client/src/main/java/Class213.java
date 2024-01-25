import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class213 {

	@OriginalMember(owner = "client!ko", name = "l", descriptor = "[[Lclient!l;")
	private Class217[][] aClass217ArrayArray1;

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "Lclient!ml;")
	private final Class75_Sub3 aClass75_Sub3_24;

	@OriginalMember(owner = "client!ko", name = "f", descriptor = "Lclient!qd;")
	private final Class96_Sub2 aClass96_Sub2_2;

	@OriginalMember(owner = "client!ko", name = "t", descriptor = "I")
	public final int anInt5537;

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "I")
	private final int anInt5533;

	@OriginalMember(owner = "client!ko", name = "j", descriptor = "[B")
	public final byte[] aByteArray53;

	@OriginalMember(owner = "client!ko", name = "u", descriptor = "I")
	private final int anInt5539;

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "I")
	private final int anInt5529;

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
	private final int anInt5538;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lclient!ml;Lclient!qd;)V")
	public Class213(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) Class96_Sub2 arg1) {
		this.aClass75_Sub3_24 = arg0;
		this.aClass96_Sub2_2 = arg1;
		this.anInt5537 = (this.aClass96_Sub2_2.anInt9246 * this.aClass96_Sub2_2.anInt9255 >> this.aClass75_Sub3_24.anInt6531) + 2;
		this.anInt5533 = (this.aClass96_Sub2_2.anInt9246 * this.aClass96_Sub2_2.anInt9257 >> this.aClass75_Sub3_24.anInt6531) + 2;
		this.aByteArray53 = new byte[this.anInt5537 * this.anInt5533];
		this.anInt5539 = this.aClass75_Sub3_24.anInt6531 + 7 - this.aClass96_Sub2_2.anInt9248;
		this.anInt5529 = this.aClass96_Sub2_2.anInt9255 >> this.anInt5539;
		this.anInt5538 = this.aClass96_Sub2_2.anInt9257 >> this.anInt5539;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!r;IZI)V")
	public void method5034(@OriginalArg(0) Class6_Sub2_Sub18 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class6_Sub2_Sub18_Sub1 local6 = (Class6_Sub2_Sub18_Sub1) arg0;
		arg1 += local6.anInt8855 + 1;
		arg2 += local6.anInt8848 + 1;
		@Pc(27) int local27 = arg1 + arg2 * this.anInt5537;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = local6.anInt8849;
		@Pc(43) int local43 = local6.anInt8846;
		@Pc(48) int local48 = this.anInt5537 - local43;
		@Pc(58) int local58;
		if (arg2 <= 0) {
			local58 = 1 - arg2;
			local40 -= local58;
			arg2 = 1;
			local27 += this.anInt5537 * local58;
			local37 = local43 * local58;
		}
		@Pc(79) int local79 = 0;
		if (local40 + arg2 >= this.anInt5533) {
			local58 = arg2 + local40 + 1 - this.anInt5533;
			local40 -= local58;
		}
		if (arg1 <= 0) {
			local58 = 1 - arg1;
			local48 += local58;
			local37 += local58;
			local27 += local58;
			arg1 = 1;
			local79 = local58;
			local43 -= local58;
		}
		if (this.anInt5537 <= local43 + arg1) {
			local58 = arg1 + local43 + 1 - this.anInt5537;
			local79 += local58;
			local48 += local58;
			local43 -= local58;
		}
		if (local43 > 0 && local40 > 0) {
			Static493.method7298(local43, local48, local6.aByteArray100, local37, this.aByteArray53, local27, local79, local40);
			this.method5035(arg2, local43, local40, arg1);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIII)V")
	private void method5035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass217ArrayArray1 == null) {
			return;
		}
		@Pc(16) int local16 = arg3 - 1 >> 7;
		@Pc(32) int local32 = arg1 + arg3 - 2 >> 7;
		@Pc(38) int local38 = arg0 - 1 >> 7;
		@Pc(46) int local46 = arg2 + arg0 - 2 >> 7;
		for (@Pc(48) int local48 = local16; local48 <= local32; local48++) {
			@Pc(55) Class217[] local55 = this.aClass217ArrayArray1[local48];
			for (@Pc(57) int local57 = local38; local57 <= local46; local57++) {
				local55[local57].aBoolean421 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIILclient!r;)V")
	public void method5037(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6_Sub2_Sub18 arg2) {
		@Pc(6) Class6_Sub2_Sub18_Sub1 local6 = (Class6_Sub2_Sub18_Sub1) arg2;
		arg0 += local6.anInt8855 + 1;
		arg1 += local6.anInt8848 + 1;
		@Pc(27) int local27 = arg0 + this.anInt5537 * arg1;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt8849;
		@Pc(35) int local35 = local6.anInt8846;
		@Pc(41) int local41 = this.anInt5537 - local35;
		@Pc(48) int local48;
		if (arg1 <= 0) {
			local48 = 1 - arg1;
			arg1 = 1;
			local27 += this.anInt5537 * local48;
			local32 -= local48;
			local29 = local48 * local35;
		}
		@Pc(69) int local69 = 0;
		if (local32 + arg1 >= this.anInt5533) {
			local48 = local32 + arg1 + 1 - this.anInt5533;
			local32 -= local48;
		}
		if (arg0 <= 0) {
			local48 = 1 - arg0;
			local35 -= local48;
			arg0 = 1;
			local69 = local48;
			local27 += local48;
			local29 += local48;
			local41 += local48;
		}
		if (this.anInt5537 <= arg0 + local35) {
			local48 = arg0 + local35 + 1 - this.anInt5537;
			local35 -= local48;
			local41 += local48;
			local69 += local48;
		}
		if (local35 > 0 && local32 > 0) {
			Static612.method8448(local35, local41, local69, local6.aByteArray100, local27, local32, this.aByteArray53, local29);
			this.method5035(arg1, local35, local32, arg0);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V")
	public void method5039(@OriginalArg(0) int arg0) {
		this.aClass217ArrayArray1 = new Class217[this.anInt5529][this.anInt5538];
		for (@Pc(14) int local14 = 0; local14 < this.anInt5538; local14++) {
			for (@Pc(20) int local20 = 0; local20 < this.anInt5529; local20++) {
				this.aClass217ArrayArray1[local20][local14] = new Class217(this.aClass75_Sub3_24, this, this.aClass96_Sub2_2, local20, local14, this.anInt5539, local20 * 128 + 1, local14 * 128 - -1);
			}
		}
		if (arg0 >= -123) {
			this.method5039(-101);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(II[[ZIZZ)V")
	public void method5040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		this.aClass75_Sub3_24.method5840(false);
		this.aClass75_Sub3_24.method5788(false);
		this.aClass75_Sub3_24.method5781(-2);
		this.aClass75_Sub3_24.method5787(1);
		this.aClass75_Sub3_24.method5826(1);
		@Pc(39) float local39 = 1.0F / (float) (this.aClass75_Sub3_24.anInt6530 * 128);
		@Pc(43) int local43;
		@Pc(50) int local50;
		@Pc(57) int local57;
		@Pc(59) int local59;
		@Pc(63) int local63;
		@Pc(68) int local68;
		@Pc(75) int local75;
		if (arg4) {
			for (local43 = 0; local43 < this.anInt5538; local43++) {
				local50 = local43 << this.anInt5539;
				local57 = local43 + 1 << this.anInt5539;
				label81: for (local59 = 0; local59 < this.anInt5529; local59++) {
					local63 = local59 << this.anInt5539;
					local68 = local59 + 1 << this.anInt5539;
					for (local75 = local63; local75 < local68; local75++) {
						if (local75 - arg1 >= -arg3 && arg3 >= local75 - arg1) {
							for (@Pc(365) int local365 = local50; local365 < local57; local365++) {
								if (local365 - arg0 >= -arg3 && arg3 >= local365 - arg0 && arg2[arg3 + local75 - arg1][local365 + arg3 - arg0]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local39, local39, 1.0F);
									OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass217ArrayArray1[local59][local43].method5138();
									continue label81;
								}
							}
						}
					}
				}
			}
		} else {
			for (local43 = 0; local43 < this.anInt5538; local43++) {
				local50 = local43 << this.anInt5539;
				local57 = local43 + 1 << this.anInt5539;
				for (local59 = 0; local59 < this.anInt5529; local59++) {
					local63 = 0;
					local68 = local59 << this.anInt5539;
					local75 = local59 + 1 << this.anInt5539;
					@Pc(79) Class6_Sub15_Sub2 local79 = this.aClass75_Sub3_24.aClass6_Sub15_Sub2_2;
					local79.anInt3174 = 0;
					for (@Pc(84) int local84 = local50; local84 < local57; local84++) {
						if (local84 - arg0 >= -arg3 && arg3 >= local84 - arg0) {
							@Pc(114) int local114 = local68 + this.aClass96_Sub2_2.anInt9255 * local84;
							for (@Pc(116) int local116 = local68; local116 < local75; local116++) {
								if (-arg3 <= local116 - arg1 && arg3 >= local116 - arg1 && arg2[arg3 + local116 - arg1][local84 + arg3 - arg0]) {
									@Pc(168) short[] local168 = this.aClass96_Sub2_2.aShortArrayArray12[local114];
									if (local168 != null) {
										@Pc(178) int local178;
										if (this.aClass75_Sub3_24.aBoolean480) {
											for (local178 = 0; local178 < local168.length; local178++) {
												local63++;
												local79.method3040(local168[local178] & 0xFFFF);
											}
										} else {
											for (local178 = 0; local178 < local168.length; local178++) {
												local79.method3008(local168[local178] & 0xFFFF);
												local63++;
											}
										}
									}
								}
								local114++;
							}
						}
					}
					if (local63 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local39, local39, 1.0F);
						OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass217ArrayArray1[local59][local43].method5142(local79.aByteArray20, local63);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILclient!r;II)Z")
	public boolean method5041(@OriginalArg(1) Class6_Sub2_Sub18 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class6_Sub2_Sub18_Sub1 local6 = (Class6_Sub2_Sub18_Sub1) arg0;
		arg2 += local6.anInt8848 + 1;
		arg1 += local6.anInt8855 + 1;
		@Pc(28) int local28 = arg1 + arg2 * this.anInt5537;
		@Pc(31) int local31 = local6.anInt8849;
		@Pc(34) int local34 = local6.anInt8846;
		@Pc(40) int local40 = this.anInt5537 - local34;
		@Pc(47) int local47;
		if (arg2 <= 0) {
			local47 = 1 - arg2;
			local28 += local47 * this.anInt5537;
			arg2 = 1;
			local31 -= local47;
		}
		if (this.anInt5533 <= local31 + arg2) {
			local47 = local31 + arg2 + 1 - this.anInt5533;
			local31 -= local47;
		}
		if (arg1 <= 0) {
			local47 = 1 - arg1;
			local40 += local47;
			local34 -= local47;
			local28 += local47;
			arg1 = 1;
		}
		if (this.anInt5537 <= local34 + arg1) {
			local47 = arg1 + local34 + 1 - this.anInt5537;
			local40 += local47;
			local34 -= local47;
		}
		if (local34 > 0 && local31 > 0) {
			local40 += this.anInt5537 * 7;
			return Static405.method7966(local40, local34, this.aByteArray53, local28, local31);
		} else {
			return false;
		}
	}
}
