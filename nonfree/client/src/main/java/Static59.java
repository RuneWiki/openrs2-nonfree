import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!gb", name = "H", descriptor = "I")
	public static int anInt1456;

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
	public static int anInt1446 = 0;

	@OriginalMember(owner = "client!gb", name = "w", descriptor = "I")
	public static int anInt1449 = 0;

	@OriginalMember(owner = "client!gb", name = "y", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_460 = Static181.method2795("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!gb", name = "A", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_461 = Static181.method2795("Angreifen");

	@OriginalMember(owner = "client!gb", name = "B", descriptor = "I")
	public static int anInt1451 = 0;

	@OriginalMember(owner = "client!gb", name = "C", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_462 = Static181.method2795("mapdots");

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([BI[Lclient!dg;IIBI)V")
	public static void method1138(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class22[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 64; local11++) {
				for (local15 = 0; local15 < 64; local15++) {
					if (arg3 + local11 > 0 && local11 + arg3 < 103 && arg1 + local15 > 0 && local15 + arg1 < 103) {
						arg2[local7].anIntArrayArray4[local11 + arg3][arg1 + local15] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(85) Class2_Sub3 local85 = new Class2_Sub3(arg0);
		for (local15 = 0; local15 < 4; local15++) {
			for (@Pc(91) int local91 = 0; local91 < 64; local91++) {
				for (@Pc(95) int local95 = 0; local95 < 64; local95++) {
					Static157.method2423(arg5, 0, local91 + arg3, arg1 + local95, local85, arg4, local15);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)V")
	public static void method1139() {
		Static211.aClass2_Sub9_Sub3_2.method1544();
		Static138.aClass28_139 = null;
		Static92.anInt1969 = 1;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)Z")
	public static boolean method1141(@OriginalArg(1) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}
}
