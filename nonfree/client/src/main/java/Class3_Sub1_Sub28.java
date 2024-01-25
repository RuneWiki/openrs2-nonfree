import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pfa")
public final class Class3_Sub1_Sub28 extends Class3_Sub1 {

	@OriginalMember(owner = "client!pfa", name = "K", descriptor = "I")
	private int anInt6838;

	@OriginalMember(owner = "client!pfa", name = "O", descriptor = "I")
	private int anInt6842 = 1024;

	@OriginalMember(owner = "client!pfa", name = "Q", descriptor = "I")
	private int anInt6844 = 0;

	@OriginalMember(owner = "client!pfa", name = "T", descriptor = "I")
	private int anInt6847 = 2048;

	@OriginalMember(owner = "client!pfa", name = "M", descriptor = "I")
	private int anInt6840 = 1024;

	@OriginalMember(owner = "client!pfa", name = "S", descriptor = "I")
	private int anInt6846 = 819;

	@OriginalMember(owner = "client!pfa", name = "R", descriptor = "I")
	private int anInt6845 = 1024;

	@OriginalMember(owner = "client!pfa", name = "W", descriptor = "I")
	private int anInt6849 = 1024;

	@OriginalMember(owner = "client!pfa", name = "X", descriptor = "I")
	private int anInt6850 = 0;

	@OriginalMember(owner = "client!pfa", name = "Y", descriptor = "I")
	private int anInt6851 = 409;

