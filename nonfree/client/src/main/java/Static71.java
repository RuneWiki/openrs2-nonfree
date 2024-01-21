import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!oa", name = "ub", descriptor = "Lclient!wb;")
	public static Class65 aClass65_997 = Static24.method441("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!oa", name = "vb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_998 = Static24.method441("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!oa", name = "wb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_999 = Static24.method441("runes");

	@OriginalMember(owner = "client!oa", name = "xb", descriptor = "I")
	public static int anInt2162 = 1;

	@OriginalMember(owner = "client!oa", name = "Ab", descriptor = "I")
	public static int anInt2165 = 0;

	@OriginalMember(owner = "client!oa", name = "Bb", descriptor = "I")
	public static int anInt2166 = 0;

	@OriginalMember(owner = "client!oa", name = "Eb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1000 = Static24.method441("Passwort: ");

	@OriginalMember(owner = "client!oa", name = "Jb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1001 = Static24.method441("backhmid1");

	@OriginalMember(owner = "client!oa", name = "Pb", descriptor = "I")
	public static int anInt2176 = 0;

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)Lclient!gd;")
	public static Class2_Sub1_Sub6 method1291(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub1_Sub6 local8 = (Class2_Sub1_Sub6) Static101.aClass21_33.method744((long) arg0);
		if (local8 != null) {
			return local8;
		}
		@Pc(27) byte[] local27 = Static51.aClass33_24.method1150(arg0, 12);
		local8 = new Class2_Sub1_Sub6();
		if (local27 != null) {
			local8.method738(new Class2_Sub8(local27));
		}
		local8.method732();
		Static101.aClass21_33.method745((long) arg0, local8);
		return local8;
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
	public static void method1292() {
		aClass65_1000 = null;
		aClass65_997 = null;
		aClass65_998 = null;
		aClass65_999 = null;
		aClass65_1001 = null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLclient!od;)V")
	public static void method1293(@OriginalArg(1) Class2_Sub1_Sub1_Sub2 arg0) {
		if (arg0.anInt1536 == 0) {
			return;
		}
		@Pc(47) int local47;
		@Pc(41) int local41;
		if (arg0.anInt1527 != -1 && arg0.anInt1527 < 32768) {
			@Pc(32) Class2_Sub1_Sub1_Sub2_Sub1 local32 = Static24.aClass2_Sub1_Sub1_Sub2_Sub1Array1[arg0.anInt1527];
			if (local32 != null) {
				local41 = arg0.anInt1562 - local32.anInt1562;
				local47 = arg0.anInt1518 - local32.anInt1518;
				if (local47 != 0 || local41 != 0) {
					arg0.anInt1545 = (int) (Math.atan2((double) local47, (double) local41) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(74) int local74;
		if (arg0.anInt1527 >= 32768) {
			local74 = arg0.anInt1527 - 32768;
			if (local74 == Static47.anInt1379) {
				local74 = 2047;
			}
			@Pc(83) Class2_Sub1_Sub1_Sub2_Sub2 local83 = Static89.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local74];
			if (local83 != null) {
				local41 = arg0.anInt1518 - local83.anInt1518;
				@Pc(99) int local99 = arg0.anInt1562 - local83.anInt1562;
				if (local41 != 0 || local99 != 0) {
					arg0.anInt1545 = (int) (Math.atan2((double) local41, (double) local99) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt1553 != 0 || arg0.anInt1560 != 0) && (arg0.anInt1570 == 0 || arg0.anInt1567 > 0)) {
			local74 = arg0.anInt1518 - (arg0.anInt1553 - Static107.anInt2849 - Static107.anInt2849) * 64;
			local47 = arg0.anInt1562 - (arg0.anInt1560 - Static37.anInt1220 - Static37.anInt1220) * 64;
			if (local74 != 0 || local47 != 0) {
				arg0.anInt1545 = (int) (Math.atan2((double) local74, (double) local47) * 325.949D) & 0x7FF;
			}
			arg0.anInt1553 = 0;
			arg0.anInt1560 = 0;
		}
		local74 = arg0.anInt1545 - arg0.anInt1540 & 0x7FF;
		if (local74 == 0) {
			arg0.anInt1516 = 0;
			return;
		}
		arg0.anInt1516++;
		@Pc(227) boolean local227;
		if (local74 > 1024) {
			arg0.anInt1540 -= arg0.anInt1536;
			local227 = true;
			if (local74 < arg0.anInt1536 || 2048 - arg0.anInt1536 < local74) {
				arg0.anInt1540 = arg0.anInt1545;
				local227 = false;
			}
			if (arg0.anInt1515 == arg0.anInt1542 && (arg0.anInt1516 > 25 || local227)) {
				if (arg0.anInt1571 == -1) {
					arg0.anInt1542 = arg0.anInt1528;
				} else {
					arg0.anInt1542 = arg0.anInt1571;
				}
			}
		} else {
			arg0.anInt1540 += arg0.anInt1536;
			local227 = true;
			if (arg0.anInt1536 > local74 || 2048 - arg0.anInt1536 < local74) {
				local227 = false;
				arg0.anInt1540 = arg0.anInt1545;
			}
			if (arg0.anInt1542 == arg0.anInt1515 && (arg0.anInt1516 > 25 || local227)) {
				if (arg0.anInt1559 == -1) {
					arg0.anInt1542 = arg0.anInt1528;
				} else {
					arg0.anInt1542 = arg0.anInt1559;
				}
			}
		}
		arg0.anInt1540 &= 0x7FF;
	}
}
