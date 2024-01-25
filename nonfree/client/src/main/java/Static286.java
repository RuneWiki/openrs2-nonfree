import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!jka", name = "e", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_96 = new Class126(79, -1);

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(ILclient!ha;IIIIII)V")
	public static void method4506(@OriginalArg(0) int arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4) {
		Static535.aClass16_10 = arg1;
		Static576.aClass25_8 = Static535.aClass16_10.method8178();
		Static177.aClass25_1 = Static535.aClass16_10.method8178();
		Static273.aClass25_3 = Static535.aClass16_10.method8178();
		Static638.anInt9840 = 0;
		Static418.anInt7055 = 1;
		Static552.anInt8938 = arg0;
		Static632.anInterface8_1 = null;
		Static138.anInt2604 = 2;
		Static450.anInt7726 = 2;
		Static125.anInt2416 = 0;
		Static502.anInt8445 = arg4;
		Static113.method2117(arg3, arg2);
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(IIIZ)V")
	public static void method4510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class3_Sub6_Sub7 local9 = Static198.method3146((long) arg1, 9);
		local9.method1712();
		local9.anInt1790 = arg0;
		local9.anInt1782 = arg2;
	}
}
