import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!kfa", name = "f", descriptor = "Lclient!tf;")
	public static Class17 aClass17_68;

	@OriginalMember(owner = "client!kfa", name = "g", descriptor = "J")
	public static long aLong264;

	@OriginalMember(owner = "client!kfa", name = "c", descriptor = "Lclient!tja;")
	public static final Class352 aClass352_65 = new Class352(4);

	@OriginalMember(owner = "client!kfa", name = "d", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_137 = new Class216(77, 8);

	@OriginalMember(owner = "client!kfa", name = "e", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_199 = new Class151(94, 16);

	@OriginalMember(owner = "client!kfa", name = "h", descriptor = "Z")
	public static boolean aBoolean718 = false;

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "()V")
	public static void method7788() {
		for (@Pc(1) int local1 = 0; local1 < Static239.anInt3959; local1++) {
			@Pc(6) Class3_Sub1_Sub2 local6 = Static321.aClass3_Sub1_Sub2Array1[local1];
			Static63.method1388(local6, true);
			Static321.aClass3_Sub1_Sub2Array1[local1] = null;
		}
		Static239.anInt3959 = 0;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lclient!qb;B)Z")
	public static boolean method7789(@OriginalArg(0) Interface20 arg0) {
		@Pc(10) Class342 local10 = Static441.aClass74_169.method2075(arg0.method7087());
		if (local10.anInt8713 == -1) {
			return true;
		} else {
			@Pc(22) Class318 local22 = Static623.aClass132_4.method2915(local10.anInt8713);
			return local22.anInt8100 == -1 ? true : local22.method7054();
		}
	}
}
