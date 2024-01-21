import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!p", name = "A", descriptor = "Lclient!kg;")
	public static Class43 aClass43_43;

	@OriginalMember(owner = "client!p", name = "F", descriptor = "I")
	public static volatile int anInt4421 = 0;

	@OriginalMember(owner = "client!p", name = "H", descriptor = "I")
	public static int anInt4423 = 2;

	@OriginalMember(owner = "client!p", name = "O", descriptor = "[I")
	public static int[] anIntArray421 = new int[1000];

	@OriginalMember(owner = "client!p", name = "S", descriptor = "I")
	public static int anInt4430 = 0;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V")
	public static void method3392() {
		anIntArray421 = null;
		aClass43_43 = null;
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(B)V")
	public static void method3394() {
		for (@Pc(18) Class1_Sub10 local18 = (Class1_Sub10) Static130.aClass4_13.method174(); local18 != null; local18 = (Class1_Sub10) Static130.aClass4_13.method181()) {
			if (local18.aClass1_Sub1_Sub7_1 != null) {
				local18.method1421();
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "e", descriptor = "(I)V")
	public static void method3396() {
		try {
			if (Static68.anInt2112 == 0) {
				if (Static85.aClass43_22 != null) {
					Static85.aClass43_22.method2042();
					Static85.aClass43_22 = null;
				}
				Static164.anInt4266 = 0;
				Static109.aBoolean125 = false;
				Static133.aClass18_7 = null;
				Static68.anInt2112 = 1;
			}
			if (Static68.anInt2112 == 1) {
				if (Static133.aClass18_7 == null) {
					Static133.aClass18_7 = Static9.aClass32_1.method1475(Static158.anInt4152, Static101.aString4);
				}
				if (Static133.aClass18_7.anInt1403 == 2) {
					throw new IOException();
				}
				if (Static133.aClass18_7.anInt1403 == 1) {
					Static85.aClass43_22 = new Class43((Socket) Static133.aClass18_7.anObject2, Static9.aClass32_1);
					Static68.anInt2112 = 2;
					Static133.aClass18_7 = null;
				}
			}
			if (Static68.anInt2112 == 2) {
				@Pc(72) long local72 = Static90.aLong80 = Static179.aClass70_1563.method2925();
				@Pc(79) int local79 = (int) (local72 >> 16 & 0x1FL);
				Static131.aClass1_Sub9_Sub1_3.anInt1592 = 0;
				Static131.aClass1_Sub9_Sub1_3.method1260(14);
				Static131.aClass1_Sub9_Sub1_3.method1260(local79);
				Static85.aClass43_22.method2045(Static131.aClass1_Sub9_Sub1_3.aByteArray25, 2);
				Static68.anInt2112 = 3;
				Static98.aClass1_Sub9_Sub1_2.anInt1592 = 0;
			}
			@Pc(119) int local119;
			if (Static68.anInt2112 == 3) {
				if (Static110.aClass2_1 != null) {
					Static110.aClass2_1.method1977();
				}
				if (Static172.aClass2_2 != null) {
					Static172.aClass2_2.method1977();
				}
				local119 = Static85.aClass43_22.method2043();
				if (Static110.aClass2_1 != null) {
					Static110.aClass2_1.method1977();
				}
				if (Static172.aClass2_2 != null) {
					Static172.aClass2_2.method1977();
				}
				if (local119 != 0) {
					Static111.method2287(local119);
					return;
				}
				Static98.aClass1_Sub9_Sub1_2.anInt1592 = 0;
				Static68.anInt2112 = 4;
			}
			if (Static68.anInt2112 == 4) {
				if (Static98.aClass1_Sub9_Sub1_2.anInt1592 < 8) {
					local119 = Static85.aClass43_22.method2041();
					if (8 - Static98.aClass1_Sub9_Sub1_2.anInt1592 < local119) {
						local119 = 8 - Static98.aClass1_Sub9_Sub1_2.anInt1592;
					}
					if (local119 > 0) {
						Static85.aClass43_22.method2047(Static98.aClass1_Sub9_Sub1_2.anInt1592, local119, Static98.aClass1_Sub9_Sub1_2.aByteArray25);
						Static98.aClass1_Sub9_Sub1_2.anInt1592 += local119;
					}
				}
				if (Static98.aClass1_Sub9_Sub1_2.anInt1592 == 8) {
					Static98.aClass1_Sub9_Sub1_2.anInt1592 = 0;
					Static16.aLong23 = Static98.aClass1_Sub9_Sub1_2.method1269();
					Static68.anInt2112 = 5;
				}
			}
			if (Static68.anInt2112 == 5) {
				@Pc(212) int[] local212 = new int[] { 0, (int) (Math.random() * 9.9999999E7D), 0, (int) Static16.aLong23 };
				Static131.aClass1_Sub9_Sub1_3.anInt1592 = 0;
				local212[0] = (int) (Math.random() * 9.9999999E7D);
				local212[2] = (int) (Static16.aLong23 >> 32);
				Static131.aClass1_Sub9_Sub1_3.method1260(10);
				Static131.aClass1_Sub9_Sub1_3.method1259(local212[0]);
				Static131.aClass1_Sub9_Sub1_3.method1259(local212[1]);
				Static131.aClass1_Sub9_Sub1_3.method1259(local212[2]);
				Static131.aClass1_Sub9_Sub1_3.method1259(local212[3]);
				Static131.aClass1_Sub9_Sub1_3.method1263(Static179.aClass70_1563.method2925());
				Static131.aClass1_Sub9_Sub1_3.method1232(Static179.aClass70_1564);
				Static131.aClass1_Sub9_Sub1_3.method1227(Static53.aBigInteger1, Static112.aBigInteger3);
				Static36.aClass1_Sub9_Sub1_1.anInt1592 = 0;
				if (Static15.anInt445 == 40) {
					Static36.aClass1_Sub9_Sub1_1.method1260(18);
				} else {
					Static36.aClass1_Sub9_Sub1_1.method1260(16);
				}
				Static36.aClass1_Sub9_Sub1_1.method1260(Static131.aClass1_Sub9_Sub1_3.anInt1592 + 93);
				Static36.aClass1_Sub9_Sub1_1.method1259(483);
				Static36.aClass1_Sub9_Sub1_1.method1260(Static79.aBoolean91 ? 1 : 0);
				Static173.method3414(Static36.aClass1_Sub9_Sub1_1);
				Static36.aClass1_Sub9_Sub1_1.method1259(Static45.aClass76_Sub1_4.anInt4334);
				Static36.aClass1_Sub9_Sub1_1.method1259(Static148.aClass76_Sub1_13.anInt4334);
				Static36.aClass1_Sub9_Sub1_1.method1259(Static40.aClass76_Sub1_3.anInt4334);
				Static36.aClass1_Sub9_Sub1_1.method1259(Static58.aClass76_Sub1_5.anInt4334);
				Static36.aClass1_Sub9_Sub1_1.method1259(Static113.aClass76_Sub1_10.anInt4334);
				Static36.aClass1_Sub9_Sub1_1.method1259(Static67.aClass76_Sub1_6.anInt4334);
				Static36.aClass1_Sub9_Sub1_1.method1259(Static124.aClass76_Sub1_12.anInt4334);
				Static36.aClass1_Sub9_Sub1_1.method1259(Static16.aClass76_Sub1_1.anInt4334);
				Static36.aClass1_Sub9_Sub1_1.method1259(Static156.aClass76_Sub1_15.anInt4334);
				Static36.aClass1_Sub9_Sub1_1.method1259(Static150.aClass76_Sub1_14.anInt4334);
				Static36.aClass1_Sub9_Sub1_1.method1259(Static101.aClass76_Sub1_9.anInt4334);
				Static36.aClass1_Sub9_Sub1_1.method1259(Static161.aClass76_Sub1_16.anInt4334);
				Static36.aClass1_Sub9_Sub1_1.method1259(Static88.aClass76_Sub1_8.anInt4334);
				Static36.aClass1_Sub9_Sub1_1.method1259(Static179.aClass76_Sub1_18.anInt4334);
				Static36.aClass1_Sub9_Sub1_1.method1259(Static171.aClass76_Sub1_17.anInt4334);
				Static36.aClass1_Sub9_Sub1_1.method1259(Static118.aClass76_Sub1_11.anInt4334);
				Static36.aClass1_Sub9_Sub1_1.method1255(Static131.aClass1_Sub9_Sub1_3.anInt1592, Static131.aClass1_Sub9_Sub1_3.aByteArray25);
				Static85.aClass43_22.method2045(Static36.aClass1_Sub9_Sub1_1.aByteArray25, Static36.aClass1_Sub9_Sub1_1.anInt1592);
				Static131.aClass1_Sub9_Sub1_3.method1290(local212);
				for (@Pc(426) int local426 = 0; local426 < 4; local426++) {
					local212[local426] += 50;
				}
				Static98.aClass1_Sub9_Sub1_2.method1290(local212);
				Static68.anInt2112 = 6;
			}
			if (Static68.anInt2112 == 6 && Static85.aClass43_22.method2041() > 0) {
				local119 = Static85.aClass43_22.method2043();
				if (local119 == 21 && Static15.anInt445 == 20) {
					Static68.anInt2112 = 7;
				} else if (local119 == 2) {
					Static68.anInt2112 = 9;
				} else if (local119 == 15 && Static15.anInt445 == 40) {
					Static83.method3498();
					return;
				} else if (local119 == 23 && Static30.anInt995 < 1) {
					Static68.anInt2112 = 0;
					Static30.anInt995++;
				} else {
					Static111.method2287(local119);
					return;
				}
			}
			if (Static68.anInt2112 == 7 && Static85.aClass43_22.method2041() > 0) {
				Static118.anInt3208 = (Static85.aClass43_22.method2043() + 3) * 60;
				Static68.anInt2112 = 8;
			}
			if (Static68.anInt2112 == 8) {
				Static164.anInt4266 = 0;
				Static15.method374(Static24.aClass70_226, Static160.method3210(new Class70[] { Static34.method873(Static118.anInt3208 / 60), Static119.aClass70_1092 }), Static108.aClass70_994);
				if (--Static118.anInt3208 <= 0) {
					Static68.anInt2112 = 0;
				}
			} else {
				if (Static68.anInt2112 == 9 && Static85.aClass43_22.method2041() >= 9) {
					Static20.anInt551 = Static85.aClass43_22.method2043();
					Static61.anInt1952 = Static85.aClass43_22.method2043();
					Static100.aBoolean114 = Static85.aClass43_22.method2043() == 1;
					Static177.anInt4484 = Static85.aClass43_22.method2043();
					Static177.anInt4484 <<= 0x8;
					Static177.anInt4484 += Static85.aClass43_22.method2043();
					Static143.anInt3770 = Static85.aClass43_22.method2043();
					Static85.aClass43_22.method2047(0, 1, Static98.aClass1_Sub9_Sub1_2.aByteArray25);
					Static98.aClass1_Sub9_Sub1_2.anInt1592 = 0;
					Static98.anInt2835 = Static98.aClass1_Sub9_Sub1_2.method1292();
					Static85.aClass43_22.method2047(0, 2, Static98.aClass1_Sub9_Sub1_2.aByteArray25);
					Static98.aClass1_Sub9_Sub1_2.anInt1592 = 0;
					Static69.anInt2127 = Static98.aClass1_Sub9_Sub1_2.method1280();
					Static68.anInt2112 = 10;
				}
				if (Static68.anInt2112 != 10) {
					Static164.anInt4266++;
					if (Static164.anInt4266 > 2000) {
						if (Static30.anInt995 < 1) {
							if (Static58.anInt1874 == Static158.anInt4152) {
								Static158.anInt4152 = Static3.anInt172;
							} else {
								Static158.anInt4152 = Static58.anInt1874;
							}
							Static30.anInt995++;
							Static68.anInt2112 = 0;
						} else {
							Static111.method2287(-3);
						}
					}
				} else if (Static85.aClass43_22.method2041() >= Static69.anInt2127) {
					Static98.aClass1_Sub9_Sub1_2.anInt1592 = 0;
					Static85.aClass43_22.method2047(0, Static69.anInt2127, Static98.aClass1_Sub9_Sub1_2.aByteArray25);
					Static2.method141();
					Static108.anInt3053 = -1;
					Static44.method1093(false);
					Static98.anInt2835 = -1;
				}
			}
		} catch (@Pc(717) IOException local717) {
			if (Static30.anInt995 < 1) {
				if (Static58.anInt1874 == Static158.anInt4152) {
					Static158.anInt4152 = Static3.anInt172;
				} else {
					Static158.anInt4152 = Static58.anInt1874;
				}
				Static30.anInt995++;
				Static68.anInt2112 = 0;
			} else {
				Static111.method2287(-2);
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIII)I")
	public static int method3397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return arg0 * arg1 + (4096 - arg0) * arg2 >> 12;
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(II)I")
	public static int method3402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
