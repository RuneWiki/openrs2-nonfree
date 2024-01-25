import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray13 = new String[5];

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
	public static void method2326() {
		for (@Pc(3) int local3 = 0; local3 < Static77.anInt1870; local3++) {
			@Pc(9) int local9 = Static2.anIntArray1[local3];
			@Pc(16) Class4_Sub44 local16 = (Class4_Sub44) Static80.aClass96_8.method2797((long) local9);
			if (local16 != null) {
				@Pc(21) Class11_Sub5_Sub2_Sub2 local21 = local16.aClass11_Sub5_Sub2_Sub2_2;
				Static467.method6342(local21, local21.aClass241_1.anInt7007);
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZLclient!wo;)Z")
	public static boolean method2327(@OriginalArg(1) Interface12 arg0) {
		@Pc(10) Class139 local10 = Static146.aClass228_1.method5203(arg0.method6320());
		if (local10.anInt4364 == -1) {
			return true;
		} else {
			@Pc(27) Class33 local27 = Static261.aClass8_4.method69(local10.anInt4364);
			return local27.anInt974 == -1 ? true : local27.method910();
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILclient!qa;I)V")
	public static void method2328(@OriginalArg(1) int arg0, @OriginalArg(2) Class30 arg1, @OriginalArg(3) int arg2) {
		Static182.aClass30_12 = arg1;
		Static195.aClass169ArrayArray2 = new Class169[arg0][arg2];
		if (Static130.anIntArray234 != null) {
			Static459.aClass41_6 = Static215.method3944(Static130.anIntArray234[5], Static130.anIntArray234[3], Static130.anIntArray234[1], Static130.anIntArray234[4], Static130.anIntArray234[2], Static130.anIntArray234[0]);
		}
		Static206.aClass169_2 = new Class169();
		Static437.method6004();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/lang/String;Lclient!ci;IZ)Lclient!op;")
	public static Class189 method2330(@OriginalArg(0) String arg0, @OriginalArg(1) Class38 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) int local10 = arg1.method1045(arg0);
		if (local10 == -1) {
			return new Class189(0);
		}
		@Pc(23) int[] local23 = arg1.method1024(local10);
		@Pc(34) Class189 local34 = new Class189(local23.length);
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		while (true) {
			while (local36 < local34.anInt5383) {
				@Pc(52) Class4_Sub20 local52 = new Class4_Sub20(arg1.method1039(local23[local38++], local10));
				@Pc(56) int local56 = local52.method4595();
				@Pc(60) int local60 = local52.method4560();
				@Pc(64) int local64 = local52.method4614();
				if (!arg2 && local64 == 1) {
					local34.anInt5383--;
				} else {
					local34.anIntArray441[local36] = local56;
					local34.anIntArray440[local36] = local60;
					local36++;
				}
			}
			return local34;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)Lclient!br;")
	public static Class4_Sub1_Sub5 method2331() {
		@Pc(8) Class4_Sub1_Sub5 local8 = (Class4_Sub1_Sub5) Static127.aClass252_2.method5697();
		if (local8 != null) {
			local8.method6330();
			local8.method5985();
			return local8;
		}
		do {
			local8 = (Class4_Sub1_Sub5) Static291.aClass252_9.method5697();
			if (local8 == null) {
				return null;
			}
			if (local8.method520() > Static167.method2929()) {
				return null;
			}
			local8.method6330();
			local8.method5985();
		} while ((local8.aLong219 & Long.MIN_VALUE) == 0L);
		return local8;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(II)V")
	public static void method2332() {
		@Pc(5) Class83 local5 = Static199.aClass83_5;
		synchronized (Static199.aClass83_5) {
			Static199.aClass83_5.method2345(5);
		}
		local5 = Static164.aClass83_24;
		synchronized (Static164.aClass83_24) {
			Static164.aClass83_24.method2345(5);
		}
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)V")
	public static void method2333() {
		if (Static70.anInt1726 == 6) {
			Static91.method1815(false);
		} else {
			Static204.aClass13_2 = Static172.aClass13_1;
			Static172.aClass13_1 = null;
			Static382.method3540(12);
		}
	}
}
