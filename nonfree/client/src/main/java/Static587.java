import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static587 {

	@OriginalMember(owner = "client!ts", name = "l", descriptor = "Lclient!qn;")
	public static Class295 aClass295_5;

	@OriginalMember(owner = "client!ts", name = "t", descriptor = "F")
	public static float aFloat192;

	@OriginalMember(owner = "client!ts", name = "v", descriptor = "I")
	public static int anInt9293 = 0;

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IBLclient!kka;)Z")
	public static boolean method7887(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17_Sub2 arg1) {
		@Pc(8) int local8 = arg1.method4905(2);
		@Pc(25) int local25;
		@Pc(30) int local30;
		@Pc(99) int local99;
		@Pc(103) int local103;
		@Pc(109) int local109;
		if (local8 == 0) {
			if (arg1.method4905(1) != 0) {
				method7887(arg0, arg1);
			}
			local25 = arg1.method4905(6);
			local30 = arg1.method4905(6);
			@Pc(42) boolean local42 = arg1.method4905(1) == 1;
			if (local42) {
				Static294.anIntArray233[Static519.anInt8681++] = arg0;
			}
			if (Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(65) Class210 local65 = Static622.aClass210Array1[arg0];
			@Pc(73) Class23_Sub2_Sub1_Sub2_Sub1 local73 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[arg0] = new Class23_Sub2_Sub1_Sub2_Sub1();
			local73.anInt10180 = arg0;
			if (Static105.aClass3_Sub17Array1[arg0] != null) {
				local73.method2913(Static105.aClass3_Sub17Array1[arg0]);
			}
			local73.method8623(local65.anInt5740, true);
			local73.anInt10178 = local65.anInt5737;
			local99 = local65.anInt5738;
			local103 = local99 >> 28;
			local109 = local99 >> 14 & 0xFF;
			@Pc(113) int local113 = local99 & 0xFF;
			@Pc(122) int local122 = local25 + (local109 << 6) - Static417.anInt7047;
			local73.aBoolean262 = local65.aBoolean450;
			local73.aBoolean261 = local65.aBoolean451;
			@Pc(139) int local139 = (local113 << 6) + local30 - Static347.anInt7851;
			local73.aByteArray109[0] = Static460.aByteArray73[arg0];
			local73.aByte142 = local73.aByte143 = (byte) local103;
			if (Static190.method3051(local139, local122)) {
				local73.aByte143++;
			}
			local73.method2905(local139, local122);
			local73.aBoolean257 = false;
			Static622.aClass210Array1[arg0] = null;
			return true;
		} else if (local8 == 1) {
			local25 = arg1.method4905(2);
			local30 = Static622.aClass210Array1[arg0].anInt5738;
			Static622.aClass210Array1[arg0].anInt5738 = (((local30 >> 28) + local25 & 0x3) << 28) + (local30 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(236) int local236;
			@Pc(241) int local241;
			@Pc(250) int local250;
			if (local8 != 2) {
				local25 = arg1.method4905(18);
				local30 = local25 >> 16;
				local236 = local25 >> 8 & 0xFF;
				local241 = local25 & 0xFF;
				local250 = Static622.aClass210Array1[arg0].anInt5738;
				local99 = local30 + (local250 >> 28) & 0x3;
				local103 = local236 + (local250 >> 14) & 0xFF;
				local109 = local241 + local250 & 0xFF;
				Static622.aClass210Array1[arg0].anInt5738 = local109 + (local103 << 14) + (local99 << 28);
				return false;
			}
			local25 = arg1.method4905(5);
			local30 = local25 >> 3;
			local236 = local25 & 0x7;
			local241 = Static622.aClass210Array1[arg0].anInt5738;
			local250 = (local241 >> 28) + local30 & 0x3;
			local99 = local241 >> 14 & 0xFF;
			local103 = local241 & 0xFF;
			if (local236 == 0) {
				local103--;
				local99--;
			}
			if (local236 == 1) {
				local103--;
			}
			if (local236 == 2) {
				local103--;
				local99++;
			}
			if (local236 == 3) {
				local99--;
			}
			if (local236 == 4) {
				local99++;
			}
			if (local236 == 5) {
				local99--;
				local103++;
			}
			if (local236 == 6) {
				local103++;
			}
			if (local236 == 7) {
				local103++;
				local99++;
			}
			Static622.aClass210Array1[arg0].anInt5738 = (local250 << 28) - (-(local99 << 14) - local103);
			return false;
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILclient!waa;ZZLclient!waa;IZ)I")
	public static int method7888(@OriginalArg(0) int arg0, @OriginalArg(1) Class31_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class31_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) int local10 = Static243.method3910(arg3, arg2, arg0, arg1);
		if (local10 != 0) {
			return arg2 ? -local10 : local10;
		} else if (arg4 == -1) {
			return 0;
		} else {
			@Pc(35) int local35 = Static243.method3910(arg3, arg5, arg4, arg1);
			return arg5 ? -local35 : local35;
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!eaa;IIILclient!cq;IIIIIII)V")
	public static void method7889(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class65 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		Static180.anInt3378 = arg7;
		Static296.anInt8193 = arg2;
		Static68.aClass150_1 = null;
		Static594.anInt9371 = arg10;
		Static327.anInt6070 = arg5;
		Static521.aClass150_3 = null;
		Static374.anInt6625 = arg8;
		Static494.aClass150_2 = null;
		Static110.aClass65_4 = arg4;
		Static295.anInt5406 = arg1;
		Static650.anInt10017 = arg9;
		Static541.anInt8830 = arg6;
		Static236.aClass92_5 = arg0;
		Static194.anInt6122 = arg3;
		Static83.method1776();
		Static573.aBoolean680 = true;
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(B)V")
	public static void method7890() {
		Static122.anInt2388 = -1;
		Static75.anInt1704 = -1;
		Static217.anInt4007 = -1;
		Static364.anInt6467 = 0;
	}
}
