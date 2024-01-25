import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!or", name = "Bb", descriptor = "I")
	public static int anInt6969 = 0;

	@OriginalMember(owner = "client!or", name = "Oc", descriptor = "[I")
	public static final int[] anIntArray627 = new int[1];

	@OriginalMember(owner = "client!or", name = "bd", descriptor = "Z")
	public static boolean aBoolean510 = false;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!qn;ILjava/awt/Frame;)V")
	public static void method6242(@OriginalArg(0) Class291 arg0, @OriginalArg(2) Frame arg1) {
		while (true) {
			@Pc(18) Class81 local18 = arg0.method7135(arg1);
			while (local18.anInt2532 == 0) {
				Static373.method5403(10L);
			}
			if (local18.anInt2532 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static373.method5403(100L);
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(BC)Z")
	public static boolean method6262(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(I)V")
	public static void method6264() {
		Static316.aClass13_10.method8501(Static638.aClass239_10);
		Static316.aClass13_10.DA(Static111.anInt2276, Static445.anInt7377, Static254.anInt4540, Static72.anInt1350);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIBI)V")
	public static void method6265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == Static523.anInt8394 && Static566.anInt9181 == arg2 && arg1 == Static458.anInt7577) {
			return;
		}
		Static523.anInt8394 = arg0;
		Static566.anInt9181 = arg2;
		Static458.anInt7577 = arg1;
		Static27.aBoolean42 = true;
		@Pc(39) double local39 = -((double) (arg0 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(49) double local49 = -((double) (arg2 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(52) double local52 = Math.cos(local49);
		@Pc(55) double local55 = Math.sin(local49);
		@Pc(58) double local58 = Math.cos(local39);
		@Pc(61) double local61 = Math.sin(local39);
		Static255.aDouble10 = local52;
		Static596.aDouble31 = local61 * local55;
		Static467.aDouble23 = -local55 * local58;
		Static45.aDouble3 = 0.0D;
		Static323.aDouble9 = local52 * local58;
		Static269.aDouble11 = local58;
		Static575.aDouble30 = local61;
		Static488.aDouble26 = -local52 * local61;
		Static207.aDouble6 = local55;
	}
}
