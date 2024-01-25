import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!da", name = "E", descriptor = "I")
	public static int anInt1234;

	@OriginalMember(owner = "client!da", name = "R", descriptor = "[Lclient!kh;")
	public static Class54[] aClass54Array4;

	@OriginalMember(owner = "client!da", name = "S", descriptor = "J")
	public static long aLong39;

	@OriginalMember(owner = "client!da", name = "Y", descriptor = "[[B")
	public static byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!da", name = "H", descriptor = "Ljava/lang/String;")
	public static final String aString68 = "cyan:";

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BILjava/lang/String;)V")
	public static void method1096(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(12) Class5_Sub9_Sub16 local12 = Static239.method4052(2, arg0);
		local12.method4140();
		local12.aString276 = arg1;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IJIZLjava/lang/String;ILjava/lang/String;IIZZ)V")
	public static void method1097(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) boolean arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			local8[local10] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(28) Class5_Sub1 local28 = new Class5_Sub1(128);
		local28.method1886(10);
		local28.method1870((arg9 ? 4 : 0) | (arg2 ? 1 : 0) | (arg8 ? 2 : 0));
		local28.method1871(arg0);
		local28.method1851(local8[0]);
		local28.method1849(arg5);
		local28.method1851(local8[1]);
		local28.method1870(Static255.anInt4972);
		local28.method1886(arg7);
		local28.method1886(arg4);
		local28.method1851(local8[2]);
		local28.method1870(arg6);
		local28.method1870(arg1);
		local28.method1851(local8[3]);
		local28.method1859(Static180.aBigInteger2, Static44.aBigInteger3);
		@Pc(122) Class5_Sub1 local122 = new Class5_Sub1(350);
		local122.method1849(arg3);
		@Pc(135) int local135 = 8 - Static344.method954(arg3) % 8;
		for (@Pc(137) int local137 = 0; local137 < local135; local137++) {
			local122.method1886((int) (Math.random() * 255.0D));
		}
		local122.method1865(local8);
		Static335.aClass5_Sub1_Sub1_3.anInt2029 = 0;
		Static335.aClass5_Sub1_Sub1_3.method1886(22);
		Static335.aClass5_Sub1_Sub1_3.method1870(local28.anInt2029 + local122.anInt2029 + 2);
		Static335.aClass5_Sub1_Sub1_3.method1870(560);
		Static335.aClass5_Sub1_Sub1_3.method1850(local28.aByteArray18, local28.anInt2029);
		Static335.aClass5_Sub1_Sub1_3.method1850(local122.aByteArray18, local122.anInt2029);
		Static88.anInt1583 = 1;
		Static111.anInt2410 = 0;
		Static45.anInt1178 = -3;
		Static64.anInt1550 = 0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[BZIIILclient!en;[Lclient!dl;II)[I")
	public static int[] method1098(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class59 arg5, @OriginalArg(7) Class49[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(27) int local27;
		@Pc(31) int local31;
		if (!arg2) {
			for (@Pc(9) int local9 = 0; local9 < 4; local9++) {
				@Pc(15) Class49 local15 = arg6[local9];
				for (local17 = 0; local17 < 64; local17++) {
					for (local21 = 0; local21 < 64; local21++) {
						local27 = local17 + arg8;
						local31 = arg3 + local21;
						if (local27 >= 0 && Static266.anInt5101 > local27 && local31 >= 0 && local31 < Static339.anInt6352) {
							local15.method1230(local27, local31);
						}
					}
				}
			}
		}
		@Pc(70) Class5_Sub1 local70 = new Class5_Sub1(arg1);
		@Pc(74) int local74 = arg8 + arg4;
		local17 = arg7 + arg3;
		for (local21 = 0; local21 < arg0; local21++) {
			for (local27 = 0; local27 < 64; local27++) {
				for (local31 = 0; local31 < 64; local31++) {
					Static233.method3987(arg2, local70, arg8 + local27, local31 + local17, local21, arg3 + local31, 0, 0, local74 + local27, 0, false);
				}
			}
		}
		@Pc(130) boolean local130 = false;
		@Pc(132) boolean local132 = false;
		@Pc(138) int local138;
		@Pc(161) int local161;
		@Pc(195) int local195;
		@Pc(199) int local199;
		@Pc(307) int local307;
		@Pc(209) int local209;
		while (local70.anInt2029 < local70.aByteArray18.length) {
			local138 = local70.method1832();
			if (local138 == 128) {
				Static222.anIntArray313[0] = local70.method1845();
				Static222.anIntArray313[1] = local70.method1834();
				Static222.anIntArray313[2] = local70.method1834();
				Static222.anIntArray313[3] = local70.method1834();
				Static222.anIntArray313[4] = local70.method1845();
				local130 = true;
			} else {
				if (local138 != 129) {
					local70.anInt2029--;
					break;
				}
				if (Static54.aByteArrayArrayArray6 == null) {
					Static54.aByteArrayArrayArray6 = new byte[4][][];
				}
				for (local161 = 0; local161 < 4; local161++) {
					@Pc(167) byte local167 = local70.method1863();
					if (local167 == 0 && Static54.aByteArrayArrayArray6[local161] != null) {
						local195 = arg8;
						local199 = arg8 + 64;
						local307 = arg3;
						if (arg8 < 0) {
							local195 = 0;
						} else if (Static266.anInt5101 <= arg8) {
							local195 = Static266.anInt5101;
						}
						local209 = arg3 + 64;
						if (arg3 < 0) {
							local307 = 0;
						} else if (arg3 >= Static339.anInt6352) {
							local307 = Static339.anInt6352;
						}
						if (local199 < 0) {
							local199 = 0;
						} else if (local199 >= Static266.anInt5101) {
							local199 = Static266.anInt5101;
						}
						if (local209 < 0) {
							local209 = 0;
						} else if (Static339.anInt6352 <= local209) {
							local209 = Static339.anInt6352;
						}
						while (local199 > local195) {
							while (local209 > local307) {
								Static54.aByteArrayArrayArray6[local161][local195][local307] = 0;
								local307++;
							}
							local195++;
						}
					} else if (local167 == 1) {
						if (Static54.aByteArrayArrayArray6[local161] == null) {
							Static54.aByteArrayArrayArray6[local161] = new byte[Static266.anInt5101 + 1][Static339.anInt6352 + 1];
						}
						for (local195 = 0; local195 < 64; local195 += 4) {
							for (local199 = 0; local199 < 64; local199 += 4) {
								@Pc(205) byte local205 = local70.method1863();
								for (local209 = local195 + arg8; local209 < arg8 + local195 + 4; local209++) {
									for (@Pc(216) int local216 = local199 + arg3; local216 < arg3 + local199 + 4; local216++) {
										if (local209 >= 0 && local209 < Static266.anInt5101 && local216 >= 0 && local216 < Static339.anInt6352) {
											Static54.aByteArrayArrayArray6[local161][local209][local216] = local205;
										}
									}
								}
							}
						}
					} else if (local167 == 2) {
						if (Static54.aByteArrayArrayArray6[local161] == null) {
							Static54.aByteArrayArrayArray6[local161] = new byte[Static266.anInt5101 + 1][Static339.anInt6352 + 1];
						}
						if (local161 > 0) {
							local195 = arg8;
							local199 = arg8 + 64;
							local307 = arg3;
							if (arg8 < 0) {
								local195 = 0;
							} else if (arg8 >= Static266.anInt5101) {
								local195 = Static266.anInt5101;
							}
							if (local199 < 0) {
								local199 = 0;
							} else if (Static266.anInt5101 <= local199) {
								local199 = Static266.anInt5101;
							}
							if (arg3 < 0) {
								local307 = 0;
							} else if (arg3 >= Static339.anInt6352) {
								local307 = Static339.anInt6352;
							}
							local209 = arg3 + 64;
							if (local209 < 0) {
								local209 = 0;
							} else if (Static339.anInt6352 <= local209) {
								local209 = Static339.anInt6352;
							}
							while (local199 > local195) {
								while (local307 < local209) {
									Static54.aByteArrayArrayArray6[local161][local195][local307] = Static54.aByteArrayArrayArray6[local161 - 1][local195][local307];
									local307++;
								}
								local195++;
							}
						}
					}
				}
				local132 = true;
			}
		}
		@Pc(569) int local569;
		if (!arg2) {
			@Pc(546) Class6 local546 = null;
			while (true) {
				while (local70.anInt2029 < local70.aByteArray18.length) {
					local161 = local70.method1832();
					if (local161 == 0) {
						local546 = new Class6(local70);
					} else if (local161 == 1) {
						local569 = local70.method1832();
						if (local569 > 0) {
							for (local195 = 0; local195 < local569; local195++) {
								@Pc(580) Class5_Sub13_Sub1 local580 = new Class5_Sub13_Sub1(local70);
								if (local580.anInt2085 == 31) {
									@Pc(592) Class149 local592 = Static321.method5423(local70.method1845());
									local580.method1926(local592.anInt4492, local592.anInt4490, local592.anInt4485, local592.anInt4487);
								}
								local580.anInt2080 += arg8 << 7;
								local580.anInt2082 += arg3 << 7;
								local307 = local580.anInt2080 >> 7;
								local209 = local580.anInt2082 >> 7;
								if (local307 >= 0 && local209 >= 0 && local307 < Static266.anInt5101 && Static339.anInt6352 > local209) {
									local580.anInt2076 = Static200.anIntArrayArrayArray17[local580.anInt2094][local307][local209] - local580.anInt2076;
									if (arg5.method4796() > 0) {
										Static152.method2890(local580);
									}
								}
							}
						}
					} else if (local161 == 2) {
						if (local546 == null) {
							local546 = new Class6();
						}
						local546.method188(local70);
					} else {
						throw new IllegalStateException();
					}
				}
				if (local546 != null) {
					for (local161 = 0; local161 < 8; local161++) {
						for (local569 = 0; local569 < 8; local569++) {
							local195 = local161 + (arg8 >> 3);
							local199 = (arg3 >> 3) + local569;
							if (local195 >= 0 && Static266.anInt5101 >> 3 > local195 && local199 >= 0 && Static339.anInt6352 >> 3 > local199) {
								Static3.method5633(local195, local199, local546);
							}
						}
					}
				}
				break;
			}
		}
		if (!local132 && Static54.aByteArrayArrayArray6 != null) {
			for (local138 = 0; local138 < 4; local138++) {
				if (Static54.aByteArrayArrayArray6[local138] != null) {
					for (local161 = 0; local161 < 16; local161++) {
						for (local569 = 0; local569 < 16; local569++) {
							local195 = local161 + (arg8 >> 2);
							local199 = (arg3 >> 2) + local569;
							if (local195 >= 0 && local195 < 26 && local199 >= 0 && local199 < 26) {
								Static54.aByteArrayArrayArray6[local138][local195][local199] = 0;
							}
						}
					}
				}
			}
		}
		if (local130) {
			return Static222.anIntArray313;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZBLjava/lang/String;)V")
	public static void method1100(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(4) String local4 = arg1.toLowerCase();
		@Pc(26) short[] local26 = new short[16];
		@Pc(28) int local28 = 0;
		@Pc(34) int local34 = arg0 ? 32768 : 0;
		@Pc(42) int local42 = (arg0 ? Static123.anInt2595 : Static178.anInt3559) + local34;
		for (@Pc(44) int local44 = local34; local44 < local42; local44++) {
			@Pc(50) Class5_Sub9_Sub12 local50 = Static52.method1171(local44);
			if (local50.aBoolean187 && local50.method2640().toLowerCase().indexOf(local4) != -1) {
				if (local28 >= 50) {
					Static331.anInt6231 = -1;
					Static288.aShortArray90 = null;
					return;
				}
				if (local28 >= local26.length) {
					@Pc(83) short[] local83 = new short[local26.length * 2];
					for (@Pc(85) int local85 = 0; local85 < local28; local85++) {
						local83[local85] = local26[local85];
					}
					local26 = local83;
				}
				local26[local28++] = (short) local44;
			}
		}
		Static288.aShortArray90 = local26;
		Static331.anInt6231 = local28;
		Static215.anInt4278 = 0;
		@Pc(126) String[] local126 = new String[Static331.anInt6231];
		for (@Pc(128) int local128 = 0; local128 < Static331.anInt6231; local128++) {
			local126[local128] = Static52.method1171(local26[local128]).method2640();
		}
		Static299.method5079(Static288.aShortArray90, local126);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III)Z")
	public static boolean method1101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static250.anInt4854; local1++) {
			@Pc(6) Class183 local6 = Static237.aClass183Array2[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt5558 == 1) {
				local15 = local6.anInt5556 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt5550 + (local6.anInt5559 * local15 >> 8);
					local37 = local6.anInt5553 + (local6.anInt5554 * local15 >> 8);
					local47 = local6.anInt5551 + (local6.anInt5547 * local15 >> 8);
					local57 = local6.anInt5561 + (local6.anInt5563 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5558 == 2) {
				local15 = arg0 - local6.anInt5556;
				if (local15 > 0) {
					local27 = local6.anInt5550 + (local6.anInt5559 * local15 >> 8);
					local37 = local6.anInt5553 + (local6.anInt5554 * local15 >> 8);
					local47 = local6.anInt5551 + (local6.anInt5547 * local15 >> 8);
					local57 = local6.anInt5561 + (local6.anInt5563 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5558 == 3) {
				local15 = local6.anInt5550 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt5556 + (local6.anInt5560 * local15 >> 8);
					local37 = local6.anInt5564 + (local6.anInt5568 * local15 >> 8);
					local47 = local6.anInt5551 + (local6.anInt5547 * local15 >> 8);
					local57 = local6.anInt5561 + (local6.anInt5563 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5558 == 4) {
				local15 = arg2 - local6.anInt5550;
				if (local15 > 0) {
					local27 = local6.anInt5556 + (local6.anInt5560 * local15 >> 8);
					local37 = local6.anInt5564 + (local6.anInt5568 * local15 >> 8);
					local47 = local6.anInt5551 + (local6.anInt5547 * local15 >> 8);
					local57 = local6.anInt5561 + (local6.anInt5563 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5558 == 5) {
				local15 = arg1 - local6.anInt5551;
				if (local15 > 0) {
					local27 = local6.anInt5556 + (local6.anInt5560 * local15 >> 8);
					local37 = local6.anInt5564 + (local6.anInt5568 * local15 >> 8);
					local47 = local6.anInt5550 + (local6.anInt5559 * local15 >> 8);
					local57 = local6.anInt5553 + (local6.anInt5554 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
