import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!ed", name = "S", descriptor = "[I")
	public static int[] anIntArray97;

	@OriginalMember(owner = "client!ed", name = "L", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_286 = Static81.method1507("sl_flags");

	@OriginalMember(owner = "client!ed", name = "O", descriptor = "[S")
	public static final short[] aShortArray24 = new short[] { 11, 2, 29, 4, 51, 48, 36, 13 };

	@OriginalMember(owner = "client!ed", name = "Q", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_287 = Static81.method1507("This computers address has been blocked");

	@OriginalMember(owner = "client!ed", name = "T", descriptor = "[Lclient!bc;")
	public static final Class10[] aClass10Array1 = new Class10[24];

	@OriginalMember(owner = "client!ed", name = "U", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_288 = Static81.method1507(" GMT");

	@OriginalMember(owner = "client!ed", name = "V", descriptor = "Lclient!dj;")
	public static Class24 aClass24_289 = aClass24_287;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIII)V")
	public static void method839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = arg1; local3 <= arg1 + arg3; local3++) {
			for (local7 = arg4; local7 <= arg4 + arg0; local7++) {
				if (local7 >= 0 && local7 < 104 && local3 >= 0 && local3 < 104) {
					Static136.aByteArrayArrayArray7[arg2][local7][local3] = 127;
				}
			}
		}
		@Pc(62) int local62;
		for (local7 = arg1; local7 < arg1 + arg3; local7++) {
			for (local62 = arg4; local62 < arg4 + arg0; local62++) {
				if (local62 >= 0 && local62 < 104 && local7 >= 0 && local7 < 104) {
					Static186.anIntArrayArrayArray2[arg2][local62][local7] = arg2 > 0 ? Static186.anIntArrayArrayArray2[arg2 - 1][local62][local7] : 0;
				}
			}
		}
		if (arg4 > 0 && arg4 < 104) {
			for (local62 = arg1 + 1; local62 < arg3 + arg1; local62++) {
				if (local62 >= 0 && local62 < 104) {
					Static186.anIntArrayArrayArray2[arg2][arg4][local62] = Static186.anIntArrayArrayArray2[arg2][arg4 - 1][local62];
				}
			}
		}
		if (arg1 > 0 && arg1 < 104) {
			for (local62 = arg4 + 1; local62 < arg0 + arg4; local62++) {
				if (local62 >= 0 && local62 < 104) {
					Static186.anIntArrayArrayArray2[arg2][local62][arg1] = Static186.anIntArrayArrayArray2[arg2][local62][arg1 - 1];
				}
			}
		}
		if (arg4 < 0 || arg1 < 0 || arg4 >= 104 || arg1 >= 104) {
			return;
		}
		if (arg2 != 0) {
			if (arg4 > 0 && Static186.anIntArrayArrayArray2[arg2][arg4 - 1][arg1] != Static186.anIntArrayArrayArray2[arg2 - 1][arg4 - 1][arg1]) {
				Static186.anIntArrayArrayArray2[arg2][arg4][arg1] = Static186.anIntArrayArrayArray2[arg2][arg4 - 1][arg1];
				return;
			}
			if (arg1 > 0 && Static186.anIntArrayArrayArray2[arg2 - 1][arg4][arg1 - 1] != Static186.anIntArrayArrayArray2[arg2][arg4][arg1 - 1]) {
				Static186.anIntArrayArrayArray2[arg2][arg4][arg1] = Static186.anIntArrayArrayArray2[arg2][arg4][arg1 - 1];
				return;
			}
			if (arg4 > 0 && arg1 > 0 && Static186.anIntArrayArrayArray2[arg2 - 1][arg4 - 1][arg1 - 1] != Static186.anIntArrayArrayArray2[arg2][arg4 - 1][arg1 - 1]) {
				Static186.anIntArrayArrayArray2[arg2][arg4][arg1] = Static186.anIntArrayArrayArray2[arg2][arg4 - 1][arg1 - 1];
				return;
			}
			return;
		}
		if (arg4 > 0 && Static186.anIntArrayArrayArray2[arg2][arg4 - 1][arg1] != 0) {
			Static186.anIntArrayArrayArray2[arg2][arg4][arg1] = Static186.anIntArrayArrayArray2[arg2][arg4 - 1][arg1];
			return;
		}
		if (arg1 > 0 && Static186.anIntArrayArrayArray2[arg2][arg4][arg1 - 1] != 0) {
			Static186.anIntArrayArrayArray2[arg2][arg4][arg1] = Static186.anIntArrayArrayArray2[arg2][arg4][arg1 - 1];
			return;
		}
		if (arg4 > 0 && arg1 > 0 && Static186.anIntArrayArrayArray2[arg2][arg4 - 1][arg1 - 1] != 0) {
			Static186.anIntArrayArrayArray2[arg2][arg4][arg1] = Static186.anIntArrayArrayArray2[arg2][arg4 - 1][arg1 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method840(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static107.aClass73_1);
		arg0.addMouseMotionListener(Static107.aClass73_1);
		arg0.addFocusListener(Static107.aClass73_1);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZILclient!dj;)V")
	public static void method841(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class24 arg1) {
		@Pc(7) Class24 local7 = arg1.method753();
		@Pc(10) short[] local10 = new short[16];
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static148.anInt3297; local14++) {
			@Pc(19) Class1_Sub2_Sub23 local19 = Static168.method2886(local14);
			if ((!arg0 || local19.aBoolean198) && local19.anInt4221 == -1 && local19.anInt4223 == -1 && local19.aClass24_1214.method753().method738(local7) != -1) {
				if (local12 >= 250) {
					Static132.anInt2949 = -1;
					Static2.aShortArray1 = null;
					return;
				}
				if (local10.length <= local12) {
					@Pc(67) short[] local67 = new short[local10.length * 2];
					for (@Pc(69) int local69 = 0; local69 < local12; local69++) {
						local67[local69] = local10[local69];
					}
					local10 = local67;
				}
				local10[local12++] = (short) local14;
			}
		}
		Static2.aShortArray1 = local10;
		Static128.anInt2829 = 0;
		Static132.anInt2949 = local12;
		@Pc(101) Class24[] local101 = new Class24[Static132.anInt2949];
		for (@Pc(103) int local103 = 0; local103 < Static132.anInt2949; local103++) {
			local101[local103] = Static168.method2886(local10[local103]).aClass24_1214;
		}
		Static184.method3194(local101, Static2.aShortArray1);
	}

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "(B)I")
	public static int method843() {
		return Static27.anInt724;
	}
}
