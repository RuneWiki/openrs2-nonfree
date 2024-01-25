import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!bp", name = "w", descriptor = "I")
	public static int anInt749;

	@OriginalMember(owner = "client!bp", name = "ob", descriptor = "[I")
	public static final int[] anIntArray55 = new int[13];

	@OriginalMember(owner = "client!bp", name = "yb", descriptor = "I")
	public static int anInt759 = 0;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IBIIZI)V")
	public static void method841(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(22) long local22 = (long) ((arg3 ? Integer.MIN_VALUE : 0) | arg4);
		@Pc(28) Class5_Sub31 local28 = (Class5_Sub31) Static492.aClass306_35.method6943(local22);
		if (local28 == null) {
			local28 = new Class5_Sub31();
			Static492.aClass306_35.method6944(local28, local22, -12002);
		}
		if (arg1 >= local28.anIntArray328.length) {
			@Pc(53) int[] local53 = new int[arg1 + 1];
			@Pc(58) int[] local58 = new int[arg1 + 1];
			for (@Pc(60) int local60 = 0; local60 < local28.anIntArray328.length; local60++) {
				local53[local60] = local28.anIntArray328[local60];
				local58[local60] = local28.anIntArray327[local60];
			}
			for (@Pc(88) int local88 = local28.anIntArray328.length; local88 < arg1; local88++) {
				local53[local88] = -1;
				local58[local88] = 0;
			}
			local28.anIntArray328 = local53;
			local28.anIntArray327 = local58;
		}
		local28.anIntArray328[arg1] = arg2;
		local28.anIntArray327[arg1] = arg0;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method848(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(18) int local18 = 0; local18 < local8; local18++) {
			local10 = (local10 << 5) + arg0.charAt(local18) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "(B)V")
	public static void method853() {
		@Pc(9) int[] local9 = new int[Static82.aClass134_1.anInt3482];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static82.aClass134_1.anInt3482; local13++) {
			@Pc(20) Class246 local20 = Static82.aClass134_1.method3191(local13);
			if (local20.anInt6495 >= 0 || local20.anInt6469 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static557.anIntArray499 = new int[local11];
		for (@Pc(51) int local51 = 0; local51 < local11; local51++) {
			Static557.anIntArray499[local51] = local9[local51];
		}
	}
}
