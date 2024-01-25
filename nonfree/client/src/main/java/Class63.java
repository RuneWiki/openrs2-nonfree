import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class63 {

	@OriginalMember(owner = "client!cm", name = "q", descriptor = "[[Lclient!kg;")
	private Class207[][] aClass207ArrayArray1;

	@OriginalMember(owner = "client!cm", name = "t", descriptor = "Lclient!ek;")
	private final Class104_Sub1 aClass104_Sub1_1;

	@OriginalMember(owner = "client!cm", name = "n", descriptor = "Lclient!sf;")
	private final Class16_Sub1 aClass16_Sub1_4;

	@OriginalMember(owner = "client!cm", name = "m", descriptor = "I")
	public final int anInt1907;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
	private final int anInt1898;

	@OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
	private final int anInt1903;

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "[B")
	public final byte[] aByteArray8;

	@OriginalMember(owner = "client!cm", name = "u", descriptor = "I")
	private final int anInt1912;

	@OriginalMember(owner = "client!cm", name = "r", descriptor = "I")
	private final int anInt1910;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lclient!sf;Lclient!ek;)V")
	public Class63(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(1) Class104_Sub1 arg1) {
		this.aClass104_Sub1_1 = arg1;
		this.aClass16_Sub1_4 = arg0;
		this.anInt1907 = (this.aClass104_Sub1_1.anInt9716 * this.aClass104_Sub1_1.anInt9718 >> this.aClass16_Sub1_4.anInt7446) + 2;
		this.anInt1898 = (this.aClass104_Sub1_1.anInt9716 * this.aClass104_Sub1_1.anInt9715 >> this.aClass16_Sub1_4.anInt7446) + 2;
		this.anInt1903 = this.aClass16_Sub1_4.anInt7446 + 7 - this.aClass104_Sub1_1.anInt9717;
		this.aByteArray8 = new byte[this.anInt1898 * this.anInt1907];
		this.anInt1912 = this.aClass104_Sub1_1.anInt9718 >> this.anInt1903;
		this.anInt1910 = this.aClass104_Sub1_1.anInt9715 >> this.anInt1903;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "([[ZIIZBI)V")
	public void method1769(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		this.aClass16_Sub1_4.method6260(false);
		this.aClass16_Sub1_4.method6232(false);
		this.aClass16_Sub1_4.method6239(1);
		this.aClass16_Sub1_4.method6233(1);
		this.aClass16_Sub1_4.method6264(-2, false, false);
		@Pc(49) float local49 = 1.0F / (float) (this.aClass16_Sub1_4.anInt7476 * 128);
		@Pc(53) int local53;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(69) int local69;
		if (arg3) {
			for (local53 = 0; local53 < this.anInt1910; local53++) {
				local60 = local53 << this.anInt1903;
				local67 = local53 + 1 << this.anInt1903;
				label138: for (local69 = 0; local69 < this.anInt1912; local69++) {
					if (this.aClass207ArrayArray1[local69][local53] != null) {
						@Pc(83) int local83 = local69 << this.anInt1903;
						@Pc(90) int local90 = local69 + 1 << this.anInt1903;
						for (@Pc(92) int local92 = local83; local92 < local90; local92++) {
							if (-arg2 <= local92 - arg4 && local92 - arg4 <= arg2) {
								for (@Pc(117) int local117 = local60; local117 < local67; local117++) {
									if (local117 - arg1 >= -arg2 && arg2 >= local117 - arg1 && arg0[arg2 + local92 - arg4][local117 + arg2 - arg1]) {
										@Pc(157) Class25_Sub3 local157 = this.aClass16_Sub1_4.method6255();
										local157.method4323(local49, local49, 1.0F);
										local157.method4301(-local69, -local53, 0);
										this.aClass16_Sub1_4.method6212(Static523.aClass20_6);
										this.aClass207ArrayArray1[local69][local53].method4694();
										continue label138;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local53 = 0; local53 < this.anInt1910; local53++) {
				local60 = local53 << this.anInt1903;
				local67 = local53 + 1 << this.anInt1903;
				for (local69 = 0; local69 < this.anInt1912; local69++) {
					@Pc(244) Class207 local244 = this.aClass207ArrayArray1[local69][local53];
					if (local244 != null) {
						@Pc(255) Interface22 local255 = this.aClass16_Sub1_4.method6273(local244.anInt5564 * 3);
						@Pc(260) Buffer local260 = local255.method7739();
						if (local260 != null) {
							@Pc(268) Stream local268 = this.aClass16_Sub1_4.method6328(local260);
							@Pc(270) int local270 = 0;
							@Pc(275) int local275 = local69 << this.anInt1903;
							@Pc(282) int local282 = local69 + 1 << this.anInt1903;
							for (@Pc(284) int local284 = local60; local284 < local67; local284++) {
								if (local284 - arg1 >= -arg2 && arg2 >= local284 - arg1) {
									@Pc(315) int local315 = local275 + local284 * this.aClass104_Sub1_1.anInt9718;
									for (@Pc(317) int local317 = local275; local317 < local282; local317++) {
										if (local317 - arg4 >= -arg2 && local317 - arg4 <= arg2 && arg0[arg2 + local317 - arg4][arg2 + local284 - arg1]) {
											@Pc(358) short[] local358 = this.aClass104_Sub1_1.aShortArrayArray7[local315];
											if (local358 != null) {
												@Pc(364) int local364;
												if (Stream.c()) {
													for (local364 = 0; local364 < local358.length; local364++) {
														local268.e(local358[local364] & 0xFFFF);
														local270++;
													}
												} else {
													for (local364 = 0; local364 < local358.length; local364++) {
														local268.a(local358[local364] & 0xFFFF);
														local270++;
													}
												}
											}
										}
										local315++;
									}
								}
							}
							local268.b();
							if (local255.method7738() && local270 > 0) {
								@Pc(435) Class25_Sub3 local435 = this.aClass16_Sub1_4.method6255();
								local435.method4323(local49, local49, 1.0F);
								local435.method4301(-local69, -local53, 0);
								this.aClass16_Sub1_4.method6212(Static523.aClass20_6);
								local244.method4697(local270 / 3, local255);
							}
						}
					}
				}
			}
		}
		this.aClass16_Sub1_4.method6226();
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IBILclient!r;)Z")
	public boolean method1770(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub6_Sub12 arg2) {
		@Pc(6) Class3_Sub6_Sub12_Sub1 local6 = (Class3_Sub6_Sub12_Sub1) arg2;
		arg1 += local6.anInt4916 + 1;
		arg0 += local6.anInt4918 + 1;
		@Pc(36) int local36 = arg0 + arg1 * this.anInt1907;
		@Pc(39) int local39 = local6.anInt4912;
		@Pc(42) int local42 = local6.anInt4915;
		@Pc(47) int local47 = this.anInt1907 - local42;
		@Pc(54) int local54;
		if (arg1 <= 0) {
			local54 = 1 - arg1;
			local39 -= local54;
			arg1 = 1;
			local36 += local54 * this.anInt1907;
		}
		if (this.anInt1898 <= local39 + arg1) {
			local54 = arg1 + local39 + 1 - this.anInt1898;
			local39 -= local54;
		}
		if (arg0 <= 0) {
			local54 = 1 - arg0;
			arg0 = 1;
			local42 -= local54;
			local47 += local54;
			local36 += local54;
		}
		if (arg0 + local42 >= this.anInt1907) {
			local54 = local42 + arg0 + 1 - this.anInt1907;
			local42 -= local54;
			local47 += local54;
		}
		if (local42 > 0 && local39 > 0) {
			local47 += this.anInt1907 * 7;
			return Static346.method5221(local42, local39, local47, local36, this.aByteArray8);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIII)V")
	private void method1772(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass207ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg2 - 1 >> 7;
		@Pc(26) int local26 = arg2 + arg3 - 1 - 1 >> 7;
		@Pc(32) int local32 = arg0 - 1 >> 7;
		@Pc(42) int local42 = arg0 + arg1 - 1 - 1 >> 7;
		for (@Pc(44) int local44 = local15; local44 <= local26; local44++) {
			@Pc(51) Class207[] local51 = this.aClass207ArrayArray1[local44];
			for (@Pc(53) int local53 = local32; local53 <= local42; local53++) {
				if (local51[local53] != null) {
					local51[local53].aBoolean430 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(BLclient!r;II)V")
	public void method1773(@OriginalArg(1) Class3_Sub6_Sub12 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub6_Sub12_Sub1 local6 = (Class3_Sub6_Sub12_Sub1) arg0;
		arg2 += local6.anInt4916 + 1;
		arg1 += local6.anInt4918 + 1;
		@Pc(35) int local35 = arg1 + this.anInt1907 * arg2;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = local6.anInt4912;
		@Pc(43) int local43 = local6.anInt4915;
		@Pc(48) int local48 = this.anInt1907 - local43;
		@Pc(55) int local55;
		if (arg2 <= 0) {
			local55 = 1 - arg2;
			arg2 = 1;
			local37 = local43 * local55;
			local40 -= local55;
			local35 += local55 * this.anInt1907;
		}
		@Pc(76) int local76 = 0;
		if (this.anInt1898 <= arg2 + local40) {
			local55 = arg2 + local40 + 1 - this.anInt1898;
			local40 -= local55;
		}
		if (arg1 <= 0) {
			local55 = 1 - arg1;
			local35 += local55;
			local43 -= local55;
			local37 += local55;
			arg1 = 1;
			local48 += local55;
			local76 = local55;
		}
		if (this.anInt1907 <= local43 + arg1) {
			local55 = arg1 + local43 + 1 - this.anInt1907;
			local76 += local55;
			local43 -= local55;
			local48 += local55;
		}
		if (local43 > 0 && local40 > 0) {
			Static201.method3187(local76, this.aByteArray8, local35, local43, local6.aByteArray49, local48, local40, local37);
			this.method1772(arg2, local40, arg1, local43);
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V")
	public void method1774() {
		this.aClass207ArrayArray1 = new Class207[this.anInt1912][this.anInt1910];
		for (@Pc(18) int local18 = 0; local18 < this.anInt1910; local18++) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt1912; local22++) {
				this.aClass207ArrayArray1[local22][local18] = new Class207(this.aClass16_Sub1_4, this, this.aClass104_Sub1_1, local22, local18, this.anInt1903, local22 * 128 + 1, local18 * 128 - -1);
				if (this.aClass207ArrayArray1[local22][local18].anInt5564 == 0) {
					this.aClass207ArrayArray1[local22][local18] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!r;II)V")
	public void method1777(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub6_Sub12 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub6_Sub12_Sub1 local6 = (Class3_Sub6_Sub12_Sub1) arg1;
		arg0 += local6.anInt4918 + 1;
		arg2 += local6.anInt4916 + 1;
		@Pc(27) int local27 = arg0 + arg2 * this.anInt1907;
		@Pc(34) int local34 = 0;
		@Pc(37) int local37 = local6.anInt4912;
		@Pc(40) int local40 = local6.anInt4915;
		@Pc(46) int local46 = this.anInt1907 - local40;
		@Pc(56) int local56;
		if (arg2 <= 0) {
			local56 = 1 - arg2;
			arg2 = 1;
			local27 += this.anInt1907 * local56;
			local34 = local56 * local40;
			local37 -= local56;
		}
		@Pc(77) int local77 = 0;
		if (arg2 + local37 >= this.anInt1898) {
			local56 = local37 + arg2 + 1 - this.anInt1898;
			local37 -= local56;
		}
		if (arg0 <= 0) {
			local56 = 1 - arg0;
			local77 = local56;
			local46 += local56;
			local27 += local56;
			local40 -= local56;
			arg0 = 1;
			local34 += local56;
		}
		if (this.anInt1907 <= local40 + arg0) {
			local56 = arg0 + local40 + 1 - this.anInt1907;
			local40 -= local56;
			local77 += local56;
			local46 += local56;
		}
		if (local40 > 0 && local37 > 0) {
			Static163.method2753(local40, local6.aByteArray49, this.aByteArray8, local34, local27, local37, local46, local77);
			this.method1772(arg2, local37, arg0, local40);
		}
	}
}
