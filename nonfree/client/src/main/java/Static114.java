import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "Lclient!vf;")
	public static Class5_Sub16_Sub4 aClass5_Sub16_Sub4_1;

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "Lclient!jm;")
	public static final Class103 aClass103_56 = new Class103();

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "Lclient!tn;")
	public static final Class190 aClass190_10 = new Class190(512);

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
	public static int anInt2106 = 0;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!p;IIILclient!of;Lclient!rd;II)V")
	public static void method1985(@OriginalArg(0) Class156 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class4_Sub5_Sub2_Sub1 arg3, @OriginalArg(5) Class4_Sub5_Sub2_Sub2 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class5_Sub7 local7 = new Class5_Sub7();
		local7.anInt443 = arg2 * 128;
		local7.anInt442 = arg5 * 128;
		local7.anInt432 = arg6;
		if (arg0 != null) {
			local7.aClass156_1 = arg0;
			@Pc(32) int local32 = arg0.anInt4775;
			@Pc(35) int local35 = arg0.anInt4769;
			if (arg1 == 1 || arg1 == 3) {
				local32 = arg0.anInt4769;
				local35 = arg0.anInt4775;
			}
			local7.anInt440 = arg0.anInt4762;
			local7.anInt445 = arg0.anInt4777 * 128;
			local7.anInt446 = arg0.anInt4764;
			local7.anInt439 = (arg2 + local35) * 128;
			local7.anInt434 = arg0.anInt4767;
			local7.anIntArray55 = arg0.anIntArray435;
			local7.anInt438 = arg0.anInt4749;
			local7.anInt435 = (local32 + arg5) * 128;
			if (arg0.anIntArray437 != null) {
				local7.aBoolean33 = true;
				local7.method409();
			}
			if (local7.anIntArray55 != null) {
				local7.anInt441 = (int) ((double) (local7.anInt434 - local7.anInt446) * Math.random()) + local7.anInt446;
			}
			Static296.aClass103_138.method2745(local7);
		} else if (arg4 != null) {
			local7.aClass4_Sub5_Sub2_Sub2_1 = arg4;
			@Pc(177) Class106 local177 = arg4.aClass106_1;
			if (local177.anIntArray326 != null) {
				local7.aBoolean33 = true;
				local177 = local177.method2829();
			}
			if (local177 != null) {
				local7.anInt435 = (arg5 + local177.anInt3135) * 128;
				local7.anInt439 = (local177.anInt3135 + arg2) * 128;
				local7.anInt438 = Static152.method5138(arg4);
				local7.anInt445 = local177.anInt3129 * 128;
				local7.anInt440 = local177.anInt3167;
			}
			Static143.aClass103_70.method2745(local7);
		} else if (arg3 != null) {
			local7.aClass4_Sub5_Sub2_Sub1_1 = arg3;
			local7.anInt435 = (arg3.method4807() + arg5) * 128;
			local7.anInt439 = (arg2 + arg3.method4807()) * 128;
			local7.anInt438 = Static16.method307(arg3);
			local7.anInt440 = arg3.anInt4576;
			local7.anInt445 = arg3.anInt4543 * 128;
			Static199.aClass190_22.method5464(local7, (long) arg3.anInt5386);
			return;
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method1986(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(16) int local16 = arg2.indexOf(arg1); local16 != -1; local16 = arg2.indexOf(arg1, arg0.length() + local16)) {
			arg2 = arg2.substring(0, local16) + arg0 + arg2.substring(arg1.length() + local16);
		}
		return arg2;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
	public static void method1987() {
		Static185.aClass109_41.method2850();
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)V")
	public static void method1989(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class5_Sub1_Sub2 local8 = Static166.method3027(arg1, 5);
		local8.method850();
		local8.anInt996 = arg0;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIILclient!so;)V")
	public static void method1991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub2 arg4) {
		arg4.anInt1894 = (arg1 << 7) + 64;
		arg4.anInt1897 = arg3;
		arg4.anInt1892 = (arg2 << 7) + 64;
		@Pc(24) Class174 local24 = Static178.aClass174ArrayArrayArray3[arg0][arg1][arg2];
		if (local24 != null) {
			@Pc(28) int local28 = 0;
			for (@Pc(31) Class84 local31 = local24.aClass84_3; local31 != null; local31 = local31.aClass84_2) {
				if (local31.aClass4_Sub5_1.aBoolean575) {
					@Pc(41) int local41 = local31.aClass4_Sub5_1.method5902();
					if (local41 != -32768 && local41 < local28) {
						local28 = local41;
					}
				}
			}
			if (local28 < 0) {
				arg4.anInt1897 += local28;
				arg4.aBoolean139 = true;
			}
		}
		if (Static178.aClass174ArrayArrayArray3[arg0][arg1][arg2] == null) {
			Static1.method3(arg0, arg1, arg2);
		}
		Static178.aClass174ArrayArrayArray3[arg0][arg1][arg2].aClass4_Sub2_1 = arg4;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLjava/lang/Throwable;Ljava/lang/String;)V")
	public static void method1992(@OriginalArg(1) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(5) String local5 = "";
			if (arg0 != null) {
				local5 = Static151.method2735(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local5 = local5 + " | ";
				}
				local5 = local5 + arg1;
			}
			Static315.method5534(local5);
			local5 = method1986("%3a", ":", local5);
			local5 = method1986("%40", "@", local5);
			local5 = method1986("%26", "&", local5);
			local5 = method1986("%23", "#", local5);
			if (Static14.aClass139_1.anApplet1 != null) {
				@Pc(97) Class16 local97 = Static14.aClass139_1.method3856(new URL(Static14.aClass139_1.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static146.anInt2896 + "&u=" + Static153.aLong105 + "&v1=" + Static210.aString30 + "&v2=" + Static210.aString35 + "&e=" + local5));
				while (local97.anInt381 == 0) {
					Static20.method408(1L);
				}
				if (local97.anInt381 == 1) {
					@Pc(115) DataInputStream local115 = (DataInputStream) local97.anObject1;
					local115.read();
					local115.close();
				}
			}
		} catch (@Pc(127) Exception local127) {
		}
	}
}
