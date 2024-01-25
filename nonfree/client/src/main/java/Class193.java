import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public final class Class193 {

	@OriginalMember(owner = "client!sr", name = "i", descriptor = "[[Lclient!qr;")
	private Class173[][] aClass173ArrayArray1;

	@OriginalMember(owner = "client!sr", name = "e", descriptor = "Lclient!ge;")
	private final Class26_Sub1 aClass26_Sub1_2;

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "Lclient!ql;")
	private final Class92_Sub2 aClass92_Sub2_36;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
	public final int anInt6007;

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "I")
	private final int anInt6008;

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "[B")
	public final byte[] aByteArray86;

	@OriginalMember(owner = "client!sr", name = "h", descriptor = "I")
	private final int anInt6011;

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
	private final int anInt6009;

	@OriginalMember(owner = "client!sr", name = "g", descriptor = "I")
	private final int anInt6010;

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Lclient!ql;Lclient!ge;)V")
	public Class193(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) Class26_Sub1 arg1) {
		this.aClass26_Sub1_2 = arg1;
		this.aClass92_Sub2_36 = arg0;
		this.anInt6007 = (this.aClass26_Sub1_2.anInt5941 * this.aClass26_Sub1_2.anInt2238 >> this.aClass92_Sub2_36.anInt5383) + 2;
		this.anInt6008 = (this.aClass26_Sub1_2.anInt2238 * this.aClass26_Sub1_2.anInt5936 >> this.aClass92_Sub2_36.anInt5383) + 2;
		this.aByteArray86 = new byte[this.anInt6008 * this.anInt6007];
		this.anInt6011 = this.aClass92_Sub2_36.anInt5383 + 7 - this.aClass26_Sub1_2.anInt2239;
		this.anInt6009 = this.aClass26_Sub1_2.anInt5941 >> this.anInt6011;
		this.anInt6010 = this.aClass26_Sub1_2.anInt5936 >> this.anInt6011;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IBILclient!ve;)V")
	public void method5048(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4_Sub1_Sub1 arg2) {
		@Pc(2) Class4_Sub1_Sub1_Sub1 local2 = (Class4_Sub1_Sub1_Sub1) arg2;
		arg0 += local2.anInt93 + 1;
		arg1 += local2.anInt94 + 1;
		@Pc(23) int local23 = this.anInt6007 * arg1 + arg0;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt95;
		@Pc(31) int local31 = local2.anInt96;
		@Pc(36) int local36 = this.anInt6007 - local31;
		@Pc(38) int local38 = 0;
		@Pc(48) int local48;
		if (arg1 <= 0) {
			local48 = 1 - arg1;
			arg1 = 1;
			local25 = local48 * local31;
			local23 += this.anInt6007 * local48;
			local28 -= local48;
		}
		if (this.anInt6008 <= local28 + arg1) {
			local48 = arg1 + local28 + 1 - this.anInt6008;
			local28 -= local48;
		}
		if (arg0 <= 0) {
			local48 = 1 - arg0;
			local25 += local48;
			local38 = local48;
			local23 += local48;
			arg0 = 1;
			local31 -= local48;
			local36 += local48;
		}
		if (this.anInt6007 <= arg0 + local31) {
			local48 = arg0 + local31 + 1 - this.anInt6007;
			local38 += local48;
			local36 += local48;
			local31 -= local48;
		}
		if (local31 > 0 && local28 > 0) {
			Static365.method5052(local2.aByteArray1, local31, local36, this.aByteArray86, local38, local28, local25, local23);
			this.method5051(local31, arg1, arg0, local28);
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V")
	public void method5050() {
		this.aClass173ArrayArray1 = new Class173[this.anInt6009][this.anInt6010];
		for (@Pc(12) int local12 = 0; local12 < this.anInt6010; local12++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt6009; local18++) {
				this.aClass173ArrayArray1[local18][local12] = new Class173(this.aClass92_Sub2_36, this, this.aClass26_Sub1_2, local18, local12, this.anInt6011, local18 * 128 + 1, local12 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIBI)V")
	private void method5051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass173ArrayArray1 == null) {
			return;
		}
		@Pc(9) int local9 = arg2 - 1 >> 7;
		@Pc(19) int local19 = arg2 + arg0 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg1 - 1 >> 7;
		@Pc(42) int local42 = arg1 + arg3 - 1 - 1 >> 7;
		for (@Pc(44) int local44 = local9; local44 <= local19; local44++) {
			@Pc(56) Class173[] local56 = this.aClass173ArrayArray1[local44];
			for (@Pc(58) int local58 = local31; local58 <= local42; local58++) {
				local56[local58].aBoolean484 = true;
			}
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!ve;IIB)Z")
	public boolean method5053(@OriginalArg(0) Class4_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class4_Sub1_Sub1_Sub1 local2 = (Class4_Sub1_Sub1_Sub1) arg0;
		arg1 += local2.anInt94 + 1;
		arg2 += local2.anInt93 + 1;
		@Pc(23) int local23 = arg1 * this.anInt6007 + arg2;
		@Pc(26) int local26 = local2.anInt95;
		@Pc(29) int local29 = local2.anInt96;
		@Pc(38) int local38;
		if (arg1 <= 0) {
			local38 = 1 - arg1;
			arg1 = 1;
			local26 -= local38;
			local23 += local38 * this.anInt6007;
		}
		@Pc(57) int local57 = this.anInt6007 - local29;
		if (this.anInt6008 <= local26 + arg1) {
			local38 = local26 + arg1 + 1 - this.anInt6008;
			local26 -= local38;
		}
		if (arg2 <= 0) {
			local38 = 1 - arg2;
			local57 += local38;
			local29 -= local38;
			local23 += local38;
			arg2 = 1;
		}
		if (this.anInt6007 <= arg2 + local29) {
			local38 = local29 + arg2 + 1 - this.anInt6007;
			local57 += local38;
			local29 -= local38;
		}
		if (local29 > 0 && local26 > 0) {
			local57 += this.anInt6007 * 7;
			return Static365.method5049(local23, local57, local29, this.aByteArray86, local26);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIZ[[ZI)V")
	public void method5054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean[][] arg4) {
		@Pc(3) opengl local3 = this.aClass92_Sub2_36.anOpengl2;
		this.aClass92_Sub2_36.method4582();
		this.aClass92_Sub2_36.method4607(false);
		this.aClass92_Sub2_36.method4593(false);
		this.aClass92_Sub2_36.method4604();
		this.aClass92_Sub2_36.method4570(0);
		this.aClass92_Sub2_36.method4560(1);
		@Pc(35) float local35 = 1.0F / (float) (this.aClass92_Sub2_36.anInt5381 * 128);
		@Pc(39) int local39;
		@Pc(48) int local48;
		@Pc(55) int local55;
		@Pc(57) int local57;
		@Pc(70) int local70;
		@Pc(77) int local77;
		@Pc(79) int local79;
		@Pc(101) int local101;
		if (arg3) {
			for (local39 = 0; local39 < this.anInt6010; local39++) {
				local48 = local39 << this.anInt6011;
				local55 = local39 + 1 << this.anInt6011;
				label130: for (local57 = 0; local57 < this.anInt6009; local57++) {
					local70 = local57 << this.anInt6011;
					local77 = local57 + 1 << this.anInt6011;
					for (local79 = local70; local79 < local77; local79++) {
						if (-arg2 <= local79 - arg1 && arg2 >= local79 - arg1) {
							for (local101 = local48; local101 < local55; local101++) {
								if (local101 - arg0 >= -arg2 && arg2 >= local101 - arg0 && arg4[local79 + arg2 - arg1][local101 + arg2 - arg0]) {
									local3.glMatrixMode(5890);
									local3.glLoadIdentity();
									local3.glScalef(local35, local35, 1.0F);
									local3.glTranslatef((float) -local57 / local35, (float) -local39 / local35, 1.0F);
									local3.glMatrixMode(5888);
									this.aClass173ArrayArray1[local57][local39].method4651();
									continue label130;
								}
							}
						}
					}
				}
			}
		} else {
			for (local39 = 0; local39 < this.anInt6010; local39++) {
				local48 = local39 << this.anInt6011;
				local55 = local39 + 1 << this.anInt6011;
				for (local57 = 0; local57 < this.anInt6009; local57++) {
					local70 = 0;
					local77 = local57 << this.anInt6011;
					Static99.aClass4_Sub7_1.anInt2667 = 0;
					local79 = local57 + 1 << this.anInt6011;
					for (local101 = local48; local101 < local55; local101++) {
						if (-arg2 <= local101 - arg0 && arg2 >= local101 - arg0) {
							@Pc(259) int local259 = local101 * this.aClass26_Sub1_2.anInt5941 + local77;
							for (@Pc(261) int local261 = local77; local261 < local79; local261++) {
								if (-arg2 <= local261 - arg1 && arg2 >= local261 - arg1 && arg4[local261 + arg2 - arg1][local101 + arg2 - arg0]) {
									@Pc(302) short[] local302 = this.aClass26_Sub1_2.aShortArrayArray4[local259];
									if (local302 != null) {
										@Pc(311) int local311;
										if (this.aClass92_Sub2_36.aBoolean459) {
											for (local311 = 0; local311 < local302.length; local311++) {
												local70++;
												Static99.aClass4_Sub7_1.method2376(local302[local311]);
											}
										} else {
											for (local311 = 0; local311 < local302.length; local311++) {
												Static99.aClass4_Sub7_1.method2400(local302[local311]);
												local70++;
											}
										}
									}
								}
								local259++;
							}
						}
					}
					if (local70 > 0) {
						local3.glMatrixMode(5890);
						local3.glLoadIdentity();
						local3.glScalef(local35, local35, 1.0F);
						local3.glTranslatef((float) -local57 / local35, (float) -local39 / local35, 1.0F);
						local3.glMatrixMode(5888);
						this.aClass92_Sub2_36.anInterface3_4.method4363(Static99.aClass4_Sub7_1.aByteArray42, local70 * 2);
						this.aClass173ArrayArray1[local57][local39].method4652(local70, this.aClass92_Sub2_36.anInterface3_4);
					}
				}
			}
		}
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(ILclient!ve;IZ)V")
	public void method5055(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1_Sub1 arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class4_Sub1_Sub1_Sub1 local2 = (Class4_Sub1_Sub1_Sub1) arg1;
		arg0 += local2.anInt94 + 1;
		arg2 += local2.anInt93 + 1;
		@Pc(24) int local24 = arg2 + arg0 * this.anInt6007;
		@Pc(26) int local26 = 0;
		@Pc(29) int local29 = local2.anInt95;
		@Pc(36) int local36 = local2.anInt96;
		@Pc(42) int local42 = this.anInt6007 - local36;
		@Pc(52) int local52;
		if (arg0 <= 0) {
			local52 = 1 - arg0;
			local26 = local52 * local36;
			arg0 = 1;
			local24 += local52 * this.anInt6007;
			local29 -= local52;
		}
		@Pc(73) int local73 = 0;
		if (local29 + arg0 >= this.anInt6008) {
			local52 = arg0 + local29 + 1 - this.anInt6008;
			local29 -= local52;
		}
		if (arg2 <= 0) {
			local52 = 1 - arg2;
			arg2 = 1;
			local73 = local52;
			local36 -= local52;
			local26 += local52;
			local24 += local52;
			local42 += local52;
		}
		if (this.anInt6007 <= arg2 + local36) {
			local52 = arg2 + local36 + 1 - this.anInt6007;
			local73 += local52;
			local42 += local52;
			local36 -= local52;
		}
		if (local36 > 0 && local29 > 0) {
			Static365.method5056(local42, local36, this.aByteArray86, local29, local2.aByteArray1, local73, local24, local26);
			this.method5051(local36, arg0, arg2, local29);
		}
	}
}
