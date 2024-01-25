import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aca")
public final class Class5 {

	@OriginalMember(owner = "client!aca", name = "c", descriptor = "[[Lclient!k;")
	private Class185[][] aClass185ArrayArray1;

	@OriginalMember(owner = "client!aca", name = "e", descriptor = "Lclient!rl;")
	private final Class82_Sub3 aClass82_Sub3_1;

	@OriginalMember(owner = "client!aca", name = "k", descriptor = "Lclient!eha;")
	private final Class91_Sub1 aClass91_Sub1_1;

	@OriginalMember(owner = "client!aca", name = "q", descriptor = "I")
	public final int anInt89;

	@OriginalMember(owner = "client!aca", name = "j", descriptor = "I")
	private final int anInt84;

	@OriginalMember(owner = "client!aca", name = "h", descriptor = "I")
	private final int anInt82;

	@OriginalMember(owner = "client!aca", name = "g", descriptor = "[B")
	public final byte[] aByteArray1;

	@OriginalMember(owner = "client!aca", name = "l", descriptor = "I")
	private final int anInt85;

	@OriginalMember(owner = "client!aca", name = "r", descriptor = "I")
	private final int anInt90;

	@OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(Lclient!rl;Lclient!eha;)V")
	public Class5(@OriginalArg(0) Class82_Sub3 arg0, @OriginalArg(1) Class91_Sub1 arg1) {
		this.aClass82_Sub3_1 = arg0;
		this.aClass91_Sub1_1 = arg1;
		this.anInt89 = (this.aClass91_Sub1_1.anInt8986 * this.aClass91_Sub1_1.anInt8983 >> this.aClass82_Sub3_1.anInt5857) + 2;
		this.anInt84 = (this.aClass91_Sub1_1.anInt8985 * this.aClass91_Sub1_1.anInt8986 >> this.aClass82_Sub3_1.anInt5857) + 2;
		this.anInt82 = this.aClass82_Sub3_1.anInt5857 + 7 - this.aClass91_Sub1_1.anInt8988;
		this.aByteArray1 = new byte[this.anInt89 * this.anInt84];
		this.anInt85 = this.aClass91_Sub1_1.anInt8983 >> this.anInt82;
		this.anInt90 = this.aClass91_Sub1_1.anInt8985 >> this.anInt82;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(ILclient!r;II)Z")
	public boolean method87(@OriginalArg(1) Class3_Sub7_Sub17 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub7_Sub17_Sub1 local6 = (Class3_Sub7_Sub17_Sub1) arg0;
		arg1 += local6.anInt7076 + 1;
		arg2 += local6.anInt7084 + 1;
		@Pc(27) int local27 = this.anInt89 * arg2 + arg1;
		@Pc(30) int local30 = local6.anInt7086;
		@Pc(33) int local33 = local6.anInt7087;
		@Pc(39) int local39 = this.anInt89 - local33;
		@Pc(47) int local47;
		if (arg2 <= 0) {
			local47 = 1 - arg2;
			local30 -= local47;
			local27 += local47 * this.anInt89;
			arg2 = 1;
		}
		if (local30 + arg2 >= this.anInt84) {
			local47 = local30 + arg2 + 1 - this.anInt84;
			local30 -= local47;
		}
		if (arg1 <= 0) {
			local47 = 1 - arg1;
			arg1 = 1;
			local27 += local47;
			local39 += local47;
			local33 -= local47;
		}
		if (local33 + arg1 >= this.anInt89) {
			local47 = local33 + arg1 + 1 - this.anInt89;
			local39 += local47;
			local33 -= local47;
		}
		if (local33 > 0 && local30 > 0) {
			local39 += this.anInt89 * 7;
			return Static346.method5541(local30, local39, this.aByteArray1, local27, local33);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(I)V")
	public void method88() {
		this.aClass185ArrayArray1 = new Class185[this.anInt85][this.anInt90];
		for (@Pc(14) int local14 = 0; local14 < this.anInt90; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt85; local18++) {
				this.aClass185ArrayArray1[local18][local14] = new Class185(this.aClass82_Sub3_1, this, this.aClass91_Sub1_1, local18, local14, this.anInt82, local18 * 128 + 1, local14 * 128 + 1);
				if (this.aClass185ArrayArray1[local18][local14].anInt5425 == 0) {
					this.aClass185ArrayArray1[local18][local14] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(III[[ZZI)V")
	public void method89(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean[][] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		this.aClass82_Sub3_1.method5029(false);
		this.aClass82_Sub3_1.method4968(false);
		this.aClass82_Sub3_1.method4939(1);
		this.aClass82_Sub3_1.method5010(1);
		this.aClass82_Sub3_1.method4988(false, false, -2);
		@Pc(43) float local43 = 1.0F / (float) (this.aClass82_Sub3_1.anInt5853 * 128);
		@Pc(47) int local47;
		@Pc(54) int local54;
		@Pc(61) int local61;
		@Pc(63) int local63;
		if (arg3) {
			for (local47 = 0; local47 < this.anInt90; local47++) {
				local54 = local47 << this.anInt82;
				local61 = local47 + 1 << this.anInt82;
				label138: for (local63 = 0; local63 < this.anInt85; local63++) {
					if (this.aClass185ArrayArray1[local63][local47] != null) {
						@Pc(77) int local77 = local63 << this.anInt82;
						@Pc(84) int local84 = local63 + 1 << this.anInt82;
						for (@Pc(86) int local86 = local77; local86 < local84; local86++) {
							if (-arg4 <= local86 - arg0 && arg4 >= local86 - arg0) {
								for (@Pc(103) int local103 = local54; local103 < local61; local103++) {
									if (-arg4 <= local103 - arg1 && arg4 >= local103 - arg1 && arg2[arg4 + local86 - arg0][local103 + arg4 - arg1]) {
										@Pc(143) Class31_Sub2 local143 = this.aClass82_Sub3_1.method4931();
										local143.method7672(1.0F, local43, local43);
										local143.method7930(-local63, -local47, 0);
										this.aClass82_Sub3_1.method4974(Static230.aClass193_3);
										this.aClass185ArrayArray1[local63][local47].method4607();
										continue label138;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local47 = 0; local47 < this.anInt90; local47++) {
				local54 = local47 << this.anInt82;
				local61 = local47 + 1 << this.anInt82;
				for (local63 = 0; local63 < this.anInt85; local63++) {
					@Pc(230) Class185 local230 = this.aClass185ArrayArray1[local63][local47];
					if (local230 != null) {
						@Pc(241) Interface12 local241 = this.aClass82_Sub3_1.method5026(local230.anInt5425 * 3);
						@Pc(246) Buffer local246 = local241.method7573();
						if (local246 != null) {
							@Pc(256) Stream local256 = this.aClass82_Sub3_1.method4986(local246);
							@Pc(258) int local258 = 0;
							@Pc(263) int local263 = local63 << this.anInt82;
							@Pc(270) int local270 = local63 + 1 << this.anInt82;
							for (@Pc(272) int local272 = local54; local272 < local61; local272++) {
								if (local272 - arg1 >= -arg4 && arg4 >= local272 - arg1) {
									@Pc(303) int local303 = local272 * this.aClass91_Sub1_1.anInt8983 + local263;
									for (@Pc(305) int local305 = local263; local305 < local270; local305++) {
										if (local305 - arg0 >= -arg4 && arg4 >= local305 - arg0 && arg2[local305 + arg4 - arg0][local272 + arg4 - arg1]) {
											@Pc(351) short[] local351 = this.aClass91_Sub1_1.aShortArrayArray3[local303];
											if (local351 != null) {
												@Pc(357) int local357;
												if (Stream.c()) {
													for (local357 = 0; local357 < local351.length; local357++) {
														local258++;
														local256.c(local351[local357] & 0xFFFF);
													}
												} else {
													for (local357 = 0; local357 < local351.length; local357++) {
														local258++;
														local256.f(local351[local357] & 0xFFFF);
													}
												}
											}
										}
										local303++;
									}
								}
							}
							local256.b();
							if (local241.method7574() && local258 > 0) {
								@Pc(422) Class31_Sub2 local422 = this.aClass82_Sub3_1.method4931();
								local422.method7672(1.0F, local43, local43);
								local422.method7930(-local63, -local47, 0);
								this.aClass82_Sub3_1.method4974(Static230.aClass193_3);
								local230.method4608(local241, local258 / 3);
							}
						}
					}
				}
			}
		}
		this.aClass82_Sub3_1.method4973();
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(IIZLclient!r;)V")
	public void method90(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3_Sub7_Sub17 arg2) {
		@Pc(6) Class3_Sub7_Sub17_Sub1 local6 = (Class3_Sub7_Sub17_Sub1) arg2;
		arg1 += local6.anInt7076 + 1;
		arg0 += local6.anInt7084 + 1;
		@Pc(28) int local28 = arg1 + this.anInt89 * arg0;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt7086;
		@Pc(36) int local36 = local6.anInt7087;
		@Pc(42) int local42 = this.anInt89 - local36;
		@Pc(48) int local48;
		if (arg0 <= 0) {
			local48 = 1 - arg0;
			local28 += local48 * this.anInt89;
			arg0 = 1;
			local33 -= local48;
			local30 = local48 * local36;
		}
		@Pc(69) int local69 = 0;
		if (arg0 + local33 >= this.anInt84) {
			local48 = arg0 + local33 + 1 - this.anInt84;
			local33 -= local48;
		}
		if (arg1 <= 0) {
			local48 = 1 - arg1;
			arg1 = 1;
			local42 += local48;
			local30 += local48;
			local28 += local48;
			local69 = local48;
			local36 -= local48;
		}
		if (local36 + arg1 >= this.anInt89) {
			local48 = arg1 + local36 + 1 - this.anInt89;
			local36 -= local48;
			local42 += local48;
			local69 += local48;
		}
		if (local36 > 0 && local33 > 0) {
			Static406.method6320(local36, local69, local33, local28, local30, this.aByteArray1, local42, local6.aByteArray63);
			this.method92(arg1, local36, arg0, local33);
		}
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(BLclient!r;II)V")
	public void method91(@OriginalArg(1) Class3_Sub7_Sub17 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub7_Sub17_Sub1 local6 = (Class3_Sub7_Sub17_Sub1) arg0;
		arg1 += local6.anInt7076 + 1;
		arg2 += local6.anInt7084 + 1;
		@Pc(28) int local28 = arg1 + this.anInt89 * arg2;
		@Pc(39) int local39 = 0;
		@Pc(42) int local42 = local6.anInt7086;
		@Pc(45) int local45 = local6.anInt7087;
		@Pc(51) int local51 = this.anInt89 - local45;
		@Pc(53) int local53 = 0;
		@Pc(60) int local60;
		if (arg2 <= 0) {
			local60 = 1 - arg2;
			local42 -= local60;
			local28 += this.anInt89 * local60;
			arg2 = 1;
			local39 = local60 * local45;
		}
		if (local42 + arg2 >= this.anInt84) {
			local60 = local42 + arg2 + 1 - this.anInt84;
			local42 -= local60;
		}
		if (arg1 <= 0) {
			local60 = 1 - arg1;
			local51 += local60;
			local39 += local60;
			arg1 = 1;
			local28 += local60;
			local45 -= local60;
			local53 = local60;
		}
		if (local45 + arg1 >= this.anInt89) {
			local60 = arg1 + local45 + 1 - this.anInt89;
			local51 += local60;
			local45 -= local60;
			local53 += local60;
		}
		if (local45 > 0 && local42 > 0) {
			Static626.method8483(local51, local39, this.aByteArray1, local42, local6.aByteArray63, local28, local45, local53);
			this.method92(arg1, local45, arg2, local42);
		}
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(IIIII)V")
	private void method92(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass185ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg0 - 1 >> 7;
		@Pc(25) int local25 = arg1 + arg0 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg2 - 1 >> 7;
		@Pc(46) int local46 = arg3 + arg2 - 1 - 1 >> 7;
		for (@Pc(48) int local48 = local15; local48 <= local25; local48++) {
			@Pc(55) Class185[] local55 = this.aClass185ArrayArray1[local48];
			for (@Pc(57) int local57 = local31; local57 <= local46; local57++) {
				if (local55[local57] != null) {
					local55[local57].aBoolean395 = true;
				}
			}
		}
	}
}
