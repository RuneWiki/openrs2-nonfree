import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!fea", name = "r", descriptor = "I")
	public static int anInt2400;

	@OriginalMember(owner = "client!fea", name = "s", descriptor = "I")
	public static int anInt2401;

	@OriginalMember(owner = "client!fea", name = "i", descriptor = "Lclient!fea;")
	public static final Class106 aClass106_1 = new Class106(0, 3, Static385.aClass247_18);

	@OriginalMember(owner = "client!fea", name = "j", descriptor = "Lclient!fea;")
	public static final Class106 aClass106_2 = new Class106(1, 3, Static385.aClass247_18);

	@OriginalMember(owner = "client!fea", name = "k", descriptor = "Lclient!fea;")
	public static final Class106 aClass106_3 = new Class106(2, 4, Static385.aClass247_14);

	@OriginalMember(owner = "client!fea", name = "l", descriptor = "Lclient!fea;")
	public static final Class106 aClass106_4 = new Class106(3, 1, Static385.aClass247_18);

	@OriginalMember(owner = "client!fea", name = "m", descriptor = "Lclient!fea;")
	public static final Class106 aClass106_5 = new Class106(4, 2, Static385.aClass247_18);

	@OriginalMember(owner = "client!fea", name = "n", descriptor = "Lclient!fea;")
	public static final Class106 aClass106_6 = new Class106(5, 3, Static385.aClass247_18);

	@OriginalMember(owner = "client!fea", name = "o", descriptor = "Lclient!fea;")
	public static final Class106 aClass106_7 = new Class106(6, 4, Static385.aClass247_18);

	@OriginalMember(owner = "client!fea", name = "p", descriptor = "I")
	public static final int anInt2399 = Static407.method6237(16);

	@OriginalMember(owner = "client!fea", name = "q", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_67 = new Class136(100, -1);

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(BFIFF)F")
	public static float method2195(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		@Pc(12) float[] local12 = Static591.aFloatArrayArray11[arg1];
		return local12[0] * arg0 + local12[1] * arg2 + arg3 * local12[2];
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(BIIILclient!fha;)V")
	public static void method2196(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class14_Sub1_Sub1_Sub3_Sub1 arg2) {
		@Pc(10) int local10 = arg2.anIntArray253[0];
		@Pc(15) int local15 = arg2.anIntArray252[0];
		if (local10 < 0 || Static111.anInt1752 <= local10 || local15 < 0 || Static279.anInt4567 <= local15 || (arg1 < 0 || Static111.anInt1752 <= arg1 || arg0 < 0 || arg0 >= Static279.anInt4567)) {
			return;
		}
		@Pc(84) int local84 = Static551.method7788(0, local10, Static308.aClass182Array1[arg2.aByte125], local15, arg2.method2509(), Static202.anIntArray294, true, 0, 0, arg0, 0, Static325.anIntArray411, arg1, -4);
		if (local84 >= 1 && local84 <= 3) {
			for (@Pc(98) int local98 = 0; local98 < local84 - 1; local98++) {
				arg2.method2367((byte) 2, Static325.anIntArray411[local98], Static202.anIntArray294[local98]);
			}
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(IB)Lclient!fea;")
	public static Class106 method2197(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return aClass106_1;
		} else if (arg0 == 1) {
			return aClass106_2;
		} else if (arg0 == 2) {
			return aClass106_3;
		} else if (arg0 == 3) {
			return aClass106_4;
		} else if (arg0 == 4) {
			return aClass106_5;
		} else if (arg0 == 5) {
			return aClass106_6;
		} else if (arg0 == 6) {
			return aClass106_7;
		} else {
			return null;
		}
	}
}
