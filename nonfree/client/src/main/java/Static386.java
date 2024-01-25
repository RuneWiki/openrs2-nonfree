import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!pr", name = "p", descriptor = "Z")
	public static boolean aBoolean562 = false;

	@OriginalMember(owner = "client!pr", name = "t", descriptor = "Lclient!oca;")
	public static final Class225 aClass225_20 = new Class225(4, 1, 1, 1);

	@OriginalMember(owner = "client!pr", name = "C", descriptor = "[S")
	public static final short[] aShortArray107 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)V")
	public static void method6841(@OriginalArg(1) int arg0) {
		@Pc(12) Class12_Sub4_Sub1 local12 = Static389.method6156(7, arg0);
		local12.method823();
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZLclient!mc;)V")
	public static void method6842(@OriginalArg(1) Class198 arg0) {
		if (!Static73.aBoolean136) {
			return;
		}
		if (arg0.anObjectArray29 != null) {
			@Pc(23) Class198 local23 = Static428.method6579(Static155.anInt3381, Static148.anInt6865);
			if (local23 != null) {
				@Pc(29) Class12_Sub6 local29 = new Class12_Sub6();
				local29.aClass198_2 = arg0;
				local29.aClass198_1 = local23;
				local29.anObjectArray2 = arg0.anObjectArray29;
				Static312.method5029(local29);
			}
		}
		Static332.method5312(Static54.aClass77_11);
		Static383.aClass12_Sub8_Sub2_1.method5223(arg0.anInt5739);
		Static383.aClass12_Sub8_Sub2_1.method5215(Static514.anInt1498);
		Static383.aClass12_Sub8_Sub2_1.method5182(arg0.anInt5705);
		Static383.aClass12_Sub8_Sub2_1.method5174(Static155.anInt3381);
		Static383.aClass12_Sub8_Sub2_1.method5197(Static148.anInt6865);
		Static383.aClass12_Sub8_Sub2_1.method5190(arg0.anInt5726);
	}
}
