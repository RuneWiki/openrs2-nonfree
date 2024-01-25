import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!pa", name = "Og", descriptor = "I")
	public static int anInt7302;

	@OriginalMember(owner = "client!pa", name = "Xg", descriptor = "I")
	public static int anInt7311;

	@OriginalMember(owner = "client!pa", name = "oh", descriptor = "Lclient!vr;")
	public static Class33 aClass33_28;

	@OriginalMember(owner = "client!pa", name = "si", descriptor = "I")
	public static int anInt7377;

	@OriginalMember(owner = "client!pa", name = "ji", descriptor = "[Lclient!tf;")
	public static final Class227_Sub1[] aClass227_Sub1Array2 = new Class227_Sub1[37];

	@OriginalMember(owner = "client!pa", name = "pi", descriptor = "[[F")
	public static final float[][] aFloatArrayArray12 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!pa", name = "jb", descriptor = "(I)V")
	public static void method6531() {
		Static405.method5734();
		for (@Pc(13) int local13 = 0; local13 < 4; local13++) {
			Static1.aClass252Array5[local13].method6169();
		}
		Static649.method8991();
		Static429.method6182();
		Static651.method9022();
		System.gc();
		Static674.aClass13_22.ya();
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(III)I")
	public static int method6533(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 >>> 24;
		@Pc(16) int local16 = 255 - local7;
		@Pc(34) int local34 = (local7 * (arg0 & 0xFF00) & 0xFF0000 | local7 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		return (((arg1 & 0xFF00FF) * local16 & 0xFF00FF00 | (arg1 & 0xFF00) * local16 & 0xFF0000) >>> 8) + local34;
	}
}
