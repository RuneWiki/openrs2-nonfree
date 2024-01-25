import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bia")
public final class Class3_Sub9_Sub1 extends Class3_Sub9 {

	@OriginalMember(owner = "client!bia", name = "V", descriptor = "I")
	private int anInt1029;

	@OriginalMember(owner = "client!bia", name = "H", descriptor = "I")
	private int anInt1015 = 409;

	@OriginalMember(owner = "client!bia", name = "M", descriptor = "I")
	private int anInt1020 = 1024;

	@OriginalMember(owner = "client!bia", name = "F", descriptor = "I")
	private int anInt1013 = 2048;

	@OriginalMember(owner = "client!bia", name = "J", descriptor = "I")
	private int anInt1017 = 0;

	@OriginalMember(owner = "client!bia", name = "R", descriptor = "I")
	private int anInt1025 = 1024;

	@OriginalMember(owner = "client!bia", name = "O", descriptor = "I")
	private int anInt1022 = 0;

	@OriginalMember(owner = "client!bia", name = "D", descriptor = "I")
	private int anInt1011 = 1024;

	@OriginalMember(owner = "client!bia", name = "Y", descriptor = "I")
	private int anInt1031 = 1024;

	@OriginalMember(owner = "client!bia", name = "T", descriptor = "I")
	private int anInt1027 = 819;

