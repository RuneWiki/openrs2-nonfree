import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class22_Sub1_Sub2 extends Class22_Sub1 {

	@OriginalMember(owner = "client!md", name = "M", descriptor = "Lclient!ce;")
	private Class46 aClass46_2;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!kb;[Lclient!md;)V")
	public Class22_Sub1_Sub2(@OriginalArg(0) Class121_Sub1 arg0, @OriginalArg(1) Class22_Sub1_Sub2[] arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!kb;)V")
	public Class22_Sub1_Sub2(@OriginalArg(0) Class121_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!kb;Lclient!rf;IIII)V")
	public Class22_Sub1_Sub2(@OriginalArg(0) Class121_Sub1 arg0, @OriginalArg(1) Class274 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!md", name = "n", descriptor = "()V")
	@Override
	protected void method4723() {
		super.aClass77_6.anInt3163 = this.aClass46_2.anInt929;
		super.aClass77_6.anInt3164 = this.aClass46_2.anInt931;
		super.aClass77_6.anInt3162 = this.aClass46_2.anInt932;
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(I)V")
	private void method4733(@OriginalArg(0) int arg0) {
		if (super.aBooleanArray29[arg0]) {
			this.method4735(arg0);
			return;
		}
		@Pc(13) short local13 = super.aShortArray84[arg0];
		@Pc(18) short local18 = super.aShortArray86[arg0];
		@Pc(23) short local23 = super.aShortArray88[arg0];
		this.aClass46_2.aBoolean47 = super.aBooleanArray30[arg0];
		if (super.aByteArray63 == null) {
			this.aClass46_2.anInt927 = 0;
		} else {
			this.aClass46_2.anInt927 = super.aByteArray63[arg0] & 0xFF;
		}
		if (super.aShortArray85 != null && super.aShortArray85[arg0] != -1) {
			@Pc(165) int local165;
			@Pc(170) int local170;
			@Pc(175) int local175;
			if (super.aByteArray64 == null || super.aByteArray64[arg0] == -1) {
				local165 = local13;
				local170 = local18;
				local175 = local23;
			} else {
				@Pc(160) int local160 = super.aByteArray64[arg0] & 0xFF;
				local165 = super.anIntArray481[local160];
				local170 = super.anIntArray490[local160];
				local175 = super.anIntArray478[local160];
			}
			if (super.anIntArray498[arg0] == -1) {
				this.aClass46_2.method730(super.anIntArray507[local13], super.anIntArray507[local18], super.anIntArray507[local23], super.anIntArray495[local13], super.anIntArray495[local18], super.anIntArray495[local23], super.anIntArray493[arg0], super.anIntArray493[arg0], super.anIntArray493[arg0], super.anIntArray483[local165], super.anIntArray483[local170], super.anIntArray483[local175], super.anIntArray488[local165], super.anIntArray488[local170], super.anIntArray488[local175], super.anIntArray497[local165], super.anIntArray497[local170], super.anIntArray497[local175], super.aShortArray85[arg0]);
			} else {
				this.aClass46_2.method730(super.anIntArray507[local13], super.anIntArray507[local18], super.anIntArray507[local23], super.anIntArray495[local13], super.anIntArray495[local18], super.anIntArray495[local23], super.anIntArray493[arg0], super.anIntArray501[arg0], super.anIntArray498[arg0], super.anIntArray483[local165], super.anIntArray483[local170], super.anIntArray483[local175], super.anIntArray488[local165], super.anIntArray488[local170], super.anIntArray488[local175], super.anIntArray497[local165], super.anIntArray497[local170], super.anIntArray497[local175], super.aShortArray85[arg0]);
			}
		} else if (super.anIntArray498[arg0] == -1) {
			this.aClass46_2.method740(super.anIntArray507[local13], super.anIntArray507[local18], super.anIntArray507[local23], super.anIntArray495[local13], super.anIntArray495[local18], super.anIntArray495[local23], Static6.anIntArray272[super.anIntArray493[arg0] & 0xFFFF]);
		} else {
			this.aClass46_2.method735(super.anIntArray507[local13], super.anIntArray507[local18], super.anIntArray507[local23], super.anIntArray495[local13], super.anIntArray495[local18], super.anIntArray495[local23], super.anIntArray493[arg0] & 0xFFFF, super.anIntArray501[arg0] & 0xFFFF, super.anIntArray498[arg0] & 0xFFFF);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
	@Override
	protected void method4720(@OriginalArg(0) int arg0) {
		this.aClass46_2.aBoolean43 = (arg0 & 0x1) == 0;
		this.aClass46_2.aBoolean45 = false;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ZZIIZI)V")
	@Override
	protected void method4731(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(12) int local12;
		if (arg3 + 2 > 2200) {
			local12 = Static154.method2268(arg3) + 1 - Static472.anInt5498;
			arg3 = (arg3 >> local12) + 2;
		} else {
			local12 = 0;
			arg3 += 2;
		}
		for (@Pc(24) int local24 = 0; local24 < 2200; local24++) {
			super.anIntArray489[local24] = 0;
		}
		@Pc(36) int local36 = 0;
		@Pc(41) int local41;
		if (super.aClass28Array3 != null) {
			local41 = 0;
			while (local41 < super.anInt5501) {
				@Pc(47) Class28 local47 = super.aClass28Array3[local41];
				super.anIntArray492[local47.anInt563] = local41++;
			}
		}
		@Pc(87) int local87;
		@Pc(92) int local92;
		@Pc(97) int local97;
		@Pc(113) int local113;
		@Pc(123) int local123;
		@Pc(128) int local128;
		@Pc(133) int local133;
		@Pc(138) int local138;
		@Pc(143) int local143;
		@Pc(148) int local148;
		@Pc(153) int local153;
		@Pc(193) int local193;
		for (local41 = 0; local41 < super.anInt5490; local41++) {
			if (super.anIntArray498[local41] != -2) {
				@Pc(72) short local72 = super.aShortArray84[local41];
				@Pc(77) short local77 = super.aShortArray86[local41];
				@Pc(82) short local82 = super.aShortArray88[local41];
				local87 = super.anIntArray495[local72];
				local92 = super.anIntArray495[local77];
				local97 = super.anIntArray495[local82];
				@Pc(118) int local118;
				if (arg0 && (local87 == -5000 || local92 == -5000 || local97 == -5000)) {
					local113 = super.anIntArray483[local72];
					local118 = super.anIntArray483[local77];
					local123 = super.anIntArray483[local82];
					local128 = super.anIntArray488[local72];
					local133 = super.anIntArray488[local77];
					local138 = super.anIntArray488[local82];
					local143 = super.anIntArray497[local72];
					local148 = super.anIntArray497[local77];
					local153 = super.anIntArray497[local82];
					@Pc(157) int local157 = local113 - local118;
					@Pc(161) int local161 = local123 - local118;
					@Pc(165) int local165 = local128 - local133;
					@Pc(169) int local169 = local138 - local133;
					@Pc(173) int local173 = local143 - local148;
					@Pc(177) int local177 = local153 - local148;
					@Pc(185) int local185 = local165 * local177 - local173 * local169;
					local193 = local173 * local161 - local157 * local177;
					@Pc(201) int local201 = local157 * local169 - local165 * local161;
					if (local118 * local185 + local133 * local193 + local148 * local201 > 0) {
						super.aBooleanArray29[local41] = true;
						@Pc(237) int local237 = (super.anIntArray505[local72] + super.anIntArray505[local77] + super.anIntArray505[local82]) / 3 >> local12;
						if (super.anIntArray489[local237] < 64) {
							super.anIntArrayArray64[local237][super.anIntArray489[local237]++] = local41;
						} else {
							@Pc(264) int local264 = super.anIntArray489[local237];
							if (local264 == 64) {
								if (local36 == 512) {
									continue;
								}
								super.anIntArray487[local36] = 0;
								super.anIntArray489[local237] = local264 = local36++ + 65;
							}
							local264 -= 65;
							super.anIntArrayArray63[local264][super.anIntArray487[local264]++] = local41;
						}
					}
				} else if (super.anIntArray492[local41] != -1 || (local87 - local92) * (super.anIntArray507[local82] - super.anIntArray507[local77]) - (super.anIntArray507[local72] - super.anIntArray507[local77]) * (local97 - local92) > 0) {
					super.aBooleanArray29[local41] = false;
					if (local87 >= 0 && local92 >= 0 && local97 >= 0 && local87 <= super.aClass77_6.anInt3163 && local92 <= super.aClass77_6.anInt3163 && local97 <= super.aClass77_6.anInt3163) {
						super.aBooleanArray30[local41] = false;
					} else {
						super.aBooleanArray30[local41] = true;
					}
					local113 = (super.anIntArray505[local72] + super.anIntArray505[local77] + super.anIntArray505[local82]) / 3 >> local12;
					if (super.anIntArray489[local113] < 64) {
						super.anIntArrayArray64[local113][super.anIntArray489[local113]++] = local41;
					} else {
						local118 = super.anIntArray489[local113];
						if (local118 == 64) {
							if (local36 == 512) {
								continue;
							}
							super.anIntArray487[local36] = 0;
							super.anIntArray489[local113] = local118 = local36++ + 65;
						}
						local118 -= 65;
						super.anIntArrayArray63[local118][super.anIntArray487[local118]++] = local41;
					}
				}
			}
		}
		@Pc(467) int local467;
		@Pc(477) int local477;
		@Pc(513) int local513;
		if (arg4) {
			for (local467 = 0; local467 < arg5; local467++) {
				local477 = super.anIntArray484[local467] - arg2 >> local12;
				if (local477 >= 0 && local477 < 2200) {
					if (super.anIntArray489[local477] < 64) {
						super.anIntArrayArray64[local477][super.anIntArray489[local477]++] = local467 + 1 << 16;
					} else {
						local513 = super.anIntArray489[local477];
						if (local513 == 64) {
							if (local36 == 512) {
								continue;
							}
							super.anIntArray487[local36] = 0;
							super.anIntArray489[local477] = local513 = local36++ + 65;
						}
						local513 -= 65;
						super.anIntArrayArray63[local513][super.anIntArray487[local513]++] = local467 + 1 << 16;
					}
				}
			}
		}
		if (super.aByteArray62 == null) {
			@Pc(593) int[] local593;
			if (!arg4 && super.aClass28Array3 == null) {
				if (arg1) {
					for (local467 = arg3 - 1; local467 >= 0; local467--) {
						local477 = super.anIntArray489[local467];
						if (local477 > 0) {
							local513 = local477 > 64 ? 64 : local477;
							local593 = super.anIntArrayArray64[local467];
							for (local92 = 0; local92 < local513; local92++) {
								this.method4734(local593[local92]);
							}
						}
						if (local477 > 64) {
							local513 = super.anIntArray489[local467] - 64 - 1;
							local593 = super.anIntArrayArray63[local513];
							for (local92 = 0; local92 < super.anIntArray487[local513]; local92++) {
								this.method4734(local593[local92]);
							}
						}
					}
				} else {
					for (local467 = arg3 - 1; local467 >= 0; local467--) {
						local477 = super.anIntArray489[local467];
						if (local477 > 0) {
							local513 = local477 > 64 ? 64 : local477;
							local593 = super.anIntArrayArray64[local467];
							for (local92 = 0; local92 < local513; local92++) {
								this.method4733(local593[local92]);
							}
						}
						if (local477 > 64) {
							local513 = super.anIntArray489[local467] - 64 - 1;
							local593 = super.anIntArrayArray63[local513];
							for (local92 = 0; local92 < super.anIntArray487[local513]; local92++) {
								this.method4733(local593[local92]);
							}
						}
					}
				}
			} else if (arg1) {
				for (local467 = arg3 - 1; local467 >= 0; local467--) {
					local477 = super.anIntArray489[local467];
					if (local477 > 0) {
						local513 = local477 > 64 ? 64 : local477;
						local593 = super.anIntArrayArray64[local467];
						for (local92 = 0; local92 < local513; local92++) {
							local97 = local593[local92];
							if (local97 < 65536) {
								local113 = super.anIntArray492[local97];
								if (local113 == -1 || !super.aClass28Array3[local113].aBoolean20) {
									this.method4734(local97);
								}
							}
						}
					}
					if (local477 > 64) {
						local513 = super.anIntArray489[local467] - 64 - 1;
						local593 = super.anIntArrayArray63[local513];
						for (local92 = 0; local92 < super.anIntArray487[local513]; local92++) {
							local97 = local593[local92];
							if (local97 < 65536) {
								local113 = super.anIntArray492[local97];
								if (local113 == -1 || !super.aClass28Array3[local113].aBoolean20) {
									this.method4734(local97);
								}
							}
						}
					}
				}
			} else {
				for (local467 = arg3 - 1; local467 >= 0; local467--) {
					local477 = super.anIntArray489[local467];
					@Pc(726) Class28 local726;
					@Pc(780) Class102_Sub1_Sub1 local780;
					@Pc(731) Class273 local731;
					if (local477 > 0) {
						local513 = local477 > 64 ? 64 : local477;
						local593 = super.anIntArrayArray64[local467];
						for (local92 = 0; local92 < local513; local92++) {
							local97 = local593[local92];
							if (local97 < 65536) {
								local113 = super.anIntArray492[local97];
								if (local113 == -1) {
									this.method4733(local593[local92]);
								} else {
									local726 = super.aClass28Array3[local113];
									local731 = super.aClass273Array3[local113];
									if (!local726.aBoolean20) {
										this.method4733(local97);
									}
									super.aClass121_Sub1_14.method3925(local731.anInt7643, local731.anInt7641, local731.anInt7640, local731.anInt7648, local731.anInt7638, local731.anInt7649, local726.aShort6 & 0xFFFF, local731.anInt7646, local726.aByte10, local726.aByte11);
								}
							} else {
								local113 = (local97 >> 16) - 1;
								local780 = super.lb[local113];
								local123 = super.anIntArray484[local113];
								if (local123 == 0) {
									local123 = 1;
								}
								super.aClass121_Sub1_14.method3927(local780, super.anIntArray477[local113], super.anIntArray496[local113], local123, (local780.anInt2520 * super.aClass121_Sub1_14.anInt4513 >> 12) / local123);
							}
						}
					}
					if (local477 > 64) {
						local513 = super.anIntArray489[local467] - 64 - 1;
						local593 = super.anIntArrayArray63[local513];
						for (local92 = 0; local92 < super.anIntArray487[local513]; local92++) {
							local97 = local593[local92];
							if (local97 < 65536) {
								local113 = super.anIntArray492[local97];
								if (local113 == -1) {
									this.method4733(local593[local92]);
								} else {
									local726 = super.aClass28Array3[local113];
									local731 = super.aClass273Array3[local113];
									if (!local726.aBoolean20) {
										this.method4733(local97);
									}
									super.aClass121_Sub1_14.method3925(local731.anInt7643, local731.anInt7641, local731.anInt7640, local731.anInt7648, local731.anInt7638, local731.anInt7649, local726.aShort6 & 0xFFFF, local731.anInt7646, local726.aByte10, local726.aByte11);
								}
							} else {
								local113 = (local97 >> 16) - 1;
								local780 = super.lb[local113];
								local123 = super.anIntArray484[local113];
								if (local123 == 0) {
									local123 = 1;
								}
								super.aClass121_Sub1_14.method3927(local780, super.anIntArray477[local113], super.anIntArray496[local113], local123, (local780.anInt2520 * super.aClass121_Sub1_14.anInt4513 >> 12) / local123);
							}
						}
					}
				}
			}
			return;
		}
		for (local467 = 0; local467 < 12; local467++) {
			super.anIntArray476[local467] = 0;
			super.anIntArray482[local467] = 0;
		}
		@Pc(1143) int[] local1143;
		@Pc(1158) byte local1158;
		if (arg4) {
			for (local477 = arg3 - 1; local477 >= 0; local477--) {
				local513 = super.anIntArray489[local477];
				if (local513 > 0) {
					if (local513 > 64) {
						local87 = 64;
					} else {
						local87 = local513;
					}
					local1143 = super.anIntArrayArray64[local477];
					for (local97 = 0; local97 < local87; local97++) {
						local113 = local1143[local97];
						if (local113 < 65536) {
							local1158 = super.aByteArray62[local113];
							local123 = super.anIntArray476[local1158]++;
							super.anIntArrayArray60[local1158][local123] = local113;
							if (local1158 < 10) {
								super.anIntArray482[local1158] += local477;
							} else if (local1158 == 10) {
								super.anIntArray473[local123] = local477;
							} else {
								super.anIntArray480[local123] = local477;
							}
						} else {
							local1158 = super.lb[(local113 >> 16) - 1].aByte46;
							local123 = super.anIntArray476[local1158]++;
							super.anIntArrayArray60[local1158][local123] = local113;
							if (local1158 < 10) {
								super.anIntArray482[local1158] += local477;
							} else if (local1158 == 10) {
								super.anIntArray473[local123] = local477;
							} else {
								super.anIntArray480[local123] = local477;
							}
						}
					}
				}
				if (local513 > 64) {
					local87 = super.anIntArray489[local477] - 64 - 1;
					local1143 = super.anIntArrayArray63[local87];
					for (local97 = 0; local97 < super.anIntArray487[local87]; local97++) {
						local113 = local1143[local97];
						if (local113 < 65536) {
							local1158 = super.aByteArray62[local113];
							local123 = super.anIntArray476[local1158]++;
							super.anIntArrayArray60[local1158][local123] = local113;
							if (local1158 < 10) {
								super.anIntArray482[local1158] += local477;
							} else if (local1158 == 10) {
								super.anIntArray473[local123] = local477;
							} else {
								super.anIntArray480[local123] = local477;
							}
						} else {
							local1158 = super.lb[(local113 >> 16) - 1].aByte46;
							local123 = super.anIntArray476[local1158]++;
							super.anIntArrayArray60[local1158][local123] = local113;
							if (local1158 < 10) {
								super.anIntArray482[local1158] += local477;
							} else if (local1158 == 10) {
								super.anIntArray473[local123] = local477;
							} else {
								super.anIntArray480[local123] = local477;
							}
						}
					}
				}
			}
		} else {
			for (local477 = arg3 - 1; local477 >= 0; local477--) {
				local513 = super.anIntArray489[local477];
				if (local513 > 0) {
					if (local513 > 64) {
						local87 = 64;
					} else {
						local87 = local513;
					}
					local1143 = super.anIntArrayArray64[local477];
					for (local97 = 0; local97 < local87; local97++) {
						local113 = local1143[local97];
						local1158 = super.aByteArray62[local113];
						local123 = super.anIntArray476[local1158]++;
						super.anIntArrayArray60[local1158][local123] = local113;
						if (local1158 < 10) {
							super.anIntArray482[local1158] += local477;
						} else if (local1158 == 10) {
							super.anIntArray473[local123] = local477;
						} else {
							super.anIntArray480[local123] = local477;
						}
					}
				}
				if (local513 > 64) {
					local87 = super.anIntArray489[local477] - 64 - 1;
					local1143 = super.anIntArrayArray63[local87];
					for (local97 = 0; local97 < super.anIntArray487[local87]; local97++) {
						local113 = local1143[local97];
						local1158 = super.aByteArray62[local113];
						local123 = super.anIntArray476[local1158]++;
						super.anIntArrayArray60[local1158][local123] = local113;
						if (local1158 < 10) {
							super.anIntArray482[local1158] += local477;
						} else if (local1158 == 10) {
							super.anIntArray473[local123] = local477;
						} else {
							super.anIntArray480[local123] = local477;
						}
					}
				}
			}
		}
		local477 = 0;
		if (super.anIntArray476[1] > 0 || super.anIntArray476[2] > 0) {
			local477 = (super.anIntArray482[1] + super.anIntArray482[2]) / (super.anIntArray476[1] + super.anIntArray476[2]);
		}
		local513 = 0;
		if (super.anIntArray476[3] > 0 || super.anIntArray476[4] > 0) {
			local513 = (super.anIntArray482[3] + super.anIntArray482[4]) / (super.anIntArray476[3] + super.anIntArray476[4]);
		}
		local87 = 0;
		if (super.anIntArray476[6] > 0 || super.anIntArray476[8] > 0) {
			local87 = (super.anIntArray482[6] + super.anIntArray482[8]) / (super.anIntArray476[6] + super.anIntArray476[8]);
		}
		local97 = 0;
		local113 = super.anIntArray476[10];
		@Pc(1673) int[] local1673 = super.anIntArrayArray60[10];
		@Pc(1676) int[] local1676 = super.anIntArray473;
		if (local113 == 0) {
			local97 = 0;
			local113 = super.anIntArray476[11];
			local1673 = super.anIntArrayArray60[11];
			local1676 = super.anIntArray480;
		}
		if (local113 > 0) {
			local92 = local1676[0];
		} else {
			local92 = -1000;
		}
		@Pc(1928) Class28 local1928;
		@Pc(1980) Class102_Sub1_Sub1 local1980;
		@Pc(1933) Class273 local1933;
		for (local128 = 0; local128 < 10; local128++) {
			if (arg1) {
				while (local128 == 0 && local92 > local477) {
					local133 = local1673[local97++];
					if (local133 < 65536) {
						local138 = super.anIntArray492[local133];
						if (local138 == -1 || !super.aClass28Array3[local138].aBoolean20) {
							this.method4734(local133);
						}
					}
					if (local97 == local113 && local1673 != super.anIntArrayArray60[11]) {
						local97 = 0;
						local113 = super.anIntArray476[11];
						local1673 = super.anIntArrayArray60[11];
						local1676 = super.anIntArray480;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
				while (local128 == 3 && local92 > local513) {
					local133 = local1673[local97++];
					if (local133 < 65536) {
						local138 = super.anIntArray492[local133];
						if (local138 == -1 || !super.aClass28Array3[local138].aBoolean20) {
							this.method4734(local133);
						}
					}
					if (local97 == local113 && local1673 != super.anIntArrayArray60[11]) {
						local97 = 0;
						local113 = super.anIntArray476[11];
						local1673 = super.anIntArrayArray60[11];
						local1676 = super.anIntArray480;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
				while (local128 == 5 && local92 > local87) {
					local133 = local1673[local97++];
					if (local133 < 65536) {
						local138 = super.anIntArray492[local133];
						if (local138 == -1 || !super.aClass28Array3[local138].aBoolean20) {
							this.method4734(local133);
						}
					}
					if (local97 == local113 && local1673 != super.anIntArrayArray60[11]) {
						local97 = 0;
						local113 = super.anIntArray476[11];
						local1673 = super.anIntArrayArray60[11];
						local1676 = super.anIntArray480;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
			} else {
				while (local128 == 0 && local92 > local477) {
					local133 = local1673[local97++];
					if (local133 < 65536) {
						local138 = super.anIntArray492[local133];
						if (local138 == -1) {
							this.method4733(local133);
						} else {
							local1928 = super.aClass28Array3[local138];
							local1933 = super.aClass273Array3[local138];
							if (!local1928.aBoolean20) {
								this.method4733(local133);
							}
							super.aClass121_Sub1_14.method3925(local1933.anInt7643, local1933.anInt7641, local1933.anInt7640, local1933.anInt7648, local1933.anInt7638, local1933.anInt7649, local1928.aShort6 & 0xFFFF, local1933.anInt7646, local1928.aByte10, local1928.aByte11);
						}
					} else {
						local138 = (local133 >> 16) - 1;
						local1980 = super.lb[local138];
						local148 = super.anIntArray484[local138];
						if (local148 == 0) {
							local148 = 1;
						}
						super.aClass121_Sub1_14.method3927(local1980, super.anIntArray477[local138], super.anIntArray496[local138], local148, (local1980.anInt2520 * super.aClass121_Sub1_14.anInt4513 >> 12) / local148);
					}
					if (local97 == local113 && local1673 != super.anIntArrayArray60[11]) {
						local97 = 0;
						local113 = super.anIntArray476[11];
						local1673 = super.anIntArrayArray60[11];
						local1676 = super.anIntArray480;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
				while (local128 == 3 && local92 > local513) {
					local133 = local1673[local97++];
					if (local133 < 65536) {
						local138 = super.anIntArray492[local133];
						if (local138 == -1) {
							this.method4733(local133);
						} else {
							local1928 = super.aClass28Array3[local138];
							local1933 = super.aClass273Array3[local138];
							if (!local1928.aBoolean20) {
								this.method4733(local133);
							}
							super.aClass121_Sub1_14.method3925(local1933.anInt7643, local1933.anInt7641, local1933.anInt7640, local1933.anInt7648, local1933.anInt7638, local1933.anInt7649, local1928.aShort6 & 0xFFFF, local1933.anInt7646, local1928.aByte10, local1928.aByte11);
						}
					} else {
						local138 = (local133 >> 16) - 1;
						local1980 = super.lb[local138];
						local148 = super.anIntArray484[local138];
						if (local148 == 0) {
							local148 = 1;
						}
						super.aClass121_Sub1_14.method3927(local1980, super.anIntArray477[local138], super.anIntArray496[local138], local148, (local1980.anInt2520 * super.aClass121_Sub1_14.anInt4513 >> 12) / local148);
					}
					if (local97 == local113 && local1673 != super.anIntArrayArray60[11]) {
						local97 = 0;
						local113 = super.anIntArray476[11];
						local1673 = super.anIntArrayArray60[11];
						local1676 = super.anIntArray480;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
				while (local128 == 5 && local92 > local87) {
					local133 = local1673[local97++];
					if (local133 < 65536) {
						local138 = super.anIntArray492[local133];
						if (local138 == -1) {
							this.method4733(local133);
						} else {
							local1928 = super.aClass28Array3[local138];
							local1933 = super.aClass273Array3[local138];
							if (!local1928.aBoolean20) {
								this.method4733(local133);
							}
							super.aClass121_Sub1_14.method3925(local1933.anInt7643, local1933.anInt7641, local1933.anInt7640, local1933.anInt7648, local1933.anInt7638, local1933.anInt7649, local1928.aShort6 & 0xFFFF, local1933.anInt7646, local1928.aByte10, local1928.aByte11);
						}
					} else {
						local138 = (local133 >> 16) - 1;
						local1980 = super.lb[local138];
						local148 = super.anIntArray484[local138];
						if (local148 == 0) {
							local148 = 1;
						}
						super.aClass121_Sub1_14.method3927(local1980, super.anIntArray477[local138], super.anIntArray496[local138], local148, (local1980.anInt2520 * super.aClass121_Sub1_14.anInt4513 >> 12) / local148);
					}
					if (local97 == local113 && local1673 != super.anIntArrayArray60[11]) {
						local97 = 0;
						local113 = super.anIntArray476[11];
						local1673 = super.anIntArrayArray60[11];
						local1676 = super.anIntArray480;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
			}
			local133 = super.anIntArray476[local128];
			@Pc(2353) int[] local2353 = super.anIntArrayArray60[local128];
			if (!arg4 && super.aClass28Array3 == null) {
				if (arg1) {
					for (local143 = 0; local143 < local133; local143++) {
						this.method4734(local2353[local143]);
					}
				} else {
					for (local143 = 0; local143 < local133; local143++) {
						this.method4733(local2353[local143]);
					}
				}
			} else if (arg1) {
				for (local143 = 0; local143 < local133; local143++) {
					local148 = local2353[local143];
					if (local148 < 65536) {
						local153 = super.anIntArray492[local148];
						if (local153 == -1 || !super.aClass28Array3[local153].aBoolean20) {
							this.method4734(local148);
						}
					}
				}
			} else {
				for (local143 = 0; local143 < local133; local143++) {
					local148 = local2353[local143];
					if (local148 < 65536) {
						local153 = super.anIntArray492[local148];
						if (local153 == -1) {
							this.method4733(local148);
						} else {
							@Pc(2415) Class28 local2415 = super.aClass28Array3[local153];
							@Pc(2420) Class273 local2420 = super.aClass273Array3[local153];
							if (!local2415.aBoolean20) {
								this.method4733(local148);
							}
							super.aClass121_Sub1_14.method3925(local2420.anInt7643, local2420.anInt7641, local2420.anInt7640, local2420.anInt7648, local2420.anInt7638, local2420.anInt7649, local2415.aShort6 & 0xFFFF, local2420.anInt7646, local2415.aByte10, local2415.aByte11);
						}
					} else {
						local153 = (local148 >> 16) - 1;
						@Pc(2467) Class102_Sub1_Sub1 local2467 = super.lb[local153];
						local193 = super.anIntArray484[local153];
						if (local193 == 0) {
							local193 = 1;
						}
						super.aClass121_Sub1_14.method3927(local2467, super.anIntArray477[local153], super.anIntArray496[local153], local193, (local2467.anInt2520 * super.aClass121_Sub1_14.anInt4513 >> 12) / local193);
					}
				}
			}
		}
		if (!arg4 && super.aClass28Array3 == null) {
			if (arg1) {
				while (local92 != -1000) {
					this.method4734(local1673[local97++]);
					if (local97 == local113 && local1673 != super.anIntArrayArray60[11]) {
						local97 = 0;
						local1673 = super.anIntArrayArray60[11];
						local113 = super.anIntArray476[11];
						local1676 = super.anIntArray480;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
			} else {
				while (local92 != -1000) {
					this.method4733(local1673[local97++]);
					if (local97 == local113 && local1673 != super.anIntArrayArray60[11]) {
						local97 = 0;
						local1673 = super.anIntArrayArray60[11];
						local113 = super.anIntArray476[11];
						local1676 = super.anIntArray480;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
			}
		} else if (arg1) {
			while (local92 != -1000) {
				local133 = local1673[local97++];
				if (local133 < 65536) {
					local138 = super.anIntArray492[local133];
					if (local138 == -1 || !super.aClass28Array3[local138].aBoolean20) {
						this.method4734(local133);
					}
				}
				if (local97 == local113 && local1673 != super.anIntArrayArray60[11]) {
					local97 = 0;
					local1673 = super.anIntArrayArray60[11];
					local113 = super.anIntArray476[11];
					local1676 = super.anIntArray480;
				}
				if (local97 < local113) {
					local92 = local1676[local97];
				} else {
					local92 = -1000;
				}
			}
		} else {
			while (local92 != -1000) {
				local133 = local1673[local97++];
				if (local133 < 65536) {
					local138 = super.anIntArray492[local133];
					if (local138 == -1) {
						this.method4733(local133);
					} else {
						local1928 = super.aClass28Array3[local138];
						local1933 = super.aClass273Array3[local138];
						if (!local1928.aBoolean20) {
							this.method4733(local133);
						}
						super.aClass121_Sub1_14.method3925(local1933.anInt7643, local1933.anInt7641, local1933.anInt7640, local1933.anInt7648, local1933.anInt7638, local1933.anInt7649, local1928.aShort6 & 0xFFFF, local1933.anInt7646, local1928.aByte10, local1928.aByte11);
					}
				} else {
					local138 = (local133 >> 16) - 1;
					local1980 = super.lb[local138];
					local148 = super.anIntArray484[local138];
					if (local148 == 0) {
						local148 = 1;
					}
					super.aClass121_Sub1_14.method3927(local1980, super.anIntArray477[local138], super.anIntArray496[local138], local148, (local1980.anInt2520 * super.aClass121_Sub1_14.anInt4513 >> 12) / local148);
				}
				if (local97 == local113 && local1673 != super.anIntArrayArray60[11]) {
					local97 = 0;
					local1673 = super.anIntArrayArray60[11];
					local113 = super.anIntArray476[11];
					local1676 = super.anIntArray480;
				}
				if (local97 < local113) {
					local92 = local1676[local97];
				} else {
					local92 = -1000;
				}
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "j", descriptor = "()V")
	@Override
	protected void method4715() {
		this.aClass46_2 = null;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BIZ)Lclient!ba;")
	@Override
	public Class22 method4699(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.method4718(Thread.currentThread());
		@Pc(11) Class22_Sub1 local11;
		@Pc(8) Class22_Sub1 local8;
		if (arg0 == 1) {
			local8 = super.aClass22_Sub1_51;
			local11 = super.aClass22_Sub1_56;
		} else if (arg0 == 2) {
			local8 = super.aClass22_Sub1_52;
			local11 = super.aClass22_Sub1_54;
		} else if (arg0 == 3) {
			local8 = super.aClass22_Sub1_59;
			local11 = super.aClass22_Sub1_55;
		} else if (arg0 == 4) {
			local8 = super.aClass22_Sub1_58;
			local11 = super.aClass22_Sub1_53;
		} else if (arg0 == 5) {
			local8 = super.aClass22_Sub1_60;
			local11 = super.aClass22_Sub1_57;
		} else {
			local11 = local8 = new Class22_Sub1_Sub2(super.aClass121_Sub1_14);
		}
		return this.method4728(local11, local8, arg1, arg0 != 0, arg2);
	}

	@OriginalMember(owner = "client!md", name = "d", descriptor = "(I)V")
	private void method4734(@OriginalArg(0) int arg0) {
		@Pc(8) short local8;
		@Pc(13) short local13;
		@Pc(18) short local18;
		@Pc(27) int local27;
		@Pc(46) int local46;
		@Pc(65) int local65;
		@Pc(81) int local81;
		@Pc(309) int local309;
		@Pc(314) int local314;
		@Pc(319) int local319;
		if (!super.aClass121_Sub1_14.aBoolean279) {
			local8 = super.aShortArray84[arg0];
			local13 = super.aShortArray86[arg0];
			local18 = super.aShortArray88[arg0];
			local27 = super.anIntArray486[local8] - super.aClass121_Sub1_14.anInt4527;
			if (local27 > 255) {
				local27 = 255;
			} else if (local27 < 0) {
				local27 = 0;
			}
			local46 = super.anIntArray486[local13] - super.aClass121_Sub1_14.anInt4527;
			if (local46 > 255) {
				local46 = 255;
			} else if (local46 < 0) {
				local46 = 0;
			}
			local65 = super.anIntArray486[local18] - super.aClass121_Sub1_14.anInt4527;
			if (local65 > 255) {
				local65 = 255;
			} else if (local65 < 0) {
				local65 = 0;
			}
			local81 = local27 + local46 + local65;
			if (local81 != 765) {
				if (local81 == 0) {
					this.method4733(arg0);
				} else {
					if (super.aByteArray63 == null) {
						this.aClass46_2.anInt927 = 0;
					} else {
						this.aClass46_2.anInt927 = super.aByteArray63[arg0] & 0xFF;
					}
					this.aClass46_2.aBoolean47 = super.aBooleanArray30[arg0];
					if (super.aShortArray85 != null && super.aShortArray85[arg0] != -1) {
						if (super.aByteArray64 == null || super.aByteArray64[arg0] == -1) {
							local309 = local8;
							local314 = local13;
							local319 = local18;
						} else {
							@Pc(304) int local304 = super.aByteArray64[arg0] & 0xFF;
							local309 = super.anIntArray481[local304];
							local314 = super.anIntArray490[local304];
							local319 = super.anIntArray478[local304];
						}
						if (super.anIntArray498[arg0] == -1) {
							this.aClass46_2.method736(super.anIntArray507[local8], super.anIntArray507[local13], super.anIntArray507[local18], super.anIntArray495[local8], super.anIntArray495[local13], super.anIntArray495[local18], super.aClass121_Sub1_14.anInt4509, local27, local46, local65, super.anIntArray493[arg0], super.anIntArray493[arg0], super.anIntArray493[arg0], super.anIntArray483[local309], super.anIntArray483[local314], super.anIntArray483[local319], super.anIntArray488[local309], super.anIntArray488[local314], super.anIntArray488[local319], super.anIntArray497[local309], super.anIntArray497[local314], super.anIntArray497[local319], super.aShortArray85[arg0]);
						} else {
							this.aClass46_2.method736(super.anIntArray507[local8], super.anIntArray507[local13], super.anIntArray507[local18], super.anIntArray495[local8], super.anIntArray495[local13], super.anIntArray495[local18], super.aClass121_Sub1_14.anInt4509, local27, local46, local65, super.anIntArray493[arg0], super.anIntArray501[arg0], super.anIntArray498[arg0], super.anIntArray483[local309], super.anIntArray483[local314], super.anIntArray483[local319], super.anIntArray488[local309], super.anIntArray488[local314], super.anIntArray488[local319], super.anIntArray497[local309], super.anIntArray497[local314], super.anIntArray497[local319], super.aShortArray85[arg0]);
						}
					} else if (super.anIntArray498[arg0] == -1) {
						this.aClass46_2.method733(super.anIntArray507[local8], super.anIntArray507[local13], super.anIntArray507[local18], super.anIntArray495[local8], super.anIntArray495[local13], super.anIntArray495[local18], Static462.method6488(local27 << 24 | super.aClass121_Sub1_14.anInt4509, Static6.anIntArray272[super.anIntArray493[arg0] & 0xFFFF]), Static462.method6488(local46 << 24 | super.aClass121_Sub1_14.anInt4509, Static6.anIntArray272[super.anIntArray493[arg0] & 0xFFFF]), Static462.method6488(local65 << 24 | super.aClass121_Sub1_14.anInt4509, Static6.anIntArray272[super.anIntArray493[arg0] & 0xFFFF]));
					} else {
						this.aClass46_2.method733(super.anIntArray507[local8], super.anIntArray507[local13], super.anIntArray507[local18], super.anIntArray495[local8], super.anIntArray495[local13], super.anIntArray495[local18], Static462.method6488(local27 << 24 | super.aClass121_Sub1_14.anInt4509, Static6.anIntArray272[super.anIntArray493[arg0] & 0xFFFF]), Static462.method6488(local46 << 24 | super.aClass121_Sub1_14.anInt4509, Static6.anIntArray272[super.anIntArray501[arg0] & 0xFFFF]), Static462.method6488(local65 << 24 | super.aClass121_Sub1_14.anInt4509, Static6.anIntArray272[super.anIntArray498[arg0] & 0xFFFF]));
					}
				}
			}
		} else if (!super.aBooleanArray29[arg0]) {
			local8 = super.aShortArray84[arg0];
			local13 = super.aShortArray86[arg0];
			local18 = super.aShortArray88[arg0];
			local27 = 0;
			local46 = 0;
			local65 = 0;
			if (super.anIntArray499[local8] > super.aClass121_Sub1_14.anInt4522) {
				local27 = 255;
			} else if (super.anIntArray499[local8] > super.aClass121_Sub1_14.anInt4524) {
				local27 = (super.aClass121_Sub1_14.anInt4524 - super.anIntArray499[local8]) * 255 / (super.aClass121_Sub1_14.anInt4524 - super.aClass121_Sub1_14.anInt4522);
			}
			if (super.anIntArray499[local13] > super.aClass121_Sub1_14.anInt4522) {
				local46 = 255;
			} else if (super.anIntArray499[local13] > super.aClass121_Sub1_14.anInt4524) {
				local46 = (super.aClass121_Sub1_14.anInt4524 - super.anIntArray499[local13]) * 255 / (super.aClass121_Sub1_14.anInt4524 - super.aClass121_Sub1_14.anInt4522);
			}
			if (super.anIntArray499[local18] > super.aClass121_Sub1_14.anInt4522) {
				local65 = 255;
			} else if (super.anIntArray499[local18] > super.aClass121_Sub1_14.anInt4524) {
				local65 = (super.aClass121_Sub1_14.anInt4524 - super.anIntArray499[local18]) * 255 / (super.aClass121_Sub1_14.anInt4524 - super.aClass121_Sub1_14.anInt4522);
			}
			if (super.aByteArray63 == null) {
				this.aClass46_2.anInt927 = 0;
			} else {
				this.aClass46_2.anInt927 = super.aByteArray63[arg0] & 0xFF;
			}
			this.aClass46_2.aBoolean47 = super.aBooleanArray30[arg0];
			if (super.aShortArray85 != null && super.aShortArray85[arg0] != -1) {
				if (super.aByteArray64 == null || super.aByteArray64[arg0] == -1) {
					local81 = local8;
					local309 = local13;
					local314 = local18;
				} else {
					local319 = super.aByteArray64[arg0] & 0xFF;
					local81 = super.anIntArray481[local319];
					local309 = super.anIntArray490[local319];
					local314 = super.anIntArray478[local319];
				}
				if (super.anIntArray498[arg0] == -1) {
					this.aClass46_2.method736(super.anIntArray507[local8], super.anIntArray507[local13], super.anIntArray507[local18], super.anIntArray495[local8], super.anIntArray495[local13], super.anIntArray495[local18], super.aClass121_Sub1_14.anInt4509, local27, local46, local65, super.anIntArray493[arg0], super.anIntArray493[arg0], super.anIntArray493[arg0], super.anIntArray483[local81], super.anIntArray483[local309], super.anIntArray483[local314], super.anIntArray488[local81], super.anIntArray488[local309], super.anIntArray488[local314], super.anIntArray497[local81], super.anIntArray497[local309], super.anIntArray497[local314], super.aShortArray85[arg0]);
				} else {
					this.aClass46_2.method736(super.anIntArray507[local8], super.anIntArray507[local13], super.anIntArray507[local18], super.anIntArray495[local8], super.anIntArray495[local13], super.anIntArray495[local18], super.aClass121_Sub1_14.anInt4509, local27, local46, local65, super.anIntArray493[arg0], super.anIntArray501[arg0], super.anIntArray498[arg0], super.anIntArray483[local81], super.anIntArray483[local309], super.anIntArray483[local314], super.anIntArray488[local81], super.anIntArray488[local309], super.anIntArray488[local314], super.anIntArray497[local81], super.anIntArray497[local309], super.anIntArray497[local314], super.aShortArray85[arg0]);
				}
			} else if (super.anIntArray498[arg0] == -1) {
				this.aClass46_2.method733(super.anIntArray507[local8], super.anIntArray507[local13], super.anIntArray507[local18], super.anIntArray495[local8], super.anIntArray495[local13], super.anIntArray495[local18], Static462.method6488(local27 << 24 | super.aClass121_Sub1_14.anInt4509, Static6.anIntArray272[super.anIntArray493[arg0] & 0xFFFF]), Static462.method6488(local46 << 24 | super.aClass121_Sub1_14.anInt4509, Static6.anIntArray272[super.anIntArray493[arg0] & 0xFFFF]), Static462.method6488(local65 << 24 | super.aClass121_Sub1_14.anInt4509, Static6.anIntArray272[super.anIntArray493[arg0] & 0xFFFF]));
			} else {
				this.aClass46_2.method733(super.anIntArray507[local8], super.anIntArray507[local13], super.anIntArray507[local18], super.anIntArray495[local8], super.anIntArray495[local13], super.anIntArray495[local18], Static462.method6488(local27 << 24 | super.aClass121_Sub1_14.anInt4509, Static6.anIntArray272[super.anIntArray493[arg0] & 0xFFFF]), Static462.method6488(local46 << 24 | super.aClass121_Sub1_14.anInt4509, Static6.anIntArray272[super.anIntArray501[arg0] & 0xFFFF]), Static462.method6488(local65 << 24 | super.aClass121_Sub1_14.anInt4509, Static6.anIntArray272[super.anIntArray498[arg0] & 0xFFFF]));
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(Ljava/lang/Thread;)V")
	@Override
	protected void method4729(@OriginalArg(0) Thread arg0) {
		super.method4729(arg0);
		@Pc(8) Class77_Sub2 local8 = (Class77_Sub2) super.aClass121_Sub1_14.method3922(arg0);
		this.aClass46_2 = local8.aClass46_1;
		super.anIntArray505 = local8.anIntArray373;
		super.anIntArray489 = local8.anIntArray374;
		super.anIntArrayArray64 = local8.anIntArrayArray41;
		super.anIntArray487 = local8.anIntArray378;
		super.anIntArrayArray63 = local8.anIntArrayArray40;
		super.anIntArray476 = local8.anIntArray372;
		super.anIntArrayArray60 = local8.anIntArrayArray42;
		super.anIntArray473 = local8.anIntArray377;
		super.anIntArray480 = local8.anIntArray376;
		super.anIntArray482 = local8.anIntArray375;
	}

	@OriginalMember(owner = "client!md", name = "e", descriptor = "(I)V")
	private void method4735(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = super.aClass121_Sub1_14.anInt4511;
		@Pc(10) short local10 = super.aShortArray84[arg0];
		@Pc(15) short local15 = super.aShortArray86[arg0];
		@Pc(20) short local20 = super.aShortArray88[arg0];
		@Pc(25) int local25 = super.anIntArray497[local10];
		@Pc(30) int local30 = super.anIntArray497[local15];
		@Pc(35) int local35 = super.anIntArray497[local20];
		if (super.aByteArray63 == null) {
			this.aClass46_2.anInt927 = 0;
		} else {
			this.aClass46_2.anInt927 = super.aByteArray63[arg0] & 0xFF;
		}
		@Pc(88) int local88;
		@Pc(93) int local93;
		@Pc(100) int local100;
		@Pc(113) int local113;
		if (local25 >= local5) {
			super.anIntArray475[0] = super.anIntArray495[local10];
			super.anIntArray500[0] = super.anIntArray507[local10];
			local1++;
			super.anIntArray485[0] = super.anIntArray493[arg0] & 0xFFFF;
		} else {
			local88 = super.anIntArray483[local10];
			local93 = super.anIntArray488[local10];
			local100 = super.anIntArray493[arg0] & 0xFFFF;
			if (local35 >= local5) {
				local113 = (local5 - local25) * Class22_Sub1.anIntArray508[local35 - local25];
				super.anIntArray475[0] = super.aClass77_6.anInt3164 + (local88 + ((super.anIntArray483[local20] - local88) * local113 >> 16)) * super.aClass121_Sub1_14.anInt4513 / local5;
				super.anIntArray500[0] = super.aClass77_6.anInt3162 + (local93 + ((super.anIntArray488[local20] - local93) * local113 >> 16)) * super.aClass121_Sub1_14.anInt4526 / local5;
				local1++;
				super.anIntArray485[0] = local100 + (((super.anIntArray498[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local30 >= local5) {
				local113 = (local5 - local25) * Class22_Sub1.anIntArray508[local30 - local25];
				super.anIntArray475[local1] = super.aClass77_6.anInt3164 + (local88 + ((super.anIntArray483[local15] - local88) * local113 >> 16)) * super.aClass121_Sub1_14.anInt4513 / local5;
				super.anIntArray500[local1] = super.aClass77_6.anInt3162 + (local93 + ((super.anIntArray488[local15] - local93) * local113 >> 16)) * super.aClass121_Sub1_14.anInt4526 / local5;
				super.anIntArray485[local1++] = local100 + (((super.anIntArray501[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		if (local30 >= local5) {
			super.anIntArray475[local1] = super.anIntArray495[local15];
			super.anIntArray500[local1] = super.anIntArray507[local15];
			super.anIntArray485[local1++] = super.anIntArray501[arg0] & 0xFFFF;
		} else {
			local88 = super.anIntArray483[local15];
			local93 = super.anIntArray488[local15];
			local100 = super.anIntArray501[arg0] & 0xFFFF;
			if (local25 >= local5) {
				local113 = (local5 - local30) * Class22_Sub1.anIntArray508[local25 - local30];
				super.anIntArray475[local1] = super.aClass77_6.anInt3164 + (local88 + ((super.anIntArray483[local10] - local88) * local113 >> 16)) * super.aClass121_Sub1_14.anInt4513 / local5;
				super.anIntArray500[local1] = super.aClass77_6.anInt3162 + (local93 + ((super.anIntArray488[local10] - local93) * local113 >> 16)) * super.aClass121_Sub1_14.anInt4526 / local5;
				super.anIntArray485[local1++] = local100 + (((super.anIntArray493[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local35 >= local5) {
				local113 = (local5 - local30) * Class22_Sub1.anIntArray508[local35 - local30];
				super.anIntArray475[local1] = super.aClass77_6.anInt3164 + (local88 + ((super.anIntArray483[local20] - local88) * local113 >> 16)) * super.aClass121_Sub1_14.anInt4513 / local5;
				super.anIntArray500[local1] = super.aClass77_6.anInt3162 + (local93 + ((super.anIntArray488[local20] - local93) * local113 >> 16)) * super.aClass121_Sub1_14.anInt4526 / local5;
				super.anIntArray485[local1++] = local100 + (((super.anIntArray498[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		if (local35 >= local5) {
			super.anIntArray475[local1] = super.anIntArray495[local20];
			super.anIntArray500[local1] = super.anIntArray507[local20];
			super.anIntArray485[local1++] = super.anIntArray498[arg0] & 0xFFFF;
		} else {
			local88 = super.anIntArray483[local20];
			local93 = super.anIntArray488[local20];
			local100 = super.anIntArray498[arg0] & 0xFFFF;
			if (local30 >= local5) {
				local113 = (local5 - local35) * Class22_Sub1.anIntArray508[local30 - local35];
				super.anIntArray475[local1] = super.aClass77_6.anInt3164 + (local88 + ((super.anIntArray483[local15] - local88) * local113 >> 16)) * super.aClass121_Sub1_14.anInt4513 / local5;
				super.anIntArray500[local1] = super.aClass77_6.anInt3162 + (local93 + ((super.anIntArray488[local15] - local93) * local113 >> 16)) * super.aClass121_Sub1_14.anInt4526 / local5;
				super.anIntArray485[local1++] = local100 + (((super.anIntArray501[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local25 >= local5) {
				local113 = (local5 - local35) * Class22_Sub1.anIntArray508[local25 - local35];
				super.anIntArray475[local1] = super.aClass77_6.anInt3164 + (local88 + ((super.anIntArray483[local10] - local88) * local113 >> 16)) * super.aClass121_Sub1_14.anInt4513 / local5;
				super.anIntArray500[local1] = super.aClass77_6.anInt3162 + (local93 + ((super.anIntArray488[local10] - local93) * local113 >> 16)) * super.aClass121_Sub1_14.anInt4526 / local5;
				super.anIntArray485[local1++] = local100 + (((super.anIntArray493[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		local88 = super.anIntArray475[0];
		local93 = super.anIntArray475[1];
		local100 = super.anIntArray475[2];
		local113 = super.anIntArray500[0];
		@Pc(725) int local725 = super.anIntArray500[1];
		@Pc(730) int local730 = super.anIntArray500[2];
		this.aClass46_2.aBoolean47 = false;
		@Pc(838) int local838;
		@Pc(843) int local843;
		@Pc(848) int local848;
		@Pc(833) int local833;
		if (local1 == 3) {
			if (local88 < 0 || local93 < 0 || local100 < 0 || local88 > super.aClass77_6.anInt3163 || local93 > super.aClass77_6.anInt3163 || local100 > super.aClass77_6.anInt3163) {
				this.aClass46_2.aBoolean47 = true;
			}
			if (super.aShortArray85 != null && super.aShortArray85[arg0] != -1) {
				if (super.aByteArray64 == null || super.aByteArray64[arg0] == -1) {
					local838 = local10;
					local843 = local15;
					local848 = local20;
				} else {
					local833 = super.aByteArray64[arg0] & 0xFF;
					local838 = super.anIntArray481[local833];
					local843 = super.anIntArray490[local833];
					local848 = super.anIntArray478[local833];
				}
				if (super.anIntArray498[arg0] == -1) {
					this.aClass46_2.method730(local113, local725, local730, local88, local93, local100, super.anIntArray493[arg0], super.anIntArray493[arg0], super.anIntArray493[arg0], super.anIntArray483[local838], super.anIntArray483[local843], super.anIntArray483[local848], super.anIntArray488[local838], super.anIntArray488[local843], super.anIntArray488[local848], super.anIntArray497[local838], super.anIntArray497[local843], super.anIntArray497[local848], super.aShortArray85[arg0]);
				} else {
					this.aClass46_2.method730(local113, local725, local730, local88, local93, local100, super.anIntArray485[0], super.anIntArray485[1], super.anIntArray485[2], super.anIntArray483[local838], super.anIntArray483[local843], super.anIntArray483[local848], super.anIntArray488[local838], super.anIntArray488[local843], super.anIntArray488[local848], super.anIntArray497[local838], super.anIntArray497[local843], super.anIntArray497[local848], super.aShortArray85[arg0]);
				}
			} else if (super.anIntArray498[arg0] == -1) {
				this.aClass46_2.method740(local113, local725, local730, local88, local93, local100, Static6.anIntArray272[super.anIntArray493[arg0] & 0xFFFF]);
			} else {
				this.aClass46_2.method735(local113, local725, local730, local88, local93, local100, super.anIntArray485[0], super.anIntArray485[1], super.anIntArray485[2]);
			}
		}
		if (local1 != 4) {
			return;
		}
		if (local88 < 0 || local93 < 0 || local100 < 0 || local88 > super.aClass77_6.anInt3163 || local93 > super.aClass77_6.anInt3163 || local100 > super.aClass77_6.anInt3163 || super.anIntArray475[3] < 0 || super.anIntArray475[3] > super.aClass77_6.anInt3163) {
			this.aClass46_2.aBoolean47 = true;
		}
		if (super.aShortArray85 == null || super.aShortArray85[arg0] == -1) {
			if (super.anIntArray498[arg0] == -1) {
				local838 = Static6.anIntArray272[super.anIntArray493[arg0] & 0xFFFF];
				this.aClass46_2.method740(local113, local725, local730, local88, local93, local100, local838);
				this.aClass46_2.method740(local113, local730, super.anIntArray500[3], local88, local100, super.anIntArray475[3], local838);
				return;
			}
			this.aClass46_2.method735(local113, local725, local730, local88, local93, local100, super.anIntArray485[0], super.anIntArray485[1], super.anIntArray485[2]);
			this.aClass46_2.method735(local113, local730, super.anIntArray500[3], local88, local100, super.anIntArray475[3], super.anIntArray485[0], super.anIntArray485[2], super.anIntArray485[3]);
			return;
		}
		if (super.aByteArray64 == null || super.aByteArray64[arg0] == -1) {
			local838 = local10;
			local843 = local15;
			local848 = local20;
		} else {
			local833 = super.aByteArray64[arg0] & 0xFF;
			local838 = super.anIntArray481[local833];
			local843 = super.anIntArray490[local833];
			local848 = super.anIntArray478[local833];
		}
		@Pc(1168) short local1168 = super.aShortArray85[arg0];
		if (super.anIntArray498[arg0] == -1) {
			this.aClass46_2.method730(local113, local725, local730, local88, local93, local100, super.anIntArray493[arg0], super.anIntArray493[arg0], super.anIntArray493[arg0], super.anIntArray483[local838], super.anIntArray483[local843], super.anIntArray483[local848], super.anIntArray488[local838], super.anIntArray488[local843], super.anIntArray488[local848], super.anIntArray497[local838], super.anIntArray497[local843], super.anIntArray497[local848], local1168);
			this.aClass46_2.method730(local113, local730, super.anIntArray500[3], local88, local100, super.anIntArray475[3], super.anIntArray493[arg0], super.anIntArray493[arg0], super.anIntArray493[arg0], super.anIntArray483[local838], super.anIntArray483[local843], super.anIntArray483[local848], super.anIntArray488[local838], super.anIntArray488[local843], super.anIntArray488[local848], super.anIntArray497[local838], super.anIntArray497[local843], super.anIntArray497[local848], local1168);
			return;
		}
		this.aClass46_2.method730(local113, local725, local730, local88, local93, local100, super.anIntArray485[0], super.anIntArray485[1], super.anIntArray485[2], super.anIntArray483[local838], super.anIntArray483[local843], super.anIntArray483[local848], super.anIntArray488[local838], super.anIntArray488[local843], super.anIntArray488[local848], super.anIntArray497[local838], super.anIntArray497[local843], super.anIntArray497[local848], local1168);
		this.aClass46_2.method730(local113, local730, super.anIntArray500[3], local88, local100, super.anIntArray475[3], super.anIntArray485[0], super.anIntArray485[2], super.anIntArray485[3], super.anIntArray483[local838], super.anIntArray483[local843], super.anIntArray483[local848], super.anIntArray488[local838], super.anIntArray488[local843], super.anIntArray488[local848], super.anIntArray497[local838], super.anIntArray497[local843], super.anIntArray497[local848], local1168);
	}
}
