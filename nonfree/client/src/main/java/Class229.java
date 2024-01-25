import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class229 {

	@OriginalMember(owner = "client!o", name = "a", descriptor = "[[Lclient!kj;")
	private Class177[][] aClass177ArrayArray1;

	@OriginalMember(owner = "client!o", name = "d", descriptor = "Lclient!iq;")
	private final Class59_Sub2 aClass59_Sub2_2;

	@OriginalMember(owner = "client!o", name = "g", descriptor = "Lclient!kea;")
	private final Class14_Sub2 aClass14_Sub2_10;

	@OriginalMember(owner = "client!o", name = "p", descriptor = "I")
	public final int anInt6288;

	@OriginalMember(owner = "client!o", name = "i", descriptor = "I")
	private final int anInt6282;

	@OriginalMember(owner = "client!o", name = "h", descriptor = "I")
	private final int anInt6281;

	@OriginalMember(owner = "client!o", name = "r", descriptor = "[B")
	public final byte[] aByteArray79;

	@OriginalMember(owner = "client!o", name = "q", descriptor = "I")
	private final int anInt6289;

	@OriginalMember(owner = "client!o", name = "b", descriptor = "I")
	private final int anInt6278;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Lclient!kea;Lclient!iq;)V")
	public Class229(@OriginalArg(0) Class14_Sub2 arg0, @OriginalArg(1) Class59_Sub2 arg1) {
		this.aClass59_Sub2_2 = arg1;
		this.aClass14_Sub2_10 = arg0;
		this.anInt6288 = (this.aClass59_Sub2_2.anInt9641 * this.aClass59_Sub2_2.anInt9640 >> this.aClass14_Sub2_10.anInt8591) + 2;
		this.anInt6282 = (this.aClass59_Sub2_2.anInt9639 * this.aClass59_Sub2_2.anInt9641 >> this.aClass14_Sub2_10.anInt8591) + 2;
		this.anInt6281 = this.aClass14_Sub2_10.anInt8591 + 7 - this.aClass59_Sub2_2.anInt9638;
		this.aByteArray79 = new byte[this.anInt6288 * this.anInt6282];
		this.anInt6289 = this.aClass59_Sub2_2.anInt9640 >> this.anInt6281;
		this.anInt6278 = this.aClass59_Sub2_2.anInt9639 >> this.anInt6281;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IILclient!w;Z)Z")
	public boolean method5380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub2_Sub14 arg2) {
		@Pc(6) Class6_Sub2_Sub14_Sub1 local6 = (Class6_Sub2_Sub14_Sub1) arg2;
		arg1 += local6.anInt6811 + 1;
		arg0 += local6.anInt6805 + 1;
		@Pc(33) int local33 = arg0 * this.anInt6288 + arg1;
		@Pc(36) int local36 = local6.anInt6806;
		@Pc(39) int local39 = local6.anInt6804;
		@Pc(46) int local46;
		if (arg0 <= 0) {
			local46 = 1 - arg0;
			arg0 = 1;
			local33 += local46 * this.anInt6288;
			local36 -= local46;
		}
		@Pc(64) int local64 = this.anInt6288 - local39;
		if (arg0 + local36 >= this.anInt6282) {
			local46 = local36 + arg0 + 1 - this.anInt6282;
			local36 -= local46;
		}
		if (arg1 <= 0) {
			local46 = 1 - arg1;
			local64 += local46;
			local39 -= local46;
			local33 += local46;
			arg1 = 1;
		}
		if (this.anInt6288 <= arg1 + local39) {
			local46 = local39 + arg1 + 1 - this.anInt6288;
			local64 += local46;
			local39 -= local46;
		}
		if (local39 > 0 && local36 > 0) {
			local64 += this.anInt6288 * 7;
			return Static32.method906(local39, local64, local36, this.aByteArray79, local33);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "([[ZIZIZI)V")
	public void method5381(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.aClass14_Sub2_10.method6947(false);
		this.aClass14_Sub2_10.method6906(false);
		this.aClass14_Sub2_10.method6998(1);
		this.aClass14_Sub2_10.method7011(1);
		this.aClass14_Sub2_10.method6981(false, -2, false);
		@Pc(51) float local51 = 1.0F / (float) (this.aClass14_Sub2_10.anInt8604 * 128);
		@Pc(55) int local55;
		@Pc(62) int local62;
		@Pc(69) int local69;
		@Pc(71) int local71;
		if (arg2) {
			for (local55 = 0; local55 < this.anInt6278; local55++) {
				local62 = local55 << this.anInt6281;
				local69 = local55 + 1 << this.anInt6281;
				label138: for (local71 = 0; local71 < this.anInt6289; local71++) {
					if (this.aClass177ArrayArray1[local71][local55] != null) {
						@Pc(85) int local85 = local71 << this.anInt6281;
						@Pc(92) int local92 = local71 + 1 << this.anInt6281;
						for (@Pc(94) int local94 = local85; local94 < local92; local94++) {
							if (local94 - arg3 >= -arg1 && arg1 >= local94 - arg3) {
								for (@Pc(119) int local119 = local62; local119 < local69; local119++) {
									if (local119 - arg4 >= -arg1 && arg1 >= local119 - arg4 && arg0[arg1 + local94 - arg3][local119 + arg1 - arg4]) {
										@Pc(162) Class54_Sub3 local162 = this.aClass14_Sub2_10.method7020();
										local162.method5462(local51, local51, 1.0F);
										local162.G(-local71, -local55, 0);
										this.aClass14_Sub2_10.method7023(Static206.aClass280_4);
										this.aClass177ArrayArray1[local71][local55].method4390();
										continue label138;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local55 = 0; local55 < this.anInt6278; local55++) {
				local62 = local55 << this.anInt6281;
				local69 = local55 + 1 << this.anInt6281;
				for (local71 = 0; local71 < this.anInt6289; local71++) {
					@Pc(245) Class177 local245 = this.aClass177ArrayArray1[local71][local55];
					if (local245 != null) {
						@Pc(256) Interface23 local256 = this.aClass14_Sub2_10.method6945(local245.anInt5093 * 3);
						@Pc(261) Buffer local261 = local256.method4095();
						if (local261 != null) {
							@Pc(269) Stream local269 = this.aClass14_Sub2_10.method6939(local261);
							@Pc(271) int local271 = 0;
							@Pc(276) int local276 = local71 << this.anInt6281;
							@Pc(283) int local283 = local71 + 1 << this.anInt6281;
							for (@Pc(285) int local285 = local62; local285 < local69; local285++) {
								if (-arg1 <= local285 - arg4 && local285 - arg4 <= arg1) {
									@Pc(311) int local311 = local276 + this.aClass59_Sub2_2.anInt9640 * local285;
									for (@Pc(313) int local313 = local276; local313 < local283; local313++) {
										if (local313 - arg3 >= -arg1 && local313 - arg3 <= arg1 && arg0[local313 + arg1 - arg3][local285 + arg1 - arg4]) {
											@Pc(354) short[] local354 = this.aClass59_Sub2_2.aShortArrayArray7[local311];
											if (local354 != null) {
												@Pc(360) int local360;
												if (Stream.b()) {
													for (local360 = 0; local360 < local354.length; local360++) {
														local271++;
														local269.c(local354[local360] & 0xFFFF);
													}
												} else {
													for (local360 = 0; local360 < local354.length; local360++) {
														local271++;
														local269.a(local354[local360] & 0xFFFF);
													}
												}
											}
										}
										local311++;
									}
								}
							}
							local269.c();
							if (local256.method4094() && local271 > 0) {
								@Pc(427) Class54_Sub3 local427 = this.aClass14_Sub2_10.method7020();
								local427.method5462(local51, local51, 1.0F);
								local427.G(-local71, -local55, 0);
								this.aClass14_Sub2_10.method7023(Static206.aClass280_4);
								local245.method4387(local271 / 3, local256);
							}
						}
					}
				}
			}
		}
		this.aClass14_Sub2_10.method7002();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IILclient!w;I)V")
	public void method5383(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub2_Sub14 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class6_Sub2_Sub14_Sub1 local6 = (Class6_Sub2_Sub14_Sub1) arg1;
		arg2 += local6.anInt6805 + 1;
		arg0 += local6.anInt6811 + 1;
		@Pc(27) int local27 = arg0 + arg2 * this.anInt6288;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt6806;
		@Pc(35) int local35 = local6.anInt6804;
		@Pc(41) int local41 = this.anInt6288 - local35;
		@Pc(43) int local43 = 0;
		@Pc(53) int local53;
		if (arg2 <= 0) {
			local53 = 1 - arg2;
			local29 = local35 * local53;
			local27 += this.anInt6288 * local53;
			arg2 = 1;
			local32 -= local53;
		}
		if (this.anInt6282 <= arg2 + local32) {
			local53 = local32 + arg2 + 1 - this.anInt6282;
			local32 -= local53;
		}
		if (arg0 <= 0) {
			local53 = 1 - arg0;
			local27 += local53;
			local29 += local53;
			local41 += local53;
			arg0 = 1;
			local43 = local53;
			local35 -= local53;
		}
		if (this.anInt6288 <= arg0 + local35) {
			local53 = local35 + arg0 + 1 - this.anInt6288;
			local35 -= local53;
			local43 += local53;
			local41 += local53;
		}
		if (local35 > 0 && local32 > 0) {
			Static534.method7248(local29, local41, local43, local6.aByteArray86, local27, local35, this.aByteArray79, local32);
			this.method5387(local32, local35, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
	public void method5384() {
		this.aClass177ArrayArray1 = new Class177[this.anInt6289][this.anInt6278];
		for (@Pc(25) int local25 = 0; local25 < this.anInt6278; local25++) {
			for (@Pc(29) int local29 = 0; local29 < this.anInt6289; local29++) {
				this.aClass177ArrayArray1[local29][local25] = new Class177(this.aClass14_Sub2_10, this, this.aClass59_Sub2_2, local29, local25, this.anInt6281, local29 * 128 + 1, local25 * 128 + 1);
				if (this.aClass177ArrayArray1[local29][local25].anInt5093 == 0) {
					this.aClass177ArrayArray1[local29][local25] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BLclient!w;II)V")
	public void method5385(@OriginalArg(1) Class6_Sub2_Sub14 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class6_Sub2_Sub14_Sub1 local6 = (Class6_Sub2_Sub14_Sub1) arg0;
		arg2 += local6.anInt6805 + 1;
		arg1 += local6.anInt6811 + 1;
		@Pc(38) int local38 = arg1 + this.anInt6288 * arg2;
		@Pc(40) int local40 = 0;
		@Pc(43) int local43 = local6.anInt6806;
		@Pc(46) int local46 = local6.anInt6804;
		@Pc(52) int local52 = this.anInt6288 - local46;
		@Pc(54) int local54 = 0;
		@Pc(64) int local64;
		if (arg2 <= 0) {
			local64 = 1 - arg2;
			local40 = local64 * local46;
			arg2 = 1;
			local38 += this.anInt6288 * local64;
			local43 -= local64;
		}
		if (this.anInt6282 <= arg2 + local43) {
			local64 = local43 + arg2 + 1 - this.anInt6282;
			local43 -= local64;
		}
		if (arg1 <= 0) {
			local64 = 1 - arg1;
			arg1 = 1;
			local38 += local64;
			local46 -= local64;
			local40 += local64;
			local54 = local64;
			local52 += local64;
		}
		if (this.anInt6288 <= arg1 + local46) {
			local64 = local46 + arg1 + 1 - this.anInt6288;
			local52 += local64;
			local54 += local64;
			local46 -= local64;
		}
		if (local46 > 0 && local43 > 0) {
			Static89.method1677(local40, local43, local52, local38, local46, local6.aByteArray86, local54, this.aByteArray79);
			this.method5387(local43, local46, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIB)V")
	private void method5387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass177ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg3 - 1 >> 7;
		@Pc(34) int local34 = arg3 + arg1 - 1 - 1 >> 7;
		@Pc(40) int local40 = arg2 - 1 >> 7;
		@Pc(50) int local50 = arg0 + arg2 - 1 - 1 >> 7;
		for (@Pc(52) int local52 = local15; local52 <= local34; local52++) {
			@Pc(59) Class177[] local59 = this.aClass177ArrayArray1[local52];
			for (@Pc(61) int local61 = local40; local61 <= local50; local61++) {
				if (local59[local61] != null) {
					local59[local61].aBoolean360 = true;
				}
			}
		}
	}
}
