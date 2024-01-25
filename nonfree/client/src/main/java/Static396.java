import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "Lclient!pja;")
	public static Class5_Sub1_Sub16 aClass5_Sub1_Sub16_3;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "Lclient!mk;")
	public static Class5_Sub1_Sub13 aClass5_Sub1_Sub13_2;

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "Lclient!gda;")
	public static Class126 aClass126_185;

	@OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
	public static int anInt6671;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
	public static void method5816() {
		Static365.aClass389_9 = Static4.aClass389_16;
		Static623.anInt9970 = -1;
		Static120.anInt1966 = 1;
		@Pc(11) String local11 = null;
		if (Static417.aByteArray79 != null) {
			@Pc(18) Class5_Sub36 local18 = new Class5_Sub36(Static417.aByteArray79);
			local11 = Static508.method7013(local18.method7304());
			Static446.aLong213 = local18.method7304();
		}
		if (local11 == null) {
			Static126.method1895(35);
		} else {
			Static357.method5231(true, "", false, local11);
		}
	}
}
