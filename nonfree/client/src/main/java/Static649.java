import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static649 {

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "Lclient!in;")
	public static final Class169 aClass169_261 = new Class169(111, 6);

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(IIILclient!mg;Lclient!ka;B)V")
	public static void method9557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class232 arg3, @OriginalArg(4) Class14 arg4) {
		if (arg4 != null) {
			arg3.method6318(arg4.V(), arg4.na(), arg4.RA(), arg2, arg0, arg4.G(), arg1, arg4.HA(), arg4.fa(), arg4.EA());
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)V")
	public static void method9558() {
		if (Static11.aClass268_1 == null) {
			return;
		}
		if (Static11.aClass268_1.anInt8008 == 1) {
			Static11.aClass268_1 = null;
			return;
		}
		if (Static11.aClass268_1.anInt8008 == 2) {
			Static509.method7935(Static325.aString70, Static452.aClass48_6, 2);
			Static11.aClass268_1 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method9560(@OriginalArg(0) Class101 arg0) {
		if (Static300.aBoolean723) {
			Static521.method6102(arg0);
		} else {
			Static672.method9817(arg0);
		}
	}
}
