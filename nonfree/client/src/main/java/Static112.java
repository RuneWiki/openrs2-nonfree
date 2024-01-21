import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!ng", name = "B", descriptor = "[Lclient!ra;")
	public static Class3_Sub1_Sub4_Sub7_Sub2[] aClass3_Sub1_Sub4_Sub7_Sub2Array1 = new Class3_Sub1_Sub4_Sub7_Sub2[32768];

	@OriginalMember(owner = "client!ng", name = "I", descriptor = "Lclient!b;")
	public static Class7 aClass7_19 = new Class7(30);

	@OriginalMember(owner = "client!ng", name = "J", descriptor = "I")
	public static int anInt2735 = 1;

	@OriginalMember(owner = "client!ng", name = "K", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1530 = Static122.method531("Connecting to update server");

	@OriginalMember(owner = "client!ng", name = "L", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1531 = Static122.method531("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!ng", name = "M", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1532 = aClass73_1530;

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "(I)V")
	public static void method2030() {
		aClass73_1530 = null;
		aClass73_1532 = null;
		aClass73_1531 = null;
		aClass7_19 = null;
		aClass3_Sub1_Sub4_Sub7_Sub2Array1 = null;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BI)Z")
	public static boolean method2031(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!ff;Z)V")
	public static void method2032(@OriginalArg(0) Class3_Sub12 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static98.aClass80_3 != null) {
			@Pc(20) int local20;
			try {
				Static98.aClass80_3.method2608(0L);
				Static98.aClass80_3.method2611(local8);
				for (local20 = 0; local20 < 24 && local8[local20] == 0; local20++) {
				}
				if (local20 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(40) Exception local40) {
				for (local20 = 0; local20 < 24; local20++) {
					local8[local20] = -1;
				}
			}
		}
		arg0.method1345(local8, 24);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIZII)I")
	public static int method2033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) int local21 = 65536 - Class3_Sub1_Sub3_Sub2.anIntArray88[arg2 * 1024 / arg3] >> 1;
		return (local21 * arg0 >> 16) + ((65536 - local21) * arg1 >> 16);
	}
}
