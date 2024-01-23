import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
	public static int anInt4086;

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "[Lclient!r;")
	public static Class73[] aClass73Array8;

	@OriginalMember(owner = "client!tf", name = "i", descriptor = "Lclient!ff;")
	public static Class33 aClass33_16;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1375 = Static200.method3116(" <col=ffffff>");

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1377 = Static200.method3116("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1376 = aClass60_1377;

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1378 = Static200.method3116("(U1");

	@OriginalMember(owner = "client!tf", name = "l", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1379 = Static200.method3116("loc)3dat");

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IB)V")
	public static void method2987(@OriginalArg(0) int arg0) {
		if (arg0 == 37) {
			Static8.aDouble1 = 3.0D;
		} else if (arg0 == 50) {
			Static8.aDouble1 = 4.0D;
		} else if (arg0 == 75) {
			Static8.aDouble1 = 6.0D;
		} else {
			Static8.aDouble1 = 8.0D;
		}
		Static188.anInt4036 = -1;
		Static188.anInt4036 = -1;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)Lclient!bh;")
	public static Class1_Sub1_Sub4 method2988(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub1_Sub4 local6 = (Class1_Sub1_Sub4) Static201.aClass39_24.method1161((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(26) byte[] local26 = Static198.aClass7_37.method3242(Static129.method886(arg0), Static1.method27(arg0));
		local6 = new Class1_Sub1_Sub4();
		local6.anInt469 = arg0;
		if (local26 != null) {
			local6.method325(new Class1_Sub9(local26));
		}
		Static201.aClass39_24.method1152((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIII)V")
	public static void method2989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static124.anInt2763; local3++) {
			if (arg3 < Static1.anIntArray9[local3] + Static6.anIntArray20[local3] && arg2 + arg3 > Static6.anIntArray20[local3] && Static34.anIntArray123[local3] + Static91.anIntArray252[local3] > arg1 && Static34.anIntArray123[local3] < arg1 + arg0) {
				Static153.aBooleanArray19[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(BI)Lclient!oa;")
	public static Class1_Sub1_Sub18 method2990(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub18 local10 = (Class1_Sub1_Sub18) Static157.aClass39_19.method1161((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(26) byte[] local26 = Static165.aClass7_28.method3242(Static129.method928(arg0), Static1.method30(arg0));
		local10 = new Class1_Sub1_Sub18();
		local10.anInt3010 = arg0;
		if (local26 != null) {
			local10.method2301(new Class1_Sub9(local26));
		}
		local10.method2295();
		if (local10.anInt3027 != -1) {
			local10.method2296(method2990(local10.anInt3024), method2990(local10.anInt3027));
		}
		if (local10.anInt2987 != -1) {
			local10.method2291(method2990(local10.anInt3004), method2990(local10.anInt2987));
		}
		if (!Static217.aBoolean262 && local10.aBoolean164) {
			local10.aBoolean163 = false;
			local10.aClass60Array20 = null;
			local10.aClass60_1043 = Static184.aClass60_1331;
			local10.anInt2979 = 0;
			local10.aClass60Array21 = null;
		}
		Static157.aClass39_19.method1152((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!ai;Lclient!kh;Lclient!kh;I)Lclient!ch;")
	public static Class1_Sub1_Sub6 method2991(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) Class60 arg2) {
		@Pc(8) int local8 = arg0.method3222(arg2);
		@Pc(22) int local22 = arg0.method3240(arg1, local8);
		return Static184.method2912(local22, arg0, local8);
	}
}
