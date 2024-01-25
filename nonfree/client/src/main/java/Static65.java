import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!bw", name = "z", descriptor = "[S")
	public static short[] aShortArray23;

	@OriginalMember(owner = "client!bw", name = "v", descriptor = "I")
	public static int anInt1025;

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(ZZZLclient!tv;)V")
	public static void method813(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class3_Sub52 arg2) {
		@Pc(15) int local15 = arg2.anInt10202;
		@Pc(19) int local19 = (int) arg2.aLong382;
		arg2.method9446();
		if (arg0) {
			Static47.method637(local15);
		}
		Static248.method3764(local15);
		@Pc(36) Class20 local36 = Static118.method2045(local19);
		if (local36 != null) {
			Static391.method5905(local36);
		}
		Static672.method8911();
		if (!arg1 && Static633.anInt3426 != -1) {
			Static49.method650(1, Static633.anInt3426);
		}
		@Pc(63) Class346 local63 = new Class346(Static170.aClass136_19);
		for (@Pc(68) Class3_Sub52 local68 = (Class3_Sub52) local63.method8213(); local68 != null; local68 = (Class3_Sub52) local63.method8215()) {
			if (!local68.method9443()) {
				local68 = (Class3_Sub52) local63.method8213();
				if (local68 == null) {
					return;
				}
			}
			if (local68.anInt10201 == 3) {
				@Pc(93) int local93 = (int) local68.aLong382;
				if (local15 == local93 >>> 16) {
					method813(true, arg1, local68);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(ZIIIII)V")
	public static void method815(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) long local15 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg3);
		@Pc(21) Class3_Sub51 local21 = (Class3_Sub51) Static238.aClass136_22.method3503(local15);
		if (local21 == null) {
			local21 = new Class3_Sub51();
			Static238.aClass136_22.method3508(local15, local21);
		}
		if (local21.anIntArray577.length <= arg1) {
			@Pc(47) int[] local47 = new int[arg1 + 1];
			@Pc(52) int[] local52 = new int[arg1 + 1];
			for (@Pc(54) int local54 = 0; local54 < local21.anIntArray577.length; local54++) {
				local47[local54] = local21.anIntArray577[local54];
				local52[local54] = local21.anIntArray576[local54];
			}
			for (@Pc(82) int local82 = local21.anIntArray577.length; local82 < arg1; local82++) {
				local47[local82] = -1;
				local52[local82] = 0;
			}
			local21.anIntArray576 = local52;
			local21.anIntArray577 = local47;
		}
		local21.anIntArray577[arg1] = arg4;
		local21.anIntArray576[arg1] = arg2;
	}
}
