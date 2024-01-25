import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static273 {

	@OriginalMember(owner = "client!qp", name = "O", descriptor = "I")
	public static int anInt5607;

	@OriginalMember(owner = "client!qp", name = "H", descriptor = "Lclient!jk;")
	public static final Class2_Sub12_Sub2 aClass2_Sub12_Sub2_3 = new Class2_Sub12_Sub2(5000);

	@OriginalMember(owner = "client!qp", name = "K", descriptor = "Z")
	public static boolean aBoolean493 = true;

	@OriginalMember(owner = "client!qp", name = "M", descriptor = "Z")
	public static boolean aBoolean494 = true;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!iq;ILclient!kb;Lclient!iq;)V")
	public static void method4727(@OriginalArg(0) Class104 arg0, @OriginalArg(2) Interface6 arg1, @OriginalArg(3) Class104 arg2) {
		Static54.aClass104_39 = arg0;
		Static152.anInterface6_1 = arg1;
		Static223.aClass104_126 = arg2;
		if (Static223.aClass104_126 != null) {
			Static265.anInt5517 = Static223.aClass104_126.method2745(1);
		}
		if (Static54.aClass104_39 != null) {
			Static269.anInt6660 = Static54.aClass104_39.method2745(1);
		}
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(II)I")
	public static int method4728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static26.anIntArrayArray35 == null ? 0 : Static26.anIntArrayArray35[arg0][arg1] >>> 21 & 0x7F8;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IZIII)V")
	public static void method4729(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static114.anInt2421 == 0) {
			Static251.method4441(false);
		} else {
			Static57.anInt1019 = Static114.anInt2421;
			Static212.method3988(0);
		}
		Static207.anInt4535 = arg2;
		Static121.aBoolean244 = arg1;
		Static71.anInt1273 = arg3;
		Static202.method4234(arg0);
	}

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "(III)I")
	public static int method4730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static351.anIntArray517[arg0 & 0x3] : 256;
	}
}
