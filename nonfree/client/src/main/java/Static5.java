import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ada", name = "d", descriptor = "I")
	public static int anInt142;

	@OriginalMember(owner = "client!ada", name = "b", descriptor = "[S")
	public static final short[] aShortArray9 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!ada", name = "g", descriptor = "Lclient!fv;")
	public static final Class112 aClass112_3 = new Class112(15, 0, 1, 0);

	@OriginalMember(owner = "client!ada", name = "h", descriptor = "I")
	public static int anInt145 = -1;

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)V")
	public static void method207() {
		for (@Pc(10) Class6_Sub42 local10 = (Class6_Sub42) Static207.aClass211_29.method5183(); local10 != null; local10 = (Class6_Sub42) Static207.aClass211_29.method5177()) {
			if (Static542.method7784(local10.anInt8285)) {
				Static454.method7033(local10);
			}
		}
		if (Static205.anInt4369 == 1) {
			Static581.method8173();
			return;
		}
		Static550.method7860(Static24.anInt8441, Static230.anInt4775, Static430.anInt868, Static69.anInt1684);
		@Pc(49) int local49 = Static1.aClass82_1.method2292(Static222.aClass152_69.method4002(Static286.anInt5468));
		for (@Pc(54) Class6_Sub42 local54 = (Class6_Sub42) Static207.aClass211_29.method5183(); local54 != null; local54 = (Class6_Sub42) Static207.aClass211_29.method5177()) {
			@Pc(60) int local60 = Static373.method5925(local54);
			if (local60 > local49) {
				local49 = local60;
			}
		}
		Static430.anInt868 = Static205.anInt4369 * 16 + (Static28.aBoolean82 ? 26 : 22);
		Static24.anInt8441 = local49 + 8;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(B)V")
	public static void method209() {
		Static6.method501();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static55.aClass194Array1[local8].method4812();
		}
		Static514.method7577();
		Static41.method1127();
		System.gc();
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V")
	public static void method211(@OriginalArg(1) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static433.method6621(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static304.method4911(local7);
			local7 = Static42.method1135("%3a", ":", local7);
			local7 = Static42.method1135("%40", "@", local7);
			local7 = Static42.method1135("%26", "&", local7);
			local7 = Static42.method1135("%23", "#", local7);
			if (Static414.anApplet2 != null) {
				@Pc(104) Class280 local104 = Static240.aClass246_4.method6144(new URL(Static414.anApplet2.getCodeBase(), "clienterror.ws?c=" + Static382.anInt7177 + "&u=" + Static524.aLong226 + "&v1=" + Static389.aString92 + "&v2=" + Static389.aString91 + "&e=" + local7));
				while (local104.anInt8467 == 0) {
					Static566.method8004(1L);
				}
				if (local104.anInt8467 == 1) {
					@Pc(124) DataInputStream local124 = (DataInputStream) local104.anObject16;
					local124.read();
					local124.close();
				}
			}
		} catch (@Pc(131) Exception local131) {
		}
	}
}
