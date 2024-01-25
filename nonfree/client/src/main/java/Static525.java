import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static525 {

	@OriginalMember(owner = "client!rt", name = "q", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_158 = new Class44(51, -2);

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIFIIIIZ)[I")
	public static int[] method7546(@OriginalArg(2) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class14_Sub1_Sub3 local10 = new Class14_Sub1_Sub3();
		local10.anInt1425 = 35;
		local10.anInt1428 = 8;
		local10.anInt1424 = 8;
		local10.anInt1421 = 4;
		local10.aBoolean116 = true;
		local10.anInt1419 = (int) (arg0 * 4096.0F);
		local10.method8899();
		Static558.method7838(1, 2048);
		local10.method1229(0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lclient!ha;Z)V")
	public static void method7547(@OriginalArg(0) Class137 arg0) {
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		if (Static128.aBoolean202) {
			local11 = Static619.method8679();
			local13 = Static571.method8194();
		}
		arg0.KA(local11, local13, Static561.anInt9759 + local11, 350 - -local13);
		arg0.aa(local11, local13, Static561.anInt9759, 350, Static217.anInt4094 << 24 | 0x332277, 1);
		Static357.method5407(local11, local13, local13 + 350, local11 - -Static561.anInt9759);
		@Pc(60) int local60 = 350 / Static327.anInt6185;
		@Pc(70) int local70;
		if (Static559.anInt9499 > 0) {
			local70 = 342 - Static327.anInt6185;
			@Pc(80) int local80 = local70 * local60 / (Static559.anInt9499 + local60 - 1);
			@Pc(82) int local82 = 4;
			if (Static559.anInt9499 > 1) {
				local82 = (Static559.anInt9499 - Static157.anInt3114 - 1) * (-local80 + local70) / (Static559.anInt9499 - 1) + 4;
			}
			arg0.aa(local11 + Static561.anInt9759 - 16, local82 + local13, 12, local80, Static217.anInt4094 << 24 | 0x332277, 2);
			for (@Pc(124) int local124 = Static157.anInt3114; local124 < local60 + Static157.anInt3114 && local124 < Static559.anInt9499; local124++) {
				@Pc(133) String[] local133 = Static111.method1920('\b', Static286.aStringArray14[local124]);
				@Pc(142) int local142 = (Static561.anInt9759 - 8 - 16) / local133.length;
				for (@Pc(144) int local144 = 0; local144 < local133.length; local144++) {
					@Pc(152) int local152 = local144 * local142 + 8;
					arg0.KA(local11 + local152, local13, local11 + local152 + local142 - 8, local13 + 350);
					Static242.aClass38_5.method8985(Static261.method3782(local133[local144]), -1, -16777216, local13 + 350 - Static676.anInt11192 - Static586.aClass158_12.anInt4347 - Static327.anInt6185 * (-Static157.anInt3114 + local124) - 2, local11 + local152);
				}
			}
		}
		Static294.aClass38_9.method8990(-1, Static561.anInt9759 + local11 - 25, local13 + 330, -16777216, "Build: 650");
		arg0.KA(local11, local13, local11 + Static561.anInt9759, local13 + 350);
		arg0.method7891(Static561.anInt9759, local13 + 350 - Static676.anInt11192, -1, local11);
		Static448.aClass38_10.method8985("--> " + Static261.method3782(Static76.aString15), -1, -16777216, local13 + 350 - Static48.aClass158_1.anInt4347 - 1, local11 - -10);
		if (!Static645.aBoolean743) {
			return;
		}
		local70 = -1;
		if (Static87.anInt1951 % 30 > 15) {
			local70 = 16777215;
		}
		arg0.method7947(Static48.aClass158_1.method3601("--> " + Static261.method3782(Static76.aString15).substring(0, Static283.anInt4865)) + local11 + 10, 12, local13 + 350 - Static48.aClass158_1.anInt4347 - 11, local70);
	}
}
