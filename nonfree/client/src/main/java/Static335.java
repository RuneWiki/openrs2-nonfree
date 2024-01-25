import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!lfa", name = "d", descriptor = "I")
	public static int anInt6114;

	@OriginalMember(owner = "client!lfa", name = "j", descriptor = "J")
	public static long aLong157;

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ZLclient!fca;)Lclient!la;")
	public static Class218_Sub1 method5129(@OriginalArg(1) Class3_Sub17 arg0) {
		@Pc(12) Class218 local12 = Static546.method7556(arg0);
		@Pc(16) int local16 = arg0.method4864();
		return new Class218_Sub1(local12.anInt6025, local12.aClass92_8, local12.aClass65_12, local12.anInt6024, local12.anInt6023, local16);
	}
}
