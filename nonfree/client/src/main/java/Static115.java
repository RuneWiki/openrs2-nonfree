import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
	public static int anInt2652;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIZIII)V")
	public static void method2336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) long local12 = (long) ((arg2 ? Integer.MIN_VALUE : 0) | arg4);
		@Pc(30) Class3_Sub29 local30 = (Class3_Sub29) Static426.aClass25_32.method946(local12);
		if (local30 == null) {
			local30 = new Class3_Sub29();
			Static426.aClass25_32.method945(local30, local12);
		}
		if (arg3 >= local30.anIntArray328.length) {
			@Pc(53) int[] local53 = new int[arg3 + 1];
			@Pc(58) int[] local58 = new int[arg3 + 1];
			for (@Pc(60) int local60 = 0; local60 < local30.anIntArray328.length; local60++) {
				local53[local60] = local30.anIntArray328[local60];
				local58[local60] = local30.anIntArray329[local60];
			}
			for (@Pc(89) int local89 = local30.anIntArray328.length; local89 < arg3; local89++) {
				local53[local89] = -1;
				local58[local89] = 0;
			}
			local30.anIntArray329 = local58;
			local30.anIntArray328 = local53;
		}
		local30.anIntArray328[arg3] = arg1;
		local30.anIntArray329[arg3] = arg0;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZIIIIIB)V")
	public static void method2337(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static428.anInt8266 = arg5;
		Static213.anInt4389 = arg2;
		Static258.anInt5538 = arg1;
		Static29.anInt855 = arg3;
		Static394.anInt7573 = arg4;
		if (arg0 && Static213.anInt4389 >= 100) {
			Static594.anInt10391 = Static29.anInt855 * 512 + 256;
			Static496.anInt9269 = Static428.anInt8266 * 512 + 256;
			Static360.anInt1771 = Static274.method4782(Static496.anInt9269, Static212.anInt4380, Static594.anInt10391) - Static258.anInt5538;
		}
		Static267.anInt5668 = 2;
	}
}
