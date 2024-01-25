import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!gr", name = "e", descriptor = "Lclient!ic;")
	public static Class61 aClass61_3;

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray34 = new String[100];

	@OriginalMember(owner = "client!gr", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString39 = null;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILclient!g;)I")
	public static int method3645(@OriginalArg(1) Class11_Sub14 arg0) {
		@Pc(9) String local9 = Static278.method5396(arg0);
		@Pc(11) int[] local11 = null;
		if (Static264.method4577(arg0.anInt1765)) {
			local11 = Static283.method4717((int) arg0.aLong67).anIntArray403;
		} else if (Static59.method900(arg0.anInt1765)) {
			@Pc(56) Class67_Sub3_Sub3_Sub1 local56 = Static356.aClass67_Sub3_Sub3_Sub1Array1[(int) arg0.aLong67];
			if (local56 != null) {
				local11 = local56.aClass82_1.anIntArray135;
			}
		} else if (Static53.method798(arg0.anInt1765)) {
			if (arg0.anInt1765 == 1003) {
				local11 = Static108.method1650((int) arg0.aLong67).anIntArray145;
			} else {
				local11 = Static108.method1650((int) (arg0.aLong67 >>> 32 & 0x7FFFFFFFL)).anIntArray145;
			}
		}
		if (local11 != null) {
			local9 = local9 + Static174.method2823(local11);
		}
		return Static102.aClass114_3.method2470(local9, Static209.aClass97Array16);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIIIII)V")
	public static void method3647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) Class137 local10 = Static188.method3467(arg1, arg4);
		if (local10 == null) {
			return;
		}
		if (local10.anObjectArray13 != null) {
			@Pc(27) Class11_Sub13 local27 = new Class11_Sub13();
			local27.aClass137_5 = local10;
			local27.anObjectArray3 = local10.anObjectArray13;
			Static93.method1353(local27);
		}
		Static320.anInt6202 = arg3;
		Static288.anInt5695 = arg2;
		Static122.anInt2282 = arg4;
		Static307.anInt4796 = arg0;
		Static335.anInt6393 = arg5;
		Static103.aBoolean118 = true;
		Static219.anInt4454 = arg1;
		if (local10 != null) {
			Static66.anInt2101 = local10.anInt4112;
		}
		Static69.method1039(local10);
	}
}
