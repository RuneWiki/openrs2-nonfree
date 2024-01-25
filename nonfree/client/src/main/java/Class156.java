import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class156 {

	@OriginalMember(owner = "client!mk", name = "g", descriptor = "[[Lclient!ln;")
	private Class148[][] aClass148ArrayArray1;

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "Lclient!nm;")
	private final Class164_Sub1 aClass164_Sub1_29;

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "Lclient!lg;")
	private final Class42_Sub1 aClass42_Sub1_2;

	@OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
	public final int anInt3809;

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
	private final int anInt3806;

	@OriginalMember(owner = "client!mk", name = "f", descriptor = "[B")
	public final byte[] aByteArray68;

	@OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
	private final int anInt3807;

	@OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
	private final int anInt3808;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
	private final int anInt3805;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lclient!nm;Lclient!lg;)V")
	public Class156(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) Class42_Sub1 arg1) {
		this.aClass164_Sub1_29 = arg0;
		this.aClass42_Sub1_2 = arg1;
		this.anInt3809 = (this.aClass42_Sub1_2.anInt3584 * this.aClass42_Sub1_2.anInt3739 >> this.aClass164_Sub1_29.anInt4065) + 2;
		this.anInt3806 = (this.aClass42_Sub1_2.anInt3742 * this.aClass42_Sub1_2.anInt3584 >> this.aClass164_Sub1_29.anInt4065) + 2;
		this.aByteArray68 = new byte[this.anInt3806 * this.anInt3809];
		this.anInt3807 = this.aClass164_Sub1_29.anInt4065 + 7 - this.aClass42_Sub1_2.anInt3582;
		this.anInt3808 = this.aClass42_Sub1_2.anInt3739 >> this.anInt3807;
		this.anInt3805 = this.aClass42_Sub1_2.anInt3742 >> this.anInt3807;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(II[[ZIZB)V")
	public void method3106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(16) opengl local16 = this.aClass164_Sub1_29.anOpengl1;
		this.aClass164_Sub1_29.method3589();
		this.aClass164_Sub1_29.method3581(false);
		this.aClass164_Sub1_29.method3606(false);
		this.aClass164_Sub1_29.method3630();
		this.aClass164_Sub1_29.method3586(0);
		this.aClass164_Sub1_29.method3607(1);
		@Pc(48) float local48 = 1.0F / (float) (this.aClass164_Sub1_29.anInt4061 * 128);
		@Pc(52) int local52;
		@Pc(61) int local61;
		@Pc(68) int local68;
		@Pc(70) int local70;
		@Pc(76) int local76;
		@Pc(81) int local81;
		@Pc(88) int local88;
		if (arg4) {
			for (local52 = 0; local52 < this.anInt3805; local52++) {
				local61 = local52 << this.anInt3807;
				local68 = local52 + 1 << this.anInt3807;
				label83: for (local70 = 0; local70 < this.anInt3808; local70++) {
					local76 = local70 << this.anInt3807;
					local81 = local70 + 1 << this.anInt3807;
					for (local88 = local76; local88 < local81; local88++) {
						if (local88 - arg0 >= -arg1 && local88 - arg0 <= arg1) {
							for (@Pc(343) int local343 = local61; local343 < local68; local343++) {
								if (-arg1 <= local343 - arg3 && local343 - arg3 <= arg1 && arg2[arg1 + local88 - arg0][arg1 + local343 - arg3]) {
									local16.glMatrixMode(5890);
									local16.glLoadIdentity();
									local16.glScalef(local48, local48, 1.0F);
									local16.glTranslatef((float) -local70 / local48, (float) -local52 / local48, 1.0F);
									local16.glMatrixMode(5888);
									this.aClass148ArrayArray1[local70][local52].method2966();
									continue label83;
								}
							}
						}
					}
				}
			}
		} else {
			for (local52 = 0; local52 < this.anInt3805; local52++) {
				local61 = local52 << this.anInt3807;
				local68 = local52 + 1 << this.anInt3807;
				for (local70 = 0; local70 < this.anInt3808; local70++) {
					local76 = 0;
					local81 = local70 << this.anInt3807;
					local88 = local70 + 1 << this.anInt3807;
					@Pc(90) Class1_Sub33 local90 = Static204.aClass1_Sub33_5;
					local90.lb = 0;
					for (@Pc(95) int local95 = local61; local95 < local68; local95++) {
						if (-arg1 <= local95 - arg3 && arg1 >= local95 - arg3) {
							@Pc(118) int local118 = this.aClass42_Sub1_2.anInt3739 * local95 + local81;
							for (@Pc(120) int local120 = local81; local120 < local88; local120++) {
								if (local120 - arg0 >= -arg1 && local120 - arg0 <= arg1 && arg2[local120 + arg1 - arg0][arg1 + local95 - arg3]) {
									@Pc(170) short[] local170 = this.aClass42_Sub1_2.aShortArrayArray7[local118];
									if (local170 != null) {
										@Pc(179) int local179;
										if (this.aClass164_Sub1_29.aBoolean413) {
											for (local179 = 0; local179 < local170.length; local179++) {
												local76++;
												local90.method5138(local170[local179] & 0xFFFF);
											}
										} else {
											for (local179 = 0; local179 < local170.length; local179++) {
												local76++;
												local90.method5169(local170[local179] & 0xFFFF);
											}
										}
									}
								}
								local118++;
							}
						}
					}
					if (local76 > 0) {
						local16.glMatrixMode(5890);
						local16.glLoadIdentity();
						local16.glScalef(local48, local48, 1.0F);
						local16.glTranslatef((float) -local70 / local48, (float) -local52 / local48, 1.0F);
						local16.glMatrixMode(5888);
						this.aClass148ArrayArray1[local70][local52].method2965(local76, local90.aByteArray86);
					}
				}
			}
		}
		local16.glMatrixMode(5890);
		local16.glLoadIdentity();
		local16.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!fq;III)V")
	public void method3107(@OriginalArg(0) Class1_Sub6_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class1_Sub6_Sub5_Sub1 local2 = (Class1_Sub6_Sub5_Sub1) arg0;
		arg2 += local2.anInt5819 + 1;
		arg1 += local2.anInt5818 + 1;
		@Pc(27) int local27 = this.anInt3809 * arg1 + arg2;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local2.anInt5820;
		@Pc(35) int local35 = local2.anInt5817;
		@Pc(41) int local41 = this.anInt3809 - local35;
		@Pc(51) int local51;
		if (arg1 <= 0) {
			local51 = 1 - arg1;
			arg1 = 1;
			local32 -= local51;
			local27 += local51 * this.anInt3809;
			local29 = local35 * local51;
		}
		@Pc(72) int local72 = 0;
		if (this.anInt3806 <= local32 + arg1) {
			local51 = arg1 + local32 + 1 - this.anInt3806;
			local32 -= local51;
		}
		if (arg2 <= 0) {
			local51 = 1 - arg2;
			local41 += local51;
			local72 = local51;
			arg2 = 1;
			local27 += local51;
			local35 -= local51;
			local29 += local51;
		}
		if (local35 + arg2 >= this.anInt3809) {
			local51 = local35 + arg2 + 1 - this.anInt3809;
			local35 -= local51;
			local72 += local51;
			local41 += local51;
		}
		if (local35 > 0 && local32 > 0) {
			Static401.method3112(local2.aByteArray83, local32, local29, local41, local27, local72, this.aByteArray68, local35);
			this.method3111(arg2, local35, local32, arg1);
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIBLclient!fq;)Z")
	public boolean method3108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub6_Sub5 arg2) {
		@Pc(2) Class1_Sub6_Sub5_Sub1 local2 = (Class1_Sub6_Sub5_Sub1) arg2;
		arg1 += local2.anInt5819 + 1;
		arg0 += local2.anInt5818 + 1;
		@Pc(24) int local24 = arg1 + this.anInt3809 * arg0;
		@Pc(32) int local32 = local2.anInt5820;
		@Pc(35) int local35 = local2.anInt5817;
		@Pc(41) int local41 = this.anInt3809 - local35;
		@Pc(49) int local49;
		if (arg0 <= 0) {
			local49 = 1 - arg0;
			local24 += this.anInt3809 * local49;
			local32 -= local49;
			arg0 = 1;
		}
		if (arg0 + local32 >= this.anInt3806) {
			local49 = arg0 + local32 + 1 - this.anInt3806;
			local32 -= local49;
		}
		if (arg1 <= 0) {
			local49 = 1 - arg1;
			arg1 = 1;
			local35 -= local49;
			local41 += local49;
			local24 += local49;
		}
		if (local35 + arg1 >= this.anInt3809) {
			local49 = local35 + arg1 + 1 - this.anInt3809;
			local41 += local49;
			local35 -= local49;
		}
		if (local35 > 0 && local32 > 0) {
			local41 += this.anInt3809 * 7;
			return Static401.method3110(local41, local35, local24, this.aByteArray68, local32);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILclient!fq;II)V")
	public void method3109(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub6_Sub5 arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class1_Sub6_Sub5_Sub1 local2 = (Class1_Sub6_Sub5_Sub1) arg1;
		arg0 += local2.anInt5819 + 1;
		arg2 += local2.anInt5818 + 1;
		@Pc(23) int local23 = this.anInt3809 * arg2 + arg0;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt5820;
		@Pc(31) int local31 = local2.anInt5817;
		@Pc(36) int local36 = this.anInt3809 - local31;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local23 += local44 * this.anInt3809;
			local25 = local44 * local31;
			local28 -= local44;
			arg2 = 1;
		}
		@Pc(65) int local65 = 0;
		if (local28 + arg2 >= this.anInt3806) {
			local44 = local28 + arg2 + 1 - this.anInt3806;
			local28 -= local44;
		}
		if (arg0 <= 0) {
			local44 = 1 - arg0;
			local65 = local44;
			arg0 = 1;
			local23 += local44;
			local25 += local44;
			local31 -= local44;
			local36 += local44;
		}
		if (local31 + arg0 >= this.anInt3809) {
			local44 = arg0 + local31 + 1 - this.anInt3809;
			local31 -= local44;
			local65 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			Static401.method3114(local2.aByteArray83, local28, local65, local36, local23, local25, this.aByteArray68, local31);
			this.method3111(arg0, local31, local28, arg2);
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIB)V")
	private void method3111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass148ArrayArray1 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 - 1 >> 7;
		@Pc(19) int local19 = arg1 + arg0 - 1 - 1 >> 7;
		@Pc(25) int local25 = arg3 - 1 >> 7;
		@Pc(35) int local35 = arg3 + arg2 - 1 - 1 >> 7;
		for (@Pc(41) int local41 = local9; local41 <= local19; local41++) {
			@Pc(53) Class148[] local53 = this.aClass148ArrayArray1[local41];
			for (@Pc(55) int local55 = local25; local55 <= local35; local55++) {
				local53[local55].aBoolean353 = true;
			}
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
	public void method3113() {
		this.aClass148ArrayArray1 = new Class148[this.anInt3808][this.anInt3805];
		for (@Pc(18) int local18 = 0; local18 < this.anInt3805; local18++) {
			for (@Pc(28) int local28 = 0; local28 < this.anInt3808; local28++) {
				this.aClass148ArrayArray1[local28][local18] = new Class148(this.aClass164_Sub1_29, this, this.aClass42_Sub1_2, local28, local18, this.anInt3807, local28 * 128 + 1, local18 * 128 - -1);
			}
		}
	}
}
