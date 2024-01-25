import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static526 {

	@OriginalMember(owner = "client!so", name = "d", descriptor = "[Lclient!af;")
	public static Class10[] aClass10Array3;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "Lclient!nga;")
	public static final Class233 aClass233_52 = new Class233(50);

	@OriginalMember(owner = "client!so", name = "i", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_85 = new Class269(31, 7);

	@OriginalMember(owner = "client!so", name = "j", descriptor = "I")
	public static int anInt8766 = -1;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(III)V")
	public static void method7336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static440.aClass217ArrayArrayArray3[0][arg1][arg2] != null && Static440.aClass217ArrayArrayArray3[0][arg1][arg2].aClass217_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static440.aClass217ArrayArrayArray3[local22][arg1][arg2] == null) {
				@Pc(44) Class217 local44 = Static440.aClass217ArrayArrayArray3[local22][arg1][arg2] = new Class217(local22);
				if (local20) {
					local44.aByte91++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!af;II)Z")
	public static boolean method7338(@OriginalArg(0) Class10 arg0, @OriginalArg(2) int arg1) {
		Static303.aClass6_22.method6702(arg0.anIntArray25[arg1], arg0.anIntArray26[arg1], arg0.anIntArray24[arg1], Static164.anIntArray260);
		@Pc(22) int local22 = Static164.anIntArray260[2];
		if (local22 < 50) {
			return false;
		} else {
			arg0.aShortArray4[arg1] = (short) (Static509.anInt8574 * Static164.anIntArray260[0] / local22 + Static519.anInt8686);
			arg0.aShortArray3[arg1] = (short) (Static164.anIntArray260[1] * Static48.anInt1059 / local22 + Static404.anInt889);
			arg0.aShortArray2[arg1] = (short) local22;
			return true;
		}
	}
}
