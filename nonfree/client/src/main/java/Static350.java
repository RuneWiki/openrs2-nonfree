import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "([BIILclient!uo;ZB[Lclient!g;)V")
	public static void method5600(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class32 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) Class71[] arg5) {
		@Pc(14) Class1_Sub8 local14 = new Class1_Sub8(arg0);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(20) int local20 = local14.method4530();
			if (local20 == 0) {
				return;
			}
			local16 += local20;
			@Pc(28) int local28 = 0;
			while (true) {
				@Pc(32) int local32 = local14.method4528();
				if (local32 == 0) {
					break;
				}
				local28 += local32 - 1;
				@Pc(44) int local44 = local28 & 0x3F;
				@Pc(50) int local50 = local28 >> 6 & 0x3F;
				@Pc(54) int local54 = local28 >> 12;
				@Pc(58) int local58 = local14.method4532();
				@Pc(62) int local62 = local58 >> 2;
				@Pc(66) int local66 = local58 & 0x3;
				@Pc(70) int local70 = arg2 + local50;
				@Pc(74) int local74 = arg1 + local44;
				if (local70 > 0 && local74 > 0 && local70 < Static233.anInt5573 - 1 && Static134.anInt2971 - 1 > local74) {
					@Pc(94) Class71 local94 = null;
					if (!arg4) {
						@Pc(98) int local98 = local54;
						if ((Static200.aByteArrayArrayArray8[1][local70][local74] & 0x2) == 2) {
							local98 = local54 - 1;
						}
						if (local98 >= 0) {
							local94 = arg5[local98];
						}
					}
					Static71.method3160(-1, arg3, local54, local54, true, local66, local16, local62, local70, arg4, local74, local94);
				}
			}
		}
	}
}
