import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!cga", name = "g", descriptor = "Lclient!cc;")
	public static Class42 aClass42_2;

	@OriginalMember(owner = "client!cga", name = "e", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_2 = new Class40(56, -2);

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(IZI)Lclient!dca;")
	public static Class6_Sub13 method44(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) long local12 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
		return (Class6_Sub13) Static373.aClass212_27.method5106(local12);
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(Lclient!fca;B)V")
	public static void method45(@OriginalArg(0) Class97 arg0) {
		@Pc(15) Class97 local15 = Static299.method4155(arg0);
		@Pc(21) int local21;
		@Pc(19) int local19;
		if (local15 == null) {
			local19 = Static476.anInt8045;
			local21 = Static502.anInt8364;
		} else {
			local21 = local15.anInt2340;
			local19 = local15.anInt2305;
		}
		Static84.method1342(arg0, local19, local21, false);
		Static199.method2986(local19, local21, arg0);
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(ZZ)V")
	public static void method46(@OriginalArg(0) boolean arg0) {
		Static286.method4060(Static487.anInt8139, Static476.anInt8045, Static502.anInt8364, arg0);
	}
}
