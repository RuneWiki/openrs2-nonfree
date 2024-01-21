import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!l", name = "q", descriptor = "Lclient!m;")
	public static Class10_Sub1_Sub1_Sub2 aClass10_Sub1_Sub1_Sub2_15;

	@OriginalMember(owner = "client!l", name = "s", descriptor = "Z")
	public static boolean aBoolean73;

	@OriginalMember(owner = "client!l", name = "f", descriptor = "Lclient!pa;")
	public static Class10_Sub10_Sub1 aClass10_Sub10_Sub1_4 = new Class10_Sub10_Sub1(5000);

	@OriginalMember(owner = "client!l", name = "g", descriptor = "Lclient!va;")
	private static Class61 aClass61_618 = Static88.method1421("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!l", name = "n", descriptor = "Lclient!va;")
	public static Class61 aClass61_619 = aClass61_618;

	@OriginalMember(owner = "client!l", name = "r", descriptor = "I")
	public static volatile int anInt1486 = 0;

	@OriginalMember(owner = "client!l", name = "t", descriptor = "I")
	public static int anInt1487 = 0;

	@OriginalMember(owner = "client!l", name = "w", descriptor = "Lclient!va;")
	private static Class61 aClass61_621 = Static88.method1421("Enter your username (V password)3");

	@OriginalMember(owner = "client!l", name = "u", descriptor = "Lclient!va;")
	public static Class61 aClass61_620 = aClass61_621;

	@OriginalMember(owner = "client!l", name = "v", descriptor = "I")
	public static int anInt1488 = -1;

	@OriginalMember(owner = "client!l", name = "y", descriptor = "I")
	public static final int anInt1490 = 2301979;

	@OriginalMember(owner = "client!l", name = "z", descriptor = "I")
	public static int anInt1491 = 0;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method809(@OriginalArg(1) Component arg0) {
		arg0.addMouseListener(Static21.aClass16_1);
		arg0.addMouseMotionListener(Static21.aClass16_1);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public static void method810(@OriginalArg(0) Component arg0) {
		arg0.removeMouseListener(Static21.aClass16_1);
		arg0.removeMouseMotionListener(Static21.aClass16_1);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZ)Z")
	public static boolean method812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		@Pc(27) Class10_Sub1_Sub10 local27 = Static18.method405(arg0);
		return local27.method777(arg1);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!ed;II)V")
	public static void method813(@OriginalArg(0) Class10_Sub1_Sub5_Sub2 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anInt1654 < 128 || arg0.anInt1649 < 128 || arg0.anInt1654 >= 13184 || arg0.anInt1649 >= 13184) {
			arg0.anInt1635 = 0;
			arg0.anInt1688 = -1;
			arg0.anInt1676 = 0;
			arg0.anInt1655 = -1;
			arg0.anInt1654 = arg0.anInt1681 * 64 + arg0.anIntArray189[0] * 128;
			arg0.anInt1649 = arg0.anInt1681 * 64 + arg0.anIntArray186[0] * 128;
			arg0.method921();
		}
		if (Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1 == arg0 && (arg0.anInt1654 < 1536 || arg0.anInt1649 < 1536 || arg0.anInt1654 >= 11776 || arg0.anInt1649 >= 11776)) {
			arg0.anInt1688 = -1;
			arg0.anInt1676 = 0;
			arg0.anInt1655 = -1;
			arg0.anInt1635 = 0;
			arg0.anInt1654 = arg0.anInt1681 * 64 + arg0.anIntArray189[0] * 128;
			arg0.anInt1649 = arg0.anInt1681 * 64 + arg0.anIntArray186[0] * 128;
			arg0.method921();
		}
		if (arg0.anInt1635 > Static95.anInt2442) {
			Static52.method796(arg0);
		} else if (arg0.anInt1676 >= Static95.anInt2442) {
			Static32.method568(arg0);
		} else {
			Static99.method1572(arg0);
		}
		Static98.method1557(arg0);
		Static75.method1169(arg0);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
	public static void method814() {
		@Pc(13) int local13 = Static50.aClass10_Sub1_Sub1_Sub4_3.method1549(Static38.aClass61_449);
		@Pc(23) int local23;
		for (@Pc(15) int local15 = 0; local15 < Static23.anInt747; local15++) {
			local23 = Static50.aClass10_Sub1_Sub1_Sub4_3.method1541(Static19.aClass61Array7[local15]);
			if (local13 < local23) {
				local13 = local23;
			}
		}
		local23 = Static23.anInt747 * 15 + 21;
		local13 += 8;
		@Pc(78) int local78;
		@Pc(101) int local101;
		if (Static12.anInt333 > 4 && Static67.anInt1776 > 4 && Static12.anInt333 < 516 && Static67.anInt1776 < 338) {
			Static82.aBoolean97 = true;
			Static67.anInt1771 = Static23.anInt747 * 15 + 22;
			Static80.anInt2153 = local13;
			Static10.anInt311 = 0;
			local78 = Static12.anInt333 - local13 / 2 - 4;
			if (local78 + local13 > 512) {
				local78 = 512 - local13;
			}
			if (local78 < 0) {
				local78 = 0;
			}
			local101 = Static67.anInt1776 - 4;
			Static75.anInt2014 = local78;
			if (local23 + local101 > 334) {
				local101 = 334 - local23;
			}
			if (local101 < 0) {
				local101 = 0;
			}
			Static32.anInt942 = local101;
		}
		if (Static12.anInt333 > 553 && Static67.anInt1776 > 205 && Static12.anInt333 < 743 && Static67.anInt1776 < 466) {
			Static82.aBoolean97 = true;
			Static67.anInt1771 = Static23.anInt747 * 15 + 22;
			local78 = Static12.anInt333 - local13 / 2 - 553;
			Static10.anInt311 = 1;
			Static80.anInt2153 = local13;
			if (local78 < 0) {
				local78 = 0;
			} else if (local13 + local78 > 190) {
				local78 = 190 - local13;
			}
			local101 = Static67.anInt1776 - 205;
			Static75.anInt2014 = local78;
			if (local101 < 0) {
				local101 = 0;
			} else if (local101 + local23 > 261) {
				local101 = 261 - local23;
			}
			Static32.anInt942 = local101;
		}
		if (Static12.anInt333 <= 17 || Static67.anInt1776 <= 357 || Static12.anInt333 >= 496 || Static67.anInt1776 >= 453) {
			return;
		}
		Static82.aBoolean97 = true;
		local78 = Static12.anInt333 - local13 / 2 - 17;
		if (local78 < 0) {
			local78 = 0;
		} else if (local13 + local78 > 479) {
			local78 = 479 - local13;
		}
		Static80.anInt2153 = local13;
		Static10.anInt311 = 2;
		Static67.anInt1771 = Static23.anInt747 * 15 + 22;
		Static75.anInt2014 = local78;
		local101 = Static67.anInt1776 - 357;
		if (local101 < 0) {
			local101 = 0;
		} else if (local101 + local23 > 96) {
			local101 = 96 - local23;
		}
		Static32.anInt942 = local101;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
	public static void method816() {
		aClass10_Sub1_Sub1_Sub2_15 = null;
		aClass61_618 = null;
		aClass61_619 = null;
		aClass61_621 = null;
		aClass10_Sub10_Sub1_4 = null;
		aClass61_620 = null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ZIIB)Lclient!va;")
	public static Class61 method817(@OriginalArg(2) int arg0) {
		@Pc(7) int local7 = 1;
		for (@Pc(26) int local26 = arg0 / 10; local26 != 0; local26 /= 10) {
			local7++;
		}
		@Pc(40) int local40 = local7;
		if (arg0 < 0) {
			local40 = local7 + 1;
		}
		@Pc(48) byte[] local48 = new byte[local40];
		if (arg0 < 0) {
			local48[0] = 45;
		}
		for (@Pc(64) int local64 = 0; local64 < local7; local64++) {
			@Pc(70) int local70 = arg0 % 10;
			arg0 /= 10;
			if (local70 < 0) {
				local70 = -local70;
			}
			if (local70 > 9) {
				local70 += 39;
			}
			local48[local40 - local64 - 1] = (byte) (local70 + 48);
		}
		@Pc(104) Class61 local104 = new Class61();
		local104.aByteArray18 = local48;
		local104.anInt2559 = local40;
		return local104;
	}
}
