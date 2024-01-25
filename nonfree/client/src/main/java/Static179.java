import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!lg", name = "S", descriptor = "I")
	public static int anInt3825;

	@OriginalMember(owner = "client!lg", name = "r", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_195 = new Class159("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

	@OriginalMember(owner = "client!lg", name = "Q", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_196 = new Class159("glow3:", "leuchten3:", "brillant3:", "brilho3:");

	@OriginalMember(owner = "client!lg", name = "R", descriptor = "I")
	public static int anInt3824 = 0;

	@OriginalMember(owner = "client!lg", name = "T", descriptor = "[B")
	public static final byte[] aByteArray56 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZILclient!vq;[[IZ)V")
	public static void method3469(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class47 arg2, @OriginalArg(3) int[][] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			@Pc(28) int[][] local28;
			@Pc(30) int local30;
			@Pc(34) int local34;
			if (arg3 == null) {
				local28 = null;
			} else {
				local28 = new int[Static350.anInt6637 + 1][Static105.anInt2647 + 1];
				for (local30 = 0; local30 <= Static105.anInt2647; local30++) {
					for (local34 = 0; local34 <= Static350.anInt6637; local34++) {
						local28[local34][local30] = Static338.anIntArrayArrayArray40[local7][local34][local30] - arg3[local34][local30];
					}
				}
			}
			local30 = 0;
			local34 = 0;
			if (!arg0) {
				if (Static284.aBoolean418) {
					local34 = 8;
				}
				if (Static237.aBoolean480) {
					local30 = 2;
				}
				if (Static9.anInt216 != 0) {
					if (local7 == 0 || Static286.anInt6700 >= 96) {
						local34 |= 0x10;
					}
					local30 |= 0x1;
				}
			}
			if (Static237.aBoolean480) {
				local34 |= 0x7;
			}
			@Pc(128) Class60 local128 = arg2.method2690(Static350.anInt6637, Static105.anInt2647, Static338.anIntArrayArrayArray40[local7], local28, local30, local34);
			Static305.method5684(local7, local128);
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZI)V")
	public static void method3473(@OriginalArg(0) boolean arg0) {
		Static315.aBoolean453 = arg0;
		Static103.aBoolean185 = !Static76.method1750();
	}
}
