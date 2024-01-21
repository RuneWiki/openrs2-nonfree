import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!j", name = "E", descriptor = "Lclient!cb;")
	public static Class13 aClass13_41;

	@OriginalMember(owner = "client!j", name = "M", descriptor = "I")
	public static int anInt4043;

	@OriginalMember(owner = "client!j", name = "v", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1748 = Static32.method683("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!j", name = "z", descriptor = "Lclient!pd;")
	public static Class67 aClass67_41 = new Class67();

	@OriginalMember(owner = "client!j", name = "J", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1749 = Static32.method683("flash1:");

	@OriginalMember(owner = "client!j", name = "K", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1750 = aClass49_1749;

	@OriginalMember(owner = "client!j", name = "L", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1751 = aClass49_1749;

	@OriginalMember(owner = "client!j", name = "O", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1752 = Static32.method683(" )2> <col=ff9040>");

	@OriginalMember(owner = "client!j", name = "P", descriptor = "I")
	public static int anInt4045 = 1;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IJ)V")
	public static void method3010(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static175.anInt3799 >= 100 && Static78.anInt1632 != 1 || Static175.anInt3799 >= 200) {
			Static88.method1475(Static154.aClass49_1489, Static12.aClass49_116, 0);
			return;
		}
		@Pc(35) Class49 local35 = Static120.method2046(arg0).method1677();
		for (@Pc(37) int local37 = 0; local37 < Static175.anInt3799; local37++) {
			if (Static96.aLongArray12[local37] == arg0) {
				Static88.method1475(Static154.aClass49_1489, Static33.method692(new Class49[] { local35, Static19.aClass49_259 }), 0);
				return;
			}
		}
		for (@Pc(76) int local76 = 0; local76 < Static18.anInt381; local76++) {
			if (arg0 == Static76.aLongArray11[local76]) {
				Static88.method1475(Static154.aClass49_1489, Static33.method692(new Class49[] { Static185.aClass49_1759, local35, Static81.aClass49_869 }), 0);
				return;
			}
		}
		if (local35.method1676(Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.aClass49_1606)) {
			Static88.method1475(Static154.aClass49_1489, Static155.aClass49_1505, 0);
			return;
		}
		Static101.aClass49Array14[Static175.anInt3799] = local35;
		Static96.aLongArray12[Static175.anInt3799] = arg0;
		Static85.anIntArray188[Static175.anInt3799] = 0;
		Static126.anIntArray261[Static175.anInt3799] = 0;
		Static175.anInt3799++;
		Static95.anInt2012 = Static69.anInt1431;
		Static176.aClass2_Sub13_Sub1_14.method2976(46);
		Static176.aClass2_Sub13_Sub1_14.method2956(arg0);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
	public static void method3012() {
		aClass49_1748 = null;
		aClass13_41 = null;
		aClass49_1752 = null;
		aClass49_1751 = null;
		aClass67_41 = null;
		aClass49_1749 = null;
		aClass49_1750 = null;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IBLclient!oh;ZIII)V")
	public static void method3014(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Class11_Sub1 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) (arg5 + (arg4 << 16));
		@Pc(16) Class2_Sub2_Sub17 local16 = (Class2_Sub2_Sub17) Static133.aClass25_13.method836(local6);
		if (local16 != null) {
			return;
		}
		local16 = (Class2_Sub2_Sub17) Static118.aClass25_8.method836(local6);
		if (local16 != null) {
			return;
		}
		local16 = (Class2_Sub2_Sub17) Static21.aClass25_3.method836(local6);
		if (local16 == null) {
			if (!arg3) {
				local16 = (Class2_Sub2_Sub17) Static12.aClass25_2.method836(local6);
				if (local16 != null) {
					return;
				}
			}
			local16 = new Class2_Sub2_Sub17();
			local16.aByte9 = arg1;
			local16.aClass11_Sub1_36 = arg2;
			local16.anInt3456 = arg0;
			if (arg3) {
				Static133.aClass25_13.method838(local6, local16);
				Static134.anInt2914++;
			} else {
				Static4.aClass46_1.method1576(local16);
				Static21.aClass25_3.method838(local6, local16);
				Static24.anInt540++;
			}
		} else if (arg3) {
			local16.method2843();
			Static133.aClass25_13.method838(local6, local16);
			Static24.anInt540--;
			Static134.anInt2914++;
		}
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(III)V")
	public static void method3015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub1 local7 = Static72.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass26_1 = null;
		}
	}
}
