import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!au", name = "j", descriptor = "I")
	public static int anInt892;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "[I")
	public static final int[] anIntArray57 = new int[13];

	@OriginalMember(owner = "client!au", name = "e", descriptor = "Lclient!pca;")
	public static final Class245 aClass245_10 = new Class245(64);

	@OriginalMember(owner = "client!au", name = "h", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_14 = new Class254(70, 7);

	@OriginalMember(owner = "client!au", name = "i", descriptor = "Z")
	public static final boolean aBoolean76 = false;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(CI)Z")
	public static boolean method862(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Lclient!jo;IBIIZI)V")
	public static void method863(@OriginalArg(0) Class168 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		Static463.anInt8569 = 1;
		Static179.anInt3992 = arg2;
		Static538.anInt9265 = arg1;
		Static193.aBoolean341 = false;
		Static350.anInt5888 = 0;
		Static329.aClass168_79 = arg0;
		Static478.anInt8743 = Static258.aClass6_Sub10_Sub1_2.method1516() / arg3;
		if (Static478.anInt8743 < 1) {
			Static478.anInt8743 = 1;
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIIIIIZB)Z")
	public static boolean method864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(8) int local8 = Static350.aClass11_Sub1_Sub1_Sub2_4.anIntArray526[0];
		@Pc(13) int local13 = Static350.aClass11_Sub1_Sub1_Sub2_4.anIntArray527[0];
		if (local8 < 0 || local8 >= Static228.anInt4746 || local13 < 0 || local13 >= Static44.anInt1275) {
			return false;
		} else if (arg2 >= 0 && arg2 < Static228.anInt4746 && arg6 >= 0 && arg6 < Static44.anInt1275) {
			@Pc(86) int local86 = Static150.method6218(arg0, Static225.anIntArray303, arg6, arg5, Static55.aClass194Array1[Static350.aClass11_Sub1_Sub1_Sub2_4.aByte77], arg3, arg1, arg7, arg2, Static55.anIntArray97, arg4, Static350.aClass11_Sub1_Sub1_Sub2_4.method6212(), local13, local8);
			if (local86 < 1) {
				return false;
			}
			Static350.anInt5889 = Static225.anIntArray303[local86 - 1];
			Static484.anInt8777 = Static55.anIntArray97[local86 - 1];
			Static184.aBoolean327 = false;
			Static218.method3985();
			return true;
		} else {
			return false;
		}
	}
}
