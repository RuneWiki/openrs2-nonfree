import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!baa", name = "g", descriptor = "[I")
	public static final int[] anIntArray49 = new int[5];

	@OriginalMember(owner = "client!baa", name = "h", descriptor = "I")
	public static int anInt711 = 0;

	@OriginalMember(owner = "client!baa", name = "i", descriptor = "Lclient!v;")
	public static final Class362 aClass362_3 = new Class362();

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(III)Lclient!ug;")
	public static Class351 method714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static441.aClass351ArrayArrayArray1[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static441.aClass351ArrayArrayArray1[0][arg1][arg2] != null && Static441.aClass351ArrayArrayArray1[0][arg1][arg2].aClass351_1 != null;
			if (local28 && arg0 >= Static633.anInt10310 - 1) {
				return null;
			}
			Static408.method5841(arg0, arg1, arg2);
		}
		return Static441.aClass351ArrayArrayArray1[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(ILclient!sha;II)V")
	public static void method715(@OriginalArg(1) Class321 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null) {
			return;
		}
		if (arg0.anObjectArray34 != null) {
			@Pc(21) Class6_Sub49 local21 = new Class6_Sub49();
			local21.anObjectArray35 = arg0.anObjectArray34;
			local21.aClass321_44 = arg0;
			Static295.method4226(local21);
		}
		Static478.anInt8213 = arg0.anInt9026;
		Static672.anInt10372 = arg0.anInt9061;
		Static489.anInt8324 = arg0.anInt9048;
		Static291.aBoolean314 = true;
		Static357.anInt6124 = arg0.anInt9082;
		Static255.anInt5389 = arg2;
		Static663.anInt9822 = arg0.anInt9040;
		Static127.anInt1401 = arg1;
		Static293.method4206(arg0);
	}
}
