import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!le", name = "q", descriptor = "I")
	public static int anInt4140;

	@OriginalMember(owner = "client!le", name = "r", descriptor = "I")
	public static int anInt4141;

	@OriginalMember(owner = "client!le", name = "s", descriptor = "Lclient!ns;")
	public static Class166 aClass166_162;

	@OriginalMember(owner = "client!le", name = "k", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_59 = new Class242(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!le", name = "o", descriptor = "I")
	public static int anInt4138 = -1;

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
	public static void method3136() {
		try {
			if (Static142.anInt2689 == 1) {
				@Pc(20) int local20 = Static67.aClass4_Sub18_Sub4_2.method5771();
				if (local20 > 0 && Static67.aClass4_Sub18_Sub4_2.method5774()) {
					local20 -= Static386.anInt6719;
					if (local20 < 0) {
						local20 = 0;
					}
					Static67.aClass4_Sub18_Sub4_2.method5758(local20);
				} else {
					Static67.aClass4_Sub18_Sub4_2.method5765();
					Static67.aClass4_Sub18_Sub4_2.method5756();
					Static22.aClass4_Sub7_3 = null;
					Static303.aClass65_1 = null;
					if (Static324.aClass166_264 == null) {
						Static142.anInt2689 = 0;
					} else {
						Static142.anInt2689 = 2;
					}
				}
			}
		} catch (@Pc(61) Exception local61) {
			local61.printStackTrace();
			Static67.aClass4_Sub18_Sub4_2.method5765();
			Static303.aClass65_1 = null;
			Static22.aClass4_Sub7_3 = null;
			Static142.anInt2689 = 0;
			Static324.aClass166_264 = null;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(CI)Z")
	public static boolean method3137(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(III)Lclient!jo;")
	public static Class6_Sub3 method3139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class53 local7 = Static40.aClass53ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass6_Sub3_2;
	}
}
