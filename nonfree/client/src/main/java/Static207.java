import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!gw", name = "e", descriptor = "I")
	public static int anInt3630;

	@OriginalMember(owner = "client!gw", name = "h", descriptor = "I")
	public static int anInt3632;

	@OriginalMember(owner = "client!gw", name = "m", descriptor = "I")
	public static int anInt3639;

	@OriginalMember(owner = "client!gw", name = "f", descriptor = "I")
	public static int anInt3640;

	@OriginalMember(owner = "client!gw", name = "p", descriptor = "I")
	public static int anInt3641 = 0;

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "([BZB)V")
	public static void method3095(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		if (Static109.aClass14_Sub21_4 == null) {
			Static109.aClass14_Sub21_4 = new Class14_Sub21(20000);
		}
		Static109.aClass14_Sub21_4.method7743(0, arg0, arg0.length);
		if (!arg1) {
			return;
		}
		Static367.method5513(Static109.aClass14_Sub21_4.aByteArray99);
		Static545.aClass169_Sub1Array2 = new Class169_Sub1[Static396.anInt6953];
		@Pc(42) int local42 = 0;
		for (@Pc(44) int local44 = Static625.anInt11173; local44 <= Static377.anInt6656; local44++) {
			@Pc(52) Class169_Sub1 local52 = Static434.method6484(local44);
			if (local52 != null) {
				Static545.aClass169_Sub1Array2[local42++] = local52;
			}
		}
		Static604.aBoolean688 = false;
		Static598.aLong272 = Static26.method382();
		Static109.aClass14_Sub21_4 = null;
	}
}
