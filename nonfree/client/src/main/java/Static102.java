import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
	public static int anInt2225;

	@OriginalMember(owner = "client!jf", name = "v", descriptor = "Lclient!oe;")
	public static Class72 aClass72_138;

	@OriginalMember(owner = "client!jf", name = "x", descriptor = "[Lclient!qe;")
	public static Class78[] aClass78Array19;

	@OriginalMember(owner = "client!jf", name = "p", descriptor = "Lclient!qe;")
	public static Class78 aClass78_490 = Static199.method3560("VOLL");

	@OriginalMember(owner = "client!jf", name = "q", descriptor = "Lclient!qe;")
	private static Class78 aClass78_491 = Static199.method3560("Unable to find ");

	@OriginalMember(owner = "client!jf", name = "t", descriptor = "Z")
	public static boolean aBoolean86 = true;

	@OriginalMember(owner = "client!jf", name = "z", descriptor = "Lclient!qe;")
	public static Class78 aClass78_492 = aClass78_491;

	@OriginalMember(owner = "client!jf", name = "D", descriptor = "I")
	public static int anInt2232 = 0;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILclient!qe;)Z")
	public static boolean method1741(@OriginalArg(1) Class78 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(9) int local9 = 0; local9 < Static72.anInt4686; local9++) {
			if (arg0.method3038(Static15.aClass78Array1[local9])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZIIIIIII)V")
	public static void method1742(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static6.anInt187 <= arg0 && arg2 <= Static101.anInt2213 && Static73.anInt1576 <= arg5 && Static137.anInt3137 >= arg6) {
			Static104.method1798(arg5, arg1, arg2, arg4, arg0, arg6, arg3);
		} else {
			Static99.method1699(arg0, arg3, arg1, arg2, arg5, arg6, arg4);
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(II)I")
	public static int method1744(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local10 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local10 += 8;
		}
		if (arg0 >= 16) {
			local10 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local10 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			local10++;
			arg0 >>>= 0x1;
		}
		return arg0 + local10;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILclient!oe;I)[Lclient!qg;")
	public static Class79_Sub1[] method1745(@OriginalArg(0) int arg0, @OriginalArg(2) Class72 arg1) {
		return Static55.method713(arg0, arg1) ? Static109.method1894() : null;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IZ)V")
	public static void method1746(@OriginalArg(1) boolean arg0) {
		Static41.method565();
		if (Static226.anInt4903 == 28) {
			return;
		}
		Static35.anInt585++;
		if (Static35.anInt585 < 50 && !arg0) {
			return;
		}
		Static35.anInt585 = 0;
		if (Static5.aBoolean5 || Static202.aClass105_4 == null) {
			return;
		}
		Static161.aClass2_Sub23_Sub1_5.method2155(252);
		try {
			Static202.aClass105_4.method3692(Static161.aClass2_Sub23_Sub1_5.aByteArray41, Static161.aClass2_Sub23_Sub1_5.anInt2703);
			Static161.aClass2_Sub23_Sub1_5.anInt2703 = 0;
		} catch (@Pc(48) IOException local48) {
			Static5.aBoolean5 = true;
		}
	}
}
