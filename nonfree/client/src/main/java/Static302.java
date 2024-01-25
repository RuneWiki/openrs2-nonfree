import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!pn", name = "h", descriptor = "[I")
	public static int[] anIntArray330;

	@OriginalMember(owner = "client!pn", name = "d", descriptor = "I")
	public static int anInt4903 = 0;

	@OriginalMember(owner = "client!pn", name = "e", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_93 = new Class256("Discard", "Ablegen", "Jeter", "Descartar");

	@OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
	public static int anInt4904 = 0;

	@OriginalMember(owner = "client!pn", name = "g", descriptor = "[S")
	public static final short[] aShortArray56 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V")
	public static void method3957() {
		for (@Pc(10) Class2_Sub2_Sub5 local10 = (Class2_Sub2_Sub5) Static422.aClass265_51.method6005(); local10 != null; local10 = (Class2_Sub2_Sub5) Static422.aClass265_51.method6001()) {
			@Pc(23) Class4_Sub2_Sub6 local23 = local10.aClass4_Sub2_Sub6_1;
			if (local23.aBoolean604) {
				local10.method6072();
				local23.method5572();
			} else if (local23.anInt7128 <= Static164.anInt3206) {
				local23.method5570(Static305.anInt1351);
				if (local23.aBoolean604) {
					local10.method6072();
				} else {
					Static317.method4544(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)Z")
	public static boolean method3958(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static13.method218(arg1, arg0) || Static7.method161(arg0, arg1);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!qa;I)V")
	public static void method3959(@OriginalArg(0) Class26 arg0) {
		if (Static60.aClass265_14.method6002() == 0) {
			return;
		}
		@Pc(23) Class2_Sub8 local23;
		if (Static281.anInt5126 == 0) {
			for (local23 = (Class2_Sub8) Static60.aClass265_14.method6005(); local23 != null; local23 = (Class2_Sub8) Static60.aClass265_14.method6001()) {
				Static350.aClass149_2.method3492(false, arg0, local23.anInt1143, local23.anInt1145, false, local23.anInt1142, local23.aBoolean98 ? Static231.aClass4_Sub2_Sub2_Sub1_2.aClass7_1 : null, arg0, local23.anInt1148, Static418.aClass56_4, local23.anInt1144);
				local23.method6072();
			}
			Static8.method183();
			return;
		}
		if (Static281.aClass26_7 == null) {
			@Pc(70) Canvas local70 = new Canvas();
			local70.setSize(36, 32);
			Static281.aClass26_7 = Static312.method2282(Static152.anInterface8_6, 0, local70, Static303.aClass131_4, 0);
			Static119.aClass56_1 = Static281.aClass26_7.method2231(Static316.method4524(Static191.anInt3766, Static48.aClass188_23), Static456.method1762(Static351.aClass188_97, Static191.anInt3766));
		}
		for (local23 = (Class2_Sub8) Static60.aClass265_14.method6005(); local23 != null; local23 = (Class2_Sub8) Static60.aClass265_14.method6001()) {
			Static350.aClass149_2.method3492(false, arg0, local23.anInt1143, local23.anInt1145, false, local23.anInt1142, local23.aBoolean98 ? Static231.aClass4_Sub2_Sub2_Sub1_2.aClass7_1 : null, Static281.aClass26_7, local23.anInt1148, Static119.aClass56_1, local23.anInt1144);
			local23.method6072();
		}
	}
}
