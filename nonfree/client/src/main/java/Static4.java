import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "K", descriptor = "Lclient!ia;")
	public static Class37 aClass37_1;

	@OriginalMember(owner = "client!ac", name = "O", descriptor = "J")
	public static volatile long aLong5 = 0L;

	@OriginalMember(owner = "client!ac", name = "R", descriptor = "I")
	public static final int anInt62 = 2301979;

	@OriginalMember(owner = "client!ac", name = "ob", descriptor = "Lclient!cd;")
	public static Class10 aClass10_47 = Static51.method932("Mitglieder)2Welt");

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!bb;I)V")
	public static void method50(@OriginalArg(0) Class2_Sub1_Sub3_Sub2 arg0) {
		if (arg0.anInt3488 == Static14.anInt386 || arg0.anInt3509 == -1 || arg0.anInt3481 != 0 || arg0.anInt3473 + 1 > Static19.method325(arg0.anInt3509).anIntArray217[arg0.anInt3458]) {
			@Pc(37) int local37 = arg0.anInt3488 - arg0.anInt3461;
			@Pc(42) int local42 = Static14.anInt386 - arg0.anInt3461;
			@Pc(52) int local52 = arg0.anInt3467 * 64 + arg0.anInt3492 * 128;
			@Pc(62) int local62 = arg0.anInt3467 * 64 + arg0.anInt3453 * 128;
			@Pc(72) int local72 = arg0.anInt3467 * 64 + arg0.anInt3471 * 128;
			@Pc(82) int local82 = arg0.anInt3467 * 64 + arg0.anInt3490 * 128;
			arg0.anInt3499 = ((local37 - local42) * local52 + local72 * local42) / local37;
			arg0.anInt3454 = (local62 * (local37 - local42) + local82 * local42) / local37;
		}
		if (arg0.anInt3463 == 0) {
			arg0.anInt3465 = 1024;
		}
		arg0.anInt3506 = 0;
		if (arg0.anInt3463 == 1) {
			arg0.anInt3465 = 1536;
		}
		if (arg0.anInt3463 == 2) {
			arg0.anInt3465 = 0;
		}
		if (arg0.anInt3463 == 3) {
			arg0.anInt3465 = 512;
		}
		arg0.anInt3489 = arg0.anInt3465;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIB)V")
	public static void method51(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class23 local4 = Static14.method222(arg2, arg0);
		if (local4 != null && local4.anObjectArray13 != null) {
			@Pc(17) Class2_Sub18 local17 = new Class2_Sub18();
			local17.aClass23_9 = local4;
			local17.anObjectArray29 = local4.anObjectArray13;
			Static47.method881(local17);
		}
		Static169.anInt3668 = arg2;
		Static69.aBoolean74 = true;
		Static147.anInt3804 = arg1;
		Static148.anInt3212 = arg0;
		Static3.method34(local4);
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)V")
	public static void method52() {
		aClass37_1 = null;
		aClass10_47 = null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!bb;B)V")
	public static void method54(@OriginalArg(0) Class2_Sub1_Sub3_Sub2 arg0) {
		arg0.aBoolean154 = false;
		@Pc(13) Class2_Sub1_Sub9 local13;
		if (arg0.anInt3479 != -1) {
			local13 = Static19.method325(arg0.anInt3479);
			if (local13 == null || local13.anIntArray214 == null) {
				arg0.anInt3479 = -1;
			} else {
				arg0.anInt3501++;
				if (arg0.anInt3507 < local13.anIntArray214.length && local13.anIntArray217[arg0.anInt3507] < arg0.anInt3501) {
					arg0.anInt3501 = 1;
					arg0.anInt3507++;
					Static57.method1069(local13, arg0.anInt3454, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1 == arg0, arg0.anInt3499, arg0.anInt3507);
				}
				if (local13.anIntArray214.length <= arg0.anInt3507) {
					arg0.anInt3501 = 0;
					arg0.anInt3507 = 0;
					Static57.method1069(local13, arg0.anInt3454, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1 == arg0, arg0.anInt3499, arg0.anInt3507);
				}
			}
		}
		if (arg0.anInt3508 != -1 && arg0.anInt3485 <= Static14.anInt386) {
			if (arg0.anInt3500 < 0) {
				arg0.anInt3500 = 0;
			}
			@Pc(133) int local133 = Static76.method1260(arg0.anInt3508).anInt783;
			if (local133 == -1) {
				arg0.anInt3508 = -1;
			} else {
				@Pc(140) Class2_Sub1_Sub9 local140 = Static19.method325(local133);
				if (local140 == null || local140.anIntArray214 == null) {
					arg0.anInt3508 = -1;
				} else {
					arg0.anInt3470++;
					if (local140.anIntArray214.length > arg0.anInt3500 && arg0.anInt3470 > local140.anIntArray217[arg0.anInt3500]) {
						arg0.anInt3470 = 1;
						arg0.anInt3500++;
						Static57.method1069(local140, arg0.anInt3454, arg0 == Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1, arg0.anInt3499, arg0.anInt3500);
					}
					if (local140.anIntArray214.length <= arg0.anInt3500 && (arg0.anInt3500 < 0 || arg0.anInt3500 >= local140.anIntArray214.length)) {
						arg0.anInt3508 = -1;
					}
				}
			}
		}
		if (arg0.anInt3509 != -1 && arg0.anInt3481 <= 1) {
			local13 = Static19.method325(arg0.anInt3509);
			if (local13.anInt1933 == 1 && arg0.anInt3469 > 0 && Static14.anInt386 >= arg0.anInt3461 && arg0.anInt3488 < Static14.anInt386) {
				arg0.anInt3481 = 1;
				return;
			}
		}
		if (arg0.anInt3509 != -1 && arg0.anInt3481 == 0) {
			local13 = Static19.method325(arg0.anInt3509);
			if (local13 == null || local13.anIntArray214 == null) {
				arg0.anInt3509 = -1;
			} else {
				arg0.anInt3473++;
				if (local13.anIntArray214.length > arg0.anInt3458 && local13.anIntArray217[arg0.anInt3458] < arg0.anInt3473) {
					arg0.anInt3473 = 1;
					arg0.anInt3458++;
					Static57.method1069(local13, arg0.anInt3454, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1 == arg0, arg0.anInt3499, arg0.anInt3458);
				}
				if (local13.anIntArray214.length <= arg0.anInt3458) {
					arg0.anInt3497++;
					arg0.anInt3458 -= local13.anInt1929;
					if (local13.anInt1932 <= arg0.anInt3497) {
						arg0.anInt3509 = -1;
					} else if (arg0.anInt3458 >= 0 && local13.anIntArray214.length > arg0.anInt3458) {
						Static57.method1069(local13, arg0.anInt3454, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1 == arg0, arg0.anInt3499, arg0.anInt3458);
					} else {
						arg0.anInt3509 = -1;
					}
				}
				arg0.aBoolean154 = local13.aBoolean84;
			}
		}
		if (arg0.anInt3481 > 0) {
			arg0.anInt3481--;
		}
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)Z")
	public static boolean method56() {
		@Pc(8) long local8 = Static29.method615();
		@Pc(20) int local20 = (int) (local8 - Static54.aLong48);
		if (local20 > 200) {
			local20 = 200;
		}
		Static41.anInt983 += local20;
		Static54.aLong48 = local8;
		if (Static10.anInt260 == 0 && Static77.anInt1801 == 0 && Static30.anInt818 == 0 && Static130.anInt2900 == 0) {
			return true;
		} else if (Static58.aClass34_2 == null) {
			return false;
		} else {
			try {
				if (Static41.anInt983 > 30000) {
					throw new IOException();
				}
				@Pc(61) Class2_Sub1_Sub11 local61;
				@Pc(66) Class2_Sub11 local66;
				while (Static77.anInt1801 < 20 && Static130.anInt2900 > 0) {
					local61 = (Class2_Sub1_Sub11) Static179.aClass18_12.method687();
					local66 = new Class2_Sub11(4);
					local66.method1439(1);
					local66.method1478((int) local61.aLong139);
					Static58.aClass34_2.method1130(4, local66.aByteArray24);
					Static22.aClass18_1.method685(local61.aLong139, local61);
					Static130.anInt2900--;
					Static77.anInt1801++;
				}
				while (Static10.anInt260 < 20 && Static30.anInt818 > 0) {
					local61 = (Class2_Sub1_Sub11) Static22.aClass28_1.method947();
					local66 = new Class2_Sub11(4);
					local66.method1439(0);
					local66.method1478((int) local61.aLong139);
					Static58.aClass34_2.method1130(4, local66.aByteArray24);
					local61.method2540();
					Static57.aClass18_7.method685(local61.aLong139, local61);
					Static30.anInt818--;
					Static10.anInt260++;
				}
				for (@Pc(163) int local163 = 0; local163 < 100; local163++) {
					@Pc(169) int local169 = Static58.aClass34_2.method1135();
					if (local169 < 0) {
						throw new IOException();
					}
					if (local169 == 0) {
						break;
					}
					Static41.anInt983 = 0;
					@Pc(184) byte local184 = 0;
					if (Static139.aClass2_Sub1_Sub11_1 == null) {
						local184 = 8;
					} else if (Static160.anInt3404 == 0) {
						local184 = 1;
					}
					@Pc(210) int local210;
					@Pc(215) int local215;
					@Pc(249) int local249;
					@Pc(386) int local386;
					if (local184 <= 0) {
						local210 = Static10.aClass2_Sub11_1.aByteArray24.length - Static139.aClass2_Sub1_Sub11_1.aByte3;
						local215 = 512 - Static160.anInt3404;
						if (local210 - Static10.aClass2_Sub11_1.anInt2077 < local215) {
							local215 = local210 - Static10.aClass2_Sub11_1.anInt2077;
						}
						if (local215 > local169) {
							local215 = local169;
						}
						Static58.aClass34_2.method1134(Static10.aClass2_Sub11_1.anInt2077, local215, Static10.aClass2_Sub11_1.aByteArray24);
						if (Static123.aByte7 != 0) {
							for (local249 = 0; local249 < local215; local249++) {
								Static10.aClass2_Sub11_1.aByteArray24[Static10.aClass2_Sub11_1.anInt2077 + local249] = (byte) (Static10.aClass2_Sub11_1.aByteArray24[Static10.aClass2_Sub11_1.anInt2077 + local249] ^ Static123.aByte7);
							}
						}
						Static160.anInt3404 += local215;
						Static10.aClass2_Sub11_1.anInt2077 += local215;
						if (local210 == Static10.aClass2_Sub11_1.anInt2077) {
							if (Static139.aClass2_Sub1_Sub11_1.aLong139 == 16711935L) {
								Static41.aClass2_Sub11_3 = Static10.aClass2_Sub11_1;
								for (local249 = 0; local249 < 256; local249++) {
									@Pc(373) Class29_Sub1 local373 = Static7.aClass29_Sub1Array1[local249];
									if (local373 != null) {
										Static41.aClass2_Sub11_3.anInt2077 = local249 * 8 + 5;
										local386 = Static41.aClass2_Sub11_3.method1449();
										@Pc(390) int local390 = Static41.aClass2_Sub11_3.method1449();
										local373.method1042(local386, local390);
									}
								}
							} else {
								Static102.aCRC32_35.reset();
								Static102.aCRC32_35.update(Static10.aClass2_Sub11_1.aByteArray24, 0, local210);
								local249 = (int) Static102.aCRC32_35.getValue();
								if (local249 != Static139.aClass2_Sub1_Sub11_1.anInt2339) {
									try {
										Static58.aClass34_2.method1136();
									} catch (@Pc(319) Exception local319) {
									}
									Static123.aByte7 = (byte) (Math.random() * 255.0D + 1.0D);
									Static140.anInt3103++;
									Static58.aClass34_2 = null;
									return false;
								}
								Static36.anInt926 = 0;
								Static140.anInt3103 = 0;
								Static139.aClass2_Sub1_Sub11_1.aClass29_Sub1_33.method1043((Static139.aClass2_Sub1_Sub11_1.aLong139 & 0xFF0000L) == 16711680L, (int) (Static139.aClass2_Sub1_Sub11_1.aLong139 & 0xFFFFL), Static180.aBoolean168, Static10.aClass2_Sub11_1.aByteArray24);
							}
							Static139.aClass2_Sub1_Sub11_1.method2705();
							Static160.anInt3404 = 0;
							if (Static180.aBoolean168) {
								Static77.anInt1801--;
							} else {
								Static10.anInt260--;
							}
							Static139.aClass2_Sub1_Sub11_1 = null;
							Static10.aClass2_Sub11_1 = null;
						} else {
							if (Static160.anInt3404 != 512) {
								break;
							}
							Static160.anInt3404 = 0;
						}
					} else {
						local210 = local184 - Static27.aClass2_Sub11_2.anInt2077;
						if (local169 < local210) {
							local210 = local169;
						}
						Static58.aClass34_2.method1134(Static27.aClass2_Sub11_2.anInt2077, local210, Static27.aClass2_Sub11_2.aByteArray24);
						if (Static123.aByte7 != 0) {
							for (local215 = 0; local215 < local210; local215++) {
								Static27.aClass2_Sub11_2.aByteArray24[Static27.aClass2_Sub11_2.anInt2077 + local215] ^= Static123.aByte7;
							}
						}
						Static27.aClass2_Sub11_2.anInt2077 += local210;
						if (Static27.aClass2_Sub11_2.anInt2077 < local184) {
							break;
						}
						if (Static139.aClass2_Sub1_Sub11_1 == null) {
							Static27.aClass2_Sub11_2.anInt2077 = 0;
							local215 = Static27.aClass2_Sub11_2.method1461();
							local249 = Static27.aClass2_Sub11_2.method1456();
							@Pc(516) int local516 = Static27.aClass2_Sub11_2.method1461();
							local386 = Static27.aClass2_Sub11_2.method1449();
							@Pc(527) long local527 = (long) (local249 + (local215 << 16));
							@Pc(533) Class2_Sub1_Sub11 local533 = (Class2_Sub1_Sub11) Static22.aClass18_1.method683(local527);
							Static180.aBoolean168 = true;
							if (local533 == null) {
								local533 = (Class2_Sub1_Sub11) Static57.aClass18_7.method683(local527);
								Static180.aBoolean168 = false;
							}
							if (local533 == null) {
								throw new IOException();
							}
							Static139.aClass2_Sub1_Sub11_1 = local533;
							@Pc(559) int local559 = local516 == 0 ? 5 : 9;
							Static10.aClass2_Sub11_1 = new Class2_Sub11(Static139.aClass2_Sub1_Sub11_1.aByte3 + local386 + local559);
							Static10.aClass2_Sub11_1.method1439(local516);
							Static10.aClass2_Sub11_1.method1445(local386);
							Static27.aClass2_Sub11_2.anInt2077 = 0;
							Static160.anInt3404 = 8;
						} else if (Static160.anInt3404 == 0) {
							if (Static27.aClass2_Sub11_2.aByteArray24[0] == -1) {
								Static27.aClass2_Sub11_2.anInt2077 = 0;
								Static160.anInt3404 = 1;
							} else {
								Static139.aClass2_Sub1_Sub11_1 = null;
							}
						}
					}
				}
				return true;
			} catch (@Pc(612) IOException local612) {
				try {
					Static58.aClass34_2.method1136();
				} catch (@Pc(617) Exception local617) {
				}
				Static36.anInt926++;
				Static58.aClass34_2 = null;
				return false;
			}
		}
	}
}
