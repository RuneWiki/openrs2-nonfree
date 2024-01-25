import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!lu", name = "U", descriptor = "Lclient!la;")
	public static Class196 aClass196_64;

	@OriginalMember(owner = "client!lu", name = "m", descriptor = "[I")
	public static final int[] anIntArray374 = new int[32];

	@OriginalMember(owner = "client!lu", name = "Dc", descriptor = "[I")
	public static int[] anIntArray382 = new int[2];

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(III)Z")
	public static boolean method5434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!lu", name = "f", descriptor = "(I)Z")
	public static boolean method5443() {
		@Pc(7) boolean local7 = true;
		if (Static44.aClass107_1 == null) {
			if (Static474.aClass196_98.method5111(Static599.anInt9786)) {
				Static44.aClass107_1 = Static645.method2762(Static474.aClass196_98, Static599.anInt9786);
			} else {
				local7 = false;
			}
		}
		if (Static628.aClass107_6 == null) {
			if (Static474.aClass196_98.method5111(Static140.anInt2832)) {
				Static628.aClass107_6 = Static645.method2762(Static474.aClass196_98, Static140.anInt2832);
			} else {
				local7 = false;
			}
		}
		if (Static47.aClass107_2 == null) {
			if (Static474.aClass196_98.method5111(Static246.anInt4547)) {
				Static47.aClass107_2 = Static645.method2762(Static474.aClass196_98, Static246.anInt4547);
			} else {
				local7 = false;
			}
		}
		if (Static275.aClass282_8 == null) {
			if (Static429.aClass196_84.method5111(Static24.anInt933)) {
				Static275.aClass282_8 = Static95.method2093(Static429.aClass196_84, Static24.anInt933);
			} else {
				local7 = false;
			}
		}
		if (Static118.aClass107Array1 == null) {
			if (Static474.aClass196_98.method5111(Static24.anInt933)) {
				Static118.aClass107Array1 = Static645.method2768(Static474.aClass196_98, Static24.anInt933);
			} else {
				local7 = false;
			}
		}
		return local7;
	}
}
