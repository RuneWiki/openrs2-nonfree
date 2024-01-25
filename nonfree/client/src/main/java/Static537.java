import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static537 {

	@OriginalMember(owner = "client!td", name = "B", descriptor = "Z")
	public static boolean aBoolean657 = false;

	@OriginalMember(owner = "client!td", name = "C", descriptor = "[Lclient!uk;")
	public static final Class344[] aClass344Array1 = new Class344[4];

	@OriginalMember(owner = "client!td", name = "D", descriptor = "[Lclient!vf;")
	public static final Class8_Sub50[] aClass8_Sub50Array1 = new Class8_Sub50[1024];

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(B)V")
	public static void method7581() {
		@Pc(5) Class236 local5 = Static438.aClass236_75;
		synchronized (Static438.aClass236_75) {
			Static438.aClass236_75.method6253();
		}
		local5 = Static120.aClass236_20;
		synchronized (Static120.aClass236_20) {
			Static120.aClass236_20.method6253();
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIILclient!oh;IIZ)V")
	public static void method7582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class237 arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= 0) {
			Static540.method7649(arg1, arg2, arg0);
			return;
		}
		Static570.anInt9813 = 1;
		Static642.aBoolean763 = false;
		Static68.aClass237_22 = arg2;
		Static227.anInt5183 = arg1;
		Static532.anInt9177 = arg0;
		Static10.aClass8_Sub16_Sub1_1 = null;
		Static7.anInt6404 = 0;
		Static542.anInt9401 = Static608.aClass8_Sub16_Sub1_4.method2270() / arg3;
		if (Static542.anInt9401 < 1) {
			Static542.anInt9401 = 1;
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(III)Z")
	public static boolean method7584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
