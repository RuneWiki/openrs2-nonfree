import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!kj", name = "p", descriptor = "Lclient!p;")
	public static Class133 aClass133_5;

	@OriginalMember(owner = "client!kj", name = "q", descriptor = "F")
	public static float aFloat32;

	@OriginalMember(owner = "client!kj", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString100 = "Loaded fonts";

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IFIIZIII)[I")
	public static int[] method2303(@OriginalArg(1) float arg0) {
		@Pc(12) int[] local12 = new int[2048];
		@Pc(16) Class1_Sub2_Sub33 local16 = new Class1_Sub2_Sub33();
		local16.anInt5214 = (int) (arg0 * 4096.0F);
		local16.anInt5215 = 8;
		local16.anInt5210 = 4;
		local16.aBoolean372 = true;
		local16.anInt5206 = 35;
		local16.anInt5213 = 8;
		local16.method4578();
		Static68.method1140(2048, 1);
		local16.method4040(0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "([BB)Lclient!mn;")
	public static Class1_Sub1_Sub14 method2304(@OriginalArg(0) byte[] arg0) {
		@Pc(9) Class1_Sub1_Sub14 local9 = new Class1_Sub1_Sub14();
		@Pc(14) Class1_Sub14 local14 = new Class1_Sub14(arg0);
		local14.anInt3290 = local14.aByteArray34.length - 2;
		@Pc(25) int local25 = local14.method2593();
		@Pc(35) int local35 = local14.aByteArray34.length - local25 - 2 - 12;
		local14.anInt3290 = local35;
		@Pc(42) int local42 = local14.method2647();
		local9.anInt3626 = local14.method2593();
		local9.anInt3632 = local14.method2593();
		local9.anInt3634 = local14.method2593();
		local9.anInt3631 = local14.method2593();
		@Pc(71) int local71 = local14.method2595();
		@Pc(80) int local80;
		@Pc(91) int local91;
		if (local71 > 0) {
			local9.aClass156Array1 = new Class156[local71];
			for (local80 = 0; local80 < local71; local80++) {
				local91 = local14.method2593();
				@Pc(98) Class156 local98 = new Class156(Static203.method3254(local91));
				local9.aClass156Array1[local80] = local98;
				while (local91-- > 0) {
					@Pc(110) int local110 = local14.method2647();
					@Pc(114) int local114 = local14.method2647();
					local98.method3816((long) local110, new Class1_Sub13(local114));
				}
			}
		}
		local14.anInt3290 = 0;
		local80 = 0;
		local9.aString113 = local14.method2632();
		local9.aStringArray32 = new String[local42];
		local9.anIntArray287 = new int[local42];
		local9.anIntArray288 = new int[local42];
		while (local14.anInt3290 < local35) {
			local91 = local14.method2593();
			if (local91 == 3) {
				local9.aStringArray32[local80] = local14.method2605().intern();
			} else if (local91 >= 100 || local91 == 21 || local91 == 38 || local91 == 39) {
				local9.anIntArray288[local80] = local14.method2595();
			} else {
				local9.anIntArray288[local80] = local14.method2647();
			}
			local9.anIntArray287[local80++] = local91;
		}
		return local9;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!sb;Z)V")
	public static void method2305(@OriginalArg(0) Class1_Sub14 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static198.anInt3992; local7++) {
			@Pc(18) int local18 = arg0.method2648();
			@Pc(22) int local22 = arg0.method2593();
			if (local22 == 65535) {
				local22 = -1;
			}
			if (Static219.aClass182_Sub1Array2[local18] != null) {
				Static219.aClass182_Sub1Array2[local18].anInt5529 = local22;
			}
		}
	}
}
