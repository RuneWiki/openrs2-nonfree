import java.awt.Canvas;
import java.io.DataInputStream;
import java.lang.reflect.Constructor;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!nh", name = "S", descriptor = "[I")
	public static int[] anIntArray526;

	@OriginalMember(owner = "client!nh", name = "Z", descriptor = "Lclient!br;")
	public static Class25 aClass25_1;

	@OriginalMember(owner = "client!nh", name = "M", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_115 = new Class77(86, -2);

	@OriginalMember(owner = "client!nh", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString41 = "";

	@OriginalMember(owner = "client!nh", name = "R", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray28 = new String[100];

	@OriginalMember(owner = "client!nh", name = "T", descriptor = "I")
	public static int anInt4313 = 0;

	@OriginalMember(owner = "client!nh", name = "W", descriptor = "I")
	public static int anInt4315 = 1;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILclient!bc;BLclient!dq;Ljava/awt/Canvas;)Lclient!km;")
	public static Class82 method3838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface1 arg2, @OriginalArg(4) Class53 arg3, @OriginalArg(5) Canvas arg4) {
		try {
			@Pc(11) Class local11 = Class.forName("Class82_Sub2");
			@Pc(57) Constructor local57 = local11.getConstructor(Canvas.class, bc.class, Integer.TYPE, Integer.TYPE, dq.class);
			return (Class82) local57.newInstance(arg4, arg2, Integer.valueOf(arg0), new Integer(arg1), arg3);
		} catch (@Pc(90) Exception local90) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "(I)V")
	public static void method3840() {
		for (@Pc(14) Class2_Sub1_Sub16 local14 = (Class2_Sub1_Sub16) Static237.aClass210_31.method5035(); local14 != null; local14 = (Class2_Sub1_Sub16) Static237.aClass210_31.method5037()) {
			@Pc(19) Class12_Sub1_Sub6 local19 = local14.aClass12_Sub1_Sub6_1;
			if (local19.aBoolean475) {
				local14.method5745();
				local19.method5467();
			} else if (local19.anInt6348 <= Static295.anInt5281) {
				local19.method5470(Static346.anInt6113);
				if (local19.aBoolean475) {
					local14.method5745();
				} else {
					Static326.method5033(local19, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)V")
	public static void method3841() {
		if (Static91.aClass143_12 != Static186.aClass143_28) {
			try {
				Static400.method4007(Static384.aClient1, "tbrefresh");
			} catch (@Pc(18) Throwable local18) {
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(CI)Z")
	public static boolean method3842(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Throwable;)V")
	public static void method3843(@OriginalArg(1) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static176.method2851(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			Static392.method5760(local7);
			local7 = Static168.method2732(local7, ":", "%3a");
			local7 = Static168.method2732(local7, "@", "%40");
			local7 = Static168.method2732(local7, "&", "%26");
			local7 = Static168.method2732(local7, "#", "%23");
			if (Static271.aClass53_4.anApplet1 != null) {
				@Pc(99) Class1 local99 = Static271.aClass53_4.method1181(new URL(Static271.aClass53_4.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static202.anInt3721 + "&u=" + Static97.aLong66 + "&v1=" + Static65.aString10 + "&v2=" + Static65.aString9 + "&e=" + local7));
				while (local99.anInt2 == 0) {
					Static185.method3004(1L);
				}
				if (local99.anInt2 == 1) {
					@Pc(118) DataInputStream local118 = (DataInputStream) local99.anObject1;
					local118.read();
					local118.close();
				}
			}
		} catch (@Pc(133) Exception local133) {
		}
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(IB)V")
	public static void method3845(@OriginalArg(0) int arg0) {
		@Pc(13) Class2_Sub1_Sub2 local13 = Static323.method4982(arg0, 8);
		local13.method412();
	}
}
