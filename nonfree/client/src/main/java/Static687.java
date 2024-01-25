import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static687 {

	@OriginalMember(owner = "client!vk", name = "q", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable7 = new Hashtable();

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILclient!aa;IBLclient!kw;Lclient!nt;II)V")
	public static void method9072(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class178 arg3, @OriginalArg(5) Class270 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == null) {
			return;
		}
		@Pc(20) int local20;
		if (Static262.anInt4081 == 4) {
			local20 = (int) Static382.aFloat40 & 0x3FFF;
		} else {
			local20 = (int) Static382.aFloat40 + Static194.anInt3310 & 0x3FFF;
		}
		@Pc(39) int local39 = Math.max(arg4.anInt7015 / 2, arg4.anInt7045 / 2) + 10;
		@Pc(47) int local47 = arg6 * arg6 + arg0 * arg0;
		if (local47 > local39 * local39) {
			return;
		}
		@Pc(58) int local58 = Class3_Sub7_Sub17_Sub1.anIntArray549[local20];
		@Pc(62) int local62 = Class3_Sub7_Sub17_Sub1.anIntArray548[local20];
		if (Static262.anInt4081 != 4) {
			local62 = local62 * 256 / (Static402.anInt6239 + 256);
			local58 = local58 * 256 / (Static402.anInt6239 + 256);
		}
		@Pc(93) int local93 = arg0 * local62 + arg6 * local58 >> 14;
		@Pc(104) int local104 = local62 * arg6 - local58 * arg0 >> 14;
		arg3.method7633(arg4.anInt7015 / 2 + arg2 + local93 - arg3.method7627() / 2, arg4.anInt7045 / 2 + arg5 - (local104 + arg3.method7632() / 2), arg1, arg2, arg5);
	}
}
