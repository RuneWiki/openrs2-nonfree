import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!d", name = "P", descriptor = "Lclient!pe;")
	public static Class13 aClass13_7;

	@OriginalMember(owner = "client!d", name = "S", descriptor = "Lclient!fd;")
	public static Class25 aClass25_9;

	@OriginalMember(owner = "client!d", name = "D", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray4 = new int[4][105][105];

	@OriginalMember(owner = "client!d", name = "E", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_235 = Static158.method3034("leuchten1:");

	@OriginalMember(owner = "client!d", name = "G", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_236 = Static158.method3034(":");

	@OriginalMember(owner = "client!d", name = "f", descriptor = "(I)V")
	public static void method790(@OriginalArg(0) int arg0) {
		Static152.anInt2807 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static146.anInt3815; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static193.anInt4611; local6++) {
				if (Static118.aClass2_Sub17ArrayArrayArray1[arg0][local3][local6] == null) {
					Static118.aClass2_Sub17ArrayArrayArray1[arg0][local3][local6] = new Class2_Sub17(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(II)V")
	public static void method793(@OriginalArg(0) int arg0) {
		for (@Pc(13) Class2_Sub12 local13 = (Class2_Sub12) Static174.aClass51_13.method2465(); local13 != null; local13 = (Class2_Sub12) Static174.aClass51_13.method2462()) {
			if ((local13.aLong151 >> 48 & 0xFFFFL) == (long) arg0) {
				local13.method3556();
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "h", descriptor = "(I)V")
	public static void method794() {
		if (Static170.aString5.toLowerCase().indexOf("microsoft") != -1) {
			Static108.anIntArray350[221] = 43;
			Static108.anIntArray350[223] = 28;
			Static108.anIntArray350[219] = 42;
			Static108.anIntArray350[186] = 57;
			Static108.anIntArray350[220] = 74;
			Static108.anIntArray350[222] = 59;
			Static108.anIntArray350[192] = 58;
			Static108.anIntArray350[190] = 72;
			Static108.anIntArray350[188] = 71;
			Static108.anIntArray350[187] = 27;
			Static108.anIntArray350[191] = 73;
			Static108.anIntArray350[189] = 26;
			return;
		}
		Static108.anIntArray350[93] = 43;
		Static108.anIntArray350[44] = 71;
		Static108.anIntArray350[45] = 26;
		Static108.anIntArray350[59] = 57;
		Static108.anIntArray350[47] = 73;
		Static108.anIntArray350[61] = 27;
		Static108.anIntArray350[92] = 74;
		Static108.anIntArray350[46] = 72;
		if (Static170.aMethod1 == null) {
			Static108.anIntArray350[192] = 58;
			Static108.anIntArray350[222] = 59;
		} else {
			Static108.anIntArray350[520] = 59;
			Static108.anIntArray350[192] = 28;
			Static108.anIntArray350[222] = 58;
		}
		Static108.anIntArray350[91] = 42;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILclient!ob;I)V")
	public static void method795(@OriginalArg(0) int arg0, @OriginalArg(1) Class60 arg1) {
		@Pc(7) Class60 local7 = arg1.method2690().method2663();
		@Pc(21) boolean local21 = false;
		for (@Pc(23) int local23 = 0; local23 < Static166.anInt4101; local23++) {
			@Pc(31) Class2_Sub1_Sub1_Sub3_Sub1 local31 = Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3[Static169.anIntArray458[local23]];
			if (local31 != null && local31.aClass60_288 != null && local31.aClass60_288.method2698(local7)) {
				local21 = true;
				Static145.method2926(2, 1, local31.anIntArray369[0], local31.anIntArray371[0], false, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0], 0, 0, 0, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0], 1);
				if (arg0 == 1) {
					Static7.aClass2_Sub3_Sub1_43.method244(90);
					Static7.aClass2_Sub3_Sub1_43.method221(Static169.anIntArray458[local23]);
				} else if (arg0 == 4) {
					Static7.aClass2_Sub3_Sub1_43.method244(200);
					Static7.aClass2_Sub3_Sub1_43.method221(Static169.anIntArray458[local23]);
				} else if (arg0 == 6) {
					Static7.aClass2_Sub3_Sub1_43.method244(37);
					Static7.aClass2_Sub3_Sub1_43.method231(Static169.anIntArray458[local23]);
				} else if (arg0 == 7) {
					Static7.aClass2_Sub3_Sub1_43.method244(232);
					Static7.aClass2_Sub3_Sub1_43.method236(Static169.anIntArray458[local23]);
				}
				break;
			}
		}
		if (!local21) {
			Static118.method2563(0, Static101.aClass60_807, Static193.method3536(new Class60[] { Static130.aClass60_979, local7 }));
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BLclient!ob;)V")
	public static void method796(@OriginalArg(1) Class60 arg0) {
		if (Static163.aClass2_Sub23Array1 == null) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(16) long local16 = arg0.method2691();
		if (local16 == 0L) {
			return;
		}
		while (local10 < Static163.aClass2_Sub23Array1.length && Static163.aClass2_Sub23Array1[local10].aLong151 != local16) {
			local10++;
		}
		if (Static163.aClass2_Sub23Array1.length > local10 && Static163.aClass2_Sub23Array1[local10] != null) {
			Static7.aClass2_Sub3_Sub1_43.method244(145);
			Static7.aClass2_Sub3_Sub1_43.method205(Static163.aClass2_Sub23Array1[local10].aLong151);
		}
	}
}
