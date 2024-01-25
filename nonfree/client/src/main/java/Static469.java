import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static469 {

	@OriginalMember(owner = "client!ps", name = "l", descriptor = "Lclient!jp;")
	public static final Class3_Sub25 aClass3_Sub25_7 = new Class3_Sub25(1350);

	@OriginalMember(owner = "client!ps", name = "m", descriptor = "[I")
	public static final int[] anIntArray655 = new int[1000];

	@OriginalMember(owner = "client!ps", name = "n", descriptor = "Z")
	public static boolean aBoolean573 = false;

	@OriginalMember(owner = "client!ps", name = "o", descriptor = "Z")
	public static boolean aBoolean574 = false;

	@OriginalMember(owner = "client!ps", name = "s", descriptor = "Lclient!tm;")
	public static final Class338 aClass338_187 = new Class338();

	@OriginalMember(owner = "client!ps", name = "t", descriptor = "Z")
	public static final boolean aBoolean575 = false;

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIIILclient!rh;)V")
	public static void method6800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class28_Sub1_Sub5 arg4) {
		@Pc(4) Class164 local4 = Static408.method5789(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		arg4.anInt10729 = (arg1 << Static391.anInt10262) + Static597.anInt9602;
		arg4.anInt10722 = arg3;
		arg4.anInt10731 = (arg2 << Static391.anInt10262) + Static597.anInt9602;
		local4.aClass28_Sub1_Sub5_1 = arg4;
		@Pc(33) int local33 = Static121.aClass21Array2 == Static108.aClass21Array1 ? 1 : 0;
		if (arg4.method9281()) {
			if (arg4.method9287()) {
				arg4.aClass28_Sub1_23 = Static38.aClass28_Sub1Array5[local33];
				Static38.aClass28_Sub1Array5[local33] = arg4;
				return;
			}
			arg4.aClass28_Sub1_23 = Static539.aClass28_Sub1Array26[local33];
			Static539.aClass28_Sub1Array26[local33] = arg4;
			Static27.aBoolean42 = true;
			return;
		}
		arg4.aClass28_Sub1_23 = Static198.aClass28_Sub1Array37[local33];
		Static198.aClass28_Sub1Array37[local33] = arg4;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIII)V")
	public static void method6802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1010) {
			Static565.method8018(Static449.aClass223_12, arg1, arg0);
		} else if (arg2 == 1002) {
			Static565.method8018(Static202.aClass223_7, arg1, arg0);
		} else if (arg2 == 1011) {
			Static565.method8018(Static177.aClass223_8, arg1, arg0);
		} else if (arg2 == 1006) {
			Static565.method8018(Static114.aClass223_2, arg1, arg0);
		} else if (arg2 == 1007) {
			Static565.method8018(Static657.aClass223_16, arg1, arg0);
		}
	}
}
