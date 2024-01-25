import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "[Lclient!kl;")
	public static Class199[] aClass199Array1;

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "F")
	public static float aFloat5;

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "[I")
	public static int[] anIntArray36 = new int[1];

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_11 = new Class305(15, 11);

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIBI)I")
	public static int method626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 4095 - arg0;
		} else if (local3 == 2) {
			return 4095 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILclient!wm;)V")
	public static void method627(@OriginalArg(1) Class390 arg0) {
		Static363.anInt9292 = arg0.method8910("p11_full");
		Static575.anInt9390 = arg0.method8910("p12_full");
		Static620.anInt10161 = arg0.method8910("b12_full");
	}
}
