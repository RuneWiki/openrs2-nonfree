import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!ke", name = "B", descriptor = "Lclient!v;")
	public static Class76 aClass76_672 = Static134.method2017("(Z");

	@OriginalMember(owner = "client!ke", name = "F", descriptor = "Lclient!v;")
	public static Class76 aClass76_673 = Static134.method2017("me");

	@OriginalMember(owner = "client!ke", name = "L", descriptor = "[Lclient!v;")
	public static Class76[] aClass76Array14 = new Class76[500];

	@OriginalMember(owner = "client!ke", name = "fb", descriptor = "Lclient!v;")
	private static Class76 aClass76_674 = Static134.method2017("Drop");

	@OriginalMember(owner = "client!ke", name = "ib", descriptor = "Lclient!v;")
	public static Class76 aClass76_675 = Static134.method2017("ams");

	@OriginalMember(owner = "client!ke", name = "mb", descriptor = "I")
	public static int anInt1613 = 0;

	@OriginalMember(owner = "client!ke", name = "Gb", descriptor = "Lclient!v;")
	public static Class76 aClass76_676 = aClass76_674;

	@OriginalMember(owner = "client!ke", name = "Lb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4 = new byte[4][104][104];

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "(I)I")
	public static int method1077() {
		@Pc(3) int local3 = 3;
		if (Static74.anInt1911 < 310) {
			@Pc(10) int local10 = Static106.anInt2354 >> 7;
			@Pc(15) int local15 = Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1416 >> 7;
			@Pc(20) int local20 = Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1393 >> 7;
			@Pc(24) int local24 = Static120.anInt2582 >> 7;
			@Pc(31) int local31;
			if (local20 > local10) {
				local31 = local20 - local10;
			} else {
				local31 = local10 - local20;
			}
			@Pc(46) int local46;
			if (local24 < local15) {
				local46 = local15 - local24;
			} else {
				local46 = local24 - local15;
			}
			if ((aByteArrayArrayArray4[Static124.anInt2712][local10][local24] & 0x4) != 0) {
				local3 = Static124.anInt2712;
			}
			@Pc(81) int local81;
			@Pc(83) int local83;
			if (local31 > local46) {
				local81 = local46 * 65536 / local31;
				local83 = 32768;
				while (local10 != local20) {
					local83 += local81;
					if (local20 > local10) {
						local10++;
					} else if (local10 > local20) {
						local10--;
					}
					if ((aByteArrayArrayArray4[Static124.anInt2712][local10][local24] & 0x4) != 0) {
						local3 = Static124.anInt2712;
					}
					if (local83 >= 65536) {
						if (local24 < local15) {
							local24++;
						} else if (local24 > local15) {
							local24--;
						}
						local83 -= 65536;
						if ((aByteArrayArrayArray4[Static124.anInt2712][local10][local24] & 0x4) != 0) {
							local3 = Static124.anInt2712;
						}
					}
				}
			} else {
				local81 = local31 * 65536 / local46;
				local83 = 32768;
				while (local24 != local15) {
					local83 += local81;
					if (local24 < local15) {
						local24++;
					} else if (local24 > local15) {
						local24--;
					}
					if ((aByteArrayArrayArray4[Static124.anInt2712][local10][local24] & 0x4) != 0) {
						local3 = Static124.anInt2712;
					}
					if (local83 >= 65536) {
						if (local10 < local20) {
							local10++;
						} else if (local10 > local20) {
							local10--;
						}
						if ((aByteArrayArrayArray4[Static124.anInt2712][local10][local24] & 0x4) != 0) {
							local3 = Static124.anInt2712;
						}
						local83 -= 65536;
					}
				}
			}
		}
		if ((aByteArrayArrayArray4[Static124.anInt2712][Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1393 >> 7][Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1416 >> 7] & 0x4) != 0) {
			local3 = Static124.anInt2712;
		}
		return local3;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(Z)V")
	public static void method1078() {
		Static69.aClass4_Sub10_Sub1_2.method611(154);
		for (@Pc(18) Class4_Sub14 local18 = (Class4_Sub14) Static42.aClass28_3.method775(); local18 != null; local18 = (Class4_Sub14) Static42.aClass28_3.method771()) {
			if (local18.anInt1983 == 0 || local18.anInt1983 == 3) {
				Static126.method1909(true, local18);
			}
		}
		if (Static65.aClass4_Sub8_5 != null) {
			Static63.method1095(Static65.aClass4_Sub8_5);
			Static65.aClass4_Sub8_5 = null;
		}
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(III)Lclient!dd;")
	public static Class4_Sub8 method1079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class4_Sub8 local7 = Static52.method946(arg1);
		if (arg0 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass4_Sub8Array1 == null || local7.aClass4_Sub8Array1.length <= arg0) {
			return null;
		} else {
			return local7.aClass4_Sub8Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!la;ILclient!la;)V")
	public static void method1088(@OriginalArg(0) Class17 arg0, @OriginalArg(2) Class17 arg1) {
		Static82.aClass17_27 = arg1;
		Static54.aClass17_36 = arg0;
		Static20.anInt446 = Static82.aClass17_27.method283(3);
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(B)V")
	public static void method1090() {
		aClass76_674 = null;
		aByteArrayArrayArray4 = null;
		aClass76Array14 = null;
		aClass76_676 = null;
		aClass76_673 = null;
		aClass76_675 = null;
		aClass76_672 = null;
	}
}
