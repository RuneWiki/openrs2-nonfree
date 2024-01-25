import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class227 {

	@OriginalMember(owner = "client!pr", name = "m", descriptor = "[[Lclient!fp;")
	private Class92[][] aClass92ArrayArray1;

	@OriginalMember(owner = "client!pr", name = "n", descriptor = "Lclient!eo;")
	private final Class75_Sub1 aClass75_Sub1_3;

	@OriginalMember(owner = "client!pr", name = "f", descriptor = "Lclient!kw;")
	private final Class39_Sub2 aClass39_Sub2_17;

	@OriginalMember(owner = "client!pr", name = "o", descriptor = "I")
	public final int anInt7018;

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "I")
	private final int anInt7009;

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "[B")
	public final byte[] aByteArray98;

	@OriginalMember(owner = "client!pr", name = "r", descriptor = "I")
	private final int anInt7021;

	@OriginalMember(owner = "client!pr", name = "j", descriptor = "I")
	private final int anInt7015;

	@OriginalMember(owner = "client!pr", name = "h", descriptor = "I")
	private final int anInt7013;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lclient!kw;Lclient!eo;)V")
	public Class227(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) Class75_Sub1 arg1) {
		this.aClass75_Sub1_3 = arg1;
		this.aClass39_Sub2_17 = arg0;
		this.anInt7018 = (this.aClass75_Sub1_3.anInt7998 * this.aClass75_Sub1_3.anInt7994 >> this.aClass39_Sub2_17.anInt7289) + 2;
		this.anInt7009 = (this.aClass75_Sub1_3.anInt7994 * this.aClass75_Sub1_3.anInt7995 >> this.aClass39_Sub2_17.anInt7289) + 2;
		this.aByteArray98 = new byte[this.anInt7018 * this.anInt7009];
		this.anInt7021 = this.aClass39_Sub2_17.anInt7289 + 7 - this.aClass75_Sub1_3.anInt7996;
		this.anInt7015 = this.aClass75_Sub1_3.anInt7998 >> this.anInt7021;
		this.anInt7013 = this.aClass75_Sub1_3.anInt7995 >> this.anInt7021;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IBIII)V")
	private void method5945(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass92ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg3 - 1 >> 7;
		@Pc(25) int local25 = arg3 + arg1 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg0 - 1 >> 7;
		@Pc(41) int local41 = arg2 + arg0 - 1 - 1 >> 7;
		for (@Pc(47) int local47 = local15; local47 <= local25; local47++) {
			@Pc(54) Class92[] local54 = this.aClass92ArrayArray1[local47];
			for (@Pc(56) int local56 = local31; local56 <= local41; local56++) {
				if (local54[local56] != null) {
					local54[local56].aBoolean218 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IILclient!k;I)V")
	public void method5948(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub13_Sub6 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class2_Sub13_Sub6_Sub2 local6 = (Class2_Sub13_Sub6_Sub2) arg1;
		arg0 += local6.anInt8863 + 1;
		arg2 += local6.anInt8866 + 1;
		@Pc(27) int local27 = this.anInt7018 * arg0 + arg2;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt8870;
		@Pc(35) int local35 = local6.anInt8861;
		@Pc(41) int local41 = this.anInt7018 - local35;
		@Pc(48) int local48 = 0;
		@Pc(55) int local55;
		if (arg0 <= 0) {
			local55 = 1 - arg0;
			arg0 = 1;
			local29 = local55 * local35;
			local32 -= local55;
			local27 += this.anInt7018 * local55;
		}
		if (arg0 + local32 >= this.anInt7009) {
			local55 = arg0 + local32 + 1 - this.anInt7009;
			local32 -= local55;
		}
		if (arg2 <= 0) {
			local55 = 1 - arg2;
			arg2 = 1;
			local29 += local55;
			local48 = local55;
			local27 += local55;
			local35 -= local55;
			local41 += local55;
		}
		if (local35 + arg2 >= this.anInt7018) {
			local55 = local35 + arg2 + 1 - this.anInt7018;
			local48 += local55;
			local41 += local55;
			local35 -= local55;
		}
		if (local35 > 0 && local32 > 0) {
			Static147.method2576(local29, local27, local41, local35, this.aByteArray98, local48, local6.aByteArray115, local32);
			this.method5945(arg0, local35, local32, arg2);
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IBILclient!k;)Z")
	public boolean method5950(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub13_Sub6 arg2) {
		@Pc(6) Class2_Sub13_Sub6_Sub2 local6 = (Class2_Sub13_Sub6_Sub2) arg2;
		arg1 += local6.anInt8863 + 1;
		arg0 += local6.anInt8866 + 1;
		@Pc(32) int local32 = this.anInt7018 * arg1 + arg0;
		@Pc(35) int local35 = local6.anInt8870;
		@Pc(38) int local38 = local6.anInt8861;
		@Pc(44) int local44 = this.anInt7018 - local38;
		@Pc(54) int local54;
		if (arg1 <= 0) {
			local54 = 1 - arg1;
			arg1 = 1;
			local32 += local54 * this.anInt7018;
			local35 -= local54;
		}
		if (this.anInt7009 <= arg1 + local35) {
			local54 = arg1 + local35 + 1 - this.anInt7009;
			local35 -= local54;
		}
		if (arg0 <= 0) {
			local54 = 1 - arg0;
			arg0 = 1;
			local44 += local54;
			local32 += local54;
			local38 -= local54;
		}
		if (this.anInt7018 <= local38 + arg0) {
			local54 = local38 + arg0 + 1 - this.anInt7018;
			local44 += local54;
			local38 -= local54;
		}
		if (local38 > 0 && local35 > 0) {
			local44 += this.anInt7018 * 7;
			return Static126.method6450(local35, this.aByteArray98, local32, local44, local38);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZI[[ZIII)V")
	public void method5951(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass39_Sub2_17.method6139(false);
		this.aClass39_Sub2_17.method6171(false);
		this.aClass39_Sub2_17.method6088(1);
		this.aClass39_Sub2_17.method6164(1);
		this.aClass39_Sub2_17.method6208(false, -2, false);
		@Pc(43) float local43 = 1.0F / (float) (this.aClass39_Sub2_17.anInt7311 * 128);
		@Pc(47) int local47;
		@Pc(54) int local54;
		@Pc(61) int local61;
		@Pc(63) int local63;
		if (arg0) {
			for (local47 = 0; local47 < this.anInt7013; local47++) {
				local54 = local47 << this.anInt7021;
				local61 = local47 + 1 << this.anInt7021;
				label87: for (local63 = 0; local63 < this.anInt7015; local63++) {
					if (this.aClass92ArrayArray1[local63][local47] != null) {
						@Pc(323) int local323 = local63 << this.anInt7021;
						@Pc(330) int local330 = local63 + 1 << this.anInt7021;
						for (@Pc(332) int local332 = local323; local332 < local330; local332++) {
							if (local332 - arg1 >= -arg4 && local332 - arg1 <= arg4) {
								for (@Pc(357) int local357 = local54; local357 < local61; local357++) {
									if (local357 - arg3 >= -arg4 && local357 - arg3 <= arg4 && arg2[local332 + arg4 - arg1][arg4 + local357 - arg3]) {
										@Pc(401) Class181_Sub2 local401 = this.aClass39_Sub2_17.method6133();
										local401.method5401(local43, 1.0F, local43);
										local401.TA(-local63, -local47, 0);
										this.aClass39_Sub2_17.method6091(Static532.aClass224_6);
										this.aClass92ArrayArray1[local63][local47].method2473();
										continue label87;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local47 = 0; local47 < this.anInt7013; local47++) {
				local54 = local47 << this.anInt7021;
				local61 = local47 + 1 << this.anInt7021;
				for (local63 = 0; local63 < this.anInt7015; local63++) {
					@Pc(72) Class92 local72 = this.aClass92ArrayArray1[local63][local47];
					if (local72 != null) {
						@Pc(83) Interface7 local83 = this.aClass39_Sub2_17.method6129(local72.anInt2616 * 3);
						@Pc(88) Buffer local88 = local83.method6952();
						if (local88 != null) {
							@Pc(96) Stream local96 = this.aClass39_Sub2_17.method6195(local88);
							@Pc(98) int local98 = 0;
							@Pc(103) int local103 = local63 << this.anInt7021;
							@Pc(110) int local110 = local63 + 1 << this.anInt7021;
							for (@Pc(112) int local112 = local54; local112 < local61; local112++) {
								if (local112 - arg3 >= -arg4 && local112 - arg3 <= arg4) {
									@Pc(135) int local135 = local103 + this.aClass75_Sub1_3.anInt7998 * local112;
									for (@Pc(137) int local137 = local103; local137 < local110; local137++) {
										if (local137 - arg1 >= -arg4 && local137 - arg1 <= arg4 && arg2[arg4 + local137 - arg1][arg4 + local112 - arg3]) {
											@Pc(178) short[] local178 = this.aClass75_Sub1_3.aShortArrayArray1[local135];
											if (local178 != null) {
												@Pc(184) int local184;
												if (Stream.a()) {
													for (local184 = 0; local184 < local178.length; local184++) {
														local98++;
														local96.f(local178[local184] & 0xFFFF);
													}
												} else {
													for (local184 = 0; local184 < local178.length; local184++) {
														local96.e(local178[local184] & 0xFFFF);
														local98++;
													}
												}
											}
										}
										local135++;
									}
								}
							}
							local96.c();
							if (local83.method6954() && local98 > 0) {
								@Pc(252) Class181_Sub2 local252 = this.aClass39_Sub2_17.method6133();
								local252.method5401(local43, 1.0F, local43);
								local252.TA(-local63, -local47, 0);
								this.aClass39_Sub2_17.method6091(Static532.aClass224_6);
								local72.method2475(local98 / 3, local83);
							}
						}
					}
				}
			}
		}
		this.aClass39_Sub2_17.method6111();
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(IILclient!k;I)V")
	public void method5952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub13_Sub6 arg2) {
		@Pc(6) Class2_Sub13_Sub6_Sub2 local6 = (Class2_Sub13_Sub6_Sub2) arg2;
		arg1 += local6.anInt8866 + 1;
		arg0 += local6.anInt8863 + 1;
		@Pc(27) int local27 = this.anInt7018 * arg0 + arg1;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt8870;
		@Pc(35) int local35 = local6.anInt8861;
		@Pc(41) int local41 = this.anInt7018 - local35;
		@Pc(43) int local43 = 0;
		@Pc(53) int local53;
		if (arg0 <= 0) {
			local53 = 1 - arg0;
			local29 = local35 * local53;
			local27 += this.anInt7018 * local53;
			local32 -= local53;
			arg0 = 1;
		}
		if (this.anInt7009 <= local32 + arg0) {
			local53 = local32 + arg0 + 1 - this.anInt7009;
			local32 -= local53;
		}
		if (arg1 <= 0) {
			local53 = 1 - arg1;
			local41 += local53;
			local35 -= local53;
			arg1 = 1;
			local29 += local53;
			local43 = local53;
			local27 += local53;
		}
		if (this.anInt7018 <= local35 + arg1) {
			local53 = local35 + arg1 + 1 - this.anInt7018;
			local35 -= local53;
			local43 += local53;
			local41 += local53;
		}
		if (local35 > 0 && local32 > 0) {
			Static210.method3336(this.aByteArray98, local27, local6.aByteArray115, local32, local35, local43, local41, local29);
			this.method5945(arg0, local35, local32, arg1);
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)V")
	public void method5954() {
		this.aClass92ArrayArray1 = new Class92[this.anInt7015][this.anInt7013];
		for (@Pc(14) int local14 = 0; local14 < this.anInt7013; local14++) {
			for (@Pc(26) int local26 = 0; local26 < this.anInt7015; local26++) {
				this.aClass92ArrayArray1[local26][local14] = new Class92(this.aClass39_Sub2_17, this, this.aClass75_Sub1_3, local26, local14, this.anInt7021, local26 * 128 + 1, local14 * 128 + 1);
				if (this.aClass92ArrayArray1[local26][local14].anInt2616 == 0) {
					this.aClass92ArrayArray1[local26][local14] = null;
				}
			}
		}
	}
}
