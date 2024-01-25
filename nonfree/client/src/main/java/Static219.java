import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "[Lclient!dn;")
	public static Class51[] aClass51Array3;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)Z")
	public static boolean method4008() {
		try {
			return Static128.method3390();
		} catch (@Pc(15) IOException local15) {
			Static345.method5915();
			return true;
		} catch (@Pc(20) Exception local20) {
			@Pc(61) String local61 = "T2 - " + Static297.anInt5810 + "," + Static203.anInt5016 + "," + Static52.anInt972 + " - " + Static54.anInt1000 + "," + (Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray523[0] + Static172.anInt4394) + "," + (Static12.anInt3797 + Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray522[0]) + " - ";
			for (@Pc(63) int local63 = 0; Static54.anInt1000 > local63 && local63 < 50; local63++) {
				local61 = local61 + Static187.aClass5_Sub12_Sub2_4.aByteArray90[local63] + ",";
			}
			Static114.method1992(local20, local61);
			Static49.method4428();
			return true;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method4009(@OriginalArg(0) String arg0) {
		if (Static17.aStringArray4 == null) {
			Static177.method3183();
		}
		@Pc(12) String[] local12 = Static172.method4047(arg0, '\n');
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			for (@Pc(17) int local17 = Static247.anInt4947; local17 > 0; local17--) {
				Static17.aStringArray4[local17] = Static17.aStringArray4[local17 - 1];
			}
			Static17.aStringArray4[0] = local12[local14];
			if (Static247.anInt4947 < Static17.aStringArray4.length - 1) {
				Static247.anInt4947++;
				if (Static175.anInt2812 > 0) {
					Static175.anInt2812++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(III)I")
	public static int method4011(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(21) int local21 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local21;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)I")
	public static int method4012() {
		if (Static288.aBoolean470) {
			return 0;
		} else if (Static288.method5007()) {
			return Static215.aBoolean349 ? 2 : 1;
		} else {
			return 1;
		}
	}
}
