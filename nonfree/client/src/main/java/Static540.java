import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static540 {

	@OriginalMember(owner = "client!tf", name = "Q", descriptor = "Ljava/lang/Object;")
	public static Object anObject20;

	@OriginalMember(owner = "client!tf", name = "U", descriptor = "I")
	public static int anInt9398;

	@OriginalMember(owner = "client!tf", name = "K", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_130 = new Class71(37, 7);

	@OriginalMember(owner = "client!tf", name = "R", descriptor = "Lclient!hs;")
	public static final Class138 aClass138_7 = new Class138(7, 2);

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)V")
	public static void method7646(@OriginalArg(1) int arg0) {
		@Pc(8) Class8_Sub5_Sub8 local8 = Static509.method7344(14, arg0);
		local8.method3512();
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(ZIII)Lclient!kw;")
	public static Class8_Sub31 method7648(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class8_Sub31 local5 = null;
		if (arg0 == 0) {
			local5 = Static51.method1418(Static394.aClass257_75, Static608.aClass336_1);
		}
		if (arg0 == 1) {
			local5 = Static51.method1418(Static378.aClass257_70, Static608.aClass336_1);
		}
		local5.aClass8_Sub8_Sub2_1.method8572(Static628.anInt10493 + arg1);
		local5.aClass8_Sub8_Sub2_1.method8573(Static295.aClass209_1.method5482(82) ? 1 : 0);
		local5.aClass8_Sub8_Sub2_1.method8548(arg2 + Static594.anInt10160);
		Static370.anInt7031 = arg1;
		Static29.anInt1137 = arg2;
		Static447.aBoolean310 = false;
		Static21.method901();
		return local5;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIZLclient!oh;II)V")
	public static void method7649(@OriginalArg(1) int arg0, @OriginalArg(3) Class237 arg1, @OriginalArg(5) int arg2) {
		Static602.method8278(arg2, arg1, 0L, arg0);
	}
}
