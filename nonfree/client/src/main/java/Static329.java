import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!pu", name = "q", descriptor = "[I")
	public static int[] anIntArray346;

	@OriginalMember(owner = "client!pu", name = "u", descriptor = "Lclient!jf;")
	public static Class118 aClass118_3;

	@OriginalMember(owner = "client!pu", name = "x", descriptor = "I")
	public static int anInt5518;

	@OriginalMember(owner = "client!pu", name = "r", descriptor = "Lclient!of;")
	public static final Class174 aClass174_158 = new Class174("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(II)V")
	public static void method4565(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = Static172.anInt3107 - Static457.anInt7713;
		if (local12 >= 100) {
			Static27.anInt490 = 1;
			return;
		}
		@Pc(23) int local23 = (int) Static275.aFloat61;
		if (local23 < Static286.anInt2876 >> 8) {
			local23 = Static286.anInt2876 >> 8;
		}
		if (Static408.aBooleanArray26[4] && local23 < Static342.anIntArray353[4] + 128) {
			local23 = Static342.anIntArray353[4] + 128;
		}
		@Pc(56) int local56 = (int) Static19.aFloat6 + Static310.anInt5306 & 0x3FFF;
		Static166.method2551(local23, (local23 >> 3) * 3 + 600 << 0, Static32.anInt603, local56, Static181.method4212(Static276.anInt4606, Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7557, Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7560) - 50, Static43.anInt5650, arg0);
		@Pc(102) float local102 = 1.0F - (float) ((100 - local12) * (100 - local12) * (100 - local12)) / 1000000.0F;
		Static419.anInt7092 = (int) ((float) Static455.anInt7684 + (float) (Static419.anInt7092 - Static455.anInt7684) * local102);
		Static266.anInt4433 = (int) ((float) Static46.anInt820 + (float) (Static266.anInt4433 - Static46.anInt820) * local102);
		Static410.anInt6946 = (int) ((float) (Static410.anInt6946 - Static275.anInt4601) * local102 + (float) Static275.anInt4601);
		Static152.anInt7561 = (int) ((float) Static154.anInt2804 + (float) (Static152.anInt7561 - Static154.anInt2804) * local102);
		@Pc(154) int local154 = Static372.anInt6317 - Static124.anInt2277;
		if (local154 > 8192) {
			local154 -= 16384;
		} else if (local154 < -8192) {
			local154 += 16384;
		}
		Static372.anInt6317 = (int) ((float) Static124.anInt2277 + (float) local154 * local102);
		Static372.anInt6317 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!pu", name = "c", descriptor = "(I)V")
	public static void method4566() {
		for (@Pc(8) int local8 = 0; local8 < Static360.aByteArrayArrayArray16.length; local8++) {
			for (@Pc(12) int local12 = 0; local12 < Static360.aByteArrayArrayArray16[0].length; local12++) {
				for (@Pc(16) int local16 = 0; local16 < Static360.aByteArrayArrayArray16[0][0].length; local16++) {
					Static360.aByteArrayArrayArray16[local8][local12][local16] = 0;
				}
			}
		}
	}
}
