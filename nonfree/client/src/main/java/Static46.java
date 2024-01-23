import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
	public static int anInt911;

	@OriginalMember(owner = "client!dd", name = "p", descriptor = "[I")
	public static int[] anIntArray120;

	@OriginalMember(owner = "client!dd", name = "t", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
	public static int anInt916;

	@OriginalMember(owner = "client!dd", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString28 = "Loading sprites - ";

	@OriginalMember(owner = "client!dd", name = "v", descriptor = "Lclient!dh;")
	public static Class33 aClass33_8 = new Class33(5);

	@OriginalMember(owner = "client!dd", name = "x", descriptor = "[I")
	public static int[] anIntArray121 = new int[4096];

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V")
	public static void method724() {
		aByteArrayArrayArray2 = null;
		anIntArray120 = null;
		aString28 = null;
		Class32_Sub1_Sub1.anIntArray119 = null;
		aClass33_8 = null;
		anIntArray121 = null;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)[F")
	public static float[] method725() {
		@Pc(7) float local7 = Static291.method4315() + Static291.method4314();
		@Pc(9) int local9 = Static291.method4318();
		@Pc(18) float local18 = (float) (local9 >> 8 & 0xFF) / 255.0F;
		@Pc(25) float local25 = (float) (local9 & 0xFF) / 255.0F;
		Static191.aFloatArray29[3] = 1.0F;
		@Pc(31) float local31 = 0.58823526F;
		Static191.aFloatArray29[1] = local31 * Static270.aFloatArray30[1] * local18 * local7;
		Static191.aFloatArray29[2] = Static270.aFloatArray30[2] * local25 * local31 * local7;
		@Pc(64) float local64 = (float) (local9 >> 16 & 0xFF) / 255.0F;
		Static191.aFloatArray29[0] = Static270.aFloatArray30[0] * local64 * local31 * local7;
		return Static191.aFloatArray29;
	}
}
