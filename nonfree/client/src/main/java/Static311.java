import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
	public static int anInt5651;

	@OriginalMember(owner = "client!tm", name = "h", descriptor = "Lclient!ct;")
	public static Class30 aClass30_84;

	@OriginalMember(owner = "client!tm", name = "j", descriptor = "Lclient!oa;")
	public static Class1_Sub31 aClass1_Sub31_4;

	@OriginalMember(owner = "client!tm", name = "k", descriptor = "Lclient!ct;")
	public static Class30 aClass30_85;

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
	public static int anInt5653 = 104;

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
	public static int anInt5657 = 0;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I[Lclient!th;Lclient!fp;[BZIIIIZ)[I")
	public static int[] method5132(@OriginalArg(0) int arg0, @OriginalArg(1) Class196[] arg1, @OriginalArg(2) Class63 arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		@Pc(23) int local23;
		@Pc(28) int local28;
		if (!arg4) {
			for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
				@Pc(11) Class196 local11 = arg1[local5];
				for (local13 = 0; local13 < 64; local13++) {
					for (local17 = 0; local17 < 64; local17++) {
						local23 = local13 + arg5;
						local28 = arg0 + local17;
						if (local23 >= 0 && local23 < anInt5653 && local28 >= 0 && local28 < Static189.anInt3820) {
							local11.method5322(local23, local28);
						}
					}
				}
			}
		}
		@Pc(77) Class1_Sub7 local77 = new Class1_Sub7(arg3);
		@Pc(86) int local86 = arg5 + arg8;
		local13 = arg0 + arg6;
		for (local17 = 0; local17 < arg7; local17++) {
			for (local23 = 0; local23 < 64; local23++) {
				for (local28 = 0; local28 < 64; local28++) {
					Static72.method1604(local28 + arg0, 0, false, local28 + local13, arg4, 0, local77, local23 + local86, arg5 + local23, 0, local17);
				}
			}
		}
		@Pc(143) boolean local143 = false;
		@Pc(145) boolean local145 = false;
		@Pc(151) int local151;
		@Pc(174) int local174;
		@Pc(215) int local215;
		@Pc(219) int local219;
		@Pc(264) int local264;
		@Pc(221) int local221;
		while (local77.anInt2219 < local77.aByteArray41.length) {
			local151 = local77.method2132();
			if (local151 == 128) {
				Static69.anIntArray136[0] = local77.method2161();
				Static69.anIntArray136[1] = local77.method2141();
				Static69.anIntArray136[2] = local77.method2141();
				Static69.anIntArray136[3] = local77.method2141();
				Static69.anIntArray136[4] = local77.method2161();
				local143 = true;
			} else {
				if (local151 != 129) {
					local77.anInt2219--;
					break;
				}
				if (Static243.aByteArrayArrayArray6 == null) {
					Static243.aByteArrayArrayArray6 = new byte[4][][];
				}
				local145 = true;
				for (local174 = 0; local174 < 4; local174++) {
					@Pc(180) byte local180 = local77.method2122();
					if (local180 == 0 && Static243.aByteArrayArrayArray6[local174] != null) {
						local215 = arg5;
						local219 = arg5 + 64;
						local221 = arg0;
						if (arg5 < 0) {
							local215 = 0;
						} else if (arg5 >= anInt5653) {
							local215 = anInt5653;
						}
						local264 = arg0 + 64;
						if (arg0 < 0) {
							local221 = 0;
						} else if (Static189.anInt3820 <= arg0) {
							local221 = Static189.anInt3820;
						}
						if (local219 < 0) {
							local219 = 0;
						} else if (anInt5653 <= local219) {
							local219 = anInt5653;
						}
						if (local264 < 0) {
							local264 = 0;
						} else if (local264 >= Static189.anInt3820) {
							local264 = Static189.anInt3820;
						}
						while (local215 < local219) {
							while (local264 > local221) {
								Static243.aByteArrayArrayArray6[local174][local215][local221] = 0;
								local221++;
							}
							local215++;
						}
					} else if (local180 == 1) {
						if (Static243.aByteArrayArrayArray6[local174] == null) {
							Static243.aByteArrayArrayArray6[local174] = new byte[anInt5653 + 1][Static189.anInt3820 + 1];
						}
						for (local215 = 0; local215 < 64; local215 += 4) {
							for (local219 = 0; local219 < 64; local219 += 4) {
								@Pc(332) byte local332 = local77.method2122();
								for (local264 = local215 + arg5; local264 < local215 + arg5 + 4; local264++) {
									for (@Pc(342) int local342 = local219 + arg0; local342 < arg0 + local219 + 4; local342++) {
										if (local264 >= 0 && anInt5653 > local264 && local342 >= 0 && Static189.anInt3820 > local342) {
											Static243.aByteArrayArrayArray6[local174][local264][local342] = local332;
										}
									}
								}
							}
						}
					} else if (local180 == 2) {
						if (Static243.aByteArrayArrayArray6[local174] == null) {
							Static243.aByteArrayArrayArray6[local174] = new byte[anInt5653 + 1][Static189.anInt3820 + 1];
						}
						if (local174 > 0) {
							local215 = arg5;
							local219 = arg5 + 64;
							local221 = arg0;
							if (arg5 < 0) {
								local215 = 0;
							} else if (arg5 >= anInt5653) {
								local215 = anInt5653;
							}
							if (arg0 < 0) {
								local221 = 0;
							} else if (Static189.anInt3820 <= arg0) {
								local221 = Static189.anInt3820;
							}
							if (local219 < 0) {
								local219 = 0;
							} else if (local219 >= anInt5653) {
								local219 = anInt5653;
							}
							local264 = arg0 + 64;
							if (local264 < 0) {
								local264 = 0;
							} else if (local264 >= Static189.anInt3820) {
								local264 = Static189.anInt3820;
							}
							while (local219 > local215) {
								while (local221 < local264) {
									Static243.aByteArrayArrayArray6[local174][local215][local221] = Static243.aByteArrayArrayArray6[local174 - 1][local215][local221];
									local221++;
								}
								local215++;
							}
						}
					}
				}
			}
		}
		@Pc(569) int local569;
		if (!arg4) {
			@Pc(543) Class54 local543 = null;
			while (true) {
				while (local77.anInt2219 < local77.aByteArray41.length) {
					local174 = local77.method2132();
					if (local174 == 0) {
						local543 = new Class54(local77);
					} else if (local174 == 1) {
						local569 = local77.method2132();
						if (local569 > 0) {
							for (local215 = 0; local215 < local569; local215++) {
								@Pc(583) Class1_Sub5_Sub1 local583 = new Class1_Sub5_Sub1(local77);
								if (local583.anInt4975 == 31) {
									@Pc(595) Class212 local595 = Static36.method908(local77.method2161());
									local583.method4541(local595.anInt6449, local595.anInt6445, local595.anInt6447, local595.anInt6450);
								}
								local583.anInt4965 += arg0 << 7;
								local583.anInt4966 += arg5 << 7;
								local221 = local583.anInt4966 >> 7;
								local264 = local583.anInt4965 >> 7;
								if (local221 >= 0 && local264 >= 0 && local221 < anInt5653 && local264 < Static189.anInt3820) {
									local583.anInt4967 = Static102.anIntArrayArrayArray134[local583.anInt4976][local221][local264] - local583.anInt4967;
									if (arg2.method4592() > 0) {
										Static129.method2664(local583);
									}
								}
							}
						}
					} else if (local174 == 2) {
						if (local543 == null) {
							local543 = new Class54();
						}
						local543.method1784(local77);
					} else {
						throw new IllegalStateException();
					}
				}
				if (local543 != null) {
					for (local174 = 0; local174 < 8; local174++) {
						for (local569 = 0; local569 < 8; local569++) {
							local215 = (arg5 >> 3) + local174;
							local219 = (arg0 >> 3) + local569;
							if (local215 >= 0 && local215 < anInt5653 >> 3 && local219 >= 0 && Static189.anInt3820 >> 3 > local219) {
								Static340.method5698(local543, local219, local215);
							}
						}
					}
				}
				break;
			}
		}
		if (!local145 && Static243.aByteArrayArrayArray6 != null) {
			for (local151 = 0; local151 < 4; local151++) {
				if (Static243.aByteArrayArrayArray6[local151] != null) {
					for (local174 = 0; local174 < 16; local174++) {
						for (local569 = 0; local569 < 16; local569++) {
							local215 = local174 + (arg5 >> 2);
							local219 = local569 + (arg0 >> 2);
							if (local215 >= 0 && local215 < 26 && local219 >= 0 && local219 < 26) {
								Static243.aByteArrayArrayArray6[local151][local215][local219] = 0;
							}
						}
					}
				}
			}
		}
		if (local143) {
			return Static69.anIntArray136;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!bf;)V")
	public static void method5134(@OriginalArg(0) Class11_Sub2 arg0) {
		for (@Pc(2) int local2 = arg0.aShort94; local2 <= arg0.aShort92; local2++) {
			for (@Pc(6) int local6 = arg0.aShort93; local6 <= arg0.aShort91; local6++) {
				@Pc(16) Class155 local16 = Static105.aClass155ArrayArrayArray3[arg0.aByte79][local2][local6];
				if (local16 != null) {
					@Pc(21) Class187 local21 = local16.aClass187_2;
					@Pc(23) Class187 local23 = null;
					while (local21 != null) {
						if (local21.aClass11_Sub2_2 == arg0) {
							if (local23 == null) {
								local16.aClass187_2 = local21.aClass187_3;
							} else {
								local23.aClass187_3 = local21.aClass187_3;
							}
							local21.method5027();
							break;
						}
						local23 = local21;
						local21 = local21.aClass187_3;
					}
					local16.aByte35 = 0;
					for (@Pc(56) Class187 local56 = local16.aClass187_2; local56 != null; local56 = local56.aClass187_3) {
						local16.aByte35 = (byte) (local16.aByte35 | local56.anInt5493);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)V")
	public static void method5135(@OriginalArg(0) int arg0) {
		@Pc(16) Class1_Sub4_Sub17 local16 = Static132.method2717(arg0, 3);
		local16.method3481();
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V")
	public static void method5136() {
		Static138.method2789(false);
		if (Static283.anInt5521 >= 0 && Static283.anInt5521 != 0) {
			Static186.method3507(Static283.anInt5521);
			Static283.anInt5521 = -1;
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IBIIII)V")
	public static void method5137(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(17) int local17 = arg4 * arg4;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(37) int local37 = arg4 << 1;
		@Pc(47) int local47 = (1 - local37) * local13 + local21;
		@Pc(55) int local55 = local17 - local25 * (local37 - 1);
		@Pc(59) int local59 = local13 << 2;
		@Pc(63) int local63 = local17 << 2;
		@Pc(71) int local71 = local21 * 3;
		@Pc(79) int local79 = ((arg4 << 1) - 3) * local25;
		@Pc(85) int local85 = local63;
		@Pc(91) int local91 = local59 * (arg4 - 1);
		Static367.method6081(arg0, arg3 - arg1, Static43.anIntArrayArray57[arg2], arg3 + arg1);
		while (local9 > 0) {
			if (local47 < 0) {
				while (local47 < 0) {
					local55 += local85;
					local47 += local71;
					local85 += local63;
					local7++;
					local71 += local63;
				}
			}
			if (local55 < 0) {
				local55 += local85;
				local47 += local71;
				local7++;
				local71 += local63;
				local85 += local63;
			}
			local47 += -local91;
			local55 += -local79;
			local79 -= local59;
			local9--;
			local91 -= local59;
			@Pc(174) int local174 = arg2 - local9;
			@Pc(178) int local178 = local9 + arg2;
			@Pc(182) int local182 = local7 + arg3;
			@Pc(187) int local187 = arg3 - local7;
			Static367.method6081(arg0, local187, Static43.anIntArrayArray57[local174], local182);
			Static367.method6081(arg0, local187, Static43.anIntArrayArray57[local178], local182);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILclient!kg;I)I")
	public static int method5138(@OriginalArg(1) Class112 arg0, @OriginalArg(2) int arg1) {
		if (!Static44.method1079(arg0).method5748(arg1) && arg0.anObjectArray6 == null) {
			return -1;
		} else if (arg0.anIntArray251 == null || arg1 >= arg0.anIntArray251.length) {
			return -1;
		} else {
			return arg0.anIntArray251[arg1];
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IILclient!wc;I)V")
	public static void method5139(@OriginalArg(1) int arg0, @OriginalArg(2) Class11_Sub2_Sub6_Sub1 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1.anInt6772 && arg0 != -1) {
			@Pc(15) Class199 local15 = Static161.method3066(arg0);
			@Pc(18) int local18 = local15.anInt6015;
			if (local18 == 1) {
				arg1.anInt6761 = arg2;
				arg1.anInt6743 = 0;
				arg1.anInt6794 = 1;
				arg1.anInt6781 = 0;
				arg1.anInt6776 = 0;
				Static96.method2060(local15, arg1 == Static191.aClass11_Sub2_Sub6_Sub1_4, arg1.aByte79, arg1.anInt6743, arg1.anInt6729, arg1.anInt6726);
			}
			if (local18 == 2) {
				arg1.anInt6781 = 0;
			}
		} else if (arg0 == -1 || arg1.anInt6772 == -1 || Static161.method3066(arg0).anInt6020 >= Static161.method3066(arg1.anInt6772).anInt6020) {
			arg1.anInt6796 = arg1.anInt6798;
			arg1.anInt6781 = 0;
			arg1.anInt6794 = 1;
			arg1.anInt6743 = 0;
			arg1.anInt6776 = 0;
			arg1.anInt6772 = arg0;
			arg1.anInt6761 = arg2;
			if (arg1.anInt6772 != -1) {
				Static96.method2060(Static161.method3066(arg1.anInt6772), arg1 == Static191.aClass11_Sub2_Sub6_Sub1_4, arg1.aByte79, arg1.anInt6743, arg1.anInt6729, arg1.anInt6726);
			}
		}
	}
}
