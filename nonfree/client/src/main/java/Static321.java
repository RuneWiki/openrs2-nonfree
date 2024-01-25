import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_212 = new Class179(63, -2);

	@OriginalMember(owner = "client!ku", name = "g", descriptor = "J")
	public static long aLong159 = 0L;

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(BLclient!gga;)V")
	public static void method4602(@OriginalArg(1) Class6_Sub23 arg0) {
		@Pc(9) int local9 = arg0.method8404();
		Static218.aClass309Array1 = new Class309[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static218.aClass309Array1[local14] = new Class309();
			Static218.aClass309Array1[local14].anInt8649 = arg0.method8404();
			Static218.aClass309Array1[local14].aString119 = arg0.method8379();
		}
		Static247.anInt4319 = arg0.method8404();
		Static182.anInt3140 = arg0.method8404();
		Static127.anInt1400 = arg0.method8404();
		Static473.aClass235_Sub1Array1 = new Class235_Sub1[Static182.anInt3140 + 1 - Static247.anInt4319];
		for (@Pc(65) int local65 = 0; local65 < Static127.anInt1400; local65++) {
			@Pc(71) int local71 = arg0.method8404();
			@Pc(79) Class235_Sub1 local79 = Static473.aClass235_Sub1Array1[local71] = new Class235_Sub1();
			local79.anInt6472 = arg0.method8374();
			local79.anInt6469 = arg0.method8369();
			local79.anInt6483 = local71 + Static247.anInt4319;
			local79.aString89 = arg0.method8379();
			local79.aString90 = arg0.method8379();
		}
		Static65.anInt1208 = arg0.method8369();
		Static328.aBoolean622 = true;
	}
}
