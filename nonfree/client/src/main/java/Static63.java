import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "Ljava/awt/Font;")
	public static Font aFont2;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
	public static int anInt5669 = 0;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
	public static int anInt5672 = -1;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "[I")
	public static final int[] anIntArray477 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIIIIZII)Z")
	public static boolean method4860(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(24) int local24 = Static182.method3600(arg5, Static218.anIntArray413, arg9, arg7, arg3, arg4, Static166.anIntArray328, arg2, Static29.aClass71Array1[Static242.anInt6745], arg8, Static198.aClass17_Sub1_Sub1_Sub1_3.method4318(), arg1, arg0, arg6);
		if (local24 < 1) {
			return false;
		}
		Static99.anInt2377 = Static218.anIntArray413[local24 - 1];
		Static266.anInt5402 = Static166.anIntArray328[local24 - 1];
		Static47.aBoolean146 = false;
		Static115.method2440();
		return true;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
	public static void method4862() {
		@Pc(9) Class87 local9 = Static124.aClass87_24;
		synchronized (Static124.aClass87_24) {
			Static124.aClass87_24.method2485();
		}
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V")
	public static void method4863() {
		if (Static88.aClass7_1 != null) {
			Static88.aClass7_1.method5560();
		}
		if (Static129.aClass7_2 != null) {
			Static129.aClass7_2.method5560();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)Z")
	public static boolean method4864(@OriginalArg(0) int arg0) {
		if (arg0 == 12 || arg0 == 11 || arg0 == 45 || arg0 == 47 || arg0 == 46) {
			return true;
		} else {
			return arg0 == 6 || arg0 == 1009;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!fe;Z)Z")
	public static boolean method4865(@OriginalArg(0) Class17_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static298.aClass53Array3 == Static269.aClass53Array2;
		@Pc(8) int local8 = 0;
		arg0.method4487();
		if (arg0.aShort75 < 0 || arg0.aShort77 < 0 || arg0.aShort74 >= Static242.anInt6744 || arg0.aShort76 >= Static315.anInt6124) {
			return false;
		}
		@Pc(34) int local34;
		@Pc(37) int local37;
		for (@Pc(30) int local30 = arg0.aShort75; local30 <= arg0.aShort74; local30++) {
			for (local34 = arg0.aShort77; local34 <= arg0.aShort76; local34++) {
				local37 = 0;
				if (local30 > arg0.aShort75) {
					local37++;
				}
				if (local30 < arg0.aShort74) {
					local37 += 4;
				}
				if (local34 > arg0.aShort77) {
					local37 += 8;
				}
				if (local34 < arg0.aShort76) {
					local37 += 2;
				}
				Static269.method4738(arg0.aByte51, local30, local34);
				@Pc(71) Class194 local71 = Static77.aClass194ArrayArrayArray1[arg0.aByte51][local30][local34];
				@Pc(76) Class126 local76 = Static336.method5431(local37, arg0);
				@Pc(79) Class126 local79 = local71.aClass126_2;
				if (local79 == null) {
					local71.aClass126_2 = local76;
				} else {
					while (local79.aClass126_1 != null) {
						local79 = local79.aClass126_1;
					}
					local79.aClass126_1 = local76;
				}
				local71.aByte67 = (byte) (local71.aByte67 | local37);
				if (local6 && Static85.anIntArrayArray56[local30][local34] != 0) {
					local8 = Static85.anIntArrayArray56[local30][local34];
				}
			}
		}
		if (local6 && local8 != 0) {
			for (local34 = arg0.aShort75; local34 <= arg0.aShort74; local34++) {
				for (local37 = arg0.aShort77; local37 <= arg0.aShort76; local37++) {
					if (Static85.anIntArrayArray56[local34][local37] == 0) {
						Static85.anIntArrayArray56[local34][local37] = local8;
					}
				}
			}
		}
		if (arg1) {
			Static245.aClass17_Sub1Array2[Static19.anInt573++] = arg0;
		}
		return true;
	}
}
