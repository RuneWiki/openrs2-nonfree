import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nw")
public final class Class231 {

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "[[Lclient!lq;")
	private Class198[][] aClass198ArrayArray1;

	@OriginalMember(owner = "client!nw", name = "g", descriptor = "Lclient!ln;")
	private final Class16_Sub1 aClass16_Sub1_16;

	@OriginalMember(owner = "client!nw", name = "c", descriptor = "Lclient!um;")
	private final Class86_Sub3 aClass86_Sub3_2;

	@OriginalMember(owner = "client!nw", name = "o", descriptor = "I")
	public final int anInt7395;

	@OriginalMember(owner = "client!nw", name = "l", descriptor = "I")
	private final int anInt7392;

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "[B")
	public final byte[] aByteArray55;

	@OriginalMember(owner = "client!nw", name = "f", descriptor = "I")
	private final int anInt7387;

	@OriginalMember(owner = "client!nw", name = "m", descriptor = "I")
	private final int anInt7393;

	@OriginalMember(owner = "client!nw", name = "n", descriptor = "I")
	private final int anInt7394;

	@OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Lclient!ln;Lclient!um;)V")
	public Class231(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(1) Class86_Sub3 arg1) {
		this.aClass16_Sub1_16 = arg0;
		this.aClass86_Sub3_2 = arg1;
		this.anInt7395 = (this.aClass86_Sub3_2.anInt9958 * this.aClass86_Sub3_2.anInt9955 >> this.aClass16_Sub1_16.anInt4909) + 2;
		this.anInt7392 = (this.aClass86_Sub3_2.anInt9958 * this.aClass86_Sub3_2.anInt9953 >> this.aClass16_Sub1_16.anInt4909) + 2;
		this.aByteArray55 = new byte[this.anInt7392 * this.anInt7395];
		this.anInt7387 = this.aClass16_Sub1_16.anInt4909 + 7 - this.aClass86_Sub3_2.anInt9954;
		this.anInt7393 = this.aClass86_Sub3_2.anInt9955 >> this.anInt7387;
		this.anInt7394 = this.aClass86_Sub3_2.anInt9953 >> this.anInt7387;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIILclient!r;)V")
	public void method6030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class8_Sub5_Sub11 arg2) {
		@Pc(6) Class8_Sub5_Sub11_Sub2 local6 = (Class8_Sub5_Sub11_Sub2) arg2;
		arg0 += local6.anInt8809 + 1;
		arg1 += local6.anInt8810 + 1;
		@Pc(28) int local28 = arg0 + arg1 * this.anInt7395;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt8798;
		@Pc(36) int local36 = local6.anInt8799;
		@Pc(42) int local42 = this.anInt7395 - local36;
		@Pc(49) int local49;
		if (arg1 <= 0) {
			local49 = 1 - arg1;
			local30 = local49 * local36;
			local33 -= local49;
			local28 += this.anInt7395 * local49;
			arg1 = 1;
		}
		@Pc(70) int local70 = 0;
		if (this.anInt7392 <= arg1 + local33) {
			local49 = arg1 + local33 + 1 - this.anInt7392;
			local33 -= local49;
		}
		if (arg0 <= 0) {
			local49 = 1 - arg0;
			local28 += local49;
			local30 += local49;
			local36 -= local49;
			arg0 = 1;
			local42 += local49;
			local70 = local49;
		}
		if (this.anInt7395 <= local36 + arg0) {
			local49 = local36 + arg0 + 1 - this.anInt7395;
			local42 += local49;
			local36 -= local49;
			local70 += local49;
		}
		if (local36 > 0 && local33 > 0) {
			Static393.method6279(local36, local6.aByteArray81, local33, local70, local30, this.aByteArray55, local42, local28);
			this.method6035(arg1, local36, arg0, local33);
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(ZII[[ZII)V")
	public void method6032(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(5) int arg4) {
		this.aClass16_Sub1_16.method3966(false);
		this.aClass16_Sub1_16.method3916(false);
		this.aClass16_Sub1_16.method3956(1);
		this.aClass16_Sub1_16.method3937(1);
		this.aClass16_Sub1_16.method3957(false, false, -2);
		@Pc(49) float local49 = 1.0F / (float) (this.aClass16_Sub1_16.anInt4919 * 128);
		@Pc(53) int local53;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(69) int local69;
		if (arg0) {
			for (local53 = 0; local53 < this.anInt7394; local53++) {
				local60 = local53 << this.anInt7387;
				local67 = local53 + 1 << this.anInt7387;
				label87: for (local69 = 0; local69 < this.anInt7393; local69++) {
					if (this.aClass198ArrayArray1[local69][local53] != null) {
						@Pc(344) int local344 = local69 << this.anInt7387;
						@Pc(351) int local351 = local69 + 1 << this.anInt7387;
						for (@Pc(353) int local353 = local344; local353 < local351; local353++) {
							if (local353 - arg4 >= -arg1 && arg1 >= local353 - arg4) {
								for (@Pc(378) int local378 = local60; local378 < local67; local378++) {
									if (local378 - arg2 >= -arg1 && arg1 >= local378 - arg2 && arg3[arg1 + local353 - arg4][arg1 + local378 - arg2]) {
										@Pc(418) Class54_Sub3 local418 = this.aClass16_Sub1_16.method3906();
										local418.method5156(local49, 1.0F, local49);
										local418.method5142(-local69, -local53, 0);
										this.aClass16_Sub1_16.method3908(Static465.aClass207_6);
										this.aClass198ArrayArray1[local69][local53].method5226();
										continue label87;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local53 = 0; local53 < this.anInt7394; local53++) {
				local60 = local53 << this.anInt7387;
				local67 = local53 + 1 << this.anInt7387;
				for (local69 = 0; local69 < this.anInt7393; local69++) {
					@Pc(78) Class198 local78 = this.aClass198ArrayArray1[local69][local53];
					if (local78 != null) {
						@Pc(89) Interface13 local89 = this.aClass16_Sub1_16.method3970(local78.anInt6436 * 3);
						@Pc(94) Buffer local94 = local89.method4654();
						if (local94 != null) {
							@Pc(102) Stream local102 = this.aClass16_Sub1_16.method3981(local94);
							@Pc(104) int local104 = 0;
							@Pc(109) int local109 = local69 << this.anInt7387;
							@Pc(116) int local116 = local69 + 1 << this.anInt7387;
							for (@Pc(118) int local118 = local60; local118 < local67; local118++) {
								if (-arg1 <= local118 - arg2 && local118 - arg2 <= arg1) {
									@Pc(147) int local147 = local109 + local118 * this.aClass86_Sub3_2.anInt9955;
									for (@Pc(149) int local149 = local109; local149 < local116; local149++) {
										if (-arg1 <= local149 - arg4 && arg1 >= local149 - arg4 && arg3[local149 + arg1 - arg4][local118 + arg1 - arg2]) {
											@Pc(186) short[] local186 = this.aClass86_Sub3_2.aShortArrayArray12[local147];
											if (local186 != null) {
												@Pc(192) int local192;
												if (Stream.c()) {
													for (local192 = 0; local192 < local186.length; local192++) {
														local102.f(local186[local192] & 0xFFFF);
														local104++;
													}
												} else {
													for (local192 = 0; local192 < local186.length; local192++) {
														local104++;
														local102.c(local186[local192] & 0xFFFF);
													}
												}
											}
										}
										local147++;
									}
								}
							}
							local102.b();
							if (local89.method4655() && local104 > 0) {
								@Pc(267) Class54_Sub3 local267 = this.aClass16_Sub1_16.method3906();
								local267.method5156(local49, 1.0F, local49);
								local267.method5142(-local69, -local53, 0);
								this.aClass16_Sub1_16.method3908(Static465.aClass207_6);
								local78.method5224(local104 / 3, local89);
							}
						}
					}
				}
			}
		}
		this.aClass16_Sub1_16.method3930();
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IZIII)V")
	private void method6035(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass198ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg2 - 1 >> 7;
		@Pc(25) int local25 = arg1 + arg2 - 1 - 1 >> 7;
		@Pc(35) int local35 = arg0 - 1 >> 7;
		@Pc(43) int local43 = arg0 + arg3 - 2 >> 7;
		for (@Pc(45) int local45 = local15; local45 <= local25; local45++) {
			@Pc(52) Class198[] local52 = this.aClass198ArrayArray1[local45];
			for (@Pc(54) int local54 = local35; local54 <= local43; local54++) {
				if (local52[local54] != null) {
					local52[local54].aBoolean448 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(ILclient!r;II)Z")
	public boolean method6036(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub5_Sub11 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class8_Sub5_Sub11_Sub2 local12 = (Class8_Sub5_Sub11_Sub2) arg1;
		arg0 += local12.anInt8809 + 1;
		arg2 += local12.anInt8810 + 1;
		@Pc(33) int local33 = this.anInt7395 * arg2 + arg0;
		@Pc(36) int local36 = local12.anInt8798;
		@Pc(39) int local39 = local12.anInt8799;
		@Pc(46) int local46;
		if (arg2 <= 0) {
			local46 = 1 - arg2;
			local36 -= local46;
			arg2 = 1;
			local33 += local46 * this.anInt7395;
		}
		@Pc(65) int local65 = this.anInt7395 - local39;
		if (local36 + arg2 >= this.anInt7392) {
			local46 = arg2 + local36 + 1 - this.anInt7392;
			local36 -= local46;
		}
		if (arg0 <= 0) {
			local46 = 1 - arg0;
			local39 -= local46;
			local33 += local46;
			local65 += local46;
			arg0 = 1;
		}
		if (arg0 + local39 >= this.anInt7395) {
			local46 = arg0 + local39 + 1 - this.anInt7395;
			local39 -= local46;
			local65 += local46;
		}
		if (local39 > 0 && local36 > 0) {
			local65 += this.anInt7395 * 7;
			return Static390.method6240(local65, local33, local39, this.aByteArray55, local36);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(BILclient!r;I)V")
	public void method6037(@OriginalArg(1) int arg0, @OriginalArg(2) Class8_Sub5_Sub11 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class8_Sub5_Sub11_Sub2 local6 = (Class8_Sub5_Sub11_Sub2) arg1;
		arg0 += local6.anInt8809 + 1;
		arg2 += local6.anInt8810 + 1;
		@Pc(27) int local27 = arg0 + arg2 * this.anInt7395;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt8798;
		@Pc(41) int local41 = local6.anInt8799;
		@Pc(47) int local47 = this.anInt7395 - local41;
		@Pc(56) int local56;
		if (arg2 <= 0) {
			local56 = 1 - arg2;
			arg2 = 1;
			local27 += local56 * this.anInt7395;
			local32 -= local56;
			local29 = local41 * local56;
		}
		@Pc(77) int local77 = 0;
		if (local32 + arg2 >= this.anInt7392) {
			local56 = arg2 + local32 + 1 - this.anInt7392;
			local32 -= local56;
		}
		if (arg0 <= 0) {
			local56 = 1 - arg0;
			local41 -= local56;
			local47 += local56;
			arg0 = 1;
			local29 += local56;
			local27 += local56;
			local77 = local56;
		}
		if (arg0 + local41 >= this.anInt7395) {
			local56 = arg0 + local41 + 1 - this.anInt7395;
			local77 += local56;
			local41 -= local56;
			local47 += local56;
		}
		if (local41 > 0 && local32 > 0) {
			Static80.method7556(local27, local77, local41, local29, local6.aByteArray81, this.aByteArray55, local47, local32);
			this.method6035(arg2, local41, arg0, local32);
		}
	}

	@OriginalMember(owner = "client!nw", name = "c", descriptor = "(I)V")
	public void method6039() {
		this.aClass198ArrayArray1 = new Class198[this.anInt7393][this.anInt7394];
		for (@Pc(20) int local20 = 0; local20 < this.anInt7394; local20++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt7393; local24++) {
				this.aClass198ArrayArray1[local24][local20] = new Class198(this.aClass16_Sub1_16, this, this.aClass86_Sub3_2, local24, local20, this.anInt7387, local24 * 128 + 1, local20 * 128 - -1);
				if (this.aClass198ArrayArray1[local24][local20].anInt6436 == 0) {
					this.aClass198ArrayArray1[local24][local20] = null;
				}
			}
		}
	}
}
