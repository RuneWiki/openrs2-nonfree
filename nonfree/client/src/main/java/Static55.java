import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!dl", name = "f", descriptor = "[[S")
	public static short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
	public static int anInt1174;

	@OriginalMember(owner = "client!dl", name = "i", descriptor = "Lclient!ah;")
	public static Class6 aClass6_2;

	@OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
	public static int anInt1176 = -1;

	@OriginalMember(owner = "client!dl", name = "k", descriptor = "Z")
	public static boolean aBoolean119 = false;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)[F")
	public static float[] method992() {
		@Pc(7) float local7 = Static65.method1140() + Static65.method1141();
		@Pc(9) int local9 = Static65.method1142();
		Static224.aFloatArray28[3] = 1.0F;
		@Pc(22) float local22 = (float) (local9 >> 16 & 0xFF) / 255.0F;
		@Pc(31) float local31 = (float) (local9 >> 8 & 0xFF) / 255.0F;
		@Pc(38) float local38 = (float) (local9 & 0xFF) / 255.0F;
		@Pc(40) float local40 = 0.58823526F;
		Static224.aFloatArray28[2] = local7 * Static128.aFloatArray21[2] * local38 * local40;
		Static224.aFloatArray28[0] = local22 * Static128.aFloatArray21[0] * local40 * local7;
		Static224.aFloatArray28[1] = local7 * local31 * Static128.aFloatArray21[1] * local40;
		return Static224.aFloatArray28;
	}
}
