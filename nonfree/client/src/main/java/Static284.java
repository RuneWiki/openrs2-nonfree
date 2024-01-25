import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
	public static int anInt5625;

	@OriginalMember(owner = "client!qh", name = "q", descriptor = "I")
	public static int anInt5626;

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "[S")
	public static final short[] aShortArray99 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!qh", name = "l", descriptor = "Lclient!id;")
	public static final Class105 aClass105_9 = new Class105(64);

	@OriginalMember(owner = "client!qh", name = "o", descriptor = "I")
	public static int anInt5624 = -1;

	@OriginalMember(owner = "client!qh", name = "r", descriptor = "[I")
	public static final int[] anIntArray484 = new int[64];

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILclient!vt;)V")
	public static void method4938(@OriginalArg(1) Class2_Sub24 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static189.anInt637; local3++) {
			@Pc(9) int local9 = arg0.method5722();
			@Pc(13) int local13 = arg0.method5753();
			if (local13 == 65535) {
				local13 = -1;
			}
			if (Static266.aClass35_Sub1Array2[local9] != null) {
				Static266.aClass35_Sub1Array2[local9].anInt5022 = local13;
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V")
	public static void method4944() {
		if (Static175.aString29.toLowerCase().indexOf("microsoft") != -1) {
			Static133.anIntArray222[220] = 74;
			Static133.anIntArray222[219] = 42;
			Static133.anIntArray222[186] = 57;
			Static133.anIntArray222[221] = 43;
			Static133.anIntArray222[222] = 59;
			Static133.anIntArray222[191] = 73;
			Static133.anIntArray222[192] = 58;
			Static133.anIntArray222[187] = 27;
			Static133.anIntArray222[223] = 28;
			Static133.anIntArray222[188] = 71;
			Static133.anIntArray222[189] = 26;
			Static133.anIntArray222[190] = 72;
			return;
		}
		Static133.anIntArray222[92] = 74;
		Static133.anIntArray222[93] = 43;
		if (Static175.aMethod2 == null) {
			Static133.anIntArray222[192] = 58;
			Static133.anIntArray222[222] = 59;
		} else {
			Static133.anIntArray222[520] = 59;
			Static133.anIntArray222[222] = 58;
			Static133.anIntArray222[192] = 28;
		}
		Static133.anIntArray222[45] = 26;
		Static133.anIntArray222[46] = 72;
		Static133.anIntArray222[91] = 42;
		Static133.anIntArray222[47] = 73;
		Static133.anIntArray222[44] = 71;
		Static133.anIntArray222[59] = 57;
		Static133.anIntArray222[61] = 27;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLclient!vt;I)Ljava/lang/String;")
	public static String method4948(@OriginalArg(1) Class2_Sub24 arg0) {
		try {
			@Pc(7) int local7 = arg0.method5722();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(15) byte[] local15 = new byte[local7];
			arg0.anInt6669 += Static169.aClass25_3.method343(arg0.aByteArray100, local15, 0, arg0.anInt6669, local7);
			return Static378.method4271(local7, local15, 0);
		} catch (@Pc(47) Exception local47) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)V")
	public static void method4975(@OriginalArg(0) int arg0) {
		Static113.anInt5762 = arg0;
		Static10.aClass41_72.method825();
	}
}
