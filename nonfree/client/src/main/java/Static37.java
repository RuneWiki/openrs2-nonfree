import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bg", name = "A", descriptor = "[I")
	public static final int[] anIntArray45 = new int[4];

	@OriginalMember(owner = "client!bg", name = "H", descriptor = "I")
	public static int anInt576 = 0;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILclient!iha;)Z")
	public static boolean method552(@OriginalArg(1) Class160 arg0) {
		return arg0 == null ? false : Static141.method2404(arg0.anInt4747 - arg0.anInt4748, -arg0.anInt4739 + arg0.anInt4742, arg0.anInt4740, arg0.anInt4744 - arg0.anInt4740, arg0.anInt4739, arg0.anInt4748);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZILjava/io/File;)V")
	public static void method553(@OriginalArg(2) File arg0) {
		if (Static45.anObject1 == null) {
			Static295.method5067();
		}
		try {
			@Pc(10) Class local10 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
			@Pc(31) Method local31 = local10.getDeclaredMethod("dumpHeap", String.class, Boolean.TYPE);
			local31.invoke(Static45.anObject1, arg0.getAbsolutePath(), Boolean.valueOf(false));
		} catch (@Pc(51) Exception local51) {
			System.out.println("HeapDump error:");
			local51.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!tga;I[[B)V")
	public static void method554(@OriginalArg(0) Class83_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(17) int[] local17 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(25) int local25;
		@Pc(29) int local29;
		@Pc(39) int local39;
		@Pc(48) int local48;
		for (@Pc(19) int local19 = 0; local19 < arg0.anInt9095; local19++) {
			Static234.method3998();
			for (local25 = 0; local25 < Static399.anInt7121 >> 3; local25++) {
				for (local29 = 0; local29 < Static24.anInt345 >> 3; local29++) {
					local39 = Static65.anIntArrayArrayArray6[local19][local25][local29];
					if (local39 != -1) {
						local48 = local39 >> 24 & 0x3;
						if (!arg0.aBoolean675 || local48 == 0) {
							@Pc(62) int local62 = local39 >> 1 & 0x3;
							@Pc(68) int local68 = local39 >> 14 & 0x3FF;
							@Pc(74) int local74 = local39 >> 3 & 0x7FF;
							@Pc(84) int local84 = local74 / 8 + (local68 / 8 << 8);
							for (@Pc(86) int local86 = 0; local86 < Static454.anIntArray476.length; local86++) {
								if (Static454.anIntArray476[local86] == local84 && arg1[local86] != null) {
									@Pc(108) Class3_Sub9 local108 = new Class3_Sub9(arg1[local86]);
									arg0.method7798(local108, local68, local62, Static174.aClass237Array1, local25 * 8, local74, local48, local29 * 8, local19);
									arg0.method7815(local29 * 8, local19, local17[0] == -1 ? local17 : null, local108, local62, local25 * 8, Static266.aClass82_8, local74, local68, local48);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (local25 = 0; local25 < arg0.anInt9095; local25++) {
			Static234.method3998();
			for (local29 = 0; local29 < Static399.anInt7121 >> 3; local29++) {
				for (local39 = 0; local39 < Static24.anInt345 >> 3; local39++) {
					local48 = Static65.anIntArrayArrayArray6[local25][local29][local39];
					if (local48 == -1) {
						arg0.method7809(local39 * 8, 8, 8, local29 * 8, local25);
					}
				}
			}
		}
		if (local17[0] != -1) {
			Static626.aClass137_1 = Static148.aClass212_1.method5413(local17[1], Static166.aClass310_1, local17[2], local17[0], local17[3]);
			Static585.anInt9501 = local17[4];
		}
	}
}
