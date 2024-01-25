import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "Lclient!ok;")
	public static Class178 aClass178_38;

	@OriginalMember(owner = "client!fr", name = "t", descriptor = "Lclient!ok;")
	public static Class178 aClass178_39;

	@OriginalMember(owner = "client!fr", name = "r", descriptor = "Lclient!gn;")
	public static final Class94 aClass94_15 = new Class94(4, 7);

	@OriginalMember(owner = "client!fr", name = "s", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_54 = new Class55("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(BI)V")
	public static void method2001(@OriginalArg(1) int arg0) {
		for (@Pc(9) Class7 local9 = Static26.aClass164_4.method3514(); local9 != null; local9 = Static26.aClass164_4.method3519()) {
			if ((long) arg0 == (local9.aLong230 >> 48 & 0xFFFFL)) {
				local9.method5802();
			}
		}
	}

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)V")
	public static void method2003() {
		if (Static196.anInt3465 == 0) {
			return;
		}
		try {
			if (++Static419.anInt6675 > 2000) {
				if (Static211.aClass247_4 != null) {
					Static211.aClass247_4.method5162();
					Static211.aClass247_4 = null;
				}
				if (Static364.anInt2000 >= 1) {
					Static179.anInt7441 = -5;
					Static196.anInt3465 = 0;
					return;
				}
				Static257.aClass124_4.aBoolean208 = !Static257.aClass124_4.aBoolean208;
				Static364.anInt2000++;
				Static419.anInt6675 = 0;
				Static196.anInt3465 = 1;
			}
			if (Static196.anInt3465 == 1) {
				Static382.aClass236_4 = Static230.aClass61_4.method1463(Static257.aClass124_4.aString37, Static257.aClass124_4.method2807());
				Static196.anInt3465 = 2;
			}
			@Pc(114) int local114;
			if (Static196.anInt3465 == 2) {
				if (Static382.aClass236_4.anInt6178 == 2) {
					throw new IOException();
				}
				if (Static382.aClass236_4.anInt6178 != 1) {
					return;
				}
				Static211.aClass247_4 = new Class247((Socket) Static382.aClass236_4.anObject8, Static230.aClass61_4);
				Static382.aClass236_4 = null;
				Static211.aClass247_4.method5151(Static255.aClass7_Sub14_Sub1_2.anInt4989, Static255.aClass7_Sub14_Sub1_2.aByteArray75);
				Static86.method1480();
				local114 = Static211.aClass247_4.method5155();
				Static86.method1480();
				if (local114 != 21) {
					Static196.anInt3465 = 0;
					Static179.anInt7441 = local114;
					Static211.aClass247_4.method5162();
					Static211.aClass247_4 = null;
					return;
				}
				Static196.anInt3465 = 3;
			}
			if (Static196.anInt3465 == 3) {
				if (Static211.aClass247_4.method5161() < 1) {
					return;
				}
				Static347.aStringArray48 = new String[Static211.aClass247_4.method5155()];
				Static196.anInt3465 = 4;
			}
			if (Static196.anInt3465 == 4 && Static211.aClass247_4.method5161() >= Static347.aStringArray48.length * 8) {
				Static210.aClass7_Sub14_Sub1_4.anInt4989 = 0;
				Static211.aClass247_4.method5157(Static210.aClass7_Sub14_Sub1_4.aByteArray75, 0, Static347.aStringArray48.length * 8);
				for (local114 = 0; local114 < Static347.aStringArray48.length; local114++) {
					Static347.aStringArray48[local114] = Static65.method1861(Static210.aClass7_Sub14_Sub1_4.method3941());
				}
				Static196.anInt3465 = 0;
				Static179.anInt7441 = 21;
				Static211.aClass247_4.method5162();
				Static211.aClass247_4 = null;
			}
		} catch (@Pc(214) IOException local214) {
			if (Static211.aClass247_4 != null) {
				Static211.aClass247_4.method5162();
				Static211.aClass247_4 = null;
			}
			if (Static364.anInt2000 < 1) {
				Static364.anInt2000++;
				Static257.aClass124_4.aBoolean208 = !Static257.aClass124_4.aBoolean208;
				Static196.anInt3465 = 1;
				Static419.anInt6675 = 0;
			} else {
				Static196.anInt3465 = 0;
				Static179.anInt7441 = -4;
			}
		}
	}
}
