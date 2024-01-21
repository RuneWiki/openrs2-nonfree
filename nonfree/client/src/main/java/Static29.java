import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "Lclient!ea;")
	public static Class20 aClass20_15;

	@OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
	public static int anInt685;

	@OriginalMember(owner = "client!ed", name = "s", descriptor = "[I")
	public static int[] anIntArray76;

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "Lclient!ja;")
	public static Class33 aClass33_10 = new Class33(30);

	@OriginalMember(owner = "client!ed", name = "o", descriptor = "[J")
	public static long[] aLongArray1 = new long[200];

	@OriginalMember(owner = "client!ed", name = "p", descriptor = "Lclient!ec;")
	public static Class22 aClass22_188 = Static60.method1113("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
	public static int anInt686 = 0;

	@OriginalMember(owner = "client!ed", name = "t", descriptor = "[Z")
	public static boolean[] aBooleanArray1 = new boolean[5];

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
	public static void method488() {
		aBooleanArray1 = null;
		anIntArray76 = null;
		aLongArray1 = null;
		aClass22_188 = null;
		aClass20_15 = null;
		aClass33_10 = null;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIII)I")
	public static int method490(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return 7 - arg2;
		} else if (local7 == 2) {
			return 7 - arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
	public static void method492() {
		for (@Pc(6) Class4_Sub18 local6 = (Class4_Sub18) Static52.aClass82_5.method2025(); local6 != null; local6 = (Class4_Sub18) Static52.aClass82_5.method2023()) {
			if (local6.aClass4_Sub4_Sub3_2 != null) {
				Static32.aClass4_Sub4_Sub4_1.method1642(local6.aClass4_Sub4_Sub3_2);
				local6.aClass4_Sub4_Sub3_2 = null;
			}
			if (local6.aClass4_Sub4_Sub3_3 != null) {
				Static32.aClass4_Sub4_Sub4_1.method1642(local6.aClass4_Sub4_Sub3_3);
				local6.aClass4_Sub4_Sub3_3 = null;
			}
		}
		Static52.aClass82_5.method2018();
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BII)Z")
	public static boolean method494(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class4_Sub1_Sub5 local16 = Static5.method45(arg0);
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local16.method886(arg1);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLclient!ea;Lclient!ea;ZI)Lclient!rc;")
	public static Class4_Sub1_Sub12 method495(@OriginalArg(1) Class20 arg0, @OriginalArg(2) Class20 arg1, @OriginalArg(4) int arg2) {
		@Pc(15) int[] local15 = arg1.method598(arg2);
		@Pc(17) boolean local17 = true;
		for (@Pc(19) int local19 = 0; local19 < local15.length; local19++) {
			@Pc(29) byte[] local29 = arg1.method608(local15[local19], arg2);
			if (local29 == null) {
				local17 = false;
			} else {
				@Pc(49) int local49 = local29[1] & 0xFF | (local29[0] & 0xFF) << 8;
				@Pc(57) byte[] local57 = arg0.method608(0, local49);
				if (local57 == null) {
					local17 = false;
				}
			}
		}
		if (!local17) {
			return null;
		}
		try {
			return new Class4_Sub1_Sub12(arg1, arg0, arg2, false);
		} catch (@Pc(91) Exception local91) {
			return null;
		}
	}
}
