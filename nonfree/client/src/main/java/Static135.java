import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!gi", name = "H", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_39 = new Class242(40, 3);

	@OriginalMember(owner = "client!gi", name = "R", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_93 = new Class67(60, 0);

	@OriginalMember(owner = "client!gi", name = "S", descriptor = "I")
	public static int anInt2114 = 0;

	@OriginalMember(owner = "client!gi", name = "T", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_35 = new Class142("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!gi", name = "U", descriptor = "[I")
	public static final int[] anIntArray183 = new int[1024];

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!oi;III)Lclient!ld;")
	public static Class147 method1728(@OriginalArg(0) Class185 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) byte[] local9 = arg0.method4002(arg1, 0);
		return local9 == null ? null : new Class147(local9);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIII)V")
	public static void method1729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static175.method2501(arg3);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg3 - arg2;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(27) int local27 = arg3;
		@Pc(30) int local30 = -arg3;
		@Pc(32) int local32 = local14;
		@Pc(35) int local35 = -local14;
		@Pc(37) int local37 = -1;
		@Pc(59) int local59;
		@Pc(67) int local67;
		@Pc(76) int local76;
		@Pc(85) int local85;
		if (Static142.anInt2163 <= arg4 && arg4 <= Static182.anInt3402) {
			@Pc(51) int[] local51 = Static194.anIntArrayArray28[arg4];
			local59 = Static241.method3467(arg1 - arg3, Static281.anInt4757, Static457.anInt7264);
			local67 = Static241.method3467(arg3 + arg1, Static281.anInt4757, Static457.anInt7264);
			local76 = Static241.method3467(arg1 - local14, Static281.anInt4757, Static457.anInt7264);
			local85 = Static241.method3467(arg1 + local14, Static281.anInt4757, Static457.anInt7264);
			Static298.method3977(local59, arg0, local76, local51);
			Static298.method3977(local76, arg5, local85, local51);
			Static298.method3977(local85, arg0, local67, local51);
		}
		@Pc(107) int local107 = -1;
		while (local27 > local10) {
			local107 += 2;
			local37 += 2;
			local35 += local107;
			local30 += local37;
			if (local35 >= 0 && local32 >= 1) {
				local32--;
				local35 -= local32 << 1;
				Static191.anIntArray263[local32] = local10;
			}
			local10++;
			@Pc(251) int local251;
			@Pc(260) int local260;
			@Pc(267) int[] local267;
			@Pc(156) int local156;
			if (local30 >= 0) {
				local27--;
				local30 -= local27 << 1;
				local156 = arg4 - local27;
				local59 = local27 + arg4;
				if (local59 >= Static142.anInt2163 && local156 <= Static182.anInt3402) {
					if (local14 <= local27) {
						local67 = Static241.method3467(local10 + arg1, Static281.anInt4757, Static457.anInt7264);
						local76 = Static241.method3467(arg1 - local10, Static281.anInt4757, Static457.anInt7264);
						if (local59 <= Static182.anInt3402) {
							Static298.method3977(local76, arg0, local67, Static194.anIntArrayArray28[local59]);
						}
						if (local156 >= Static142.anInt2163) {
							Static298.method3977(local76, arg0, local67, Static194.anIntArrayArray28[local156]);
						}
					} else {
						local67 = Static191.anIntArray263[local27];
						local76 = Static241.method3467(local10 + arg1, Static281.anInt4757, Static457.anInt7264);
						local85 = Static241.method3467(arg1 - local10, Static281.anInt4757, Static457.anInt7264);
						local251 = Static241.method3467(local67 + arg1, Static281.anInt4757, Static457.anInt7264);
						local260 = Static241.method3467(arg1 - local67, Static281.anInt4757, Static457.anInt7264);
						if (local59 <= Static182.anInt3402) {
							local267 = Static194.anIntArrayArray28[local59];
							Static298.method3977(local85, arg0, local260, local267);
							Static298.method3977(local260, arg5, local251, local267);
							Static298.method3977(local251, arg0, local76, local267);
						}
						if (Static142.anInt2163 <= local156) {
							local267 = Static194.anIntArrayArray28[local156];
							Static298.method3977(local85, arg0, local260, local267);
							Static298.method3977(local260, arg5, local251, local267);
							Static298.method3977(local251, arg0, local76, local267);
						}
					}
				}
			}
			local156 = arg4 - local10;
			local59 = local10 + arg4;
			if (local59 >= Static142.anInt2163 && local156 <= Static182.anInt3402) {
				local67 = arg1 + local27;
				local76 = arg1 - local27;
				if (local67 >= Static281.anInt4757 && Static457.anInt7264 >= local76) {
					local67 = Static241.method3467(local67, Static281.anInt4757, Static457.anInt7264);
					local76 = Static241.method3467(local76, Static281.anInt4757, Static457.anInt7264);
					if (local14 > local10) {
						local85 = local10 <= local32 ? local32 : Static191.anIntArray263[local10];
						local251 = Static241.method3467(local85 + arg1, Static281.anInt4757, Static457.anInt7264);
						local260 = Static241.method3467(arg1 - local85, Static281.anInt4757, Static457.anInt7264);
						if (local59 <= Static182.anInt3402) {
							local267 = Static194.anIntArrayArray28[local59];
							Static298.method3977(local76, arg0, local260, local267);
							Static298.method3977(local260, arg5, local251, local267);
							Static298.method3977(local251, arg0, local67, local267);
						}
						if (local156 >= Static142.anInt2163) {
							local267 = Static194.anIntArrayArray28[local156];
							Static298.method3977(local76, arg0, local260, local267);
							Static298.method3977(local260, arg5, local251, local267);
							Static298.method3977(local251, arg0, local67, local267);
						}
					} else {
						if (local59 <= Static182.anInt3402) {
							Static298.method3977(local76, arg0, local67, Static194.anIntArrayArray28[local59]);
						}
						if (Static142.anInt2163 <= local156) {
							Static298.method3977(local76, arg0, local67, Static194.anIntArrayArray28[local156]);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "(I)Z")
	public static boolean method1730() {
		try {
			return Static439.method5514();
		} catch (@Pc(13) IOException local13) {
			Static75.method935();
			return true;
		} catch (@Pc(18) Exception local18) {
			@Pc(77) String local77 = "T2 - " + (Static425.aClass67_257 == null ? -1 : Static425.aClass67_257.method1107()) + "," + (Static12.aClass67_8 == null ? -1 : Static12.aClass67_8.method1107()) + "," + (Static270.aClass67_88 == null ? -1 : Static270.aClass67_88.method1107()) + " - " + Static379.anInt119 + "," + (Static94.aClass11_Sub1_Sub3_Sub2_1.anIntArray246[0] + Static315.anInt5207) + "," + (Static47.anInt676 + Static94.aClass11_Sub1_Sub3_Sub2_1.anIntArray247[0]) + " - ";
			for (@Pc(79) int local79 = 0; Static379.anInt119 > local79 && local79 < 50; local79++) {
				local77 = local77 + Static413.aClass1_Sub19_Sub2_1.aByteArray38[local79] + ",";
			}
			Static338.method4409(local18, local77);
			Static124.method1519(false);
			return true;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IZII)I")
	public static int method1732(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static452.aClass139Array3 == null) {
			return 0;
		}
		@Pc(16) int local16 = arg0 >> 7;
		@Pc(20) int local20 = arg1 >> 7;
		if (local16 < 0 || local20 < 0 || Static147.anInt2300 - 1 < local16 || Static293.anInt4886 - 1 < local20) {
			return 0;
		}
		@Pc(42) int local42 = arg2;
		if (arg2 < 3 && (Static278.aByteArrayArrayArray16[1][local16][local20] & 0x2) != 0) {
			local42 = arg2 + 1;
		}
		return Static452.aClass139Array3[local42].ca(arg0, arg1);
	}
}
