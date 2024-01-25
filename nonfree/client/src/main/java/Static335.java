import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!qu", name = "h", descriptor = "I")
	public static int anInt5453;

	@OriginalMember(owner = "client!qu", name = "j", descriptor = "[Lclient!fe;")
	public static Class19_Sub1[] aClass19_Sub1Array2;

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "Lclient!ni;")
	public static final Class169 aClass169_7 = new Class169();

	@OriginalMember(owner = "client!qu", name = "k", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_89 = new Class2(4, 3);

	@OriginalMember(owner = "client!qu", name = "l", descriptor = "[I")
	public static final int[] anIntArray495 = new int[32];

	@OriginalMember(owner = "client!qu", name = "m", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_121 = new Class253(39, 8);

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;")
	public static Object method4376(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static41.aBoolean35) {
			try {
				@Pc(18) Class47 local18 = (Class47) Class.forName("Class47_Sub1").getDeclaredConstructor().newInstance();
				local18.method853(arg0);
				return local18;
			} catch (@Pc(27) Throwable local27) {
				Static41.aBoolean35 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(BI)V")
	public static void method4377(@OriginalArg(1) int arg0) {
		Static237.anInt4069 = arg0;
		Static339.anInt5508 = 3;
		Static54.anInt935 = -1;
		Static129.anInt2479 = 100;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIIZI)V")
	public static void method4379(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static421.aLong210 = 0L;
		@Pc(8) int local8 = Static120.method1994();
		if (arg0 == 3 || local8 == 3) {
			arg2 = true;
		}
		if (!Static269.aClass51_9.method5342()) {
			arg2 = true;
		}
		Static264.method3569(local8, arg3, arg0, arg2, arg1);
	}
}
