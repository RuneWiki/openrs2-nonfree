import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!js", name = "l", descriptor = "I")
	public static int anInt3235;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "[I")
	public static final int[] anIntArray642 = new int[32];

	@OriginalMember(owner = "client!js", name = "e", descriptor = "I")
	public static int anInt3229 = 0;

	@OriginalMember(owner = "client!js", name = "v", descriptor = "Lclient!cf;")
	public static final Class30 aClass30_19 = new Class30();

	@OriginalMember(owner = "client!js", name = "x", descriptor = "Z")
	public static boolean aBoolean245 = false;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IZZIILclient!qp;I)V")
	public static void method2965(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class202 arg4, @OriginalArg(6) int arg5) {
		if (Static3.anInt135 >= 50 || (arg4 == null || arg4.anIntArrayArray39 == null || arg4.anIntArrayArray39.length <= arg0 || arg4.anIntArrayArray39[arg0] == null)) {
			return;
		}
		@Pc(36) int local36 = arg4.anIntArrayArray39[arg0][0];
		@Pc(40) int local40 = local36 >> 8;
		@Pc(46) int local46 = local36 >> 5 & 0x7;
		@Pc(63) int local63;
		if (arg4.anIntArrayArray39[arg0].length > 1) {
			local63 = (int) ((double) arg4.anIntArrayArray39[arg0].length * Math.random());
			if (local63 > 0) {
				local40 = arg4.anIntArrayArray39[arg0][local63];
			}
		}
		@Pc(76) int local76 = local36 & 0x1F;
		if (local76 == 0) {
			if (arg1) {
				Static315.method4659(local40, 0, local46, 255);
			}
		} else if (Static330.anInt5659 != 0) {
			Static286.anIntArray982[Static3.anInt135] = local40;
			Static67.anIntArray273[Static3.anInt135] = local46;
			Static62.anIntArray267[Static3.anInt135] = 0;
			Static276.aClass130Array1[Static3.anInt135] = null;
			Static56.anIntArray228[Static3.anInt135] = 255;
			local63 = (arg3 - 64) / 128;
			@Pc(127) int local127 = (arg5 - 64) / 128;
			Static284.anIntArray971[Static3.anInt135] = local76 + (local127 << 8) + (local63 << 16) + (arg2 << 24);
			Static3.anInt135++;
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Z)V")
	public static void method2967() {
		Static216.method3597(Static201.aClass11_62);
		Static372.aClass2_Sub16_Sub2_4.method5358(Static162.method2888());
		Static372.aClass2_Sub16_Sub2_4.method5351(Static253.anInt4467);
		Static372.aClass2_Sub16_Sub2_4.method5351(Static362.anInt6102);
		Static372.aClass2_Sub16_Sub2_4.method5358(Static131.anInt2686);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(II)V")
	public static void method2975(@OriginalArg(1) int arg0) {
		@Pc(16) Class2_Sub10_Sub2 local16 = Static217.method3611(arg0, 12);
		local16.method859();
	}
}
