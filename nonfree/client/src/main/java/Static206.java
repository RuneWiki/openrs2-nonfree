import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!gr", name = "C", descriptor = "Lclient!lf;")
	public static final Class221 aClass221_7 = new Class221(8, -1);

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!vo;I)Lclient!vo;")
	public static Class381 method3808(@OriginalArg(0) Class381 arg0) {
		@Pc(6) Class381 local6 = Static78.method1071(arg0);
		if (local6 == null) {
			local6 = arg0.aClass381_14;
		}
		return local6;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IILclient!lga;IZII)V")
	public static void method3809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2, @OriginalArg(3) int arg3) {
		if (arg3 <= 0) {
			Static551.method7805(arg1, arg2, arg0);
			return;
		}
		Static655.anInt10164 = 0;
		Static145.aClass6_Sub17_Sub4_2 = null;
		Static417.anInt7212 = arg0;
		Static319.anInt5508 = arg1;
		Static672.aClass223_121 = arg2;
		Static557.aBoolean682 = false;
		Static432.anInt7414 = 1;
		Static99.anInt2024 = Static449.aClass6_Sub17_Sub4_3.method6072() / arg3;
		if (Static99.anInt2024 < 1) {
			Static99.anInt2024 = 1;
			return;
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IB)Z")
	public static boolean method3811(@OriginalArg(0) int arg0) {
		return arg0 == 4 || arg0 == 8 || arg0 == 12 || arg0 == 10;
	}
}
