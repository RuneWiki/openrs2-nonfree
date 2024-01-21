import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ad", name = "s", descriptor = "Lclient!pb;")
	public static Class72 aClass72_1;

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_39 = Static120.method1824("Bad session id)3");

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "Lclient!rd;")
	public static Class80 aClass80_40 = aClass80_39;

	@OriginalMember(owner = "client!ad", name = "u", descriptor = "I")
	public static int anInt187 = 0;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)I")
	public static int method126(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1;
		} else {
			arg1 = arg1 * (arg0 & 0x7F) >> 7;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V")
	public static void method127() {
		for (@Pc(10) Class3_Sub13 local10 = (Class3_Sub13) Static32.aClass70_26.method1953(); local10 != null; local10 = (Class3_Sub13) Static32.aClass70_26.method1948()) {
			if (local10.aClass3_Sub1_Sub1_1 != null) {
				local10.method1191();
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!qf;)Lclient!rd;")
	public static Class80 method128(@OriginalArg(1) Class77 arg0) {
		if (Static110.method1715(Static71.method1062(arg0)) == 0) {
			return null;
		} else if (arg0.aClass80_1258 == null || arg0.aClass80_1258.method2431().method2462() == 0) {
			return Static106.aBoolean90 ? Static82.aClass80_679 : null;
		} else {
			return arg0.aClass80_1258;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!rd;Z)I")
	public static int method129(@OriginalArg(0) Class80 arg0) {
		if (Static44.anInt1005 == 1) {
			return 7;
		} else if (arg0.method2466(Static110.aClass80_976)) {
			return 1;
		} else if (arg0.method2466(Static175.aClass80_1519)) {
			return 1;
		} else if (arg0.method2466(Static27.aClass80_1730)) {
			return 2;
		} else if (arg0.method2466(Static120.aClass80_1039)) {
			return 2;
		} else if (arg0.method2466(Static172.aClass80_1489)) {
			return 3;
		} else if (arg0.method2466(Static108.aClass80_1153)) {
			return 4;
		} else if (arg0.method2466(Static102.aClass80_862)) {
			return 4;
		} else if (arg0.method2466(Static110.aClass80_977)) {
			return 5;
		} else if (arg0.method2466(Static98.aClass80_838)) {
			return 6;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!bc;II)Lclient!te;")
	public static Class3_Sub23 method131(@OriginalArg(0) Class1 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) byte[] local16 = arg0.method42(arg1);
		return local16 == null ? null : new Class3_Sub23(local16);
	}
}
