import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!bd", name = "l", descriptor = "Lclient!bg;")
	public static Class11 aClass11_15;

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "Lclient!rc;")
	public static Class74 aClass74_10 = new Class74(50);

	@OriginalMember(owner = "client!bd", name = "p", descriptor = "Lclient!lf;")
	private static Class49 aClass49_161 = Static32.method683("Connecting to update server");

	@OriginalMember(owner = "client!bd", name = "m", descriptor = "Lclient!lf;")
	public static Class49 aClass49_160 = aClass49_161;

	@OriginalMember(owner = "client!bd", name = "n", descriptor = "Z")
	public static volatile boolean aBoolean12 = true;

	@OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
	public static int anInt254 = 0;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!lf;Lclient!lf;BLclient!bg;)Lclient!kf;")
	public static Class2_Sub2_Sub2_Sub3 method203(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(3) Class11 arg2) {
		@Pc(9) int local9 = arg2.method2053(arg0);
		@Pc(15) int local15 = arg2.method2056(arg1, local9);
		return Static144.method2369(local15, local9, arg2);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V")
	public static void method206() {
		aClass49_161 = null;
		aClass74_10 = null;
		aClass11_15 = null;
		aClass49_160 = null;
	}
}
