import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "I")
	public static int anInt4146;

	@OriginalMember(owner = "client!hs", name = "f", descriptor = "Lclient!nd;")
	public static Class238 aClass238_106;

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "I")
	public static int anInt4144 = 100;

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method3605(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(9) int local9 = 0; local9 < Static289.anInt5236; local9++) {
			if (arg0.equalsIgnoreCase(Static514.aStringArray44[local9])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aString82);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(BLclient!bi;)V")
	public static void method3609(@OriginalArg(1) Class13_Sub2 arg0) {
		@Pc(12) byte[] local12;
		if (Static10.anObject1 == null) {
			@Pc(5) Class44_Sub1_Sub2 local5 = new Class44_Sub1_Sub2();
			local12 = local5.method3266();
			Static10.anObject1 = Static325.method4947(local12);
		}
		if (Static237.anObject7 == null) {
			@Pc(31) Class44_Sub2_Sub1 local31 = new Class44_Sub2_Sub1();
			local12 = local31.method6361();
			Static237.anObject7 = Static325.method4947(local12);
		}
		@Pc(46) Class185 local46 = arg0.aClass185_1;
		if (local46.method4469() && Static579.anObject23 == null) {
			local12 = Static415.method6259(0.6F, 0.5F, 4.0F, 16.0F, new Class310_Sub1(419684), 4.0F);
			Static579.anObject23 = Static325.method4947(local12);
		}
	}
}
