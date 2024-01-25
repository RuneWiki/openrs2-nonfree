import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pja")
public final class Class291 {

	@OriginalMember(owner = "client!pja", name = "l", descriptor = "[[Lclient!pb;")
	private Class284[][] aClass284ArrayArray1;

	@OriginalMember(owner = "client!pja", name = "d", descriptor = "Lclient!jca;")
	private final Class22_Sub2 aClass22_Sub2_17;

	@OriginalMember(owner = "client!pja", name = "n", descriptor = "Lclient!ne;")
	private final Class259_Sub1 aClass259_Sub1_2;

	@OriginalMember(owner = "client!pja", name = "b", descriptor = "I")
	public final int anInt7988;

	@OriginalMember(owner = "client!pja", name = "h", descriptor = "I")
	private final int anInt7997;

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "[B")
	public final byte[] aByteArray79;

	@OriginalMember(owner = "client!pja", name = "r", descriptor = "I")
	private final int anInt7994;

	@OriginalMember(owner = "client!pja", name = "p", descriptor = "I")
	private final int anInt7992;

	@OriginalMember(owner = "client!pja", name = "o", descriptor = "I")
	private final int anInt7999;

	@OriginalMember(owner = "client!pja", name = "<init>", descriptor = "(Lclient!jca;Lclient!ne;)V")
	public Class291(@OriginalArg(0) Class22_Sub2 arg0, @OriginalArg(1) Class259_Sub1 arg1) {
		this.aClass22_Sub2_17 = arg0;
		this.aClass259_Sub1_2 = arg1;
		this.anInt7988 = (this.aClass259_Sub1_2.anInt10949 * this.aClass259_Sub1_2.anInt10947 >> this.aClass22_Sub2_17.anInt10462) + 2;
		this.anInt7997 = (this.aClass259_Sub1_2.anInt10947 * this.aClass259_Sub1_2.anInt10946 >> this.aClass22_Sub2_17.anInt10462) + 2;
		this.aByteArray79 = new byte[this.anInt7997 * this.anInt7988];
		this.anInt7994 = this.aClass22_Sub2_17.anInt10462 + 7 - this.aClass259_Sub1_2.anInt10943;
		this.anInt7992 = this.aClass259_Sub1_2.anInt10949 >> this.anInt7994;
		this.anInt7999 = this.aClass259_Sub1_2.anInt10946 >> this.anInt7994;
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "([[ZBIIZI)V")
	public void method6843(@OriginalArg(0) boolean[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		this.aClass22_Sub2_17.method8927(false);
		this.aClass22_Sub2_17.method8902(false);
		this.aClass22_Sub2_17.method8978(1);
		this.aClass22_Sub2_17.method8853(1);
		this.aClass22_Sub2_17.method8979(false, false, -2);
		@Pc(49) float local49 = 1.0F / (float) (this.aClass22_Sub2_17.anInt10479 * 128);
		@Pc(53) int local53;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(69) int local69;
		if (arg3) {
			for (local53 = 0; local53 < this.anInt7999; local53++) {
				local60 = local53 << this.anInt7994;
				local67 = local53 + 1 << this.anInt7994;
				label138: for (local69 = 0; local69 < this.anInt7992; local69++) {
					if (this.aClass284ArrayArray1[local69][local53] != null) {
						@Pc(85) int local85 = local69 << this.anInt7994;
						@Pc(92) int local92 = local69 + 1 << this.anInt7994;
						for (@Pc(94) int local94 = local85; local94 < local92; local94++) {
							if (local94 - arg4 >= -arg1 && arg1 >= local94 - arg4) {
								for (@Pc(122) int local122 = local60; local122 < local67; local122++) {
									if (-arg1 <= local122 - arg2 && arg1 >= local122 - arg2 && arg0[local94 + arg1 - arg4][local122 + arg1 - arg2]) {
										@Pc(167) Class58_Sub2 local167 = this.aClass22_Sub2_17.method8922();
										local167.method6099(local49, local49, 1.0F);
										local167.method9509(-local69, -local53, 0);
										this.aClass22_Sub2_17.method8924(Static606.aClass222_6);
										this.aClass284ArrayArray1[local69][local53].method6602();
										continue label138;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local53 = 0; local53 < this.anInt7999; local53++) {
				local60 = local53 << this.anInt7994;
				local67 = local53 + 1 << this.anInt7994;
				for (local69 = 0; local69 < this.anInt7992; local69++) {
					@Pc(268) Class284 local268 = this.aClass284ArrayArray1[local69][local53];
					if (local268 != null) {
						@Pc(279) Interface11 local279 = this.aClass22_Sub2_17.method8971(local268.anInt7651 * 3);
						@Pc(284) Buffer local284 = local279.method5367();
						if (local284 != null) {
							@Pc(292) Stream local292 = this.aClass22_Sub2_17.method8918(local284);
							@Pc(294) int local294 = 0;
							@Pc(299) int local299 = local69 << this.anInt7994;
							@Pc(306) int local306 = local69 + 1 << this.anInt7994;
							for (@Pc(308) int local308 = local60; local308 < local67; local308++) {
								if (local308 - arg2 >= -arg1 && arg1 >= local308 - arg2) {
									@Pc(339) int local339 = local299 + local308 * this.aClass259_Sub1_2.anInt10949;
									for (@Pc(341) int local341 = local299; local341 < local306; local341++) {
										if (-arg1 <= local341 - arg4 && local341 - arg4 <= arg1 && arg0[local341 + arg1 - arg4][local308 + arg1 - arg2]) {
											@Pc(386) short[] local386 = this.aClass259_Sub1_2.aShortArrayArray3[local339];
											if (local386 != null) {
												@Pc(394) int local394;
												if (Stream.c()) {
													for (local394 = 0; local394 < local386.length; local394++) {
														local294++;
														local292.d(local386[local394] & 0xFFFF);
													}
												} else {
													for (local394 = 0; local394 < local386.length; local394++) {
														local292.a(local386[local394] & 0xFFFF);
														local294++;
													}
												}
											}
										}
										local339++;
									}
								}
							}
							local292.b();
							if (local279.method5366() && local294 > 0) {
								@Pc(476) Class58_Sub2 local476 = this.aClass22_Sub2_17.method8922();
								local476.method6099(local49, local49, 1.0F);
								local476.method9509(-local69, -local53, 0);
								this.aClass22_Sub2_17.method8924(Static606.aClass222_6);
								local268.method6601(local279, local294 / 3);
							}
						}
					}
				}
			}
		}
		this.aClass22_Sub2_17.method8873();
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(Lclient!r;IIB)V")
	public void method6845(@OriginalArg(0) Class3_Sub7_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class3_Sub7_Sub17_Sub1 local6 = (Class3_Sub7_Sub17_Sub1) arg0;
		arg1 += local6.anInt7363 + 1;
		arg2 += local6.anInt7364 + 1;
		@Pc(27) int local27 = arg1 * this.anInt7988 + arg2;
		@Pc(29) int local29 = 0;
		@Pc(40) int local40 = local6.anInt7361;
		@Pc(43) int local43 = local6.anInt7358;
		@Pc(49) int local49 = this.anInt7988 - local43;
		@Pc(51) int local51 = 0;
		@Pc(61) int local61;
		if (arg1 <= 0) {
			local61 = 1 - arg1;
			local40 -= local61;
			local29 = local43 * local61;
			local27 += local61 * this.anInt7988;
			arg1 = 1;
		}
		if (this.anInt7997 <= local40 + arg1) {
			local61 = arg1 + local40 + 1 - this.anInt7997;
			local40 -= local61;
		}
		if (arg2 <= 0) {
			local61 = 1 - arg2;
			local51 = local61;
			local27 += local61;
			arg2 = 1;
			local29 += local61;
			local43 -= local61;
			local49 += local61;
		}
		if (this.anInt7988 <= local43 + arg2) {
			local61 = arg2 + local43 + 1 - this.anInt7988;
			local51 += local61;
			local49 += local61;
			local43 -= local61;
		}
		if (local43 > 0 && local40 > 0) {
			Static355.method9497(local40, local27, local51, local43, local29, local49, this.aByteArray79, local6.aByteArray72);
			this.method6846(arg1, local43, arg2, local40);
		}
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(IIIII)V")
	private void method6846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass284ArrayArray1 == null) {
			return;
		}
		@Pc(16) int local16 = arg2 - 1 >> 7;
		@Pc(26) int local26 = arg2 + arg1 - 1 - 1 >> 7;
		@Pc(37) int local37 = arg0 - 1 >> 7;
		@Pc(45) int local45 = arg3 + arg0 - 2 >> 7;
		for (@Pc(47) int local47 = local16; local47 <= local26; local47++) {
			@Pc(54) Class284[] local54 = this.aClass284ArrayArray1[local47];
			for (@Pc(56) int local56 = local37; local56 <= local45; local56++) {
				if (local54[local56] != null) {
					local54[local56].aBoolean516 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(IIILclient!r;)Z")
	public boolean method6847(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub7_Sub17 arg2) {
		@Pc(6) Class3_Sub7_Sub17_Sub1 local6 = (Class3_Sub7_Sub17_Sub1) arg2;
		arg1 += local6.anInt7364 + 1;
		arg0 += local6.anInt7363 + 1;
		@Pc(35) int local35 = arg1 + arg0 * this.anInt7988;
		@Pc(38) int local38 = local6.anInt7361;
		@Pc(41) int local41 = local6.anInt7358;
		@Pc(51) int local51;
		if (arg0 <= 0) {
			local51 = 1 - arg0;
			local38 -= local51;
			arg0 = 1;
			local35 += this.anInt7988 * local51;
		}
		@Pc(70) int local70 = this.anInt7988 - local41;
		if (this.anInt7997 <= local38 + arg0) {
			local51 = local38 + arg0 + 1 - this.anInt7997;
			local38 -= local51;
		}
		if (arg1 <= 0) {
			local51 = 1 - arg1;
			local35 += local51;
			local41 -= local51;
			local70 += local51;
			arg1 = 1;
		}
		if (arg1 + local41 >= this.anInt7988) {
			local51 = arg1 + local41 + 1 - this.anInt7988;
			local70 += local51;
			local41 -= local51;
		}
		if (local41 > 0 && local38 > 0) {
			local70 += this.anInt7988 * 7;
			return Static310.method4584(local35, local38, local70, local41, this.aByteArray79);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pja", name = "b", descriptor = "(I)V")
	public void method6848() {
		this.aClass284ArrayArray1 = new Class284[this.anInt7992][this.anInt7999];
		for (@Pc(14) int local14 = 0; local14 < this.anInt7999; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt7992; local18++) {
				this.aClass284ArrayArray1[local18][local14] = new Class284(this.aClass22_Sub2_17, this, this.aClass259_Sub1_2, local18, local14, this.anInt7994, local18 * 128 + 1, local14 * 128 + 1);
				if (this.aClass284ArrayArray1[local18][local14].anInt7651 == 0) {
					this.aClass284ArrayArray1[local18][local14] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(IILclient!r;I)V")
	public void method6850(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub7_Sub17 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub7_Sub17_Sub1 local6 = (Class3_Sub7_Sub17_Sub1) arg1;
		arg2 += local6.anInt7363 + 1;
		arg0 += local6.anInt7364 + 1;
		@Pc(27) int local27 = arg2 * this.anInt7988 + arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt7361;
		@Pc(35) int local35 = local6.anInt7358;
		@Pc(41) int local41 = this.anInt7988 - local35;
		@Pc(43) int local43 = 0;
		@Pc(53) int local53;
		if (arg2 <= 0) {
			local53 = 1 - arg2;
			local27 += local53 * this.anInt7988;
			local32 -= local53;
			local29 = local35 * local53;
			arg2 = 1;
		}
		if (arg2 + local32 >= this.anInt7997) {
			local53 = arg2 + local32 + 1 - this.anInt7997;
			local32 -= local53;
		}
		if (arg0 <= 0) {
			local53 = 1 - arg0;
			arg0 = 1;
			local35 -= local53;
			local29 += local53;
			local27 += local53;
			local41 += local53;
			local43 = local53;
		}
		if (arg0 + local35 >= this.anInt7988) {
			local53 = arg0 + local35 + 1 - this.anInt7988;
			local43 += local53;
			local35 -= local53;
			local41 += local53;
		}
		if (local35 > 0 && local32 > 0) {
			Static520.method6980(local32, local29, local27, this.aByteArray79, local35, local43, local41, local6.aByteArray72);
			this.method6846(arg2, local35, arg0, local32);
		}
	}
}
