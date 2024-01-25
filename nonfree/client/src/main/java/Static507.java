import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!uca", name = "X", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_177 = new Class40(109, 3);

	@OriginalMember(owner = "client!uca", name = "Bb", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_178 = new Class40(99, -1);

	@OriginalMember(owner = "client!uca", name = "Sb", descriptor = "[Lclient!fv;")
	public static final Class6_Sub1_Sub7[] aClass6_Sub1_Sub7Array4 = new Class6_Sub1_Sub7[14];

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!dga;B)Lclient!rda;")
	public static Class10_Sub3 method6969(@OriginalArg(0) Class6_Sub14 arg0) {
		@Pc(7) Class10 local7 = Static490.method6769(arg0);
		@Pc(11) int local11 = arg0.method6006();
		@Pc(15) int local15 = arg0.method6006();
		@Pc(19) int local19 = arg0.method6006();
		@Pc(23) int local23 = arg0.method6006();
		@Pc(34) int local34 = arg0.method6006();
		@Pc(38) int local38 = arg0.method6006();
		return new Class10_Sub3(local7.aClass277_10, local7.aClass137_13, local7.anInt7622, local7.anInt7626, local7.anInt7621, local7.anInt7623, local7.anInt7624, local11, local15, local19, local23, local34, local38);
	}

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "(B)V")
	public static void method6978() {
		Static136.method2051(Static369.aClass160_85);
		Static218.aClass6_Sub14_Sub2_1.method6035(Static354.method5293());
		Static218.aClass6_Sub14_Sub2_1.method5999(Static502.anInt8364);
		Static218.aClass6_Sub14_Sub2_1.method5999(Static476.anInt8045);
		Static218.aClass6_Sub14_Sub2_1.method6035(Static480.aClass6_Sub37_Sub1_1.anInt6052);
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIBI)V")
	public static void method6979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class6_Sub1_Sub5 local12 = Static77.method1176(arg1, 11);
		local12.method776();
		local12.anInt974 = arg2;
		local12.anInt972 = arg0;
	}
}
