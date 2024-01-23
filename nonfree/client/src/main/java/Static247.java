import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!sc", name = "r", descriptor = "I")
	public static int anInt4859;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "[I")
	public static int[] anIntArray387 = new int[14];

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString162 = " has logged in.";

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "Z")
	public static boolean aBoolean309 = false;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString163 = "green:";

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method3791(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)I")
	public static int method3792(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)Z")
	public static boolean method3793() {
		@Pc(6) Class45 local6 = Static232.aClass45_1;
		synchronized (Static232.aClass45_1) {
			if (Static268.anInt5352 == Static92.anInt1844) {
				return false;
			} else {
				Static89.anInt1799 = Static295.anIntArray461[Static92.anInt1844];
				Static254.aChar4 = Static170.aCharArray3[Static92.anInt1844];
				Static92.anInt1844 = Static92.anInt1844 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIBIZII)V")
	public static void method3794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static158.anInt3234 = arg0;
		Static65.anInt5705 = arg2;
		Static158.anInt3240 = arg4;
		Static89.anInt1797 = arg1;
		Static199.anInt2996 = arg5;
		if (arg3 && Static158.anInt3240 >= 100) {
			Static248.anInt4865 = Static65.anInt5705 * 128 + 64;
			Static71.anInt1457 = Static89.anInt1797 * 128 + 64;
			Static153.anInt3111 = Static58.method2504(Static248.anInt4865, Static71.anInt1457, Static222.anInt4467) - Static199.anInt2996;
		}
		Static99.anInt1946 = 2;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IILclient!we;BII)Ljava/awt/Frame;")
	public static Frame method3795(@OriginalArg(0) int arg0, @OriginalArg(2) Class184 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (!arg1.method4603()) {
			return null;
		}
		@Pc(26) Class188[] local26 = Static48.method947(arg1);
		if (local26 == null) {
			return null;
		}
		@Pc(32) boolean local32 = false;
		for (@Pc(34) int local34 = 0; local34 < local26.length; local34++) {
			if (local26[local34].anInt5872 == arg2 && arg3 == local26[local34].anInt5873 && (!local32 || arg0 < local26[local34].anInt5866)) {
				arg0 = local26[local34].anInt5866;
				local32 = true;
			}
		}
		if (!local32) {
			return null;
		}
		@Pc(98) Class119 local98 = arg1.method4622(arg2, arg0, arg3);
		while (local98.anInt3695 == 0) {
			Static193.method3169(10L);
		}
		@Pc(113) Frame local113 = (Frame) local98.anObject4;
		if (local113 == null) {
			return null;
		} else if (local98.anInt3695 == 2) {
			Static157.method261(arg1, local113);
			return null;
		} else {
			return local113;
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V")
	public static void method3797() {
		Static86.aClass4_Sub2_Sub9_3 = null;
		Static91.aClass4_Sub2_Sub4Array5 = null;
		Static131.aClass4_Sub2_Sub9_2 = null;
		Static4.aClass4_Sub2_Sub4_Sub2Array1 = null;
		Static94.aClass4_Sub2_Sub9_Sub2_1 = null;
		Static156.aClass4_Sub2_Sub9_4 = null;
		Static110.aClass4_Sub2_Sub4Array6 = null;
		Static276.aClass4_Sub2_Sub4Array10 = null;
		Static161.aClass4_Sub2_Sub4Array9 = null;
		Static133.aClass4_Sub2_Sub4Array8 = null;
		Static261.aClass4_Sub2_Sub4_10 = null;
		Static84.aClass4_Sub2_Sub4Array3 = null;
		Static111.aClass4_Sub2_Sub4Array7 = null;
		Static226.aClass58Array3 = null;
		Static55.aClass4_Sub2_Sub4Array1 = null;
		Static89.aClass4_Sub2_Sub4Array4 = null;
		Static122.aClass4_Sub2_Sub4_5 = null;
		Static303.aClass58Array5 = null;
		Static71.aClass4_Sub2_Sub4Array2 = null;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)Lclient!ig;")
	public static Class74 method3798(@OriginalArg(0) int arg0) {
		@Pc(6) Class74 local6 = (Class74) Static262.aClass172_43.method4347((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(22) byte[] local22 = Static174.aClass22_62.method665(0, arg0);
		local6 = new Class74();
		if (local22 != null) {
			local6.method1910(new Class4_Sub24(local22));
		}
		local6.method1914();
		Static262.aClass172_43.method4345(local6, (long) arg0);
		return local6;
	}
}
