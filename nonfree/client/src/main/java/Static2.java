import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
	public static int anInt21 = 0;

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "Lclient!tl;")
	public static final Class3_Sub42 aClass3_Sub42_1 = new Class3_Sub42(0, -1);

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "(I)V")
	public static void method52() {
		if (Static343.anInt5785 == -1) {
			return;
		}
		@Pc(12) int local12 = Static171.aClass50_1.method4993();
		@Pc(16) int local16 = Static171.aClass50_1.method4989();
		@Pc(21) Class3_Sub5 local21 = (Class3_Sub5) Static273.aClass193_38.method4519();
		if (local21 != null) {
			local12 = local21.method5408();
			local16 = local21.method5406();
		}
		Static420.method5753(Static166.anInt3014, 0, 0, Static310.anInt5307, local12, local16, Static343.anInt5785, 0, 0);
		if (Static381.aClass82_24 != null) {
			Static332.method4598(local12, local16);
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)V")
	public static void method53(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static396.anInt6600 == 1) {
			Static287.method5413(Static133.aClass3_Sub38_1, arg1, arg0);
		} else if (Static396.anInt6600 == 2) {
			Static123.method1959(arg0, arg1);
		}
		Static396.anInt6600 = 0;
		Static133.aClass3_Sub38_1 = null;
	}
}