	@OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7767(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass85_41.method2548(arg0);
		if (!super.aClass85_41.aBoolean239) {
			return local16;
		}
		@Pc(25) int[][] local25 = super.aClass85_41.method2547();
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) boolean local37 = true;
		@Pc(39) boolean local39 = true;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		@Pc(50) int local50 = Static206.anInt4182 * this.anInt6840 >> 12;
		@Pc(57) int local57 = this.anInt6847 * Static206.anInt4182 >> 12;
		@Pc(64) int local64 = this.anInt6851 * Static245.anInt4535 >> 12;
		@Pc(71) int local71 = this.anInt6846 * Static245.anInt4535 >> 12;
		if (local71 <= 1) {
			return local25[arg0];
		}
		this.anInt6838 = this.anInt6849 * (Static206.anInt4182 / 8) >> 12;
		@Pc(94) int local94 = Static206.anInt4182 / local50 + 1;
		@Pc(98) int[][] local98 = new int[local94][3];
		@Pc(102) int[][] local102 = new int[local94][3];
		@Pc(109) Random local109 = new Random((long) this.anInt6844);
		while (true) {
			while (true) {
				@Pc(119) int local119 = local50 + Static231.method3920(local109, local57 - local50);
				@Pc(130) int local130 = local64 + Static231.method3920(local109, local71 - local64);
				@Pc(134) int local134 = local33 + local119;
				if (Static206.anInt4182 < local134) {
					local134 = Static206.anInt4182;
					local119 = Static206.anInt4182 - local33;
				}
				@Pc(148) int local148;
				@Pc(158) int local158;
				if (local39) {
					local148 = 0;
				} else {
					@Pc(152) int local152 = local35;
					@Pc(156) int[] local156 = local102[local35];
					local158 = 0;
					@Pc(163) int local163 = local134 + local27;
					if (local163 < 0) {
						local163 += Static206.anInt4182;
					}
					if (Static206.anInt4182 < local163) {
						local163 -= Static206.anInt4182;
					}
					local148 = local156[2];
					while (true) {
						@Pc(188) int[] local188 = local102[local152];
						if (local163 >= local188[0] && local163 <= local188[1]) {
							if (local152 != local35) {
								@Pc(227) int local227 = local33 + local27;
								if (local227 < 0) {
									local227 += Static206.anInt4182;
								}
								if (Static206.anInt4182 < local227) {
									local227 -= Static206.anInt4182;
								}
								for (@Pc(249) int local249 = 1; local249 <= local158; local249++) {
									@Pc(260) int[] local260 = local102[(local35 + local249) % local41];
									local148 = Math.max(local148, local260[2]);
								}
								for (@Pc(272) int local272 = 0; local272 <= local158; local272++) {
									@Pc(282) int[] local282 = local102[(local35 + local272) % local41];
									@Pc(286) int local286 = local282[2];
									if (local148 != local286) {
										@Pc(293) int local293 = local282[0];
										@Pc(297) int local297 = local282[1];
										@Pc(304) int local304;
										@Pc(308) int local308;
										if (local163 > local227) {
											local304 = Math.max(local227, local293);
											local308 = Math.min(local163, local297);
										} else if (local293 == 0) {
											local304 = 0;
											local308 = Math.min(local163, local297);
										} else {
											local304 = Math.max(local227, local293);
											local308 = Static206.anInt4182;
										}
										this.method5860(local148 - local286, local25, local308 - local304, local286, local31 + local304, local109);
									}
								}
							}
							local35 = local152;
							break;
						}
						@Pc(205) int local205 = ~local41;
						local152++;
						if (local205 >= ~local152) {
							local152 = 0;
						}
						local158++;
					}
				}
				if (Static245.anInt4535 < local148 + local130) {
					local130 = Static245.anInt4535 - local148;
				} else {
					local37 = false;
				}
				@Pc(391) int[] local391;
				if (Static206.anInt4182 == local134) {
					this.method5860(local130, local25, local119, local148, local29 + local33, local109);
					if (local37) {
						return local16;
					}
					local37 = true;
					local391 = local98[local43++];
					local391[0] = local33;
					local391[1] = local134;
					local391[2] = local148 + local130;
					@Pc(408) int[][] local408 = local102;
					local102 = local98;
					local98 = local408;
					local41 = local43;
					local43 = 0;
					local31 = local29;
					local29 = Static231.method3920(local109, Static206.anInt4182);
					local27 = local29 - local31;
					local33 = 0;
					local158 = local27;
					if (local27 < 0) {
						local158 = local27 + Static206.anInt4182;
					}
					local35 = 0;
					if (Static206.anInt4182 < local158) {
						local158 -= Static206.anInt4182;
					}
					local39 = false;
					while (true) {
						@Pc(455) int[] local455 = local102[local35];
						if (local158 >= local455[0] && local158 <= local455[1]) {
							break;
						}
						local35++;
						if (local35 >= local41) {
							local35 = 0;
						}
					}
				} else {
					local391 = local98[local43++];
					local391[1] = local134;
					local391[2] = local148 + local130;
					local391[0] = local33;
					this.method5860(local130, local25, local119, local148, local29 + local33, local109);
					local33 = local134;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(I)V")
	@Override
	public void method7763() {
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Lclient!qh;II)V")
	@Override
	public void method7761(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt6844 = arg0.method3118();
		} else if (arg1 == 1) {
			this.anInt6840 = arg0.method3109();
		} else if (arg1 == 2) {
			this.anInt6847 = arg0.method3109();
		} else if (arg1 == 3) {
			this.anInt6851 = arg0.method3109();
		} else if (arg1 == 4) {
			this.anInt6846 = arg0.method3109();
		} else if (arg1 == 5) {
			this.anInt6849 = arg0.method3109();
		} else if (arg1 == 6) {
			this.anInt6850 = arg0.method3118();
		} else if (arg1 == 7) {
			this.anInt6842 = arg0.method3109();
		} else if (arg1 == 8) {
			this.anInt6845 = arg0.method3109();
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(I[[IIIIILjava/util/Random;)V")
	private void method5860(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Random arg5) {
		@Pc(18) int local18 = this.anInt6845 <= 0 ? 4096 : 4096 - Static231.method3920(arg5, this.anInt6845);
		@Pc(30) int local30 = this.anInt6842 * this.anInt6838 >> 12;
		@Pc(43) int local43 = this.anInt6838 - (local30 <= 0 ? 0 : Static231.method3920(arg5, local30));
		if (arg4 >= Static206.anInt4182) {
			arg4 -= Static206.anInt4182;
		}
		@Pc(73) int local73;
		@Pc(75) int local75;
		if (local43 <= 0) {
			if (arg2 + arg4 > Static206.anInt4182) {
				local73 = Static206.anInt4182 - arg4;
				for (local75 = 0; local75 < arg0; local75++) {
					@Pc(83) int[] local83 = arg1[arg3 + local75];
					Static604.method5915(local83, arg4, local73, local18);
					Static604.method5915(local83, 0, arg2 - local73, local18);
				}
			} else {
				for (local73 = 0; local73 < arg0; local73++) {
					Static604.method5915(arg1[arg3 + local73], arg4, arg2, local18);
				}
			}
		} else if (arg0 > 0 && arg2 > 0) {
			local73 = arg2 / 2;
			local75 = arg0 / 2;
			@Pc(146) int local146 = local43 > local73 ? local73 : local43;
			@Pc(157) int local157 = local43 <= local75 ? local43 : local75;
			@Pc(161) int local161 = arg4 + local146;
			@Pc(167) int local167 = arg2 - local146 * 2;
			for (@Pc(169) int local169 = 0; local169 < arg0; local169++) {
				@Pc(177) int[] local177 = arg1[local169 + arg3];
				@Pc(186) int local186;
				@Pc(194) int local194;
				@Pc(202) int local202;
				if (local169 < local157) {
					local186 = local169 * local18 / local157;
					if (this.anInt6850 == 0) {
						for (local194 = 0; local194 < local146; local194++) {
							local202 = local194 * local18 / local146;
							local177[Static439.anInt7283 & local194 + arg4] = local177[Static439.anInt7283 & arg2 + arg4 - local194 - 1] = local202 * local186 >> 12;
						}
					} else {
						for (local194 = 0; local194 < local146; local194++) {
							local202 = local18 * local194 / local146;
							local177[Static439.anInt7283 & arg4 + local194] = local177[arg2 + arg4 - local194 - 1 & Static439.anInt7283] = local186 <= local202 ? local186 : local202;
						}
					}
					if (local161 + local167 > Static206.anInt4182) {
						local194 = Static206.anInt4182 - local161;
						Static604.method5915(local177, local161, local194, local186);
						Static604.method5915(local177, 0, local167 - local194, local186);
					} else {
						Static604.method5915(local177, local161, local167, local186);
					}
				} else {
					local186 = arg0 - local169 - 1;
					if (local186 < local157) {
						local194 = local18 * local186 / local157;
						@Pc(339) int local339;
						if (this.anInt6850 == 0) {
							for (local202 = 0; local202 < local146; local202++) {
								local339 = local202 * local18 / local146;
								local177[arg4 + local202 & Static439.anInt7283] = local177[Static439.anInt7283 & arg4 + arg2 - local202 - 1] = local339 * local194 >> 12;
							}
						} else {
							for (local202 = 0; local202 < local146; local202++) {
								local339 = local18 * local202 / local146;
								local177[arg4 + local202 & Static439.anInt7283] = local177[Static439.anInt7283 & arg4 + arg2 - local202 - 1] = local339 >= local194 ? local194 : local339;
							}
						}
						if (Static206.anInt4182 >= local161 + local167) {
							Static604.method5915(local177, local161, local167, local194);
						} else {
							local202 = Static206.anInt4182 - local161;
							Static604.method5915(local177, local161, local202, local194);
							Static604.method5915(local177, 0, local167 - local202, local194);
						}
					} else {
						for (local194 = 0; local194 < local146; local194++) {
							local177[Static439.anInt7283 & local194 + arg4] = local177[arg4 + arg2 - local194 - 1 & Static439.anInt7283] = local194 * local18 / local146;
						}
						if (Static206.anInt4182 < local167 + local161) {
							local202 = Static206.anInt4182 - local161;
							Static604.method5915(local177, local161, local202, local18);
							Static604.method5915(local177, 0, local167 - local202, local18);
						} else {
							Static604.method5915(local177, local161, local167, local18);
						}
					}
				}
			}
		}
	}
}
