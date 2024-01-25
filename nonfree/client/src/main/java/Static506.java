import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static506 {

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "[[I")
	public static int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!qba", name = "d", descriptor = "Lclient!al;")
	public static Class18 aClass18_13;

	@OriginalMember(owner = "client!qba", name = "j", descriptor = "Lclient!ro;")
	public static Class327 aClass327_2;

	@OriginalMember(owner = "client!qba", name = "c", descriptor = "I")
	public static int anInt8028;

	@OriginalMember(owner = "client!qba", name = "h", descriptor = "J")
	public static long aLong250 = 0L;

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IILclient!pf;B)Lclient!rka;")
	public static Class2_Sub6_Sub19 method7163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class286 arg2) {
		@Pc(10) int local10 = arg1 << 10 | arg2.anInt7724;
		@Pc(19) Class2_Sub6_Sub19 local19 = (Class2_Sub6_Sub19) Static363.aClass378_4.method9118((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(32) byte[] local32 = Static680.aClass254_169.method6079(Static680.aClass254_169.method6074(local10));
		if (local32 == null) {
			local10 = arg2.anInt7724 | arg0 + 65536 << 10;
			local19 = (Class2_Sub6_Sub19) Static363.aClass378_4.method9118((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local32 = Static680.aClass254_169.method6079(Static680.aClass254_169.method6074(local10));
			if (local32 == null) {
				local10 = arg2.anInt7724 | 0x3FFFC00;
				local19 = (Class2_Sub6_Sub19) Static363.aClass378_4.method9118((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local32 = Static680.aClass254_169.method6079(Static680.aClass254_169.method6074(local10));
				if (local32 == null) {
					return null;
				} else if (local32.length <= 1) {
					return null;
				} else {
					try {
						local19 = Static302.method4221(local32);
					} catch (@Pc(212) Exception local212) {
						throw new RuntimeException(local212.getMessage() + " S: " + local10);
					}
					local19.aClass286_13 = arg2;
					Static363.aClass378_4.method9117((long) local10 << 16, local19);
					return local19;
				}
			} else if (local32.length <= 1) {
				return null;
			} else {
				try {
					local19 = Static302.method4221(local32);
				} catch (@Pc(127) Exception local127) {
					throw new RuntimeException(local127.getMessage() + " S: " + local10);
				}
				local19.aClass286_13 = arg2;
				Static363.aClass378_4.method9117((long) local10 << 16, local19);
				return local19;
			}
		} else if (local32.length <= 1) {
			return null;
		} else {
			try {
				local19 = Static302.method4221(local32);
			} catch (@Pc(49) Exception local49) {
				throw new RuntimeException(local49.getMessage() + " S: " + local10);
			}
			local19.aClass286_13 = arg2;
			Static363.aClass378_4.method9117((long) local10 << 16, local19);
			return local19;
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(Lclient!da;)V")
	public static void method7165(@OriginalArg(0) Class68 arg0) {
		Static116.aClass68_5 = arg0;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "()V")
	public static void method7169() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static618.aClass311ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static618.aClass311ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static372.anInt5930; local6++) {
					for (local9 = 0; local9 < Static545.anInt8590; local9++) {
						if (Static618.aClass311ArrayArrayArray2[local3][local6][local9] != null) {
							Static618.aClass311ArrayArrayArray2[local3][local6][local9].method7355();
						}
						Static618.aClass311ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static618.aClass311ArrayArrayArray2 = null;
		Static126.aClass133Array1 = null;
		if (Static564.aClass311ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static564.aClass311ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static372.anInt5930; local6++) {
					for (local9 = 0; local9 < Static545.anInt8590; local9++) {
						if (Static564.aClass311ArrayArrayArray1[local3][local6][local9] != null) {
							Static564.aClass311ArrayArrayArray1[local3][local6][local9].method7355();
						}
						Static564.aClass311ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static564.aClass311ArrayArrayArray1 = null;
		Static685.aClass133Array5 = null;
		Static632.aClass311ArrayArrayArray3 = null;
		Static158.aClass133Array4 = null;
		Static208.aBooleanArrayArray6 = null;
		Static605.aBooleanArrayArray10 = null;
		Static234.anIntArray288 = null;
		Static9.aBooleanArrayArrayArray1 = null;
		Static277.aBooleanArrayArrayArray2 = null;
		Static159.method2365();
		if (Static505.aClass4_Sub2_Sub1Array1 != null) {
			for (local3 = 0; local3 < Static240.anInt10693; local3++) {
				Static505.aClass4_Sub2_Sub1Array1[local3] = null;
			}
			Static240.anInt10693 = 0;
		}
		Static594.aClass4_Sub2Array5 = null;
		Static161.aClass4_Sub2Array1 = null;
		Static699.aClass4_Sub2Array6 = null;
		if (Static503.aClass4_Sub2Array3 != null) {
			for (local3 = 0; local3 < Static503.aClass4_Sub2Array3.length; local3++) {
				Static503.aClass4_Sub2Array3[local3] = null;
			}
			Static457.anInt7457 = 0;
		}
		if (Static248.aClass4_Sub2Array4 != null) {
			for (local3 = 0; local3 < Static248.aClass4_Sub2Array4.length; local3++) {
				Static248.aClass4_Sub2Array4[local3] = null;
			}
			Static689.anInt10611 = 0;
		}
		if (Static292.aClass248Array1 != null) {
			for (local3 = 0; local3 < Static488.anInt7862; local3++) {
				Static292.aClass248Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static97.anInt1761; local6++) {
				for (local9 = 0; local9 < Static372.anInt5930; local9++) {
					for (@Pc(217) int local217 = 0; local217 < Static545.anInt8590; local217++) {
						Static255.aLongArrayArrayArray1[local6][local9][local217] = 0L;
					}
				}
			}
			Static488.anInt7862 = 0;
		}
		Static303.method4229();
		Static655.aClass52_3 = Static655.aClass52_2;
		Static655.aClass52_3.method1069();
		Static314.aByteArrayArray9 = null;
		Static217.anIntArrayArray28 = null;
		Static651.aShortArrayArray6 = null;
		if (Static403.aClass23Array1 != null) {
			Static47.method622();
			Static689.aClass145_16.method9633(1);
			Static689.aClass145_16.method9705(0);
		}
		if (Static444.aClass324Array1 != null) {
			Static444.aClass324Array1 = null;
		}
		Static689.aClass145_16 = null;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IC)Z")
	public static boolean method7170(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IB)V")
	public static void method7172(@OriginalArg(0) int arg0) {
		Static697.anInt10712 = arg0;
		Static332.aClass85_38.method1748();
	}
}
