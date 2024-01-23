import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!sa", name = "I", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!sa", name = "M", descriptor = "Lclient!cg;")
	public static Class22 aClass22_82;

	@OriginalMember(owner = "client!sa", name = "V", descriptor = "I")
	public static int anInt4850;

	@OriginalMember(owner = "client!sa", name = "W", descriptor = "Lclient!cg;")
	public static Class22 aClass22_83;

	@OriginalMember(owner = "client!sa", name = "X", descriptor = "Lclient!cg;")
	public static Class22 aClass22_84;

	@OriginalMember(owner = "client!sa", name = "L", descriptor = "Lclient!el;")
	public static Class44 aClass44_1 = Static66.method3936();

	@OriginalMember(owner = "client!sa", name = "S", descriptor = "Z")
	public static boolean aBoolean305 = false;

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(II)V")
	public static void method3783(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub2_Sub15 local8 = Static131.method1210(arg0, 3);
		local8.method2875();
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)V")
	public static void method3786() {
		Static297.aClass172_44.method4350();
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(B)[Lclient!wm;")
	public static Class188[] method3787() {
		if (Static190.aClass188Array1 == null) {
			@Pc(15) Class188[] local15 = Static48.method947(Static95.aClass184_3);
			@Pc(19) Class188[] local19 = new Class188[local15.length];
			@Pc(21) int local21 = 0;
			label53: for (@Pc(23) int local23 = 0; local23 < local15.length; local23++) {
				@Pc(31) Class188 local31 = local15[local23];
				if ((local31.anInt5866 <= 0 || local31.anInt5866 >= 24) && local31.anInt5872 >= 800 && local31.anInt5873 >= 600) {
					for (@Pc(55) int local55 = 0; local55 < local21; local55++) {
						@Pc(62) Class188 local62 = local19[local55];
						if (local31.anInt5872 == local62.anInt5872 && local62.anInt5873 == local31.anInt5873) {
							if (local31.anInt5866 > local62.anInt5866) {
								local19[local55] = local31;
							}
							continue label53;
						}
					}
					local19[local21] = local31;
					local21++;
				}
			}
			Static190.aClass188Array1 = new Class188[local21];
			Static317.method3202(local19, 0, Static190.aClass188Array1, 0, local21);
			@Pc(112) int[] local112 = new int[Static190.aClass188Array1.length];
			for (@Pc(114) int local114 = 0; local114 < Static190.aClass188Array1.length; local114++) {
				@Pc(126) Class188 local126 = Static190.aClass188Array1[local114];
				local112[local114] = local126.anInt5872 * local126.anInt5873;
			}
			Static284.method4443(local112, Static190.aClass188Array1);
		}
		return Static190.aClass188Array1;
	}

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "(I)V")
	public static void method3788() {
		Static43.aClass172_5.method4350();
	}
}
