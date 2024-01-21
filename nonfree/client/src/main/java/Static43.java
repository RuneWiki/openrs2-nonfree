import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!i", name = "a", descriptor = "Lclient!e;")
	public static Class2_Sub1_Sub2_Sub2 aClass2_Sub1_Sub2_Sub2_11;

	@OriginalMember(owner = "client!i", name = "p", descriptor = "I")
	public static int anInt1455;

	@OriginalMember(owner = "client!i", name = "w", descriptor = "Z")
	public static boolean aBoolean73;

	@OriginalMember(owner = "client!i", name = "e", descriptor = "Lclient!a;")
	public static Class1 aClass1_1436 = Static94.method1596("l");

	@OriginalMember(owner = "client!i", name = "f", descriptor = "I")
	public static int anInt1447 = 0;

	@OriginalMember(owner = "client!i", name = "j", descriptor = "Lclient!a;")
	public static Class1 aClass1_1437 = Static94.method1596("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!i", name = "o", descriptor = "Lclient!a;")
	public static Class1 aClass1_1438 = Static94.method1596("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!i", name = "q", descriptor = "Z")
	public static boolean aBoolean72 = false;

	@OriginalMember(owner = "client!i", name = "u", descriptor = "Lclient!a;")
	public static Class1 aClass1_1439 = Static94.method1596(" (X");

	@OriginalMember(owner = "client!i", name = "y", descriptor = "I")
	public static int anInt1459 = -1;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ZLclient!u;IIBIB)V")
	public static void method987(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class8_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5) {
		@Pc(14) long local14 = (long) (arg3 + (arg2 << 16));
		@Pc(20) Class2_Sub1_Sub15 local20 = (Class2_Sub1_Sub15) Static85.aClass25_6.method991(local14);
		if (local20 != null) {
			return;
		}
		local20 = (Class2_Sub1_Sub15) Static65.aClass25_5.method991(local14);
		if (local20 != null) {
			return;
		}
		local20 = (Class2_Sub1_Sub15) Static44.aClass25_2.method991(local14);
		if (local20 == null) {
			if (!arg0) {
				local20 = (Class2_Sub1_Sub15) Static62.aClass25_4.method991(local14);
				if (local20 != null) {
					return;
				}
			}
			local20 = new Class2_Sub1_Sub15();
			local20.anInt2286 = arg5;
			local20.aByte6 = arg4;
			local20.aClass8_Sub1_19 = arg1;
			if (arg0) {
				Static85.aClass25_6.method990(local20, local14);
				Static113.anInt2233++;
			} else {
				Static32.aClass30_2.method1218(local20);
				Static44.aClass25_2.method990(local20, local14);
				anInt1447++;
			}
		} else if (arg0) {
			local20.method1773();
			Static85.aClass25_6.method990(local20, local14);
			anInt1447--;
			Static113.anInt2233++;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V")
	public static void method988() {
		aClass2_Sub1_Sub2_Sub2_11 = null;
		aClass1_1436 = null;
		aClass1_1437 = null;
		aClass1_1438 = null;
		aClass1_1439 = null;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public static void method992() {
		@Pc(5) Object local5 = Static5.anObject1;
		synchronized (Static5.anObject1) {
			if (Static7.anInt1203 == 0) {
				Static34.aClass34_4.method1262(5, new Class45());
			}
			Static7.anInt1203 = 600;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)Lclient!a;")
	public static Class1 method994(@OriginalArg(0) int arg0) {
		return Static31.method844(false, arg0);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
	public static void method995() {
		for (@Pc(10) Class2_Sub1_Sub1_Sub2 local10 = (Class2_Sub1_Sub1_Sub2) Static72.aClass46_6.method1435(); local10 != null; local10 = (Class2_Sub1_Sub1_Sub2) Static72.aClass46_6.method1442()) {
			if (Static2.anInt287 != local10.anInt833 || Static69.anInt2806 > local10.anInt827) {
				local10.method1820();
			} else if (local10.anInt829 <= Static69.anInt2806) {
				if (local10.anInt824 > 0) {
					@Pc(39) Class2_Sub1_Sub1_Sub1_Sub2 local39 = Static101.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local10.anInt824 - 1];
					if (local39 != null && local39.anInt2724 >= 0 && local39.anInt2724 < 13312 && local39.anInt2717 >= 0 && local39.anInt2717 < 13312) {
						local10.method527(Static69.anInt2806, local39.anInt2717, Static65.method1338(local10.anInt833, local39.anInt2724, local39.anInt2717) - local10.anInt823, local39.anInt2724);
					}
				}
				if (local10.anInt824 < 0) {
					@Pc(91) int local91 = -local10.anInt824 - 1;
					@Pc(102) Class2_Sub1_Sub1_Sub1_Sub1 local102;
					if (Static57.anInt1796 == local91) {
						local102 = Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1;
					} else {
						local102 = Static67.aClass2_Sub1_Sub1_Sub1_Sub1Array3[local91];
					}
					if (local102 != null && local102.anInt2724 >= 0 && local102.anInt2724 < 13312 && local102.anInt2717 >= 0 && local102.anInt2717 < 13312) {
						local10.method527(Static69.anInt2806, local102.anInt2717, Static65.method1338(local10.anInt833, local102.anInt2724, local102.anInt2717) - local10.anInt823, local102.anInt2724);
					}
				}
				local10.method526(Static8.anInt509);
				Static109.aClass3_1.method166(Static2.anInt287, (int) local10.aDouble2, (int) local10.aDouble4, (int) local10.aDouble3, 60, local10, local10.anInt847, -1, false);
			}
		}
	}
}
