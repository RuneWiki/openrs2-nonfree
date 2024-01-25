import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!dka", name = "e", descriptor = "Lclient!cq;")
	public static Class65 aClass65_4;

	@OriginalMember(owner = "client!dka", name = "f", descriptor = "Lclient!hn;")
	public static Class161 aClass161_1;

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "Z")
	public static final boolean aBoolean193 = false;

	@OriginalMember(owner = "client!dka", name = "c", descriptor = "[Lclient!daa;")
	public static final Class70[] aClass70Array1 = new Class70[8];

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(I)V")
	public static void method2095() {
		if (Static277.anInt5201 == -1) {
			return;
		}
		@Pc(11) int local11 = Static542.aClass75_1.method8412();
		@Pc(15) int local15 = Static542.aClass75_1.method8405();
		@Pc(20) Class3_Sub21 local20 = (Class3_Sub21) Static565.aClass193_55.method4457();
		if (local20 != null) {
			local11 = local20.method7977();
			local15 = local20.method7981();
		}
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		if (Static649.aBoolean735) {
			local32 = Static359.method5380();
			local34 = Static265.method7952();
		}
		Static512.method7237(local32, local32 + local11, Static277.anInt5201, local15 + local34, local15, Static654.anInt10064 + local32, local32, local11, local34, local34, Static483.anInt8181 + local34);
		if (Static647.aClass208_13 != null) {
			Static178.method2938(local34 + local15, local11 + local32);
		}
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(IB)V")
	public static void method2096(@OriginalArg(0) int arg0) {
		Static476.anInt8110 = -1;
		Static666.anInt10253 = 100;
		Static30.anInt914 = arg0;
		Static403.anInt6887 = 3;
	}
}
