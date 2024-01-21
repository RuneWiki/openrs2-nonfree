import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!eh", name = "hb", descriptor = "[I")
	public static int[] anIntArray96;

	@OriginalMember(owner = "client!eh", name = "kb", descriptor = "Lclient!a;")
	public static Class1 aClass1_15;

	@OriginalMember(owner = "client!eh", name = "S", descriptor = "I")
	public static int anInt1122 = 0;

	@OriginalMember(owner = "client!eh", name = "T", descriptor = "[I")
	public static final int[] anIntArray95 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!eh", name = "U", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_394 = Static177.method3050("<col=ffffff>");

	@OriginalMember(owner = "client!eh", name = "V", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_395 = Static177.method3050("This world is full)3");

	@OriginalMember(owner = "client!eh", name = "W", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_396 = Static177.method3050("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!eh", name = "X", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_397 = Static177.method3050("Mem:");

	@OriginalMember(owner = "client!eh", name = "Y", descriptor = "Lclient!jd;")
	public static Class46 aClass46_398 = aClass46_395;

	@OriginalMember(owner = "client!eh", name = "Z", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_399 = Static177.method3050("Invalid username or password)3");

	@OriginalMember(owner = "client!eh", name = "fb", descriptor = "Lclient!oe;")
	public static final Class66 aClass66_23 = new Class66(64);

	@OriginalMember(owner = "client!eh", name = "ib", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_400 = Static177.method3050("Freie Welt");

	@OriginalMember(owner = "client!eh", name = "jb", descriptor = "I")
	public static int anInt1129 = 0;

	@OriginalMember(owner = "client!eh", name = "lb", descriptor = "Lclient!jd;")
	public static Class46 aClass46_401 = aClass46_399;

	@OriginalMember(owner = "client!eh", name = "mb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_402 = Static177.method3050("hint_mapedge");

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "([Lclient!a;BI)V")
	public static void method757(@OriginalArg(0) Class1[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class1 local9 = arg0[local3];
			if (local9 != null && arg1 == local9.anInt24 && (!local9.aBoolean8 || !Static94.method1843(local9))) {
				if (local9.anInt7 == 0) {
					if (!local9.aBoolean8 && Static94.method1843(local9) && Static102.aClass1_31 != local9) {
						continue;
					}
					method757(arg0, local9.anInt53);
					if (local9.aClass1Array1 != null) {
						method757(local9.aClass1Array1, local9.anInt53);
					}
					@Pc(60) Class4_Sub14 local60 = (Class4_Sub14) Static106.aClass20_5.method505((long) local9.anInt53);
					if (local60 != null) {
						Static165.method2753(local60.anInt2450);
					}
				}
				if (local9.anInt7 == 6) {
					@Pc(91) int local91;
					if (local9.anInt19 != -1 || local9.anInt9 != -1) {
						@Pc(86) boolean local86 = Static52.method1024(local9);
						if (local86) {
							local91 = local9.anInt9;
						} else {
							local91 = local9.anInt19;
						}
						if (local91 != -1) {
							@Pc(103) Class4_Sub1_Sub4 local103 = Static137.method2394(local91);
							if (local103 != null) {
								local9.anInt76 += Static68.anInt1847;
								while (local9.anInt76 > local103.anIntArray50[local9.anInt70]) {
									local9.anInt76 -= local103.anIntArray50[local9.anInt70];
									local9.anInt70++;
									if (local103.anIntArray52.length <= local9.anInt70) {
										local9.anInt70 -= local103.anInt547;
										if (local9.anInt70 < 0 || local103.anIntArray52.length <= local9.anInt70) {
											local9.anInt70 = 0;
										}
									}
									Static3.method21(local9);
								}
							}
						}
					}
					if (local9.anInt23 != 0 && !local9.aBoolean8) {
						@Pc(184) int local184 = local9.anInt23 >> 16;
						local91 = local9.anInt23 << 16 >> 16;
						local91 *= Static68.anInt1847;
						@Pc(199) int local199 = local184 * Static68.anInt1847;
						local9.anInt56 = local91 + local9.anInt56 & 0x7FF;
						local9.anInt35 = local199 + local9.anInt35 & 0x7FF;
						Static3.method21(local9);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!ac;BI)V")
	public static void method758(@OriginalArg(0) Class4_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (Static142.anInt3325 < arg0.anInt2835) {
			Static105.method1981(arg0);
		} else if (arg0.anInt2821 >= Static142.anInt3325) {
			Static114.method2093(arg0);
		} else {
			Static1.method13(arg0);
		}
		if (arg0.anInt2832 < 128 || arg0.anInt2803 < 128 || arg0.anInt2832 >= 13184 || arg0.anInt2803 >= 13184) {
			arg0.anInt2803 = arg0.anInt2805 * 64 + arg0.anIntArray259[0] * 128;
			arg0.anInt2808 = -1;
			arg0.anInt2832 = arg0.anInt2805 * 64 + arg0.anIntArray262[0] * 128;
			arg0.anInt2825 = -1;
			arg0.anInt2821 = 0;
			arg0.anInt2835 = 0;
			arg0.method2114();
		}
		if (arg0 == Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1 && (arg0.anInt2832 < 1536 || arg0.anInt2803 < 1536 || arg0.anInt2832 >= 11776 || arg0.anInt2803 >= 11776)) {
			arg0.anInt2835 = 0;
			arg0.anInt2803 = arg0.anIntArray259[0] * 128 + arg0.anInt2805 * 64;
			arg0.anInt2821 = 0;
			arg0.anInt2832 = arg0.anIntArray262[0] * 128 + arg0.anInt2805 * 64;
			arg0.anInt2825 = -1;
			arg0.anInt2808 = -1;
			arg0.method2114();
		}
		Static162.method2734(arg0);
		Static68.method1476(arg0);
	}

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "(B)V")
	public static void method759() {
		Static17.aClass66_8.method2218();
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(Z)V")
	public static void method760() {
		Static64.aFontMetrics1 = null;
		Static39.anImage1 = null;
		Static111.aFont1 = null;
	}
}
