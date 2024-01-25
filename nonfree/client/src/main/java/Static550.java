import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static550 {

	@OriginalMember(owner = "client!se", name = "v", descriptor = "[B")
	public static byte[] aByteArray101;

	@OriginalMember(owner = "client!se", name = "j", descriptor = "Z")
	public static boolean aBoolean672 = false;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
	public static void method7784() {
		Static687.aClass6_Sub44_33.method7080(1, Static687.aClass6_Sub44_33.aClass7_Sub6_2);
		Static687.aClass6_Sub44_33.method7080(1, Static687.aClass6_Sub44_33.aClass7_Sub6_1);
		Static687.aClass6_Sub44_33.method7080(2, Static687.aClass6_Sub44_33.aClass7_Sub24_1);
		Static687.aClass6_Sub44_33.method7080(2, Static687.aClass6_Sub44_33.aClass7_Sub24_2);
		Static687.aClass6_Sub44_33.method7080(1, Static687.aClass6_Sub44_33.aClass7_Sub8_1);
		Static687.aClass6_Sub44_33.method7080(1, Static687.aClass6_Sub44_33.aClass7_Sub20_1);
		Static687.aClass6_Sub44_33.method7080(1, Static687.aClass6_Sub44_33.aClass7_Sub27_1);
		Static687.aClass6_Sub44_33.method7080(1, Static687.aClass6_Sub44_33.aClass7_Sub29_1);
		Static687.aClass6_Sub44_33.method7080(1, Static687.aClass6_Sub44_33.aClass7_Sub14_1);
		Static687.aClass6_Sub44_33.method7080(1, Static687.aClass6_Sub44_33.aClass7_Sub2_1);
		Static687.aClass6_Sub44_33.method7080(2, Static687.aClass6_Sub44_33.aClass7_Sub3_1);
		Static687.aClass6_Sub44_33.method7080(1, Static687.aClass6_Sub44_33.aClass7_Sub4_1);
		Static687.aClass6_Sub44_33.method7080(2, Static687.aClass6_Sub44_33.aClass7_Sub28_1);
		Static687.aClass6_Sub44_33.method7080(1, Static687.aClass6_Sub44_33.lb);
		Static687.aClass6_Sub44_33.method7080(0, Static687.aClass6_Sub44_33.aClass7_Sub25_1);
		Static687.aClass6_Sub44_33.method7080(0, Static687.aClass6_Sub44_33.aClass7_Sub25_2);
		Static687.aClass6_Sub44_33.method7080(2, Static687.aClass6_Sub44_33.aClass7_Sub12_1);
		Static687.aClass6_Sub44_33.method7080(0, Static687.aClass6_Sub44_33.aClass7_Sub7_1);
		Static687.aClass6_Sub44_33.method7080(0, Static687.aClass6_Sub44_33.aClass7_Sub17_1);
		Static687.aClass6_Sub44_33.method7080(1, Static687.aClass6_Sub44_33.aClass7_Sub11_1);
		Static363.method5535();
		Static687.aClass6_Sub44_33.method7080(0, Static687.aClass6_Sub44_33.aClass7_Sub10_1);
		Static687.aClass6_Sub44_33.method7080(4, Static687.aClass6_Sub44_33.aClass7_Sub1_1);
		Static423.method6439();
		Static433.method6599();
		Static513.aBoolean649 = true;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;B)V")
	public static void method7785(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static676.method8940(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static50.method599(local7);
			local7 = Static489.method7244(local7, "%3a", ":");
			local7 = Static489.method7244(local7, "%40", "@");
			local7 = Static489.method7244(local7, "%26", "&");
			local7 = Static489.method7244(local7, "%23", "#");
			if (Static399.anApplet2 != null) {
				@Pc(135) Class380 local135 = Static345.aClass122_24.method3355(new URL(Static399.anApplet2.getCodeBase(), "clienterror.ws?c=" + Static45.anInt570 + "&u=" + (Static405.aString111 == null ? String.valueOf(Static362.aLong210) : Static405.aString111) + "&v1=" + Static174.aString38 + "&v2=" + Static174.aString37 + "&e=" + local7));
				while (local135.anInt10067 == 0) {
					Static255.method4444(1L);
				}
				if (local135.anInt10067 == 1) {
					@Pc(157) DataInputStream local157 = (DataInputStream) local135.anObject25;
					local157.read();
					local157.close();
				}
			}
		} catch (@Pc(164) Exception local164) {
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
	public static void method7787() {
		if (Static233.method4127(Static37.anInt498) || Static188.method3527(Static37.anInt498)) {
			Static635.method8596(Static414.anInt7186, Static475.anInt8090 >> 12, Static365.anInt6155 >> 12);
		} else {
			@Pc(44) int local44 = Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anIntArray263[0] >> 3;
			@Pc(51) int local51 = Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anIntArray264[0] >> 3;
			if (local44 >= 0 && local44 < Static29.anInt380 >> 3 && local51 >= 0 && local51 < Static327.anInt5650 >> 3) {
				Static635.method8596(Static414.anInt7186, local44, local51);
			} else {
				Static635.method8596(0, Static29.anInt380 >> 4, Static327.anInt5650 >> 4);
			}
		}
		Static359.method5447();
		Static180.method3415();
		Static299.method4827();
		Static53.method649();
	}
}
