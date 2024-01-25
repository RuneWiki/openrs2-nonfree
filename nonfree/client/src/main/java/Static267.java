import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!kba", name = "l", descriptor = "[[Lclient!lk;")
	public static Class203[][] aClass203ArrayArray2;

	@OriginalMember(owner = "client!kba", name = "i", descriptor = "[I")
	public static final int[] anIntArray377 = new int[13];

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IIIZ)I")
	public static int method4355(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) Class3_Sub48 local10 = Static144.method2729(arg2, arg0);
		if (local10 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(31) int local31 = 0; local31 < local10.anIntArray675.length; local31++) {
				if (local10.anIntArray674[local31] == arg1) {
					local29 += local10.anIntArray675[local31];
				}
			}
			return local29;
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lclient!qh;I)V")
	public static void method4356(@OriginalArg(0) Class3_Sub11 arg0) {
		if (arg0.aByteArray36.length - arg0.anInt3520 < 1) {
			return;
		}
		@Pc(19) int local19 = arg0.method3118();
		if (local19 < 0 || local19 > 1 || arg0.aByteArray36.length - arg0.anInt3520 < 2) {
			return;
		}
		@Pc(49) int local49 = arg0.method3109();
		if (arg0.aByteArray36.length - arg0.anInt3520 < local49 * 6) {
			return;
		}
		for (@Pc(66) int local66 = 0; local66 < local49; local66++) {
			@Pc(72) int local72 = arg0.method3109();
			@Pc(76) int local76 = arg0.method3116();
			if (Static99.anIntArray166.length > local72 && Static376.aBooleanArray27[local72] && (Static361.aClass329_1.method6989(local72).aChar4 != '1' || local76 >= -1 && local76 <= 1)) {
				Static99.anIntArray166[local72] = local76;
			}
		}
	}
}
