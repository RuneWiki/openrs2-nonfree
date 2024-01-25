import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!nja", name = "E", descriptor = "I")
	public static int anInt6666;

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(IIIII)V")
	public static void method5811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static181.anInt3401 != 1) {
			return;
		}
		@Pc(16) int local16 = arg3 / Static659.anInt10729;
		@Pc(20) int local20 = arg1 / Static659.anInt10729;
		@Pc(24) int local24 = arg0 / Static122.anInt2024;
		@Pc(28) int local28 = arg2 / Static122.anInt2024;
		if (Static492.anInt7974 <= local16 || local20 < 0 || local24 >= Static58.anInt7090 || local28 < 0) {
			return;
		}
		if (local16 < 0) {
			local16 = 0;
		}
		if (local24 < 0) {
			local24 = 0;
		}
		if (Static492.anInt7974 <= local20) {
			local20 = Static492.anInt7974 - 1;
		}
		if (local28 >= Static58.anInt7090) {
			local28 = Static58.anInt7090 - 1;
		}
		for (@Pc(92) int local92 = local24; local92 <= local28; local92++) {
			@Pc(103) int local103 = Static461.method6497(Static58.anInt7090, Static488.anInt7901 + local92) * Static492.anInt7974;
			for (@Pc(105) int local105 = local16; local105 <= local20; local105++) {
				@Pc(116) int local116 = local103 + Static461.method6497(Static492.anInt7974, Static111.anInt1795 + local105);
				Static483.anIntArray454[local116] = Static662.anInt10762;
			}
		}
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method5812(@OriginalArg(1) int arg0) {
		@Pc(16) String local16 = Integer.toString(arg0);
		for (@Pc(21) int local21 = local16.length() - 3; local21 > 0; local21 -= 3) {
			local16 = local16.substring(0, local21) + "," + local16.substring(local21);
		}
		if (local16.length() > 9) {
			return " <col=00ff80>" + local16.substring(0, local16.length() - 8) + Static184.aClass131_34.method3168(Static375.anInt7800) + " (" + local16 + ")</col>";
		} else if (local16.length() > 6) {
			return " <col=ffffff>" + local16.substring(0, local16.length() - 4) + Static184.aClass131_36.method3168(Static375.anInt7800) + " (" + local16 + ")</col>";
		} else {
			return " <col=ffff00>" + local16 + "</col>";
		}
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(B)V")
	public static void method5813() {
		for (@Pc(6) Class5_Sub1_Sub20 local6 = (Class5_Sub1_Sub20) Static244.aClass388_5.method9027(); local6 != null; local6 = (Class5_Sub1_Sub20) Static244.aClass388_5.method9024()) {
			if (local6.anInt9857 > 1) {
				local6.anInt9857 = 0;
				Static529.aClass168_75.method3853(((Class5_Sub1_Sub13) local6.aClass388_14.aClass5_Sub1_66.aClass5_Sub1_65).aLong177, local6);
				local6.aClass388_14.method9021();
			}
		}
		Static651.anInt10662 = 0;
		Static530.anInt8424 = 0;
		Static399.aClass20_33.method374();
		Static99.aClass306_8.method6936();
		Static244.aClass388_5.method9021();
		Static4.method7573(Static643.aClass5_Sub1_Sub13_3);
		if (12 != 12) {
			method5811(-92, 59, 105, 60);
		}
	}
}
