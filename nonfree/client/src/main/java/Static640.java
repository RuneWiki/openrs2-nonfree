import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static640 {

	@OriginalMember(owner = "client!vca", name = "u", descriptor = "I")
	public static final int anInt9956 = 1408;

	@OriginalMember(owner = "client!vca", name = "j", descriptor = "Z")
	public static boolean aBoolean734 = false;

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "(Z)V")
	public static void method8639() {
		Static188.anInt3787 = 0;
		Static6.anInt60 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static37.anInt497; local18++) {
			@Pc(24) int local24 = Static585.anInt9330 * local18;
			for (@Pc(26) int local26 = 0; local26 < Static585.anInt9330; local26++) {
				@Pc(32) int local32 = local24 + local26;
				Static25.anInterface24Array1[local32].method8829(Static662.anInt10244 * local26, Static682.anInt10442 * local18, Static662.anInt10244, Static682.anInt10442, true);
			}
		}
	}
}
