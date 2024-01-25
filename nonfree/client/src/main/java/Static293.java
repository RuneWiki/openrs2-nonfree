import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_47 = new Class344(19, 4);

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "F")
	public static float aFloat151 = 1.0F;

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_48 = new Class344(83, 4);

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
	public static int anInt5987 = -1;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIZ)Lclient!ph;")
	public static Class4_Sub39 method4724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class4_Sub39 local5 = null;
		if (arg2 == 0) {
			local5 = Static32.method999(Static402.aClass356_1, Static303.aClass344_49);
		}
		if (arg2 == 1) {
			local5 = Static32.method999(Static402.aClass356_1, Static419.aClass344_72);
		}
		local5.aClass4_Sub13_Sub2_1.method7051(Static38.aClass174_1.method4090(82) ? 1 : 0);
		local5.aClass4_Sub13_Sub2_1.method7001(Static242.anInt10133 + arg1);
		local5.aClass4_Sub13_Sub2_1.method6999(arg0 + Static157.anInt3323);
		Static401.aBoolean564 = false;
		Static226.anInt4729 = arg0;
		Static384.anInt7552 = arg1;
		Static2.method7();
		return local5;
	}
}
