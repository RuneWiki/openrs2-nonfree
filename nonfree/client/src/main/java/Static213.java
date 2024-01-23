import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!qe", name = "x", descriptor = "F")
	public static float aFloat44;

	@OriginalMember(owner = "client!qe", name = "K", descriptor = "Lclient!bh;")
	public static Class15 aClass15_6;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILclient!qb;)V")
	public static void method3407(@OriginalArg(1) Class12_Sub3_Sub2 arg0) {
		@Pc(12) Class4_Sub23 local12 = (Class4_Sub23) Static262.aClass97_22.method2360(Static34.method491(arg0.aString132));
		if (local12 == null) {
			Static54.method872(arg0.anIntArray379[0], arg0, null, 0, arg0.anIntArray376[0], null, Static210.anInt4103);
		} else {
			local12.method2708();
		}
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
	public static void method3409() {
		if (Static286.method4296() != 2) {
			return;
		}
		@Pc(20) byte local20 = (byte) (Static32.anInt641 - 4 & 0xFF);
		@Pc(24) int local24 = Static32.anInt641 % 104;
		@Pc(26) int local26;
		@Pc(31) int local31;
		for (local26 = 0; local26 < 4; local26++) {
			for (local31 = 0; local31 < 104; local31++) {
				Static275.aByteArrayArrayArray18[local26][local24][local31] = local20;
			}
		}
		if (Static210.anInt4103 == 3) {
			return;
		}
		for (local26 = 0; local26 < 2; local26++) {
			Static16.anIntArray33[local26] = -1000000;
			Static127.anIntArray244[local26] = 1000000;
			Static150.anIntArray278[local26] = 0;
			Static120.anIntArray238[local26] = 1000000;
			Static255.anIntArray434[local26] = 0;
		}
		if (Static239.anInt4616 != 1) {
			local26 = Static96.method1559(Static210.anInt4103, Static211.anInt4210, Static149.anInt3032);
			if (local26 - Static160.anInt3185 < 800 && (Static46.aByteArrayArrayArray2[Static210.anInt4103][Static149.anInt3032 >> 7][Static211.anInt4210 >> 7] & 0x4) != 0) {
				Static55.method879(false, Static127.aClass4_Sub11ArrayArrayArray1, Static149.anInt3032 >> 7, 1, Static211.anInt4210 >> 7);
			}
			return;
		}
		if ((Static46.aByteArrayArrayArray2[Static210.anInt4103][Static239.aClass12_Sub3_Sub2_2.anInt4141 >> 7][Static239.aClass12_Sub3_Sub2_2.anInt4113 >> 7] & 0x4) != 0) {
			Static55.method879(false, Static127.aClass4_Sub11ArrayArrayArray1, Static239.aClass12_Sub3_Sub2_2.anInt4141 >> 7, 0, Static239.aClass12_Sub3_Sub2_2.anInt4113 >> 7);
		}
		if (Static299.anInt5560 >= 310) {
			return;
		}
		local26 = Static149.anInt3032 >> 7;
		local31 = Static211.anInt4210 >> 7;
		@Pc(188) int local188 = Static239.aClass12_Sub3_Sub2_2.anInt4141 >> 7;
		@Pc(193) int local193 = Static239.aClass12_Sub3_Sub2_2.anInt4113 >> 7;
		@Pc(201) int local201;
		if (local26 >= local188) {
			local201 = local26 - local188;
		} else {
			local201 = local188 - local26;
		}
		@Pc(218) int local218;
		if (local193 <= local31) {
			local218 = local31 - local193;
		} else {
			local218 = local193 - local31;
		}
		if (local201 == 0 && local218 == 0 || local201 <= -104 || local201 >= 104 || local218 <= -104 || local218 >= 104) {
			Static244.method3721("RC: " + local26 + "," + local31 + " " + local188 + "," + local193 + " " + Static170.anInt3385 + "," + Static239.anInt4613, null);
			return;
		}
		@Pc(295) int local295;
		@Pc(297) int local297;
		if (local218 < local201) {
			local295 = local218 * 65536 / local201;
			local297 = 32768;
			while (local188 != local26) {
				if (local26 < local188) {
					local26++;
				} else if (local188 < local26) {
					local26--;
				}
				if ((Static46.aByteArrayArrayArray2[Static210.anInt4103][local26][local31] & 0x4) != 0) {
					Static55.method879(false, Static127.aClass4_Sub11ArrayArrayArray1, local26, 1, local31);
					break;
				}
				local297 += local295;
				if (local297 >= 65536) {
					if (local31 < local193) {
						local31++;
					} else if (local31 > local193) {
						local31--;
					}
					local297 -= 65536;
					if ((Static46.aByteArrayArrayArray2[Static210.anInt4103][local26][local31] & 0x4) != 0) {
						Static55.method879(false, Static127.aClass4_Sub11ArrayArrayArray1, local26, 1, local31);
						break;
					}
				}
			}
			return;
		}
		local295 = local201 * 65536 / local218;
		local297 = 32768;
		while (local31 != local193) {
			if (local193 > local31) {
				local31++;
			} else if (local193 < local31) {
				local31--;
			}
			if ((Static46.aByteArrayArrayArray2[Static210.anInt4103][local26][local31] & 0x4) != 0) {
				Static55.method879(false, Static127.aClass4_Sub11ArrayArrayArray1, local26, 1, local31);
				break;
			}
			local297 += local295;
			if (local297 >= 65536) {
				if (local188 > local26) {
					local26++;
				} else if (local188 < local26) {
					local26--;
				}
				local297 -= 65536;
				if ((Static46.aByteArrayArrayArray2[Static210.anInt4103][local26][local31] & 0x4) != 0) {
					Static55.method879(false, Static127.aClass4_Sub11ArrayArrayArray1, local26, 1, local31);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIBI)V")
	public static void method3410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(4) Class4_Sub2_Sub21 local4 = Static39.method4121(arg2, 9);
		local4.method4360();
		local4.anInt5492 = arg1;
		local4.anInt5495 = arg0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "([I[I[IILclient!hc;)V")
	public static void method3412(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) Class12_Sub3_Sub1 arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(15) int local15 = arg0[local3];
			@Pc(19) int local19 = arg1[local3];
			@Pc(23) int local23 = arg2[local3];
			@Pc(25) int local25 = 0;
			while (local19 != 0 && local25 < arg3.aClass28Array3.length) {
				if ((local19 & 0x1) != 0) {
					if (local15 == -1) {
						arg3.aClass28Array3[local25] = null;
					} else {
						@Pc(50) Class141 local50 = Static296.method1376(local15);
						@Pc(53) int local53 = local50.anInt4349;
						@Pc(58) Class28 local58 = arg3.aClass28Array3[local25];
						if (local58 != null) {
							if (local58.anInt860 == local15) {
								if (local53 == 0) {
									local58 = arg3.aClass28Array3[local25] = null;
								} else if (local53 == 1) {
									local58.anInt855 = 0;
									local58.anInt858 = 0;
									local58.anInt857 = 1;
									local58.anInt853 = 0;
									local58.anInt851 = local23;
									Static11.method188(false, local50, arg3.anInt4141, arg3.anInt4113, 0);
								} else if (local53 == 2) {
									local58.anInt853 = 0;
								}
							} else if (local50.anInt4358 >= Static296.method1376(local58.anInt860).anInt4358) {
								local58 = arg3.aClass28Array3[local25] = null;
							}
						}
						if (local58 == null) {
							local58 = arg3.aClass28Array3[local25] = new Class28();
							local58.anInt851 = local23;
							local58.anInt853 = 0;
							local58.anInt860 = local15;
							local58.anInt855 = 0;
							local58.anInt858 = 0;
							local58.anInt857 = 1;
							Static11.method188(false, local50, arg3.anInt4141, arg3.anInt4113, 0);
						}
					}
				}
				local25++;
				local19 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)V")
	public static void method3414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static125.aBoolean177 = true;
		Static73.anInt1343 = arg0;
		Static243.anInt4645 = arg1;
		Static217.anInt4313 = arg2;
		Static173.anInt3434 = -1;
		Static247.anInt4704 = -1;
	}

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)V")
	public static void method3415() {
		aClass15_6 = null;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIII)V")
	public static void method3418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static92.anInt1911 = -1;
		Static96.anInt2064 = Static92.anInt1912 * arg2 / arg3;
		Static295.anInt5481 = arg0 * Static269.anInt5031 / arg1;
		Static299.anInt5561 = -1;
		Static249.method3769();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIZI)V")
	public static void method3420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(32) String local32 = "::tele " + arg2 + "," + (arg1 >> 6) + "," + (arg0 >> 6) + "," + (arg1 & 0x3F) + "," + (arg0 & 0x3F);
		System.out.println(local32);
		Static16.method274(local32);
	}
}
