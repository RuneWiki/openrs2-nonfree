import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!cl", name = "l", descriptor = "[I")
	public static int[] anIntArray94;

	@OriginalMember(owner = "client!cl", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString9;

	@OriginalMember(owner = "client!cl", name = "o", descriptor = "[I")
	public static int[] anIntArray95;

	@OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
	public static int anInt1054;

	@OriginalMember(owner = "client!cl", name = "k", descriptor = "Lclient!lg;")
	public static final Class149 aClass149_1 = new Class149(128);

	@OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
	public static int anInt1053 = -1;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)V")
	public static void method970() {
		Static3.anInt6324 = 0;
		@Pc(12) int local12 = Static206.anInt3592 + (Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6675 >> 7);
		@Pc(20) int local20 = (Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6677 >> 7) + Static99.anInt1814;
		if (local12 >= 3053 && local12 <= 3156 && local20 >= 3056 && local20 <= 3136) {
			Static3.anInt6324 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local20 >= 9492 && local20 <= 9535) {
			Static3.anInt6324 = 1;
		}
		if (Static3.anInt6324 == 1 && local12 >= 3139 && local12 <= 3199 && local20 >= 3008 && local20 <= 3062) {
			Static3.anInt6324 = 0;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIILclient!si;)V")
	public static void method975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub5 arg3) {
		@Pc(4) Class189 local4 = Static396.method5419(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass3_Sub5_1 = arg3;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IBII)I")
	public static int method977(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > arg2) {
			return arg1;
		} else if (arg0 >= arg2) {
			return arg2;
		} else {
			return arg0;
		}
	}
}
