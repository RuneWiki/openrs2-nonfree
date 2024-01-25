import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!gt", name = "g", descriptor = "Lclient!wb;")
	public static Class382 aClass382_2;

	@OriginalMember(owner = "client!gt", name = "k", descriptor = "Lclient!bt;")
	public static Class34 aClass34_53;

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString30 = null;

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "I")
	public static int anInt3317 = -1;

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3068(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg3 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(34) int local34 = local7 * (Static634.aShort121 - Static142.aShort80) / 100 + Static142.aShort80;
		Static140.anInt8126 = Static140.anInt8125 * local34 >> 8;
		@Pc(50) int local50 = arg2 * local34 >> 8;
		@Pc(57) int local57 = 16384 - arg5 & 0x3FFF;
		@Pc(64) int local64 = 16384 - arg6 & 0x3FFF;
		@Pc(66) int local66 = 0;
		@Pc(68) int local68 = 0;
		@Pc(70) int local70 = local50;
		if (local57 != 0) {
			local68 = -local50 * Class4_Sub2_Sub26.anIntArray563[local57] >> 14;
			local70 = Class4_Sub2_Sub26.anIntArray562[local57] * local50 >> 14;
		}
		if (local64 != 0) {
			local66 = Class4_Sub2_Sub26.anIntArray563[local64] * local70 >> 14;
			local70 = local70 * Class4_Sub2_Sub26.anIntArray562[local64] >> 14;
		}
		Static611.anInt9382 = arg4 - local66;
		Static383.anInt9871 = arg5;
		Static226.anInt3586 = arg6;
		Static618.anInt9710 = arg0 - local68;
		Static571.anInt8879 = 0;
		Static652.anInt10283 = arg1 - local70;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IILclient!bt;)Lclient!tf;")
	public static Class17 method3069(@OriginalArg(0) int arg0, @OriginalArg(2) Class34 arg1) {
		@Pc(10) Class17 local10 = (Class17) Static488.aClass352_54.method7653((long) arg0);
		if (local10 == null) {
			if (Static305.aBoolean358) {
				local10 = Static582.aClass33_13.method8147(Static682.method1664(arg1, arg0), true);
			} else {
				local10 = Static111.method2114(arg1.method1255(arg0));
			}
			Static488.aClass352_54.method7655((long) arg0, local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(III)Lclient!kq;")
	public static Class199 method3070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class199 local7 = Static569.method7534(arg1);
		if (arg0 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass199Array1 == null || local7.aClass199Array1.length <= arg0) {
			return null;
		} else {
			return local7.aClass199Array1[arg0];
		}
	}
}
