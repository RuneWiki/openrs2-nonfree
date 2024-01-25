import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!ej", name = "N", descriptor = "Lclient!cq;")
	public static Class53 aClass53_3;

	@OriginalMember(owner = "client!ej", name = "o", descriptor = "Lclient!im;")
	public static final Class140 aClass140_40 = new Class140(66, 6);

	@OriginalMember(owner = "client!ej", name = "J", descriptor = "Z")
	public static boolean aBoolean140 = false;

	@OriginalMember(owner = "client!ej", name = "L", descriptor = "[I")
	public static final int[] anIntArray219 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!ej", name = "M", descriptor = "Lclient!gn;")
	public static final Class110 aClass110_2 = new Class110();

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)V")
	public static void method1895() {
		if (Static263.aBoolean356) {
			return;
		}
		Static108.method1863(Static222.aClass255ArrayArrayArray1);
		if (Static332.aClass255ArrayArrayArray3 != null) {
			Static108.method1863(Static332.aClass255ArrayArrayArray3);
		}
		Static263.aBoolean356 = true;
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(Z)Z")
	public static boolean method1896(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static227.anInt4494; local1 < Static388.anInt7032; local1++) {
			@Pc(6) Class255[][] local6 = Static242.aClass255ArrayArrayArray2[local1];
			for (@Pc(9) int local9 = -Static251.anInt4913; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static393.anInt7097 + local9;
				@Pc(18) int local18 = Static393.anInt7097 - local9;
				if (local14 >= Static454.anInt7748 || local18 < Static299.anInt5552) {
					for (@Pc(27) int local27 = -Static251.anInt4913; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static211.anInt4100 + local27;
						@Pc(36) int local36 = Static211.anInt4100 - local27;
						@Pc(48) Class255 local48;
						if (local14 >= Static454.anInt7748) {
							if (local32 >= Static281.anInt5279) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean523) {
									Static153.aBoolean182 = arg0;
									Static497.aClass75_1.method3837(local48);
									Static497.aClass75_1.method3840();
								}
							}
							if (local36 < Static237.anInt4785) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean523) {
									Static153.aBoolean182 = arg0;
									Static497.aClass75_1.method3837(local48);
									Static497.aClass75_1.method3840();
								}
							}
						}
						if (local18 < Static299.anInt5552) {
							if (local32 >= Static281.anInt5279) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean523) {
									Static153.aBoolean182 = arg0;
									Static497.aClass75_1.method3837(local48);
									Static497.aClass75_1.method3840();
								}
							}
							if (local36 < Static237.anInt4785) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean523) {
									Static153.aBoolean182 = arg0;
									Static497.aClass75_1.method3837(local48);
									Static497.aClass75_1.method3840();
								}
							}
						}
						if (Static530.anInt8918 == 0) {
							if (Static169.aBoolean207) {
								Static497.aClass75_1.method3839(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(BIZ)V")
	public static void method1902(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(10) Class1_Sub18 local10 = Static7.method282(arg1, arg0);
		if (local10 != null) {
			for (@Pc(21) int local21 = 0; local21 < local10.anIntArray254.length; local21++) {
				local10.anIntArray254[local21] = -1;
				local10.anIntArray255[local21] = 0;
			}
		}
	}
}
