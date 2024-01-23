import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
	public static int anInt2690;

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
	public static int anInt2693;

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
	public static int anInt2692 = 0;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIBI)V")
	public static void method2288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(41) String local41 = "::tele " + arg0 + "," + (arg2 >> 6) + "," + (arg1 >> 6) + "," + (arg2 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local41);
		Static67.method4887(local41);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!t;B)V")
	public static void method2289(@OriginalArg(0) Class36_Sub3 arg0) {
		@Pc(9) int local9 = arg0.anInt5121 - Static148.anInt3168;
		@Pc(21) int local21 = arg0.anInt5144 * 128 + arg0.method4097() * 64;
		@Pc(32) int local32 = arg0.anInt5104 * 128 + arg0.method4097() * 64;
		if (arg0.anInt5130 == 0) {
			arg0.anInt5063 = 1024;
		}
		arg0.anInt5109 += (local32 - arg0.anInt5109) / local9;
		arg0.anInt5093 += (local21 - arg0.anInt5093) / local9;
		arg0.anInt5137 = 0;
		if (arg0.anInt5130 == 1) {
			arg0.anInt5063 = 1536;
		}
		if (arg0.anInt5130 == 2) {
			arg0.anInt5063 = 0;
		}
		if (arg0.anInt5130 == 3) {
			arg0.anInt5063 = 512;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)Lclient!fk;")
	public static Class57 method2290(@OriginalArg(0) int arg0) {
		@Pc(6) Class57 local6 = (Class57) Static237.aClass46_32.method1074((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(26) byte[] local26 = Static114.aClass84_27.method2127(arg0, 4);
		local6 = new Class57();
		if (local26 != null) {
			local6.method1372(new Class2_Sub26(local26), arg0);
		}
		Static237.aClass46_32.method1071(local6, (long) arg0);
		return local6;
	}
}
