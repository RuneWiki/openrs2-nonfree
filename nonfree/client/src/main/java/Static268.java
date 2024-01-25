import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "Lclient!h;")
	public static Class90 aClass90_7;

	@OriginalMember(owner = "client!ro", name = "f", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "[S")
	public static final short[] aShortArray88 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!ro", name = "h", descriptor = "I")
	public static int anInt5500 = 999999;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V")
	public static void method4815() {
		for (@Pc(14) Class1_Sub43 local14 = (Class1_Sub43) Static305.aClass14_33.method302(); local14 != null; local14 = (Class1_Sub43) Static305.aClass14_33.method313()) {
			if (local14.aBoolean514) {
				local14.method5364();
			}
		}
		for (@Pc(38) Class1_Sub43 local38 = (Class1_Sub43) Static337.aClass14_36.method302(); local38 != null; local38 = (Class1_Sub43) Static337.aClass14_36.method313()) {
			if (local38.aBoolean514) {
				local38.method5364();
			}
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Throwable;)V")
	public static void method4816(@OriginalArg(0) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static262.method1695(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			Static83.method1319(local7);
			local7 = Static288.method5035(":", "%3a", local7);
			local7 = Static288.method5035("@", "%40", local7);
			local7 = Static288.method5035("&", "%26", local7);
			local7 = Static288.method5035("#", "%23", local7);
			if (Static123.aClass215_7.anApplet1 != null) {
				@Pc(107) Class193 local107 = Static123.aClass215_7.method5661(new URL(Static123.aClass215_7.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static119.anInt2297 + "&u=" + Static307.aLong201 + "&v1=" + Static343.aString263 + "&v2=" + Static343.aString267 + "&e=" + local7));
				while (local107.anInt5986 == 0) {
					Static163.method2863(1L);
				}
				if (local107.anInt5986 == 1) {
					@Pc(125) DataInputStream local125 = (DataInputStream) local107.anObject7;
					local125.read();
					local125.close();
				}
			}
		} catch (@Pc(132) Exception local132) {
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)I")
	public static int method4820() {
		return Static67.anInt1464;
	}
}
