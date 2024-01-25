import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!k;III[Z)Z")
	public static boolean method2386(@OriginalArg(0) Class12_Sub4_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static51.aClass215Array6 != Static67.aClass215Array2) {
			@Pc(11) int local11 = Static155.aClass215Array5[arg1].aa(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class215 local18 = Static155.aClass215Array5[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.aa(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method7839(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.ya(arg0, arg2, local27, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!dj;ILjava/lang/String;Z)Lclient!ci;")
	public static Class55 method2387(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (arg1 == 0) {
			return arg0.method1983(arg2);
		}
		@Pc(41) Class55 local41;
		if (arg1 == 1) {
			try {
				Static549.method685("openjs", arg0.anApplet1, new Object[] { (new URL(arg0.anApplet1.getCodeBase(), arg2)).toString() });
				local41 = new Class55();
				local41.anInt1481 = 1;
				return local41;
			} catch (@Pc(47) Throwable local47) {
				local41 = new Class55();
				local41.anInt1481 = 2;
				return local41;
			}
		} else if (arg1 == 2) {
			try {
				arg0.anApplet1.getAppletContext().showDocument(new URL(arg0.anApplet1.getCodeBase(), arg2), "_blank");
				local41 = new Class55();
				local41.anInt1481 = 1;
				return local41;
			} catch (@Pc(81) Exception local81) {
				local41 = new Class55();
				local41.anInt1481 = 2;
				return local41;
			}
		} else if (arg1 == 3) {
			try {
				Static549.method683(arg0.anApplet1, "loggedout");
			} catch (@Pc(103) Throwable local103) {
			}
			try {
				arg0.anApplet1.getAppletContext().showDocument(new URL(arg0.anApplet1.getCodeBase(), arg2), "_top");
				local41 = new Class55();
				local41.anInt1481 = 1;
				return local41;
			} catch (@Pc(125) Exception local125) {
				local41 = new Class55();
				local41.anInt1481 = 2;
				return local41;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!daa;Z)V")
	public static void method2388(@OriginalArg(0) Class12_Sub8 arg0) {
		@Pc(9) int local9 = arg0.method5218();
		Static119.aClass194Array1 = new Class194[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static119.aClass194Array1[local14] = new Class194();
			Static119.aClass194Array1[local14].anInt5565 = arg0.method5218();
			Static119.aClass194Array1[local14].aString60 = arg0.method5169();
		}
		Static131.anInt2991 = arg0.method5218();
		Static136.anInt3074 = arg0.method5218();
		Static527.anInt9426 = arg0.method5218();
		Static502.aClass23_Sub1Array2 = new Class23_Sub1[Static136.anInt3074 + 1 - Static131.anInt2991];
		for (@Pc(62) int local62 = 0; local62 < Static527.anInt9426; local62++) {
			@Pc(68) int local68 = arg0.method5218();
			@Pc(76) Class23_Sub1 local76 = Static502.aClass23_Sub1Array2[local68] = new Class23_Sub1();
			local76.anInt5190 = arg0.method5216();
			local76.anInt5192 = arg0.method5225();
			local76.anInt5198 = local68 + Static131.anInt2991;
			local76.aString51 = arg0.method5169();
			local76.aString52 = arg0.method5169();
		}
		Static204.anInt4549 = arg0.method5225();
		Static122.aBoolean230 = true;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(III[B[BIIZI)V")
	public static void method2389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg7 >> 2);
		@Pc(15) int local15 = -(arg7 & 0x3);
		for (@Pc(22) int local22 = -arg2; local22 < 0; local22++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local10; local26 < 0; local26++) {
				local30 = arg5++;
				arg4[local30] = (byte) (arg4[local30] - arg3[arg0++]);
				@Pc(43) int local43 = arg5++;
				arg4[local43] = (byte) (arg4[local43] - arg3[arg0++]);
				@Pc(56) int local56 = arg5++;
				arg4[local56] = (byte) (arg4[local56] - arg3[arg0++]);
				@Pc(69) int local69 = arg5++;
				arg4[local69] = (byte) (arg4[local69] - arg3[arg0++]);
			}
			for (@Pc(85) int local85 = local15; local85 < 0; local85++) {
				local30 = arg5++;
				arg4[local30] = (byte) (arg4[local30] - arg3[arg0++]);
			}
			arg5 += arg6;
			arg0 += arg1;
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILclient!mc;Lclient!mc;)V")
	public static void method2392(@OriginalArg(1) Class198 arg0, @OriginalArg(2) Class198 arg1) {
		Static332.method5312(Static16.aClass77_4);
		Static383.aClass12_Sub8_Sub2_1.method5223(arg1.anInt5739);
		Static383.aClass12_Sub8_Sub2_1.method5190(arg0.anInt5705);
		Static383.aClass12_Sub8_Sub2_1.method5224(arg0.anInt5739);
		Static383.aClass12_Sub8_Sub2_1.method5197(arg1.anInt5726);
		Static383.aClass12_Sub8_Sub2_1.method5197(arg0.anInt5726);
		Static383.aClass12_Sub8_Sub2_1.method5197(arg1.anInt5705);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(BLclient!mc;)Lclient!mc;")
	public static Class198 method2393(@OriginalArg(1) Class198 arg0) {
		if (arg0.anInt5787 != -1) {
			return Static104.method2137(arg0.anInt5787);
		}
		@Pc(20) int local20 = arg0.anInt5739 >>> 16;
		@Pc(30) Class135 local30 = new Class135(Static456.aClass68_67);
		for (@Pc(35) Class12_Sub34 local35 = (Class12_Sub34) local30.method3650(); local35 != null; local35 = (Class12_Sub34) local30.method3654()) {
			if (local35.anInt5831 == local20) {
				return Static104.method2137((int) local35.aLong248);
			}
		}
		return null;
	}
}
