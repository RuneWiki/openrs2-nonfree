import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!ii", name = "i", descriptor = "[B")
	public static final byte[] aByteArray47 = new byte[2048];

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_107 = new Class189("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(III)V")
	public static void method2748(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub4_Sub12 local8 = Static393.method5080(arg1, 5);
		local8.method3248();
		local8.anInt4063 = arg0;
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V")
	public static void method2751() {
		if (Static47.aClass16_2 != null) {
			Static47.aClass16_2.method4114();
		}
		if (Static42.aClass16_1 != null) {
			Static42.aClass16_1.method4114();
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!qa;Lclient!bu;I)V")
	public static void method2752(@OriginalArg(0) Class172 arg0, @OriginalArg(1) Class32 arg1) {
		if (Static241.aBoolean395) {
			return;
		}
		arg0.M(0);
		Static186.aClass8_13 = arg0.method5542(Static464.method5845(arg1, Static359.anInt6090));
		Static186.aClass8_13.method6001((Static333.anInt5712 - Static186.aClass8_13.ja()) / 2, (Static123.anInt2625 - Static186.aClass8_13.JA()) / 2);
		Static437.aClass8_27 = arg0.method5542(Static464.method5845(arg1, Static275.anInt5095));
		Static437.aClass8_27.method6001((Static333.anInt5712 - Static437.aClass8_27.ja()) / 2, 18);
		Static241.aBoolean395 = true;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!mq;B)Z")
	public static boolean method2753(@OriginalArg(0) Class156 arg0) {
		if (arg0.anInt4794 == Static166.anInt3387) {
			Static90.anInt2165 = 250;
			return true;
		} else {
			return false;
		}
	}
}
