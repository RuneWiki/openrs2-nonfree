import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!mga", name = "i", descriptor = "I")
	public static int anInt5879;

	@OriginalMember(owner = "client!mga", name = "f", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_113 = new Class156(37, 4);

	@OriginalMember(owner = "client!mga", name = "c", descriptor = "I")
	public static int anInt5878 = 0;

	@OriginalMember(owner = "client!mga", name = "e", descriptor = "[F")
	public static final float[] aFloatArray51 = new float[16];

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(IZIIZ)V")
	public static void method5241(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static577.aClass5_Sub19_25.aClass17_Sub24_2.method8102() == 0) {
			Static487.method7255(false);
		} else {
			Static171.anInt5361 = Static577.aClass5_Sub19_25.aClass17_Sub24_2.method8102();
			Static462.method6506(true, 0);
		}
		Static621.anInt3545 = arg1;
		Static380.aBoolean423 = arg3;
		Static429.anInt7127 = arg2;
		Static491.method665(arg0);
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(III)V")
	public static void method5243(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class5_Sub1_Sub18 local13 = Static123.method1827((long) arg1, 14);
		local13.method7441();
		local13.anInt8635 = arg0;
	}
}
