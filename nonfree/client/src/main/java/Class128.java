import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class128 {

	@OriginalMember(owner = "client!hg", name = "k", descriptor = "[[Lclient!ag;")
	private Class12[][] aClass12ArrayArray1;

	@OriginalMember(owner = "client!hg", name = "r", descriptor = "Lclient!hm;")
	private final Class131_Sub1 aClass131_Sub1_3;

	@OriginalMember(owner = "client!hg", name = "j", descriptor = "Lclient!nd;")
	private final Class62_Sub1 aClass62_Sub1_8;

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
	public final int anInt3511;

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
	private final int anInt3510;

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
	private final int anInt3512;

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "[B")
	public final byte[] aByteArray50;

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
	private final int anInt3509;

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
	private final int anInt3513;

	static {
		new Class40("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
	}

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lclient!nd;Lclient!hm;)V")
	public Class128(@OriginalArg(0) Class62_Sub1 arg0, @OriginalArg(1) Class131_Sub1 arg1) {
		this.aClass131_Sub1_3 = arg1;
		this.aClass62_Sub1_8 = arg0;
		this.anInt3511 = (this.aClass131_Sub1_3.anInt8874 * this.aClass131_Sub1_3.anInt8873 >> this.aClass62_Sub1_8.anInt5686) + 2;
		this.anInt3510 = (this.aClass131_Sub1_3.anInt8874 * this.aClass131_Sub1_3.anInt8871 >> this.aClass62_Sub1_8.anInt5686) + 2;
		this.anInt3512 = this.aClass62_Sub1_8.anInt5686 + 7 - this.aClass131_Sub1_3.anInt8869;
		this.aByteArray50 = new byte[this.anInt3510 * this.anInt3511];
		this.anInt3509 = this.aClass131_Sub1_3.anInt8873 >> this.anInt3512;
		this.anInt3513 = this.aClass131_Sub1_3.anInt8871 >> this.anInt3512;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IILclient!k;B)V")
	public void method3087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub2_Sub13 arg2) {
		@Pc(14) Class5_Sub2_Sub13_Sub2 local14 = (Class5_Sub2_Sub13_Sub2) arg2;
		arg0 += local14.anInt5862 + 1;
		arg1 += local14.anInt5857 + 1;
		@Pc(35) int local35 = arg0 * this.anInt3511 + arg1;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = local14.anInt5859;
		@Pc(43) int local43 = local14.anInt5863;
		@Pc(48) int local48 = this.anInt3511 - local43;
		@Pc(50) int local50 = 0;
		@Pc(60) int local60;
		if (arg0 <= 0) {
			local60 = 1 - arg0;
			local40 -= local60;
			local35 += this.anInt3511 * local60;
			local37 = local43 * local60;
			arg0 = 1;
		}
		if (this.anInt3510 <= arg0 + local40) {
			local60 = local40 + arg0 + 1 - this.anInt3510;
			local40 -= local60;
		}
		if (arg1 <= 0) {
			local60 = 1 - arg1;
			local37 += local60;
			arg1 = 1;
			local48 += local60;
			local43 -= local60;
			local50 = local60;
			local35 += local60;
		}
		if (this.anInt3511 <= arg1 + local43) {
			local60 = local43 + arg1 + 1 - this.anInt3511;
			local43 -= local60;
			local48 += local60;
			local50 += local60;
		}
		if (local43 > 0 && local40 > 0) {
			Static479.method6661(local40, local50, local48, local43, local37, this.aByteArray50, local35, local14.aByteArray80);
			this.method3094(local40, local43, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BILclient!k;I)V")
	public void method3088(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub2_Sub13 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class5_Sub2_Sub13_Sub2 local6 = (Class5_Sub2_Sub13_Sub2) arg1;
		arg0 += local6.anInt5857 + 1;
		arg2 += local6.anInt5862 + 1;
		@Pc(27) int local27 = arg0 + arg2 * this.anInt3511;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt5859;
		@Pc(39) int local39 = local6.anInt5863;
		@Pc(45) int local45 = this.anInt3511 - local39;
		@Pc(52) int local52;
		if (arg2 <= 0) {
			local52 = 1 - arg2;
			arg2 = 1;
			local27 += local52 * this.anInt3511;
			local29 = local39 * local52;
			local32 -= local52;
		}
		@Pc(73) int local73 = 0;
		if (local32 + arg2 >= this.anInt3510) {
			local52 = local32 + arg2 + 1 - this.anInt3510;
			local32 -= local52;
		}
		if (arg0 <= 0) {
			local52 = 1 - arg0;
			local29 += local52;
			local27 += local52;
			local73 = local52;
			local45 += local52;
			local39 -= local52;
			arg0 = 1;
		}
		if (this.anInt3511 <= arg0 + local39) {
			local52 = arg0 + local39 + 1 - this.anInt3511;
			local73 += local52;
			local45 += local52;
			local39 -= local52;
		}
		if (local39 > 0 && local32 > 0) {
			Static446.method7435(local6.aByteArray80, local27, this.aByteArray50, local45, local32, local73, local39, local29);
			this.method3094(local32, local39, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IBILclient!k;)Z")
	public boolean method3089(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub2_Sub13 arg2) {
		@Pc(14) Class5_Sub2_Sub13_Sub2 local14 = (Class5_Sub2_Sub13_Sub2) arg2;
		arg1 += local14.anInt5862 + 1;
		arg0 += local14.anInt5857 + 1;
		@Pc(35) int local35 = this.anInt3511 * arg1 + arg0;
		@Pc(38) int local38 = local14.anInt5859;
		@Pc(41) int local41 = local14.anInt5863;
		@Pc(46) int local46 = this.anInt3511 - local41;
		@Pc(56) int local56;
		if (arg1 <= 0) {
			local56 = 1 - arg1;
			arg1 = 1;
			local38 -= local56;
			local35 += local56 * this.anInt3511;
		}
		if (this.anInt3510 <= local38 + arg1) {
			local56 = arg1 + local38 + 1 - this.anInt3510;
			local38 -= local56;
		}
		if (arg0 <= 0) {
			local56 = 1 - arg0;
			local41 -= local56;
			arg0 = 1;
			local46 += local56;
			local35 += local56;
		}
		if (this.anInt3511 <= local41 + arg0) {
			local56 = arg0 + local41 + 1 - this.anInt3511;
			local46 += local56;
			local41 -= local56;
		}
		if (local41 > 0 && local38 > 0) {
			local46 += this.anInt3511 * 7;
			return Static209.method3377(local46, local35, local41, local38, this.aByteArray50);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(III[[ZBZ)V")
	public void method3090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(5) boolean arg4) {
		this.aClass62_Sub1_8.method4760(false);
		this.aClass62_Sub1_8.method4752(false);
		this.aClass62_Sub1_8.method4754(1);
		this.aClass62_Sub1_8.method4714(1);
		this.aClass62_Sub1_8.method4656(-2, false, false);
		@Pc(49) float local49 = 1.0F / (float) (this.aClass62_Sub1_8.anInt5660 * 128);
		@Pc(53) int local53;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(69) int local69;
		if (arg4) {
			for (local53 = 0; local53 < this.anInt3513; local53++) {
				local60 = local53 << this.anInt3512;
				local67 = local53 + 1 << this.anInt3512;
				label87: for (local69 = 0; local69 < this.anInt3509; local69++) {
					if (this.aClass12ArrayArray1[local69][local53] != null) {
						@Pc(335) int local335 = local69 << this.anInt3512;
						@Pc(342) int local342 = local69 + 1 << this.anInt3512;
						for (@Pc(344) int local344 = local335; local344 < local342; local344++) {
							if (local344 - arg2 >= -arg0 && local344 - arg2 <= arg0) {
								for (@Pc(365) int local365 = local60; local365 < local67; local365++) {
									if (-arg0 <= local365 - arg1 && arg0 >= local365 - arg1 && arg3[arg0 + local344 - arg2][local365 + arg0 - arg1]) {
										@Pc(409) Class78_Sub1 local409 = this.aClass62_Sub1_8.method4705();
										local409.method2189(local49, local49, 1.0F);
										local409.TA(-local69, -local53, 0);
										this.aClass62_Sub1_8.method4741(Static272.aClass273_4);
										this.aClass12ArrayArray1[local69][local53].method327();
										continue label87;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local53 = 0; local53 < this.anInt3513; local53++) {
				local60 = local53 << this.anInt3512;
				local67 = local53 + 1 << this.anInt3512;
				for (local69 = 0; local69 < this.anInt3509; local69++) {
					@Pc(78) Class12 local78 = this.aClass12ArrayArray1[local69][local53];
					if (local78 != null) {
						@Pc(89) Interface13 local89 = this.aClass62_Sub1_8.method4770(local78.anInt186 * 3);
						@Pc(94) Buffer local94 = local89.method3487();
						if (local94 != null) {
							@Pc(102) Stream local102 = this.aClass62_Sub1_8.method4693(local94);
							@Pc(104) int local104 = 0;
							@Pc(109) int local109 = local69 << this.anInt3512;
							@Pc(116) int local116 = local69 + 1 << this.anInt3512;
							for (@Pc(118) int local118 = local60; local118 < local67; local118++) {
								if (-arg0 <= local118 - arg1 && local118 - arg1 <= arg0) {
									@Pc(145) int local145 = local109 + local118 * this.aClass131_Sub1_3.anInt8873;
									for (@Pc(147) int local147 = local109; local147 < local116; local147++) {
										if (local147 - arg2 >= -arg0 && arg0 >= local147 - arg2 && arg3[arg0 + local147 - arg2][local118 + arg0 - arg1]) {
											@Pc(185) short[] local185 = this.aClass131_Sub1_3.aShortArrayArray6[local145];
											if (local185 != null) {
												@Pc(191) int local191;
												if (Stream.c()) {
													for (local191 = 0; local191 < local185.length; local191++) {
														local104++;
														local102.e(local185[local191] & 0xFFFF);
													}
												} else {
													for (local191 = 0; local191 < local185.length; local191++) {
														local104++;
														local102.a(local185[local191] & 0xFFFF);
													}
												}
											}
										}
										local145++;
									}
								}
							}
							local102.b();
							if (local89.method3492() && local104 > 0) {
								@Pc(262) Class78_Sub1 local262 = this.aClass62_Sub1_8.method4705();
								local262.method2189(local49, local49, 1.0F);
								local262.TA(-local69, -local53, 0);
								this.aClass62_Sub1_8.method4741(Static272.aClass273_4);
								local78.method325(local104 / 3, local89);
							}
						}
					}
				}
			}
		}
		this.aClass62_Sub1_8.method4757();
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
	public void method3091() {
		this.aClass12ArrayArray1 = new Class12[this.anInt3509][this.anInt3513];
		for (@Pc(19) int local19 = 0; local19 < this.anInt3513; local19++) {
			for (@Pc(23) int local23 = 0; local23 < this.anInt3509; local23++) {
				this.aClass12ArrayArray1[local23][local19] = new Class12(this.aClass62_Sub1_8, this, this.aClass131_Sub1_3, local23, local19, this.anInt3512, local23 * 128 + 1, local19 * 128 - -1);
				if (this.aClass12ArrayArray1[local23][local19].anInt186 == 0) {
					this.aClass12ArrayArray1[local23][local19] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIII)V")
	private void method3094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass12ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg3 - 1 >> 7;
		@Pc(25) int local25 = arg3 + arg1 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg2 - 1 >> 7;
		@Pc(41) int local41 = arg2 + arg0 - 1 - 1 >> 7;
		for (@Pc(48) int local48 = local15; local48 <= local25; local48++) {
			@Pc(55) Class12[] local55 = this.aClass12ArrayArray1[local48];
			for (@Pc(57) int local57 = local31; local57 <= local41; local57++) {
				if (local55[local57] != null) {
					local55[local57].aBoolean12 = true;
				}
			}
		}
	}
}
