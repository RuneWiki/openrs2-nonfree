import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!qk", name = "G", descriptor = "I")
	public static int anInt4276;

	@OriginalMember(owner = "client!qk", name = "J", descriptor = "Ljava/util/Random;")
	public static Random aRandom1 = new Random();

	@OriginalMember(owner = "client!qk", name = "N", descriptor = "I")
	public static int anInt4282 = 0;

	@OriginalMember(owner = "client!qk", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString240 = "RuneScape is loading - please wait...";

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZI)V")
	public static void method3633() {
		Static48.aClass187_27.method4534(5);
		Static191.aClass187_100.method4534(5);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I[B)Lclient!fg;")
	public static Class1_Sub2_Sub6 method3634(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(24) Class1_Sub2_Sub6 local24;
		if (Static156.aBoolean211) {
			local24 = new Class1_Sub2_Sub6_Sub2(arg0, Static244.anIntArray389, Static254.anIntArray412, Static160.anIntArray267, Static235.anIntArray468, Static69.aByteArrayArray15);
		} else {
			local24 = new Class1_Sub2_Sub6_Sub1(arg0, Static244.anIntArray389, Static254.anIntArray412, Static160.anIntArray267, Static235.anIntArray468, Static69.aByteArrayArray15);
		}
		Static117.method2101();
		return local24;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(CI)Z")
	public static boolean method3635(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "(B)[F")
	public static float[] method3636() {
		@Pc(3) float local3 = Static283.method4359() + Static283.method4357();
		@Pc(9) int local9 = Static283.method4355();
		@Pc(18) float local18 = (float) (local9 >> 8 & 0xFF) / 255.0F;
		Static155.aFloatArray11[3] = 1.0F;
		@Pc(31) float local31 = (float) (local9 >> 16 & 0xFF) / 255.0F;
		@Pc(46) float local46 = (float) (local9 & 0xFF) / 255.0F;
		@Pc(48) float local48 = 0.58823526F;
		Static155.aFloatArray11[2] = local48 * local46 * Static239.aFloatArray14[2] * local3;
		Static155.aFloatArray11[1] = local3 * local18 * Static239.aFloatArray14[1] * local48;
		Static155.aFloatArray11[0] = local48 * local31 * Static239.aFloatArray14[0] * local3;
		return Static155.aFloatArray11;
	}
}
