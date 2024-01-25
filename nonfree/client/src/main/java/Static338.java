import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V")
	public static void method4409(@OriginalArg(1) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static48.method652(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static401.method5193(local7);
			local7 = Static88.method1055(local7, "%3a", ":");
			local7 = Static88.method1055(local7, "%40", "@");
			local7 = Static88.method1055(local7, "%26", "&");
			local7 = Static88.method1055(local7, "%23", "#");
			if (Static457.aClass177_5.anApplet1 != null) {
				@Pc(107) Class253 local107 = Static457.aClass177_5.method3851(new URL(Static457.aClass177_5.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static286.anInt4795 + "&u=" + Static233.aLong137 + "&v1=" + Static289.aString50 + "&v2=" + Static289.aString49 + "&e=" + local7));
				while (local107.anInt6669 == 0) {
					Static331.method4343(1L);
				}
				if (local107.anInt6669 == 1) {
					@Pc(123) DataInputStream local123 = (DataInputStream) local107.anObject9;
					local123.read();
					local123.close();
				}
			}
		} catch (@Pc(130) Exception local130) {
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4411(@OriginalArg(1) String arg0) {
		if (Static126.aClass180Array1 != null) {
			Static178.method2589(Static307.aClass242_81);
			Static426.aClass1_Sub19_Sub2_2.method2934(Static108.method1349(arg0));
			Static426.aClass1_Sub19_Sub2_2.method2935(arg0);
		}
	}
}
