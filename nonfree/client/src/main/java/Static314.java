import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static314 {

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "F")
	public static float aFloat124;

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
	public static int anInt6320 = 0;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)I")
	public static int method5267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static543.anIntArray653[arg0 & 0x3] : Static86.anIntArray93[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBI)V")
	public static void method5269(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static470.anInt8805 == 1) {
			Static237.method4128(arg1, arg0, Static378.aClass3_Sub40_12);
		} else if (Static470.anInt8805 == 2) {
			Static129.method8417(arg1, arg0);
		}
		Static378.aClass3_Sub40_12 = null;
		Static470.anInt8805 = 0;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)V")
	public static void method5271() {
		Static568.aClass254_136 = null;
		Static93.aBoolean180 = false;
		Static274.anInt5814 = 0;
		Static178.anInt3592 = 1;
		Static340.anInt6985 = -1;
		Static273.anInt5808 = -1;
		Static207.anInt4266 = 2;
	}
}
