import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!fi", name = "l", descriptor = "Lclient!ph;")
	public static Class138 aClass138_21;

	@OriginalMember(owner = "client!fi", name = "n", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
	public static int anInt1427;

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "Z")
	public static boolean aBoolean116 = false;

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "Lclient!th;")
	public static Class169 aClass169_53 = new Class169(20);

	@OriginalMember(owner = "client!fi", name = "h", descriptor = "[I")
	public static int[] anIntArray114 = new int[14];

	@OriginalMember(owner = "client!fi", name = "k", descriptor = "[I")
	public static int[] anIntArray115 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!fi", name = "m", descriptor = "[I")
	public static int[] anIntArray116 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V")
	public static void method1197() {
		@Pc(8) int local8 = Static206.aByteArrayArray12.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static206.aByteArrayArray12[local10] != null) {
				@Pc(22) int local22 = -1;
				for (@Pc(24) int local24 = 0; local24 < Static94.anInt1789; local24++) {
					if (Static278.anIntArray487[local10] == Static104.anIntArray180[local24]) {
						local22 = local24;
						break;
					}
				}
				if (local22 == -1) {
					Static104.anIntArray180[Static94.anInt1789] = Static278.anIntArray487[local10];
					local22 = Static94.anInt1789++;
				}
				@Pc(68) Class1_Sub14 local68 = new Class1_Sub14(Static206.aByteArrayArray12[local10]);
				@Pc(70) int local70 = 0;
				while (local68.anInt3290 < Static206.aByteArrayArray12[local10].length && local70 < 511 && Static105.anInt2015 < 1023) {
					@Pc(100) int local100 = local22 | local70++ << 6;
					@Pc(104) int local104 = local68.method2593();
					@Pc(108) int local108 = local104 >> 14;
					@Pc(114) int local114 = local104 >> 7 & 0x3F;
					@Pc(118) int local118 = local104 & 0x3F;
					@Pc(132) int local132 = (Static278.anIntArray487[local10] >> 8) * 64 + local114 - Static290.anInt5497;
					@Pc(145) int local145 = local118 + (Static278.anIntArray487[local10] & 0xFF) * 64 - Static118.anInt2409;
					@Pc(151) Class112 local151 = Static195.method3169(local68.method2593());
					if (Static265.aClass22_Sub3_Sub1Array1[local100] == null && (local151.aByte13 & 0x1) > 0 && Static277.anInt5275 == local108 && local132 >= 0 && local151.anInt3495 + local132 < 104 && local145 >= 0 && local145 + local151.anInt3495 < 104) {
						Static265.aClass22_Sub3_Sub1Array1[local100] = new Class22_Sub3_Sub1();
						@Pc(196) Class22_Sub3_Sub1 local196 = Static265.aClass22_Sub3_Sub1Array1[local100];
						Static7.anIntArray12[Static105.anInt2015++] = local100;
						local196.anInt4614 = Static37.anInt757;
						local196.method3118(local151);
						local196.method3654(local196.aClass112_1.anInt3495);
						local196.anInt4561 = local196.anInt4649 = Static224.anIntArray361[local196.aClass112_1.aByte15];
						local196.anInt4646 = local196.aClass112_1.anInt3528;
						local196.anInt4611 = local196.aClass112_1.anInt3493;
						if (local196.anInt4611 == 0) {
							local196.anInt4649 = 0;
						}
						local196.method3650(local132, local145, local196.method3660(), true);
					}
				}
			}
		}
	}
}
