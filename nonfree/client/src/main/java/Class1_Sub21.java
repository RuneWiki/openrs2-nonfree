import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class1_Sub21 extends Class1 {

	@OriginalMember(owner = "client!of", name = "t", descriptor = "Lclient!wd;")
	public Class97 aClass97_14;

	@OriginalMember(owner = "client!of", name = "s", descriptor = "[B")
	public final byte[] aByteArray42;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lclient!ka;)V")
	public Class1_Sub21(@OriginalArg(0) Class1_Sub14 arg0) {
		arg0.anInt4061 = arg0.aByteArray49.length - 3;
		@Pc(12) int local12 = arg0.method3010();
		@Pc(16) int local16 = arg0.method3023();
		@Pc(22) int local22 = local12 * 10 + 14;
		arg0.anInt4061 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(46) int local46;
		@Pc(50) int local50;
		for (@Pc(43) int local43 = 0; local43 < local12; local43++) {
			local46 = -1;
			while (true) {
				local50 = arg0.method3010();
				if (local50 != local46) {
					local22++;
				}
				local46 = local50 & 0xF;
				if (local50 == 7) {
					break;
				}
				if (local50 == 23) {
					local27++;
				} else if (local46 == 0) {
					local31++;
				} else if (local46 == 1) {
					local33++;
				} else if (local46 == 2) {
					local29++;
				} else if (local46 == 3) {
					local35++;
				} else if (local46 == 4) {
					local37++;
				} else if (local46 == 5) {
					local39++;
				} else if (local46 == 6) {
					local41++;
				} else {
					throw new RuntimeException();
				}
			}
		}
		local22 += local27 * 5;
		local22 += (local31 + local33 + local29 + local35 + local39) * 2;
		local22 += local37 + local41;
		local46 = arg0.anInt4061;
		local50 = local12 + local27 + local29 + local31 + local33 + local35 + local37 + local39 + local41;
		for (@Pc(157) int local157 = 0; local157 < local50; local157++) {
			arg0.method3012();
		}
		local22 += arg0.anInt4061 - local46;
		@Pc(176) int local176 = arg0.anInt4061;
		@Pc(178) int local178 = 0;
		@Pc(180) int local180 = 0;
		@Pc(182) int local182 = 0;
		@Pc(184) int local184 = 0;
		@Pc(186) int local186 = 0;
		@Pc(188) int local188 = 0;
		@Pc(190) int local190 = 0;
		@Pc(192) int local192 = 0;
		@Pc(194) int local194 = 0;
		@Pc(196) int local196 = 0;
		@Pc(198) int local198 = 0;
		@Pc(200) int local200 = 0;
		@Pc(202) int local202 = 0;
		for (@Pc(204) int local204 = 0; local204 < local29; local204++) {
			local202 = local202 + arg0.method3010() & 0x7F;
			if (local202 == 0 || local202 == 32) {
				local41++;
			} else if (local202 == 1) {
				local178++;
			} else if (local202 == 33) {
				local180++;
			} else if (local202 == 7) {
				local182++;
			} else if (local202 == 39) {
				local184++;
			} else if (local202 == 10) {
				local186++;
			} else if (local202 == 42) {
				local188++;
			} else if (local202 == 99) {
				local190++;
			} else if (local202 == 98) {
				local192++;
			} else if (local202 == 101) {
				local194++;
			} else if (local202 == 100) {
				local196++;
			} else if (local202 == 64 || local202 == 65 || local202 == 120 || local202 == 121 || local202 == 123) {
				local198++;
			} else {
				local200++;
			}
		}
		@Pc(294) int local294 = 0;
		@Pc(297) int local297 = arg0.anInt4061;
		arg0.anInt4061 += local198;
		@Pc(306) int local306 = arg0.anInt4061;
		arg0.anInt4061 += local39;
		@Pc(315) int local315 = arg0.anInt4061;
		arg0.anInt4061 += local37;
		@Pc(324) int local324 = arg0.anInt4061;
		arg0.anInt4061 += local35;
		@Pc(333) int local333 = arg0.anInt4061;
		arg0.anInt4061 += local178;
		@Pc(342) int local342 = arg0.anInt4061;
		arg0.anInt4061 += local182;
		@Pc(351) int local351 = arg0.anInt4061;
		arg0.anInt4061 += local186;
		@Pc(360) int local360 = arg0.anInt4061;
		arg0.anInt4061 += local31 + local33 + local39;
		@Pc(373) int local373 = arg0.anInt4061;
		arg0.anInt4061 += local31;
		@Pc(382) int local382 = arg0.anInt4061;
		arg0.anInt4061 += local200;
		@Pc(391) int local391 = arg0.anInt4061;
		arg0.anInt4061 += local33;
		@Pc(400) int local400 = arg0.anInt4061;
		arg0.anInt4061 += local180;
		@Pc(409) int local409 = arg0.anInt4061;
		arg0.anInt4061 += local184;
		@Pc(418) int local418 = arg0.anInt4061;
		arg0.anInt4061 += local188;
		@Pc(427) int local427 = arg0.anInt4061;
		arg0.anInt4061 += local41;
		@Pc(436) int local436 = arg0.anInt4061;
		arg0.anInt4061 += local35;
		@Pc(445) int local445 = arg0.anInt4061;
		arg0.anInt4061 += local190;
		@Pc(454) int local454 = arg0.anInt4061;
		arg0.anInt4061 += local192;
		@Pc(463) int local463 = arg0.anInt4061;
		arg0.anInt4061 += local194;
		@Pc(472) int local472 = arg0.anInt4061;
		arg0.anInt4061 += local196;
		@Pc(481) int local481 = arg0.anInt4061;
		arg0.anInt4061 += local27 * 3;
		this.aByteArray42 = new byte[local22];
		@Pc(499) Class1_Sub14 local499 = new Class1_Sub14(this.aByteArray42);
		local499.method3032(1297377380);
		local499.method3032(6);
		local499.method3020(local12 > 1 ? 1 : 0);
		local499.method3020(local12);
		local499.method3020(local16);
		arg0.anInt4061 = local46;
		@Pc(529) int local529 = 0;
		@Pc(531) int local531 = 0;
		@Pc(533) int local533 = 0;
		@Pc(535) int local535 = 0;
		@Pc(537) int local537 = 0;
		@Pc(539) int local539 = 0;
		@Pc(541) int local541 = 0;
		@Pc(544) int[] local544 = new int[128];
		local202 = 0;
		label220: for (@Pc(548) int local548 = 0; local548 < local12; local548++) {
			local499.method3032(1297379947);
			local499.anInt4061 += 4;
			@Pc(562) int local562 = local499.anInt4061;
			@Pc(564) int local564 = -1;
			while (true) {
				while (true) {
					@Pc(568) int local568 = arg0.method3012();
					local499.method3030(local568);
					@Pc(580) int local580 = arg0.aByteArray49[local294++] & 0xFF;
					@Pc(587) boolean local587 = local580 != local564;
					local564 = local580 & 0xF;
					if (local580 == 7) {
						if (local587) {
							local499.method3024(255);
						}
						local499.method3024(47);
						local499.method3024(0);
						local499.method3060(local499.anInt4061 - local562);
						continue label220;
					}
					if (local580 == 23) {
						if (local587) {
							local499.method3024(255);
						}
						local499.method3024(81);
						local499.method3024(3);
						local499.method3024(arg0.aByteArray49[local481++]);
						local499.method3024(arg0.aByteArray49[local481++]);
						local499.method3024(arg0.aByteArray49[local481++]);
					} else {
						local529 ^= local580 >> 4;
						if (local564 == 0) {
							if (local587) {
								local499.method3024(local529 + 144);
							}
							local531 += arg0.aByteArray49[local360++];
							local533 += arg0.aByteArray49[local373++];
							local499.method3024(local531 & 0x7F);
							local499.method3024(local533 & 0x7F);
						} else if (local564 == 1) {
							if (local587) {
								local499.method3024(local529 + 128);
							}
							local531 += arg0.aByteArray49[local360++];
							local535 += arg0.aByteArray49[local391++];
							local499.method3024(local531 & 0x7F);
							local499.method3024(local535 & 0x7F);
						} else if (local564 == 2) {
							if (local587) {
								local499.method3024(local529 + 176);
							}
							local202 = local202 + arg0.aByteArray49[local176++] & 0x7F;
							local499.method3024(local202);
							@Pc(772) byte local772;
							if (local202 == 0 || local202 == 32) {
								local772 = arg0.aByteArray49[local427++];
							} else if (local202 == 1) {
								local772 = arg0.aByteArray49[local333++];
							} else if (local202 == 33) {
								local772 = arg0.aByteArray49[local400++];
							} else if (local202 == 7) {
								local772 = arg0.aByteArray49[local342++];
							} else if (local202 == 39) {
								local772 = arg0.aByteArray49[local409++];
							} else if (local202 == 10) {
								local772 = arg0.aByteArray49[local351++];
							} else if (local202 == 42) {
								local772 = arg0.aByteArray49[local418++];
							} else if (local202 == 99) {
								local772 = arg0.aByteArray49[local445++];
							} else if (local202 == 98) {
								local772 = arg0.aByteArray49[local454++];
							} else if (local202 == 101) {
								local772 = arg0.aByteArray49[local463++];
							} else if (local202 == 100) {
								local772 = arg0.aByteArray49[local472++];
							} else if (local202 == 64 || local202 == 65 || local202 == 120 || local202 == 121 || local202 == 123) {
								local772 = arg0.aByteArray49[local297++];
							} else {
								local772 = arg0.aByteArray49[local382++];
							}
							@Pc(907) int local907 = local772 + local544[local202];
							local544[local202] = local907;
							local499.method3024(local907 & 0x7F);
						} else if (local564 == 3) {
							if (local587) {
								local499.method3024(local529 + 224);
							}
							local537 += arg0.aByteArray49[local436++];
							local537 += arg0.aByteArray49[local324++] << 7;
							local499.method3024(local537 & 0x7F);
							local499.method3024(local537 >> 7 & 0x7F);
						} else if (local564 == 4) {
							if (local587) {
								local499.method3024(local529 + 208);
							}
							local539 += arg0.aByteArray49[local315++];
							local499.method3024(local539 & 0x7F);
						} else if (local564 == 5) {
							if (local587) {
								local499.method3024(local529 + 160);
							}
							local531 += arg0.aByteArray49[local360++];
							local541 += arg0.aByteArray49[local306++];
							local499.method3024(local531 & 0x7F);
							local499.method3024(local541 & 0x7F);
						} else if (local564 == 6) {
							if (local587) {
								local499.method3024(local529 + 192);
							}
							local499.method3024(arg0.aByteArray49[local427++]);
						} else {
							throw new RuntimeException();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "()V")
	public void method2089() {
		if (this.aClass97_14 != null) {
			return;
		}
		this.aClass97_14 = new Class97(16);
		@Pc(12) int[] local12 = new int[16];
		@Pc(15) int[] local15 = new int[16];
		local12[9] = local15[9] = 128;
		@Pc(29) Class12 local29 = new Class12(this.aByteArray42);
		@Pc(32) int local32 = local29.method233();
		for (@Pc(34) int local34 = 0; local34 < local32; local34++) {
			local29.method234(local34);
			local29.method238(local34);
			local29.method246(local34);
		}
		label53: do {
			while (true) {
				@Pc(51) int local51 = local29.method239();
				@Pc(56) int local56 = local29.anIntArray36[local51];
				while (local29.anIntArray36[local51] == local56) {
					local29.method234(local51);
					@Pc(64) int local64 = local29.method247(local51);
					if (local64 == 1) {
						local29.method235();
						local29.method246(local51);
						continue label53;
					}
					@Pc(80) int local80 = local64 & 0xF0;
					@Pc(87) int local87;
					@Pc(93) int local93;
					@Pc(99) int local99;
					if (local80 == 176) {
						local87 = local64 & 0xF;
						local93 = local64 >> 8 & 0x7F;
						local99 = local64 >> 16 & 0x7F;
						if (local93 == 0) {
							local12[local87] = (local12[local87] & 0xFFE03FFF) + (local99 << 14);
						}
						if (local93 == 32) {
							local12[local87] = (local12[local87] & 0xFFFFC07F) + (local99 << 7);
						}
					}
					if (local80 == 192) {
						local87 = local64 & 0xF;
						local93 = local64 >> 8 & 0x7F;
						local15[local87] = local12[local87] + local93;
					}
					if (local80 == 144) {
						local87 = local64 & 0xF;
						local93 = local64 >> 8 & 0x7F;
						local99 = local64 >> 16 & 0x7F;
						if (local99 > 0) {
							@Pc(174) int local174 = local15[local87];
							@Pc(182) Class1_Sub9 local182 = (Class1_Sub9) this.aClass97_14.method3375((long) local174);
							if (local182 == null) {
								local182 = new Class1_Sub9(new byte[128]);
								this.aClass97_14.method3374(local182, (long) local174);
							}
							local182.aByteArray5[local93] = 1;
						}
					}
					local29.method238(local51);
					local29.method246(local51);
				}
			}
		} while (!local29.method248());
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "()V")
	public void method2090() {
		this.aClass97_14 = null;
	}
}
