import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static526 {

	@OriginalMember(owner = "client!uba", name = "b", descriptor = "I")
	public static int anInt8323;

	@OriginalMember(owner = "client!uba", name = "e", descriptor = "I")
	public static int anInt8326;

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(B)V")
	public static void method6985() {
		Static245.aClass10_22.method263();
		Static19.aClass10_3.method263();
		Static338.aClass10_34.method263();
		Static392.aClass10_42.method263();
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(ILclient!qh;)Lclient!mfa;")
	public static Class3_Sub1 method6986(@OriginalArg(1) Class3_Sub11 arg0) {
		arg0.method3118();
		@Pc(13) int local13 = arg0.method3118();
		@Pc(17) Class3_Sub1 local17 = Static497.method6707(local13);
		local17.anInt9360 = arg0.method3118();
		@Pc(26) int local26 = arg0.method3118();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(34) int local34 = arg0.method3118();
			local17.method7761(arg0, local34);
		}
		local17.method7763();
		return local17;
	}
}
