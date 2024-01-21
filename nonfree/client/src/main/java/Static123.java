import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!p", name = "g", descriptor = "I")
	public static int anInt2918;

	@OriginalMember(owner = "client!p", name = "l", descriptor = "Lclient!jc;")
	public static Class40 aClass40_31;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "I")
	public static int anInt2913 = 0;

	@OriginalMember(owner = "client!p", name = "e", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1715 = Static107.method1838("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!p", name = "h", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1716 = Static107.method1838("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!p", name = "j", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1717 = aClass28_1716;

	@OriginalMember(owner = "client!p", name = "k", descriptor = "[I")
	public static int[] anIntArray266 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!p", name = "s", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1719 = Static107.method1838("Could not complete login)3");

	@OriginalMember(owner = "client!p", name = "m", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1718 = aClass28_1719;

	@OriginalMember(owner = "client!p", name = "o", descriptor = "[Z")
	public static boolean[] aBooleanArray17 = new boolean[100];

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V")
	public static void method2009() {
		for (@Pc(7) int local7 = 0; local7 < Static83.anInt2114; local7++) {
			@Pc(15) int local15 = Static3.anIntArray228[local7];
			@Pc(19) Class2_Sub4_Sub1_Sub1_Sub1 local19 = Static55.aClass2_Sub4_Sub1_Sub1_Sub1Array1[local15];
			@Pc(23) int local23 = Static151.aClass2_Sub2_Sub1_3.method1698();
			if ((local23 & 0x8) != 0) {
				local19.anInt1625 = Static151.aClass2_Sub2_Sub1_3.method1665();
				if (local19.anInt1625 == 65535) {
					local19.anInt1625 = -1;
				}
			}
			@Pc(47) int local47;
			@Pc(51) int local51;
			if ((local23 & 0x20) != 0) {
				local47 = Static151.aClass2_Sub2_Sub1_3.method1703();
				local51 = Static151.aClass2_Sub2_Sub1_3.method1698();
				local19.method1097(local51, local47, Static156.anInt3491);
				local19.anInt1645 = Static156.anInt3491 + 300;
				local19.anInt1629 = Static151.aClass2_Sub2_Sub1_3.method1703();
			}
			if ((local23 & 0x1) != 0) {
				local47 = Static151.aClass2_Sub2_Sub1_3.method1698();
				local51 = Static151.aClass2_Sub2_Sub1_3.method1668();
				local19.method1097(local51, local47, Static156.anInt3491);
			}
			if ((local23 & 0x4) != 0) {
				local19.anInt1651 = Static151.aClass2_Sub2_Sub1_3.method1674();
				local19.anInt1615 = Static151.aClass2_Sub2_Sub1_3.method1680();
			}
			if ((local23 & 0x40) != 0) {
				local47 = Static151.aClass2_Sub2_Sub1_3.method1670();
				if (local47 == 65535) {
					local47 = -1;
				}
				local51 = Static151.aClass2_Sub2_Sub1_3.method1698();
				if (local19.anInt1653 == local47 && local47 != -1) {
					@Pc(138) int local138 = Static49.method926(local47).anInt489;
					if (local138 == 1) {
						local19.anInt1641 = local51;
						local19.anInt1616 = 0;
						local19.anInt1609 = 0;
						local19.anInt1597 = 0;
					}
					if (local138 == 2) {
						local19.anInt1609 = 0;
					}
				} else if (local47 == -1 || local19.anInt1653 == -1 || Static49.method926(local47).anInt479 >= Static49.method926(local19.anInt1653).anInt479) {
					local19.anInt1641 = local51;
					local19.anInt1644 = local19.anInt1643;
					local19.anInt1609 = 0;
					local19.anInt1616 = 0;
					local19.anInt1653 = local47;
					local19.anInt1597 = 0;
				}
			}
			if ((local23 & 0x10) != 0) {
				local19.anInt1627 = Static151.aClass2_Sub2_Sub1_3.method1670();
				local47 = Static151.aClass2_Sub2_Sub1_3.method1684();
				local19.anInt1640 = Static156.anInt3491 + (local47 & 0xFFFF);
				local19.anInt1611 = 0;
				if (Static156.anInt3491 < local19.anInt1640) {
					local19.anInt1611 = -1;
				}
				local19.anInt1613 = local47 >> 16;
				if (local19.anInt1627 == 65535) {
					local19.anInt1627 = -1;
				}
				local19.anInt1622 = 0;
			}
			if ((local23 & 0x80) != 0) {
				local19.aClass28_951 = Static151.aClass2_Sub2_Sub1_3.method1662();
				local19.anInt1637 = 100;
			}
			if ((local23 & 0x2) != 0) {
				local19.aClass2_Sub4_Sub4_1 = Static127.method2066(Static151.aClass2_Sub2_Sub1_3.method1680());
				local19.anInt1628 = local19.aClass2_Sub4_Sub4_1.anInt840;
				local19.anInt1619 = local19.aClass2_Sub4_Sub4_1.anInt842;
				local19.anInt1646 = local19.aClass2_Sub4_Sub4_1.anInt868;
				local19.anInt1649 = local19.aClass2_Sub4_Sub4_1.anInt848;
				local19.anInt1618 = local19.aClass2_Sub4_Sub4_1.anInt854;
				local19.anInt1610 = local19.aClass2_Sub4_Sub4_1.anInt849;
				local19.anInt1612 = local19.aClass2_Sub4_Sub4_1.anInt853;
				local19.anInt1639 = local19.aClass2_Sub4_Sub4_1.anInt865;
				local19.anInt1608 = local19.aClass2_Sub4_Sub4_1.anInt841;
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILclient!jc;B)Lclient!kd;")
	public static Class2_Sub12 method2010(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1) {
		@Pc(8) byte[] local8 = arg1.method1784(arg0);
		return local8 == null ? null : new Class2_Sub12(local8);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(B)I")
	public static int method2011() {
		return 6;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
	public static void method2012() {
		aClass28_1718 = null;
		aClass28_1716 = null;
		aClass28_1715 = null;
		aClass40_31 = null;
		aClass28_1719 = null;
		aBooleanArray17 = null;
		aClass28_1717 = null;
		anIntArray266 = null;
	}
}
