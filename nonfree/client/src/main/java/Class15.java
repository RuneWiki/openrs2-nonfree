import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class15 {

	@OriginalMember(owner = "client!ap", name = "x", descriptor = "[[Lclient!vu;")
	private Class312[][] aClass312ArrayArray1;

	@OriginalMember(owner = "client!ap", name = "o", descriptor = "Lclient!cb;")
	private final Class9_Sub1 aClass9_Sub1_1;

	@OriginalMember(owner = "client!ap", name = "f", descriptor = "Lclient!ih;")
	private final Class10_Sub2 aClass10_Sub2_1;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "I")
	public final int anInt853;

	@OriginalMember(owner = "client!ap", name = "p", descriptor = "I")
	private final int anInt865;

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
	private final int anInt857;

	@OriginalMember(owner = "client!ap", name = "u", descriptor = "[B")
	public final byte[] aByteArray3;

	@OriginalMember(owner = "client!ap", name = "r", descriptor = "I")
	private final int anInt867;

	@OriginalMember(owner = "client!ap", name = "k", descriptor = "I")
	private final int anInt861;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lclient!cb;Lclient!ih;)V")
	public Class15(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) Class10_Sub2 arg1) {
		this.aClass9_Sub1_1 = arg0;
		this.aClass10_Sub2_1 = arg1;
		this.anInt853 = (this.aClass10_Sub2_1.anInt7410 * this.aClass10_Sub2_1.anInt7412 >> this.aClass9_Sub1_1.anInt9216) + 2;
		this.anInt865 = (this.aClass10_Sub2_1.anInt7410 * this.aClass10_Sub2_1.anInt7409 >> this.aClass9_Sub1_1.anInt9216) + 2;
		this.anInt857 = this.aClass9_Sub1_1.anInt9216 + 7 - this.aClass10_Sub2_1.anInt7411;
		this.aByteArray3 = new byte[this.anInt865 * this.anInt853];
		this.anInt867 = this.aClass10_Sub2_1.anInt7412 >> this.anInt857;
		this.anInt861 = this.aClass10_Sub2_1.anInt7409 >> this.anInt857;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(III[[ZZZ)V")
	public void method822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.aClass9_Sub1_1.method7738(false);
		this.aClass9_Sub1_1.method7724(false);
		this.aClass9_Sub1_1.method7730(1);
		this.aClass9_Sub1_1.method7778(1);
		this.aClass9_Sub1_1.method7732(false, -2, false);
		@Pc(45) float local45 = 1.0F / (float) (this.aClass9_Sub1_1.anInt9220 * 128);
		@Pc(49) int local49;
		@Pc(56) int local56;
		@Pc(63) int local63;
		@Pc(65) int local65;
		if (arg4) {
			for (local49 = 0; local49 < this.anInt861; local49++) {
				local56 = local49 << this.anInt857;
				local63 = local49 + 1 << this.anInt857;
				label87: for (local65 = 0; local65 < this.anInt867; local65++) {
					if (this.aClass312ArrayArray1[local65][local49] != null) {
						@Pc(330) int local330 = local65 << this.anInt857;
						@Pc(337) int local337 = local65 + 1 << this.anInt857;
						for (@Pc(339) int local339 = local330; local339 < local337; local339++) {
							if (local339 - arg1 >= -arg2 && local339 - arg1 <= arg2) {
								for (@Pc(356) int local356 = local56; local356 < local63; local356++) {
									if (local356 - arg0 >= -arg2 && arg2 >= local356 - arg0 && arg3[local339 + arg2 - arg1][arg2 + local356 - arg0]) {
										@Pc(397) Class22_Sub3 local397 = this.aClass9_Sub1_1.method7733();
										local397.method5966(1.0F, local45, local45);
										local397.TA(-local65, -local49, 0);
										this.aClass9_Sub1_1.method7703(Static152.aClass171_3);
										this.aClass312ArrayArray1[local65][local49].method7444();
										continue label87;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local49 = 0; local49 < this.anInt861; local49++) {
				local56 = local49 << this.anInt857;
				local63 = local49 + 1 << this.anInt857;
				for (local65 = 0; local65 < this.anInt867; local65++) {
					@Pc(74) Class312 local74 = this.aClass312ArrayArray1[local65][local49];
					if (local74 != null) {
						@Pc(85) Interface1 local85 = this.aClass9_Sub1_1.method7769(local74.anInt8872 * 3);
						@Pc(90) Buffer local90 = local85.method7519();
						if (local90 != null) {
							@Pc(98) Stream local98 = this.aClass9_Sub1_1.method7677(local90);
							@Pc(100) int local100 = 0;
							@Pc(105) int local105 = local65 << this.anInt857;
							@Pc(112) int local112 = local65 + 1 << this.anInt857;
							for (@Pc(114) int local114 = local56; local114 < local63; local114++) {
								if (local114 - arg0 >= -arg2 && local114 - arg0 <= arg2) {
									@Pc(141) int local141 = local105 + this.aClass10_Sub2_1.anInt7412 * local114;
									for (@Pc(143) int local143 = local105; local143 < local112; local143++) {
										if (local143 - arg1 >= -arg2 && arg2 >= local143 - arg1 && arg3[arg2 + local143 - arg1][arg2 + local114 - arg0]) {
											@Pc(188) short[] local188 = this.aClass10_Sub2_1.aShortArrayArray4[local141];
											if (local188 != null) {
												@Pc(194) int local194;
												if (Stream.c()) {
													for (local194 = 0; local194 < local188.length; local194++) {
														local100++;
														local98.c(local188[local194] & 0xFFFF);
													}
												} else {
													for (local194 = 0; local194 < local188.length; local194++) {
														local100++;
														local98.f(local188[local194] & 0xFFFF);
													}
												}
											}
										}
										local141++;
									}
								}
							}
							local98.b();
							if (local85.method7521() && local100 > 0) {
								@Pc(257) Class22_Sub3 local257 = this.aClass9_Sub1_1.method7733();
								local257.method5966(1.0F, local45, local45);
								local257.TA(-local65, -local49, 0);
								this.aClass9_Sub1_1.method7703(Static152.aClass171_3);
								local74.method7445(local85, local100 / 3);
							}
						}
					}
				}
			}
		}
		this.aClass9_Sub1_1.method7744();
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!k;III)Z")
	public boolean method823(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class1_Sub1_Sub4_Sub1 local6 = (Class1_Sub1_Sub4_Sub1) arg0;
		arg2 += local6.anInt1646 + 1;
		arg1 += local6.anInt1644 + 1;
		@Pc(27) int local27 = arg2 * this.anInt853 + arg1;
		@Pc(30) int local30 = local6.anInt1648;
		@Pc(33) int local33 = local6.anInt1647;
		@Pc(39) int local39 = this.anInt853 - local33;
		@Pc(46) int local46;
		if (arg2 <= 0) {
			local46 = 1 - arg2;
			arg2 = 1;
			local30 -= local46;
			local27 += local46 * this.anInt853;
		}
		if (this.anInt865 <= local30 + arg2) {
			local46 = local30 + arg2 + 1 - this.anInt865;
			local30 -= local46;
		}
		if (arg1 <= 0) {
			local46 = 1 - arg1;
			local27 += local46;
			arg1 = 1;
			local39 += local46;
			local33 -= local46;
		}
		if (this.anInt853 <= arg1 + local33) {
			local46 = arg1 + local33 + 1 - this.anInt853;
			local39 += local46;
			local33 -= local46;
		}
		if (local33 > 0 && local30 > 0) {
			local39 += this.anInt853 * 7;
			return Static495.method7108(local33, local30, local39, local27, this.aByteArray3);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!k;IBI)V")
	public void method825(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class1_Sub1_Sub4_Sub1 local6 = (Class1_Sub1_Sub4_Sub1) arg0;
		arg1 += local6.anInt1646 + 1;
		arg2 += local6.anInt1644 + 1;
		@Pc(27) int local27 = arg1 * this.anInt853 + arg2;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt1648;
		@Pc(43) int local43 = local6.anInt1647;
		@Pc(49) int local49 = this.anInt853 - local43;
		@Pc(51) int local51 = 0;
		@Pc(61) int local61;
		if (arg1 <= 0) {
			local61 = 1 - arg1;
			arg1 = 1;
			local29 = local43 * local61;
			local27 += this.anInt853 * local61;
			local32 -= local61;
		}
		if (this.anInt865 <= arg1 + local32) {
			local61 = arg1 + local32 + 1 - this.anInt865;
			local32 -= local61;
		}
		if (arg2 <= 0) {
			local61 = 1 - arg2;
			local29 += local61;
			local43 -= local61;
			local27 += local61;
			local49 += local61;
			arg2 = 1;
			local51 = local61;
		}
		if (this.anInt853 <= arg2 + local43) {
			local61 = arg2 + local43 + 1 - this.anInt853;
			local51 += local61;
			local49 += local61;
			local43 -= local61;
		}
		if (local43 > 0 && local32 > 0) {
			Static428.method2376(local29, local51, local49, local43, this.aByteArray3, local6.aByteArray21, local27, local32);
			this.method831(local43, arg1, arg2, local32);
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)V")
	public void method828() {
		this.aClass312ArrayArray1 = new Class312[this.anInt867][this.anInt861];
		for (@Pc(18) int local18 = 0; local18 < this.anInt861; local18++) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt867; local22++) {
				this.aClass312ArrayArray1[local22][local18] = new Class312(this.aClass9_Sub1_1, this, this.aClass10_Sub2_1, local22, local18, this.anInt857, local22 * 128 + 1, local18 * 128 + 1);
				if (this.aClass312ArrayArray1[local22][local18].anInt8872 == 0) {
					this.aClass312ArrayArray1[local22][local18] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILclient!k;II)V")
	public void method830(@OriginalArg(1) Class1_Sub1_Sub4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class1_Sub1_Sub4_Sub1 local6 = (Class1_Sub1_Sub4_Sub1) arg0;
		arg2 += local6.anInt1644 + 1;
		arg1 += local6.anInt1646 + 1;
		@Pc(28) int local28 = arg2 + arg1 * this.anInt853;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt1648;
		@Pc(36) int local36 = local6.anInt1647;
		@Pc(42) int local42 = this.anInt853 - local36;
		@Pc(44) int local44 = 0;
		@Pc(54) int local54;
		if (arg1 <= 0) {
			local54 = 1 - arg1;
			local30 = local36 * local54;
			local33 -= local54;
			local28 += this.anInt853 * local54;
			arg1 = 1;
		}
		if (arg1 + local33 >= this.anInt865) {
			local54 = arg1 + local33 + 1 - this.anInt865;
			local33 -= local54;
		}
		if (arg2 <= 0) {
			local54 = 1 - arg2;
			local30 += local54;
			local42 += local54;
			local36 -= local54;
			local28 += local54;
			local44 = local54;
			arg2 = 1;
		}
		if (this.anInt853 <= local36 + arg2) {
			@Pc(149) int local149 = local36 + arg2 + 1 - this.anInt853;
			local44 += local149;
			local36 -= local149;
			local42 += local149;
		}
		if (local36 > 0 && local33 > 0) {
			Static243.method4101(local30, local42, local28, local44, this.aByteArray3, local6.aByteArray21, local33, local36);
			this.method831(local36, arg1, arg2, local33);
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIII)V")
	private void method831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass312ArrayArray1 == null) {
			return;
		}
		@Pc(21) int local21 = arg2 - 1 >> 7;
		@Pc(29) int local29 = arg0 + arg2 - 2 >> 7;
		@Pc(35) int local35 = arg1 - 1 >> 7;
		@Pc(45) int local45 = arg3 + arg1 - 1 - 1 >> 7;
		for (@Pc(47) int local47 = local21; local47 <= local29; local47++) {
			@Pc(54) Class312[] local54 = this.aClass312ArrayArray1[local47];
			for (@Pc(56) int local56 = local35; local56 <= local45; local56++) {
				if (local54[local56] != null) {
					local54[local56].aBoolean617 = true;
				}
			}
		}
	}
}
