import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!da", name = "j", descriptor = "I")
	public static int anInt10012;

	@OriginalMember(owner = "client!da", name = "k", descriptor = "[I")
	public static final int[] anIntArray562 = new int[1000];

	@OriginalMember(owner = "client!da", name = "l", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray11 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B)Z")
	public static boolean method7664() {
		try {
			@Pc(7) Class141 local7 = new Class141();
			@Pc(18) byte[] local18 = local7.method3144(Static378.aByteArray70);
			Static515.method3255(local18);
			return true;
		} catch (@Pc(25) Exception local25) {
			return false;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIII)V")
	public static void method7678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		Static458.anInt8765 = arg3;
		Static68.anInt1813 = arg0;
		Static191.anInt3980 = arg2;
		Static533.anInt9769 = arg4;
		Static341.anInt6582 = arg1;
		if (Static458.anInt8765 >= 100) {
			@Pc(34) int local34 = Static191.anInt3980 * 512 + 256;
			@Pc(40) int local40 = Static533.anInt9769 * 512 + 256;
			@Pc(49) int local49 = Static461.method6782(local40, Static352.anInt6764, local34) - Static341.anInt6582;
			@Pc(53) int local53 = local34 - Static534.anInt9775;
			@Pc(58) int local58 = local49 - Static139.anInt3067;
			@Pc(63) int local63 = local40 - Static114.anInt2613;
			@Pc(74) int local74 = (int) Math.sqrt((double) (local63 * local63 + local53 * local53));
			Static233.anInt4905 = (int) (Math.atan2((double) local58, (double) local74) * 2607.5945876176133D) & 0x3FFF;
			Static353.anInt6831 = (int) (-2607.5945876176133D * Math.atan2((double) local53, (double) local63)) & 0x3FFF;
			Static470.anInt8934 = 0;
			if (Static233.anInt4905 < 1024) {
				Static233.anInt4905 = 1024;
			}
			if (Static233.anInt4905 > 3072) {
				Static233.anInt4905 = 3072;
			}
		}
		Static300.anInt6053 = 2;
		Static453.anInt8613 = -1;
		Static587.anInt10508 = -1;
	}
}
