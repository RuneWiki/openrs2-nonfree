import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "[Lclient!fc;")
	public static Class29[] aClass29Array9;

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
	public static int anInt4027;

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
	public static int anInt4028;

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1157 = Static181.method2795("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1158 = Static181.method2795("<col=c0ff00>");

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1159 = Static181.method2795("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
	public static final int anInt4029 = 5063219;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
	public static void method3084() {
		while (true) {
			@Pc(10) Class19 local10 = Static96.aClass19_11;
			@Pc(19) Class2_Sub17 local19;
			synchronized (Static96.aClass19_11) {
				local19 = (Class2_Sub17) Static66.aClass19_5.method679();
			}
			if (local19 == null) {
				return;
			}
			local19.aClass28_Sub1_17.method882((int) local19.aLong149, local19.aClass8_3, local19.aByteArray24, false);
		}
	}
}
