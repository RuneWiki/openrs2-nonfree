import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "F")
	public static float aFloat78;

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "[S")
	public static final short[] aShortArray113 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
	public static int anInt6892 = -2;

	@OriginalMember(owner = "client!wg", name = "k", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_117 = new Class93("glow2:", "leuchten2:", "brillant2:", "brilho2:");

	@OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
	public static int anInt6897 = 0;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
	public static void method5936() {
		Static357.aClass2_Sub13_1 = new Class2_Sub13(Static23.aClass93_8.method2819(Static21.anInt455), "", Static256.anInt5081, 1003, 0L, 0, 0);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)I")
	public static int method5939(@OriginalArg(0) int arg0) {
		if (Static157.aClass173_1 != null) {
			Static157.aClass173_1.method5027();
			Static157.aClass173_1 = null;
		}
		Static25.anInt1343++;
		if (Static25.anInt1343 > 4) {
			Static25.anInt1343 = 0;
			Static93.anInt2122 = 0;
			return arg0;
		}
		Static93.anInt2122 = 0;
		if (Static34.anInt599 == Static109.anInt2409) {
			Static34.anInt599 = Static275.anInt5623;
		} else {
			Static34.anInt599 = Static109.anInt2409;
		}
		return -1;
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V")
	public static void method5940() {
		Static152.method2932(Static285.aClass146_14);
		Static76.anInt1623++;
		if (Static304.aBoolean546 && Static305.aBoolean549) {
			@Pc(26) int local26 = Static284.aClass61_1.method2658();
			@Pc(30) int local30 = Static284.aClass61_1.method2659();
			local30 -= Static39.anInt780;
			local26 -= Static52.anInt1118;
			@Pc(47) int local47;
			@Pc(52) int local52;
			if (Static285.aClass146_14.anInt4484 < Static76.anInt1623) {
				local47 = local26 - Static101.anInt2295;
				local52 = local30 - Static287.anInt5820;
				if (local47 > Static285.aClass146_14.anInt4449 || -Static285.aClass146_14.anInt4449 > local47 || Static285.aClass146_14.anInt4449 < local52 || -Static285.aClass146_14.anInt4449 > local52) {
					Static173.aBoolean315 = true;
				}
			}
			if (Static139.anInt2886 > local26) {
				local26 = Static139.anInt2886;
			}
			if (local30 < Static50.anInt1115) {
				local30 = Static50.anInt1115;
			}
			if (Static163.aClass146_5.anInt4468 + Static139.anInt2886 < local26 - -Static285.aClass146_14.anInt4468) {
				local26 = Static139.anInt2886 + Static163.aClass146_5.anInt4468 - Static285.aClass146_14.anInt4468;
			}
			if (Static50.anInt1115 + Static163.aClass146_5.anInt4414 < local30 + Static285.aClass146_14.anInt4414) {
				local30 = Static50.anInt1115 + Static163.aClass146_5.anInt4414 - Static285.aClass146_14.anInt4414;
			}
			local47 = Static163.aClass146_5.anInt4487 + local26 - Static139.anInt2886;
			local52 = Static163.aClass146_5.anInt4483 + local30 - Static50.anInt1115;
			@Pc(156) Class2_Sub44 local156;
			if (Static285.aClass146_14.anObjectArray10 != null && Static173.aBoolean315) {
				local156 = new Class2_Sub44();
				local156.anInt6908 = local47;
				local156.anInt6912 = local52;
				local156.aClass146_18 = Static285.aClass146_14;
				local156.anObjectArray35 = Static285.aClass146_14.anObjectArray10;
				Static72.method1646(local156);
			}
			if (!Static284.aClass61_1.method2662()) {
				if (Static173.aBoolean315) {
					if (Static285.aClass146_14.anObjectArray31 != null) {
						local156 = new Class2_Sub44();
						local156.aClass146_19 = Static236.aClass146_13;
						local156.aClass146_18 = Static285.aClass146_14;
						local156.anInt6912 = local52;
						local156.anObjectArray35 = Static285.aClass146_14.anObjectArray31;
						local156.anInt6908 = local47;
						Static72.method1646(local156);
					}
					if (Static236.aClass146_13 != null && Static43.method1050(Static285.aClass146_14) != null) {
						Static138.method2748(Static236.aClass146_13, Static285.aClass146_14);
					}
				} else if ((Static277.anInt5640 == 1 || Static182.method3299()) && Static117.anInt2590 > 2) {
					Static223.method3932(2, Static287.anInt5820 + Static39.anInt780, Static101.anInt2295 + Static52.anInt1118);
				} else if (Static163.method1558()) {
					Static223.method3932(0, Static39.anInt780 + Static287.anInt5820, Static52.anInt1118 + Static101.anInt2295);
				}
				Static285.aClass146_14 = null;
			}
		} else if (Static76.anInt1623 > 1) {
			Static285.aClass146_14 = null;
		}
	}

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)V")
	public static void method5941() {
		Static97.aClass119_209.method3304();
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BII)V")
	public static void method5943(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = Static289.aClass188_8.method5318(Static10.aClass93_4.method2819(Static21.anInt455));
		@Pc(26) int local26;
		for (@Pc(20) Class2_Sub13 local20 = (Class2_Sub13) Static91.aClass216_22.method5992(); local20 != null; local20 = (Class2_Sub13) Static91.aClass216_22.method6000()) {
			local26 = Static324.method5685(local20);
			if (local15 < local26) {
				local15 = local26;
			}
		}
		local15 += 8;
		local26 = Static117.anInt2590 * 16 + 21;
		@Pc(55) int local55 = arg1 - local15 / 2;
		if (Static136.anInt2829 < local55 + local15) {
			local55 = Static136.anInt2829 - local15;
		}
		if (local55 < 0) {
			local55 = 0;
		}
		@Pc(71) int local71 = arg0;
		if (arg0 + local26 > Static198.anInt3876) {
			local71 = Static198.anInt3876 - local26;
		}
		if (local71 < 0) {
			local71 = 0;
		}
		Static194.anInt3816 = local55;
		Static60.anInt1316 = Static117.anInt2590 * 16 + (Static97.aBoolean602 ? 26 : 22);
		Static11.anInt293 = local71;
		Static29.aBoolean66 = true;
		Static120.anInt2599 = local15;
	}
}
