import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ada")
public final class Class2_Sub4_Sub1 extends Class2_Sub4 {

	@OriginalMember(owner = "client!ada", name = "R", descriptor = "I")
	private int anInt144;

	@OriginalMember(owner = "client!ada", name = "E", descriptor = "I")
	private int anInt133 = 0;

	@OriginalMember(owner = "client!ada", name = "I", descriptor = "I")
	private int anInt137 = 1024;

	@OriginalMember(owner = "client!ada", name = "T", descriptor = "I")
	private int anInt146 = 1024;

	@OriginalMember(owner = "client!ada", name = "H", descriptor = "I")
	private int anInt136 = 1024;

	@OriginalMember(owner = "client!ada", name = "U", descriptor = "I")
	private int anInt147 = 819;

	@OriginalMember(owner = "client!ada", name = "W", descriptor = "I")
	private int anInt148 = 409;

	@OriginalMember(owner = "client!ada", name = "M", descriptor = "I")
	private int anInt140 = 1024;

	@OriginalMember(owner = "client!ada", name = "P", descriptor = "I")
	private int anInt142 = 0;

	@OriginalMember(owner = "client!ada", name = "X", descriptor = "I")
	private int anInt149 = 2048;

	@OriginalMember(owner = "client!ada", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ada", name = "e", descriptor = "(I)V")
	@Override
	public void method7562() {
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(ILclient!gk;B)V")
	@Override
	public void method7566(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt133 = arg1.method4464();
		} else if (arg0 == 1) {
			this.anInt136 = arg1.method4518();
		} else if (arg0 == 2) {
			this.anInt149 = arg1.method4518();
		} else if (arg0 == 3) {
			this.anInt148 = arg1.method4518();
		} else if (arg0 == 4) {
			this.anInt147 = arg1.method4518();
		} else if (arg0 == 5) {
			this.anInt146 = arg1.method4518();
		} else if (arg0 == 6) {
			this.anInt142 = arg1.method4464();
		} else if (arg0 == 7) {
			this.anInt140 = arg1.method4518();
		} else if (arg0 == 8) {
			this.anInt137 = arg1.method4518();
		}
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(Ljava/util/Random;II[[IZII)V")
	private void method123(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(18) int local18 = this.anInt137 <= 0 ? 4096 : 4096 - Static328.method4754(arg0, this.anInt137);
		@Pc(26) int local26 = this.anInt144 * this.anInt140 >> 12;
		@Pc(48) int local48 = this.anInt144 - (local26 > 0 ? Static328.method4754(arg0, local26) : 0);
		if (Static143.anInt7434 <= arg5) {
			arg5 -= Static143.anInt7434;
		}
		@Pc(68) int local68;
		@Pc(94) int local94;
		if (local48 <= 0) {
			if (Static143.anInt7434 >= arg5 + arg4) {
				for (local68 = 0; local68 < arg2; local68++) {
					Static598.method4260(arg3[local68 + arg1], arg5, arg4, local18);
				}
			} else {
				local68 = Static143.anInt7434 - arg5;
				for (local94 = 0; local94 < arg2; local94++) {
					@Pc(102) int[] local102 = arg3[local94 + arg1];
					Static598.method4260(local102, arg5, local68, local18);
					Static598.method4260(local102, 0, arg4 - local68, local18);
				}
			}
		} else if (arg2 > 0 && arg4 > 0) {
			local68 = arg4 / 2;
			local94 = arg2 / 2;
			@Pc(150) int local150 = local68 < local48 ? local68 : local48;
			@Pc(157) int local157 = local94 >= local48 ? local48 : local94;
			@Pc(161) int local161 = local150 + arg5;
			@Pc(168) int local168 = arg4 - local150 * 2;
			for (@Pc(170) int local170 = 0; local170 < arg2; local170++) {
				@Pc(178) int[] local178 = arg3[local170 + arg1];
				@Pc(187) int local187;
				@Pc(195) int local195;
				@Pc(203) int local203;
				if (local157 > local170) {
					local187 = local170 * local18 / local157;
					if (this.anInt142 == 0) {
						for (local195 = 0; local195 < local150; local195++) {
							local203 = local195 * local18 / local150;
							local178[Static464.anInt7427 & local195 + arg5] = local178[Static464.anInt7427 & arg4 + arg5 - local195 - 1] = local187 * local203 >> 12;
						}
					} else {
						for (local195 = 0; local195 < local150; local195++) {
							local203 = local18 * local195 / local150;
							local178[local195 + arg5 & Static464.anInt7427] = local178[arg4 + arg5 - local195 - 1 & Static464.anInt7427] = local187 <= local203 ? local187 : local203;
						}
					}
					if (Static143.anInt7434 >= local168 + local161) {
						Static598.method4260(local178, local161, local168, local187);
					} else {
						local195 = Static143.anInt7434 - local161;
						Static598.method4260(local178, local161, local195, local187);
						Static598.method4260(local178, 0, local168 - local195, local187);
					}
				} else {
					local187 = arg2 - local170 - 1;
					if (local157 > local187) {
						local195 = local18 * local187 / local157;
						@Pc(350) int local350;
						if (this.anInt142 == 0) {
							for (local203 = 0; local203 < local150; local203++) {
								local350 = local18 * local203 / local150;
								local178[arg5 + local203 & Static464.anInt7427] = local178[arg5 + arg4 - local203 - 1 & Static464.anInt7427] = local195 * local350 >> 12;
							}
						} else {
							for (local203 = 0; local203 < local150; local203++) {
								local350 = local18 * local203 / local150;
								local178[Static464.anInt7427 & arg5 + local203] = local178[Static464.anInt7427 & arg5 + arg4 - local203 - 1] = local350 >= local195 ? local195 : local350;
							}
						}
						if (local168 + local161 <= Static143.anInt7434) {
							Static598.method4260(local178, local161, local168, local195);
						} else {
							local203 = Static143.anInt7434 - local161;
							Static598.method4260(local178, local161, local203, local195);
							Static598.method4260(local178, 0, local168 - local203, local195);
						}
					} else {
						for (local195 = 0; local195 < local150; local195++) {
							local178[Static464.anInt7427 & local195 + arg5] = local178[arg4 + arg5 - local195 - 1 & Static464.anInt7427] = local195 * local18 / local150;
						}
						if (local161 + local168 <= Static143.anInt7434) {
							Static598.method4260(local178, local161, local168, local18);
						} else {
							local203 = Static143.anInt7434 - local161;
							Static598.method4260(local178, local161, local203, local18);
							Static598.method4260(local178, 0, local168 - local203, local18);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ada", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7564(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass271_41.method5621(arg0);
		if (!super.aClass271_41.aBoolean543) {
			return local13;
		}
		@Pc(28) int[][] local28 = super.aClass271_41.method5624();
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) boolean local40 = true;
		@Pc(42) boolean local42 = true;
		@Pc(44) int local44 = 0;
		@Pc(46) int local46 = 0;
		@Pc(53) int local53 = Static143.anInt7434 * this.anInt136 >> 12;
		@Pc(60) int local60 = this.anInt149 * Static143.anInt7434 >> 12;
		@Pc(67) int local67 = Static42.anInt782 * this.anInt148 >> 12;
		@Pc(74) int local74 = Static42.anInt782 * this.anInt147 >> 12;
		if (local74 <= 1) {
			return local28[arg0];
		}
		this.anInt144 = Static143.anInt7434 / 8 * this.anInt146 >> 12;
		@Pc(97) int local97 = Static143.anInt7434 / local53 + 1;
		@Pc(101) int[][] local101 = new int[local97][3];
		@Pc(105) int[][] local105 = new int[local97][3];
		@Pc(112) Random local112 = new Random((long) this.anInt133);
		while (true) {
			while (true) {
				@Pc(122) int local122 = Static328.method4754(local112, local60 - local53) + local53;
				@Pc(131) int local131 = Static328.method4754(local112, local74 - local67) + local67;
				@Pc(136) int local136 = local36 + local122;
				if (Static143.anInt7434 < local136) {
					local122 = Static143.anInt7434 - local36;
					local136 = Static143.anInt7434;
				}
				@Pc(216) int local216;
				@Pc(160) int local160;
				if (local42) {
					local216 = 0;
				} else {
					@Pc(154) int local154 = local38;
					@Pc(158) int[] local158 = local105[local38];
					local160 = 0;
					@Pc(165) int local165 = local136 + local30;
					if (local165 < 0) {
						local165 += Static143.anInt7434;
					}
					if (Static143.anInt7434 < local165) {
						local165 -= Static143.anInt7434;
					}
					while (true) {
						@Pc(189) int[] local189 = local105[local154];
						if (local165 >= local189[0] && local165 <= local189[1]) {
							local216 = local158[2];
							if (local38 != local154) {
								@Pc(227) int local227 = local30 + local36;
								if (local227 < 0) {
									local227 += Static143.anInt7434;
								}
								if (Static143.anInt7434 < local227) {
									local227 -= Static143.anInt7434;
								}
								for (@Pc(249) int local249 = 1; local249 <= local160; local249++) {
									@Pc(259) int[] local259 = local105[(local38 + local249) % local44];
									local216 = Math.max(local216, local259[2]);
								}
								for (@Pc(275) int local275 = 0; local275 <= local160; local275++) {
									@Pc(286) int[] local286 = local105[(local38 + local275) % local44];
									@Pc(290) int local290 = local286[2];
									if (local290 != local216) {
										@Pc(301) int local301 = local286[0];
										@Pc(305) int local305 = local286[1];
										@Pc(316) int local316;
										@Pc(320) int local320;
										if (local165 > local227) {
											local316 = Math.max(local227, local301);
											local320 = Math.min(local165, local305);
										} else if (local301 == 0) {
											local316 = 0;
											local320 = Math.min(local165, local305);
										} else {
											local316 = Math.max(local227, local301);
											local320 = Static143.anInt7434;
										}
										this.method123(local112, local290, local216 - local290, local28, local320 - local316, local316 - -local34);
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
				if (local131 + local216 > Static42.anInt782) {
					local131 = Static42.anInt782 - local216;
				} else {
					local40 = false;
				}
				@Pc(407) int[] local407;
				if (local136 == Static143.anInt7434) {
					this.method123(local112, local216, local131, local28, local122, local32 + local36);
					if (local40) {
						return local13;
					}
					local40 = true;
					local407 = local101[local46++];
					local407[2] = local216 + local131;
					local407[1] = local136;
					local407[0] = local36;
					@Pc(423) int[][] local423 = local105;
					local105 = local101;
					local44 = local46;
					local101 = local423;
					local46 = 0;
					local34 = local32;
					local32 = Static328.method4754(local112, Static143.anInt7434);
					local36 = 0;
					local30 = local32 - local34;
					local160 = local30;
					if (local30 < 0) {
						local160 = local30 + Static143.anInt7434;
					}
					if (local160 > Static143.anInt7434) {
						local160 -= Static143.anInt7434;
					}
					local38 = 0;
					while (true) {
						@Pc(473) int[] local473 = local105[local38];
						if (local160 >= local473[0] && local473[1] >= local160) {
							local42 = false;
							break;
						}
						@Pc(494) int local494 = ~local44;
						local38++;
						if (local494 >= ~local38) {
							local38 = 0;
						}
					}
				} else {
					local407 = local101[local46++];
					local407[2] = local131 + local216;
					local407[1] = local136;
					local407[0] = local36;
					this.method123(local112, local216, local131, local28, local122, local32 + local36);
					local36 = local136;
				}
			}
		}
	}
}
