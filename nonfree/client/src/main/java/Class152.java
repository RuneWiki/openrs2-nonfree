import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class152 {

	@OriginalMember(owner = "client!om", name = "i", descriptor = "[[Lclient!bp;")
	private Class27[][] aClass27ArrayArray1;

	@OriginalMember(owner = "client!om", name = "e", descriptor = "Lclient!kk;")
	private final Class12_Sub2 aClass12_Sub2_3;

	@OriginalMember(owner = "client!om", name = "g", descriptor = "Lclient!nf;")
	private final Class105_Sub1 aClass105_Sub1_28;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "I")
	public final int anInt4628;

	@OriginalMember(owner = "client!om", name = "f", descriptor = "I")
	private final int anInt4631;

	@OriginalMember(owner = "client!om", name = "h", descriptor = "I")
	private final int anInt4632;

	@OriginalMember(owner = "client!om", name = "b", descriptor = "[B")
	public final byte[] aByteArray51;

	@OriginalMember(owner = "client!om", name = "c", descriptor = "I")
	private final int anInt4629;

	@OriginalMember(owner = "client!om", name = "d", descriptor = "I")
	private final int anInt4630;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!nf;Lclient!kk;)V")
	public Class152(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) Class12_Sub2 arg1) {
		this.aClass12_Sub2_3 = arg1;
		this.aClass105_Sub1_28 = arg0;
		this.anInt4628 = (this.aClass12_Sub2_3.anInt3162 * this.aClass12_Sub2_3.anInt3171 >> this.aClass105_Sub1_28.anInt4173) + 2;
		this.anInt4631 = (this.aClass12_Sub2_3.anInt3171 * this.aClass12_Sub2_3.anInt3163 >> this.aClass105_Sub1_28.anInt4173) + 2;
		this.anInt4632 = this.aClass105_Sub1_28.anInt4173 + 7 - this.aClass12_Sub2_3.anInt3170;
		this.aByteArray51 = new byte[this.anInt4628 * this.anInt4631];
		this.anInt4629 = this.aClass12_Sub2_3.anInt3162 >> this.anInt4632;
		this.anInt4630 = this.aClass12_Sub2_3.anInt3163 >> this.anInt4632;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "([[ZIIIIZ)V")
	public void method4020(@OriginalArg(0) boolean[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(3) opengl local3 = this.aClass105_Sub1_28.anOpengl1;
		this.aClass105_Sub1_28.method3610();
		this.aClass105_Sub1_28.method3570(false);
		this.aClass105_Sub1_28.method3589(false);
		this.aClass105_Sub1_28.method3613();
		this.aClass105_Sub1_28.method3618(0);
		this.aClass105_Sub1_28.method3603(1);
		@Pc(35) float local35 = 1.0F / (float) (this.aClass105_Sub1_28.anInt4170 * 128);
		@Pc(39) int local39;
		@Pc(48) int local48;
		@Pc(55) int local55;
		@Pc(57) int local57;
		@Pc(70) int local70;
		@Pc(77) int local77;
		@Pc(79) int local79;
		@Pc(105) int local105;
		if (arg4) {
			for (local39 = 0; local39 < this.anInt4630; local39++) {
				local48 = local39 << this.anInt4632;
				local55 = local39 + 1 << this.anInt4632;
				label130: for (local57 = 0; local57 < this.anInt4629; local57++) {
					local70 = local57 << this.anInt4632;
					local77 = local57 + 1 << this.anInt4632;
					for (local79 = local70; local79 < local77; local79++) {
						if (-arg2 <= local79 - arg3 && arg2 >= local79 - arg3) {
							for (local105 = local48; local105 < local55; local105++) {
								if (-arg2 <= local105 - arg1 && arg2 >= local105 - arg1 && arg0[local79 + arg2 - arg3][arg2 + local105 - arg1]) {
									local3.glMatrixMode(5890);
									local3.glLoadIdentity();
									local3.glScalef(local35, local35, 1.0F);
									local3.glTranslatef((float) -local57 / local35, (float) -local39 / local35, 1.0F);
									local3.glMatrixMode(5888);
									this.aClass27ArrayArray1[local57][local39].method508();
									continue label130;
								}
							}
						}
					}
				}
			}
		} else {
			for (local39 = 0; local39 < this.anInt4630; local39++) {
				local48 = local39 << this.anInt4632;
				local55 = local39 + 1 << this.anInt4632;
				for (local57 = 0; local57 < this.anInt4629; local57++) {
					local70 = 0;
					local77 = local57 << this.anInt4632;
					local79 = local57 + 1 << this.anInt4632;
					Static155.aClass1_Sub21_3.anInt6611 = 0;
					for (local105 = local48; local105 < local55; local105++) {
						if (-arg2 <= local105 - arg1 && local105 - arg1 <= arg2) {
							@Pc(259) int local259 = local77 + this.aClass12_Sub2_3.anInt3162 * local105;
							for (@Pc(261) int local261 = local77; local261 < local79; local261++) {
								if (local261 - arg3 >= -arg2 && arg2 >= local261 - arg3 && arg0[local261 + arg2 - arg3][local105 + arg2 - arg1]) {
									@Pc(304) short[] local304 = this.aClass12_Sub2_3.aShortArrayArray10[local259];
									if (local304 != null) {
										@Pc(313) int local313;
										if (this.aClass105_Sub1_28.aBoolean316) {
											for (local313 = 0; local313 < local304.length; local313++) {
												local70++;
												Static155.aClass1_Sub21_3.method5698(local304[local313]);
											}
										} else {
											for (local313 = 0; local313 < local304.length; local313++) {
												local70++;
												Static155.aClass1_Sub21_3.method5731(local304[local313]);
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
						this.aClass105_Sub1_28.anInterface8_5.method1583(Static155.aClass1_Sub21_3.aByteArray82, local70 * 2);
						this.aClass27ArrayArray1[local57][local39].method506(local70, this.aClass105_Sub1_28.anInterface8_5);
					}
				}
			}
		}
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIII)V")
	private void method4022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass27ArrayArray1 == null) {
			return;
		}
		@Pc(10) int local10 = arg2 - 1 >> 7;
		@Pc(20) int local20 = arg3 + arg2 - 1 - 1 >> 7;
		@Pc(26) int local26 = arg1 - 1 >> 7;
		@Pc(36) int local36 = arg0 + arg1 - 1 - 1 >> 7;
		for (@Pc(38) int local38 = local10; local38 <= local20; local38++) {
			@Pc(50) Class27[] local50 = this.aClass27ArrayArray1[local38];
			for (@Pc(52) int local52 = local26; local52 <= local36; local52++) {
				local50[local52].aBoolean38 = true;
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IILclient!ri;Z)V")
	public void method4023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub2_Sub5 arg2) {
		@Pc(2) Class1_Sub2_Sub5_Sub1 local2 = (Class1_Sub2_Sub5_Sub1) arg2;
		arg0 += local2.anInt2037 + 1;
		arg1 += local2.anInt2038 + 1;
		@Pc(26) int local26 = arg0 + arg1 * this.anInt4628;
		@Pc(28) int local28 = 0;
		@Pc(31) int local31 = local2.anInt2040;
		@Pc(34) int local34 = local2.anInt2039;
		@Pc(40) int local40 = this.anInt4628 - local34;
		@Pc(42) int local42 = 0;
		@Pc(52) int local52;
		if (arg1 <= 0) {
			local52 = 1 - arg1;
			local28 = local34 * local52;
			arg1 = 1;
			local26 += this.anInt4628 * local52;
			local31 -= local52;
		}
		if (this.anInt4631 <= local31 + arg1) {
			local52 = arg1 + local31 + 1 - this.anInt4631;
			local31 -= local52;
		}
		if (arg0 <= 0) {
			local52 = 1 - arg0;
			local34 -= local52;
			arg0 = 1;
			local26 += local52;
			local40 += local52;
			local42 = local52;
			local28 += local52;
		}
		if (this.anInt4628 <= local34 + arg0) {
			local52 = local34 + arg0 + 1 - this.anInt4628;
			local34 -= local52;
			local42 += local52;
			local40 += local52;
		}
		if (local34 > 0 && local31 > 0) {
			Static368.method4024(local2.aByteArray15, local28, local40, local26, this.aByteArray51, local34, local31, local42);
			this.method4022(local31, arg1, arg0, local34);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZIILclient!ri;)Z")
	public boolean method4025(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub2_Sub5 arg2) {
		@Pc(2) Class1_Sub2_Sub5_Sub1 local2 = (Class1_Sub2_Sub5_Sub1) arg2;
		arg0 += local2.anInt2038 + 1;
		arg1 += local2.anInt2037 + 1;
		@Pc(24) int local24 = arg1 + arg0 * this.anInt4628;
		@Pc(27) int local27 = local2.anInt2040;
		@Pc(30) int local30 = local2.anInt2039;
		@Pc(41) int local41 = this.anInt4628 - local30;
		@Pc(51) int local51;
		if (arg0 <= 0) {
			local51 = 1 - arg0;
			local27 -= local51;
			local24 += this.anInt4628 * local51;
			arg0 = 1;
		}
		if (this.anInt4631 <= local27 + arg0) {
			local51 = local27 + arg0 + 1 - this.anInt4631;
			local27 -= local51;
		}
		if (arg1 <= 0) {
			local51 = 1 - arg1;
			local41 += local51;
			arg1 = 1;
			local24 += local51;
			local30 -= local51;
		}
		if (this.anInt4628 <= arg1 + local30) {
			local51 = local30 + arg1 + 1 - this.anInt4628;
			local41 += local51;
			local30 -= local51;
		}
		if (local30 > 0 && local27 > 0) {
			local41 += this.anInt4628 * 7;
			return Static368.method4019(local24, local27, this.aByteArray51, local30, local41);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V")
	public void method4026() {
		this.aClass27ArrayArray1 = new Class27[this.anInt4629][this.anInt4630];
		for (@Pc(16) int local16 = 0; local16 < this.anInt4630; local16++) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt4629; local22++) {
				this.aClass27ArrayArray1[local22][local16] = new Class27(this.aClass105_Sub1_28, this, this.aClass12_Sub2_3, local22, local16, this.anInt4632, local22 * 128 + 1, local16 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZLclient!ri;II)V")
	public void method4027(@OriginalArg(1) Class1_Sub2_Sub5 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1_Sub2_Sub5_Sub1 local8 = (Class1_Sub2_Sub5_Sub1) arg0;
		arg2 += local8.anInt2037 + 1;
		arg1 += local8.anInt2038 + 1;
		@Pc(29) int local29 = arg1 * this.anInt4628 + arg2;
		@Pc(31) int local31 = 0;
		@Pc(34) int local34 = local8.anInt2040;
		@Pc(37) int local37 = local8.anInt2039;
		@Pc(43) int local43 = this.anInt4628 - local37;
		@Pc(53) int local53;
		if (arg1 <= 0) {
			local53 = 1 - arg1;
			local34 -= local53;
			arg1 = 1;
			local31 = local37 * local53;
			local29 += local53 * this.anInt4628;
		}
		@Pc(74) int local74 = 0;
		if (arg1 + local34 >= this.anInt4631) {
			local53 = local34 + arg1 + 1 - this.anInt4631;
			local34 -= local53;
		}
		if (arg2 <= 0) {
			local53 = 1 - arg2;
			local29 += local53;
			local31 += local53;
			local37 -= local53;
			local43 += local53;
			local74 = local53;
			arg2 = 1;
		}
		if (local37 + arg2 >= this.anInt4628) {
			local53 = arg2 + local37 + 1 - this.anInt4628;
			local37 -= local53;
			local74 += local53;
			local43 += local53;
		}
		if (local37 > 0 && local34 > 0) {
			Static368.method4021(local34, local31, local43, local74, local8.aByteArray15, this.aByteArray51, local37, local29);
			this.method4022(local34, arg1, arg2, local37);
		}
	}
}
