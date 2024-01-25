import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static562 {

	@OriginalMember(owner = "client!vj", name = "t", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet2;

	@OriginalMember(owner = "client!vj", name = "s", descriptor = "Lclient!il;")
	public static final Class162 aClass162_42 = new Class162(32);

	@OriginalMember(owner = "client!vj", name = "u", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_163 = new Class286(71, 11);

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!ni;II)V")
	public static void method7639(@OriginalArg(0) Class6_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (Static412.anInt575 < arg0.anInt7415) {
			Static341.method5173(arg0);
		} else if (arg0.anInt7353 >= Static412.anInt575) {
			Static389.method5722(arg0);
		} else {
			Static571.method7718(false, arg0);
			local9 = Static122.anInt2385;
			local7 = Static406.anInt7066;
		}
		if (arg0.anInt8761 < 512 || arg0.anInt8764 < 512 || (Static188.anInt3850 - 1) * 512 <= arg0.anInt8761 || (Static49.anInt1174 - 1) * 512 <= arg0.anInt8764) {
			arg0.anInt7353 = 0;
			arg0.anInt7415 = 0;
			local7 = -1;
			arg0.anInt7356 = -1;
			arg0.anInt7368 = -1;
			local9 = 0;
			arg0.anIntArray507 = null;
			arg0.anInt7370 = -1;
			arg0.anInt8761 = arg0.anIntArray510[0] * 512 + arg0.method6165() * 256;
			arg0.anInt8764 = arg0.anIntArray509[0] * 512 + arg0.method6165() * 256;
			arg0.method6154();
		}
		if (Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2 == arg0 && (arg0.anInt8761 < 6144 || arg0.anInt8764 < 6144 || Static188.anInt3850 * 512 - 6144 <= arg0.anInt8761 || (Static49.anInt1174 - 12) * 512 <= arg0.anInt8764)) {
			local9 = 0;
			arg0.anInt7353 = 0;
			local7 = -1;
			arg0.anIntArray507 = null;
			arg0.anInt7370 = -1;
			arg0.anInt7415 = 0;
			arg0.anInt7356 = -1;
			arg0.anInt7368 = -1;
			arg0.anInt8761 = arg0.anIntArray510[0] * 512 + arg0.method6165() * 256;
			arg0.anInt8764 = arg0.anIntArray509[0] * 512 + arg0.method6165() * 256;
			arg0.method6154();
		}
		@Pc(213) int local213 = Static349.method5211(arg0);
		Static140.method2379(local213, local7, arg0, local9);
		Static343.method4370(arg0, local7);
		Static571.method7721(arg0);
	}
}
