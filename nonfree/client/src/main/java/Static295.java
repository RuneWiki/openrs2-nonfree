import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!w", name = "c", descriptor = "I")
	public static int anInt5711;

	@OriginalMember(owner = "client!w", name = "b", descriptor = "[I")
	public static int[] anIntArray461 = new int[128];

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IZ)V")
	public static void method4583(@OriginalArg(1) boolean arg0) {
		@Pc(18) byte local18;
		@Pc(16) byte[][] local16;
		if (Static251.aBoolean330 && arg0) {
			local18 = 1;
			local16 = Static218.aByteArrayArray11;
		} else {
			local16 = Static121.aByteArrayArray9;
			local18 = 4;
		}
		for (@Pc(26) int local26 = 0; local26 < local18; local26++) {
			Static65.method4575();
			for (@Pc(33) int local33 = 0; local33 < 13; local33++) {
				for (@Pc(40) int local40 = 0; local40 < 13; local40++) {
					@Pc(51) int local51 = Static209.anIntArrayArrayArray11[local26][local33][local40];
					if (local51 != -1) {
						@Pc(61) int local61 = local51 >> 24 & 0x3;
						if (!arg0 || local61 == 0) {
							@Pc(75) int local75 = local51 >> 1 & 0x3;
							@Pc(81) int local81 = local51 >> 3 & 0x7FF;
							@Pc(87) int local87 = local51 >> 14 & 0x3FF;
							@Pc(97) int local97 = local81 / 8 + (local87 / 8 << 8);
							for (@Pc(99) int local99 = 0; local99 < Static162.anIntArray272.length; local99++) {
								if (local97 == Static162.anIntArray272[local99] && local16[local99] != null) {
									Static17.method306(local33 * 8, local16[local99], local40 * 8, Static223.aClass12Array1, arg0, (local81 & 0x7) * 8, local75, local61, (local87 & 0x7) * 8, local26);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
	public static void method4584() {
		Static297.aClass172_44.method4346();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method4585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static168.anIntArrayArrayArray8[arg0][local16][local20] == -Static151.anInt2970) {
						return false;
					}
				}
			}
			local16 = (arg1 << 7) + 1;
			local20 = (arg3 << 7) + 2;
			@Pc(156) int local156 = Static154.anIntArrayArrayArray5[arg0][arg1][arg3] + arg5;
			if (!Static190.method3149(local16, local156, local20)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static190.method3149(local169, local156, local20)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static190.method3149(local16, local156, local182)) {
				return false;
			} else if (Static190.method3149(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static309.method1137(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static190.method3149(local16 + 1, Static154.anIntArrayArrayArray5[arg0][arg1][arg3] + arg5, local20 + 1) && Static190.method3149(local16 + 128 - 1, Static154.anIntArrayArrayArray5[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static190.method3149(local16 + 128 - 1, Static154.anIntArrayArrayArray5[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static190.method3149(local16 + 1, Static154.anIntArrayArrayArray5[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II)V")
	public static void method4586() {
		Static211.aClass172_36.method4349(50);
		Static157.aClass172_3.method4349(50);
		Static228.aClass172_38.method4349(50);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method4587(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static232.aClass45_1);
		arg0.removeFocusListener(Static232.aClass45_1);
		Static9.anInt188 = -1;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(II)Lclient!wl;")
	public static Class4_Sub2_Sub23 method4588(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub2_Sub23 local10 = (Class4_Sub2_Sub23) Static70.aClass172_12.method4347((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static38.method718(Static113.aClass22_39, Static64.aClass22_28, arg0);
		if (local10 != null) {
			Static70.aClass172_12.method4345(local10, (long) arg0);
		}
		return local10;
	}
}
