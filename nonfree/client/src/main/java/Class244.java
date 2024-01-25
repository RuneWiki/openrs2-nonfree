import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nt")
public final class Class244 {

	@OriginalMember(owner = "client!nt", name = "h", descriptor = "[[Lclient!hp;")
	private Class141[][] aClass141ArrayArray1;

	@OriginalMember(owner = "client!nt", name = "j", descriptor = "Lclient!ew;")
	private final Class21_Sub3 aClass21_Sub3_3;

	@OriginalMember(owner = "client!nt", name = "f", descriptor = "Lclient!ai;")
	private final Class13_Sub1 aClass13_Sub1_16;

	@OriginalMember(owner = "client!nt", name = "i", descriptor = "I")
	public final int anInt6600;

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
	private final int anInt6596;

	@OriginalMember(owner = "client!nt", name = "g", descriptor = "I")
	private final int anInt6599;

	@OriginalMember(owner = "client!nt", name = "p", descriptor = "[B")
	public final byte[] aByteArray74;

	@OriginalMember(owner = "client!nt", name = "d", descriptor = "I")
	private final int anInt6597;

	@OriginalMember(owner = "client!nt", name = "u", descriptor = "I")
	private final int anInt6609;

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lclient!ai;Lclient!ew;)V")
	public Class244(@OriginalArg(0) Class13_Sub1 arg0, @OriginalArg(1) Class21_Sub3 arg1) {
		this.aClass21_Sub3_3 = arg1;
		this.aClass13_Sub1_16 = arg0;
		this.anInt6600 = (this.aClass21_Sub3_3.anInt9123 * this.aClass21_Sub3_3.anInt9129 >> this.aClass13_Sub1_16.anInt8595) + 2;
		this.anInt6596 = (this.aClass21_Sub3_3.anInt9123 * this.aClass21_Sub3_3.anInt9128 >> this.aClass13_Sub1_16.anInt8595) + 2;
		this.anInt6599 = this.aClass13_Sub1_16.anInt8595 + 7 - this.aClass21_Sub3_3.anInt9125;
		this.aByteArray74 = new byte[this.anInt6600 * this.anInt6596];
		this.anInt6597 = this.aClass21_Sub3_3.anInt9129 >> this.anInt6599;
		this.anInt6609 = this.aClass21_Sub3_3.anInt9128 >> this.anInt6599;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V")
	public void method5897() {
		this.aClass141ArrayArray1 = new Class141[this.anInt6597][this.anInt6609];
		for (@Pc(14) int local14 = 0; local14 < this.anInt6609; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt6597; local18++) {
				this.aClass141ArrayArray1[local18][local14] = new Class141(this.aClass13_Sub1_16, this, this.aClass21_Sub3_3, local18, local14, this.anInt6599, local18 * 128 + 1, local14 * 128 - -1);
				if (this.aClass141ArrayArray1[local18][local14].anInt4291 == 0) {
					this.aClass141ArrayArray1[local18][local14] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIII)V")
	private void method5899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass141ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg3 - 1 >> 7;
		@Pc(39) int local39 = arg3 + arg2 - 1 - 1 >> 7;
		@Pc(45) int local45 = arg0 - 1 >> 7;
		@Pc(53) int local53 = arg0 + arg1 - 2 >> 7;
		for (@Pc(55) int local55 = local15; local55 <= local39; local55++) {
			@Pc(62) Class141[] local62 = this.aClass141ArrayArray1[local55];
			for (@Pc(64) int local64 = local45; local64 <= local53; local64++) {
				if (local62[local64] != null) {
					local62[local64].aBoolean321 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIILclient!r;)V")
	public void method5900(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub11_Sub3 arg2) {
		@Pc(6) Class3_Sub11_Sub3_Sub1 local6 = (Class3_Sub11_Sub3_Sub1) arg2;
		arg1 += local6.anInt1813 + 1;
		arg0 += local6.anInt1811 + 1;
		@Pc(28) int local28 = arg0 + arg1 * this.anInt6600;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt1812;
		@Pc(36) int local36 = local6.anInt1816;
		@Pc(42) int local42 = this.anInt6600 - local36;
		@Pc(51) int local51;
		if (arg1 <= 0) {
			local51 = 1 - arg1;
			arg1 = 1;
			local28 += this.anInt6600 * local51;
			local33 -= local51;
			local30 = local36 * local51;
		}
		@Pc(72) int local72 = 0;
		if (this.anInt6596 <= local33 + arg1) {
			local51 = local33 + arg1 + 1 - this.anInt6596;
			local33 -= local51;
		}
		if (arg0 <= 0) {
			local51 = 1 - arg0;
			local30 += local51;
			arg0 = 1;
			local28 += local51;
			local36 -= local51;
			local42 += local51;
			local72 = local51;
		}
		if (arg0 + local36 >= this.anInt6600) {
			local51 = local36 + arg0 + 1 - this.anInt6600;
			local36 -= local51;
			local42 += local51;
			local72 += local51;
		}
		if (local36 > 0 && local33 > 0) {
			Static577.method9347(local33, this.aByteArray74, local36, local28, local30, local6.aByteArray12, local72, local42);
			this.method5899(arg1, local33, local36, arg0);
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(BZII[[ZI)V")
	public void method5902(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3, @OriginalArg(5) int arg4) {
		this.aClass13_Sub1_16.method7465(false);
		this.aClass13_Sub1_16.method7505(false);
		this.aClass13_Sub1_16.method7440(1);
		this.aClass13_Sub1_16.method7509(1);
		this.aClass13_Sub1_16.method7508(false, -2, false);
		@Pc(54) float local54 = 1.0F / (float) (this.aClass13_Sub1_16.anInt8626 * 128);
		@Pc(58) int local58;
		@Pc(65) int local65;
		@Pc(72) int local72;
		@Pc(74) int local74;
		if (arg0) {
			for (local58 = 0; local58 < this.anInt6609; local58++) {
				local65 = local58 << this.anInt6599;
				local72 = local58 + 1 << this.anInt6599;
				label87: for (local74 = 0; local74 < this.anInt6597; local74++) {
					if (this.aClass141ArrayArray1[local74][local58] != null) {
						@Pc(347) int local347 = local74 << this.anInt6599;
						@Pc(354) int local354 = local74 + 1 << this.anInt6599;
						for (@Pc(356) int local356 = local347; local356 < local354; local356++) {
							if (local356 - arg2 >= -arg4 && arg4 >= local356 - arg2) {
								for (@Pc(377) int local377 = local65; local377 < local72; local377++) {
									if (-arg4 <= local377 - arg1 && arg4 >= local377 - arg1 && arg3[local356 + arg4 - arg2][arg4 + local377 - arg1]) {
										@Pc(413) Class239_Sub3 local413 = this.aClass13_Sub1_16.method7512();
										local413.method9260(local54, 1.0F, local54);
										local413.method9244(-local74, -local58, 0);
										this.aClass13_Sub1_16.method7464(Static178.aClass94_4);
										this.aClass141ArrayArray1[local74][local58].method3914();
										continue label87;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local58 = 0; local58 < this.anInt6609; local58++) {
				local65 = local58 << this.anInt6599;
				local72 = local58 + 1 << this.anInt6599;
				for (local74 = 0; local74 < this.anInt6597; local74++) {
					@Pc(83) Class141 local83 = this.aClass141ArrayArray1[local74][local58];
					if (local83 != null) {
						@Pc(94) Interface20 local94 = this.aClass13_Sub1_16.method7492(local83.anInt4291 * 3);
						@Pc(99) Buffer local99 = local94.method7828();
						if (local99 != null) {
							@Pc(107) Stream local107 = this.aClass13_Sub1_16.method7409(local99);
							@Pc(109) int local109 = 0;
							@Pc(114) int local114 = local74 << this.anInt6599;
							@Pc(121) int local121 = local74 + 1 << this.anInt6599;
							for (@Pc(123) int local123 = local65; local123 < local72; local123++) {
								if (-arg4 <= local123 - arg1 && arg4 >= local123 - arg1) {
									@Pc(154) int local154 = local114 + this.aClass21_Sub3_3.anInt9129 * local123;
									for (@Pc(156) int local156 = local114; local156 < local121; local156++) {
										if (local156 - arg2 >= -arg4 && local156 - arg2 <= arg4 && arg3[arg4 + local156 - arg2][local123 + arg4 - arg1]) {
											@Pc(200) short[] local200 = this.aClass21_Sub3_3.aShortArrayArray13[local154];
											if (local200 != null) {
												@Pc(206) int local206;
												if (Stream.c()) {
													for (local206 = 0; local206 < local200.length; local206++) {
														local107.b(local200[local206] & 0xFFFF);
														local109++;
													}
												} else {
													for (local206 = 0; local206 < local200.length; local206++) {
														local109++;
														local107.c(local200[local206] & 0xFFFF);
													}
												}
											}
										}
										local154++;
									}
								}
							}
							local107.a();
							if (local94.method7826() && local109 > 0) {
								@Pc(270) Class239_Sub3 local270 = this.aClass13_Sub1_16.method7512();
								local270.method9260(local54, 1.0F, local54);
								local270.method9244(-local74, -local58, 0);
								this.aClass13_Sub1_16.method7464(Static178.aClass94_4);
								local83.method3912(local94, local109 / 3);
							}
						}
					}
				}
			}
		}
		this.aClass13_Sub1_16.method7510();
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ILclient!r;ZI)V")
	public void method5903(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub11_Sub3 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub11_Sub3_Sub1 local6 = (Class3_Sub11_Sub3_Sub1) arg1;
		arg2 += local6.anInt1811 + 1;
		arg0 += local6.anInt1813 + 1;
		@Pc(41) int local41 = arg2 + this.anInt6600 * arg0;
		@Pc(43) int local43 = 0;
		@Pc(46) int local46 = local6.anInt1812;
		@Pc(49) int local49 = local6.anInt1816;
		@Pc(54) int local54 = this.anInt6600 - local49;
		@Pc(56) int local56 = 0;
		@Pc(65) int local65;
		if (arg0 <= 0) {
			local65 = 1 - arg0;
			local46 -= local65;
			local41 += this.anInt6600 * local65;
			local43 = local49 * local65;
			arg0 = 1;
		}
		if (this.anInt6596 <= arg0 + local46) {
			local65 = local46 + arg0 + 1 - this.anInt6596;
			local46 -= local65;
		}
		if (arg2 <= 0) {
			local65 = 1 - arg2;
			local41 += local65;
			arg2 = 1;
			local43 += local65;
			local54 += local65;
			local49 -= local65;
			local56 = local65;
		}
		if (arg2 + local49 >= this.anInt6600) {
			local65 = arg2 + local49 + 1 - this.anInt6600;
			local54 += local65;
			local49 -= local65;
			local56 += local65;
		}
		if (local49 > 0 && local46 > 0) {
			Static196.method3564(local6.aByteArray12, local54, local56, this.aByteArray74, local41, local49, local43, local46);
			this.method5899(arg0, local46, local49, arg2);
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IILclient!r;I)Z")
	public boolean method5905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub11_Sub3 arg2) {
		@Pc(6) Class3_Sub11_Sub3_Sub1 local6 = (Class3_Sub11_Sub3_Sub1) arg2;
		arg0 += local6.anInt1811 + 1;
		arg1 += local6.anInt1813 + 1;
		@Pc(27) int local27 = arg1 * this.anInt6600 + arg0;
		@Pc(35) int local35 = local6.anInt1812;
		@Pc(38) int local38 = local6.anInt1816;
		@Pc(44) int local44 = this.anInt6600 - local38;
		@Pc(51) int local51;
		if (arg1 <= 0) {
			local51 = 1 - arg1;
			arg1 = 1;
			local27 += local51 * this.anInt6600;
			local35 -= local51;
		}
		if (this.anInt6596 <= local35 + arg1) {
			local51 = arg1 + local35 + 1 - this.anInt6596;
			local35 -= local51;
		}
		if (arg0 <= 0) {
			local51 = 1 - arg0;
			local44 += local51;
			local38 -= local51;
			arg0 = 1;
			local27 += local51;
		}
		if (this.anInt6600 <= local38 + arg0) {
			local51 = arg0 + local38 + 1 - this.anInt6600;
			local38 -= local51;
			local44 += local51;
		}
		if (local38 > 0 && local35 > 0) {
			local44 += this.anInt6600 * 7;
			return Static527.method7606(local38, local35, local44, local27, this.aByteArray74);
		} else {
			return false;
		}
	}
}
