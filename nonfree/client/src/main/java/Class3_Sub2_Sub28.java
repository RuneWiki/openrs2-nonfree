import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pha")
public final class Class3_Sub2_Sub28 extends Class3_Sub2 {

	@OriginalMember(owner = "client!pha", name = "O", descriptor = "I")
	private int anInt7915;

	@OriginalMember(owner = "client!pha", name = "H", descriptor = "I")
	private int anInt7908 = 1024;

	@OriginalMember(owner = "client!pha", name = "E", descriptor = "I")
	private int anInt7905 = 0;

	@OriginalMember(owner = "client!pha", name = "K", descriptor = "I")
	private int anInt7911 = 409;

	@OriginalMember(owner = "client!pha", name = "N", descriptor = "I")
	private int anInt7914 = 0;

	@OriginalMember(owner = "client!pha", name = "G", descriptor = "I")
	private int anInt7907 = 1024;

	@OriginalMember(owner = "client!pha", name = "L", descriptor = "I")
	private int anInt7912 = 1024;

	@OriginalMember(owner = "client!pha", name = "Q", descriptor = "I")
	private int anInt7917 = 819;

	@OriginalMember(owner = "client!pha", name = "M", descriptor = "I")
	private int anInt7913 = 1024;

	@OriginalMember(owner = "client!pha", name = "R", descriptor = "I")
	private int anInt7918 = 2048;

