import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rv")
public final class Class283 {

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "[[Lclient!aba;")
	private Class3[][] aClass3ArrayArray1;

	@OriginalMember(owner = "client!rv", name = "f", descriptor = "Lclient!sv;")
	private final Class121_Sub2 aClass121_Sub2_13;

	@OriginalMember(owner = "client!rv", name = "s", descriptor = "Lclient!ua;")
	private final Class60_Sub3 aClass60_Sub3_3;

	@OriginalMember(owner = "client!rv", name = "h", descriptor = "I")
	public final int anInt7773;

	@OriginalMember(owner = "client!rv", name = "i", descriptor = "I")
	private final int anInt7774;

	@OriginalMember(owner = "client!rv", name = "k", descriptor = "[B")
	public final byte[] aByteArray105;

	@OriginalMember(owner = "client!rv", name = "g", descriptor = "I")
	private final int anInt7772;

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "I")
	private final int anInt7770;

	@OriginalMember(owner = "client!rv", name = "e", descriptor = "I")
	private final int anInt7771;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lclient!sv;Lclient!ua;)V")
	public Class283(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) Class60_Sub3 arg1) {
		this.aClass121_Sub2_13 = arg0;
		this.aClass60_Sub3_3 = arg1;
		this.anInt7773 = (this.aClass60_Sub3_3.anInt9656 * this.aClass60_Sub3_3.anInt9652 >> this.aClass121_Sub2_13.anInt8912) + 2;
		this.anInt7774 = (this.aClass60_Sub3_3.anInt9657 * this.aClass60_Sub3_3.anInt9652 >> this.aClass121_Sub2_13.anInt8912) + 2;
		this.aByteArray105 = new byte[this.anInt7774 * this.anInt7773];
		this.anInt7772 = this.aClass121_Sub2_13.anInt8912 + 7 - this.aClass60_Sub3_3.anInt9654;
		this.anInt7770 = this.aClass60_Sub3_3.anInt9656 >> this.anInt7772;
		this.anInt7771 = this.aClass60_Sub3_3.anInt9657 >> this.anInt7772;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILclient!w;IB)V")
	public void method6437(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub1_Sub12 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class6_Sub1_Sub12_Sub1 local6 = (Class6_Sub1_Sub12_Sub1) arg1;
		arg0 += local6.anInt5685 + 1;
		arg2 += local6.anInt5690 + 1;
		@Pc(28) int local28 = arg2 + arg0 * this.anInt7773;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt5686;
		@Pc(36) int local36 = local6.anInt5683;
		@Pc(41) int local41 = this.anInt7773 - local36;
		@Pc(48) int local48;
		if (arg0 <= 0) {
			local48 = 1 - arg0;
			arg0 = 1;
			local28 += this.anInt7773 * local48;
			local30 = local48 * local36;
			local33 -= local48;
		}
		@Pc(69) int local69 = 0;
		if (this.anInt7774 <= arg0 + local33) {
			local48 = arg0 + local33 + 1 - this.anInt7774;
			local33 -= local48;
		}
		if (arg2 <= 0) {
			local48 = 1 - arg2;
			local28 += local48;
			local41 += local48;
			local69 = local48;
			local36 -= local48;
			local30 += local48;
			arg2 = 1;
		}
		if (local36 + arg2 >= this.anInt7773) {
			local48 = local36 + arg2 + 1 - this.anInt7773;
			local41 += local48;
			local36 -= local48;
			local69 += local48;
		}
		if (local36 > 0 && local33 > 0) {
			Static505.method6945(this.aByteArray105, local33, local6.aByteArray70, local28, local30, local69, local36, local41);
			this.method6445(arg2, local36, arg0, local33);
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!w;III)Z")
	public boolean method6438(@OriginalArg(0) Class6_Sub1_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class6_Sub1_Sub12_Sub1 local6 = (Class6_Sub1_Sub12_Sub1) arg0;
		arg1 += local6.anInt5685 + 1;
		arg2 += local6.anInt5690 + 1;
		@Pc(27) int local27 = arg1 * this.anInt7773 + arg2;
		@Pc(30) int local30 = local6.anInt5686;
		@Pc(33) int local33 = local6.anInt5683;
		@Pc(42) int local42;
		if (arg1 <= 0) {
			local42 = 1 - arg1;
			arg1 = 1;
			local30 -= local42;
			local27 += local42 * this.anInt7773;
		}
		@Pc(61) int local61 = this.anInt7773 - local33;
		if (this.anInt7774 <= arg1 + local30) {
			local42 = local30 + arg1 + 1 - this.anInt7774;
			local30 -= local42;
		}
		if (arg2 <= 0) {
			local42 = 1 - arg2;
			arg2 = 1;
			local33 -= local42;
			local61 += local42;
			local27 += local42;
		}
		if (this.anInt7773 <= local33 + arg2) {
			local42 = arg2 + local33 + 1 - this.anInt7773;
			local33 -= local42;
			local61 += local42;
		}
		if (local33 > 0 && local30 > 0) {
			local61 += this.anInt7773 * 7;
			return Static550.method7575(local33, local61, local27, local30, this.aByteArray105);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(Lclient!w;III)V")
	public void method6440(@OriginalArg(0) Class6_Sub1_Sub12 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class6_Sub1_Sub12_Sub1 local6 = (Class6_Sub1_Sub12_Sub1) arg0;
		arg1 += local6.anInt5685 + 1;
		arg2 += local6.anInt5690 + 1;
		@Pc(27) int local27 = arg1 * this.anInt7773 + arg2;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt5686;
		@Pc(35) int local35 = local6.anInt5683;
		@Pc(41) int local41 = this.anInt7773 - local35;
		@Pc(51) int local51;
		if (arg1 <= 0) {
			local51 = 1 - arg1;
			local32 -= local51;
			local29 = local35 * local51;
			local27 += local51 * this.anInt7773;
			arg1 = 1;
		}
		@Pc(72) int local72 = 0;
		if (arg1 + local32 >= this.anInt7774) {
			local51 = local32 + arg1 + 1 - this.anInt7774;
			local32 -= local51;
		}
		if (arg2 <= 0) {
			local51 = 1 - arg2;
			local35 -= local51;
			local27 += local51;
			local29 += local51;
			local72 = local51;
			local41 += local51;
			arg2 = 1;
		}
		if (this.anInt7773 <= arg2 + local35) {
			local51 = local35 + arg2 + 1 - this.anInt7773;
			local41 += local51;
			local72 += local51;
			local35 -= local51;
		}
		if (local35 > 0 && local32 > 0) {
			Static284.method4037(local35, local6.aByteArray70, this.aByteArray105, local32, local41, local72, local29, local27);
			this.method6445(arg2, local35, arg1, local32);
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIBZ[[Z)V")
	public void method6441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean[][] arg4) {
		this.aClass121_Sub2_13.method7240(false);
		this.aClass121_Sub2_13.method7228(false);
		this.aClass121_Sub2_13.method7164(1);
		this.aClass121_Sub2_13.method7266(1);
		this.aClass121_Sub2_13.method7290(-2, false, false);
		@Pc(43) float local43 = 1.0F / (float) (this.aClass121_Sub2_13.anInt8910 * 128);
		@Pc(47) int local47;
		@Pc(54) int local54;
		@Pc(61) int local61;
		@Pc(63) int local63;
		if (arg3) {
			for (local47 = 0; local47 < this.anInt7771; local47++) {
				local54 = local47 << this.anInt7772;
				local61 = local47 + 1 << this.anInt7772;
				label87: for (local63 = 0; local63 < this.anInt7770; local63++) {
					if (this.aClass3ArrayArray1[local63][local47] != null) {
						@Pc(314) int local314 = local63 << this.anInt7772;
						@Pc(321) int local321 = local63 + 1 << this.anInt7772;
						for (@Pc(323) int local323 = local314; local323 < local321; local323++) {
							if (local323 - arg0 >= -arg2 && arg2 >= local323 - arg0) {
								for (@Pc(344) int local344 = local54; local344 < local61; local344++) {
									if (local344 - arg1 >= -arg2 && arg2 >= local344 - arg1 && arg4[local323 + arg2 - arg0][local344 + arg2 - arg1]) {
										@Pc(383) Class34_Sub3 local383 = this.aClass121_Sub2_13.method7261();
										local383.method3760(local43, 1.0F, local43);
										local383.G(-local63, -local47, 0);
										this.aClass121_Sub2_13.method7181(Static478.aClass168_6);
										this.aClass3ArrayArray1[local63][local47].method55();
										continue label87;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local47 = 0; local47 < this.anInt7771; local47++) {
				local54 = local47 << this.anInt7772;
				local61 = local47 + 1 << this.anInt7772;
				for (local63 = 0; local63 < this.anInt7770; local63++) {
					@Pc(72) Class3 local72 = this.aClass3ArrayArray1[local63][local47];
					if (local72 != null) {
						@Pc(83) Interface11 local83 = this.aClass121_Sub2_13.method7281(local72.anInt38 * 3);
						@Pc(88) Buffer local88 = local83.method7569();
						if (local88 != null) {
							@Pc(96) Stream local96 = this.aClass121_Sub2_13.method7200(local88);
							@Pc(98) int local98 = 0;
							@Pc(103) int local103 = local63 << this.anInt7772;
							@Pc(110) int local110 = local63 + 1 << this.anInt7772;
							for (@Pc(112) int local112 = local54; local112 < local61; local112++) {
								if (-arg2 <= local112 - arg1 && arg2 >= local112 - arg1) {
									@Pc(135) int local135 = local103 + this.aClass60_Sub3_3.anInt9656 * local112;
									for (@Pc(137) int local137 = local103; local137 < local110; local137++) {
										if (-arg2 <= local137 - arg0 && local137 - arg0 <= arg2 && arg4[local137 + arg2 - arg0][arg2 + local112 - arg1]) {
											@Pc(179) short[] local179 = this.aClass60_Sub3_3.aShortArrayArray13[local135];
											if (local179 != null) {
												@Pc(185) int local185;
												if (Stream.a()) {
													for (local185 = 0; local185 < local179.length; local185++) {
														local98++;
														local96.f(local179[local185] & 0xFFFF);
													}
												} else {
													for (local185 = 0; local185 < local179.length; local185++) {
														local98++;
														local96.b(local179[local185] & 0xFFFF);
													}
												}
											}
										}
										local135++;
									}
								}
							}
							local96.c();
							if (local83.method7563() && local98 > 0) {
								@Pc(245) Class34_Sub3 local245 = this.aClass121_Sub2_13.method7261();
								local245.method3760(local43, 1.0F, local43);
								local245.G(-local63, -local47, 0);
								this.aClass121_Sub2_13.method7181(Static478.aClass168_6);
								local72.method53(local98 / 3, local83);
							}
						}
					}
				}
			}
		}
		this.aClass121_Sub2_13.method7209();
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)V")
	public void method6443() {
		this.aClass3ArrayArray1 = new Class3[this.anInt7770][this.anInt7771];
		for (@Pc(22) int local22 = 0; local22 < this.anInt7771; local22++) {
			for (@Pc(26) int local26 = 0; local26 < this.anInt7770; local26++) {
				this.aClass3ArrayArray1[local26][local22] = new Class3(this.aClass121_Sub2_13, this, this.aClass60_Sub3_3, local26, local22, this.anInt7772, local26 * 128 + 1, local22 * 128 + 1);
				if (this.aClass3ArrayArray1[local26][local22].anInt38 == 0) {
					this.aClass3ArrayArray1[local26][local22] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIZII)V")
	private void method6445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass3ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg0 - 1 >> 7;
		@Pc(25) int local25 = arg0 + arg1 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg2 - 1 >> 7;
		@Pc(41) int local41 = arg2 + arg3 - 1 - 1 >> 7;
		for (@Pc(43) int local43 = local15; local43 <= local25; local43++) {
			@Pc(50) Class3[] local50 = this.aClass3ArrayArray1[local43];
			for (@Pc(52) int local52 = local31; local52 <= local41; local52++) {
				if (local50[local52] != null) {
					local50[local52].aBoolean2 = true;
				}
			}
		}
	}
}
