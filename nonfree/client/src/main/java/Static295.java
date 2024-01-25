import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!sp", name = "u", descriptor = "B")
	public static byte aByte65;

	@OriginalMember(owner = "client!sp", name = "B", descriptor = "[I")
	public static int[] anIntArray457;

	@OriginalMember(owner = "client!sp", name = "q", descriptor = "I")
	public static int anInt5715 = 0;

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIII)I")
	public static int method4916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return arg2;
		} else if (local7 == 2) {
			return 1023 - arg0;
		} else {
			return 1023 - arg2;
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(BIILjava/lang/String;I)V")
	public static void method4917(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class21 local8 = Static156.method4515(arg0, arg3);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray9 != null) {
			@Pc(18) Class4_Sub34 local18 = new Class4_Sub34();
			local18.aString53 = arg2;
			local18.anInt4872 = arg1;
			local18.anObjectArray34 = local8.anObjectArray9;
			local18.aClass21_12 = local8;
			Static164.method3189(local18);
		}
		@Pc(35) boolean local35 = true;
		if (local8.anInt757 > 0) {
			local35 = Static235.method4180(local8);
		}
		if (!local35 || !Static44.method877(local8).method1028(arg1 - 1)) {
			return;
		}
		if (arg1 == 1) {
			Static15.aClass4_Sub11_Sub1_2.method706(181);
			Static349.method5547(arg3, local8.anInt770, arg0);
		}
		if (arg1 == 2) {
			Static15.aClass4_Sub11_Sub1_2.method706(69);
			Static349.method5547(arg3, local8.anInt770, arg0);
		}
		if (arg1 == 3) {
			Static15.aClass4_Sub11_Sub1_2.method706(78);
			Static349.method5547(arg3, local8.anInt770, arg0);
		}
		if (arg1 == 4) {
			Static15.aClass4_Sub11_Sub1_2.method706(185);
			Static349.method5547(arg3, local8.anInt770, arg0);
		}
		if (arg1 == 5) {
			Static15.aClass4_Sub11_Sub1_2.method706(214);
			Static349.method5547(arg3, local8.anInt770, arg0);
		}
		if (arg1 == 6) {
			Static15.aClass4_Sub11_Sub1_2.method706(102);
			Static349.method5547(arg3, local8.anInt770, arg0);
		}
		if (arg1 == 7) {
			Static15.aClass4_Sub11_Sub1_2.method706(114);
			Static349.method5547(arg3, local8.anInt770, arg0);
		}
		if (arg1 == 8) {
			Static15.aClass4_Sub11_Sub1_2.method706(110);
			Static349.method5547(arg3, local8.anInt770, arg0);
		}
		if (arg1 == 9) {
			Static15.aClass4_Sub11_Sub1_2.method706(170);
			Static349.method5547(arg3, local8.anInt770, arg0);
		}
		if (arg1 == 10) {
			Static15.aClass4_Sub11_Sub1_2.method706(203);
			Static349.method5547(arg3, local8.anInt770, arg0);
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4918(@OriginalArg(1) String arg0) {
		if (Static66.aClass56Array1 != null) {
			Static15.aClass4_Sub11_Sub1_2.method706(151);
			Static15.aClass4_Sub11_Sub1_2.method3434(Static294.method4905(arg0));
			Static15.aClass4_Sub11_Sub1_2.method3410(arg0);
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IZLclient!cn;IIILclient!vq;I)Lclient!vj;")
	public static Class58 method4919(@OriginalArg(0) int arg0, @OriginalArg(2) Class33 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class47 arg5, @OriginalArg(7) int arg6) {
		Static233.aClass23_1.anInt799 = arg2;
		Static233.aClass23_1.anInt800 = arg5.anInt3056;
		Static233.aClass23_1.anInt810 = arg3;
		Static233.aClass23_1.aBoolean84 = arg1 != null;
		Static233.aClass23_1.anInt805 = arg0;
		Static233.aClass23_1.anInt806 = arg6;
		Static233.aClass23_1.anInt802 = arg4;
		return (Class58) Static160.aClass103_1.method2976(Static233.aClass23_1);
	}
}
