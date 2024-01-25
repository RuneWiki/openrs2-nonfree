import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
	public static int anInt567;

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "Lclient!dn;")
	public static final Class56 aClass56_1 = new Class56("LIVE", 0);

	@OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
	public static int anInt564 = 0;

	@OriginalMember(owner = "client!bf", name = "s", descriptor = "[F")
	public static final float[] aFloatArray4 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!bf", name = "u", descriptor = "[S")
	public static short[] aShortArray9 = new short[256];

	@OriginalMember(owner = "client!bf", name = "v", descriptor = "Z")
	public static boolean aBoolean27 = false;

	@OriginalMember(owner = "client!bf", name = "w", descriptor = "[Lclient!kg;")
	public static final Class141[] aClass141Array1 = new Class141[128];

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIII)V")
	public static void method484(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(12) Class8_Sub8 local12 = (Class8_Sub8) Static116.aClass112_6.method2553(); local12 != null; local12 = (Class8_Sub8) Static116.aClass112_6.method2550()) {
			if (Static131.anInt2821 >= local12.anInt7110) {
				local12.method5780();
			} else {
				Static326.method4548((local12.anInt7112 << 7) + 64, arg1 >> 1, (local12.anInt7116 << 7) + 64, arg3 >> 1, local12.anInt7108 * 2, local12.anInt7114);
				Static114.aClass116_1.method4821(local12.anInt7113 | 0xFF000000, local12.aString63, 0, arg2 + Static283.anIntArray135[1], Static283.anIntArray135[0] + arg0);
			}
		}
	}
}
