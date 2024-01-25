import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class2_Sub2_Sub8 extends Class2_Sub2 {

	@OriginalMember(owner = "client!cp", name = "cb", descriptor = "I")
	private int anInt1039;

	@OriginalMember(owner = "client!cp", name = "O", descriptor = "I")
	private int anInt1028 = 409;

	@OriginalMember(owner = "client!cp", name = "M", descriptor = "I")
	private int anInt1026 = 819;

	@OriginalMember(owner = "client!cp", name = "W", descriptor = "I")
	private int anInt1034 = 1024;

	@OriginalMember(owner = "client!cp", name = "N", descriptor = "I")
	private int anInt1027 = 0;

	@OriginalMember(owner = "client!cp", name = "P", descriptor = "I")
	private int anInt1029 = 1024;

	@OriginalMember(owner = "client!cp", name = "Q", descriptor = "I")
	private int anInt1030 = 2048;

	@OriginalMember(owner = "client!cp", name = "V", descriptor = "I")
	private int anInt1033 = 1024;

	@OriginalMember(owner = "client!cp", name = "T", descriptor = "I")
	private int anInt1032 = 1024;

	@OriginalMember(owner = "client!cp", name = "X", descriptor = "I")
	private int anInt1035 = 0;

	static {
		new Class231("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
	}

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)V")
	@Override
	public void method6262() {
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(Lclient!hw;BI)V")
	@Override
	public void method6273(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1027 = arg0.method6138();
		} else if (arg1 == 1) {
			this.anInt1034 = arg0.method6148();
		} else if (arg1 == 2) {
			this.anInt1030 = arg0.method6148();
		} else if (arg1 == 3) {
			this.anInt1028 = arg0.method6148();
		} else if (arg1 == 4) {
			this.anInt1026 = arg0.method6148();
		} else if (arg1 == 5) {
			this.anInt1033 = arg0.method6148();
		} else if (arg1 == 6) {
			this.anInt1035 = arg0.method6138();
		} else if (arg1 == 7) {
			this.anInt1029 = arg0.method6148();
		} else if (arg1 == 8) {
			this.anInt1032 = arg0.method6148();
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIILjava/util/Random;[[III)V")
	private void method931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Random arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(26) int local26 = this.anInt1032 <= 0 ? 4096 : 4096 - Static408.method1356(arg2, this.anInt1032);
		@Pc(34) int local34 = this.anInt1039 * this.anInt1029 >> 12;
		@Pc(50) int local50 = this.anInt1039 - (local34 > 0 ? Static408.method1356(arg2, local34) : 0);
		if (arg5 >= Static398.anInt6955) {
			arg5 -= Static398.anInt6955;
		}
		@Pc(73) int local73;
		@Pc(75) int local75;
		if (local50 <= 0) {
			if (Static398.anInt6955 < arg5 + arg4) {
				local73 = Static398.anInt6955 - arg5;
				for (local75 = 0; local75 < arg0; local75++) {
					@Pc(84) int[] local84 = arg3[arg1 + local75];
					Static472.method5023(local84, arg5, local73, local26);
					Static472.method5023(local84, 0, arg4 - local73, local26);
				}
			} else {
				for (local73 = 0; local73 < arg0; local73++) {
					Static472.method5023(arg3[local73 + arg1], arg5, arg4, local26);
				}
			}
		} else if (arg0 > 0 && arg4 > 0) {
			local73 = arg4 / 2;
			local75 = arg0 / 2;
			@Pc(147) int local147 = local50 > local73 ? local73 : local50;
			@Pc(154) int local154 = local75 < local50 ? local75 : local50;
			@Pc(158) int local158 = local147 + arg5;
			@Pc(165) int local165 = arg4 - local147 * 2;
			for (@Pc(167) int local167 = 0; local167 < arg0; local167++) {
				@Pc(175) int[] local175 = arg3[arg1 + local167];
				@Pc(184) int local184;
				@Pc(192) int local192;
				@Pc(200) int local200;
				if (local167 < local154) {
					local184 = local26 * local167 / local154;
					if (this.anInt1035 == 0) {
						for (local192 = 0; local192 < local147; local192++) {
							local200 = local26 * local192 / local147;
							local175[local192 + arg5 & Static210.anInt3600] = local175[arg5 + arg4 - local192 - 1 & Static210.anInt3600] = local200 * local184 >> 12;
						}
					} else {
						for (local192 = 0; local192 < local147; local192++) {
							local200 = local192 * local26 / local147;
							local175[Static210.anInt3600 & arg5 + local192] = local175[Static210.anInt3600 & arg5 + arg4 - local192 - 1] = local200 < local184 ? local200 : local184;
						}
					}
					if (local158 + local165 <= Static398.anInt6955) {
						Static472.method5023(local175, local158, local165, local184);
					} else {
						local192 = Static398.anInt6955 - local158;
						Static472.method5023(local175, local158, local192, local184);
						Static472.method5023(local175, 0, local165 - local192, local184);
					}
				} else {
					local184 = arg0 - local167 - 1;
					if (local184 < local154) {
						local192 = local26 * local184 / local154;
						@Pc(343) int local343;
						if (this.anInt1035 == 0) {
							for (local200 = 0; local200 < local147; local200++) {
								local343 = local200 * local26 / local147;
								local175[local200 + arg5 & Static210.anInt3600] = local175[arg4 + arg5 - local200 - 1 & Static210.anInt3600] = local343 * local192 >> 12;
							}
						} else {
							for (local200 = 0; local200 < local147; local200++) {
								local343 = local26 * local200 / local147;
								local175[Static210.anInt3600 & local200 + arg5] = local175[Static210.anInt3600 & arg5 + arg4 - local200 - 1] = local192 > local343 ? local343 : local192;
							}
						}
						if (Static398.anInt6955 < local165 + local158) {
							local200 = Static398.anInt6955 - local158;
							Static472.method5023(local175, local158, local200, local192);
							Static472.method5023(local175, 0, local165 - local200, local192);
						} else {
							Static472.method5023(local175, local158, local165, local192);
						}
					} else {
						for (local192 = 0; local192 < local147; local192++) {
							local175[Static210.anInt3600 & arg5 + local192] = local175[Static210.anInt3600 & arg4 + arg5 - local192 - 1] = local26 * local192 / local147;
						}
						if (local158 + local165 <= Static398.anInt6955) {
							Static472.method5023(local175, local158, local165, local26);
						} else {
							local200 = Static398.anInt6955 - local158;
							Static472.method5023(local175, local158, local200, local26);
							Static472.method5023(local175, 0, local165 - local200, local26);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6274(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass234_41.method5375(arg0);
		if (!super.aClass234_41.aBoolean454) {
			return local19;
		}
		@Pc(28) int[][] local28 = super.aClass234_41.method5373();
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) boolean local40 = true;
		@Pc(42) boolean local42 = true;
		@Pc(44) int local44 = 0;
		@Pc(46) int local46 = 0;
		@Pc(53) int local53 = this.anInt1034 * Static398.anInt6955 >> 12;
		@Pc(60) int local60 = this.anInt1030 * Static398.anInt6955 >> 12;
		@Pc(67) int local67 = Static271.anInt4925 * this.anInt1028 >> 12;
		@Pc(74) int local74 = Static271.anInt4925 * this.anInt1026 >> 12;
		if (local74 <= 1) {
			return local28[arg0];
		}
		this.anInt1039 = this.anInt1033 * (Static398.anInt6955 / 8) >> 12;
		@Pc(99) int local99 = Static398.anInt6955 / local53 + 1;
		@Pc(103) int[][] local103 = new int[local99][3];
		@Pc(107) int[][] local107 = new int[local99][3];
		@Pc(114) Random local114 = new Random((long) this.anInt1027);
		while (true) {
			while (true) {
				@Pc(124) int local124 = local53 + Static408.method1356(local114, local60 - local53);
				@Pc(133) int local133 = Static408.method1356(local114, local74 - local67) + local67;
				@Pc(137) int local137 = local36 + local124;
				if (Static398.anInt6955 < local137) {
					local137 = Static398.anInt6955;
					local124 = Static398.anInt6955 - local36;
				}
				@Pc(150) int local150;
				@Pc(160) int local160;
				if (local42) {
					local150 = 0;
				} else {
					@Pc(154) int local154 = local38;
					@Pc(158) int[] local158 = local107[local38];
					local160 = 0;
					@Pc(164) int local164 = local30 + local137;
					if (local164 < 0) {
						local164 += Static398.anInt6955;
					}
					if (local164 > Static398.anInt6955) {
						local164 -= Static398.anInt6955;
					}
					while (true) {
						@Pc(185) int[] local185 = local107[local154];
						if (local185[0] <= local164 && local164 <= local185[1]) {
							local150 = local158[2];
							if (local38 != local154) {
								@Pc(231) int local231 = local36 + local30;
								if (local231 < 0) {
									local231 += Static398.anInt6955;
								}
								if (local231 > Static398.anInt6955) {
									local231 -= Static398.anInt6955;
								}
								for (@Pc(253) int local253 = 1; local253 <= local160; local253++) {
									@Pc(263) int[] local263 = local107[(local38 + local253) % local44];
									local150 = Math.max(local150, local263[2]);
								}
								for (@Pc(279) int local279 = 0; local279 <= local160; local279++) {
									@Pc(289) int[] local289 = local107[(local279 + local38) % local44];
									@Pc(293) int local293 = local289[2];
									if (local293 != local150) {
										@Pc(300) int local300 = local289[0];
										@Pc(304) int local304 = local289[1];
										@Pc(315) int local315;
										@Pc(319) int local319;
										if (local231 < local164) {
											local315 = Math.max(local231, local300);
											local319 = Math.min(local164, local304);
										} else if (local300 == 0) {
											local319 = Math.min(local164, local304);
											local315 = 0;
										} else {
											local315 = Math.max(local231, local300);
											local319 = Static398.anInt6955;
										}
										this.method931(local150 - local293, local293, local114, local28, local319 - local315, local34 + local315);
									}
								}
							}
							local38 = local154;
							break;
						}
						local154++;
						if (local154 >= local44) {
							local154 = 0;
						}
						local160++;
					}
				}
				if (Static271.anInt4925 < local133 + local150) {
					local133 = Static271.anInt4925 - local150;
				} else {
					local40 = false;
				}
				@Pc(387) int[] local387;
				if (Static398.anInt6955 == local137) {
					this.method931(local133, local150, local114, local28, local124, local36 + local32);
					if (local40) {
						return local19;
					}
					local40 = true;
					local387 = local103[local46++];
					local387[1] = local137;
					local387[2] = local133 + local150;
					local387[0] = local36;
					@Pc(454) int[][] local454 = local107;
					local107 = local103;
					local44 = local46;
					local103 = local454;
					local46 = 0;
					local34 = local32;
					local32 = Static408.method1356(local114, Static398.anInt6955);
					local36 = 0;
					local30 = local32 - local34;
					local160 = local30;
					if (local30 < 0) {
						local160 = local30 + Static398.anInt6955;
					}
					if (Static398.anInt6955 < local160) {
						local160 -= Static398.anInt6955;
					}
					local38 = 0;
					local42 = false;
					while (true) {
						@Pc(498) int[] local498 = local107[local38];
						if (local498[0] <= local160 && local498[1] >= local160) {
							break;
						}
						local38++;
						if (local38 >= local44) {
							local38 = 0;
						}
					}
				} else {
					local387 = local103[local46++];
					local387[1] = local137;
					local387[0] = local36;
					local387[2] = local133 + local150;
					this.method931(local133, local150, local114, local28, local124, local36 + local32);
					local36 = local137;
				}
			}
		}
	}
}
