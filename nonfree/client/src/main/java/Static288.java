import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!qk", name = "z", descriptor = "I")
	public static int anInt4961;

	@OriginalMember(owner = "client!qk", name = "l", descriptor = "I")
	public static int anInt4949 = 0;

	@OriginalMember(owner = "client!qk", name = "t", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_177 = new Class48(44, 11);

	@OriginalMember(owner = "client!qk", name = "w", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_178 = new Class48(68, 15);

	@OriginalMember(owner = "client!qk", name = "x", descriptor = "I")
	public static int anInt4959 = -2;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IILclient!tr;ZILclient!tq;I)V")
	public static void method4360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class137 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class164 arg5) {
		if (arg3) {
			Static247.aClass51_11.method4669((Static136.anInt6304 - Static247.aClass51_11.method4682()) / 2, (Static218.anInt3871 - Static247.aClass51_11.method4673()) / 2);
			Static71.aClass51_2.method4669((Static136.anInt6304 - Static71.aClass51_2.method4682()) / 2, 18);
		}
		arg2.method5098(-1, arg0, Static136.anInt6304 / 2, (Static59.aClass94_3 == Static313.aClass94_8 ? Static209.aClass169_185 : Static172.aClass169_162).method3680(Static48.anInt952), Static218.anInt3871 / 2 - 26);
		@Pc(58) int local58 = Static218.anInt3871 / 2 - 18;
		arg5.method5382(Static136.anInt6304 / 2 - 152, local58, 304, 34, arg4, 0);
		arg5.method5382(Static136.anInt6304 / 2 - 151, local58 + 1, 302, 32, 0, 0);
		arg5.method5321(Static136.anInt6304 / 2 - 150, local58 + 2, Static302.anInt5151 * 3, 30, arg1, 0);
		arg5.method5321(Static136.anInt6304 / 2 + Static302.anInt5151 * 3 - 150, local58 - -2, 300 - Static302.anInt5151 * 3, 30, 0, 0);
		arg2.method5098(-1, arg0, Static136.anInt6304 / 2, Static71.aString10, Static218.anInt3871 / 2 + 4);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V")
	public static void method4361() {
		Static8.aClass17_1 = new Class17();
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)J")
	public static long method4363() {
		return Static379.aClass50_1.method5057();
	}
}
