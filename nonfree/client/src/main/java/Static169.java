import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!gr", name = "t", descriptor = "[Lclient!ha;")
	public static Class2[] aClass2Array5;

	@OriginalMember(owner = "client!gr", name = "u", descriptor = "[I")
	public static int[] anIntArray288;

	@OriginalMember(owner = "client!gr", name = "v", descriptor = "Z")
	public static boolean aBoolean207;

	@OriginalMember(owner = "client!gr", name = "l", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_154 = new Class296(55, -1);

	@OriginalMember(owner = "client!gr", name = "s", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_155 = new Class296(40, 2);

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!qa;B)V")
	public static void method2565(@OriginalArg(0) Class122 arg0) {
		arg0.N(0, 0, Static83.anInt1567, 350);
		arg0.f(0, 0, Static83.anInt1567, 350, Static241.anInt4829 << 24 | 0x332277, 1);
		@Pc(31) int local31 = 350 / Static25.anInt551;
		@Pc(38) int local38;
		if (Static158.anInt2904 > 0) {
			local38 = 342 - Static25.anInt551;
			@Pc(49) int local49 = local38 * local31 / (local31 + Static158.anInt2904 - 1);
			@Pc(51) int local51 = 4;
			if (Static158.anInt2904 > 1) {
				local51 = (Static158.anInt2904 - Static469.anInt9081 - 1) * (local38 - local49) / (Static158.anInt2904 - 1) + 4;
			}
			arg0.f(Static83.anInt1567 - 16, local51, 12, local49, Static241.anInt4829 << 24 | 0x332277, 2);
			for (@Pc(89) int local89 = Static469.anInt9081; local89 < Static469.anInt9081 + local31 && local89 < Static158.anInt2904; local89++) {
				@Pc(98) String[] local98 = Static254.method4297('\b', Static200.aStringArray19[local89]);
				@Pc(105) int local105 = (Static83.anInt1567 - 24) / local98.length;
				for (@Pc(107) int local107 = 0; local107 < local98.length; local107++) {
					@Pc(115) int local115 = local105 * local107 + 8;
					arg0.N(local115, 0, local115 + local105 - 8, 350);
					Static112.aClass67_3.method7498(-16777216, local98[local107], -1, 350 - (local89 - Static469.anInt9081) * Static25.anInt551 - Static365.anInt6459 - Static448.aClass232_7.anInt6464 - 2, local115);
				}
			}
		}
		arg0.N(0, 0, Static83.anInt1567, 350);
		arg0.method7259(350 - Static365.anInt6459, -1, 0, Static83.anInt1567);
		Static296.aClass67_9.method7498(-16777216, "--> " + Static69.aString12, -1, 349 - Static381.aClass232_6.anInt6464, 10);
		if (!Static297.aBoolean404) {
			return;
		}
		local38 = -1;
		if (Static436.anInt6850 % 30 > 15) {
			local38 = 16777215;
		}
		arg0.method7285(local38, 12, Static381.aClass232_6.method5432("--> " + Static69.aString12.substring(0, Static132.anInt2616)) + 10, -Static381.aClass232_6.anInt6464 + 350 + -11);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(II[S)[S")
	public static short[] method2566(@OriginalArg(0) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(11) short[] local11 = new short[arg0];
		Static551.method3493(arg1, 0, local11, 0, arg0);
		return local11;
	}
}
