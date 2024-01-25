import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!jaa", name = "c", descriptor = "Lclient!qn;")
	public static Class291 aClass291_3;

	@OriginalMember(owner = "client!jaa", name = "d", descriptor = "Lclient!fs;")
	public static Class110 aClass110_1;

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(B)V")
	public static void method4357() {
		if (Static654.aClass312ArrayArray1 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < Static654.aClass312ArrayArray1.length; local13++) {
			for (@Pc(17) int local17 = 0; local17 < Static654.aClass312ArrayArray1[local13].length; local17++) {
				Static654.aClass312ArrayArray1[local13][local17] = Static245.aClass312_1;
			}
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ZIIIIII)V")
	public static void method4359(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg0 ? Static24.aClass3_Sub22_4.aClass6_Sub28_5.method8690() : Static24.aClass3_Sub22_4.aClass6_Sub28_1.method8690()) != 0 && arg2 != 0 && Static199.anInt3915 < 50 && arg3 != -1) {
			Static240.aClass182Array1[Static199.anInt3915++] = new Class182((byte) (arg0 ? 3 : 2), arg3, arg2, arg1, arg4, 0, arg5, (Class28_Sub1) null);
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "([BII)[B")
	public static byte[] method4360(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) byte[] local6 = new byte[arg1];
		Static684.method5324(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
