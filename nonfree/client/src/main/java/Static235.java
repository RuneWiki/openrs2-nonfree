import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "Lclient!jo;")
	public static Class168 aClass168_59;

	@OriginalMember(owner = "client!iv", name = "i", descriptor = "[I")
	public static int[] anIntArray314;

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(III)Z")
	public static boolean method4124(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IILclient!se;II)V")
	public static void method4128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub43 arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg3 << 28 | arg1 << 14 | arg0);
		@Pc(22) Class6_Sub35 local22 = (Class6_Sub35) Static516.aClass305_37.method7447(local16);
		if (local22 == null) {
			local22 = new Class6_Sub35();
			Static516.aClass305_37.method7448(local16, local22);
			local22.aClass211_47.method5173(arg2);
			return;
		}
		@Pc(49) Class145 local49 = Static98.aClass203_1.method4899(arg2.anInt8493);
		@Pc(52) int local52 = local49.anInt4467;
		if (local49.anInt4481 == 1) {
			local52 *= arg2.anInt8487 + 1;
		}
		for (@Pc(69) Class6_Sub43 local69 = (Class6_Sub43) local22.aClass211_47.method5183(); local69 != null; local69 = (Class6_Sub43) local22.aClass211_47.method5177()) {
			local49 = Static98.aClass203_1.method4899(local69.anInt8493);
			@Pc(80) int local80 = local49.anInt4467;
			if (local49.anInt4481 == 1) {
				local80 *= local69.anInt8487 + 1;
			}
			if (local52 > local80) {
				Static446.method5093(arg2, local69);
				return;
			}
		}
		local22.aClass211_47.method5173(arg2);
	}
}
