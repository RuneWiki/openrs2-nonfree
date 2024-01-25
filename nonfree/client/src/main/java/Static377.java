import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!ml", name = "kf", descriptor = "Lclient!lga;")
	public static Class223 aClass223_80;

	@OriginalMember(owner = "client!ml", name = "Tb", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_83 = new Class241(8, 4);

	@OriginalMember(owner = "client!ml", name = "re", descriptor = "I")
	public static int anInt6464 = 7000;

	@OriginalMember(owner = "client!ml", name = "lf", descriptor = "I")
	public static int anInt6468 = anInt6464;

	@OriginalMember(owner = "client!ml", name = "Lg", descriptor = "[I")
	public static final int[] anIntArray370 = new int[2];

	@OriginalMember(owner = "client!ml", name = "k", descriptor = "(I)[I")
	public static int[] method5762() {
		return new int[] { Static607.anInt9575, Static254.anInt4888, Static360.anInt6091 };
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(IIIII)V")
	public static void method5767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) float local16 = (float) Static627.anInt7272 / (float) Static627.anInt7266;
		@Pc(18) int local18 = arg0;
		@Pc(20) int local20 = arg1;
		if (local16 < 1.0F) {
			local20 = (int) ((float) arg0 * local16);
		} else {
			local18 = (int) ((float) arg1 / local16);
		}
		@Pc(47) int local47 = arg3 - (arg1 - local20) / 2;
		@Pc(56) int local56 = arg2 - (arg0 - local18) / 2;
		Static499.anInt8390 = -1;
		Static488.anInt8263 = Static627.anInt7272 - local47 * Static627.anInt7272 / local20;
		Static91.anInt1364 = local56 * Static627.anInt7266 / local18;
		Static51.anInt617 = -1;
		Static62.method784();
	}
}