	@OriginalMember(owner = "client!pha", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pha", name = "c", descriptor = "(I)V")
	@Override
	public void method8332() {
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8336(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass330_41.method7983(arg0);
		if (!super.aClass330_41.aBoolean806) {
			return local11;
		}
		@Pc(20) int[][] local20 = super.aClass330_41.method7982();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = true;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = Static164.anInt8839 * this.anInt7908 >> 12;
		@Pc(52) int local52 = this.anInt7918 * Static164.anInt8839 >> 12;
		@Pc(59) int local59 = this.anInt7911 * Static638.anInt10476 >> 12;
		@Pc(66) int local66 = this.anInt7917 * Static638.anInt10476 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		this.anInt7915 = Static164.anInt8839 / 8 * this.anInt7912 >> 12;
		@Pc(89) int local89 = Static164.anInt8839 / local45 + 1;
		@Pc(93) int[][] local93 = new int[local89][3];
		@Pc(97) int[][] local97 = new int[local89][3];
		@Pc(104) Random local104 = new Random((long) this.anInt7905);
		while (true) {
			while (true) {
				@Pc(114) int local114 = local45 + Static106.method2589(local104, local52 - local45);
				@Pc(125) int local125 = local59 + Static106.method2589(local104, local66 - local59);
				@Pc(129) int local129 = local28 + local114;
				if (Static164.anInt8839 < local129) {
					local129 = Static164.anInt8839;
					local114 = Static164.anInt8839 - local28;
				}
				@Pc(177) int local177;
				@Pc(152) int local152;
				if (local34) {
					local177 = 0;
				} else {
					@Pc(146) int local146 = local30;
					@Pc(150) int[] local150 = local97[local30];
					local152 = 0;
					@Pc(156) int local156 = local129 + local22;
					if (local156 < 0) {
						local156 += Static164.anInt8839;
					}
					if (local156 > Static164.anInt8839) {
						local156 -= Static164.anInt8839;
					}
					local177 = local150[2];
					while (true) {
						@Pc(181) int[] local181 = local97[local146];
						if (local181[0] <= local156 && local181[1] >= local156) {
							if (local146 != local30) {
								@Pc(211) int local211 = local22 + local28;
								if (local211 < 0) {
									local211 += Static164.anInt8839;
								}
								if (local211 > Static164.anInt8839) {
									local211 -= Static164.anInt8839;
								}
								for (@Pc(230) int local230 = 1; local230 <= local152; local230++) {
									@Pc(240) int[] local240 = local97[(local30 + local230) % local36];
									local177 = Math.max(local177, local240[2]);
								}
								for (@Pc(252) int local252 = 0; local252 <= local152; local252++) {
									@Pc(262) int[] local262 = local97[(local252 + local30) % local36];
									@Pc(266) int local266 = local262[2];
									if (local266 != local177) {
										@Pc(273) int local273 = local262[0];
										@Pc(277) int local277 = local262[1];
										@Pc(291) int local291;
										@Pc(295) int local295;
										if (local211 < local156) {
											local291 = Math.max(local211, local273);
											local295 = Math.min(local156, local277);
										} else if (local273 == 0) {
											local291 = 0;
											local295 = Math.min(local156, local277);
										} else {
											local291 = Math.max(local211, local273);
											local295 = Static164.anInt8839;
										}
										this.method6614(local177 - local266, local20, local295 - local291, local291 - -local26, local104, local266);
									}
								}
							}
							local30 = local146;
							break;
						}
						local146++;
						if (local36 <= local146) {
							local146 = 0;
						}
						local152++;
					}
				}
				if (Static638.anInt10476 < local177 + local125) {
					local125 = Static638.anInt10476 - local177;
				} else {
					local32 = false;
				}
				@Pc(366) int[] local366;
				if (Static164.anInt8839 == local129) {
					this.method6614(local125, local20, local114, local28 + local24, local104, local177);
					if (local32) {
						return local11;
					}
					local32 = true;
					local366 = local93[local38++];
					local366[1] = local129;
					local366[2] = local125 + local177;
					local366[0] = local28;
					@Pc(432) int[][] local432 = local97;
					local97 = local93;
					local36 = local38;
					local93 = local432;
					local26 = local24;
					local38 = 0;
					local24 = Static106.method2589(local104, Static164.anInt8839);
					local28 = 0;
					local22 = local24 - local26;
					local152 = local22;
					if (local22 < 0) {
						local152 = local22 + Static164.anInt8839;
					}
					if (local152 > Static164.anInt8839) {
						local152 -= Static164.anInt8839;
					}
					local30 = 0;
					while (true) {
						@Pc(475) int[] local475 = local97[local30];
						if (local475[0] <= local152 && local152 <= local475[1]) {
							local34 = false;
							break;
						}
						local30++;
						if (local30 >= local36) {
							local30 = 0;
						}
					}
				} else {
					local366 = local93[local38++];
					local366[0] = local28;
					local366[2] = local125 + local177;
					local366[1] = local129;
					this.method6614(local125, local20, local114, local28 + local24, local104, local177);
					local28 = local129;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(I[[IIIILjava/util/Random;I)V")
	private void method6614(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Random arg4, @OriginalArg(6) int arg5) {
		@Pc(18) int local18 = this.anInt7907 <= 0 ? 4096 : 4096 - Static106.method2589(arg4, this.anInt7907);
		@Pc(26) int local26 = this.anInt7915 * this.anInt7913 >> 12;
		@Pc(42) int local42 = this.anInt7915 - (local26 > 0 ? Static106.method2589(arg4, local26) : 0);
		if (Static164.anInt8839 <= arg3) {
			arg3 -= Static164.anInt8839;
		}
		@Pc(77) int local77;
		@Pc(81) int local81;
		if (local42 > 0) {
			if (arg0 > 0 && arg2 > 0) {
				local77 = arg2 / 2;
				local81 = arg0 / 2;
				@Pc(92) int local92 = local77 >= local42 ? local42 : local77;
				@Pc(103) int local103 = local81 >= local42 ? local42 : local81;
				@Pc(107) int local107 = local92 + arg3;
				@Pc(114) int local114 = arg2 - local92 * 2;
				for (@Pc(116) int local116 = 0; local116 < arg0; local116++) {
					@Pc(125) int[] local125 = arg1[local116 + arg5];
					@Pc(138) int local138;
					@Pc(146) int local146;
					@Pc(154) int local154;
					if (local103 > local116) {
						local138 = local18 * local116 / local103;
						if (this.anInt7914 == 0) {
							for (local146 = 0; local146 < local92; local146++) {
								local154 = local146 * local18 / local92;
								local125[arg3 + local146 & Static52.anInt1120] = local125[arg2 + arg3 - local146 - 1 & Static52.anInt1120] = local154 * local138 >> 12;
							}
						} else {
							for (local146 = 0; local146 < local92; local146++) {
								local154 = local18 * local146 / local92;
								local125[Static52.anInt1120 & local146 + arg3] = local125[arg2 + arg3 - local146 - 1 & Static52.anInt1120] = local138 <= local154 ? local138 : local154;
							}
						}
						if (local107 + local114 > Static164.anInt8839) {
							local146 = Static164.anInt8839 - local107;
							Static655.method6405(local125, local107, local146, local138);
							Static655.method6405(local125, 0, local114 - local146, local138);
						} else {
							Static655.method6405(local125, local107, local114, local138);
						}
					} else {
						local138 = arg0 - local116 - 1;
						if (local103 > local138) {
							local146 = local18 * local138 / local103;
							@Pc(292) int local292;
							if (this.anInt7914 == 0) {
								for (local154 = 0; local154 < local92; local154++) {
									local292 = local154 * local18 / local92;
									local125[local154 + arg3 & Static52.anInt1120] = local125[Static52.anInt1120 & arg3 + arg2 - local154 - 1] = local146 * local292 >> 12;
								}
							} else {
								for (local154 = 0; local154 < local92; local154++) {
									local292 = local154 * local18 / local92;
									local125[arg3 + local154 & Static52.anInt1120] = local125[arg2 + arg3 - local154 - 1 & Static52.anInt1120] = local292 < local146 ? local292 : local146;
								}
							}
							if (local107 + local114 > Static164.anInt8839) {
								local154 = Static164.anInt8839 - local107;
								Static655.method6405(local125, local107, local154, local146);
								Static655.method6405(local125, 0, local114 - local154, local146);
							} else {
								Static655.method6405(local125, local107, local114, local146);
							}
						} else {
							for (local146 = 0; local146 < local92; local146++) {
								local125[Static52.anInt1120 & arg3 + local146] = local125[Static52.anInt1120 & arg2 + arg3 - local146 - 1] = local18 * local146 / local92;
							}
							if (local114 + local107 > Static164.anInt8839) {
								local154 = Static164.anInt8839 - local107;
								Static655.method6405(local125, local107, local154, local18);
								Static655.method6405(local125, 0, local114 - local154, local18);
							} else {
								Static655.method6405(local125, local107, local114, local18);
							}
						}
					}
				}
			}
		} else if (Static164.anInt8839 >= arg2 + arg3) {
			for (local77 = 0; local77 < arg0; local77++) {
				Static655.method6405(arg1[local77 + arg5], arg3, arg2, local18);
			}
		} else {
			local77 = Static164.anInt8839 - arg3;
			for (local81 = 0; local81 < arg0; local81++) {
				@Pc(525) int[] local525 = arg1[local81 + arg5];
				Static655.method6405(local525, arg3, local77, local18);
				Static655.method6405(local525, 0, arg2 - local77, local18);
			}
		}
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(IBLclient!tn;)V")
	@Override
	public void method8335(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt7905 = arg1.method8401();
		} else if (arg0 == 1) {
			this.anInt7908 = arg1.method8414();
		} else if (arg0 == 2) {
			this.anInt7918 = arg1.method8414();
		} else if (arg0 == 3) {
			this.anInt7911 = arg1.method8414();
		} else if (arg0 == 4) {
			this.anInt7917 = arg1.method8414();
		} else if (arg0 == 5) {
			this.anInt7912 = arg1.method8414();
		} else if (arg0 == 6) {
			this.anInt7914 = arg1.method8401();
		} else if (arg0 == 7) {
			this.anInt7913 = arg1.method8414();
		} else if (arg0 == 8) {
			this.anInt7907 = arg1.method8414();
		}
	}
}
