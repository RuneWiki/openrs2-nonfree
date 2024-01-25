import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class33 {

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "[[Lclient!aba;")
	private Class4[][] aClass4ArrayArray1;

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "Lclient!eh;")
	private final Class96_Sub1 aClass96_Sub1_1;

	@OriginalMember(owner = "client!bd", name = "w", descriptor = "Lclient!jj;")
	private final Class75_Sub1 aClass75_Sub1_4;

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
	public final int anInt470;

	@OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
	private final int anInt473;

	@OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
	private final int anInt472;

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "[B")
	public final byte[] aByteArray6;

	@OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
	private final int anInt466;

	@OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
	private final int anInt475;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!jj;Lclient!eh;)V")
	public Class33(@OriginalArg(0) Class75_Sub1 arg0, @OriginalArg(1) Class96_Sub1 arg1) {
		this.aClass96_Sub1_1 = arg1;
		this.aClass75_Sub1_4 = arg0;
		this.anInt470 = (this.aClass96_Sub1_1.anInt9246 * this.aClass96_Sub1_1.anInt9255 >> this.aClass75_Sub1_4.anInt7672) + 2;
		this.anInt473 = (this.aClass96_Sub1_1.anInt9246 * this.aClass96_Sub1_1.anInt9257 >> this.aClass75_Sub1_4.anInt7672) + 2;
		this.anInt472 = this.aClass75_Sub1_4.anInt7672 + 7 - this.aClass96_Sub1_1.anInt9248;
		this.aByteArray6 = new byte[this.anInt473 * this.anInt470];
		this.anInt466 = this.aClass96_Sub1_1.anInt9255 >> this.anInt472;
		this.anInt475 = this.aClass96_Sub1_1.anInt9257 >> this.anInt472;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!r;III)V")
	public void method448(@OriginalArg(0) Class6_Sub2_Sub18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class6_Sub2_Sub18_Sub2 local6 = (Class6_Sub2_Sub18_Sub2) arg0;
		arg1 += local6.anInt9718 + 1;
		arg2 += local6.anInt9720 + 1;
		@Pc(28) int local28 = arg1 + arg2 * this.anInt470;
		@Pc(30) int local30 = 0;
		@Pc(38) int local38 = local6.anInt9711;
		@Pc(41) int local41 = local6.anInt9723;
		@Pc(47) int local47 = this.anInt470 - local41;
		@Pc(49) int local49 = 0;
		@Pc(58) int local58;
		if (arg2 <= 0) {
			local58 = 1 - arg2;
			local30 = local58 * local41;
			local38 -= local58;
			local28 += this.anInt470 * local58;
			arg2 = 1;
		}
		if (this.anInt473 <= local38 + arg2) {
			local58 = arg2 + local38 + 1 - this.anInt473;
			local38 -= local58;
		}
		if (arg1 <= 0) {
			local58 = 1 - arg1;
			local47 += local58;
			local49 = local58;
			arg1 = 1;
			local30 += local58;
			local41 -= local58;
			local28 += local58;
		}
		if (local41 + arg1 >= this.anInt470) {
			local58 = local41 + arg1 + 1 - this.anInt470;
			local49 += local58;
			local47 += local58;
			local41 -= local58;
		}
		if (local41 > 0 && local38 > 0) {
			Static473.method7125(local47, local49, local28, local38, local30, local6.aByteArray104, local41, this.aByteArray6);
			this.method455(arg2, local41, local38, arg1);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "([[ZIIIZI)V")
	public void method449(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass75_Sub1_4.method6780(false);
		this.aClass75_Sub1_4.method6752(false);
		this.aClass75_Sub1_4.method6736(1);
		this.aClass75_Sub1_4.method6830(1);
		this.aClass75_Sub1_4.method6809(false, false, -2);
		@Pc(49) float local49 = 1.0F / (float) (this.aClass75_Sub1_4.anInt7684 * 128);
		@Pc(53) int local53;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(69) int local69;
		if (arg4) {
			for (local53 = 0; local53 < this.anInt475; local53++) {
				local60 = local53 << this.anInt472;
				local67 = local53 + 1 << this.anInt472;
				label87: for (local69 = 0; local69 < this.anInt466; local69++) {
					if (this.aClass4ArrayArray1[local69][local53] != null) {
						@Pc(354) int local354 = local69 << this.anInt472;
						@Pc(361) int local361 = local69 + 1 << this.anInt472;
						for (@Pc(363) int local363 = local354; local363 < local361; local363++) {
							if (local363 - arg2 >= -arg1 && arg1 >= local363 - arg2) {
								for (@Pc(383) int local383 = local60; local383 < local67; local383++) {
									if (local383 - arg3 >= -arg1 && local383 - arg3 <= arg1 && arg0[arg1 + local363 - arg2][arg1 + local383 - arg3]) {
										@Pc(428) Class109_Sub3 local428 = this.aClass75_Sub1_4.method6775();
										local428.method4355(local49, 1.0F, local49);
										local428.method4604(-local69, -local53, 0);
										this.aClass75_Sub1_4.method6787(Static82.aClass211_2);
										this.aClass4ArrayArray1[local69][local53].method20();
										continue label87;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local53 = 0; local53 < this.anInt475; local53++) {
				local60 = local53 << this.anInt472;
				local67 = local53 + 1 << this.anInt472;
				for (local69 = 0; local69 < this.anInt466; local69++) {
					@Pc(78) Class4 local78 = this.aClass4ArrayArray1[local69][local53];
					if (local78 != null) {
						@Pc(89) Interface25 local89 = this.aClass75_Sub1_4.method6852(local78.anInt8 * 3);
						@Pc(94) Buffer local94 = local89.method8677();
						if (local94 != null) {
							@Pc(102) Stream local102 = this.aClass75_Sub1_4.method6788(local94);
							@Pc(104) int local104 = 0;
							@Pc(109) int local109 = local69 << this.anInt472;
							@Pc(116) int local116 = local69 + 1 << this.anInt472;
							for (@Pc(118) int local118 = local60; local118 < local67; local118++) {
								if (-arg1 <= local118 - arg3 && local118 - arg3 <= arg1) {
									@Pc(149) int local149 = local118 * this.aClass96_Sub1_1.anInt9255 + local109;
									for (@Pc(151) int local151 = local109; local151 < local116; local151++) {
										if (-arg1 <= local151 - arg2 && local151 - arg2 <= arg1 && arg0[arg1 + local151 - arg2][local118 + arg1 - arg3]) {
											@Pc(193) short[] local193 = this.aClass96_Sub1_1.aShortArrayArray5[local149];
											if (local193 != null) {
												@Pc(201) int local201;
												if (Stream.b()) {
													for (local201 = 0; local201 < local193.length; local201++) {
														local104++;
														local102.b(local193[local201] & 0xFFFF);
													}
												} else {
													for (local201 = 0; local201 < local193.length; local201++) {
														local104++;
														local102.a(local193[local201] & 0xFFFF);
													}
												}
											}
										}
										local149++;
									}
								}
							}
							local102.a();
							if (local89.method8676() && local104 > 0) {
								@Pc(279) Class109_Sub3 local279 = this.aClass75_Sub1_4.method6775();
								local279.method4355(local49, 1.0F, local49);
								local279.method4604(-local69, -local53, 0);
								this.aClass75_Sub1_4.method6787(Static82.aClass211_2);
								local78.method24(local104 / 3, local89);
							}
						}
					}
				}
			}
		}
		this.aClass75_Sub1_4.method6744();
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
	public void method450() {
		this.aClass4ArrayArray1 = new Class4[this.anInt466][this.anInt475];
		for (@Pc(22) int local22 = 0; local22 < this.anInt475; local22++) {
			for (@Pc(26) int local26 = 0; local26 < this.anInt466; local26++) {
				this.aClass4ArrayArray1[local26][local22] = new Class4(this.aClass75_Sub1_4, this, this.aClass96_Sub1_1, local26, local22, this.anInt472, local26 * 128 + 1, local22 * 128 + 1);
				if (this.aClass4ArrayArray1[local26][local22].anInt8 == 0) {
					this.aClass4ArrayArray1[local26][local22] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!r;IZ)V")
	public void method451(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub2_Sub18 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class6_Sub2_Sub18_Sub2 local6 = (Class6_Sub2_Sub18_Sub2) arg1;
		arg2 += local6.anInt9718 + 1;
		arg0 += local6.anInt9720 + 1;
		@Pc(35) int local35 = arg2 + arg0 * this.anInt470;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = local6.anInt9711;
		@Pc(43) int local43 = local6.anInt9723;
		@Pc(49) int local49 = this.anInt470 - local43;
		@Pc(55) int local55;
		if (arg0 <= 0) {
			local55 = 1 - arg0;
			local37 = local43 * local55;
			arg0 = 1;
			local35 += this.anInt470 * local55;
			local40 -= local55;
		}
		@Pc(76) int local76 = 0;
		if (this.anInt473 <= arg0 + local40) {
			local55 = arg0 + local40 + 1 - this.anInt473;
			local40 -= local55;
		}
		if (arg2 <= 0) {
			local55 = 1 - arg2;
			local76 = local55;
			arg2 = 1;
			local49 += local55;
			local43 -= local55;
			local35 += local55;
			local37 += local55;
		}
		if (this.anInt470 <= arg2 + local43) {
			local55 = arg2 + local43 + 1 - this.anInt470;
			local43 -= local55;
			local76 += local55;
			local49 += local55;
		}
		if (local43 > 0 && local40 > 0) {
			Static463.method8204(local37, local40, local35, local6.aByteArray104, local49, this.aByteArray6, local76, local43);
			this.method455(arg0, local43, local40, arg2);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IZILclient!r;)Z")
	public boolean method453(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6_Sub2_Sub18 arg2) {
		@Pc(18) Class6_Sub2_Sub18_Sub2 local18 = (Class6_Sub2_Sub18_Sub2) arg2;
		arg0 += local18.anInt9718 + 1;
		arg1 += local18.anInt9720 + 1;
		@Pc(39) int local39 = arg1 * this.anInt470 + arg0;
		@Pc(42) int local42 = local18.anInt9711;
		@Pc(45) int local45 = local18.anInt9723;
		@Pc(54) int local54;
		if (arg1 <= 0) {
			local54 = 1 - arg1;
			arg1 = 1;
			local42 -= local54;
			local39 += local54 * this.anInt470;
		}
		@Pc(72) int local72 = this.anInt470 - local45;
		if (this.anInt473 <= arg1 + local42) {
			local54 = arg1 + local42 + 1 - this.anInt473;
			local42 -= local54;
		}
		if (arg0 <= 0) {
			local54 = 1 - arg0;
			arg0 = 1;
			local72 += local54;
			local45 -= local54;
			local39 += local54;
		}
		if (local45 + arg0 >= this.anInt470) {
			local54 = arg0 + local45 + 1 - this.anInt470;
			local45 -= local54;
			local72 += local54;
		}
		if (local45 > 0 && local42 > 0) {
			local72 += this.anInt470 * 7;
			return Static432.method6598(local45, local72, local42, local39, this.aByteArray6);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIII)V")
	private void method455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass4ArrayArray1 == null) {
			return;
		}
		@Pc(16) int local16 = arg3 - 1 >> 7;
		@Pc(26) int local26 = arg3 + arg1 - 1 - 1 >> 7;
		@Pc(39) int local39 = arg0 - 1 >> 7;
		@Pc(50) int local50 = arg0 + arg2 - 1 - 1 >> 7;
		for (@Pc(52) int local52 = local16; local52 <= local26; local52++) {
			@Pc(59) Class4[] local59 = this.aClass4ArrayArray1[local52];
			for (@Pc(61) int local61 = local39; local61 <= local50; local61++) {
				if (local59[local61] != null) {
					local59[local61].aBoolean1 = true;
				}
			}
		}
	}
}
