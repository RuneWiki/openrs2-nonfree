import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class213 {

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "[[Lclient!aq;")
	private Class12[][] aClass12ArrayArray1;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "Lclient!er;")
	private final Class60_Sub1 aClass60_Sub1_3;

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "Lclient!ig;")
	private final Class47_Sub2 aClass47_Sub2_39;

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
	public final int anInt6573;

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
	private final int anInt6571;

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
	private final int anInt6575;

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "[B")
	public final byte[] aByteArray95;

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
	private final int anInt6574;

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
	private final int anInt6572;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lclient!ig;Lclient!er;)V")
	public Class213(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) Class60_Sub1 arg1) {
		this.aClass60_Sub1_3 = arg1;
		this.aClass47_Sub2_39 = arg0;
		this.anInt6573 = (this.aClass60_Sub1_3.anInt2106 * this.aClass60_Sub1_3.anInt2567 >> this.aClass47_Sub2_39.anInt3060) + 2;
		this.anInt6571 = (this.aClass60_Sub1_3.anInt2564 * this.aClass60_Sub1_3.anInt2106 >> this.aClass47_Sub2_39.anInt3060) + 2;
		this.anInt6575 = this.aClass47_Sub2_39.anInt3060 + 7 - this.aClass60_Sub1_3.anInt2110;
		this.aByteArray95 = new byte[this.anInt6571 * this.anInt6573];
		this.anInt6574 = this.aClass60_Sub1_3.anInt2567 >> this.anInt6575;
		this.anInt6572 = this.aClass60_Sub1_3.anInt2564 >> this.anInt6575;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILclient!o;II)V")
	public void method5515(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub4_Sub4 arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class4_Sub4_Sub4_Sub1 local2 = (Class4_Sub4_Sub4_Sub1) arg1;
		arg0 += local2.anInt2812 + 1;
		arg2 += local2.anInt2810 + 1;
		@Pc(24) int local24 = arg2 + arg0 * this.anInt6573;
		@Pc(26) int local26 = 0;
		@Pc(29) int local29 = local2.anInt2811;
		@Pc(32) int local32 = local2.anInt2809;
		@Pc(38) int local38 = this.anInt6573 - local32;
		@Pc(47) int local47;
		if (arg0 <= 0) {
			local47 = 1 - arg0;
			arg0 = 1;
			local26 = local47 * local32;
			local29 -= local47;
			local24 += local47 * this.anInt6573;
		}
		@Pc(68) int local68 = 0;
		if (local29 + arg0 >= this.anInt6571) {
			local47 = arg0 + local29 + 1 - this.anInt6571;
			local29 -= local47;
		}
		if (arg2 <= 0) {
			local47 = 1 - arg2;
			local24 += local47;
			local38 += local47;
			arg2 = 1;
			local32 -= local47;
			local68 = local47;
			local26 += local47;
		}
		if (this.anInt6573 <= local32 + arg2) {
			local47 = local32 + arg2 + 1 - this.anInt6573;
			local68 += local47;
			local38 += local47;
			local32 -= local47;
		}
		if (local32 > 0 && local29 > 0) {
			Static371.method5522(local24, local26, local2.aByteArray45, local29, local38, this.aByteArray95, local32, local68);
			this.method5518(arg2, local32, local29, arg0);
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(ILclient!o;II)Z")
	public boolean method5516(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub4_Sub4 arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class4_Sub4_Sub4_Sub1 local2 = (Class4_Sub4_Sub4_Sub1) arg1;
		arg2 += local2.anInt2812 + 1;
		arg0 += local2.anInt2810 + 1;
		@Pc(23) int local23 = arg0 + arg2 * this.anInt6573;
		@Pc(26) int local26 = local2.anInt2811;
		@Pc(29) int local29 = local2.anInt2809;
		@Pc(35) int local35 = this.anInt6573 - local29;
		@Pc(41) int local41;
		if (arg2 <= 0) {
			local41 = 1 - arg2;
			local23 += this.anInt6573 * local41;
			local26 -= local41;
			arg2 = 1;
		}
		if (arg2 + local26 >= this.anInt6571) {
			local41 = arg2 + local26 + 1 - this.anInt6571;
			local26 -= local41;
		}
		if (arg0 <= 0) {
			local41 = 1 - arg0;
			local35 += local41;
			local29 -= local41;
			arg0 = 1;
			local23 += local41;
		}
		if (local29 + arg0 >= this.anInt6573) {
			local41 = local29 + arg0 + 1 - this.anInt6573;
			local29 -= local41;
			local35 += local41;
		}
		if (local29 > 0 && local26 > 0) {
			local35 += this.anInt6573 * 7;
			return Static371.method5517(local26, local29, local35, this.aByteArray95, local23);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIII)V")
	private void method5518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass12ArrayArray1 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 - 1 >> 7;
		@Pc(19) int local19 = arg1 + arg0 - 1 - 1 >> 7;
		@Pc(25) int local25 = arg3 - 1 >> 7;
		@Pc(36) int local36 = arg3 + arg2 - 1 - 1 >> 7;
		for (@Pc(38) int local38 = local9; local38 <= local19; local38++) {
			@Pc(46) Class12[] local46 = this.aClass12ArrayArray1[local38];
			for (@Pc(48) int local48 = local25; local48 <= local36; local48++) {
				local46[local48].aBoolean24 = true;
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V")
	public void method5519() {
		this.aClass12ArrayArray1 = new Class12[this.anInt6574][this.anInt6572];
		for (@Pc(8) int local8 = 0; local8 < this.anInt6572; local8++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt6574; local18++) {
				this.aClass12ArrayArray1[local18][local8] = new Class12(this.aClass47_Sub2_39, this, this.aClass60_Sub1_3, local18, local8, this.anInt6575, local18 * 128 + 1, local8 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZIB[[ZII)V")
	public void method5520(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(3) opengl local3 = this.aClass47_Sub2_39.anOpengl2;
		this.aClass47_Sub2_39.method2778();
		this.aClass47_Sub2_39.method2825(false);
		this.aClass47_Sub2_39.method2810(false);
		this.aClass47_Sub2_39.method2814();
		this.aClass47_Sub2_39.method2782(0);
		this.aClass47_Sub2_39.method2811(1);
		@Pc(42) float local42 = 1.0F / (float) (this.aClass47_Sub2_39.anInt3062 * 128);
		@Pc(46) int local46;
		@Pc(55) int local55;
		@Pc(62) int local62;
		@Pc(64) int local64;
		@Pc(70) int local70;
		@Pc(75) int local75;
		@Pc(82) int local82;
		if (arg0) {
			for (local46 = 0; local46 < this.anInt6572; local46++) {
				local55 = local46 << this.anInt6575;
				local62 = local46 + 1 << this.anInt6575;
				label84: for (local64 = 0; local64 < this.anInt6574; local64++) {
					local70 = local64 << this.anInt6575;
					local75 = local64 + 1 << this.anInt6575;
					for (local82 = local70; local82 < local75; local82++) {
						if (-arg3 <= local82 - arg1 && arg3 >= local82 - arg1) {
							for (@Pc(335) int local335 = local55; local335 < local62; local335++) {
								if (local335 - arg4 >= -arg3 && arg3 >= local335 - arg4 && arg2[arg3 + local82 - arg1][arg3 + local335 - arg4]) {
									local3.glMatrixMode(5890);
									local3.glLoadIdentity();
									local3.glScalef(local42, local42, 1.0F);
									local3.glTranslatef((float) -local64 / local42, (float) -local46 / local42, 1.0F);
									local3.glMatrixMode(5888);
									this.aClass12ArrayArray1[local64][local46].method258();
									continue label84;
								}
							}
						}
					}
				}
			}
		} else {
			for (local46 = 0; local46 < this.anInt6572; local46++) {
				local55 = local46 << this.anInt6575;
				local62 = local46 + 1 << this.anInt6575;
				for (local64 = 0; local64 < this.anInt6574; local64++) {
					local70 = 0;
					local75 = local64 << this.anInt6575;
					local82 = local64 + 1 << this.anInt6575;
					@Pc(84) Class4_Sub11 local84 = Static79.aClass4_Sub11_6;
					local84.anInt3768 = 0;
					for (@Pc(89) int local89 = local55; local89 < local62; local89++) {
						if (-arg3 <= local89 - arg4 && local89 - arg4 <= arg3) {
							@Pc(127) int local127 = local89 * this.aClass60_Sub1_3.anInt2567 + local75;
							for (@Pc(129) int local129 = local75; local129 < local82; local129++) {
								if (local129 - arg1 >= -arg3 && local129 - arg1 <= arg3 && arg2[arg3 + local129 - arg1][arg3 + local89 - arg4]) {
									@Pc(170) short[] local170 = this.aClass60_Sub1_3.aShortArrayArray2[local127];
									if (local170 != null) {
										@Pc(180) int local180;
										if (this.aClass47_Sub2_39.aBoolean235) {
											for (local180 = 0; local180 < local170.length; local180++) {
												local70++;
												local84.method3402(local170[local180] & 0xFFFF);
											}
										} else {
											for (local180 = 0; local180 < local170.length; local180++) {
												local84.method3430(local170[local180] & 0xFFFF);
												local70++;
											}
										}
									}
								}
								local127++;
							}
						}
					}
					if (local70 > 0) {
						local3.glMatrixMode(5890);
						local3.glLoadIdentity();
						local3.glScalef(local42, local42, 1.0F);
						local3.glTranslatef((float) -local64 / local42, (float) -local46 / local42, 1.0F);
						local3.glMatrixMode(5888);
						this.aClass12ArrayArray1[local64][local46].method261(local70, local84.aByteArray55);
					}
				}
			}
		}
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!o;III)V")
	public void method5523(@OriginalArg(0) Class4_Sub4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class4_Sub4_Sub4_Sub1 local2 = (Class4_Sub4_Sub4_Sub1) arg0;
		arg1 += local2.anInt2810 + 1;
		arg2 += local2.anInt2812 + 1;
		@Pc(23) int local23 = arg1 + this.anInt6573 * arg2;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt2811;
		@Pc(31) int local31 = local2.anInt2809;
		@Pc(37) int local37 = this.anInt6573 - local31;
		@Pc(48) int local48;
		if (arg2 <= 0) {
			local48 = 1 - arg2;
			local28 -= local48;
			arg2 = 1;
			local23 += local48 * this.anInt6573;
			local25 = local31 * local48;
		}
		@Pc(69) int local69 = 0;
		if (this.anInt6571 <= local28 + arg2) {
			local48 = local28 + arg2 + 1 - this.anInt6571;
			local28 -= local48;
		}
		if (arg1 <= 0) {
			local48 = 1 - arg1;
			local31 -= local48;
			arg1 = 1;
			local69 = local48;
			local25 += local48;
			local23 += local48;
			local37 += local48;
		}
		if (this.anInt6573 <= arg1 + local31) {
			local48 = arg1 + local31 + 1 - this.anInt6573;
			local37 += local48;
			local69 += local48;
			local31 -= local48;
		}
		if (local31 > 0 && local28 > 0) {
			Static371.method5521(local2.aByteArray45, local69, this.aByteArray95, local31, local25, local28, local23, local37);
			this.method5518(arg1, local31, local28, arg2);
		}
	}
}
