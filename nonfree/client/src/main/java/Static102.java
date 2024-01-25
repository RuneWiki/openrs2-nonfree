import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!eaa", name = "e", descriptor = "F")
	public static float aFloat16;

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Z[BB)V")
	public static void method1743(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		if (Static72.aClass1_Sub6_1 == null) {
			Static72.aClass1_Sub6_1 = new Class1_Sub6(20000);
		}
		Static72.aClass1_Sub6_1.method3940(arg1, arg1.length);
		if (!arg0) {
			return;
		}
		Static66.method1185(Static72.aClass1_Sub6_1.aByteArray66);
		Static234.aClass185_Sub1Array1 = new Class185_Sub1[Static491.anInt8153];
		@Pc(31) int local31 = 0;
		for (@Pc(33) int local33 = Static372.anInt6840; local33 <= Static538.anInt9101; local33++) {
			@Pc(39) Class185_Sub1 local39 = Static33.method780(local33);
			if (local39 != null) {
				Static234.aClass185_Sub1Array1[local31++] = local39;
			}
		}
		Static333.aBoolean637 = false;
		Static13.aLong21 = Static60.method1119();
		Static72.aClass1_Sub6_1 = null;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BLclient!ge;)Lclient!ar;")
	public static Class1_Sub3 method1744(@OriginalArg(1) Class1_Sub6 arg0) {
		arg0.method3922();
		@Pc(20) int local20 = arg0.method3922();
		@Pc(26) Class1_Sub3 local26 = Static472.method6572(local20);
		local26.anInt8686 = arg0.method3922();
		@Pc(37) int local37 = arg0.method3922();
		for (@Pc(39) int local39 = 0; local39 < local37; local39++) {
			@Pc(45) int local45 = arg0.method3922();
			local26.method7121(arg0, local45);
		}
		local26.method7126();
		return local26;
	}
}
