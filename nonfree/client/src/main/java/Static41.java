import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
	public static int anInt1359;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "[Lclient!du;")
	public static Class67[] aClass67Array1 = new Class67[50];

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "J")
	public static long aLong20 = 0L;

	@OriginalMember(owner = "client!bn", name = "h", descriptor = "[I")
	public static final int[] anIntArray129 = new int[1];

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V")
	public static void method1359(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(5) String local5 = "";
			if (arg0 != null) {
				local5 = Static166.method3270(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local5 = local5 + " | ";
				}
				local5 = local5 + arg1;
			}
			Static504.method7228(local5);
			local5 = Static202.method5316(local5, ":", "%3a");
			local5 = Static202.method5316(local5, "@", "%40");
			local5 = Static202.method5316(local5, "&", "%26");
			local5 = Static202.method5316(local5, "#", "%23");
			if (Static125.aClass182_5.anApplet1 != null) {
				@Pc(105) Class243 local105 = Static125.aClass182_5.method4796(new URL(Static125.aClass182_5.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static543.anInt9405 + "&u=" + Static14.aLong11 + "&v1=" + Static283.aString52 + "&v2=" + Static283.aString49 + "&e=" + local5));
				while (local105.anInt6905 == 0) {
					Static505.method7295(1L);
				}
				if (local105.anInt6905 == 1) {
					@Pc(120) DataInputStream local120 = (DataInputStream) local105.anObject12;
					local120.read();
					local120.close();
				}
			}
		} catch (@Pc(127) Exception local127) {
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V")
	public static void method1360() {
		Static165.method3262(false);
		if (Static249.anInt4838 >= 0 && Static249.anInt4838 != 0) {
			Static508.method7307(Static249.anInt4838);
			Static249.anInt4838 = -1;
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZI)V")
	public static void method1361(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static85.anInt2201 != -1) {
				Static257.method7981(Static85.anInt2201);
			}
			for (@Pc(16) Class1_Sub5 local16 = (Class1_Sub5) Static484.aClass174_32.method4421(); local16 != null; local16 = (Class1_Sub5) Static484.aClass174_32.method4429()) {
				if (!local16.method7979()) {
					local16 = (Class1_Sub5) Static484.aClass174_32.method4421();
					if (local16 == null) {
						break;
					}
				}
				Static82.method2049(false, local16, true);
			}
			Static85.anInt2201 = -1;
			Static484.aClass174_32 = new Class174(8);
			Static366.method6077();
			Static85.anInt2201 = Static72.anInt2013;
			Static204.method3768(false);
			Static278.method4744();
			Static387.method5827(Static85.anInt2201);
		}
		Static152.aBoolean209 = false;
		Static469.aString68 = "";
		Static29.aString5 = "";
		Static83.method2056();
		Static151.anInt3437 = -1;
		Static414.method6199(Static59.anInt1653);
		Static16.aClass47_Sub2_Sub3_Sub2_1 = new Class47_Sub2_Sub3_Sub2();
		Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8189 = Static542.anInt9387 * 128 / 2;
		Static16.aClass47_Sub2_Sub3_Sub2_1.anIntArray362[0] = Static542.anInt9387 / 2;
		Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8191 = Static36.anInt1324 * 128 / 2;
		Static347.anInt6404 = 0;
		Static308.anInt5918 = 0;
		Static16.aClass47_Sub2_Sub3_Sub2_1.anIntArray361[0] = Static36.anInt1324 / 2;
		if (Static464.anInt8003 == 2) {
			Static347.anInt6404 = Static413.anInt7200 << 7;
			Static308.anInt5918 = Static404.anInt9256 << 7;
		} else {
			Static294.method4944();
		}
		Static157.method3127();
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)Z")
	public static boolean method1362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static518.method7376(arg0, arg1) || Static50.method7746(arg1, arg0);
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)V")
	public static void method1363() {
		@Pc(5) int local5 = Static412.anInt7191;
		@Pc(7) int[] local7 = Static349.anIntArray479;
		for (@Pc(16) int local16 = 0; local16 < local5; local16++) {
			@Pc(23) Class47_Sub2_Sub3_Sub2 local23 = Static473.aClass47_Sub2_Sub3_Sub2Array1[local7[local16]];
			if (local23 != null && local23.anInt5043 > 0) {
				local23.anInt5043--;
				if (local23.anInt5043 == 0) {
					local23.aString35 = null;
				}
			}
		}
		for (@Pc(49) int local49 = 0; local49 < Static457.anInt7857; local49++) {
			@Pc(55) long local55 = (long) Static386.anIntArray503[local49];
			@Pc(61) Class1_Sub10 local61 = (Class1_Sub10) Static258.aClass174_15.method4422(local55);
			if (local61 != null) {
				@Pc(66) Class47_Sub2_Sub3_Sub1 local66 = local61.aClass47_Sub2_Sub3_Sub1_2;
				if (local66.anInt5043 > 0) {
					local66.anInt5043--;
					if (local66.anInt5043 == 0) {
						local66.aString35 = null;
					}
				}
			}
		}
	}
}
