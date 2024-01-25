import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static598 {

	@OriginalMember(owner = "client!uba", name = "Kb", descriptor = "Lclient!jda;")
	public static Class175 aClass175_2;

	@OriginalMember(owner = "client!uba", name = "Gb", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_145 = new Class171(117, -2);

	@OriginalMember(owner = "client!uba", name = "Jb", descriptor = "I")
	public static int anInt9806 = 0;

	@OriginalMember(owner = "client!uba", name = "Lb", descriptor = "Lclient!wv;")
	public static final Class393 aClass393_10 = new Class393();

	@OriginalMember(owner = "client!uba", name = "z", descriptor = "(I)V")
	public static void method7964() {
		@Pc(8) Class3_Sub6 local8 = (Class3_Sub6) Static388.aClass302_43.method6603();
		@Pc(21) boolean local21 = Static264.aClass265_8 != null || Static263.anInt2105 > 0;
		@Pc(25) int local25 = local8.method5324();
		@Pc(29) int local29 = local8.method5323();
		if (local21) {
			Static69.anInt9579 = 1;
		}
		if (local21) {
			Static536.aClass3_Sub5_Sub18_8 = Static562.aClass3_Sub5_Sub18_7;
		} else {
			Static351.method5103(Static562.aClass3_Sub5_Sub18_7, local25, local29);
		}
	}
}
