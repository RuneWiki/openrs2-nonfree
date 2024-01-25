import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!waa")
public final class Class377 {

	@OriginalMember(owner = "client!waa", name = "p", descriptor = "[[Lclient!gb;")
	private Class138[][] aClass138ArrayArray1;

	@OriginalMember(owner = "client!waa", name = "r", descriptor = "Lclient!im;")
	private final Class22_Sub2 aClass22_Sub2_3;

	@OriginalMember(owner = "client!waa", name = "q", descriptor = "Lclient!kd;")
	private final Class57_Sub3 aClass57_Sub3_22;

	@OriginalMember(owner = "client!waa", name = "f", descriptor = "I")
	public final int anInt10535;

	@OriginalMember(owner = "client!waa", name = "s", descriptor = "I")
	private final int anInt10537;

	@OriginalMember(owner = "client!waa", name = "l", descriptor = "[B")
	public final byte[] aByteArray106;

	@OriginalMember(owner = "client!waa", name = "m", descriptor = "I")
	private final int anInt10530;

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "I")
	private final int anInt10526;

	@OriginalMember(owner = "client!waa", name = "k", descriptor = "I")
	private final int anInt10534;

	@OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Lclient!kd;Lclient!im;)V")
	public Class377(@OriginalArg(0) Class57_Sub3 arg0, @OriginalArg(1) Class22_Sub2 arg1) {
		this.aClass22_Sub2_3 = arg1;
		this.aClass57_Sub3_22 = arg0;
		this.anInt10535 = (this.aClass22_Sub2_3.anInt9377 * this.aClass22_Sub2_3.anInt9376 >> this.aClass57_Sub3_22.anInt9169) + 2;
		this.anInt10537 = (this.aClass22_Sub2_3.anInt9375 * this.aClass22_Sub2_3.anInt9377 >> this.aClass57_Sub3_22.anInt9169) + 2;
		this.aByteArray106 = new byte[this.anInt10535 * this.anInt10537];
		this.anInt10530 = this.aClass57_Sub3_22.anInt9169 + 7 - this.aClass22_Sub2_3.anInt9378;
		this.anInt10526 = this.aClass22_Sub2_3.anInt9376 >> this.anInt10530;
		this.anInt10534 = this.aClass22_Sub2_3.anInt9375 >> this.anInt10530;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(IBILclient!r;)Z")
	public boolean method9032(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub5_Sub4 arg2) {
		@Pc(6) Class5_Sub5_Sub4_Sub2 local6 = (Class5_Sub5_Sub4_Sub2) arg2;
		arg0 += local6.anInt10524 + 1;
		arg1 += local6.anInt10521 + 1;
		@Pc(27) int local27 = this.anInt10535 * arg0 + arg1;
		@Pc(30) int local30 = local6.anInt10522;
		@Pc(33) int local33 = local6.anInt10515;
		@Pc(46) int local46 = this.anInt10535 - local33;
		@Pc(55) int local55;
		if (arg0 <= 0) {
			local55 = 1 - arg0;
			local30 -= local55;
			local27 += this.anInt10535 * local55;
			arg0 = 1;
		}
		if (local30 + arg0 >= this.anInt10537) {
			local55 = local30 + arg0 + 1 - this.anInt10537;
			local30 -= local55;
		}
		if (arg1 <= 0) {
			local55 = 1 - arg1;
			local33 -= local55;
			arg1 = 1;
			local27 += local55;
			local46 += local55;
		}
		if (this.anInt10535 <= arg1 + local33) {
			local55 = arg1 + local33 + 1 - this.anInt10535;
			local33 -= local55;
			local46 += local55;
		}
		if (local33 > 0 && local30 > 0) {
			local46 += this.anInt10535 * 7;
			return Static311.method4727(local33, local46, this.aByteArray106, local30, local27);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(Z[[ZIIII)V")
	public void method9033(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aClass57_Sub3_22.method7820(false);
		this.aClass57_Sub3_22.method7821(false);
		this.aClass57_Sub3_22.method7800(1);
		this.aClass57_Sub3_22.method7764(1);
		this.aClass57_Sub3_22.method7827(false, -2, false);
		@Pc(45) float local45 = 1.0F / (float) (this.aClass57_Sub3_22.anInt9179 * 128);
		@Pc(49) int local49;
		@Pc(56) int local56;
		@Pc(63) int local63;
		@Pc(65) int local65;
		if (arg0) {
			for (local49 = 0; local49 < this.anInt10534; local49++) {
				local56 = local49 << this.anInt10530;
				local63 = local49 + 1 << this.anInt10530;
				label87: for (local65 = 0; local65 < this.anInt10526; local65++) {
					if (this.aClass138ArrayArray1[local65][local49] != null) {
						@Pc(370) int local370 = local65 << this.anInt10530;
						@Pc(377) int local377 = local65 + 1 << this.anInt10530;
						for (@Pc(379) int local379 = local370; local379 < local377; local379++) {
							if (local379 - arg3 >= -arg4 && arg4 >= local379 - arg3) {
								for (@Pc(398) int local398 = local56; local398 < local63; local398++) {
									if (local398 - arg2 >= -arg4 && local398 - arg2 <= arg4 && arg1[arg4 + local379 - arg3][arg4 + local398 - arg2]) {
										@Pc(442) Class203_Sub1 local442 = this.aClass57_Sub3_22.method7829();
										local442.method4834(local45, 1.0F, local45);
										local442.method8335(-local65, -local49, 0);
										this.aClass57_Sub3_22.method7822(Static169.aClass357_3);
										this.aClass138ArrayArray1[local65][local49].method2694();
										continue label87;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local49 = 0; local49 < this.anInt10534; local49++) {
				local56 = local49 << this.anInt10530;
				local63 = local49 + 1 << this.anInt10530;
				for (local65 = 0; local65 < this.anInt10526; local65++) {
					@Pc(74) Class138 local74 = this.aClass138ArrayArray1[local65][local49];
					if (local74 != null) {
						@Pc(85) Interface9 local85 = this.aClass57_Sub3_22.method7773(local74.anInt3075 * 3);
						@Pc(90) Buffer local90 = local85.method2926();
						if (local90 != null) {
							@Pc(98) Stream local98 = this.aClass57_Sub3_22.method7826(local90);
							@Pc(100) int local100 = 0;
							@Pc(105) int local105 = local65 << this.anInt10530;
							@Pc(112) int local112 = local65 + 1 << this.anInt10530;
							for (@Pc(114) int local114 = local56; local114 < local63; local114++) {
								if (local114 - arg2 >= -arg4 && local114 - arg2 <= arg4) {
									@Pc(141) int local141 = this.aClass22_Sub2_3.anInt9376 * local114 + local105;
									for (@Pc(143) int local143 = local105; local143 < local112; local143++) {
										if (-arg4 <= local143 - arg3 && local143 - arg3 <= arg4 && arg1[arg4 + local143 - arg3][local114 + arg4 - arg2]) {
											@Pc(191) short[] local191 = this.aClass22_Sub2_3.aShortArrayArray5[local141];
											if (local191 != null) {
												@Pc(199) int local199;
												if (Stream.b()) {
													for (local199 = 0; local199 < local191.length; local199++) {
														local98.d(local191[local199] & 0xFFFF);
														local100++;
													}
												} else {
													for (local199 = 0; local199 < local191.length; local199++) {
														local98.c(local191[local199] & 0xFFFF);
														local100++;
													}
												}
											}
										}
										local141++;
									}
								}
							}
							local98.c();
							if (local85.method2927() && local100 > 0) {
								@Pc(287) Class203_Sub1 local287 = this.aClass57_Sub3_22.method7829();
								local287.method4834(local45, 1.0F, local45);
								local287.method8335(-local65, -local49, 0);
								this.aClass57_Sub3_22.method7822(Static169.aClass357_3);
								local74.method2696(local100 / 3, local85);
							}
						}
					}
				}
			}
		}
		this.aClass57_Sub3_22.method7850();
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(IILclient!r;I)V")
	public void method9035(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub5_Sub4 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class5_Sub5_Sub4_Sub2 local6 = (Class5_Sub5_Sub4_Sub2) arg1;
		arg0 += local6.anInt10521 + 1;
		arg2 += local6.anInt10524 + 1;
		@Pc(28) int local28 = arg0 + arg2 * this.anInt10535;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt10522;
		@Pc(36) int local36 = local6.anInt10515;
		@Pc(42) int local42 = this.anInt10535 - local36;
		@Pc(44) int local44 = 0;
		@Pc(53) int local53;
		if (arg2 <= 0) {
			local53 = 1 - arg2;
			arg2 = 1;
			local28 += local53 * this.anInt10535;
			local33 -= local53;
			local30 = local36 * local53;
		}
		if (arg2 + local33 >= this.anInt10537) {
			local53 = arg2 + local33 + 1 - this.anInt10537;
			local33 -= local53;
		}
		if (arg0 <= 0) {
			local53 = 1 - arg0;
			local42 += local53;
			arg0 = 1;
			local30 += local53;
			local36 -= local53;
			local28 += local53;
			local44 = local53;
		}
		if (local36 + arg0 >= this.anInt10535) {
			local53 = local36 + arg0 + 1 - this.anInt10535;
			local42 += local53;
			local36 -= local53;
			local44 += local53;
		}
		if (local36 > 0 && local33 > 0) {
			Static299.method1115(local33, local28, local36, local6.aByteArray105, local44, local30, this.aByteArray106, local42);
			this.method9039(local33, arg0, local36, arg2);
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lclient!r;IBI)V")
	public void method9037(@OriginalArg(0) Class5_Sub5_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class5_Sub5_Sub4_Sub2 local11 = (Class5_Sub5_Sub4_Sub2) arg0;
		arg2 += local11.anInt10521 + 1;
		arg1 += local11.anInt10524 + 1;
		@Pc(32) int local32 = arg2 + arg1 * this.anInt10535;
		@Pc(34) int local34 = 0;
		@Pc(37) int local37 = local11.anInt10522;
		@Pc(40) int local40 = local11.anInt10515;
		@Pc(46) int local46 = this.anInt10535 - local40;
		@Pc(48) int local48 = 0;
		@Pc(58) int local58;
		if (arg1 <= 0) {
			local58 = 1 - arg1;
			local32 += local58 * this.anInt10535;
			local34 = local40 * local58;
			local37 -= local58;
			arg1 = 1;
		}
		if (this.anInt10537 <= local37 + arg1) {
			local58 = arg1 + local37 + 1 - this.anInt10537;
			local37 -= local58;
		}
		if (arg2 <= 0) {
			local58 = 1 - arg2;
			local40 -= local58;
			arg2 = 1;
			local48 = local58;
			local46 += local58;
			local32 += local58;
			local34 += local58;
		}
		if (local40 + arg2 >= this.anInt10535) {
			local58 = local40 + arg2 + 1 - this.anInt10535;
			local40 -= local58;
			local46 += local58;
			local48 += local58;
		}
		if (local40 > 0 && local37 > 0) {
			Static633.method8851(local40, local37, local34, this.aByteArray106, local32, local48, local11.aByteArray105, local46);
			this.method9039(local37, arg2, local40, arg1);
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(IIIII)V")
	private void method9039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass138ArrayArray1 == null) {
			return;
		}
		@Pc(16) int local16 = arg1 - 1 >> 7;
		@Pc(26) int local26 = arg1 + arg2 - 1 - 1 >> 7;
		@Pc(32) int local32 = arg3 - 1 >> 7;
		@Pc(42) int local42 = arg0 + arg3 - 1 - 1 >> 7;
		for (@Pc(44) int local44 = local16; local44 <= local26; local44++) {
			@Pc(54) Class138[] local54 = this.aClass138ArrayArray1[local44];
			for (@Pc(56) int local56 = local32; local56 <= local42; local56++) {
				if (local54[local56] != null) {
					local54[local56].aBoolean253 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)V")
	public void method9040() {
		this.aClass138ArrayArray1 = new Class138[this.anInt10526][this.anInt10534];
		for (@Pc(22) int local22 = 0; local22 < this.anInt10534; local22++) {
			for (@Pc(26) int local26 = 0; local26 < this.anInt10526; local26++) {
				this.aClass138ArrayArray1[local26][local22] = new Class138(this.aClass57_Sub3_22, this, this.aClass22_Sub2_3, local26, local22, this.anInt10530, local26 * 128 + 1, local22 * 128 - -1);
				if (this.aClass138ArrayArray1[local26][local22].anInt3075 == 0) {
					this.aClass138ArrayArray1[local26][local22] = null;
				}
			}
		}
	}
}
