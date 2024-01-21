import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "Lclient!ub;")
	public static Class10_Sub1_Sub1_Sub4 aClass10_Sub1_Sub1_Sub4_2;

	@OriginalMember(owner = "client!hc", name = "D", descriptor = "[I")
	public static int[] anIntArray118;

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "Lclient!va;")
	private static Class61 aClass61_423 = Static88.method1421("No matching objects found)1 please shorten search");

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "Lclient!va;")
	public static Class61 aClass61_424 = Static88.method1421("backvmid1");

	@OriginalMember(owner = "client!hc", name = "n", descriptor = "Lclient!va;")
	private static Class61 aClass61_431 = Static88.method1421("Attack");

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "Lclient!va;")
	public static Class61 aClass61_425 = aClass61_431;

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "Lclient!va;")
	private static Class61 aClass61_426 = Static88.method1421("To play on this world move to a free area first");

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
	public static int anInt1042 = 0;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "Lclient!va;")
	public static Class61 aClass61_427 = aClass61_423;

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "Lclient!va;")
	private static Class61 aClass61_428 = Static88.method1421("Loading ignore list");

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "Lclient!va;")
	public static Class61 aClass61_429 = Static88.method1421(")3");

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "Lclient!va;")
	public static Class61 aClass61_430 = aClass61_426;

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "Lclient!va;")
	private static Class61 aClass61_432 = Static88.method1421("Trade)4compete");

	@OriginalMember(owner = "client!hc", name = "C", descriptor = "Lclient!va;")
	private static Class61 aClass61_436 = Static88.method1421("M");

	@OriginalMember(owner = "client!hc", name = "s", descriptor = "Lclient!va;")
	public static Class61 aClass61_433 = aClass61_436;

	@OriginalMember(owner = "client!hc", name = "u", descriptor = "Lclient!va;")
	public static Class61 aClass61_434 = aClass61_432;

	@OriginalMember(owner = "client!hc", name = "v", descriptor = "Lclient!va;")
	public static Class61 aClass61_435 = null;

	@OriginalMember(owner = "client!hc", name = "x", descriptor = "I")
	public static int anInt1047 = 0;

	@OriginalMember(owner = "client!hc", name = "z", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1 = new int[4][105][105];

	@OriginalMember(owner = "client!hc", name = "E", descriptor = "Lclient!va;")
	public static Class61 aClass61_437 = aClass61_428;

	@OriginalMember(owner = "client!hc", name = "G", descriptor = "I")
	public static int anInt1052 = 0;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V")
	public static void method615() {
		anIntArrayArrayArray1 = null;
		aClass61_423 = null;
		aClass61_429 = null;
		aClass61_436 = null;
		aClass61_432 = null;
		aClass10_Sub1_Sub1_Sub4_2 = null;
		aClass61_433 = null;
		aClass61_426 = null;
		aClass61_430 = null;
		aClass61_434 = null;
		aClass61_428 = null;
		aClass61_437 = null;
		aClass61_424 = null;
		aClass61_427 = null;
		aClass61_435 = null;
		anIntArray118 = null;
		aClass61_425 = null;
		aClass61_431 = null;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
	public static void method617() {
		for (@Pc(8) int local8 = 0; local8 < Static76.anInt2030; local8++) {
			@Pc(14) int local14 = Static12.anIntArray46[local8];
			@Pc(18) Class10_Sub1_Sub5_Sub2_Sub1 local18 = Static6.aClass10_Sub1_Sub5_Sub2_Sub1Array1[local14];
			@Pc(22) int local22 = Static55.aClass10_Sub10_Sub1_4.method1111();
			@Pc(33) int local33;
			@Pc(37) int local37;
			if ((local22 & 0x8) != 0) {
				local33 = Static55.aClass10_Sub10_Sub1_4.method1111();
				local37 = Static55.aClass10_Sub10_Sub1_4.method1111();
				local18.method923(Static95.anInt2442, local33, local37);
				local18.anInt1643 = Static95.anInt2442 + 300;
				local18.anInt1669 = Static55.aClass10_Sub10_Sub1_4.method1111();
				local18.anInt1660 = Static55.aClass10_Sub10_Sub1_4.method1109();
			}
			if ((local22 & 0x40) != 0) {
				local33 = Static55.aClass10_Sub10_Sub1_4.method1141();
				local37 = Static55.aClass10_Sub10_Sub1_4.method1111();
				if (local33 == 65535) {
					local33 = -1;
				}
				if (local18.anInt1688 == local33 && local33 != -1) {
					@Pc(144) int local144 = Static5.method33(local33).anInt980;
					if (local144 == 1) {
						local18.anInt1675 = local37;
						local18.anInt1680 = 0;
						local18.anInt1642 = 0;
						local18.anInt1651 = 0;
					}
					if (local144 == 2) {
						local18.anInt1642 = 0;
					}
				} else if (local33 == -1 || local18.anInt1688 == -1 || Static5.method33(local33).anInt972 >= Static5.method33(local18.anInt1688).anInt972) {
					local18.anInt1651 = 0;
					local18.anInt1675 = local37;
					local18.anInt1642 = 0;
					local18.anInt1680 = 0;
					local18.anInt1688 = local33;
					local18.anInt1671 = local18.anInt1633;
				}
			}
			if ((local22 & 0x4) != 0) {
				local18.anInt1657 = Static55.aClass10_Sub10_Sub1_4.method1119();
				if (local18.anInt1657 == 65535) {
					local18.anInt1657 = -1;
				}
			}
			if ((local22 & 0x10) != 0) {
				local18.aClass10_Sub1_Sub3_1 = Static53.method802(Static55.aClass10_Sub10_Sub1_4.method1132());
				local18.anInt1681 = local18.aClass10_Sub1_Sub3_1.anInt397;
				local18.anInt1668 = local18.aClass10_Sub1_Sub3_1.anInt400;
				local18.anInt1630 = local18.aClass10_Sub1_Sub3_1.anInt370;
				local18.anInt1665 = local18.aClass10_Sub1_Sub3_1.anInt392;
				local18.anInt1662 = local18.aClass10_Sub1_Sub3_1.anInt386;
				local18.anInt1647 = local18.aClass10_Sub1_Sub3_1.anInt384;
				local18.anInt1637 = local18.aClass10_Sub1_Sub3_1.anInt378;
			}
			if ((local22 & 0x80) != 0) {
				local18.aClass61_695 = Static55.aClass10_Sub10_Sub1_4.method1151();
				local18.anInt1663 = 100;
			}
			if ((local22 & 0x1) != 0) {
				local33 = Static55.aClass10_Sub10_Sub1_4.method1111();
				local37 = Static55.aClass10_Sub10_Sub1_4.method1111();
				local18.method923(Static95.anInt2442, local33, local37);
				local18.anInt1643 = Static95.anInt2442 + 300;
				local18.anInt1669 = Static55.aClass10_Sub10_Sub1_4.method1143();
				local18.anInt1660 = Static55.aClass10_Sub10_Sub1_4.method1109();
			}
			if ((local22 & 0x2) != 0) {
				local18.anInt1655 = Static55.aClass10_Sub10_Sub1_4.method1119();
				local33 = Static55.aClass10_Sub10_Sub1_4.method1115();
				local18.anInt1670 = local33 >> 16;
				local18.anInt1636 = Static95.anInt2442 + (local33 & 0xFFFF);
				local18.anInt1640 = 0;
				if (local18.anInt1655 == 65535) {
					local18.anInt1655 = -1;
				}
				local18.anInt1678 = 0;
				if (Static95.anInt2442 < local18.anInt1636) {
					local18.anInt1640 = -1;
				}
			}
			if ((local22 & 0x20) != 0) {
				local18.anInt1653 = Static55.aClass10_Sub10_Sub1_4.method1141();
				local18.anInt1639 = Static55.aClass10_Sub10_Sub1_4.method1160();
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)V")
	public static void method618() {
		Static48.aClass29_36.method646();
		Static107.aClass29_67.method646();
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)V")
	public static void method619() {
		try {
			@Pc(6) Graphics local6 = Static38.aCanvas1.getGraphics();
			Static9.aClass15_7.method594(357, 17, local6);
		} catch (@Pc(14) Exception local14) {
			Static38.aCanvas1.repaint();
		}
	}
}
