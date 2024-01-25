import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!nca", name = "h", descriptor = "Z")
	public static boolean aBoolean454;

	@OriginalMember(owner = "client!nca", name = "i", descriptor = "I")
	public static int anInt5746 = 0;

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V")
	public static void method4708(@OriginalArg(1) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(11) String local11 = "";
			if (arg0 != null) {
				local11 = Static329.method4514(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local11 = local11 + " | ";
				}
				local11 = local11 + arg1;
			}
			Static214.method3336(local11);
			local11 = Static301.method4223("%3a", ":", local11);
			local11 = Static301.method4223("%40", "@", local11);
			local11 = Static301.method4223("%26", "&", local11);
			local11 = Static301.method4223("%23", "#", local11);
			if (Static139.anApplet1 != null) {
				@Pc(101) Class260 local101 = Static342.aClass109_10.method2173(new URL(Static139.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static312.anInt5341 + "&u=" + Static134.aLong86 + "&v1=" + Static148.aString20 + "&v2=" + Static148.aString22 + "&e=" + local11));
				while (local101.anInt7041 == 0) {
					Static391.method5400(1L);
				}
				if (local101.anInt7041 == 1) {
					@Pc(119) DataInputStream local119 = (DataInputStream) local101.anObject16;
					local119.read();
					local119.close();
				}
			}
		} catch (@Pc(126) Exception local126) {
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(B)V")
	public static void method4709() {
		Static201.aClass222_24.method4428();
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ZLclient!pu;Lclient!r;)V")
	public static void method4710(@OriginalArg(1) Class270 arg0, @OriginalArg(2) Class134 arg1) {
		@Pc(10) Class102[] local10 = Static601.method2079(arg0, Static238.anInt4443);
		Static324.aClass22Array17 = new Class22[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static324.aClass22Array17[local16] = arg1.method6896(local10[local16], true);
		}
		local10 = Static601.method2079(arg0, Static182.anInt3237);
		Static246.aClass22Array14 = new Class22[local10.length];
		for (@Pc(47) int local47 = 0; local47 < local10.length; local47++) {
			Static246.aClass22Array14[local47] = arg1.method6896(local10[local47], true);
		}
		local10 = Static601.method2079(arg0, Static306.anInt4493);
		Static446.aClass22Array19 = new Class22[local10.length];
		for (@Pc(78) int local78 = 0; local78 < local10.length; local78++) {
			Static446.aClass22Array19[local78] = arg1.method6896(local10[local78], true);
		}
		local10 = Static601.method2079(arg0, Static334.anInt5671);
		Static50.aClass22Array2 = new Class22[local10.length];
		for (@Pc(109) int local109 = 0; local109 < local10.length; local109++) {
			Static50.aClass22Array2[local109] = arg1.method6896(local10[local109], true);
		}
		local10 = Static601.method2079(arg0, Static397.anInt9636);
		Static216.aClass22Array12 = new Class22[local10.length];
		for (@Pc(136) int local136 = 0; local136 < local10.length; local136++) {
			Static216.aClass22Array12[local136] = arg1.method6896(local10[local136], true);
		}
		local10 = Static601.method2079(arg0, Static394.anInt6880);
		Static444.aClass22Array15 = new Class22[local10.length];
		for (@Pc(167) int local167 = 0; local167 < local10.length; local167++) {
			Static444.aClass22Array15[local167] = arg1.method6896(local10[local167], true);
		}
		local10 = Static601.method2079(arg0, Static11.anInt148);
		Static568.aClass22Array20 = new Class22[local10.length];
		for (@Pc(194) int local194 = 0; local194 < local10.length; local194++) {
			Static568.aClass22Array20[local194] = arg1.method6896(local10[local194], true);
		}
		local10 = Static601.method2079(arg0, Static481.anInt8098);
		Static229.aClass22Array13 = new Class22[local10.length];
		for (@Pc(225) int local225 = 0; local225 < local10.length; local225++) {
			Static229.aClass22Array13[local225] = arg1.method6896(local10[local225], true);
		}
		local10 = Static601.method2079(arg0, Static65.anInt1322);
		Static172.aClass22Array11 = new Class22[local10.length];
		for (@Pc(256) int local256 = 0; local256 < local10.length; local256++) {
			Static172.aClass22Array11[local256] = arg1.method6896(local10[local256], true);
		}
		local10 = Static601.method2079(arg0, Static124.anInt6631);
		Static308.aClass22Array16 = new Class22[local10.length];
		for (@Pc(287) int local287 = 0; local287 < local10.length; local287++) {
			Static308.aClass22Array16[local287] = arg1.method6896(local10[local287], true);
		}
		local10 = Static601.method2079(arg0, Static382.anInt6461);
		Static147.aClass22Array10 = new Class22[local10.length];
		for (@Pc(318) int local318 = 0; local318 < local10.length; local318++) {
			Static147.aClass22Array10[local318] = arg1.method6896(local10[local318], true);
		}
		local10 = Static601.method2079(arg0, Static276.anInt4815);
		Static369.aClass22Array18 = new Class22[local10.length];
		for (@Pc(349) int local349 = 0; local349 < local10.length; local349++) {
			Static369.aClass22Array18[local349] = arg1.method6896(local10[local349], true);
		}
		Static74.aClass22_4 = arg1.method6896(Static601.method2070(arg0, Static49.anInt847, 0), true);
		Static200.aClass22_20 = arg1.method6896(Static601.method2070(arg0, Static570.anInt9427, 0), true);
		local10 = Static601.method2079(arg0, Static471.anInt8014);
		Static126.aClass22Array8 = new Class22[local10.length];
		for (@Pc(392) int local392 = 0; local392 < local10.length; local392++) {
			Static126.aClass22Array8[local392] = arg1.method6896(local10[local392], true);
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIIIII)V")
	public static void method4711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(13) int local13 = arg3 * arg3;
		@Pc(22) int local22 = arg4 * arg4;
		@Pc(26) int local26 = local22 << 1;
		@Pc(30) int local30 = local13 << 1;
		@Pc(34) int local34 = arg4 << 1;
		@Pc(43) int local43 = (1 - local34) * local13 + local26;
		@Pc(52) int local52 = local22 - local30 * (local34 - 1);
		@Pc(56) int local56 = local13 << 2;
		@Pc(60) int local60 = local22 << 2;
		@Pc(68) int local68 = local26 * 3;
		@Pc(76) int local76 = ((arg4 << 1) - 3) * local30;
		@Pc(82) int local82 = local60;
		Static433.method6039(arg0, arg3 + arg2, Static171.anIntArrayArray79[arg1], arg2 - arg3);
		@Pc(101) int local101 = (arg4 - 1) * local56;
		while (local9 > 0) {
			if (local43 < 0) {
				while (local43 < 0) {
					local43 += local68;
					local52 += local82;
					local7++;
					local82 += local60;
					local68 += local60;
				}
			}
			if (local52 < 0) {
				local52 += local82;
				local43 += local68;
				local68 += local60;
				local82 += local60;
				local7++;
			}
			local52 += -local76;
			local43 += -local101;
			local9--;
			local101 -= local56;
			local76 -= local56;
			@Pc(177) int local177 = arg1 - local9;
			@Pc(181) int local181 = local9 + arg1;
			@Pc(185) int local185 = arg2 + local7;
			@Pc(190) int local190 = arg2 - local7;
			Static433.method6039(arg0, local185, Static171.anIntArrayArray79[local177], local190);
			Static433.method6039(arg0, local185, Static171.anIntArrayArray79[local181], local190);
		}
	}
}
