import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "Lclient!vg;")
	public static final Class342 aClass342_111 = new Class342(20);

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "I")
	public static int anInt5399 = 0;

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "Z")
	public static boolean aBoolean370 = false;

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIZI)V")
	public static void method4333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 << 3;
		@Pc(15) int local15 = arg1 << 3;
		if (Static188.anInt4080 == 2) {
			Static568.anInt9808 = local15;
			Static421.anInt7497 = local7;
			Static528.anInt10345 = 0;
		}
		Static209.aFloat229 = local7;
		Static123.aFloat75 = local15;
		Static459.method6313();
		Static595.aBoolean725 = true;
	}
}
