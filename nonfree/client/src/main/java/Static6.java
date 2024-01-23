import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "T", descriptor = "Lclient!bf;")
	public static Class1_Sub2_Sub2 aClass1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!ae", name = "S", descriptor = "[I")
	public static int[] anIntArray21 = new int[128];

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIII)V")
	public static void method146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static115.method1777(false);
		Static207.anInt4126 = arg0;
		Static61.anInt1270 = arg1;
		Static47.method4518(arg2);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZLclient!ak;ILclient!ak;I)Lclient!q;")
	public static Class1_Sub2_Sub12_Sub1 method148(@OriginalArg(1) Class7 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class7 arg2) {
		return Static139.method2193(arg0, arg1, 0) ? Static27.method459(arg2.method253(0, arg1)) : null;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V")
	public static void method149(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static229.method3662(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static192.method4142(local7);
			local7 = Static265.method4066("%3a", ":", local7);
			local7 = Static265.method4066("%40", "@", local7);
			local7 = Static265.method4066("%26", "&", local7);
			local7 = Static265.method4066("%23", "#", local7);
			if (Static187.aClass84_4.anApplet1 == null) {
				return;
			}
			@Pc(106) Class118 local106 = Static187.aClass84_4.method1956(new URL(Static187.aClass84_4.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static137.anInt3864 + "&u=" + Static211.aLong36 + "&v1=" + Static127.aString84 + "&v2=" + Static127.aString78 + "&e=" + local7));
			while (local106.anInt3187 == 0) {
				Static275.method4233(1L);
			}
			if (local106.anInt3187 == 1) {
				@Pc(124) DataInputStream local124 = (DataInputStream) local106.anObject3;
				local124.read();
				local124.close();
			}
		} catch (@Pc(131) Exception local131) {
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)I")
	public static int method150(@OriginalArg(0) int arg0) {
		if (arg0 > 0) {
			return 1;
		} else if (arg0 < 0) {
			return -1;
		} else {
			return 0;
		}
	}
}
