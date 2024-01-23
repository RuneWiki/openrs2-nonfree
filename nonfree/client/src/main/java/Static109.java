import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!kc", name = "N", descriptor = "I")
	public static int anInt2419;

	@OriginalMember(owner = "client!kc", name = "J", descriptor = "I")
	public static int anInt2416 = 0;

	@OriginalMember(owner = "client!kc", name = "Q", descriptor = "Lclient!qe;")
	public static Class78 aClass78_519 = Static199.method3560("(U2");

	@OriginalMember(owner = "client!kc", name = "R", descriptor = "Lclient!qe;")
	public static Class78 aClass78_520 = Static199.method3560("::fpsoff");

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZLclient!mj;)V")
	public static void method1892(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class64 arg1) {
		@Pc(15) int local15 = arg1.anInt3074 == 0 ? arg1.anInt3021 : arg1.anInt3074;
		@Pc(24) int local24 = arg1.anInt3082 == 0 ? arg1.anInt3040 : arg1.anInt3082;
		Static212.method3691(local24, arg1.anInt3044, arg0, local15, Static181.aClass64ArrayArray1[arg1.anInt3044 >> 16]);
		if (arg1.aClass64Array2 != null) {
			Static212.method3691(local24, arg1.anInt3044, arg0, local15, arg1.aClass64Array2);
		}
		@Pc(61) Class2_Sub11 local61 = (Class2_Sub11) Static12.aClass103_4.method3659((long) arg1.anInt3044);
		if (local61 != null) {
			Static195.method3542(local24, arg0, local61.anInt726, local15);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IB)Z")
	public static boolean method1893(@OriginalArg(0) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "(I)[Lclient!qg;")
	public static Class79_Sub1[] method1894() {
		@Pc(13) Class79_Sub1[] local13 = new Class79_Sub1[Static113.anInt2492];
		for (@Pc(15) int local15 = 0; local15 < Static113.anInt2492; local15++) {
			local13[local15] = new Class79_Sub1(Static142.anInt3236, Static100.anInt2184, Static186.anIntArray702[local15], Static37.anIntArray108[local15], Static113.anIntArray423[local15], Static131.anIntArray489[local15], Static31.aByteArrayArray3[local15], Static198.anIntArray725);
		}
		Static28.method365();
		return local13;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)V")
	public static void method1896(@OriginalArg(1) int arg0) {
		Static97.anInt2135 = arg0;
		Static103.anInt2272 = 50;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZZIZI)Lclient!rd;")
	public static Class72_Sub1 method1897(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(5) Class88 local5 = null;
		if (Static177.aClass99_3 != null) {
			local5 = new Class88(arg3, Static177.aClass99_3, Static188.aClass99Array1[arg3], 1000000);
		}
		return new Class72_Sub1(local5, Static211.aClass88_4, arg3, arg1, arg0, arg2);
	}
}
