import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!bha", name = "u", descriptor = "F")
	public static float aFloat48;

	@OriginalMember(owner = "client!bha", name = "v", descriptor = "Lclient!jk;")
	public static Class173 aClass173_1;

	@OriginalMember(owner = "client!bha", name = "o", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_7 = new Class200(23, -2);

	@OriginalMember(owner = "client!bha", name = "s", descriptor = "Lclient!mr;")
	public static final Class223 aClass223_6 = new Class223();

	@OriginalMember(owner = "client!bha", name = "t", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_8 = new Class200(112, -1);

	@OriginalMember(owner = "client!bha", name = "w", descriptor = "[I")
	public static final int[] anIntArray36 = new int[8];

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(IIB)Z")
	public static boolean method1368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(IIII)V")
	public static void method1369(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg0 * Static262.aClass3_Sub27_12.aClass21_Sub14_2.method5405() >> 8;
		if (arg2 == -1 && !Static120.aBoolean173) {
			Static486.method7235();
		} else if (arg2 != -1 && (arg2 != Static472.anInt8274 || !Static438.method6829()) && local8 != 0 && !Static120.aBoolean173) {
			Static448.method6932(arg1, local8, Static336.aClass196_65, arg2);
			Static464.method7046();
		}
		if (arg2 != Static472.anInt8274) {
			Static391.aClass3_Sub7_Sub2_2 = null;
		}
		Static472.anInt8274 = arg2;
	}
}
