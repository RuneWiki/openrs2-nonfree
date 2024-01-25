import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "F")
	public static float aFloat33;

	@OriginalMember(owner = "client!ce", name = "q", descriptor = "Lclient!ha;")
	public static Class104 aClass104_6;

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_27 = new Class45("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

	@OriginalMember(owner = "client!ce", name = "m", descriptor = "Lclient!sc;")
	public static final Class263 aClass263_3 = new Class263();

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
	public static void method1472() {
		if (Static186.anInt3864 == 0) {
			return;
		}
		try {
			if (++Static219.anInt4315 > 2000) {
				if (Static200.aClass134_2 != null) {
					Static200.aClass134_2.method8116();
					Static200.aClass134_2 = null;
				}
				if (Static245.anInt4713 >= 1) {
					Static121.anInt2497 = -5;
					Static186.anInt3864 = 0;
					return;
				}
				Static245.anInt4713++;
				Static119.aClass210_2.aBoolean468 = !Static119.aClass210_2.aBoolean468;
				Static219.anInt4315 = 0;
				Static186.anInt3864 = 1;
			}
			if (Static186.anInt3864 == 1) {
				Static393.aClass311_5 = Static473.aClass229_14.method6083(Static119.aClass210_2.method5716(), Static119.aClass210_2.aString150);
				Static186.anInt3864 = 2;
			}
			if (Static186.anInt3864 == 2) {
				if (Static393.aClass311_5.anInt9169 == 2) {
					throw new IOException();
				}
				if (Static393.aClass311_5.anInt9169 != 1) {
					return;
				}
				Static200.aClass134_2 = Static327.method5593((Socket) Static393.aClass311_5.anObject17);
				Static393.aClass311_5 = null;
				Static200.aClass134_2.method8117(Static259.aClass1_Sub17_Sub2_1.aByteArray58, Static259.aClass1_Sub17_Sub2_1.anInt4872);
				Static186.anInt3864 = 4;
			}
			@Pc(128) int local128;
			if (Static186.anInt3864 == 4) {
				if (!Static200.aClass134_2.method8118(1)) {
					return;
				}
				Static200.aClass134_2.method8123(Static352.aClass1_Sub17_Sub2_2.aByteArray58, 1, 0);
				local128 = Static352.aClass1_Sub17_Sub2_2.aByteArray58[0] & 0xFF;
				if (local128 != 21) {
					Static121.anInt2497 = local128;
					Static186.anInt3864 = 0;
					Static200.aClass134_2.method8116();
					Static200.aClass134_2 = null;
					return;
				}
				Static186.anInt3864 = 5;
			}
			if (Static186.anInt3864 == 5) {
				if (!Static200.aClass134_2.method8118(1)) {
					return;
				}
				Static200.aClass134_2.method8123(Static352.aClass1_Sub17_Sub2_2.aByteArray58, 1, 0);
				Static186.anInt3864 = 6;
				Static192.aStringArray3 = new String[Static352.aClass1_Sub17_Sub2_2.aByteArray58[0] & 0xFF];
			}
			if (Static186.anInt3864 == 6 && Static200.aClass134_2.method8118(Static192.aStringArray3.length * 8)) {
				Static352.aClass1_Sub17_Sub2_2.anInt4872 = 0;
				Static200.aClass134_2.method8123(Static352.aClass1_Sub17_Sub2_2.aByteArray58, Static192.aStringArray3.length * 8, 0);
				for (local128 = 0; local128 < Static192.aStringArray3.length; local128++) {
					Static192.aStringArray3[local128] = Static229.method4132(Static352.aClass1_Sub17_Sub2_2.method4465());
				}
				Static186.anInt3864 = 0;
				Static121.anInt2497 = 21;
				Static200.aClass134_2.method8116();
				Static200.aClass134_2 = null;
			}
		} catch (@Pc(236) IOException local236) {
			if (Static200.aClass134_2 != null) {
				Static200.aClass134_2.method8116();
				Static200.aClass134_2 = null;
			}
			if (Static245.anInt4713 < 1) {
				Static186.anInt3864 = 1;
				Static219.anInt4315 = 0;
				Static119.aClass210_2.aBoolean468 = !Static119.aClass210_2.aBoolean468;
				Static245.anInt4713++;
			} else {
				Static121.anInt2497 = -4;
				Static186.anInt3864 = 0;
			}
		}
	}
}
