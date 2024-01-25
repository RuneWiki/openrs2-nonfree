import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static455 {

	@OriginalMember(owner = "client!wt", name = "y", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_181 = new Class119(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

	@OriginalMember(owner = "client!wt", name = "E", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_257 = new Class103(35, -1);

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Z)V")
	public static void method5941() {
		Static239.anInt5812 = 0;
		@Pc(17) int local17 = Static199.anInt3480 + (Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5518 >> 7);
		@Pc(24) int local24 = Static164.anInt2731 + (Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5514 >> 7);
		if (local17 >= 3053 && local17 <= 3156 && local24 >= 3056 && local24 <= 3136) {
			Static239.anInt5812 = 1;
		}
		if (local17 >= 3072 && local17 <= 3118 && local24 >= 9492 && local24 <= 9535) {
			Static239.anInt5812 = 1;
		}
		if (Static239.anInt5812 == 1 && local17 >= 3139 && local17 <= 3199 && local24 >= 3008 && local24 <= 3062) {
			Static239.anInt5812 = 0;
		}
	}
}
