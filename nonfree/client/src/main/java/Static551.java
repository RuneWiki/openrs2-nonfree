import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static551 {

	@OriginalMember(owner = "client!ts", name = "D", descriptor = "[I")
	public static final int[] anIntArray511 = new int[1000];

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIZ)Z")
	public static boolean method8045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static553.method8062(arg0, arg1) | (arg0 & 0x2000) != 0 | Static5.method104(arg0, arg1)) & Static378.method5551(arg1, arg0);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method8046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6) {
		if (arg2 < 512 || arg1 < 512 || (Static326.anInt5541 - 2) * 512 < arg2 || Static448.anInt7637 * 512 - 1024 < arg1) {
			Static120.anIntArray136[0] = Static120.anIntArray136[1] = -1;
			return;
		}
		@Pc(52) int local52 = Static644.method9021(arg1, arg2, arg6) - arg4;
		if (Static428.aBoolean526) {
			Static142.method2051(true);
		} else {
			Static16.aClass113_2.method8454(arg5, 0, 0);
			Static213.aClass133_5.method7269(Static16.aClass113_2);
		}
		if (Static57.aBoolean65) {
			Static213.aClass133_5.HA(arg2, local52, arg1, Static469.anInt7885, Static120.anIntArray136);
		} else {
			Static213.aClass133_5.da(arg2, local52, arg1, Static120.anIntArray136);
		}
		if (Static428.aBoolean526) {
			Static583.method8431();
		} else {
			Static16.aClass113_2.method8454(-arg5, 0, 0);
			Static213.aClass133_5.method7269(Static16.aClass113_2);
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIIII)V")
	public static void method8047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(2) int local2 = arg2 + 1;
		Static491.method7219(Static249.anIntArrayArray23[arg2], arg1, arg0, arg3);
		@Pc(17) int local17 = arg4 - 1;
		Static491.method7219(Static249.anIntArrayArray23[arg4], arg1, arg0, arg3);
		for (@Pc(25) int local25 = local2; local25 <= local17; local25++) {
			@Pc(32) int[] local32 = Static249.anIntArrayArray23[local25];
			local32[arg1] = local32[arg3] = arg0;
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZLjava/lang/String;I)Z")
	public static boolean method8048(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (Static470.aClass100_14.aBoolean194) {
			Static490.aClass306_5 = new Class306();
			Static490.aClass306_5.anInt8300 = arg1;
			Static490.aClass306_5.aString95 = arg0;
			if (Static211.aClass15_2 != Static517.aClass15_8) {
				Static490.aClass306_5.anInt8296 = Static490.aClass306_5.anInt8300 + 40000;
				Static490.aClass306_5.anInt8294 = Static490.aClass306_5.anInt8300 + 50000;
			}
			if (arg1 < Static103.aClass33_Sub1Array2.length && Static103.aClass33_Sub1Array2[arg1] != null) {
				Static371.anInt6178 = Static103.aClass33_Sub1Array2[arg1].anInt6143;
			}
			return true;
		}
		@Pc(48) String local48 = "";
		if (Static211.aClass15_2 != Static517.aClass15_8) {
			local48 = ":" + (arg1 + 7000);
		}
		@Pc(68) String local68 = "";
		if (Static463.aString84 != null) {
			local68 = "/p=" + Static463.aString84;
		}
		@Pc(116) String local116 = "http://" + arg0 + local48 + "/l=" + Static266.anInt4796 + "/a=" + Static451.anInt7697 + local68 + "/j" + (Static12.aBoolean9 ? "1" : "0") + ",o" + (Static483.aBoolean594 ? "1" : "0") + ",a2";
		try {
			Static475.aClient1.getAppletContext().showDocument(new URL(local116), "_self");
			return true;
		} catch (@Pc(126) Exception local126) {
			return false;
		}
	}
}
