import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static153 {

	@OriginalMember(owner = "client!fu", name = "u", descriptor = "I")
	public static int anInt3262;

	@OriginalMember(owner = "client!fu", name = "v", descriptor = "[I")
	public static int[] anIntArray161;

	@OriginalMember(owner = "client!fu", name = "A", descriptor = "Lclient!hp;")
	public static final Class143 aClass143_1 = new Class143();

	@OriginalMember(owner = "client!fu", name = "C", descriptor = "[I")
	public static final int[] anIntArray162 = new int[64];

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(B)V")
	public static void method2610() {
		if (Static455.aClass4_Sub35_Sub1_1.method7621(Static453.anInt8614) || Static550.anInt10029 == Static352.anInt6764) {
			Static50.method1165(Static39.aClass7_2);
			if (Static352.anInt6764 != Static485.anInt9202) {
				Static385.method5956();
			}
		} else {
			Static564.method7994(11, false, Static560.anInt10211, Static173.anInt3656);
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIIIII)V")
	public static void method2612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static455.aClass4_Sub35_Sub1_1.anInt9916 != 0 && arg3 != 0 && Static399.anInt7806 < 50 && arg4 != -1) {
			Static256.aClass185Array1[Static399.anInt7806++] = new Class185((byte) 1, arg4, arg3, arg2, arg5, arg1, arg0, null);
		}
	}
}
