import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
	public static int anInt2634;

	@OriginalMember(owner = "client!hn", name = "j", descriptor = "[Lclient!tr;")
	public static Class200[] aClass200Array2;

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "Lclient!hq;")
	public static final Class87 aClass87_23 = new Class87(32);

	@OriginalMember(owner = "client!hn", name = "h", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_81 = new Class34("red:", "rot:", "rouge:", "vermelho:");

	@OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
	public static int anInt2635 = 0;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIILclient!ki;IBIILclient!ki;I)V")
	public static void method2439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class17_Sub1_Sub1 arg3, @OriginalArg(6) int arg4, @OriginalArg(8) Class17_Sub1_Sub1 arg5, @OriginalArg(9) int arg6) {
		@Pc(9) int local9 = arg3.method4328();
		if (local9 == -1) {
			return;
		}
		@Pc(23) Class5 local23 = (Class5) Static53.aClass87_13.method2482((long) local9);
		if (local23 == null) {
			@Pc(30) Class99[] local30 = Static366.method2659(Static193.aClass216_64, local9);
			if (local30 == null) {
				return;
			}
			local23 = Static208.aClass32_11.method2149(local30[0]);
			Static53.aClass87_13.method2481(local23, (long) local9);
		}
		Static47.method1288(arg2 >> 1, arg1 >> 1, arg5.anInt5109, 0, arg5.anInt5108, arg5.method4318() * 64);
		@Pc(75) int local75 = arg4 + Static22.anIntArray444[0] - 18;
		@Pc(85) int local85 = Static22.anIntArray444[1] + arg0 - 16 - 54;
		@Pc(93) int local93 = local75 + arg6 / 4 * 18;
		@Pc(101) int local101 = local85 + arg6 % 4 * 18;
		local23.method3621(local93, local101);
		if (arg5 == arg3) {
			Static208.aClass32_11.method2183(local93 - 1, local101 + -1, 18, -256, 18);
		}
		@Pc(127) Class8_Sub7 local127 = Static342.method2769();
		local127.anInt4109 = local93;
		local127.anInt4111 = local101;
		local127.anInt4110 = local93 + 16;
		local127.aClass17_Sub1_Sub1_1 = arg3;
		local127.anInt4115 = local101 + 16;
		Static49.aClass217_1.method5678(local127);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V")
	public static void method2440() {
		@Pc(13) Class1_Sub4_Sub9 local13 = Static139.method4227(0, 15);
		local13.method1868();
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method2442(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub4_Sub9 local12 = Static139.method4227(arg1, 2);
		local12.method1869();
		local12.aString23 = arg0;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)Z")
	public static boolean method2444() {
		if (Static148.aBoolean313) {
			try {
				Static359.method1280(Static15.aClass143_1.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(19) Throwable local19) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)Lclient!qg;")
	public static Class1_Sub4_Sub19 method2445(@OriginalArg(1) int arg0) {
		@Pc(12) Class87 local12 = Static337.aClass87_61;
		@Pc(21) Class1_Sub4_Sub19 local21;
		synchronized (Static337.aClass87_61) {
			local21 = (Class1_Sub4_Sub19) Static337.aClass87_61.method2482((long) arg0);
			if (local21 == null) {
				local21 = new Class1_Sub4_Sub19(arg0);
				Static337.aClass87_61.method2481(local21, (long) arg0);
			}
		}
		synchronized (local21) {
			return local21.method4590() ? local21 : null;
		}
	}
}
