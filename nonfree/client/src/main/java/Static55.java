import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "[I")
	public static int[] anIntArray70;

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!za;)V")
	public static void method899(@OriginalArg(0) Class75 arg0) {
		for (@Pc(1) int local1 = Static405.anInt7034; local1 < Static180.anInt3181; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static212.anInt3636; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static104.anInt1675; local7++) {
					@Pc(16) Class36 local16 = Static175.aClass36ArrayArrayArray1[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class11_Sub1 local21 = local16.aClass11_Sub1_2;
						@Pc(24) Class11_Sub1 local24 = local16.aClass11_Sub1_3;
						if (local21 != null && local21.method6211()) {
							Static252.method3495(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method6211()) {
								Static252.method3495(arg0, local24, local1, local4, local7, 1, 1);
								local24.method6207(0, arg0, 0, false, 0, local21);
								local24.method6208();
							}
							local21.method6208();
						}
						for (@Pc(70) Class195 local70 = local16.aClass195_1; local70 != null; local70 = local70.aClass195_2) {
							@Pc(74) Class11_Sub5 local74 = local70.aClass11_Sub5_1;
							if (local74 != null && local74.method6211()) {
								Static252.method3495(arg0, local74, local1, local4, local7, local74.aShort107 + 1 - local74.aShort108, local74.aShort106 - local74.aShort109 + 1);
								local74.method6208();
							}
						}
						@Pc(111) Class11_Sub3 local111 = local16.aClass11_Sub3_1;
						if (local111 != null && local111.method6211()) {
							Static408.method1361(arg0, local111, local1, local4, local7);
							local111.method6208();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
	public static void method901() {
		Static261.aClass220_23.method5105();
	}
}
