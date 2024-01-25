import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
	public static int anInt2467;

	@OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
	public static int anInt2468;

	@OriginalMember(owner = "client!pe", name = "q", descriptor = "Lclient!nt;")
	public static Class170 aClass170_3;

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
	public static int anInt2459 = 1;

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_45 = new Class217(59, 3);

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
	public static int anInt2464 = 0;

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "Lclient!ug;")
	public static Class243 aClass243_16 = new Class243();

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
	public static int anInt2466 = 0;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIII)Z")
	public static boolean method1890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static420.method5370(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static336.anInt5747;
			@Pc(14) int local14 = arg2 << Static336.anInt5747;
			return Static328.method4427(local10 + 1, Static444.aClass159Array3[arg0].I(arg1, arg2) + arg3, local14 + 1) && Static328.method4427(local10 + Static205.anInt3992 - 1, Static444.aClass159Array3[arg0].I(arg1 + 1, arg2) + arg3, local14 + 1) && Static328.method4427(local10 + Static205.anInt3992 - 1, Static444.aClass159Array3[arg0].I(arg1 + 1, arg2 + 1) + arg3, local14 + Static205.anInt3992 - 1) && Static328.method4427(local10 + 1, Static444.aClass159Array3[arg0].I(arg1, arg2 + 1) + arg3, local14 + Static205.anInt3992 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
	public static void method1894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4) {
		Static416.method5338(arg2, arg1, -1, null, arg4, arg3, arg0);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)V")
	public static void method1899() {
		anInt2467 = 2;
		Static50.aClass32_21 = null;
		Static410.anInt6753 = 1;
		Static61.anInt1580 = 0;
		Static181.anInt3614 = -1;
		Static120.anInt2585 = -1;
		Static193.aBoolean332 = false;
	}
}
