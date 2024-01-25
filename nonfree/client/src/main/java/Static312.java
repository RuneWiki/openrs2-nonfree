import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static312 {

	@OriginalMember(owner = "client!u", name = "v", descriptor = "Lclient!rk;")
	public static Class180 aClass180_89;

	@OriginalMember(owner = "client!u", name = "x", descriptor = "Lclient!rk;")
	public static Class180 aClass180_90;

	@OriginalMember(owner = "client!u", name = "y", descriptor = "I")
	public static int anInt5954;

	@OriginalMember(owner = "client!u", name = "s", descriptor = "[Lclient!ok;")
	public static final Class7_Sub1_Sub14[] aClass7_Sub1_Sub14Array8 = new Class7_Sub1_Sub14[14];

	@OriginalMember(owner = "client!u", name = "C", descriptor = "Z")
	public static boolean aBoolean433 = false;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ZI)V")
	public static void method5039(@OriginalArg(0) boolean arg0) {
		if (arg0 != Static319.aBoolean444) {
			Static319.aBoolean444 = arg0;
			Static151.method2966();
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!rk;Lclient!rk;B)V")
	public static void method5042(@OriginalArg(0) Class180 arg0, @OriginalArg(1) Class180 arg1) {
		Static141.aClass180_37 = arg1;
		Static261.aClass180_68 = arg0;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(III)I")
	public static int method5043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static215.anIntArray585[arg1 & 0x3] : 256;
	}
}