	@OriginalMember(owner = "client!bia", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(Lclient!jp;IB)V")
	@Override
	public void method9166(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1017 = arg0.method8632();
		} else if (arg1 == 1) {
			this.anInt1025 = arg0.method8593();
		} else if (arg1 == 2) {
			this.anInt1013 = arg0.method8593();
		} else if (arg1 == 3) {
			this.anInt1015 = arg0.method8593();
		} else if (arg1 == 4) {
			this.anInt1027 = arg0.method8593();
		} else if (arg1 == 5) {
			this.anInt1011 = arg0.method8593();
		} else if (arg1 == 6) {
			this.anInt1022 = arg0.method8632();
		} else if (arg1 == 7) {
			this.anInt1020 = arg0.method8593();
		} else if (arg1 == 8) {
			this.anInt1031 = arg0.method8593();
		}
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(II[[ILjava/util/Random;III)V")
	private void method1101(@OriginalArg(1) int arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) Random arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(22) int local22 = this.anInt1031 <= 0 ? 4096 : 4096 - Static371.method5392(arg2, this.anInt1031);
		@Pc(30) int local30 = this.anInt1029 * this.anInt1020 >> 12;
		@Pc(42) int local42 = this.anInt1029 - (local30 > 0 ? Static371.method5392(arg2, local30) : 0);
		if (Static62.anInt1251 <= arg5) {
			arg5 -= Static62.anInt1251;
		}
		@Pc(75) int local75;
		@Pc(103) int local103;
		if (local42 <= 0) {
			if (Static62.anInt1251 >= arg3 + arg5) {
				for (local75 = 0; local75 < arg4; local75++) {
					Static684.method5330(arg1[arg0 + local75], arg5, arg3, local22);
				}
			} else {
				local75 = Static62.anInt1251 - arg5;
				for (local103 = 0; local103 < arg4; local103++) {
					@Pc(111) int[] local111 = arg1[arg0 + local103];
					Static684.method5330(local111, arg5, local75, local22);
					Static684.method5330(local111, 0, arg3 - local75, local22);
				}
			}
		} else if (arg4 > 0 && arg3 > 0) {
			local75 = arg3 / 2;
			local103 = arg4 / 2;
			@Pc(155) int local155 = local42 > local75 ? local75 : local42;
			@Pc(166) int local166 = local42 <= local103 ? local42 : local103;
			@Pc(170) int local170 = arg5 + local155;
			@Pc(177) int local177 = arg3 - local155 * 2;
			for (@Pc(179) int local179 = 0; local179 < arg4; local179++) {
				@Pc(188) int[] local188 = arg1[local179 + arg0];
				@Pc(201) int local201;
				@Pc(206) int local206;
				@Pc(214) int local214;
				if (local179 < local166) {
					local201 = local22 * local179 / local166;
					if (this.anInt1022 == 0) {
						for (local206 = 0; local206 < local155; local206++) {
							local214 = local22 * local206 / local155;
							local188[Static302.anInt5067 & arg5 + local206] = local188[arg3 + arg5 - local206 - 1 & Static302.anInt5067] = local201 * local214 >> 12;
						}
					} else {
						for (local206 = 0; local206 < local155; local206++) {
							local214 = local206 * local22 / local155;
							local188[local206 + arg5 & Static302.anInt5067] = local188[arg3 + arg5 - local206 - 1 & Static302.anInt5067] = local201 > local214 ? local214 : local201;
						}
					}
					if (local177 + local170 <= Static62.anInt1251) {
						Static684.method5330(local188, local170, local177, local201);
					} else {
						local206 = Static62.anInt1251 - local170;
						Static684.method5330(local188, local170, local206, local201);
						Static684.method5330(local188, 0, local177 - local206, local201);
					}
				} else {
					local201 = arg4 - local179 - 1;
					if (local201 < local166) {
						local206 = local22 * local201 / local166;
						@Pc(353) int local353;
						if (this.anInt1022 == 0) {
							for (local214 = 0; local214 < local155; local214++) {
								local353 = local214 * local22 / local155;
								local188[local214 + arg5 & Static302.anInt5067] = local188[arg5 + arg3 - local214 - 1 & Static302.anInt5067] = local353 * local206 >> 12;
							}
						} else {
							for (local214 = 0; local214 < local155; local214++) {
								local353 = local22 * local214 / local155;
								local188[Static302.anInt5067 & local214 + arg5] = local188[arg3 + arg5 - local214 - 1 & Static302.anInt5067] = local206 <= local353 ? local206 : local353;
							}
						}
						if (Static62.anInt1251 >= local177 + local170) {
							Static684.method5330(local188, local170, local177, local206);
						} else {
							local214 = Static62.anInt1251 - local170;
							Static684.method5330(local188, local170, local214, local206);
							Static684.method5330(local188, 0, local177 - local214, local206);
						}
					} else {
						for (local206 = 0; local206 < local155; local206++) {
							local188[Static302.anInt5067 & local206 + arg5] = local188[arg5 + arg3 - local206 - 1 & Static302.anInt5067] = local206 * local22 / local155;
						}
						if (Static62.anInt1251 >= local177 + local170) {
							Static684.method5330(local188, local170, local177, local22);
						} else {
							local214 = Static62.anInt1251 - local170;
							Static684.method5330(local188, local170, local214, local22);
							Static684.method5330(local188, 0, local177 - local214, local22);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9165(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass113_41.method3239(arg0);
		if (!super.aClass113_41.aBoolean275) {
			return local11;
		}
		@Pc(20) int[][] local20 = super.aClass113_41.method3238();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = true;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = this.anInt1025 * Static62.anInt1251 >> 12;
		@Pc(52) int local52 = Static62.anInt1251 * this.anInt1013 >> 12;
		@Pc(59) int local59 = this.anInt1015 * Static452.anInt7497 >> 12;
		@Pc(66) int local66 = Static452.anInt7497 * this.anInt1027 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		this.anInt1029 = Static62.anInt1251 / 8 * this.anInt1011 >> 12;
		@Pc(91) int local91 = Static62.anInt1251 / local45 + 1;
		@Pc(95) int[][] local95 = new int[local91][3];
		@Pc(99) int[][] local99 = new int[local91][3];
		@Pc(106) Random local106 = new Random((long) this.anInt1017);
		while (true) {
			while (true) {
				@Pc(115) int local115 = local45 + Static371.method5392(local106, local52 - local45);
				@Pc(124) int local124 = Static371.method5392(local106, local66 - local59) + local59;
				@Pc(129) int local129 = local28 + local115;
				if (Static62.anInt1251 < local129) {
					local115 = Static62.anInt1251 - local28;
					local129 = Static62.anInt1251;
				}
				@Pc(202) int local202;
				@Pc(143) int local143;
				@Pc(153) int local153;
				if (local34) {
					local143 = 0;
				} else {
					@Pc(147) int local147 = local30;
					@Pc(151) int[] local151 = local99[local30];
					local153 = 0;
					@Pc(157) int local157 = local22 + local129;
					if (local157 < 0) {
						local157 += Static62.anInt1251;
					}
					if (Static62.anInt1251 < local157) {
						local157 -= Static62.anInt1251;
					}
					local143 = local151[2];
					while (true) {
						@Pc(185) int[] local185 = local99[local147];
						if (local185[0] <= local157 && local185[1] >= local157) {
							if (local147 != local30) {
								@Pc(219) int local219 = local28 + local22;
								if (local219 < 0) {
									local219 += Static62.anInt1251;
								}
								if (local219 > Static62.anInt1251) {
									local219 -= Static62.anInt1251;
								}
								for (@Pc(237) int local237 = 1; local237 <= local153; local237++) {
									@Pc(247) int[] local247 = local99[(local30 + local237) % local36];
									local143 = Math.max(local143, local247[2]);
								}
								for (@Pc(263) int local263 = 0; local263 <= local153; local263++) {
									@Pc(274) int[] local274 = local99[(local30 + local263) % local36];
									@Pc(278) int local278 = local274[2];
									if (local278 != local143) {
										@Pc(285) int local285 = local274[0];
										@Pc(289) int local289 = local274[1];
										@Pc(305) int local305;
										@Pc(307) int local307;
										if (local219 < local157) {
											local305 = Math.max(local219, local285);
											local307 = Math.min(local157, local289);
										} else if (local285 == 0) {
											local307 = Math.min(local157, local289);
											local305 = 0;
										} else {
											local305 = Math.max(local219, local285);
											local307 = Static62.anInt1251;
										}
										this.method1101(local278, local20, local106, local307 - local305, -local278 + local143, local305 + local26);
									}
								}
							}
							local30 = local147;
							break;
						}
						local202 = ~local36;
						local147++;
						if (local202 >= ~local147) {
							local147 = 0;
						}
						local153++;
					}
				}
				if (Static452.anInt7497 >= local143 + local124) {
					local32 = false;
				} else {
					local124 = Static452.anInt7497 - local143;
				}
				@Pc(394) int[] local394;
				if (Static62.anInt1251 == local129) {
					this.method1101(local143, local20, local106, local115, local124, local24 + local28);
					if (local32) {
						return local11;
					}
					local32 = true;
					local394 = local95[local38++];
					local394[2] = local124 + local143;
					local394[1] = local129;
					local394[0] = local28;
					@Pc(410) int[][] local410 = local99;
					local99 = local95;
					local36 = local38;
					local95 = local410;
					local26 = local24;
					local38 = 0;
					local24 = Static371.method5392(local106, Static62.anInt1251);
					local22 = local24 - local26;
					local28 = 0;
					local153 = local22;
					if (local22 < 0) {
						local153 = local22 + Static62.anInt1251;
					}
					if (local153 > Static62.anInt1251) {
						local153 -= Static62.anInt1251;
					}
					local30 = 0;
					local34 = false;
					while (true) {
						@Pc(459) int[] local459 = local99[local30];
						if (local459[0] <= local153 && local153 <= local459[1]) {
							break;
						}
						local202 = ~local36;
						local30++;
						if (local202 >= ~local30) {
							local30 = 0;
						}
					}
				} else {
					local394 = local95[local38++];
					local394[0] = local28;
					local394[1] = local129;
					local394[2] = local124 + local143;
					this.method1101(local143, local20, local106, local115, local124, local28 + local24);
					local28 = local129;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(Z)V")
	@Override
	public void method9163() {
	}
}
