import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "Lclient!na;")
	public static Class53 aClass53_690 = Static109.method1737("0(U");

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
	public static int anInt1542 = 0;

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "Lclient!na;")
	public static Class53 aClass53_691 = Static109.method1737("title)3jpg");

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
	public static int anInt1551 = 0;

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "[B")
	public static byte[] aByteArray29 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray4 = new int[4][13][13];

	@OriginalMember(owner = "client!kb", name = "r", descriptor = "[I")
	public static int[] anIntArray191 = new int[5];

	@OriginalMember(owner = "client!kb", name = "s", descriptor = "Lclient!na;")
	public static Class53 aClass53_692 = Static109.method1737("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "[I")
	public static int[] anIntArray192 = new int[500];

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "Lclient!na;")
	public static Class53 aClass53_693 = Static109.method1737("Players");

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	public static void method1066() {
		Static107.anInt2462 = 0;
		Static101.anInt2376 = 0;
		Static118.method1907();
		Static118.method1891();
		Static23.method402();
		@Pc(31) int local31;
		for (@Pc(25) int local25 = 0; local25 < Static101.anInt2376; local25++) {
			local31 = Static119.anIntArray46[local25];
			if (Static27.anInt843 != Static44.aClass3_Sub1_Sub4_Sub1_Sub1Array1[local31].anInt1455) {
				Static44.aClass3_Sub1_Sub4_Sub1_Sub1Array1[local31].aClass3_Sub1_Sub1_1 = null;
				Static44.aClass3_Sub1_Sub4_Sub1_Sub1Array1[local31] = null;
			}
		}
		if (Static37.anInt2211 != Static62.aClass3_Sub7_Sub1_2.anInt964) {
			throw new RuntimeException("gnp1 pos:" + Static62.aClass3_Sub7_Sub1_2.anInt964 + " psize:" + Static37.anInt2211);
		}
		for (local31 = 0; local31 < Static20.anInt693; local31++) {
			if (Static44.aClass3_Sub1_Sub4_Sub1_Sub1Array1[Static18.anIntArray49[local31]] == null) {
				throw new RuntimeException("gnp2 pos:" + local31 + " size:" + Static20.anInt693);
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)V")
	public static void method1068() {
		Static32.aClass11_4 = new Class11();
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)V")
	public static void method1069(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class11 local7 = Static95.aClass11ArrayArrayArray1[Static72.anInt1813][arg0][arg1];
		if (local7 == null) {
			Static120.aClass39_1.method1004(Static72.anInt1813, arg0, arg1);
			return;
		}
		@Pc(21) Class3_Sub1_Sub4_Sub4 local21 = null;
		@Pc(31) Class3_Sub1_Sub4_Sub4 local31 = (Class3_Sub1_Sub4_Sub4) local7.method189();
		@Pc(33) int local33 = -99999999;
		while (local31 != null) {
			@Pc(39) Class3_Sub1_Sub8 local39 = Static2.method38(local31.anInt1298);
			@Pc(42) int local42 = local39.anInt1606;
			if (local39.anInt1587 == 1) {
				local42 *= local31.anInt1295 + 1;
			}
			if (local42 > local33) {
				local33 = local42;
				local21 = local31;
			}
			local31 = (Class3_Sub1_Sub4_Sub4) local7.method187();
		}
		if (local21 == null) {
			Static120.aClass39_1.method1004(Static72.anInt1813, arg0, arg1);
			return;
		}
		local7.method197(local21);
		local31 = (Class3_Sub1_Sub4_Sub4) local7.method189();
		@Pc(90) Class3_Sub1_Sub4_Sub4 local90 = null;
		@Pc(92) Class3_Sub1_Sub4_Sub4 local92 = null;
		while (local31 != null) {
			if (local31.anInt1298 != local21.anInt1298) {
				if (local90 == null) {
					local90 = local31;
				}
				if (local90.anInt1298 != local31.anInt1298 && local92 == null) {
					local92 = local31;
				}
			}
			local31 = (Class3_Sub1_Sub4_Sub4) local7.method187();
		}
		@Pc(130) int local130 = (arg1 << 7) + arg0 + 1610612736;
		Static120.aClass39_1.method1011(Static72.anInt1813, arg0, arg1, Static77.method1355(arg1 * 128 + 64, Static72.anInt1813, arg0 * 128 + 64), local21, local130, local90, local92);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!we;IB)[Lclient!nb;")
	public static Class3_Sub1_Sub5_Sub4[] method1071(@OriginalArg(0) int arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(2) int arg2) {
		return Static35.method756(arg0, arg2, arg1) ? Static100.method1650() : null;
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
	public static void method1074() {
		aByteArray29 = null;
		anIntArray192 = null;
		aClass53_693 = null;
		aClass53_690 = null;
		anIntArrayArrayArray4 = null;
		anIntArray191 = null;
		aClass53_691 = null;
		aClass53_692 = null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!na;Lclient!na;IIII)V")
	public static void method1075(@OriginalArg(0) int arg0, @OriginalArg(1) Class53 arg1, @OriginalArg(2) Class53 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static36.anInt1122 >= 500) {
			return;
		}
		if (arg2.method1294() > 0) {
			Static99.aClass53Array17[Static36.anInt1122] = Static103.method1689(new Class53[] { arg1, Static76.aClass53_854, arg2 });
		} else {
			Static99.aClass53Array17[Static36.anInt1122] = arg1;
		}
		Static18.anIntArray48[Static36.anInt1122] = arg0;
		Static54.anIntArray413[Static36.anInt1122] = arg3;
		Static53.anIntArray274[Static36.anInt1122] = arg4;
		anIntArray192[Static36.anInt1122] = arg5;
		Static36.anInt1122++;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(III)Z")
	public static boolean method1076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 >> arg0 + 1 & 0x1) != 0;
	}
}
