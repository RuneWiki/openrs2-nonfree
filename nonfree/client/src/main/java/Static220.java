import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!ifa", name = "i", descriptor = "I")
	public static int anInt4592;

	@OriginalMember(owner = "client!ifa", name = "h", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_149 = new Class123(57, 8);

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ZJ)V")
	public static void method3680(@OriginalArg(1) long arg0) {
		@Pc(6) Class3_Sub10 local6 = Static271.method4111();
		local6.aClass3_Sub26_Sub1_1.method6809(Static556.aClass126_36.anInt4274);
		local6.aClass3_Sub26_Sub1_1.method6782(arg0);
		local6.aClass3_Sub26_Sub1_1.method6809(Static201.anInt4321);
		Static193.method3398(local6);
		Static560.anInt9754 = 0;
		Static36.anInt1076 = -3;
		Static318.anInt5854 = 1;
		Static79.anInt2120 = 0;
	}

	@OriginalMember(owner = "client!ifa", name = "b", descriptor = "(I)Lclient!dda;")
	public static Class25_Sub3 method3682() {
		@Pc(14) Class25_Sub3 local14 = (Class25_Sub3) Static463.aClass269_8.method5978();
		if (local14 == null) {
			return new Class25_Sub3();
		} else {
			Static156.anInt3544--;
			return local14;
		}
	}
}
