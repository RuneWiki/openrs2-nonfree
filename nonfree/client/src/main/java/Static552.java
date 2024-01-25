import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static552 {

	@OriginalMember(owner = "client!to", name = "l", descriptor = "I")
	public static int anInt9164;

	@OriginalMember(owner = "client!to", name = "n", descriptor = "Lclient!gw;")
	public static final Class136 aClass136_63 = new Class136(50);

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V")
	public static void method7863() {
		for (@Pc(1) int local1 = 0; local1 < Static596.anInt9702; local1++) {
			@Pc(9) int local9 = Static43.anIntArray50[local1];
			@Pc(16) Class3_Sub43 local16 = (Class3_Sub43) Static545.aClass25_40.method426((long) local9);
			if (local16 != null) {
				@Pc(21) Class9_Sub2_Sub1_Sub2_Sub2 local21 = local16.aClass9_Sub2_Sub1_Sub2_Sub2_2;
				Static378.method5964(local21.aClass309_1.anInt8833, local21);
			}
		}
	}
}
