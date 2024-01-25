import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!u", name = "I", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_94 = new Class27(82, 7);

	@OriginalMember(owner = "client!u", name = "ab", descriptor = "[Lclient!jv;")
	public static final Class137[] aClass137Array2 = new Class137[14];

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ZLclient!rj;)Z")
	public static boolean method5319(@OriginalArg(1) Interface10 arg0) {
		@Pc(15) Class126 local15 = Static342.aClass237_4.method5212(arg0.method5706());
		if (local15.anInt3783 == -1) {
			return true;
		} else {
			@Pc(27) Class14 local27 = Static228.aClass2_4.method12(local15.anInt3783);
			return local27.anInt303 == -1 ? true : local27.method249();
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IJ)V")
	public static void method5323(@OriginalArg(1) long arg0) {
		if (Static309.aClass11ArrayArrayArray2 != null) {
			if (Static157.anInt3176 == 1 || Static157.anInt3176 == 5) {
				Static315.method4330(arg0);
			} else if (Static157.anInt3176 == 4) {
				Static49.method841(arg0);
			}
		}
		Static56.method993(Static412.aClass50_8, (long) Static400.anInt6752);
		if (Static189.anInt3826 != -1) {
			Static298.method4150(Static189.anInt3826);
		}
		for (@Pc(40) int local40 = 0; local40 < Static167.anInt3304; local40++) {
			if (Static432.aBooleanArray24[local40]) {
				Static373.aBooleanArray19[local40] = true;
			}
			Static301.aBooleanArray15[local40] = Static432.aBooleanArray24[local40];
			Static432.aBooleanArray24[local40] = false;
		}
		Static361.anInt6149 = Static400.anInt6752;
		if (Static412.aClass50_8.method5830()) {
			Static97.aBoolean74 = true;
		}
		if (Static189.anInt3826 != -1) {
			Static167.anInt3304 = 0;
			Static111.method4688();
		}
		Static412.aClass50_8.va();
		Static295.method3635(Static412.aClass50_8);
		@Pc(86) int local86 = Static296.method4131();
		if (local86 == -1) {
			local86 = Static40.anInt656;
		}
		if (local86 == -1) {
			local86 = Static78.anInt1647;
		}
		Static45.method5779(local86);
		Static348.method4719(Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7094, Static263.aClass24_Sub3_Sub2_Sub2_4.aByte98, Static68.anInt1469, Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7092);
		Static68.anInt1469 = 0;
	}
}
