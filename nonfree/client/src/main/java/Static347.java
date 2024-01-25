import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!ku", name = "y", descriptor = "Ljava/lang/Object;")
	public static Object anObject13;

	@OriginalMember(owner = "client!ku", name = "v", descriptor = "I")
	public static int anInt2639 = 765;

	@OriginalMember(owner = "client!ku", name = "e", descriptor = "(I)V")
	public static void method2336() {
		if (!Static175.aBoolean765) {
			Static175.aBoolean765 = true;
			Static144.aFloat56 += (24.0F - Static144.aFloat56) / 2.0F;
			Static71.aBoolean90 = true;
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IIIILclient!jg;)V")
	public static void method2340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class19_Sub1_Sub4 arg4) {
		@Pc(4) Class262 local4 = Static512.method7319(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		arg4.anInt11204 = (arg1 << Static394.anInt7067) + Static198.anInt3490;
		arg4.anInt11208 = arg3;
		arg4.anInt11211 = (arg2 << Static394.anInt7067) + Static198.anInt3490;
		local4.aClass19_Sub1_Sub4_1 = arg4;
		@Pc(36) int local36 = Static639.aClass313Array2 == Static711.aClass313Array3 ? 1 : 0;
		if (arg4.method9366()) {
			if (arg4.method9360()) {
				arg4.aClass19_Sub1_25 = Static358.aClass19_Sub1Array2[local36];
				Static358.aClass19_Sub1Array2[local36] = arg4;
				return;
			}
			arg4.aClass19_Sub1_25 = Static660.aClass19_Sub1Array5[local36];
			Static660.aClass19_Sub1Array5[local36] = arg4;
			Static70.aBoolean89 = true;
			return;
		}
		arg4.aClass19_Sub1_25 = Static634.aClass19_Sub1Array4[local36];
		Static634.aClass19_Sub1Array4[local36] = arg4;
	}
}
