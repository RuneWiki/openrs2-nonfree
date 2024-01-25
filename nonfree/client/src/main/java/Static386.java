import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!pr", name = "j", descriptor = "Lclient!gp;")
	public static Class117 aClass117_96;

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray18 = new String[200];

	@OriginalMember(owner = "client!pr", name = "h", descriptor = "[Z")
	public static final boolean[] aBooleanArray15 = new boolean[100];

	@OriginalMember(owner = "client!pr", name = "i", descriptor = "[I")
	public static final int[] anIntArray255 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!pr", name = "n", descriptor = "J")
	public static long aLong114 = 0L;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(III)Z")
	public static boolean method3038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIZIIIII)V")
	public static void method3041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg1 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(31) int local31 = Static537.aShort117 + (Static44.aShort15 - Static537.aShort117) * local7 / 100;
		@Pc(37) int local37 = local31 * arg5 >> 8;
		@Pc(44) int local44 = 16384 - arg6 & 0x3FFF;
		@Pc(51) int local51 = 16384 - arg2 & 0x3FFF;
		@Pc(53) int local53 = 0;
		@Pc(55) int local55 = 0;
		@Pc(57) int local57 = local37;
		if (local44 != 0) {
			local55 = Class5_Sub2_Sub16.anIntArray411[local44] * -local37 >> 15;
			local57 = Class5_Sub2_Sub16.anIntArray410[local44] * local37 >> 15;
		}
		if (local51 != 0) {
			local53 = local57 * Class5_Sub2_Sub16.anIntArray411[local51] >> 15;
			local57 = Class5_Sub2_Sub16.anIntArray410[local51] * local57 >> 15;
		}
		Static141.anInt2910 = arg2;
		Static530.anInt8939 = 0;
		Static364.anInt6817 = arg0 - local57;
		Static182.anInt3520 = arg3 - local55;
		Static180.anInt3500 = arg6;
		Static367.anInt6861 = arg4 - local53;
	}
}
