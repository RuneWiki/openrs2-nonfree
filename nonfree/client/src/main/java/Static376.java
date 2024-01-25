import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!mja", name = "k", descriptor = "Lclient!jda;")
	public static final Class165 aClass165_41 = new Class165(4);

	@OriginalMember(owner = "client!mja", name = "m", descriptor = "[I")
	public static final int[] anIntArray523 = new int[2];

	@OriginalMember(owner = "client!mja", name = "n", descriptor = "[Lclient!bs;")
	public static final Class3_Sub11_Sub1[] aClass3_Sub11_Sub1Array4 = new Class3_Sub11_Sub1[14];

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(IIIII)V")
	public static void method5446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= Static7.anInt93 && Static115.anInt2377 >= arg1) {
			@Pc(19) int local19 = Static120.method2296(arg0, Static374.anInt5986, Static84.anInt1667);
			@Pc(25) int local25 = Static120.method2296(arg3, Static374.anInt5986, Static84.anInt1667);
			Static655.method9118(local25, arg2, arg1, local19);
		}
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(Lclient!gaa;II)V")
	public static void method5447(@OriginalArg(0) Class3_Sub25_Sub1 arg0, @OriginalArg(1) int arg1) {
		Static185.anInt3761 = 0;
		Static528.aBoolean680 = false;
		Static272.method4427(arg0);
		Static138.method2539(arg0);
		if (Static528.aBoolean680) {
			System.out.println("---endgpp---");
		}
		if (arg0.anInt9765 != arg1) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt9765 + " psize:" + arg1);
		}
	}
}
