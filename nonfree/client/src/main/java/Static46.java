import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!cm", name = "q", descriptor = "I")
	public static int anInt1319 = 0;

	@OriginalMember(owner = "client!cm", name = "s", descriptor = "[C")
	public static final char[] aCharArray3 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V")
	public static void method1056(@OriginalArg(1) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(5) String local5 = "";
			if (arg1 != null) {
				local5 = Static222.method3934(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local5 = local5 + " | ";
				}
				local5 = local5 + arg0;
			}
			Static163.method3116(local5);
			local5 = Static179.method3304(local5, "%3a", ":");
			local5 = Static179.method3304(local5, "%40", "@");
			local5 = Static179.method3304(local5, "%26", "&");
			local5 = Static179.method3304(local5, "%23", "#");
			if (Static21.aClass21_1.anApplet1 != null) {
				@Pc(99) Class99 local99 = Static21.aClass21_1.method364(new URL(Static21.aClass21_1.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static88.anInt3955 + "&u=" + Static353.aLong82 + "&v1=" + Static22.aString38 + "&v2=" + Static22.aString36 + "&e=" + local5));
				while (local99.anInt2836 == 0) {
					Static129.method2634(1L);
				}
				if (local99.anInt2836 == 1) {
					@Pc(119) DataInputStream local119 = (DataInputStream) local99.anObject2;
					local119.read();
					local119.close();
				}
			}
		} catch (@Pc(126) Exception local126) {
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)Z")
	public static boolean method1057() {
		@Pc(8) Class7_Sub32 local8 = (Class7_Sub32) Static76.aClass74_8.aClass7_72.aClass7_248;
		if (local8 == null || Static76.aClass74_8.aClass7_72 == local8) {
			return false;
		} else {
			if (local8.anInt5229 >= 2000) {
				local8.anInt5229 -= 2000;
			}
			return local8.anInt5229 == 1011;
		}
	}
}
