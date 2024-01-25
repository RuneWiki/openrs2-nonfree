import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!haa", name = "K", descriptor = "Lclient!nl;")
	public static final Class258 aClass258_7 = new Class258("", 20);

	@OriginalMember(owner = "client!haa", name = "D", descriptor = "Lclient!tj;")
	public static final Class357 aClass357_21 = new Class357();

	@OriginalMember(owner = "client!haa", name = "E", descriptor = "I")
	public static final int anInt4349 = 0;

	@OriginalMember(owner = "client!haa", name = "H", descriptor = "Z")
	public static final boolean aBoolean361 = true;

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(ILclient!av;II)V")
	public static void method3585(@OriginalArg(1) Class20 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null) {
			return;
		}
		if (arg0.anObjectArray24 != null) {
			@Pc(21) Class3_Sub7 local21 = new Class3_Sub7();
			local21.anObjectArray1 = arg0.anObjectArray24;
			local21.aClass20_2 = arg0;
			Static185.method2811(local21);
		}
		Static718.anInt11231 = arg2;
		Static355.anInt6021 = arg0.anInt559;
		Static198.anInt3491 = arg0.anInt583;
		Static502.anInt8594 = arg1;
		Static212.aBoolean297 = true;
		Static575.anInt9446 = arg0.anInt595;
		Static27.anInt421 = arg0.anInt544;
		Static397.anInt7112 = arg0.anInt600;
		Static391.method5905(arg0);
	}
}
