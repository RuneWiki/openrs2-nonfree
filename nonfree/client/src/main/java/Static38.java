import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bfa", name = "l", descriptor = "I")
	public static int anInt1411;

	@OriginalMember(owner = "client!bfa", name = "n", descriptor = "I")
	public static int anInt1413;

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IIZ)V")
	public static void method1336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = Static2.aClass213_9.method5831(Static536.aClass316_26.method7577(Static638.anInt10709));
		@Pc(65) int local65;
		@Pc(32) int local32;
		if (Static437.aBoolean633) {
			for (@Pc(20) Class6_Sub5_Sub11 local20 = (Class6_Sub5_Sub11) Static224.aClass231_5.method6055(); local20 != null; local20 = (Class6_Sub5_Sub11) Static224.aClass231_5.method6050()) {
				if (local20.anInt3423 == 1) {
					local32 = Static397.method6259((Class6_Sub5_Sub9) local20.aClass231_2.aClass6_Sub5_60.aClass6_Sub5_66);
				} else {
					local32 = Static408.method6421(local20);
				}
				if (local32 > local13) {
					local13 = local32;
				}
			}
			local13 += 8;
			local65 = Static223.anInt5025 * 16 + 21;
			Static30.anInt820 = Static223.anInt5025 * 16 + (Static319.aBoolean495 ? 26 : 22);
		} else {
			for (@Pc(82) Class6_Sub5_Sub9 local82 = (Class6_Sub5_Sub9) Static68.aClass163_14.method4966(); local82 != null; local82 = (Class6_Sub5_Sub9) Static68.aClass163_14.method4965()) {
				local32 = Static397.method6259(local82);
				if (local13 < local32) {
					local13 = local32;
				}
			}
			local13 += 8;
			Static30.anInt820 = Static611.anInt10324 * 16 + (Static319.aBoolean495 ? 26 : 22);
			local65 = Static611.anInt10324 * 16 + 21;
		}
		@Pc(128) int local128 = arg1 - local13 / 2;
		if (Static294.anInt6026 < local128 + local13) {
			local128 = Static294.anInt6026 - local13;
		}
		if (local128 < 0) {
			local128 = 0;
		}
		local32 = arg0;
		if (local65 + arg0 > Static277.anInt5899) {
			local32 = Static277.anInt5899 - local65;
		}
		Static76.anInt2536 = local128;
		if (local32 < 0) {
			local32 = 0;
		}
		Static189.anInt4113 = local32;
		Static199.aBoolean358 = true;
		Static498.anInt8705 = local13;
	}
}
