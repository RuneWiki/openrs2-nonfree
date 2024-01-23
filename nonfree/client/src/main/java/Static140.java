import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
	public static int anInt2782;

	@OriginalMember(owner = "client!kj", name = "m", descriptor = "Z")
	public static boolean aBoolean230 = false;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)Lclient!sm;")
	public static Class8_Sub1_Sub18 method2220(@OriginalArg(0) int arg0) {
		@Pc(6) Class8_Sub1_Sub18 local6 = (Class8_Sub1_Sub18) Static86.aClass125_24.method2957((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(26) byte[] local26 = Static224.aClass132_77.method3194(Static168.method4151(arg0), Static20.method366(arg0));
		local6 = new Class8_Sub1_Sub18();
		if (local26 != null) {
			local6.method3683(new Class8_Sub2(local26));
		}
		Static86.aClass125_24.method2956((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIII)V")
	public static void method2221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static172.anInt3426 == 0 || arg0 == 0 || Static156.anInt3156 >= 50 || arg3 == -1) {
			return;
		}
		Static113.anIntArray188[Static156.anInt3156] = arg3;
		Static42.anIntArray64[Static156.anInt3156] = arg0;
		Static157.anIntArray497[Static156.anInt3156] = arg1;
		Static55.aClass104Array1[Static156.anInt3156] = null;
		Static102.anIntArray151[Static156.anInt3156] = 0;
		Static52.anIntArray81[Static156.anInt3156] = arg2;
		Static156.anInt3156++;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZI)Lclient!ai;")
	public static Class10 method2222(@OriginalArg(1) int arg0) {
		@Pc(10) Class10 local10 = (Class10) Static270.aClass61_51.method1384((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static120.aClass132_42.method3194(Static101.method1615(arg0), Static68.method1239(arg0));
		local10 = new Class10();
		local10.anInt118 = arg0;
		if (local25 != null) {
			local10.method97(new Class8_Sub2(local25));
		}
		local10.method98();
		if (local10.anInt139 != -1) {
			local10.method87(method2222(local10.anInt139), method2222(local10.anInt132));
		}
		if (local10.anInt129 != -1) {
			local10.method88(method2222(local10.anInt129), method2222(local10.anInt110));
		}
		if (!Static53.aBoolean84 && local10.aBoolean13) {
			local10.aStringArray2 = Static153.aStringArray43;
			local10.aBoolean12 = false;
			local10.aString13 = Static39.aString37;
			local10.aStringArray1 = Static180.aStringArray53;
			local10.anInt141 = 0;
		}
		Static270.aClass61_51.method1377((long) arg0, local10);
		return local10;
	}
}
