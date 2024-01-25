import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bf", name = "B", descriptor = "Lclient!qq;")
	public static Class282 aClass282_1;

	@OriginalMember(owner = "client!bf", name = "O", descriptor = "[Lclient!db;")
	public static final Interface8[] anInterface8Array1 = new Interface8[128];

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)Lclient!jn;")
	public static Class9_Sub4_Sub5 method1328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class186 local7 = Static26.aClass186ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass9_Sub4_Sub5_1;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
	public static void method1329() {
		Static241.aClass94_21.method2952();
	}
}
