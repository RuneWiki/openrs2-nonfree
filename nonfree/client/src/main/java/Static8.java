import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "D")
	public static double aDouble1;

	@OriginalMember(owner = "client!ah", name = "v", descriptor = "Lclient!kh;")
	public static Class60 aClass60_74 = Static200.method3116("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!ah", name = "M", descriptor = "Lclient!kh;")
	private static Class60 aClass60_78 = Static200.method3116("FULL");

	@OriginalMember(owner = "client!ah", name = "w", descriptor = "Lclient!kh;")
	public static Class60 aClass60_75 = aClass60_78;

	@OriginalMember(owner = "client!ah", name = "Fb", descriptor = "[Lclient!kh;")
	public static Class60[] aClass60Array2 = new Class60[100];

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB[Lclient!ah;)V")
	public static void method147(@OriginalArg(0) int arg0, @OriginalArg(2) Class6[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(14) Class6 local14 = arg1[local3];
			if (local14 != null) {
				if (local14.anInt233 == 0) {
					if (local14.aClass6Array1 != null) {
						method147(arg0, local14.aClass6Array1);
					}
					@Pc(35) Class1_Sub11 local35 = (Class1_Sub11) Static10.aClass33_1.method1071((long) local14.anInt229);
					if (local35 != null) {
						Static140.method2400(local35.anInt1626, arg0);
					}
				}
				@Pc(54) Class1_Sub8 local54;
				if (arg0 == 0 && local14.anObjectArray15 != null) {
					local54 = new Class1_Sub8();
					local54.aClass6_5 = local14;
					local54.anObjectArray29 = local14.anObjectArray15;
					Static93.method1622(local54);
				}
				if (arg0 == 1 && local14.anObjectArray21 != null) {
					if (local14.anInt242 >= 0) {
						@Pc(81) Class6 local81 = Static107.method1857(local14.anInt229);
						if (local81 == null || local81.aClass6Array1 == null || local81.aClass6Array1.length <= local14.anInt242 || local81.aClass6Array1[local14.anInt242] != local14) {
							continue;
						}
					}
					local54 = new Class1_Sub8();
					local54.anObjectArray29 = local14.anObjectArray21;
					local54.aClass6_5 = local14;
					Static93.method1622(local54);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)I")
	public static int method150(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(II)Z")
	public static boolean method151(@OriginalArg(0) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(IZ)V")
	public static void method159(@OriginalArg(0) int arg0) {
		Static1.anInt42 = arg0;
		Static188.anInt4036 = -1;
		Static188.anInt4036 = -1;
		Static129.method898();
	}
}
