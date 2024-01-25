import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "Lclient!g;")
	public static Class83 aClass83_121;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "Lclient!re;")
	public static final Class199 aClass199_6 = new Class199();

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "[S")
	public static final short[] aShortArray114 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_189 = new Class208(73, 7);

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/lang/Throwable;ZLjava/lang/String;)V")
	public static void method5531(@OriginalArg(0) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static288.method4747(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static36.method2333(local7);
			local7 = Static69.method1260("%3a", local7, ":");
			local7 = Static69.method1260("%40", local7, "@");
			local7 = Static69.method1260("%26", local7, "&");
			local7 = Static69.method1260("%23", local7, "#");
			if (Static181.aClass123_3.anApplet1 != null) {
				@Pc(99) Class86 local99 = Static181.aClass123_3.method3252(new URL(Static181.aClass123_3.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static274.anInt5134 + "&u=" + Static320.aLong210 + "&v1=" + Static175.aString29 + "&v2=" + Static175.aString31 + "&e=" + local7));
				while (local99.anInt2590 == 0) {
					Static215.method3855(1L);
				}
				if (local99.anInt2590 == 1) {
					@Pc(120) DataInputStream local120 = (DataInputStream) local99.anObject2;
					local120.read();
					local120.close();
				}
			}
		} catch (@Pc(127) Exception local127) {
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
	public static void method5532() {
		for (@Pc(3) int local3 = 0; local3 < Static169.aClass189ArrayArray3.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < Static169.aClass189ArrayArray3[local3].length; local7++) {
				Static169.aClass189ArrayArray3[local3][local7] = Static318.aClass189_2;
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)V")
	public static void method5533(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static121.aClass24_10.method325(Static148.aClass62_108.method1389(Static200.anInt4144));
		@Pc(24) int local24;
		for (@Pc(18) Class2_Sub43 local18 = (Class2_Sub43) Static262.aClass238_29.method5795(); local18 != null; local18 = (Class2_Sub43) Static262.aClass238_29.method5799()) {
			local24 = Static310.method5033(local18);
			if (local24 > local13) {
				local13 = local24;
			}
		}
		local13 += 8;
		local24 = Static233.anInt4642 * 16 + 21;
		@Pc(58) int local58 = arg0 - local13 / 2;
		if (local13 + local58 > Static7.anInt157) {
			local58 = Static7.anInt157 - local13;
		}
		if (local58 < 0) {
			local58 = 0;
		}
		@Pc(77) int local77 = arg1;
		if (Static336.anInt6217 < local24 + arg1) {
			local77 = Static336.anInt6217 - local24;
		}
		Static30.anInt453 = local58;
		if (local77 < 0) {
			local77 = 0;
		}
		Static392.anInt7142 = local13;
		Static214.aBoolean313 = true;
		Static10.anInt6517 = Static233.anInt4642 * 16 + (Static127.aBoolean191 ? 26 : 22);
		Static92.anInt1974 = local77;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IBILclient!g;)Lclient!bg;")
	public static Class24 method5534(@OriginalArg(2) int arg0, @OriginalArg(3) Class83 arg1) {
		@Pc(14) byte[] local14 = arg1.method1968(0, arg0);
		return local14 == null ? null : new Class24(local14);
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)Lclient!bh;")
	public static Class7_Sub2 method5536() {
		@Pc(13) Class7_Sub2 local13 = (Class7_Sub2) Static165.aClass199_3.method4900();
		if (local13 == null) {
			return new Class7_Sub2();
		} else {
			Static129.anInt2817--;
			return local13;
		}
	}
}
