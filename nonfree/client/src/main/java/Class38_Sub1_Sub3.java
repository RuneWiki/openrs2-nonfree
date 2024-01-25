import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class38_Sub1_Sub3 extends Class38_Sub1 {

	@OriginalMember(owner = "client!rc", name = "H", descriptor = "[B")
	private final byte[] aByteArray70;

	@OriginalMember(owner = "client!rc", name = "I", descriptor = "[I")
	private final int[] anIntArray490;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lclient!st;[B[III)V")
	public Class38_Sub1_Sub3(@OriginalArg(0) Class162_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg3, arg4);
		this.aByteArray70 = arg1;
		this.anIntArray490 = arg2;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "([I[III)V")
	@Override
	protected void method5927(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int[] local3 = super.aClass162_Sub2_8.anIntArray529;
		@Pc(186) int local186;
		@Pc(9) int local9;
		@Pc(14) int local14;
		@Pc(23) int local23;
		@Pc(25) int local25;
		@Pc(27) int local27;
		@Pc(29) int local29;
		@Pc(53) int local53;
		@Pc(58) int local58;
		@Pc(64) int local64;
		@Pc(111) byte local111;
		if (Static44.anInt7288 == 0) {
			if (Static44.anInt7300 == 0) {
				local9 = Static44.anInt7297;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static44.anInt7274;
						local25 = Static44.anInt7277;
						local27 = Static44.anInt7283;
						local29 = Static44.anInt7286;
						if (local25 >= 0 && local27 >= 0 && local25 - (super.anInt7296 << 12) < 0 && local27 - (super.anInt7293 << 12) < 0) {
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static44.anInt7274 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static44.anInt7288 * local64;
								local27 += Static44.anInt7300 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.aByteArray70[(local27 >> 12) * super.anInt7296 + (local25 >> 12)];
								if (local111 == 0) {
									local23++;
								} else {
									local3[local23++] = this.anIntArray490[local111 & 0xFF];
								}
								local29++;
							}
						}
					}
					local9++;
					Static44.anInt7274 += Static44.anInt7278;
				}
			} else if (Static44.anInt7300 < 0) {
				local9 = Static44.anInt7297;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static44.anInt7274;
						local25 = Static44.anInt7277;
						local27 = Static44.anInt7283 + Static44.anInt7282;
						local29 = Static44.anInt7286;
						if (local25 >= 0 && local25 - (super.anInt7296 << 12) < 0) {
							@Pc(179) int local179;
							if ((local179 = local27 - (super.anInt7293 << 12)) >= 0) {
								local186 = (Static44.anInt7300 - local179) / Static44.anInt7300;
								local29 += local186;
								local27 += Static44.anInt7300 * local186;
								local23 += local186;
							}
							@Pc(207) int local207;
							if ((local207 = (local27 - Static44.anInt7300) / Static44.anInt7300) > local29) {
								local29 = local207;
							}
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static44.anInt7274 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static44.anInt7288 * local64;
								local27 += Static44.anInt7300 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.aByteArray70[(local27 >> 12) * super.anInt7296 + (local25 >> 12)];
								if (local111 == 0) {
									local23++;
								} else {
									local3[local23++] = this.anIntArray490[local111 & 0xFF];
								}
								local27 += Static44.anInt7300;
								local29++;
							}
						}
					}
					local9++;
					Static44.anInt7277 += Static44.anInt7287;
					Static44.anInt7274 += Static44.anInt7278;
				}
			} else {
				local9 = Static44.anInt7297;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static44.anInt7274;
						local25 = Static44.anInt7277;
						local27 = Static44.anInt7283 + Static44.anInt7282;
						local29 = Static44.anInt7286;
						if (local25 >= 0 && local25 - (super.anInt7296 << 12) < 0) {
							if (local27 < 0) {
								local186 = (Static44.anInt7300 - local27 - 1) / Static44.anInt7300;
								local29 += local186;
								local27 += Static44.anInt7300 * local186;
								local23 += local186;
							}
							@Pc(379) int local379;
							if ((local379 = (local27 + 1 - (super.anInt7293 << 12) - Static44.anInt7300) / Static44.anInt7300) > local29) {
								local29 = local379;
							}
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static44.anInt7274 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static44.anInt7288 * local64;
								local27 += Static44.anInt7300 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.aByteArray70[(local27 >> 12) * super.anInt7296 + (local25 >> 12)];
								if (local111 == 0) {
									local23++;
								} else {
									local3[local23++] = this.anIntArray490[local111 & 0xFF];
								}
								local27 += Static44.anInt7300;
								local29++;
							}
						}
					}
					local9++;
					Static44.anInt7277 += Static44.anInt7287;
					Static44.anInt7274 += Static44.anInt7278;
				}
			}
		} else if (Static44.anInt7288 < 0) {
			if (Static44.anInt7300 == 0) {
				local9 = Static44.anInt7297;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static44.anInt7274;
						local25 = Static44.anInt7277 + Static44.anInt7298;
						local27 = Static44.anInt7283;
						local29 = Static44.anInt7286;
						if (local27 >= 0 && local27 - (super.anInt7293 << 12) < 0) {
							@Pc(525) int local525;
							if ((local525 = local25 - (super.anInt7296 << 12)) >= 0) {
								local186 = (Static44.anInt7288 - local525) / Static44.anInt7288;
								local29 += local186;
								local25 += Static44.anInt7288 * local186;
								local23 += local186;
							}
							@Pc(553) int local553;
							if ((local553 = (local25 - Static44.anInt7288) / Static44.anInt7288) > local29) {
								local29 = local553;
							}
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static44.anInt7274 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static44.anInt7288 * local64;
								local27 += Static44.anInt7300 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.aByteArray70[(local27 >> 12) * super.anInt7296 + (local25 >> 12)];
								if (local111 == 0) {
									local23++;
								} else {
									local3[local23++] = this.anIntArray490[local111 & 0xFF];
								}
								local25 += Static44.anInt7288;
								local29++;
							}
						}
					}
					local9++;
					Static44.anInt7283 += Static44.anInt7289;
					Static44.anInt7274 += Static44.anInt7278;
				}
			} else if (Static44.anInt7300 < 0) {
				local9 = Static44.anInt7297;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static44.anInt7274;
						local25 = Static44.anInt7277 + Static44.anInt7298;
						local27 = Static44.anInt7283 + Static44.anInt7282;
						local29 = Static44.anInt7286;
						@Pc(690) int local690;
						if ((local690 = local25 - (super.anInt7296 << 12)) >= 0) {
							local186 = (Static44.anInt7288 - local690) / Static44.anInt7288;
							local29 += local186;
							local25 += Static44.anInt7288 * local186;
							local27 += Static44.anInt7300 * local186;
							local23 += local186;
						}
						@Pc(724) int local724;
						if ((local724 = (local25 - Static44.anInt7288) / Static44.anInt7288) > local29) {
							local29 = local724;
						}
						@Pc(736) int local736;
						if ((local736 = local27 - (super.anInt7293 << 12)) >= 0) {
							local186 = (Static44.anInt7300 - local736) / Static44.anInt7300;
							local29 += local186;
							local25 += Static44.anInt7288 * local186;
							local27 += Static44.anInt7300 * local186;
							local23 += local186;
						}
						@Pc(770) int local770;
						if ((local770 = (local27 - Static44.anInt7300) / Static44.anInt7300) > local29) {
							local29 = local770;
						}
						local53 = arg0[local14] - arg2;
						local58 = -arg1[local14];
						local64 = local53 + Static44.anInt7274 - local23;
						if (local64 > 0) {
							local23 += local64;
							local29 += local64;
							local25 += Static44.anInt7288 * local64;
							local27 += Static44.anInt7300 * local64;
						} else {
							local58 -= local64;
						}
						if (local29 < local58) {
							local29 = local58;
						}
						while (local29 < 0) {
							local111 = this.aByteArray70[(local27 >> 12) * super.anInt7296 + (local25 >> 12)];
							if (local111 == 0) {
								local23++;
							} else {
								local3[local23++] = this.anIntArray490[local111 & 0xFF];
							}
							local25 += Static44.anInt7288;
							local27 += Static44.anInt7300;
							local29++;
						}
					}
					local9++;
					Static44.anInt7277 += Static44.anInt7287;
					Static44.anInt7283 += Static44.anInt7289;
					Static44.anInt7274 += Static44.anInt7278;
				}
			} else {
				local9 = Static44.anInt7297;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static44.anInt7274;
						local25 = Static44.anInt7277 + Static44.anInt7298;
						local27 = Static44.anInt7283 + Static44.anInt7282;
						local29 = Static44.anInt7286;
						@Pc(913) int local913;
						if ((local913 = local25 - (super.anInt7296 << 12)) >= 0) {
							local186 = (Static44.anInt7288 - local913) / Static44.anInt7288;
							local29 += local186;
							local25 += Static44.anInt7288 * local186;
							local27 += Static44.anInt7300 * local186;
							local23 += local186;
						}
						@Pc(947) int local947;
						if ((local947 = (local25 - Static44.anInt7288) / Static44.anInt7288) > local29) {
							local29 = local947;
						}
						if (local27 < 0) {
							local186 = (Static44.anInt7300 - local27 - 1) / Static44.anInt7300;
							local29 += local186;
							local25 += Static44.anInt7288 * local186;
							local27 += Static44.anInt7300 * local186;
							local23 += local186;
						}
						@Pc(995) int local995;
						if ((local995 = (local27 + 1 - (super.anInt7293 << 12) - Static44.anInt7300) / Static44.anInt7300) > local29) {
							local29 = local995;
						}
						local53 = arg0[local14] - arg2;
						local58 = -arg1[local14];
						local64 = local53 + Static44.anInt7274 - local23;
						if (local64 > 0) {
							local23 += local64;
							local29 += local64;
							local25 += Static44.anInt7288 * local64;
							local27 += Static44.anInt7300 * local64;
						} else {
							local58 -= local64;
						}
						if (local29 < local58) {
							local29 = local58;
						}
						while (local29 < 0) {
							local111 = this.aByteArray70[(local27 >> 12) * super.anInt7296 + (local25 >> 12)];
							if (local111 == 0) {
								local23++;
							} else {
								local3[local23++] = this.anIntArray490[local111 & 0xFF];
							}
							local25 += Static44.anInt7288;
							local27 += Static44.anInt7300;
							local29++;
						}
					}
					local9++;
					Static44.anInt7277 += Static44.anInt7287;
					Static44.anInt7283 += Static44.anInt7289;
					Static44.anInt7274 += Static44.anInt7278;
				}
			}
		} else if (Static44.anInt7300 == 0) {
			local9 = Static44.anInt7297;
			while (local9 < 0) {
				local14 = local9 + arg3;
				if (local14 >= 0) {
					if (local14 >= arg0.length) {
						return;
					}
					local23 = Static44.anInt7274;
					local25 = Static44.anInt7277 + Static44.anInt7298;
					local27 = Static44.anInt7283;
					local29 = Static44.anInt7286;
					if (local27 >= 0 && local27 - (super.anInt7293 << 12) < 0) {
						if (local25 < 0) {
							local186 = (Static44.anInt7288 - local25 - 1) / Static44.anInt7288;
							local29 += local186;
							local25 += Static44.anInt7288 * local186;
							local23 += local186;
						}
						@Pc(1177) int local1177;
						if ((local1177 = (local25 + 1 - (super.anInt7296 << 12) - Static44.anInt7288) / Static44.anInt7288) > local29) {
							local29 = local1177;
						}
						local53 = arg0[local14] - arg2;
						local58 = -arg1[local14];
						local64 = local53 + Static44.anInt7274 - local23;
						if (local64 > 0) {
							local23 += local64;
							local29 += local64;
							local25 += Static44.anInt7288 * local64;
							local27 += Static44.anInt7300 * local64;
						} else {
							local58 -= local64;
						}
						if (local29 < local58) {
							local29 = local58;
						}
						while (local29 < 0) {
							local111 = this.aByteArray70[(local27 >> 12) * super.anInt7296 + (local25 >> 12)];
							if (local111 == 0) {
								local23++;
							} else {
								local3[local23++] = this.anIntArray490[local111 & 0xFF];
							}
							local25 += Static44.anInt7288;
							local29++;
						}
					}
				}
				local9++;
				Static44.anInt7277 += Static44.anInt7287;
				Static44.anInt7283 += Static44.anInt7289;
				Static44.anInt7274 += Static44.anInt7278;
			}
		} else if (Static44.anInt7300 < 0) {
			local9 = Static44.anInt7297;
			while (local9 < 0) {
				local14 = local9 + arg3;
				if (local14 >= 0) {
					if (local14 >= arg0.length) {
						return;
					}
					local23 = Static44.anInt7274;
					local25 = Static44.anInt7277 + Static44.anInt7298;
					local27 = Static44.anInt7283 + Static44.anInt7282;
					local29 = Static44.anInt7286;
					if (local25 < 0) {
						local186 = (Static44.anInt7288 - local25 - 1) / Static44.anInt7288;
						local29 += local186;
						local25 += Static44.anInt7288 * local186;
						local27 += Static44.anInt7300 * local186;
						local23 += local186;
					}
					@Pc(1354) int local1354;
					if ((local1354 = (local25 + 1 - (super.anInt7296 << 12) - Static44.anInt7288) / Static44.anInt7288) > local29) {
						local29 = local1354;
					}
					@Pc(1366) int local1366;
					if ((local1366 = local27 - (super.anInt7293 << 12)) >= 0) {
						local186 = (Static44.anInt7300 - local1366) / Static44.anInt7300;
						local29 += local186;
						local25 += Static44.anInt7288 * local186;
						local27 += Static44.anInt7300 * local186;
						local23 += local186;
					}
					@Pc(1400) int local1400;
					if ((local1400 = (local27 - Static44.anInt7300) / Static44.anInt7300) > local29) {
						local29 = local1400;
					}
					local53 = arg0[local14] - arg2;
					local58 = -arg1[local14];
					local64 = local53 + Static44.anInt7274 - local23;
					if (local64 > 0) {
						local23 += local64;
						local29 += local64;
						local25 += Static44.anInt7288 * local64;
						local27 += Static44.anInt7300 * local64;
					} else {
						local58 -= local64;
					}
					if (local29 < local58) {
						local29 = local58;
					}
					while (local29 < 0) {
						local111 = this.aByteArray70[(local27 >> 12) * super.anInt7296 + (local25 >> 12)];
						if (local111 == 0) {
							local23++;
						} else {
							local3[local23++] = this.anIntArray490[local111 & 0xFF];
						}
						local25 += Static44.anInt7288;
						local27 += Static44.anInt7300;
						local29++;
					}
				}
				local9++;
				Static44.anInt7277 += Static44.anInt7287;
				Static44.anInt7283 += Static44.anInt7289;
				Static44.anInt7274 += Static44.anInt7278;
			}
		} else {
			local9 = Static44.anInt7297;
			while (local9 < 0) {
				local14 = local9 + arg3;
				if (local14 >= 0) {
					if (local14 >= arg0.length) {
						return;
					}
					local23 = Static44.anInt7274;
					local25 = Static44.anInt7277 + Static44.anInt7298;
					local27 = Static44.anInt7283 + Static44.anInt7282;
					local29 = Static44.anInt7286;
					if (local25 < 0) {
						local186 = (Static44.anInt7288 - local25 - 1) / Static44.anInt7288;
						local29 += local186;
						local25 += Static44.anInt7288 * local186;
						local27 += Static44.anInt7300 * local186;
						local23 += local186;
					}
					@Pc(1579) int local1579;
					if ((local1579 = (local25 + 1 - (super.anInt7296 << 12) - Static44.anInt7288) / Static44.anInt7288) > local29) {
						local29 = local1579;
					}
					if (local27 < 0) {
						local186 = (Static44.anInt7300 - local27 - 1) / Static44.anInt7300;
						local29 += local186;
						local25 += Static44.anInt7288 * local186;
						local27 += Static44.anInt7300 * local186;
						local23 += local186;
					}
					@Pc(1627) int local1627;
					if ((local1627 = (local27 + 1 - (super.anInt7293 << 12) - Static44.anInt7300) / Static44.anInt7300) > local29) {
						local29 = local1627;
					}
					local53 = arg0[local14] - arg2;
					local58 = -arg1[local14];
					local64 = local53 + Static44.anInt7274 - local23;
					if (local64 > 0) {
						local23 += local64;
						local29 += local64;
						local25 += Static44.anInt7288 * local64;
						local27 += Static44.anInt7300 * local64;
					} else {
						local58 -= local64;
					}
					if (local29 < local58) {
						local29 = local58;
					}
					while (local29 < 0) {
						local111 = this.aByteArray70[(local27 >> 12) * super.anInt7296 + (local25 >> 12)];
						if (local111 == 0) {
							local23++;
						} else {
							local3[local23++] = this.anIntArray490[local111 & 0xFF];
						}
						local25 += Static44.anInt7288;
						local27 += Static44.anInt7300;
						local29++;
					}
				}
				local9++;
				Static44.anInt7277 += Static44.anInt7287;
				Static44.anInt7283 += Static44.anInt7289;
				Static44.anInt7274 += Static44.anInt7278;
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method5929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg3 <= 0 || arg4 <= 0) {
			return;
		}
		@Pc(8) int local8 = arg2 << 8;
		@Pc(10) int local10 = 0;
		@Pc(12) int local12 = 0;
		@Pc(21) int local21 = super.anInt7271 + super.anInt7296 + super.anInt7285;
		@Pc(30) int local30 = super.anInt7299 + super.anInt7293 + super.anInt7295;
		@Pc(36) int local36 = (local21 << 16) / arg3;
		@Pc(42) int local42 = (local30 << 16) / arg4;
		@Pc(56) int local56;
		if (super.anInt7271 > 0) {
			local56 = ((super.anInt7271 << 16) + local36 - 1) / local36;
			arg0 += local56;
			local10 = local56 * local36 - (super.anInt7271 << 16);
		}
		if (super.anInt7299 > 0) {
			local56 = ((super.anInt7299 << 16) + local42 - 1) / local42;
			arg1 += local56;
			local12 = local56 * local42 - (super.anInt7299 << 16);
		}
		if (super.anInt7296 < local21) {
			arg3 = ((super.anInt7296 << 16) + local36 - local10 - 1) / local36;
		}
		if (super.anInt7293 < local30) {
			arg4 = ((super.anInt7293 << 16) + local42 - local12 - 1) / local42;
		}
		local56 = arg0 + arg1 * super.aClass162_Sub2_8.anInt7902;
		@Pc(148) int local148 = super.aClass162_Sub2_8.anInt7902 - arg3;
		if (arg1 + arg4 > super.aClass162_Sub2_8.anInt7884) {
			arg4 -= arg1 + arg4 - super.aClass162_Sub2_8.anInt7884;
		}
		@Pc(176) int local176;
		if (arg1 < super.aClass162_Sub2_8.anInt7894) {
			local176 = super.aClass162_Sub2_8.anInt7894 - arg1;
			arg4 -= local176;
			local56 += local176 * super.aClass162_Sub2_8.anInt7902;
			local12 += local42 * local176;
		}
		if (arg0 + arg3 > super.aClass162_Sub2_8.anInt7885) {
			local176 = arg0 + arg3 - super.aClass162_Sub2_8.anInt7885;
			arg3 -= local176;
			local148 += local176;
		}
		if (arg0 < super.aClass162_Sub2_8.anInt7898) {
			local176 = super.aClass162_Sub2_8.anInt7898 - arg0;
			arg3 -= local176;
			local56 += local176;
			local10 += local36 * local176;
			local148 += local176;
		}
		@Pc(250) int[] local250 = super.aClass162_Sub2_8.anIntArray528;
		@Pc(254) int[] local254 = super.aClass162_Sub2_8.anIntArray529;
		@Pc(261) int local261;
		@Pc(264) int local264;
		@Pc(272) int local272;
		@Pc(275) int local275;
		@Pc(342) int local342;
		@Pc(350) int local350;
		@Pc(353) int local353;
		@Pc(373) int local373;
		@Pc(389) int local389;
		@Pc(397) int local397;
		@Pc(561) int local561;
		@Pc(463) byte local463;
		@Pc(381) int local381;
		if (arg7 != 0) {
			@Pc(1236) byte local1236;
			@Pc(905) int local905;
			@Pc(913) int local913;
			@Pc(921) int local921;
			@Pc(933) int local933;
			if (arg7 == 1) {
				if (arg5 == 1) {
					local261 = local10;
					for (local264 = -arg4; local264 < 0; local264++) {
						local272 = (local12 >> 16) * super.anInt7296;
						for (local275 = -arg3; local275 < 0; local275++) {
							if (local8 < local250[local56]) {
								local463 = this.aByteArray70[(local10 >> 16) + local272];
								if (local463 != 0) {
									local254[local56] = this.anIntArray490[local463 & 0xFF];
								}
							}
							local10 += local36;
							local56++;
						}
						local12 += local42;
						local10 = local261;
						local56 += local148;
					}
				} else {
					@Pc(765) byte local765;
					if (arg5 == 0) {
						local261 = local10;
						if ((arg6 & 0xFFFFFF) == 16777215) {
							local264 = arg6 >>> 24;
							local272 = 256 - local264;
							for (local275 = -arg4; local275 < 0; local275++) {
								local342 = (local12 >> 16) * super.anInt7296;
								for (local350 = -arg3; local350 < 0; local350++) {
									if (local8 < local250[local56]) {
										local765 = this.aByteArray70[(local10 >> 16) + local342];
										if (local765 != 0) {
											local373 = this.anIntArray490[local765 & 0xFF];
											local381 = local254[local56];
											local254[local56] = ((local373 & 0xFF00FF) * local264 + (local381 & 0xFF00FF) * local272 & 0xFF00FF00) + ((local373 & 0xFF00) * local264 + (local381 & 0xFF00) * local272 & 0xFF0000) >> 8;
										}
									}
									local10 += local36;
									local56++;
								}
								local12 += local42;
								local10 = local261;
								local56 += local148;
							}
						} else {
							local264 = arg6 >> 16 & 0xFF;
							local272 = arg6 >> 8 & 0xFF;
							local275 = arg6 & 0xFF;
							local342 = arg6 >>> 24;
							local350 = 256 - local342;
							for (local353 = -arg4; local353 < 0; local353++) {
								local373 = (local12 >> 16) * super.anInt7296;
								for (local381 = -arg3; local381 < 0; local381++) {
									if (local8 < local250[local56]) {
										@Pc(885) byte local885 = this.aByteArray70[(local10 >> 16) + local373];
										if (local885 != 0) {
											local397 = this.anIntArray490[local885 & 0xFF];
											if (local342 == 255) {
												local905 = (local397 & 0xFF0000) * local264 & 0xFF000000;
												local913 = (local397 & 0xFF00) * local272 & 0xFF0000;
												local921 = (local397 & 0xFF) * local275 & 0xFF00;
												local254[local56] = (local905 | local913 | local921) >>> 8;
											} else {
												local905 = (local397 & 0xFF0000) * local264 & 0xFF000000;
												local913 = (local397 & 0xFF00) * local272 & 0xFF0000;
												local921 = (local397 & 0xFF) * local275 & 0xFF00;
												local397 = (local905 | local913 | local921) >>> 8;
												local933 = local254[local56];
												local254[local56] = ((local397 & 0xFF00FF) * local342 + (local933 & 0xFF00FF) * local350 & 0xFF00FF00) + ((local397 & 0xFF00) * local342 + (local933 & 0xFF00) * local350 & 0xFF0000) >> 8;
											}
										}
									}
									local10 += local36;
									local56++;
								}
								local12 += local42;
								local10 = local261;
								local56 += local148;
							}
						}
					} else if (arg5 == 3) {
						local261 = local10;
						local264 = arg6 >>> 24;
						local272 = 256 - local264;
						for (local275 = -arg4; local275 < 0; local275++) {
							local342 = (local12 >> 16) * super.anInt7296;
							for (local350 = -arg3; local350 < 0; local350++) {
								if (local8 < local250[local56]) {
									local765 = this.aByteArray70[(local10 >> 16) + local342];
									local373 = local765 > 0 ? this.anIntArray490[local765] : 0;
									local381 = local373 + arg6;
									local389 = (local373 & 0xFF00FF) + (arg6 & 0xFF00FF);
									local397 = (local389 & 0x1000100) + (local381 - local389 & 0x10000);
									local397 = local381 - local397 | local397 - (local397 >>> 8);
									if (local373 == 0 && local264 != 255) {
										local373 = local397;
										local397 = local254[local56];
										local397 = ((local373 & 0xFF00FF) * local264 + (local397 & 0xFF00FF) * local272 & 0xFF00FF00) + ((local373 & 0xFF00) * local264 + (local397 & 0xFF00) * local272 & 0xFF0000) >> 8;
									}
									local254[local56] = local397;
								}
								local10 += local36;
								local56++;
							}
							local12 += local42;
							local10 = local261;
							local56 += local148;
						}
					} else if (arg5 == 2) {
						local261 = arg6 >>> 24;
						local264 = 256 - local261;
						local272 = (arg6 & 0xFF00FF) * local264 & 0xFF00FF00;
						local275 = (arg6 & 0xFF00) * local264 & 0xFF0000;
						local561 = (local272 | local275) >>> 8;
						local342 = local10;
						for (local350 = -arg4; local350 < 0; local350++) {
							local353 = (local12 >> 16) * super.anInt7296;
							for (local373 = -arg3; local373 < 0; local373++) {
								if (local8 < local250[local56]) {
									local1236 = this.aByteArray70[(local10 >> 16) + local353];
									if (local1236 != 0) {
										local389 = this.anIntArray490[local1236 & 0xFF];
										local272 = (local389 & 0xFF00FF) * local261 & 0xFF00FF00;
										local275 = (local389 & 0xFF00) * local261 & 0xFF0000;
										local254[local56] = ((local272 | local275) >>> 8) + local561;
									}
								}
								local10 += local36;
								local56++;
							}
							local12 += local42;
							local10 = local342;
							local56 += local148;
						}
					} else {
						throw new IllegalArgumentException();
					}
				}
			} else if (arg7 != 2) {
				throw new IllegalArgumentException();
			} else if (arg5 == 1) {
				local261 = local10;
				for (local264 = -arg4; local264 < 0; local264++) {
					local272 = (local12 >> 16) * super.anInt7296;
					for (local275 = -arg3; local275 < 0; local275++) {
						if (local8 < local250[local56]) {
							local463 = this.aByteArray70[(local10 >> 16) + local272];
							if (local463 != 0) {
								local350 = this.anIntArray490[local463 & 0xFF];
								local353 = local254[local56];
								local373 = local350 + local353;
								local381 = (local350 & 0xFF00FF) + (local353 & 0xFF00FF);
								local353 = (local381 & 0x1000100) + (local373 - local381 & 0x10000);
								local254[local56] = local373 - local353 | local353 - (local353 >>> 8);
							}
						}
						local10 += local36;
						local56++;
					}
					local12 += local42;
					local10 = local261;
					local56 += local148;
				}
			} else if (arg5 == 0) {
				local261 = local10;
				local264 = arg6 >> 16 & 0xFF;
				local272 = arg6 >> 8 & 0xFF;
				local275 = arg6 & 0xFF;
				for (local342 = -arg4; local342 < 0; local342++) {
					local350 = (local12 >> 16) * super.anInt7296;
					for (local353 = -arg3; local353 < 0; local353++) {
						if (local8 < local250[local56]) {
							@Pc(1452) byte local1452 = this.aByteArray70[(local10 >> 16) + local350];
							if (local1452 != 0) {
								local381 = this.anIntArray490[local1452 & 0xFF];
								local389 = (local381 & 0xFF0000) * local264 & 0xFF000000;
								local397 = (local381 & 0xFF00) * local272 & 0xFF0000;
								local905 = (local381 & 0xFF) * local275 & 0xFF00;
								local381 = (local389 | local397 | local905) >>> 8;
								local913 = local254[local56];
								local921 = local381 + local913;
								local933 = (local381 & 0xFF00FF) + (local913 & 0xFF00FF);
								local913 = (local933 & 0x1000100) + (local921 - local933 & 0x10000);
								local254[local56] = local921 - local913 | local913 - (local913 >>> 8);
							}
						}
						local10 += local36;
						local56++;
					}
					local12 += local42;
					local10 = local261;
					local56 += local148;
				}
			} else if (arg5 == 3) {
				local261 = local10;
				for (local264 = -arg4; local264 < 0; local264++) {
					local272 = (local12 >> 16) * super.anInt7296;
					for (local275 = -arg3; local275 < 0; local275++) {
						if (local8 < local250[local56]) {
							local463 = this.aByteArray70[(local10 >> 16) + local272];
							local350 = local463 > 0 ? this.anIntArray490[local463] : 0;
							local353 = local350 + arg6;
							local373 = (local350 & 0xFF00FF) + (arg6 & 0xFF00FF);
							local381 = (local373 & 0x1000100) + (local353 - local373 & 0x10000);
							local350 = local353 - local381 | local381 - (local381 >>> 8);
							@Pc(1632) int local1632 = local254[local56];
							local353 = local350 + local1632;
							local373 = (local350 & 0xFF00FF) + (local1632 & 0xFF00FF);
							@Pc(1654) int local1654 = (local373 & 0x1000100) + (local353 - local373 & 0x10000);
							local254[local56] = local353 - local1654 | local1654 - (local1654 >>> 8);
						}
						local10 += local36;
						local56++;
					}
					local12 += local42;
					local10 = local261;
					local56 += local148;
				}
			} else if (arg5 == 2) {
				local261 = arg6 >>> 24;
				local264 = 256 - local261;
				local272 = (arg6 & 0xFF00FF) * local264 & 0xFF00FF00;
				local275 = (arg6 & 0xFF00) * local264 & 0xFF0000;
				local561 = (local272 | local275) >>> 8;
				local342 = local10;
				for (local350 = -arg4; local350 < 0; local350++) {
					local353 = (local12 >> 16) * super.anInt7296;
					for (local373 = -arg3; local373 < 0; local373++) {
						if (local8 < local250[local56]) {
							local1236 = this.aByteArray70[(local10 >> 16) + local353];
							if (local1236 != 0) {
								local389 = this.anIntArray490[local1236 & 0xFF];
								local272 = (local389 & 0xFF00FF) * local261 & 0xFF00FF00;
								local275 = (local389 & 0xFF00) * local261 & 0xFF0000;
								@Pc(1785) int local1785 = ((local272 | local275) >>> 8) + local561;
								local397 = local254[local56];
								local905 = local1785 + local397;
								local913 = (local1785 & 0xFF00FF) + (local397 & 0xFF00FF);
								@Pc(1811) int local1811 = (local913 & 0x1000100) + (local905 - local913 & 0x10000);
								local254[local56] = local905 - local1811 | local1811 - (local1811 >>> 8);
							}
						}
						local10 += local36;
						local56++;
					}
					local12 += local42;
					local10 = local342;
					local56 += local148;
				}
			} else {
				throw new IllegalArgumentException();
			}
		} else if (arg5 == 1) {
			local261 = local10;
			for (local264 = -arg4; local264 < 0; local264++) {
				local272 = (local12 >> 16) * super.anInt7296;
				for (local275 = -arg3; local275 < 0; local275++) {
					if (local8 < local250[local56]) {
						local254[local56] = this.anIntArray490[this.aByteArray70[(local10 >> 16) + local272] & 0xFF];
					}
					local10 += local36;
					local56++;
				}
				local12 += local42;
				local10 = local261;
				local56 += local148;
			}
		} else if (arg5 == 0) {
			local261 = arg6 >> 16 & 0xFF;
			local264 = arg6 >> 8 & 0xFF;
			local272 = arg6 & 0xFF;
			local275 = local10;
			for (local342 = -arg4; local342 < 0; local342++) {
				local350 = (local12 >> 16) * super.anInt7296;
				for (local353 = -arg3; local353 < 0; local353++) {
					if (local8 < local250[local56]) {
						local373 = this.anIntArray490[this.aByteArray70[(local10 >> 16) + local350] & 0xFF];
						local381 = (local373 & 0xFF0000) * local261 & 0xFF000000;
						local389 = (local373 & 0xFF00) * local264 & 0xFF0000;
						local397 = (local373 & 0xFF) * local272 & 0xFF00;
						local254[local56] = (local381 | local389 | local397) >>> 8;
					}
					local10 += local36;
					local56++;
				}
				local12 += local42;
				local10 = local275;
				local56 += local148;
			}
		} else if (arg5 == 3) {
			local261 = local10;
			for (local264 = -arg4; local264 < 0; local264++) {
				local272 = (local12 >> 16) * super.anInt7296;
				for (local275 = -arg3; local275 < 0; local275++) {
					if (local8 < local250[local56]) {
						local463 = this.aByteArray70[(local10 >> 16) + local272];
						local350 = local463 > 0 ? this.anIntArray490[local463] : 0;
						local353 = local350 + arg6;
						local373 = (local350 & 0xFF00FF) + (arg6 & 0xFF00FF);
						local381 = (local373 & 0x1000100) + (local353 - local373 & 0x10000);
						local254[local56] = local353 - local381 | local381 - (local381 >>> 8);
					}
					local10 += local36;
					local56++;
				}
				local12 += local42;
				local10 = local261;
				local56 += local148;
			}
		} else if (arg5 == 2) {
			local261 = arg6 >>> 24;
			local264 = 256 - local261;
			local272 = (arg6 & 0xFF00FF) * local264 & 0xFF00FF00;
			local275 = (arg6 & 0xFF00) * local264 & 0xFF0000;
			local561 = (local272 | local275) >>> 8;
			local342 = local10;
			for (local350 = -arg4; local350 < 0; local350++) {
				local353 = (local12 >> 16) * super.anInt7296;
				for (local373 = -arg3; local373 < 0; local373++) {
					if (local8 < local250[local56]) {
						local381 = this.anIntArray490[this.aByteArray70[(local10 >> 16) + local353] & 0xFF];
						local272 = (local381 & 0xFF00FF) * local261 & 0xFF00FF00;
						local275 = (local381 & 0xFF00) * local261 & 0xFF0000;
						local254[local56] = ((local272 | local275) >>> 8) + local561;
					}
					local10 += local36;
					local56++;
				}
				local12 += local42;
				local10 = local342;
				local56 += local148;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!rc", name = "YA", descriptor = "(IIIIIIII)V")
	@Override
	protected void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (super.aClass162_Sub2_8.method6432()) {
			throw new IllegalStateException();
		} else if (arg2 > 0 && arg3 > 0) {
			@Pc(14) int local14 = 0;
			@Pc(16) int local16 = 0;
			@Pc(20) int local20 = super.aClass162_Sub2_8.anInt7902;
			@Pc(29) int local29 = super.anInt7271 + super.anInt7296 + super.anInt7285;
			@Pc(38) int local38 = super.anInt7299 + super.anInt7293 + super.anInt7295;
			@Pc(44) int local44 = (local29 << 16) / arg2;
			@Pc(50) int local50 = (local38 << 16) / arg3;
			@Pc(64) int local64;
			if (super.anInt7271 > 0) {
				local64 = ((super.anInt7271 << 16) + local44 - 1) / local44;
				arg0 += local64;
				local14 += local64 * local44 - (super.anInt7271 << 16);
			}
			if (super.anInt7299 > 0) {
				local64 = ((super.anInt7299 << 16) + local50 - 1) / local50;
				arg1 += local64;
				local16 += local64 * local50 - (super.anInt7299 << 16);
			}
			if (super.anInt7296 < local29) {
				arg2 = ((super.anInt7296 << 16) + local44 - local14 - 1) / local44;
			}
			if (super.anInt7293 < local38) {
				arg3 = ((super.anInt7293 << 16) + local50 - local16 - 1) / local50;
			}
			local64 = arg0 + arg1 * local20;
			@Pc(152) int local152 = local20 - arg2;
			if (arg1 + arg3 > super.aClass162_Sub2_8.anInt7884) {
				arg3 -= arg1 + arg3 - super.aClass162_Sub2_8.anInt7884;
			}
			@Pc(180) int local180;
			if (arg1 < super.aClass162_Sub2_8.anInt7894) {
				local180 = super.aClass162_Sub2_8.anInt7894 - arg1;
				arg3 -= local180;
				local64 += local180 * local20;
				local16 += local50 * local180;
			}
			if (arg0 + arg2 > super.aClass162_Sub2_8.anInt7885) {
				local180 = arg0 + arg2 - super.aClass162_Sub2_8.anInt7885;
				arg2 -= local180;
				local152 += local180;
			}
			if (arg0 < super.aClass162_Sub2_8.anInt7898) {
				local180 = super.aClass162_Sub2_8.anInt7898 - arg0;
				arg2 -= local180;
				local64 += local180;
				local14 += local44 * local180;
				local152 += local180;
			}
			@Pc(252) int[] local252 = super.aClass162_Sub2_8.anIntArray529;
			@Pc(259) int local259;
			@Pc(262) int local262;
			@Pc(270) int local270;
			@Pc(273) int local273;
			@Pc(335) int local335;
			@Pc(343) int local343;
			@Pc(346) int local346;
			@Pc(361) int local361;
			@Pc(377) int local377;
			@Pc(385) int local385;
			@Pc(544) int local544;
			@Pc(446) byte local446;
			@Pc(369) int local369;
			if (arg6 != 0) {
				@Pc(1196) byte local1196;
				@Pc(872) int local872;
				@Pc(880) int local880;
				@Pc(888) int local888;
				@Pc(900) int local900;
				if (arg6 == 1) {
					if (arg4 == 1) {
						local259 = local14;
						for (local262 = -arg3; local262 < 0; local262++) {
							local270 = (local16 >> 16) * super.anInt7296;
							for (local273 = -arg2; local273 < 0; local273++) {
								local446 = this.aByteArray70[(local14 >> 16) + local270];
								if (local446 == 0) {
									local64++;
								} else {
									local252[local64++] = this.anIntArray490[local446 & 0xFF];
								}
								local14 += local44;
							}
							local16 += local50;
							local14 = local259;
							local64 += local152;
						}
					} else {
						@Pc(735) byte local735;
						if (arg4 == 0) {
							local259 = local14;
							if ((arg5 & 0xFFFFFF) == 16777215) {
								local262 = arg5 >>> 24;
								local270 = 256 - local262;
								for (local273 = -arg3; local273 < 0; local273++) {
									local335 = (local16 >> 16) * super.anInt7296;
									for (local343 = -arg2; local343 < 0; local343++) {
										local735 = this.aByteArray70[(local14 >> 16) + local335];
										if (local735 == 0) {
											local64++;
										} else {
											local361 = this.anIntArray490[local735 & 0xFF];
											local369 = local252[local64];
											local252[local64++] = ((local361 & 0xFF00FF) * local262 + (local369 & 0xFF00FF) * local270 & 0xFF00FF00) + ((local361 & 0xFF00) * local262 + (local369 & 0xFF00) * local270 & 0xFF0000) >> 8;
										}
										local14 += local44;
									}
									local16 += local50;
									local14 = local259;
									local64 += local152;
								}
							} else {
								local262 = arg5 >> 16 & 0xFF;
								local270 = arg5 >> 8 & 0xFF;
								local273 = arg5 & 0xFF;
								local335 = arg5 >>> 24;
								local343 = 256 - local335;
								for (local346 = -arg3; local346 < 0; local346++) {
									local361 = (local16 >> 16) * super.anInt7296;
									for (local369 = -arg2; local369 < 0; local369++) {
										@Pc(852) byte local852 = this.aByteArray70[(local14 >> 16) + local361];
										if (local852 == 0) {
											local64++;
										} else {
											local385 = this.anIntArray490[local852 & 0xFF];
											if (local335 == 255) {
												local872 = (local385 & 0xFF0000) * local262 & 0xFF000000;
												local880 = (local385 & 0xFF00) * local270 & 0xFF0000;
												local888 = (local385 & 0xFF) * local273 & 0xFF00;
												local252[local64++] = (local872 | local880 | local888) >>> 8;
											} else {
												local872 = (local385 & 0xFF0000) * local262 & 0xFF000000;
												local880 = (local385 & 0xFF00) * local270 & 0xFF0000;
												local888 = (local385 & 0xFF) * local273 & 0xFF00;
												local385 = (local872 | local880 | local888) >>> 8;
												local900 = local252[local64];
												local252[local64++] = ((local385 & 0xFF00FF) * local335 + (local900 & 0xFF00FF) * local343 & 0xFF00FF00) + ((local385 & 0xFF00) * local335 + (local900 & 0xFF00) * local343 & 0xFF0000) >> 8;
											}
										}
										local14 += local44;
									}
									local16 += local50;
									local14 = local259;
									local64 += local152;
								}
							}
						} else if (arg4 == 3) {
							local259 = local14;
							local262 = arg5 >>> 24;
							local270 = 256 - local262;
							for (local273 = -arg3; local273 < 0; local273++) {
								local335 = (local16 >> 16) * super.anInt7296;
								for (local343 = -arg2; local343 < 0; local343++) {
									local735 = this.aByteArray70[(local14 >> 16) + local335];
									local361 = local735 > 0 ? this.anIntArray490[local735] : 0;
									local369 = local361 + arg5;
									local377 = (local361 & 0xFF00FF) + (arg5 & 0xFF00FF);
									local385 = (local377 & 0x1000100) + (local369 - local377 & 0x10000);
									local385 = local369 - local385 | local385 - (local385 >>> 8);
									if (local361 == 0 && local262 != 255) {
										local361 = local385;
										local385 = local252[local64];
										local385 = ((local361 & 0xFF00FF) * local262 + (local385 & 0xFF00FF) * local270 & 0xFF00FF00) + ((local361 & 0xFF00) * local262 + (local385 & 0xFF00) * local270 & 0xFF0000) >> 8;
									}
									local252[local64++] = local385;
									local14 += local44;
								}
								local16 += local50;
								local14 = local259;
								local64 += local152;
							}
						} else if (arg4 == 2) {
							local259 = arg5 >>> 24;
							local262 = 256 - local259;
							local270 = (arg5 & 0xFF00FF) * local262 & 0xFF00FF00;
							local273 = (arg5 & 0xFF00) * local262 & 0xFF0000;
							local544 = (local270 | local273) >>> 8;
							local335 = local14;
							for (local343 = -arg3; local343 < 0; local343++) {
								local346 = (local16 >> 16) * super.anInt7296;
								for (local361 = -arg2; local361 < 0; local361++) {
									local1196 = this.aByteArray70[(local14 >> 16) + local346];
									if (local1196 == 0) {
										local64++;
									} else {
										local377 = this.anIntArray490[local1196 & 0xFF];
										local270 = (local377 & 0xFF00FF) * local259 & 0xFF00FF00;
										local273 = (local377 & 0xFF00) * local259 & 0xFF0000;
										local252[local64++] = ((local270 | local273) >>> 8) + local544;
									}
									local14 += local44;
								}
								local16 += local50;
								local14 = local335;
								local64 += local152;
							}
						} else {
							throw new IllegalArgumentException();
						}
					}
				} else if (arg6 != 2) {
					throw new IllegalArgumentException();
				} else if (arg4 == 1) {
					local259 = local14;
					for (local262 = -arg3; local262 < 0; local262++) {
						local270 = (local16 >> 16) * super.anInt7296;
						for (local273 = -arg2; local273 < 0; local273++) {
							local446 = this.aByteArray70[(local14 >> 16) + local270];
							if (local446 == 0) {
								local64++;
							} else {
								local343 = this.anIntArray490[local446 & 0xFF];
								local346 = local252[local64];
								local361 = local343 + local346;
								local369 = (local343 & 0xFF00FF) + (local346 & 0xFF00FF);
								local346 = (local369 & 0x1000100) + (local361 - local369 & 0x10000);
								local252[local64++] = local361 - local346 | local346 - (local346 >>> 8);
							}
							local14 += local44;
						}
						local16 += local50;
						local14 = local259;
						local64 += local152;
					}
				} else if (arg4 == 0) {
					local259 = local14;
					local262 = arg5 >> 16 & 0xFF;
					local270 = arg5 >> 8 & 0xFF;
					local273 = arg5 & 0xFF;
					for (local335 = -arg3; local335 < 0; local335++) {
						local343 = (local16 >> 16) * super.anInt7296;
						for (local346 = -arg2; local346 < 0; local346++) {
							@Pc(1406) byte local1406 = this.aByteArray70[(local14 >> 16) + local343];
							if (local1406 == 0) {
								local64++;
							} else {
								local369 = this.anIntArray490[local1406 & 0xFF];
								local377 = (local369 & 0xFF0000) * local262 & 0xFF000000;
								local385 = (local369 & 0xFF00) * local270 & 0xFF0000;
								local872 = (local369 & 0xFF) * local273 & 0xFF00;
								local369 = (local377 | local385 | local872) >>> 8;
								local880 = local252[local64];
								local888 = local369 + local880;
								local900 = (local369 & 0xFF00FF) + (local880 & 0xFF00FF);
								local880 = (local900 & 0x1000100) + (local888 - local900 & 0x10000);
								local252[local64++] = local888 - local880 | local880 - (local880 >>> 8);
							}
							local14 += local44;
						}
						local16 += local50;
						local14 = local259;
						local64 += local152;
					}
				} else if (arg4 == 3) {
					local259 = local14;
					for (local262 = -arg3; local262 < 0; local262++) {
						local270 = (local16 >> 16) * super.anInt7296;
						for (local273 = -arg2; local273 < 0; local273++) {
							local446 = this.aByteArray70[(local14 >> 16) + local270];
							local343 = local446 > 0 ? this.anIntArray490[local446] : 0;
							local346 = local343 + arg5;
							local361 = (local343 & 0xFF00FF) + (arg5 & 0xFF00FF);
							local369 = (local361 & 0x1000100) + (local346 - local361 & 0x10000);
							local343 = local346 - local369 | local369 - (local369 >>> 8);
							@Pc(1583) int local1583 = local252[local64];
							local346 = local343 + local1583;
							local361 = (local343 & 0xFF00FF) + (local1583 & 0xFF00FF);
							@Pc(1605) int local1605 = (local361 & 0x1000100) + (local346 - local361 & 0x10000);
							local252[local64++] = local346 - local1605 | local1605 - (local1605 >>> 8);
							local14 += local44;
						}
						local16 += local50;
						local14 = local259;
						local64 += local152;
					}
				} else if (arg4 == 2) {
					local259 = arg5 >>> 24;
					local262 = 256 - local259;
					local270 = (arg5 & 0xFF00FF) * local262 & 0xFF00FF00;
					local273 = (arg5 & 0xFF00) * local262 & 0xFF0000;
					local544 = (local270 | local273) >>> 8;
					local335 = local14;
					for (local343 = -arg3; local343 < 0; local343++) {
						local346 = (local16 >> 16) * super.anInt7296;
						for (local361 = -arg2; local361 < 0; local361++) {
							local1196 = this.aByteArray70[(local14 >> 16) + local346];
							if (local1196 == 0) {
								local64++;
							} else {
								local377 = this.anIntArray490[local1196 & 0xFF];
								local270 = (local377 & 0xFF00FF) * local259 & 0xFF00FF00;
								local273 = (local377 & 0xFF00) * local259 & 0xFF0000;
								@Pc(1731) int local1731 = ((local270 | local273) >>> 8) + local544;
								local385 = local252[local64];
								local872 = local1731 + local385;
								local880 = (local1731 & 0xFF00FF) + (local385 & 0xFF00FF);
								@Pc(1757) int local1757 = (local880 & 0x1000100) + (local872 - local880 & 0x10000);
								local252[local64++] = local872 - local1757 | local1757 - (local1757 >>> 8);
							}
							local14 += local44;
						}
						local16 += local50;
						local14 = local335;
						local64 += local152;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (arg4 == 1) {
				local259 = local14;
				for (local262 = -arg3; local262 < 0; local262++) {
					local270 = (local16 >> 16) * super.anInt7296;
					for (local273 = -arg2; local273 < 0; local273++) {
						local252[local64++] = this.anIntArray490[this.aByteArray70[(local14 >> 16) + local270] & 0xFF];
						local14 += local44;
					}
					local16 += local50;
					local14 = local259;
					local64 += local152;
				}
			} else if (arg4 == 0) {
				local259 = arg5 >> 16 & 0xFF;
				local262 = arg5 >> 8 & 0xFF;
				local270 = arg5 & 0xFF;
				local273 = local14;
				for (local335 = -arg3; local335 < 0; local335++) {
					local343 = (local16 >> 16) * super.anInt7296;
					for (local346 = -arg2; local346 < 0; local346++) {
						local361 = this.anIntArray490[this.aByteArray70[(local14 >> 16) + local343] & 0xFF];
						local369 = (local361 & 0xFF0000) * local259 & 0xFF000000;
						local377 = (local361 & 0xFF00) * local262 & 0xFF0000;
						local385 = (local361 & 0xFF) * local270 & 0xFF00;
						local252[local64++] = (local369 | local377 | local385) >>> 8;
						local14 += local44;
					}
					local16 += local50;
					local14 = local273;
					local64 += local152;
				}
			} else if (arg4 == 3) {
				local259 = local14;
				for (local262 = -arg3; local262 < 0; local262++) {
					local270 = (local16 >> 16) * super.anInt7296;
					for (local273 = -arg2; local273 < 0; local273++) {
						local446 = this.aByteArray70[(local14 >> 16) + local270];
						local343 = local446 > 0 ? this.anIntArray490[local446] : 0;
						local346 = local343 + arg5;
						local361 = (local343 & 0xFF00FF) + (arg5 & 0xFF00FF);
						local369 = (local361 & 0x1000100) + (local346 - local361 & 0x10000);
						local252[local64++] = local346 - local369 | local369 - (local369 >>> 8);
						local14 += local44;
					}
					local16 += local50;
					local14 = local259;
					local64 += local152;
				}
			} else if (arg4 == 2) {
				local259 = arg5 >>> 24;
				local262 = 256 - local259;
				local270 = (arg5 & 0xFF00FF) * local262 & 0xFF00FF00;
				local273 = (arg5 & 0xFF00) * local262 & 0xFF0000;
				local544 = (local270 | local273) >>> 8;
				local335 = local14;
				for (local343 = -arg3; local343 < 0; local343++) {
					local346 = (local16 >> 16) * super.anInt7296;
					for (local361 = -arg2; local361 < 0; local361++) {
						local369 = this.anIntArray490[this.aByteArray70[(local14 >> 16) + local346] & 0xFF];
						local270 = (local369 & 0xFF00FF) * local259 & 0xFF00FF00;
						local273 = (local369 & 0xFF00) * local259 & 0xFF0000;
						local252[local64++] = ((local270 | local273) >>> 8) + local544;
						local14 += local44;
					}
					local16 += local50;
					local14 = local335;
					local64 += local152;
				}
			} else {
				throw new IllegalArgumentException();
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)V")
	@Override
	protected void method5928(@OriginalArg(0) int arg0) {
		@Pc(3) int[] local3 = super.aClass162_Sub2_8.anIntArray529;
		@Pc(935) int local935;
		@Pc(9) int local9;
		@Pc(12) int local12;
		@Pc(14) int local14;
		@Pc(16) int local16;
		@Pc(18) int local18;
		@Pc(48) int local48;
		@Pc(51) int local51;
		@Pc(227) byte local227;
		@Pc(255) int local255;
		@Pc(264) int local264;
		@Pc(268) int local268;
		@Pc(272) int local272;
		@Pc(344) int local344;
		if (Static44.anInt7288 == 0) {
			if (Static44.anInt7300 == 0) {
				local9 = Static44.anInt7297;
				while (local9 < 0) {
					local12 = Static44.anInt7274;
					local14 = Static44.anInt7277;
					local16 = Static44.anInt7283;
					local18 = Static44.anInt7286;
					if (local14 >= 0 && local16 >= 0 && local14 - (super.anInt7296 << 12) < 0 && local16 - (super.anInt7293 << 12) < 0) {
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt7296 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 1) {
								local227 = this.aByteArray70[local48];
								if (local227 != 0) {
									local3[local51] = this.anIntArray490[local227 & 0xFF];
								}
							} else if (arg0 == 0) {
								local227 = this.aByteArray70[local48];
								if (local227 != 0) {
									local255 = this.anIntArray490[local227 & 0xFF];
									if ((Static44.anInt7280 & 0xFFFFFF) == 16777215) {
										local264 = Static44.anInt7280 >>> 24;
										local268 = 256 - local264;
										local272 = local3[local51];
										local3[local51] = ((local255 & 0xFF00FF) * local264 + (local272 & 0xFF00FF) * local268 & 0xFF00FF00) + ((local255 & 0xFF00) * local264 + (local272 & 0xFF00) * local268 & 0xFF0000) >> 8;
									} else if (Static44.anInt7281 == 255) {
										local264 = (local255 & 0xFF0000) * Static44.anInt7292 & 0xFF000000;
										local268 = (local255 & 0xFF00) * Static44.anInt7272 & 0xFF0000;
										local272 = (local255 & 0xFF) * Static44.anInt7275 & 0xFF00;
										local3[local51] = (local264 | local268 | local272) >>> 8;
									} else {
										local264 = (local255 & 0xFF0000) * Static44.anInt7292 & 0xFF000000;
										local268 = (local255 & 0xFF00) * Static44.anInt7272 & 0xFF0000;
										local272 = (local255 & 0xFF) * Static44.anInt7275 & 0xFF00;
										local255 = (local264 | local268 | local272) >>> 8;
										local344 = local3[local51];
										local3[local51] = ((local255 & 0xFF00FF) * Static44.anInt7281 + (local344 & 0xFF00FF) * Static44.anInt7291 & 0xFF00FF00) + ((local255 & 0xFF00) * Static44.anInt7281 + (local344 & 0xFF00) * Static44.anInt7291 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local227 = this.aByteArray70[local48];
								local255 = local227 > 0 ? this.anIntArray490[local227] : 0;
								local264 = Static44.anInt7280;
								local268 = local255 + local264;
								local272 = (local255 & 0xFF00FF) + (local264 & 0xFF00FF);
								local344 = (local272 & 0x1000100) + (local268 - local272 & 0x10000);
								local344 = local268 - local344 | local344 - (local344 >>> 8);
								if (local255 == 0 && Static44.anInt7281 != 255) {
									local255 = local344;
									local344 = local3[local51];
									local344 = ((local255 & 0xFF00FF) * Static44.anInt7281 + (local344 & 0xFF00FF) * Static44.anInt7291 & 0xFF00FF00) + ((local255 & 0xFF00) * Static44.anInt7281 + (local344 & 0xFF00) * Static44.anInt7291 & 0xFF0000) >> 8;
								}
								local3[local51] = local344;
							} else if (arg0 == 2) {
								local227 = this.aByteArray70[local48];
								if (local227 != 0) {
									local255 = this.anIntArray490[local227 & 0xFF];
									local264 = (local255 & 0xFF00FF) * Static44.anInt7281 & 0xFF00FF00;
									local268 = (local255 & 0xFF00) * Static44.anInt7281 & 0xFF0000;
									local3[local51++] = ((local264 | local268) >>> 8) + Static44.anInt7284;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local18++;
						}
					}
					local9++;
					Static44.anInt7274 += Static44.anInt7278;
				}
			} else if (Static44.anInt7300 < 0) {
				local9 = Static44.anInt7297;
				while (local9 < 0) {
					local12 = Static44.anInt7274;
					local14 = Static44.anInt7277;
					local16 = Static44.anInt7283 + Static44.anInt7282;
					local18 = Static44.anInt7286;
					if (local14 >= 0 && local14 - (super.anInt7296 << 12) < 0) {
						@Pc(928) int local928;
						if ((local928 = local16 - (super.anInt7293 << 12)) >= 0) {
							local935 = (Static44.anInt7300 - local928) / Static44.anInt7300;
							local18 += local935;
							local16 += Static44.anInt7300 * local935;
							local12 += local935;
						}
						@Pc(956) int local956;
						if ((local956 = (local16 - Static44.anInt7300) / Static44.anInt7300) > local18) {
							local18 = local956;
						}
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt7296 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 1) {
								local227 = this.aByteArray70[local48];
								if (local227 != 0) {
									local3[local51] = this.anIntArray490[local227 & 0xFF];
								}
							} else if (arg0 == 0) {
								local227 = this.aByteArray70[local48];
								if (local227 != 0) {
									local255 = this.anIntArray490[local227 & 0xFF];
									if ((Static44.anInt7280 & 0xFFFFFF) == 16777215) {
										local264 = Static44.anInt7280 >>> 24;
										local268 = 256 - local264;
										local272 = local3[local51];
										local3[local51] = ((local255 & 0xFF00FF) * local264 + (local272 & 0xFF00FF) * local268 & 0xFF00FF00) + ((local255 & 0xFF00) * local264 + (local272 & 0xFF00) * local268 & 0xFF0000) >> 8;
									} else if (Static44.anInt7281 == 255) {
										local264 = (local255 & 0xFF0000) * Static44.anInt7292 & 0xFF000000;
										local268 = (local255 & 0xFF00) * Static44.anInt7272 & 0xFF0000;
										local272 = (local255 & 0xFF) * Static44.anInt7275 & 0xFF00;
										local3[local51] = (local264 | local268 | local272) >>> 8;
									} else {
										local264 = (local255 & 0xFF0000) * Static44.anInt7292 & 0xFF000000;
										local268 = (local255 & 0xFF00) * Static44.anInt7272 & 0xFF0000;
										local272 = (local255 & 0xFF) * Static44.anInt7275 & 0xFF00;
										local255 = (local264 | local268 | local272) >>> 8;
										local344 = local3[local51];
										local3[local51] = ((local255 & 0xFF00FF) * Static44.anInt7281 + (local344 & 0xFF00FF) * Static44.anInt7291 & 0xFF00FF00) + ((local255 & 0xFF00) * Static44.anInt7281 + (local344 & 0xFF00) * Static44.anInt7291 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local227 = this.aByteArray70[local48];
								local255 = local227 > 0 ? this.anIntArray490[local227] : 0;
								local264 = Static44.anInt7280;
								local268 = local255 + local264;
								local272 = (local255 & 0xFF00FF) + (local264 & 0xFF00FF);
								local344 = (local272 & 0x1000100) + (local268 - local272 & 0x10000);
								local344 = local268 - local344 | local344 - (local344 >>> 8);
								if (local255 == 0 && Static44.anInt7281 != 255) {
									local255 = local344;
									local344 = local3[local51];
									local344 = ((local255 & 0xFF00FF) * Static44.anInt7281 + (local344 & 0xFF00FF) * Static44.anInt7291 & 0xFF00FF00) + ((local255 & 0xFF00) * Static44.anInt7281 + (local344 & 0xFF00) * Static44.anInt7291 & 0xFF0000) >> 8;
								}
								local3[local51] = local344;
							} else if (arg0 == 2) {
								local227 = this.aByteArray70[local48];
								if (local227 != 0) {
									local255 = this.anIntArray490[local227 & 0xFF];
									local264 = (local255 & 0xFF00FF) * Static44.anInt7281 & 0xFF00FF00;
									local268 = (local255 & 0xFF00) * Static44.anInt7281 & 0xFF0000;
									local3[local51++] = ((local264 | local268) >>> 8) + Static44.anInt7284;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local16 += Static44.anInt7300;
							local18++;
						}
					}
					local9++;
					Static44.anInt7277 += Static44.anInt7287;
					Static44.anInt7274 += Static44.anInt7278;
				}
			} else {
				local9 = Static44.anInt7297;
				while (local9 < 0) {
					local12 = Static44.anInt7274;
					local14 = Static44.anInt7277;
					local16 = Static44.anInt7283 + Static44.anInt7282;
					local18 = Static44.anInt7286;
					if (local14 >= 0 && local14 - (super.anInt7296 << 12) < 0) {
						if (local16 < 0) {
							local935 = (Static44.anInt7300 - local16 - 1) / Static44.anInt7300;
							local18 += local935;
							local16 += Static44.anInt7300 * local935;
							local12 += local935;
						}
						@Pc(1888) int local1888;
						if ((local1888 = (local16 + 1 - (super.anInt7293 << 12) - Static44.anInt7300) / Static44.anInt7300) > local18) {
							local18 = local1888;
						}
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt7296 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 1) {
								local227 = this.aByteArray70[local48];
								if (local227 != 0) {
									local3[local51] = this.anIntArray490[local227 & 0xFF];
								}
							} else if (arg0 == 0) {
								local227 = this.aByteArray70[local48];
								if (local227 != 0) {
									local255 = this.anIntArray490[local227 & 0xFF];
									if ((Static44.anInt7280 & 0xFFFFFF) == 16777215) {
										local264 = Static44.anInt7280 >>> 24;
										local268 = 256 - local264;
										local272 = local3[local51];
										local3[local51] = ((local255 & 0xFF00FF) * local264 + (local272 & 0xFF00FF) * local268 & 0xFF00FF00) + ((local255 & 0xFF00) * local264 + (local272 & 0xFF00) * local268 & 0xFF0000) >> 8;
									} else if (Static44.anInt7281 == 255) {
										local264 = (local255 & 0xFF0000) * Static44.anInt7292 & 0xFF000000;
										local268 = (local255 & 0xFF00) * Static44.anInt7272 & 0xFF0000;
										local272 = (local255 & 0xFF) * Static44.anInt7275 & 0xFF00;
										local3[local51] = (local264 | local268 | local272) >>> 8;
									} else {
										local264 = (local255 & 0xFF0000) * Static44.anInt7292 & 0xFF000000;
										local268 = (local255 & 0xFF00) * Static44.anInt7272 & 0xFF0000;
										local272 = (local255 & 0xFF) * Static44.anInt7275 & 0xFF00;
										local255 = (local264 | local268 | local272) >>> 8;
										local344 = local3[local51];
										local3[local51] = ((local255 & 0xFF00FF) * Static44.anInt7281 + (local344 & 0xFF00FF) * Static44.anInt7291 & 0xFF00FF00) + ((local255 & 0xFF00) * Static44.anInt7281 + (local344 & 0xFF00) * Static44.anInt7291 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local227 = this.aByteArray70[local48];
								local255 = local227 > 0 ? this.anIntArray490[local227] : 0;
								local264 = Static44.anInt7280;
								local268 = local255 + local264;
								local272 = (local255 & 0xFF00FF) + (local264 & 0xFF00FF);
								local344 = (local272 & 0x1000100) + (local268 - local272 & 0x10000);
								local344 = local268 - local344 | local344 - (local344 >>> 8);
								if (local255 == 0 && Static44.anInt7281 != 255) {
									local255 = local344;
									local344 = local3[local51];
									local344 = ((local255 & 0xFF00FF) * Static44.anInt7281 + (local344 & 0xFF00FF) * Static44.anInt7291 & 0xFF00FF00) + ((local255 & 0xFF00) * Static44.anInt7281 + (local344 & 0xFF00) * Static44.anInt7291 & 0xFF0000) >> 8;
								}
								local3[local51] = local344;
							} else if (arg0 == 2) {
								local227 = this.aByteArray70[local48];
								if (local227 != 0) {
									local255 = this.anIntArray490[local227 & 0xFF];
									local264 = (local255 & 0xFF00FF) * Static44.anInt7281 & 0xFF00FF00;
									local268 = (local255 & 0xFF00) * Static44.anInt7281 & 0xFF0000;
									local3[local51++] = ((local264 | local268) >>> 8) + Static44.anInt7284;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local16 += Static44.anInt7300;
							local18++;
						}
					}
					local9++;
					Static44.anInt7277 += Static44.anInt7287;
					Static44.anInt7274 += Static44.anInt7278;
				}
			}
		} else if (Static44.anInt7288 < 0) {
			if (Static44.anInt7300 == 0) {
				local9 = Static44.anInt7297;
				while (local9 < 0) {
					local12 = Static44.anInt7274;
					local14 = Static44.anInt7277 + Static44.anInt7298;
					local16 = Static44.anInt7283;
					local18 = Static44.anInt7286;
					if (local16 >= 0 && local16 - (super.anInt7293 << 12) < 0) {
						@Pc(2794) int local2794;
						if ((local2794 = local14 - (super.anInt7296 << 12)) >= 0) {
							local935 = (Static44.anInt7288 - local2794) / Static44.anInt7288;
							local18 += local935;
							local14 += Static44.anInt7288 * local935;
							local12 += local935;
						}
						@Pc(2822) int local2822;
						if ((local2822 = (local14 - Static44.anInt7288) / Static44.anInt7288) > local18) {
							local18 = local2822;
						}
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt7296 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 1) {
								local227 = this.aByteArray70[local48];
								if (local227 != 0) {
									local3[local51] = this.anIntArray490[local227 & 0xFF];
								}
							} else if (arg0 == 0) {
								local227 = this.aByteArray70[local48];
								if (local227 != 0) {
									local255 = this.anIntArray490[local227 & 0xFF];
									if ((Static44.anInt7280 & 0xFFFFFF) == 16777215) {
										local264 = Static44.anInt7280 >>> 24;
										local268 = 256 - local264;
										local272 = local3[local51];
										local3[local51] = ((local255 & 0xFF00FF) * local264 + (local272 & 0xFF00FF) * local268 & 0xFF00FF00) + ((local255 & 0xFF00) * local264 + (local272 & 0xFF00) * local268 & 0xFF0000) >> 8;
									} else if (Static44.anInt7281 == 255) {
										local264 = (local255 & 0xFF0000) * Static44.anInt7292 & 0xFF000000;
										local268 = (local255 & 0xFF00) * Static44.anInt7272 & 0xFF0000;
										local272 = (local255 & 0xFF) * Static44.anInt7275 & 0xFF00;
										local3[local51] = (local264 | local268 | local272) >>> 8;
									} else {
										local264 = (local255 & 0xFF0000) * Static44.anInt7292 & 0xFF000000;
										local268 = (local255 & 0xFF00) * Static44.anInt7272 & 0xFF0000;
										local272 = (local255 & 0xFF) * Static44.anInt7275 & 0xFF00;
										local255 = (local264 | local268 | local272) >>> 8;
										local344 = local3[local51];
										local3[local51] = ((local255 & 0xFF00FF) * Static44.anInt7281 + (local344 & 0xFF00FF) * Static44.anInt7291 & 0xFF00FF00) + ((local255 & 0xFF00) * Static44.anInt7281 + (local344 & 0xFF00) * Static44.anInt7291 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local227 = this.aByteArray70[local48];
								local255 = local227 > 0 ? this.anIntArray490[local227] : 0;
								local264 = Static44.anInt7280;
								local268 = local255 + local264;
								local272 = (local255 & 0xFF00FF) + (local264 & 0xFF00FF);
								local344 = (local272 & 0x1000100) + (local268 - local272 & 0x10000);
								local344 = local268 - local344 | local344 - (local344 >>> 8);
								if (local255 == 0 && Static44.anInt7281 != 255) {
									local255 = local344;
									local344 = local3[local51];
									local344 = ((local255 & 0xFF00FF) * Static44.anInt7281 + (local344 & 0xFF00FF) * Static44.anInt7291 & 0xFF00FF00) + ((local255 & 0xFF00) * Static44.anInt7281 + (local344 & 0xFF00) * Static44.anInt7291 & 0xFF0000) >> 8;
								}
								local3[local51] = local344;
							} else if (arg0 == 2) {
								local227 = this.aByteArray70[local48];
								if (local227 != 0) {
									local255 = this.anIntArray490[local227 & 0xFF];
									local264 = (local255 & 0xFF00FF) * Static44.anInt7281 & 0xFF00FF00;
									local268 = (local255 & 0xFF00) * Static44.anInt7281 & 0xFF0000;
									local3[local51++] = ((local264 | local268) >>> 8) + Static44.anInt7284;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local14 += Static44.anInt7288;
							local18++;
						}
					}
					local9++;
					Static44.anInt7283 += Static44.anInt7289;
					Static44.anInt7274 += Static44.anInt7278;
				}
			} else if (Static44.anInt7300 < 0) {
				local9 = Static44.anInt7297;
				while (local9 < 0) {
					local12 = Static44.anInt7274;
					local14 = Static44.anInt7277 + Static44.anInt7298;
					local16 = Static44.anInt7283 + Static44.anInt7282;
					local18 = Static44.anInt7286;
					@Pc(3719) int local3719;
					if ((local3719 = local14 - (super.anInt7296 << 12)) >= 0) {
						local935 = (Static44.anInt7288 - local3719) / Static44.anInt7288;
						local18 += local935;
						local14 += Static44.anInt7288 * local935;
						local16 += Static44.anInt7300 * local935;
						local12 += local935;
					}
					@Pc(3753) int local3753;
					if ((local3753 = (local14 - Static44.anInt7288) / Static44.anInt7288) > local18) {
						local18 = local3753;
					}
					@Pc(3765) int local3765;
					if ((local3765 = local16 - (super.anInt7293 << 12)) >= 0) {
						local935 = (Static44.anInt7300 - local3765) / Static44.anInt7300;
						local18 += local935;
						local14 += Static44.anInt7288 * local935;
						local16 += Static44.anInt7300 * local935;
						local12 += local935;
					}
					@Pc(3799) int local3799;
					if ((local3799 = (local16 - Static44.anInt7300) / Static44.anInt7300) > local18) {
						local18 = local3799;
					}
					while (local18 < 0) {
						local48 = (local16 >> 12) * super.anInt7296 + (local14 >> 12);
						local51 = local12++;
						if (arg0 == 1) {
							local227 = this.aByteArray70[local48];
							if (local227 != 0) {
								local3[local51] = this.anIntArray490[local227 & 0xFF];
							}
						} else if (arg0 == 0) {
							local227 = this.aByteArray70[local48];
							if (local227 != 0) {
								local255 = this.anIntArray490[local227 & 0xFF];
								if ((Static44.anInt7280 & 0xFFFFFF) == 16777215) {
									local264 = Static44.anInt7280 >>> 24;
									local268 = 256 - local264;
									local272 = local3[local51];
									local3[local51] = ((local255 & 0xFF00FF) * local264 + (local272 & 0xFF00FF) * local268 & 0xFF00FF00) + ((local255 & 0xFF00) * local264 + (local272 & 0xFF00) * local268 & 0xFF0000) >> 8;
								} else if (Static44.anInt7281 == 255) {
									local264 = (local255 & 0xFF0000) * Static44.anInt7292 & 0xFF000000;
									local268 = (local255 & 0xFF00) * Static44.anInt7272 & 0xFF0000;
									local272 = (local255 & 0xFF) * Static44.anInt7275 & 0xFF00;
									local3[local51] = (local264 | local268 | local272) >>> 8;
								} else {
									local264 = (local255 & 0xFF0000) * Static44.anInt7292 & 0xFF000000;
									local268 = (local255 & 0xFF00) * Static44.anInt7272 & 0xFF0000;
									local272 = (local255 & 0xFF) * Static44.anInt7275 & 0xFF00;
									local255 = (local264 | local268 | local272) >>> 8;
									local344 = local3[local51];
									local3[local51] = ((local255 & 0xFF00FF) * Static44.anInt7281 + (local344 & 0xFF00FF) * Static44.anInt7291 & 0xFF00FF00) + ((local255 & 0xFF00) * Static44.anInt7281 + (local344 & 0xFF00) * Static44.anInt7291 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							local227 = this.aByteArray70[local48];
							local255 = local227 > 0 ? this.anIntArray490[local227] : 0;
							local264 = Static44.anInt7280;
							local268 = local255 + local264;
							local272 = (local255 & 0xFF00FF) + (local264 & 0xFF00FF);
							local344 = (local272 & 0x1000100) + (local268 - local272 & 0x10000);
							local344 = local268 - local344 | local344 - (local344 >>> 8);
							if (local255 == 0 && Static44.anInt7281 != 255) {
								local255 = local344;
								local344 = local3[local51];
								local344 = ((local255 & 0xFF00FF) * Static44.anInt7281 + (local344 & 0xFF00FF) * Static44.anInt7291 & 0xFF00FF00) + ((local255 & 0xFF00) * Static44.anInt7281 + (local344 & 0xFF00) * Static44.anInt7291 & 0xFF0000) >> 8;
							}
							local3[local51] = local344;
						} else if (arg0 == 2) {
							local227 = this.aByteArray70[local48];
							if (local227 != 0) {
								local255 = this.anIntArray490[local227 & 0xFF];
								local264 = (local255 & 0xFF00FF) * Static44.anInt7281 & 0xFF00FF00;
								local268 = (local255 & 0xFF00) * Static44.anInt7281 & 0xFF0000;
								local3[local51++] = ((local264 | local268) >>> 8) + Static44.anInt7284;
							}
						} else {
							throw new IllegalArgumentException();
						}
						local14 += Static44.anInt7288;
						local16 += Static44.anInt7300;
						local18++;
					}
					local9++;
					Static44.anInt7277 += Static44.anInt7287;
					Static44.anInt7283 += Static44.anInt7289;
					Static44.anInt7274 += Static44.anInt7278;
				}
			} else {
				local9 = Static44.anInt7297;
				while (local9 < 0) {
					local12 = Static44.anInt7274;
					local14 = Static44.anInt7277 + Static44.anInt7298;
					local16 = Static44.anInt7283 + Static44.anInt7282;
					local18 = Static44.anInt7286;
					@Pc(4702) int local4702;
					if ((local4702 = local14 - (super.anInt7296 << 12)) >= 0) {
						local935 = (Static44.anInt7288 - local4702) / Static44.anInt7288;
						local18 += local935;
						local14 += Static44.anInt7288 * local935;
						local16 += Static44.anInt7300 * local935;
						local12 += local935;
					}
					@Pc(4736) int local4736;
					if ((local4736 = (local14 - Static44.anInt7288) / Static44.anInt7288) > local18) {
						local18 = local4736;
					}
					if (local16 < 0) {
						local935 = (Static44.anInt7300 - local16 - 1) / Static44.anInt7300;
						local18 += local935;
						local14 += Static44.anInt7288 * local935;
						local16 += Static44.anInt7300 * local935;
						local12 += local935;
					}
					@Pc(4784) int local4784;
					if ((local4784 = (local16 + 1 - (super.anInt7293 << 12) - Static44.anInt7300) / Static44.anInt7300) > local18) {
						local18 = local4784;
					}
					while (local18 < 0) {
						local48 = (local16 >> 12) * super.anInt7296 + (local14 >> 12);
						local51 = local12++;
						if (arg0 == 1) {
							local227 = this.aByteArray70[local48];
							if (local227 != 0) {
								local3[local51] = this.anIntArray490[local227 & 0xFF];
							}
						} else if (arg0 == 0) {
							local227 = this.aByteArray70[local48];
							if (local227 != 0) {
								local255 = this.anIntArray490[local227 & 0xFF];
								if ((Static44.anInt7280 & 0xFFFFFF) == 16777215) {
									local264 = Static44.anInt7280 >>> 24;
									local268 = 256 - local264;
									local272 = local3[local51];
									local3[local51] = ((local255 & 0xFF00FF) * local264 + (local272 & 0xFF00FF) * local268 & 0xFF00FF00) + ((local255 & 0xFF00) * local264 + (local272 & 0xFF00) * local268 & 0xFF0000) >> 8;
								} else if (Static44.anInt7281 == 255) {
									local264 = (local255 & 0xFF0000) * Static44.anInt7292 & 0xFF000000;
									local268 = (local255 & 0xFF00) * Static44.anInt7272 & 0xFF0000;
									local272 = (local255 & 0xFF) * Static44.anInt7275 & 0xFF00;
									local3[local51] = (local264 | local268 | local272) >>> 8;
								} else {
									local264 = (local255 & 0xFF0000) * Static44.anInt7292 & 0xFF000000;
									local268 = (local255 & 0xFF00) * Static44.anInt7272 & 0xFF0000;
									local272 = (local255 & 0xFF) * Static44.anInt7275 & 0xFF00;
									local255 = (local264 | local268 | local272) >>> 8;
									local344 = local3[local51];
									local3[local51] = ((local255 & 0xFF00FF) * Static44.anInt7281 + (local344 & 0xFF00FF) * Static44.anInt7291 & 0xFF00FF00) + ((local255 & 0xFF00) * Static44.anInt7281 + (local344 & 0xFF00) * Static44.anInt7291 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							local227 = this.aByteArray70[local48];
							local255 = local227 > 0 ? this.anIntArray490[local227] : 0;
							local264 = Static44.anInt7280;
							local268 = local255 + local264;
							local272 = (local255 & 0xFF00FF) + (local264 & 0xFF00FF);
							local344 = (local272 & 0x1000100) + (local268 - local272 & 0x10000);
							local344 = local268 - local344 | local344 - (local344 >>> 8);
							if (local255 == 0 && Static44.anInt7281 != 255) {
								local255 = local344;
								local344 = local3[local51];
								local344 = ((local255 & 0xFF00FF) * Static44.anInt7281 + (local344 & 0xFF00FF) * Static44.anInt7291 & 0xFF00FF00) + ((local255 & 0xFF00) * Static44.anInt7281 + (local344 & 0xFF00) * Static44.anInt7291 & 0xFF0000) >> 8;
							}
							local3[local51] = local344;
						} else if (arg0 == 2) {
							local227 = this.aByteArray70[local48];
							if (local227 != 0) {
								local255 = this.anIntArray490[local227 & 0xFF];
								local264 = (local255 & 0xFF00FF) * Static44.anInt7281 & 0xFF00FF00;
								local268 = (local255 & 0xFF00) * Static44.anInt7281 & 0xFF0000;
								local3[local51++] = ((local264 | local268) >>> 8) + Static44.anInt7284;
							}
						} else {
							throw new IllegalArgumentException();
						}
						local14 += Static44.anInt7288;
						local16 += Static44.anInt7300;
						local18++;
					}
					local9++;
					Static44.anInt7277 += Static44.anInt7287;
					Static44.anInt7283 += Static44.anInt7289;
					Static44.anInt7274 += Static44.anInt7278;
				}
			}
		} else if (Static44.anInt7300 == 0) {
			local9 = Static44.anInt7297;
			while (local9 < 0) {
				local12 = Static44.anInt7274;
				local14 = Static44.anInt7277 + Static44.anInt7298;
				local16 = Static44.anInt7283;
				local18 = Static44.anInt7286;
				if (local16 >= 0 && local16 - (super.anInt7293 << 12) < 0) {
					if (local14 < 0) {
						local935 = (Static44.anInt7288 - local14 - 1) / Static44.anInt7288;
						local18 += local935;
						local14 += Static44.anInt7288 * local935;
						local12 += local935;
					}
					@Pc(5726) int local5726;
					if ((local5726 = (local14 + 1 - (super.anInt7296 << 12) - Static44.anInt7288) / Static44.anInt7288) > local18) {
						local18 = local5726;
					}
					while (local18 < 0) {
						local48 = (local16 >> 12) * super.anInt7296 + (local14 >> 12);
						local51 = local12++;
						if (arg0 == 1) {
							local227 = this.aByteArray70[local48];
							if (local227 != 0) {
								local3[local51] = this.anIntArray490[local227 & 0xFF];
							}
						} else if (arg0 == 0) {
							local227 = this.aByteArray70[local48];
							if (local227 != 0) {
								local255 = this.anIntArray490[local227 & 0xFF];
								if ((Static44.anInt7280 & 0xFFFFFF) == 16777215) {
									local264 = Static44.anInt7280 >>> 24;
									local268 = 256 - local264;
									local272 = local3[local51];
									local3[local51] = ((local255 & 0xFF00FF) * local264 + (local272 & 0xFF00FF) * local268 & 0xFF00FF00) + ((local255 & 0xFF00) * local264 + (local272 & 0xFF00) * local268 & 0xFF0000) >> 8;
								} else if (Static44.anInt7281 == 255) {
									local264 = (local255 & 0xFF0000) * Static44.anInt7292 & 0xFF000000;
									local268 = (local255 & 0xFF00) * Static44.anInt7272 & 0xFF0000;
									local272 = (local255 & 0xFF) * Static44.anInt7275 & 0xFF00;
									local3[local51] = (local264 | local268 | local272) >>> 8;
								} else {
									local264 = (local255 & 0xFF0000) * Static44.anInt7292 & 0xFF000000;
									local268 = (local255 & 0xFF00) * Static44.anInt7272 & 0xFF0000;
									local272 = (local255 & 0xFF) * Static44.anInt7275 & 0xFF00;
									local255 = (local264 | local268 | local272) >>> 8;
									local344 = local3[local51];
									local3[local51] = ((local255 & 0xFF00FF) * Static44.anInt7281 + (local344 & 0xFF00FF) * Static44.anInt7291 & 0xFF00FF00) + ((local255 & 0xFF00) * Static44.anInt7281 + (local344 & 0xFF00) * Static44.anInt7291 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							local227 = this.aByteArray70[local48];
							local255 = local227 > 0 ? this.anIntArray490[local227] : 0;
							local264 = Static44.anInt7280;
							local268 = local255 + local264;
							local272 = (local255 & 0xFF00FF) + (local264 & 0xFF00FF);
							local344 = (local272 & 0x1000100) + (local268 - local272 & 0x10000);
							local344 = local268 - local344 | local344 - (local344 >>> 8);
							if (local255 == 0 && Static44.anInt7281 != 255) {
								local255 = local344;
								local344 = local3[local51];
								local344 = ((local255 & 0xFF00FF) * Static44.anInt7281 + (local344 & 0xFF00FF) * Static44.anInt7291 & 0xFF00FF00) + ((local255 & 0xFF00) * Static44.anInt7281 + (local344 & 0xFF00) * Static44.anInt7291 & 0xFF0000) >> 8;
							}
							local3[local51] = local344;
						} else if (arg0 == 2) {
							local227 = this.aByteArray70[local48];
							if (local227 != 0) {
								local255 = this.anIntArray490[local227 & 0xFF];
								local264 = (local255 & 0xFF00FF) * Static44.anInt7281 & 0xFF00FF00;
								local268 = (local255 & 0xFF00) * Static44.anInt7281 & 0xFF0000;
								local3[local51++] = ((local264 | local268) >>> 8) + Static44.anInt7284;
							}
						} else {
							throw new IllegalArgumentException();
						}
						local14 += Static44.anInt7288;
						local18++;
					}
				}
				local9++;
				Static44.anInt7277 += Static44.anInt7287;
				Static44.anInt7283 += Static44.anInt7289;
				Static44.anInt7274 += Static44.anInt7278;
			}
		} else if (Static44.anInt7300 < 0) {
			for (local9 = Static44.anInt7297; local9 < 0; local9++) {
				local12 = Static44.anInt7274;
				local14 = Static44.anInt7277 + Static44.anInt7298;
				local16 = Static44.anInt7283 + Static44.anInt7282;
				local18 = Static44.anInt7286;
				if (local14 < 0) {
					local935 = (Static44.anInt7288 - local14 - 1) / Static44.anInt7288;
					local18 += local935;
					local14 += Static44.anInt7288 * local935;
					local16 += Static44.anInt7300 * local935;
					local12 += local935;
				}
				@Pc(6663) int local6663;
				if ((local6663 = (local14 + 1 - (super.anInt7296 << 12) - Static44.anInt7288) / Static44.anInt7288) > local18) {
					local18 = local6663;
				}
				@Pc(6675) int local6675;
				if ((local6675 = local16 - (super.anInt7293 << 12)) >= 0) {
					local935 = (Static44.anInt7300 - local6675) / Static44.anInt7300;
					local18 += local935;
					local14 += Static44.anInt7288 * local935;
					local16 += Static44.anInt7300 * local935;
					local12 += local935;
				}
				@Pc(6709) int local6709;
				if ((local6709 = (local16 - Static44.anInt7300) / Static44.anInt7300) > local18) {
					local18 = local6709;
				}
				while (local18 < 0) {
					local48 = (local16 >> 12) * super.anInt7296 + (local14 >> 12);
					local51 = local12++;
					if (arg0 == 1) {
						local227 = this.aByteArray70[local48];
						if (local227 != 0) {
							local3[local51] = this.anIntArray490[local227 & 0xFF];
						}
					} else if (arg0 == 0) {
						local227 = this.aByteArray70[local48];
						if (local227 != 0) {
							local255 = this.anIntArray490[local227 & 0xFF];
							if ((Static44.anInt7280 & 0xFFFFFF) == 16777215) {
								local264 = Static44.anInt7280 >>> 24;
								local268 = 256 - local264;
								local272 = local3[local51];
								local3[local51] = ((local255 & 0xFF00FF) * local264 + (local272 & 0xFF00FF) * local268 & 0xFF00FF00) + ((local255 & 0xFF00) * local264 + (local272 & 0xFF00) * local268 & 0xFF0000) >> 8;
							} else if (Static44.anInt7281 == 255) {
								local264 = (local255 & 0xFF0000) * Static44.anInt7292 & 0xFF000000;
								local268 = (local255 & 0xFF00) * Static44.anInt7272 & 0xFF0000;
								local272 = (local255 & 0xFF) * Static44.anInt7275 & 0xFF00;
								local3[local51] = (local264 | local268 | local272) >>> 8;
							} else {
								local264 = (local255 & 0xFF0000) * Static44.anInt7292 & 0xFF000000;
								local268 = (local255 & 0xFF00) * Static44.anInt7272 & 0xFF0000;
								local272 = (local255 & 0xFF) * Static44.anInt7275 & 0xFF00;
								local255 = (local264 | local268 | local272) >>> 8;
								local344 = local3[local51];
								local3[local51] = ((local255 & 0xFF00FF) * Static44.anInt7281 + (local344 & 0xFF00FF) * Static44.anInt7291 & 0xFF00FF00) + ((local255 & 0xFF00) * Static44.anInt7281 + (local344 & 0xFF00) * Static44.anInt7291 & 0xFF0000) >> 8;
							}
						}
					} else if (arg0 == 3) {
						local227 = this.aByteArray70[local48];
						local255 = local227 > 0 ? this.anIntArray490[local227] : 0;
						local264 = Static44.anInt7280;
						local268 = local255 + local264;
						local272 = (local255 & 0xFF00FF) + (local264 & 0xFF00FF);
						local344 = (local272 & 0x1000100) + (local268 - local272 & 0x10000);
						local344 = local268 - local344 | local344 - (local344 >>> 8);
						if (local255 == 0 && Static44.anInt7281 != 255) {
							local255 = local344;
							local344 = local3[local51];
							local344 = ((local255 & 0xFF00FF) * Static44.anInt7281 + (local344 & 0xFF00FF) * Static44.anInt7291 & 0xFF00FF00) + ((local255 & 0xFF00) * Static44.anInt7281 + (local344 & 0xFF00) * Static44.anInt7291 & 0xFF0000) >> 8;
						}
						local3[local51] = local344;
					} else if (arg0 == 2) {
						local227 = this.aByteArray70[local48];
						if (local227 != 0) {
							local255 = this.anIntArray490[local227 & 0xFF];
							local264 = (local255 & 0xFF00FF) * Static44.anInt7281 & 0xFF00FF00;
							local268 = (local255 & 0xFF00) * Static44.anInt7281 & 0xFF0000;
							local3[local51++] = ((local264 | local268) >>> 8) + Static44.anInt7284;
						}
					} else {
						throw new IllegalArgumentException();
					}
					local14 += Static44.anInt7288;
					local16 += Static44.anInt7300;
					local18++;
				}
				Static44.anInt7277 += Static44.anInt7287;
				Static44.anInt7283 += Static44.anInt7289;
				Static44.anInt7274 += Static44.anInt7278;
			}
		} else {
			for (local9 = Static44.anInt7297; local9 < 0; local9++) {
				local12 = Static44.anInt7274;
				local14 = Static44.anInt7277 + Static44.anInt7298;
				local16 = Static44.anInt7283 + Static44.anInt7282;
				local18 = Static44.anInt7286;
				if (local14 < 0) {
					local935 = (Static44.anInt7288 - local14 - 1) / Static44.anInt7288;
					local18 += local935;
					local14 += Static44.anInt7288 * local935;
					local16 += Static44.anInt7300 * local935;
					local12 += local935;
				}
				@Pc(7648) int local7648;
				if ((local7648 = (local14 + 1 - (super.anInt7296 << 12) - Static44.anInt7288) / Static44.anInt7288) > local18) {
					local18 = local7648;
				}
				if (local16 < 0) {
					local935 = (Static44.anInt7300 - local16 - 1) / Static44.anInt7300;
					local18 += local935;
					local14 += Static44.anInt7288 * local935;
					local16 += Static44.anInt7300 * local935;
					local12 += local935;
				}
				@Pc(7696) int local7696;
				if ((local7696 = (local16 + 1 - (super.anInt7293 << 12) - Static44.anInt7300) / Static44.anInt7300) > local18) {
					local18 = local7696;
				}
				while (local18 < 0) {
					local48 = (local16 >> 12) * super.anInt7296 + (local14 >> 12);
					local51 = local12++;
					if (arg0 == 1) {
						local227 = this.aByteArray70[local48];
						if (local227 != 0) {
							local3[local51] = this.anIntArray490[local227 & 0xFF];
						}
					} else if (arg0 == 0) {
						local227 = this.aByteArray70[local48];
						if (local227 != 0) {
							local255 = this.anIntArray490[local227 & 0xFF];
							if ((Static44.anInt7280 & 0xFFFFFF) == 16777215) {
								local264 = Static44.anInt7280 >>> 24;
								local268 = 256 - local264;
								local272 = local3[local51];
								local3[local51] = ((local255 & 0xFF00FF) * local264 + (local272 & 0xFF00FF) * local268 & 0xFF00FF00) + ((local255 & 0xFF00) * local264 + (local272 & 0xFF00) * local268 & 0xFF0000) >> 8;
							} else if (Static44.anInt7281 == 255) {
								local264 = (local255 & 0xFF0000) * Static44.anInt7292 & 0xFF000000;
								local268 = (local255 & 0xFF00) * Static44.anInt7272 & 0xFF0000;
								local272 = (local255 & 0xFF) * Static44.anInt7275 & 0xFF00;
								local3[local51] = (local264 | local268 | local272) >>> 8;
							} else {
								local264 = (local255 & 0xFF0000) * Static44.anInt7292 & 0xFF000000;
								local268 = (local255 & 0xFF00) * Static44.anInt7272 & 0xFF0000;
								local272 = (local255 & 0xFF) * Static44.anInt7275 & 0xFF00;
								local255 = (local264 | local268 | local272) >>> 8;
								local344 = local3[local51];
								local3[local51] = ((local255 & 0xFF00FF) * Static44.anInt7281 + (local344 & 0xFF00FF) * Static44.anInt7291 & 0xFF00FF00) + ((local255 & 0xFF00) * Static44.anInt7281 + (local344 & 0xFF00) * Static44.anInt7291 & 0xFF0000) >> 8;
							}
						}
					} else if (arg0 == 3) {
						local227 = this.aByteArray70[local48];
						local255 = local227 > 0 ? this.anIntArray490[local227] : 0;
						local264 = Static44.anInt7280;
						local268 = local255 + local264;
						local272 = (local255 & 0xFF00FF) + (local264 & 0xFF00FF);
						local344 = (local272 & 0x1000100) + (local268 - local272 & 0x10000);
						local344 = local268 - local344 | local344 - (local344 >>> 8);
						if (local255 == 0 && Static44.anInt7281 != 255) {
							local255 = local344;
							local344 = local3[local51];
							local344 = ((local255 & 0xFF00FF) * Static44.anInt7281 + (local344 & 0xFF00FF) * Static44.anInt7291 & 0xFF00FF00) + ((local255 & 0xFF00) * Static44.anInt7281 + (local344 & 0xFF00) * Static44.anInt7291 & 0xFF0000) >> 8;
						}
						local3[local51] = local344;
					} else if (arg0 == 2) {
						local227 = this.aByteArray70[local48];
						if (local227 != 0) {
							local255 = this.anIntArray490[local227 & 0xFF];
							local264 = (local255 & 0xFF00FF) * Static44.anInt7281 & 0xFF00FF00;
							local268 = (local255 & 0xFF00) * Static44.anInt7281 & 0xFF0000;
							local3[local51++] = ((local264 | local268) >>> 8) + Static44.anInt7284;
						}
					} else {
						throw new IllegalArgumentException();
					}
					local14 += Static44.anInt7288;
					local16 += Static44.anInt7300;
					local18++;
				}
				Static44.anInt7277 += Static44.anInt7287;
				Static44.anInt7283 += Static44.anInt7289;
				Static44.anInt7274 += Static44.anInt7278;
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "da", descriptor = "(IIIIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILclient!ua;II)V")
	@Override
	public void method7464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class84 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (super.aClass162_Sub2_8.method6432()) {
			throw new IllegalStateException();
		}
		arg0 += super.anInt7271;
		arg1 += super.anInt7299;
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = super.aClass162_Sub2_8.anInt7902;
		@Pc(26) int local26 = super.anInt7296;
		@Pc(29) int local29 = super.anInt7293;
		@Pc(33) int local33 = local23 - local26;
		@Pc(35) int local35 = 0;
		@Pc(41) int local41 = arg0 + arg1 * local23;
		@Pc(52) int local52;
		if (arg1 < super.aClass162_Sub2_8.anInt7894) {
			local52 = super.aClass162_Sub2_8.anInt7894 - arg1;
			local29 -= local52;
			arg1 = super.aClass162_Sub2_8.anInt7894;
			local19 = local52 * local26;
			local41 += local52 * local23;
		}
		if (arg1 + local29 > super.aClass162_Sub2_8.anInt7884) {
			local29 -= arg1 + local29 - super.aClass162_Sub2_8.anInt7884;
		}
		if (arg0 < super.aClass162_Sub2_8.anInt7898) {
			local52 = super.aClass162_Sub2_8.anInt7898 - arg0;
			local26 -= local52;
			arg0 = super.aClass162_Sub2_8.anInt7898;
			local19 += local52;
			local41 += local52;
			local35 = local52;
			local33 += local52;
		}
		if (arg0 + local26 > super.aClass162_Sub2_8.anInt7885) {
			local52 = arg0 + local26 - super.aClass162_Sub2_8.anInt7885;
			local26 -= local52;
			local35 += local52;
			local33 += local52;
		}
		if (local26 <= 0 || local29 <= 0) {
			return;
		}
		@Pc(159) Class84_Sub1 local159 = (Class84_Sub1) arg2;
		@Pc(162) int[] local162 = local159.anIntArray167;
		@Pc(165) int[] local165 = local159.anIntArray166;
		@Pc(169) int[] local169 = super.aClass162_Sub2_8.anIntArray529;
		@Pc(171) int local171 = arg1;
		if (arg4 > arg1) {
			local171 = arg4;
			local41 += (arg4 - arg1) * local23;
			local19 += (arg4 - arg1) * super.anInt7296;
		}
		@Pc(210) int local210 = arg4 + local162.length < arg1 + local29 ? arg4 + local162.length : arg1 + local29;
		for (@Pc(212) int local212 = local171; local212 < local210; local212++) {
			@Pc(221) int local221 = local162[local212 - arg4] + arg3;
			@Pc(227) int local227 = local165[local212 - arg4];
			@Pc(229) int local229 = local26;
			@Pc(236) int local236;
			if (arg0 > local221) {
				local236 = arg0 - local221;
				if (local236 >= local227) {
					local19 += local26 + local35;
					local41 += local26 + local33;
					continue;
				}
				local227 -= local236;
			} else {
				local236 = local221 - arg0;
				if (local236 >= local26) {
					local19 += local26 + local35;
					local41 += local26 + local33;
					continue;
				}
				local19 += local236;
				local229 = local26 - local236;
				local41 += local236;
			}
			local236 = 0;
			if (local229 < local227) {
				local227 = local229;
			} else {
				local236 = local229 - local227;
			}
			for (@Pc(304) int local304 = -local227; local304 < 0; local304++) {
				@Pc(311) byte local311 = this.aByteArray70[local19++];
				if (local311 == 0) {
					local41++;
				} else {
					local169[local41++] = this.anIntArray490[local311 & 0xFF];
				}
			}
			local19 += local236 + local35;
			local41 += local236 + local33;
		}
	}

	@OriginalMember(owner = "client!rc", name = "xa", descriptor = "(III)V")
	@Override
	public void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rc", name = "V", descriptor = "(IIIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (super.aClass162_Sub2_8.method6432()) {
			throw new IllegalStateException();
		}
		@Pc(11) int local11 = super.aClass162_Sub2_8.anInt7902;
		arg0 += super.anInt7271;
		arg1 += super.anInt7299;
		@Pc(27) int local27 = arg1 * local11 + arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = super.anInt7293;
		@Pc(35) int local35 = super.anInt7296;
		@Pc(39) int local39 = local11 - local35;
		@Pc(41) int local41 = 0;
		@Pc(52) int local52;
		if (arg1 < super.aClass162_Sub2_8.anInt7894) {
			local52 = super.aClass162_Sub2_8.anInt7894 - arg1;
			local32 -= local52;
			arg1 = super.aClass162_Sub2_8.anInt7894;
			local29 += local52 * local35;
			local27 += local52 * local11;
		}
		if (arg1 + local32 > super.aClass162_Sub2_8.anInt7884) {
			local32 -= arg1 + local32 - super.aClass162_Sub2_8.anInt7884;
		}
		if (arg0 < super.aClass162_Sub2_8.anInt7898) {
			local52 = super.aClass162_Sub2_8.anInt7898 - arg0;
			local35 -= local52;
			arg0 = super.aClass162_Sub2_8.anInt7898;
			local29 += local52;
			local27 += local52;
			local41 += local52;
			local39 += local52;
		}
		if (arg0 + local35 > super.aClass162_Sub2_8.anInt7885) {
			local52 = arg0 + local35 - super.aClass162_Sub2_8.anInt7885;
			local35 -= local52;
			local41 += local52;
			local39 += local52;
		}
		if (local35 <= 0 || local32 <= 0) {
			return;
		}
		@Pc(160) int[] local160 = super.aClass162_Sub2_8.anIntArray529;
		@Pc(168) int local168;
		@Pc(175) int local175;
		@Pc(284) int local284;
		@Pc(287) int local287;
		@Pc(291) int local291;
		@Pc(303) int local303;
		@Pc(319) int local319;
		@Pc(327) int local327;
		@Pc(458) int local458;
		@Pc(311) int local311;
		if (arg4 != 0) {
			@Pc(1054) byte local1054;
			@Pc(766) int local766;
			@Pc(774) int local774;
			@Pc(782) int local782;
			@Pc(794) int local794;
			@Pc(543) byte local543;
			if (arg4 == 1) {
				if (arg2 == 1) {
					for (local168 = -local32; local168 < 0; local168++) {
						for (local175 = -local35; local175 < 0; local175++) {
							local543 = this.aByteArray70[local29++];
							if (local543 == 0) {
								local27++;
							} else {
								local287 = this.anIntArray490[local543 & 0xFF] | 0xFF000000;
								@Pc(556) short local556 = 255;
								@Pc(558) byte local558 = 0;
								local311 = local160[local27];
								local160[local27++] = ((local287 & 0xFF00FF) * local556 + (local311 & 0xFF00FF) * local558 >> 8 & 0xFFFF00FF) + (((local287 & 0xFF00FF00) >>> 8) * local556 + ((local311 & 0xFF00FF00) >>> 8) * local558 & 0xFF00FF00);
							}
						}
						local27 += local39;
						local29 += local41;
					}
				} else {
					@Pc(645) byte local645;
					if (arg2 == 0) {
						if ((arg3 & 0xFFFFFF) == 16777215) {
							local168 = arg3 >>> 24;
							local175 = 256 - local168;
							for (local284 = -local32; local284 < 0; local284++) {
								for (local287 = -local35; local287 < 0; local287++) {
									local645 = this.aByteArray70[local29++];
									if (local645 == 0) {
										local27++;
									} else {
										local303 = this.anIntArray490[local645 & 0xFF];
										local311 = local160[local27];
										local160[local27++] = ((local303 & 0xFF00FF) * local168 + (local311 & 0xFF00FF) * local175 & 0xFF00FF00) + ((local303 & 0xFF00) * local168 + (local311 & 0xFF00) * local175 & 0xFF0000) >> 8;
									}
								}
								local27 += local39;
								local29 += local41;
							}
						} else {
							local168 = arg3 >> 16 & 0xFF;
							local175 = arg3 >> 8 & 0xFF;
							local284 = arg3 & 0xFF;
							local287 = arg3 >>> 24;
							local291 = 256 - local287;
							for (local303 = -local32; local303 < 0; local303++) {
								for (local311 = -local35; local311 < 0; local311++) {
									@Pc(746) byte local746 = this.aByteArray70[local29++];
									if (local746 == 0) {
										local27++;
									} else {
										local327 = this.anIntArray490[local746 & 0xFF];
										if (local287 == 255) {
											local766 = (local327 & 0xFF0000) * local168 & 0xFF000000;
											local774 = (local327 & 0xFF00) * local175 & 0xFF0000;
											local782 = (local327 & 0xFF) * local284 & 0xFF00;
											local160[local27++] = (local766 | local774 | local782) >>> 8;
										} else {
											local766 = (local327 & 0xFF0000) * local168 & 0xFF000000;
											local774 = (local327 & 0xFF00) * local175 & 0xFF0000;
											local782 = (local327 & 0xFF) * local284 & 0xFF00;
											local327 = (local766 | local774 | local782) >>> 8;
											local794 = local160[local27];
											local160[local27++] = ((local327 & 0xFF00FF) * local287 + (local794 & 0xFF00FF) * local291 & 0xFF00FF00) + ((local327 & 0xFF00) * local287 + (local794 & 0xFF00) * local291 & 0xFF0000) >> 8;
										}
									}
								}
								local27 += local39;
								local29 += local41;
							}
						}
					} else if (arg2 == 3) {
						local168 = arg3 >>> 24;
						local175 = 256 - local168;
						for (local284 = -local32; local284 < 0; local284++) {
							for (local287 = -local35; local287 < 0; local287++) {
								local645 = this.aByteArray70[local29++];
								local303 = local645 > 0 ? this.anIntArray490[local645] : 0;
								local311 = local303 + arg3;
								local319 = (local303 & 0xFF00FF) + (arg3 & 0xFF00FF);
								local327 = (local319 & 0x1000100) + (local311 - local319 & 0x10000);
								local327 = local311 - local327 | local327 - (local327 >>> 8);
								if (local303 == 0 && local168 != 255) {
									local303 = local327;
									local327 = local160[local27];
									local327 = ((local303 & 0xFF00FF) * local168 + (local327 & 0xFF00FF) * local175 & 0xFF00FF00) + ((local303 & 0xFF00) * local168 + (local327 & 0xFF00) * local175 & 0xFF0000) >> 8;
								}
								local160[local27++] = local327;
							}
							local27 += local39;
							local29 += local41;
						}
					} else if (arg2 == 2) {
						local168 = arg3 >>> 24;
						local175 = 256 - local168;
						local284 = (arg3 & 0xFF00FF) * local175 & 0xFF00FF00;
						local287 = (arg3 & 0xFF00) * local175 & 0xFF0000;
						local458 = (local284 | local287) >>> 8;
						for (local291 = -local32; local291 < 0; local291++) {
							for (local303 = -local35; local303 < 0; local303++) {
								local1054 = this.aByteArray70[local29++];
								if (local1054 == 0) {
									local27++;
								} else {
									local319 = this.anIntArray490[local1054 & 0xFF];
									local284 = (local319 & 0xFF00FF) * local168 & 0xFF00FF00;
									local287 = (local319 & 0xFF00) * local168 & 0xFF0000;
									local160[local27++] = ((local284 | local287) >>> 8) + local458;
								}
							}
							local27 += local39;
							local29 += local41;
						}
					} else {
						throw new IllegalArgumentException();
					}
				}
			} else if (arg4 != 2) {
				throw new IllegalArgumentException();
			} else if (arg2 == 1) {
				for (local168 = -local32; local168 < 0; local168++) {
					for (local175 = -local35; local175 < 0; local175++) {
						local543 = this.aByteArray70[local29++];
						if (local543 == 0) {
							local27++;
						} else {
							local287 = this.anIntArray490[local543 & 0xFF];
							local291 = local160[local27];
							local303 = local287 + local291;
							local311 = (local287 & 0xFF00FF) + (local291 & 0xFF00FF);
							local291 = (local311 & 0x1000100) + (local303 - local311 & 0x10000);
							local160[local27++] = local303 - local291 | local291 - (local291 >>> 8);
						}
					}
					local27 += local39;
					local29 += local41;
				}
			} else if (arg2 == 0) {
				local168 = arg3 >> 16 & 0xFF;
				local175 = arg3 >> 8 & 0xFF;
				local284 = arg3 & 0xFF;
				for (local287 = -local32; local287 < 0; local287++) {
					for (local291 = -local35; local291 < 0; local291++) {
						@Pc(1228) byte local1228 = this.aByteArray70[local29++];
						if (local1228 == 0) {
							local27++;
						} else {
							local311 = this.anIntArray490[local1228 & 0xFF];
							local319 = (local311 & 0xFF0000) * local168 & 0xFF000000;
							local327 = (local311 & 0xFF00) * local175 & 0xFF0000;
							local766 = (local311 & 0xFF) * local284 & 0xFF00;
							local311 = (local319 | local327 | local766) >>> 8;
							local774 = local160[local27];
							local782 = local311 + local774;
							local794 = (local311 & 0xFF00FF) + (local774 & 0xFF00FF);
							local774 = (local794 & 0x1000100) + (local782 - local794 & 0x10000);
							local160[local27++] = local782 - local774 | local774 - (local774 >>> 8);
						}
					}
					local27 += local39;
					local29 += local41;
				}
			} else if (arg2 == 3) {
				for (local168 = -local32; local168 < 0; local168++) {
					for (local175 = -local35; local175 < 0; local175++) {
						local543 = this.aByteArray70[local29++];
						local287 = local543 > 0 ? this.anIntArray490[local543] : 0;
						local291 = local287 + arg3;
						local303 = (local287 & 0xFF00FF) + (arg3 & 0xFF00FF);
						local311 = (local303 & 0x1000100) + (local291 - local303 & 0x10000);
						local287 = local291 - local311 | local311 - (local311 >>> 8);
						@Pc(1387) int local1387 = local160[local27];
						local291 = local287 + local1387;
						local303 = (local287 & 0xFF00FF) + (local1387 & 0xFF00FF);
						@Pc(1409) int local1409 = (local303 & 0x1000100) + (local291 - local303 & 0x10000);
						local160[local27++] = local291 - local1409 | local1409 - (local1409 >>> 8);
					}
					local27 += local39;
					local29 += local41;
				}
			} else if (arg2 == 2) {
				local168 = arg3 >>> 24;
				local175 = 256 - local168;
				local284 = (arg3 & 0xFF00FF) * local175 & 0xFF00FF00;
				local287 = (arg3 & 0xFF00) * local175 & 0xFF0000;
				local458 = (local284 | local287) >>> 8;
				for (local291 = -local32; local291 < 0; local291++) {
					for (local303 = -local35; local303 < 0; local303++) {
						local1054 = this.aByteArray70[local29++];
						if (local1054 == 0) {
							local27++;
						} else {
							local319 = this.anIntArray490[local1054 & 0xFF];
							local284 = (local319 & 0xFF00FF) * local168 & 0xFF00FF00;
							local287 = (local319 & 0xFF00) * local168 & 0xFF0000;
							@Pc(1517) int local1517 = ((local284 | local287) >>> 8) + local458;
							local327 = local160[local27];
							local766 = local1517 + local327;
							local774 = (local1517 & 0xFF00FF) + (local327 & 0xFF00FF);
							@Pc(1543) int local1543 = (local774 & 0x1000100) + (local766 - local774 & 0x10000);
							local160[local27++] = local766 - local1543 | local1543 - (local1543 >>> 8);
						}
					}
					local27 += local39;
					local29 += local41;
				}
			} else {
				throw new IllegalArgumentException();
			}
		} else if (arg2 == 1) {
			for (local168 = -local32; local168 < 0; local168++) {
				local175 = local27 + local35 - 3;
				while (local27 < local175) {
					local160[local27++] = this.anIntArray490[this.aByteArray70[local29++] & 0xFF];
					local160[local27++] = this.anIntArray490[this.aByteArray70[local29++] & 0xFF];
					local160[local27++] = this.anIntArray490[this.aByteArray70[local29++] & 0xFF];
					local160[local27++] = this.anIntArray490[this.aByteArray70[local29++] & 0xFF];
				}
				local175 += 3;
				while (local27 < local175) {
					local160[local27++] = this.anIntArray490[this.aByteArray70[local29++] & 0xFF];
				}
				local27 += local39;
				local29 += local41;
			}
		} else if (arg2 == 0) {
			local168 = arg3 >> 16 & 0xFF;
			local175 = arg3 >> 8 & 0xFF;
			local284 = arg3 & 0xFF;
			for (local287 = -local32; local287 < 0; local287++) {
				for (local291 = -local35; local291 < 0; local291++) {
					local303 = this.anIntArray490[this.aByteArray70[local29++] & 0xFF];
					local311 = (local303 & 0xFF0000) * local168 & 0xFF000000;
					local319 = (local303 & 0xFF00) * local175 & 0xFF0000;
					local327 = (local303 & 0xFF) * local284 & 0xFF00;
					local160[local27++] = (local311 | local319 | local327) >>> 8;
				}
				local27 += local39;
				local29 += local41;
			}
		} else if (arg2 == 3) {
			for (local168 = -local32; local168 < 0; local168++) {
				for (local175 = -local35; local175 < 0; local175++) {
					local284 = this.anIntArray490[this.aByteArray70[local29++] & 0xFF];
					local287 = local284 + arg3;
					local291 = (local284 & 0xFF00FF) + (arg3 & 0xFF00FF);
					local303 = (local291 & 0x1000100) + (local287 - local291 & 0x10000);
					local160[local27++] = local287 - local303 | local303 - (local303 >>> 8);
				}
				local27 += local39;
				local29 += local41;
			}
		} else if (arg2 == 2) {
			local168 = arg3 >>> 24;
			local175 = 256 - local168;
			local284 = (arg3 & 0xFF00FF) * local175 & 0xFF00FF00;
			local287 = (arg3 & 0xFF00) * local175 & 0xFF0000;
			local458 = (local284 | local287) >>> 8;
			for (local291 = -local32; local291 < 0; local291++) {
				for (local303 = -local35; local303 < 0; local303++) {
					local311 = this.anIntArray490[this.aByteArray70[local29++] & 0xFF];
					local284 = (local311 & 0xFF00FF) * local168 & 0xFF00FF00;
					local287 = (local311 & 0xFF00) * local168 & 0xFF0000;
					local160[local27++] = ((local284 | local287) >>> 8) + local458;
				}
				local27 += local39;
				local29 += local41;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
