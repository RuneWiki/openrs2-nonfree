import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!gr", name = "l", descriptor = "[I")
	public static int[] anIntArray248;

	@OriginalMember(owner = "client!gr", name = "q", descriptor = "Lclient!sw;")
	public static Class322 aClass322_2;

	@OriginalMember(owner = "client!gr", name = "s", descriptor = "Z")
	public static boolean aBoolean290 = false;

	@OriginalMember(owner = "client!gr", name = "v", descriptor = "I")
	public static int anInt3866 = 0;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IBJI)V")
	public static void method3317(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18 = (int) arg1 >> 14 & 0x1F;
		@Pc(25) int local25 = (int) arg1 >> 20 & 0x3;
		@Pc(32) int local32 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
		if (local18 != 10 && local18 != 11 && local18 != 22) {
			Static250.method4182(0, 0, local25, local18, true, arg2, 0, arg0);
			return;
		}
		@Pc(62) Class5 local62 = Static79.aClass304_2.method6956(local32);
		@Pc(75) int local75;
		@Pc(72) int local72;
		if (local25 == 0 || local25 == 2) {
			local75 = local62.anInt67;
			local72 = local62.anInt72;
		} else {
			local72 = local62.anInt67;
			local75 = local62.anInt72;
		}
		@Pc(85) int local85 = local62.anInt74;
		if (local25 != 0) {
			local85 = (local85 << local25 & 0xF) + (local85 >> 4 - local25);
		}
		Static250.method4182(local85, local75, 0, 0, true, arg2, local72, arg0);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZI)Z")
	public static boolean method3319(@OriginalArg(1) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZIIIII)V")
	public static void method3320(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) long local14 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg3);
		@Pc(24) Class2_Sub43 local24 = (Class2_Sub43) Static55.aClass323_5.method7484(local14);
		if (local24 == null) {
			local24 = new Class2_Sub43();
			Static55.aClass323_5.method7477(local24, local14);
		}
		if (arg2 >= local24.anIntArray671.length) {
			@Pc(47) int[] local47 = new int[arg2 + 1];
			@Pc(52) int[] local52 = new int[arg2 + 1];
			for (@Pc(54) int local54 = 0; local54 < local24.anIntArray671.length; local54++) {
				local47[local54] = local24.anIntArray671[local54];
				local52[local54] = local24.anIntArray672[local54];
			}
			for (@Pc(80) int local80 = local24.anIntArray671.length; local80 < arg2; local80++) {
				local47[local80] = -1;
				local52[local80] = 0;
			}
			local24.anIntArray671 = local47;
			local24.anIntArray672 = local52;
		}
		local24.anIntArray671[arg2] = arg1;
		local24.anIntArray672[arg2] = arg4;
	}
}
