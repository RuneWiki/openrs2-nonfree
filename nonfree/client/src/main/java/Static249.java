import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!mm", name = "u", descriptor = "[I")
	public static int[] anIntArray573 = new int[2];

	@OriginalMember(owner = "client!mm", name = "z", descriptor = "Z")
	public static boolean aBoolean536 = false;

	@OriginalMember(owner = "client!mm", name = "A", descriptor = "I")
	public static int anInt7641 = 0;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "([IIIII)V")
	public static void method6044(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg3--;
		@Pc(7) int local7 = arg2 - 1;
		@Pc(11) int local11 = local7 - 7;
		while (arg3 < local11) {
			@Pc(15) int local15 = arg3 + 1;
			arg0[local15] = arg1;
			@Pc(20) int local20 = local15 + 1;
			arg0[local20] = arg1;
			@Pc(25) int local25 = local20 + 1;
			arg0[local25] = arg1;
			@Pc(30) int local30 = local25 + 1;
			arg0[local30] = arg1;
			@Pc(35) int local35 = local30 + 1;
			arg0[local35] = arg1;
			@Pc(40) int local40 = local35 + 1;
			arg0[local40] = arg1;
			@Pc(45) int local45 = local40 + 1;
			arg0[local45] = arg1;
			arg3 = local45 + 1;
			arg0[arg3] = arg1;
		}
		while (local7 > arg3) {
			arg3++;
			arg0[arg3] = arg1;
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!fh;B)V")
	public static void method6048(@OriginalArg(0) Class4_Sub9 arg0) {
		if (arg0.aByteArray81.length - arg0.anInt6207 < 1) {
			return;
		}
		@Pc(19) int local19 = arg0.method5007();
		if (local19 < 0 || local19 > 1 || arg0.aByteArray81.length - arg0.anInt6207 < 2) {
			return;
		}
		@Pc(44) int local44 = arg0.method5028();
		if (local44 * 6 > arg0.aByteArray81.length - arg0.anInt6207) {
			return;
		}
		for (@Pc(58) int local58 = 0; local58 < local44; local58++) {
			@Pc(69) int local69 = arg0.method5028();
			@Pc(73) int local73 = arg0.method4997();
			if (Static83.anIntArray416.length > local69 && Static269.aBooleanArray22[local69] && (Static74.aClass204_1.method4074(local69).aChar2 != '1' || local73 >= -1 && local73 <= 1)) {
				Static83.anIntArray416[local69] = local73;
			}
		}
	}
}
