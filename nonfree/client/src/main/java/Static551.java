import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static551 {

	@OriginalMember(owner = "client!us", name = "L", descriptor = "Lclient!ri;")
	public static Class284 aClass284_158;

	@OriginalMember(owner = "client!us", name = "Q", descriptor = "I")
	public static int anInt9633;

	@OriginalMember(owner = "client!us", name = "T", descriptor = "I")
	public static int anInt9636;

	@OriginalMember(owner = "client!us", name = "P", descriptor = "Z")
	public static boolean aBoolean634 = false;

	@OriginalMember(owner = "client!us", name = "h", descriptor = "(I)Lclient!cw;")
	public static Class3_Sub10 method7561() {
		return Class8.anInt57 == 0 ? new Class3_Sub10() : Static312.aClass3_Sub10Array1[--Class8.anInt57];
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!jea;BLclient!jea;)V")
	public static void method7563(@OriginalArg(0) Class25 arg0, @OriginalArg(2) Class25 arg1) {
		if (arg1.aClass25_67 != null) {
			arg1.method6959();
		}
		arg1.aClass25_67 = arg0.aClass25_67;
		arg1.aClass25_68 = arg0;
		arg1.aClass25_67.aClass25_68 = arg1;
		arg1.aClass25_68.aClass25_67 = arg1;
	}
}
