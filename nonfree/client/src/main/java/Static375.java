import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!sp", name = "e", descriptor = "Lclient!en;")
	public static Class3_Sub14 aClass3_Sub14_3;

	@OriginalMember(owner = "client!sp", name = "f", descriptor = "[Lclient!pl;")
	public static Class191[] aClass191Array2;

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_218 = new Class189("K", "T", "K", "K");

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(BIIIIIIII)V")
	public static void method5188(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 < 1 || arg1 < 1 || Static40.anInt1089 - 2 < arg2 || Static44.anInt7276 - 2 < arg1) {
			return;
		}
		@Pc(27) int local27 = arg7;
		if (arg7 < 3 && Static309.method4307(arg2, arg1)) {
			local27 = arg7 + 1;
		}
		if (!Static374.aClass20_Sub1_1.method1814(Static105.anInt2382) && !Static222.method3354(arg1, arg2, local27, Static228.anInt4246)) {
			return;
		}
		if (Static263.aClass118ArrayArrayArray2 == null) {
			return;
		}
		Static381.aClass105_Sub1_3.method2676(arg7, Static382.aClass29Array3[arg7], Static121.aClass172_3, arg4, arg1, arg2);
		if (arg6 >= 0) {
			@Pc(71) boolean local71 = Static374.aClass20_Sub1_1.aBoolean183;
			Static374.aClass20_Sub1_1.aBoolean183 = true;
			Static381.aClass105_Sub1_3.method2682(arg1, Static121.aClass172_3, arg3, arg5, arg0, Static382.aClass29Array3[arg7], arg2, local27, arg6, arg7);
			Static374.aClass20_Sub1_1.aBoolean183 = local71;
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIII)V")
	public static void method5190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub4_Sub12 local8 = Static393.method5080(arg2, 8);
		local8.method3248();
		local8.anInt4060 = arg1;
		local8.anInt4063 = arg3;
		local8.anInt4062 = arg0;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!qa;I)V")
	public static void method5192(@OriginalArg(0) Class172 arg0) {
		if (Static378.aBoolean550) {
			Static180.method2864(arg0);
		} else {
			Static103.method1801(arg0);
		}
	}
}
