import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class100 {

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "[[Lclient!u;")
	private Class227[][] aClass227ArrayArray1;

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "Lclient!ah;")
	private final Class6_Sub1 aClass6_Sub1_1;

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "Lclient!bf;")
	private final Class19_Sub1 aClass19_Sub1_16;

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
	public final int anInt2681;

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
	private final int anInt2680;

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
	private final int anInt2678;

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "[B")
	public final byte[] aByteArray28;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
	private final int anInt2677;

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
	private final int anInt2679;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lclient!bf;Lclient!ah;)V", line = 414)
	public Class100(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) Class6_Sub1 arg1) {
		this.aClass6_Sub1_1 = arg1;
		this.aClass19_Sub1_16 = arg0;
		this.anInt2681 = (this.aClass6_Sub1_1.anInt6308 * this.aClass6_Sub1_1.anInt182 >> this.aClass19_Sub1_16.anInt583) + 2;
		this.anInt2680 = (this.aClass6_Sub1_1.anInt182 * this.aClass6_Sub1_1.anInt6307 >> this.aClass19_Sub1_16.anInt583) + 2;
		this.anInt2678 = this.aClass19_Sub1_16.anInt583 + 7 - this.aClass6_Sub1_1.anInt183;
		this.aByteArray28 = new byte[this.anInt2681 * this.anInt2680];
		this.anInt2677 = this.aClass6_Sub1_1.anInt6308 >> this.anInt2678;
		this.anInt2679 = this.aClass6_Sub1_1.anInt6307 >> this.anInt2678;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V", line = 44)
	public void method2683() {
		this.aClass227ArrayArray1 = new Class227[this.anInt2677][this.anInt2679];
		for (@Pc(8) int local8 = 0; local8 < this.anInt2679; local8++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt2677; local18++) {
				this.aClass227ArrayArray1[local18][local8] = new Class227(this.aClass19_Sub1_16, this, this.aClass6_Sub1_1, local18, local8, this.anInt2678, local18 * 128 + 1, local8 * 128 - -1);
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!kb;IIB)V", line = 73)
	public void method2684(@OriginalArg(0) Class2_Sub2_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class2_Sub2_Sub4_Sub1 local2 = (Class2_Sub2_Sub4_Sub1) arg0;
		arg2 += local2.anInt1304 + 1;
		arg1 += local2.anInt1301 + 1;
		@Pc(23) int local23 = this.anInt2681 * arg1 + arg2;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt1303;
		@Pc(39) int local39 = local2.anInt1302;
		@Pc(44) int local44 = this.anInt2681 - local39;
		@Pc(46) int local46 = 0;
		@Pc(54) int local54;
		if (arg1 <= 0) {
			local54 = 1 - arg1;
			local28 -= local54;
			arg1 = 1;
			local25 = local54 * local39;
			local23 += this.anInt2681 * local54;
		}
		if (this.anInt2680 <= arg1 + local28) {
			local54 = local28 + arg1 + 1 - this.anInt2680;
			local28 -= local54;
		}
		if (arg2 <= 0) {
			local54 = 1 - arg2;
			local46 = local54;
			local44 += local54;
			local23 += local54;
			local39 -= local54;
			local25 += local54;
			arg2 = 1;
		}
		if (this.anInt2681 <= local39 + arg2) {
			local54 = local39 + arg2 + 1 - this.anInt2681;
			local44 += local54;
			local39 -= local54;
			local46 += local54;
		}
		if (local39 > 0 && local28 > 0) {
			Static377.method2682(local28, local2.aByteArray14, local23, local46, local44, local25, this.aByteArray28, local39);
			this.method2686(local28, arg1, local39, arg2);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BIIII)V", line = 197)
	private void method2686(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass227ArrayArray1 == null) {
			return;
		}
		@Pc(18) int local18 = arg3 - 1 >> 7;
		@Pc(28) int local28 = arg3 + arg2 - 1 - 1 >> 7;
		@Pc(34) int local34 = arg1 - 1 >> 7;
		@Pc(44) int local44 = arg0 + arg1 - 1 - 1 >> 7;
		for (@Pc(46) int local46 = local18; local46 <= local28; local46++) {
			@Pc(58) Class227[] local58 = this.aClass227ArrayArray1[local46];
			for (@Pc(60) int local60 = local34; local60 <= local44; local60++) {
				local58[local60].aBoolean432 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILclient!kb;I)Z", line = 234)
	public boolean method2687(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2_Sub4 arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class2_Sub2_Sub4_Sub1 local2 = (Class2_Sub2_Sub4_Sub1) arg1;
		arg0 += local2.anInt1301 + 1;
		arg2 += local2.anInt1304 + 1;
		@Pc(23) int local23 = arg2 + this.anInt2681 * arg0;
		@Pc(26) int local26 = local2.anInt1303;
		@Pc(29) int local29 = local2.anInt1302;
		@Pc(39) int local39;
		if (arg0 <= 0) {
			local39 = 1 - arg0;
			arg0 = 1;
			local26 -= local39;
			local23 += this.anInt2681 * local39;
		}
		@Pc(57) int local57 = this.anInt2681 - local29;
		if (this.anInt2680 <= local26 + arg0) {
			local39 = arg0 + local26 + 1 - this.anInt2680;
			local26 -= local39;
		}
		if (arg2 <= 0) {
			local39 = 1 - arg2;
			local57 += local39;
			arg2 = 1;
			local23 += local39;
			local29 -= local39;
		}
		if (arg2 + local29 >= this.anInt2681) {
			local39 = arg2 + local29 + 1 - this.anInt2681;
			local29 -= local39;
			local57 += local39;
		}
		if (local29 > 0 && local26 > 0) {
			local57 += this.anInt2681 * 7;
			return Static377.method2685(this.aByteArray28, local57, local26, local23, local29);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILclient!kb;II)V", line = 347)
	public void method2689(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub2_Sub4 arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class2_Sub2_Sub4_Sub1 local2 = (Class2_Sub2_Sub4_Sub1) arg1;
		arg0 += local2.anInt1301 + 1;
		arg2 += local2.anInt1304 + 1;
		@Pc(24) int local24 = arg2 + arg0 * this.anInt2681;
		@Pc(26) int local26 = 0;
		@Pc(29) int local29 = local2.anInt1303;
		@Pc(32) int local32 = local2.anInt1302;
		@Pc(38) int local38 = this.anInt2681 - local32;
		@Pc(48) int local48;
		if (arg0 <= 0) {
			local48 = 1 - arg0;
			local26 = local48 * local32;
			local24 += local48 * this.anInt2681;
			arg0 = 1;
			local29 -= local48;
		}
		@Pc(69) int local69 = 0;
		if (this.anInt2680 <= local29 + arg0) {
			local48 = local29 + arg0 + 1 - this.anInt2680;
			local29 -= local48;
		}
		if (arg2 <= 0) {
			local48 = 1 - arg2;
			arg2 = 1;
			local32 -= local48;
			local26 += local48;
			local38 += local48;
			local69 = local48;
			local24 += local48;
		}
		if (this.anInt2681 <= arg2 + local32) {
			local48 = local32 + arg2 + 1 - this.anInt2681;
			local69 += local48;
			local38 += local48;
			local32 -= local48;
		}
		if (local32 > 0 && local29 > 0) {
			Static377.method2688(this.aByteArray28, local2.aByteArray14, local32, local24, local38, local26, local69, local29);
			this.method2686(local29, arg0, local32, arg2);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([[ZIZIII)V", line = 431)
	public void method2690(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) opengl local3 = this.aClass19_Sub1_16.anOpengl1;
		this.aClass19_Sub1_16.method828();
		this.aClass19_Sub1_16.method782(false);
		this.aClass19_Sub1_16.method817(false);
		this.aClass19_Sub1_16.method784();
		this.aClass19_Sub1_16.method792(0);
		this.aClass19_Sub1_16.method779(1);
		@Pc(35) float local35 = 1.0F / (float) (this.aClass19_Sub1_16.anInt580 * 128);
		@Pc(43) int local43;
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(61) int local61;
		@Pc(70) int local70;
		@Pc(77) int local77;
		@Pc(79) int local79;
		if (arg2) {
			for (local43 = 0; local43 < this.anInt2679; local43++) {
				local52 = local43 << this.anInt2678;
				local59 = local43 + 1 << this.anInt2678;
				label130: for (local61 = 0; local61 < this.anInt2677; local61++) {
					local70 = local61 << this.anInt2678;
					local77 = local61 + 1 << this.anInt2678;
					for (local79 = local70; local79 < local77; local79++) {
						if (-arg1 <= local79 - arg4 && arg1 >= local79 - arg4) {
							for (@Pc(105) int local105 = local52; local105 < local59; local105++) {
								if (local105 - arg3 >= -arg1 && local105 - arg3 <= arg1 && arg0[arg1 + local79 - arg4][arg1 + local105 - arg3]) {
									local3.glMatrixMode(5890);
									local3.glLoadIdentity();
									local3.glScalef(local35, local35, 1.0F);
									local3.glTranslatef((float) -local61 / local35, (float) -local43 / local35, 1.0F);
									local3.glMatrixMode(5888);
									this.aClass227ArrayArray1[local61][local43].method5788();
									continue label130;
								}
							}
						}
					}
				}
			}
		} else {
			for (local43 = 0; local43 < this.anInt2679; local43++) {
				local52 = local43 << this.anInt2678;
				local59 = local43 + 1 << this.anInt2678;
				for (local61 = 0; local61 < this.anInt2677; local61++) {
					local70 = 0;
					local77 = local61 << this.anInt2678;
					local79 = local61 + 1 << this.anInt2678;
					@Pc(233) Class2_Sub4 local233 = Class6_Sub1.aClass2_Sub4_1;
					local233.anInt5289 = 0;
					for (@Pc(238) int local238 = local52; local238 < local59; local238++) {
						if (-arg1 <= local238 - arg3 && arg1 >= local238 - arg3) {
							@Pc(267) int local267 = local77 + this.aClass6_Sub1_1.anInt6308 * local238;
							for (@Pc(269) int local269 = local77; local269 < local79; local269++) {
								if (local269 - arg4 >= -arg1 && arg1 >= local269 - arg4 && arg0[arg1 + local269 - arg4][local238 + arg1 - arg3]) {
									@Pc(319) short[] local319 = this.aClass6_Sub1_1.aShortArrayArray1[local267];
									if (local319 != null) {
										@Pc(328) int local328;
										if (this.aClass19_Sub1_16.aBoolean53) {
											for (local328 = 0; local328 < local319.length; local328++) {
												local233.method4844(local319[local328] & 0xFFFF);
												local70++;
											}
										} else {
											for (local328 = 0; local328 < local319.length; local328++) {
												local233.method4846(local319[local328] & 0xFFFF);
												local70++;
											}
										}
									}
								}
								local267++;
							}
						}
					}
					if (local70 > 0) {
						local3.glMatrixMode(5890);
						local3.glLoadIdentity();
						local3.glScalef(local35, local35, 1.0F);
						local3.glTranslatef((float) -local61 / local35, (float) -local43 / local35, 1.0F);
						local3.glMatrixMode(5888);
						this.aClass227ArrayArray1[local61][local43].method5790(local233.aByteArray73, local70);
					}
				}
			}
		}
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
	}
}
