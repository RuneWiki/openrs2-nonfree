import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "Lclient!ek;")
	public static Class85 aClass85_3;

	@OriginalMember(owner = "client!gr", name = "f", descriptor = "Lclient!lp;")
	public static final Class188 aClass188_5 = new Class188(10, 2, 2, 0);

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Throwable;)V")
	public static void method2641(@OriginalArg(0) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(11) String local11 = "";
			if (arg1 != null) {
				local11 = Static218.method3198(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local11 = local11 + " | ";
				}
				local11 = local11 + arg0;
			}
			Static259.method3638(local11);
			local11 = Static368.method5421(":", "%3a", local11);
			local11 = Static368.method5421("@", "%40", local11);
			local11 = Static368.method5421("&", "%26", local11);
			local11 = Static368.method5421("#", "%23", local11);
			if (Static158.anApplet3 != null) {
				@Pc(101) Class278 local101 = Static307.aClass57_5.method917(new URL(Static158.anApplet3.getCodeBase(), "clienterror.ws?c=" + Static397.anInt330 + "&u=" + Static399.aLong183 + "&v1=" + Static70.aString14 + "&v2=" + Static70.aString19 + "&e=" + local11));
				while (local101.anInt7757 == 0) {
					Static149.method2211(1L);
				}
				if (local101.anInt7757 == 1) {
					@Pc(121) DataInputStream local121 = (DataInputStream) local101.anObject24;
					local121.read();
					local121.close();
				}
			}
		} catch (@Pc(128) Exception local128) {
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIB)V")
	public static void method2642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(35) String local35 = "tele " + arg0 + "," + (arg2 >> 6) + "," + (arg1 >> 6) + "," + (arg2 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local35);
		Static361.method5343(true, local35, false);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!oa;B)V")
	public static void method2643(@OriginalArg(0) Class121 arg0) {
		Static43.aClass56_1 = Static281.method4010(arg0, Static425.anInt9464);
		Static383.aClass146_9 = Static55.method742(arg0, Static425.anInt9464);
		Static85.aClass56_2 = Static281.method4010(arg0, Static563.anInt9403);
		Static340.aClass146_8 = Static55.method742(arg0, Static563.anInt9403);
		Static408.aClass56_4 = Static281.method4010(arg0, Static422.anInt7470);
		Static338.aClass146_7 = Static55.method742(arg0, Static422.anInt7470);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!fca;I)V")
	public static void method2644(@OriginalArg(0) Class97 arg0) {
		if (!Static492.aBoolean560) {
			return;
		}
		if (arg0.anObjectArray2 != null) {
			@Pc(20) Class97 local20 = Static50.method681(Static288.anInt4713, Static443.anInt7698);
			if (local20 != null) {
				@Pc(26) Class6_Sub36 local26 = new Class6_Sub36();
				local26.aClass97_7 = arg0;
				local26.aClass97_8 = local20;
				local26.anObjectArray34 = arg0.anObjectArray2;
				Static100.method1639(local26);
			}
		}
		Static136.method2051(Static223.aClass160_44);
		Static218.aClass6_Sub14_Sub2_1.method5990(arg0.anInt2311);
		Static218.aClass6_Sub14_Sub2_1.method5980(Static443.anInt7698);
		Static218.aClass6_Sub14_Sub2_1.method6011(arg0.anInt2277);
		Static218.aClass6_Sub14_Sub2_1.method5997(arg0.lb);
		Static218.aClass6_Sub14_Sub2_1.method5980(Static537.anInt9108);
		Static218.aClass6_Sub14_Sub2_1.method6001(Static288.anInt4713);
	}
}
