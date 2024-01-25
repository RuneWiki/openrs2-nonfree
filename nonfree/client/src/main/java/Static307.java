import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!ls", name = "Fc", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_91 = new Class208(39, 11);

	@OriginalMember(owner = "client!ls", name = "Gc", descriptor = "I")
	public static int anInt7596 = 0;

	@OriginalMember(owner = "client!ls", name = "Nc", descriptor = "I")
	public static int anInt7603 = -1;

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)V")
	public static void method6060() {
		if (Static180.aFrame5 != null) {
			return;
		}
		@Pc(14) Container local14;
		if (Static73.aFrame1 != null) {
			local14 = Static73.aFrame1;
		} else if (Static433.anApplet2 == null) {
			local14 = Static149.anApplet_Sub1_1;
		} else {
			local14 = Static433.anApplet2;
		}
		Static8.anInt5988 = local14.getSize().width;
		Static65.anInt1195 = local14.getSize().height;
		@Pc(36) Insets local36;
		if (local14 == Static73.aFrame1) {
			local36 = Static73.aFrame1.getInsets();
			Static8.anInt5988 -= local36.left + local36.right;
			Static65.anInt1195 -= local36.top + local36.bottom;
		}
		if (Static470.method2475() == 1) {
			Static465.anInt8056 = 0;
			Static349.anInt6422 = Static318.anInt5819;
			Static594.anInt9806 = Static192.anInt3766;
			Static273.anInt1189 = (Static8.anInt5988 - Static318.anInt5819) / 2;
		} else {
			Static559.method7556();
		}
		if (Static405.aClass93_6 != Static76.aClass93_3) {
			@Pc(85) boolean local85;
			if (Static349.anInt6422 < 1024 && Static594.anInt9806 < 768) {
				local85 = true;
			} else {
				local85 = false;
			}
		}
		Static103.aCanvas2.setSize(Static349.anInt6422, Static594.anInt9806);
		if (Static31.aClass78_18 != null) {
			Static31.aClass78_18.method6853(Static103.aCanvas2);
		}
		if (Static73.aFrame1 == local14) {
			local36 = Static73.aFrame1.getInsets();
			Static103.aCanvas2.setLocation(Static273.anInt1189 + local36.left, Static465.anInt8056 + local36.top);
		} else {
			Static103.aCanvas2.setLocation(Static273.anInt1189, Static465.anInt8056);
		}
		if (Static165.anInt3165 != -1) {
			Static209.method7201(true);
		}
		Static8.method4849();
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Ljava/lang/String;Lclient!la;IZLclient!r;Lclient!vn;)V")
	public static void method6069(@OriginalArg(0) String arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class78 arg3, @OriginalArg(5) Class352 arg4) {
		@Pc(12) boolean local12 = !Static188.aBoolean268 || Static133.method2324();
		if (!local12) {
			return;
		}
		@Pc(26) int local26;
		@Pc(35) int local35;
		if (Static188.aBoolean268 && local12) {
			@Pc(135) Class352 local135 = Static286.aClass352_17;
			@Pc(141) Class96 local141 = arg3.method6837(local135, Static457.aClass282Array1);
			local26 = local135.method7574(250, arg0, null);
			local35 = local135.method7570(null, local135.anInt9293, arg0, 250);
			@Pc(160) int local160 = Static303.aClass282_1.anInt7490;
			@Pc(164) int local164 = local160 + 4;
			local35 += local164 * 2;
			local26 += local164 * 2;
			if (local26 < Static218.anInt3996) {
				local26 = Static218.anInt3996;
			}
			if (local35 < Static541.anInt9064) {
				local35 = Static541.anInt9064;
			}
			@Pc(199) int local199 = Static109.aClass259_3.method5515(local26, Static318.anInt5819) + Static252.anInt4619;
			@Pc(208) int local208 = Static21.aClass216_1.method4653(local35, Static192.anInt3766) + Static173.anInt3247;
			arg3.method6838(Static444.aClass282_4, false).DA(local199 + Static449.aClass282_3.anInt7490, local208 - -Static449.aClass282_3.anInt7493, local26 - Static449.aClass282_3.anInt7490 * 2, -(Static449.aClass282_3.anInt7493 * 2) + local35, 1, 0, 0);
			arg3.method6838(Static449.aClass282_3, true).method7795(local199, local208);
			Static449.aClass282_3.method6026();
			arg3.method6838(Static449.aClass282_3, true).method7795(local26 + local199 - local160, local208);
			Static449.aClass282_3.method6029();
			arg3.method6838(Static449.aClass282_3, true).method7795(local26 + local199 - local160, -local160 + local35 + local208);
			Static449.aClass282_3.method6026();
			arg3.method6838(Static449.aClass282_3, true).method7795(local199, local208 + local35 - local160);
			Static449.aClass282_3.method6029();
			arg3.method6838(Static303.aClass282_1, true).method7794(local199, local208 + Static449.aClass282_3.anInt7493, local160, local35 - Static449.aClass282_3.anInt7493 * 2);
			Static303.aClass282_1.method6017();
			arg3.method6838(Static303.aClass282_1, true).method7794(local199 + Static449.aClass282_3.anInt7490, local208, local26 - Static449.aClass282_3.anInt7490 * 2, local160);
			Static303.aClass282_1.method6017();
			arg3.method6838(Static303.aClass282_1, true).method7794(local26 + local199 - local160, local208 + Static449.aClass282_3.anInt7493, local160, local35 - Static449.aClass282_3.anInt7493 * 2);
			Static303.aClass282_1.method6017();
			arg3.method6838(Static303.aClass282_1, true).method7794(local199 + Static449.aClass282_3.anInt7490, -local160 + local208 + local35, local26 - Static449.aClass282_3.anInt7490 * 2, local160);
			Static303.aClass282_1.method6017();
			local141.method7261(1, 0, null, 0, local164 + local208, 0, null, Static581.anInt9580 | 0xFF000000, 1, local199 + local164, -(local164 * 2) + local26, -1, local35 - local164 * 2, arg0, null);
			Static95.method1439(local208, local35, local199, local26);
		} else {
			local26 = arg4.method7574(250, arg0, null);
			local35 = arg4.method7581(null, arg0, 250) * 13;
			arg3.J(6, 6, local26 + 8, local35 + 4 + 4, -16777216, 0);
			arg3.method6778(6, 6, local26 + 4 + 4, local35 - -4 + 4, -1, 0);
			arg1.method7261(1, 0, null, 0, 10, 0, null, -1, 1, 10, local26, -1, local35, arg0, null);
			Static95.method1439(6, local35 + 4 + 4, 6, local26 + 8);
		}
		if (arg2) {
			try {
				arg3.method6820();
			} catch (@Pc(435) Exception_Sub1 local435) {
			}
		}
	}
}
