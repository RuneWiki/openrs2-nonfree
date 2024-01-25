import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
	public static int anInt907;

	@OriginalMember(owner = "client!ch", name = "A", descriptor = "Lclient!vh;")
	public static Class250 aClass250_10;

	@OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
	public static int anInt908 = 0;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILjava/lang/String;II)V")
	public static void method816(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class219 local8 = Static78.method1356(arg3, arg2);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray21 != null) {
			@Pc(18) Class1_Sub6 local18 = new Class1_Sub6();
			local18.aString8 = arg1;
			local18.anObjectArray3 = local8.anObjectArray21;
			local18.anInt1465 = arg0;
			local18.aClass219_4 = local8;
			Static104.method1608(local18);
		}
		@Pc(35) boolean local35 = true;
		if (local8.anInt6384 != 0) {
			local35 = Static363.method4991(local8);
		}
		if (!local35 || !Static53.method916(local8).method5788(arg0 - 1)) {
			return;
		}
		if (arg0 == 1) {
			Static55.method989(Static212.aClass131_14);
			Static340.method4800(local8.anInt6421, arg3, arg2);
		}
		if (arg0 == 2) {
			Static55.method989(Static400.aClass131_176);
			Static340.method4800(local8.anInt6421, arg3, arg2);
		}
		if (arg0 == 3) {
			Static55.method989(Static141.aClass131_70);
			Static340.method4800(local8.anInt6421, arg3, arg2);
		}
		if (arg0 == 4) {
			Static55.method989(Static285.aClass131_195);
			Static340.method4800(local8.anInt6421, arg3, arg2);
		}
		if (arg0 == 5) {
			Static55.method989(Static128.aClass131_69);
			Static340.method4800(local8.anInt6421, arg3, arg2);
		}
		if (arg0 == 6) {
			Static55.method989(Static358.aClass131_153);
			Static340.method4800(local8.anInt6421, arg3, arg2);
		}
		if (arg0 == 7) {
			Static55.method989(Static434.aClass131_186);
			Static340.method4800(local8.anInt6421, arg3, arg2);
		}
		if (arg0 == 8) {
			Static55.method989(Static221.aClass131_107);
			Static340.method4800(local8.anInt6421, arg3, arg2);
		}
		if (arg0 == 9) {
			Static55.method989(Static399.aClass131_175);
			Static340.method4800(local8.anInt6421, arg3, arg2);
		}
		if (arg0 == 10) {
			Static55.method989(Static317.aClass131_95);
			Static340.method4800(local8.anInt6421, arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIZI)V")
	public static void method817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= Static83.anInt7380 && Static221.anInt4001 >= arg0) {
			@Pc(19) int local19 = Static85.method1427(Static212.anInt452, arg1, Static305.anInt5429);
			@Pc(25) int local25 = Static85.method1427(Static212.anInt452, arg3, Static305.anInt5429);
			Static345.method4826(local25, local19, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(B)V")
	public static void method818() {
		Static191.aClass83_30.method1667();
		Static361.aClass83_52.method1667();
		Static158.aClass83_25.method1667();
		Static40.aClass83_6.method1667();
		Static72.aClass83_12.method1667();
	}
}
