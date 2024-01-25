import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class269 {

	@OriginalMember(owner = "client!pm", name = "k", descriptor = "[[Lclient!gd;")
	private Class116[][] aClass116ArrayArray1;

	@OriginalMember(owner = "client!pm", name = "o", descriptor = "Lclient!ej;")
	private final Class66_Sub1 aClass66_Sub1_12;

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "Lclient!an;")
	private final Class16_Sub1 aClass16_Sub1_3;

	@OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
	public final int anInt7137;

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
	private final int anInt7129;

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "[B")
	public final byte[] aByteArray96;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
	private final int anInt7128;

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
	private final int anInt7130;

	@OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
	private final int anInt7135;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lclient!ej;Lclient!an;)V")
	public Class269(@OriginalArg(0) Class66_Sub1 arg0, @OriginalArg(1) Class16_Sub1 arg1) {
		this.aClass66_Sub1_12 = arg0;
		this.aClass16_Sub1_3 = arg1;
		this.anInt7137 = (this.aClass16_Sub1_3.anInt9838 * this.aClass16_Sub1_3.anInt9841 >> this.aClass66_Sub1_12.anInt8437) + 2;
		this.anInt7129 = (this.aClass16_Sub1_3.anInt9841 * this.aClass16_Sub1_3.anInt9839 >> this.aClass66_Sub1_12.anInt8437) + 2;
		this.aByteArray96 = new byte[this.anInt7129 * this.anInt7137];
		this.anInt7128 = this.aClass66_Sub1_12.anInt8437 + 7 - this.aClass16_Sub1_3.anInt9837;
		this.anInt7130 = this.aClass16_Sub1_3.anInt9838 >> this.anInt7128;
		this.anInt7135 = this.aClass16_Sub1_3.anInt9839 >> this.anInt7128;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!w;III)V")
	public void method5919(@OriginalArg(0) Class4_Sub7_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class4_Sub7_Sub3_Sub1 local17 = (Class4_Sub7_Sub3_Sub1) arg0;
		arg1 += local17.anInt2322 + 1;
		arg2 += local17.anInt2319 + 1;
		@Pc(38) int local38 = arg1 * this.anInt7137 + arg2;
		@Pc(40) int local40 = 0;
		@Pc(43) int local43 = local17.anInt2327;
		@Pc(46) int local46 = local17.anInt2323;
		@Pc(52) int local52 = this.anInt7137 - local46;
		@Pc(62) int local62;
		if (arg1 <= 0) {
			local62 = 1 - arg1;
			local43 -= local62;
			local40 = local62 * local46;
			local38 += local62 * this.anInt7137;
			arg1 = 1;
		}
		@Pc(83) int local83 = 0;
		if (arg1 + local43 >= this.anInt7129) {
			local62 = arg1 + local43 + 1 - this.anInt7129;
			local43 -= local62;
		}
		if (arg2 <= 0) {
			local62 = 1 - arg2;
			local40 += local62;
			local83 = local62;
			arg2 = 1;
			local46 -= local62;
			local38 += local62;
			local52 += local62;
		}
		if (arg2 + local46 >= this.anInt7137) {
			local62 = arg2 + local46 + 1 - this.anInt7137;
			local52 += local62;
			local83 += local62;
			local46 -= local62;
		}
		if (local46 > 0 && local43 > 0) {
			Static423.method6069(local38, local52, local40, local83, local46, local43, local17.aByteArray29, this.aByteArray96);
			this.method5923(local43, arg1, local46, arg2);
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!w;BII)Z")
	public boolean method5920(@OriginalArg(0) Class4_Sub7_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class4_Sub7_Sub3_Sub1 local13 = (Class4_Sub7_Sub3_Sub1) arg0;
		arg1 += local13.anInt2319 + 1;
		arg2 += local13.anInt2322 + 1;
		@Pc(34) int local34 = this.anInt7137 * arg2 + arg1;
		@Pc(37) int local37 = local13.anInt2327;
		@Pc(40) int local40 = local13.anInt2323;
		@Pc(46) int local46 = this.anInt7137 - local40;
		@Pc(56) int local56;
		if (arg2 <= 0) {
			local56 = 1 - arg2;
			local37 -= local56;
			arg2 = 1;
			local34 += local56 * this.anInt7137;
		}
		if (this.anInt7129 <= arg2 + local37) {
			local56 = local37 + arg2 + 1 - this.anInt7129;
			local37 -= local56;
		}
		if (arg1 <= 0) {
			local56 = 1 - arg1;
			local40 -= local56;
			local46 += local56;
			local34 += local56;
			arg1 = 1;
		}
		if (this.anInt7137 <= local40 + arg1) {
			local56 = arg1 + local40 + 1 - this.anInt7137;
			local40 -= local56;
			local46 += local56;
		}
		if (local40 > 0 && local37 > 0) {
			local46 += this.anInt7137 * 7;
			return Static411.method5917(local37, local40, this.aByteArray96, local34, local46);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V")
	public void method5921() {
		this.aClass116ArrayArray1 = new Class116[this.anInt7130][this.anInt7135];
		for (@Pc(24) int local24 = 0; local24 < this.anInt7135; local24++) {
			for (@Pc(28) int local28 = 0; local28 < this.anInt7130; local28++) {
				this.aClass116ArrayArray1[local28][local24] = new Class116(this.aClass66_Sub1_12, this, this.aClass16_Sub1_3, local28, local24, this.anInt7128, local28 * 128 + 1, local24 * 128 + 1);
				if (this.aClass116ArrayArray1[local28][local24].anInt3540 == 0) {
					this.aClass116ArrayArray1[local28][local24] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIII)V")
	private void method5923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass116ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg3 - 1 >> 7;
		@Pc(25) int local25 = arg2 + arg3 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg1 - 1 >> 7;
		@Pc(41) int local41 = arg0 + arg1 - 1 - 1 >> 7;
		for (@Pc(43) int local43 = local15; local43 <= local25; local43++) {
			@Pc(58) Class116[] local58 = this.aClass116ArrayArray1[local43];
			for (@Pc(60) int local60 = local31; local60 <= local41; local60++) {
				if (local58[local60] != null) {
					local58[local60].aBoolean284 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILclient!w;BI)V")
	public void method5924(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub7_Sub3 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class4_Sub7_Sub3_Sub1 local6 = (Class4_Sub7_Sub3_Sub1) arg1;
		arg2 += local6.anInt2319 + 1;
		arg0 += local6.anInt2322 + 1;
		@Pc(27) int local27 = arg0 * this.anInt7137 + arg2;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt2327;
		@Pc(35) int local35 = local6.anInt2323;
		@Pc(41) int local41 = this.anInt7137 - local35;
		@Pc(54) int local54 = 0;
		@Pc(64) int local64;
		if (arg0 <= 0) {
			local64 = 1 - arg0;
			local27 += local64 * this.anInt7137;
			arg0 = 1;
			local32 -= local64;
			local29 = local64 * local35;
		}
		if (local32 + arg0 >= this.anInt7129) {
			local64 = local32 + arg0 + 1 - this.anInt7129;
			local32 -= local64;
		}
		if (arg2 <= 0) {
			local64 = 1 - arg2;
			local41 += local64;
			local54 = local64;
			arg2 = 1;
			local35 -= local64;
			local29 += local64;
			local27 += local64;
		}
		if (local35 + arg2 >= this.anInt7137) {
			local64 = arg2 + local35 + 1 - this.anInt7137;
			local35 -= local64;
			local41 += local64;
			local54 += local64;
		}
		if (local35 > 0 && local32 > 0) {
			Static553.method7631(local41, local29, this.aByteArray96, local32, local35, local54, local27, local6.aByteArray29);
			this.method5923(local32, arg0, local35, arg2);
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I[[ZBZII)V")
	public void method5925(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aClass66_Sub1_12.method6985(false);
		this.aClass66_Sub1_12.method6864(false);
		this.aClass66_Sub1_12.method6984(1);
		this.aClass66_Sub1_12.method6920(1);
		this.aClass66_Sub1_12.method6899(false, -2, false);
		@Pc(49) float local49 = 1.0F / (float) (this.aClass66_Sub1_12.anInt8409 * 128);
		@Pc(53) int local53;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(69) int local69;
		if (arg2) {
			for (local53 = 0; local53 < this.anInt7135; local53++) {
				local60 = local53 << this.anInt7128;
				local67 = local53 + 1 << this.anInt7128;
				label138: for (local69 = 0; local69 < this.anInt7130; local69++) {
					if (this.aClass116ArrayArray1[local69][local53] != null) {
						@Pc(83) int local83 = local69 << this.anInt7128;
						@Pc(90) int local90 = local69 + 1 << this.anInt7128;
						for (@Pc(92) int local92 = local83; local92 < local90; local92++) {
							if (local92 - arg3 >= -arg0 && arg0 >= local92 - arg3) {
								for (@Pc(111) int local111 = local60; local111 < local67; local111++) {
									if (local111 - arg4 >= -arg0 && arg0 >= local111 - arg4 && arg1[arg0 + local92 - arg3][arg0 + local111 - arg4]) {
										@Pc(156) Class134_Sub1 local156 = this.aClass66_Sub1_12.method6953();
										local156.method3417(1.0F, local49, local49);
										local156.G(-local69, -local53, 0);
										this.aClass66_Sub1_12.method6933(Static49.aClass81_4);
										this.aClass116ArrayArray1[local69][local53].method3161();
										continue label138;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local53 = 0; local53 < this.anInt7135; local53++) {
				local60 = local53 << this.anInt7128;
				local67 = local53 + 1 << this.anInt7128;
				for (local69 = 0; local69 < this.anInt7130; local69++) {
					@Pc(241) Class116 local241 = this.aClass116ArrayArray1[local69][local53];
					if (local241 != null) {
						@Pc(254) Interface8 local254 = this.aClass66_Sub1_12.method6883(local241.anInt3540 * 3);
						@Pc(259) Buffer local259 = local254.method7149();
						if (local259 != null) {
							@Pc(267) Stream local267 = this.aClass66_Sub1_12.method6978(local259);
							@Pc(269) int local269 = 0;
							@Pc(274) int local274 = local69 << this.anInt7128;
							@Pc(281) int local281 = local69 + 1 << this.anInt7128;
							for (@Pc(283) int local283 = local60; local283 < local67; local283++) {
								if (local283 - arg4 >= -arg0 && arg0 >= local283 - arg4) {
									@Pc(306) int local306 = local274 + this.aClass16_Sub1_3.anInt9838 * local283;
									for (@Pc(308) int local308 = local274; local308 < local281; local308++) {
										if (-arg0 <= local308 - arg3 && local308 - arg3 <= arg0 && arg1[arg0 + local308 - arg3][arg0 + local283 - arg4]) {
											@Pc(348) short[] local348 = this.aClass16_Sub1_3.aShortArrayArray3[local306];
											if (local348 != null) {
												@Pc(354) int local354;
												if (Stream.b()) {
													for (local354 = 0; local354 < local348.length; local354++) {
														local269++;
														local267.c(local348[local354] & 0xFFFF);
													}
												} else {
													for (local354 = 0; local354 < local348.length; local354++) {
														local269++;
														local267.e(local348[local354] & 0xFFFF);
													}
												}
											}
										}
										local306++;
									}
								}
							}
							local267.c();
							if (local254.method7150() && local269 > 0) {
								@Pc(414) Class134_Sub1 local414 = this.aClass66_Sub1_12.method6953();
								local414.method3417(1.0F, local49, local49);
								local414.G(-local69, -local53, 0);
								this.aClass66_Sub1_12.method6933(Static49.aClass81_4);
								local241.method3162(local269 / 3, local254);
							}
						}
					}
				}
			}
		}
		this.aClass66_Sub1_12.method6888();
	}
}
