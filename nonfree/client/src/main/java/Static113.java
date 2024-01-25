import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;B)V")
	public static void method2252(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(11) String local11 = "";
			if (arg0 != null) {
				local11 = Static244.method4160(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local11 = local11 + " | ";
				}
				local11 = local11 + arg1;
			}
			Static50.method1124(local11);
			local11 = Static279.method4735(local11, "%3a", ":");
			local11 = Static279.method4735(local11, "%40", "@");
			local11 = Static279.method4735(local11, "%26", "&");
			local11 = Static279.method4735(local11, "%23", "#");
			if (Static213.aClass10_4.anApplet1 != null) {
				@Pc(103) Class60 local103 = Static213.aClass10_4.method312(new URL(Static213.aClass10_4.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static30.anInt822 + "&u=" + Static49.aLong39 + "&v1=" + Static11.aString20 + "&v2=" + Static11.aString19 + "&e=" + local11));
				while (local103.anInt1838 == 0) {
					Static105.method2138(1L);
				}
				if (local103.anInt1838 == 1) {
					@Pc(124) DataInputStream local124 = (DataInputStream) local103.anObject2;
					local124.read();
					local124.close();
				}
			}
		} catch (@Pc(131) Exception local131) {
		}
	}
}
