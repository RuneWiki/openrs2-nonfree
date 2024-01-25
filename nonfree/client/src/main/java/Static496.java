import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static496 {

	@OriginalMember(owner = "client!qw", name = "n", descriptor = "I")
	public static int anInt8306;

	@OriginalMember(owner = "client!qw", name = "q", descriptor = "Lclient!wm;")
	public static Class390 aClass390_96;

	@OriginalMember(owner = "client!qw", name = "r", descriptor = "I")
	public static int anInt8309;

	@OriginalMember(owner = "client!qw", name = "m", descriptor = "I")
	public static int anInt8305 = 100;

	@OriginalMember(owner = "client!qw", name = "o", descriptor = "I")
	public static int anInt8307 = 0;

	@OriginalMember(owner = "client!qw", name = "t", descriptor = "Z")
	public static boolean aBoolean706 = false;

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(BZI)V")
	public static void method7109(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg0) {
			@Pc(18) Class5_Sub21 local18 = Static64.method905(Static263.aClass49_1, Static357.aClass305_54);
			local18.aClass5_Sub41_Sub2_1.method7848(arg1);
			Static495.method7092(local18);
		} else {
			Static652.method8744(Static40.aClass394_17, arg1, -1);
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "([II)Ljava/lang/String;")
	public static String method7110(@OriginalArg(0) int[] arg0) {
		@Pc(7) StringBuffer local7 = new StringBuffer();
		@Pc(9) int local9 = Static404.anInt7172;
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(19) Class208 local19 = Static62.aClass336_1.method7773(arg0[local11]);
			if (local19.anInt6172 != -1) {
				@Pc(32) Class50 local32 = (Class50) Static486.aClass340_48.method7999((long) local19.anInt6172);
				if (local32 == null) {
					@Pc(40) Class369 local40 = Static689.method8541(Static257.aClass390_60, local19.anInt6172, 0);
					if (local40 != null) {
						local32 = Static208.aClass65_7.method6898(local40, true);
						Static486.aClass340_48.method7986((long) local19.anInt6172, local32);
					}
				}
				if (local32 != null) {
					Static364.aClass50Array8[local9] = local32;
					local7.append(" <img=").append(local9).append(">");
					local9++;
				}
			}
		}
		return local7.toString();
	}
}
