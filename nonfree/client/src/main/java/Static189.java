import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!oa", name = "H", descriptor = "I")
	public static int anInt5672;

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "Lclient!pi;")
	public static Class4_Sub24 aClass4_Sub24_50 = new Class4_Sub24(new byte[5000]);

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "Z")
	public static boolean aBoolean391 = true;

	@OriginalMember(owner = "client!oa", name = "F", descriptor = "I")
	public static int anInt5670 = 0;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!cg;III)[Lclient!gh;")
	public static Class58[] method4539(@OriginalArg(0) Class22 arg0, @OriginalArg(2) int arg1) {
		return Static225.method3549(0, arg0, arg1) ? Static168.method2672() : null;
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
	public static void method4540() {
		Static161.method2600();
		Static295.method4584();
		Static113.method1890();
		Static182.method2942();
		Static93.method2552();
		Static105.method1795();
		Static8.method118();
		Static75.method1267();
		Static177.method2908();
		Static159.method2561();
		Static135.method2180();
		Static114.method1913();
		Static11.method227();
		Static199.method2422();
		Static209.method3294();
		Static107.method1827();
		Static176.method4453();
		Static193.method3165();
		Static51.method989();
		Static27.method579();
		Static7.aClass172_1.method4346();
		Static246.aClass172_40.method4346();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IB)I")
	public static int method4543(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZZ)V")
	public static void method4550(@OriginalArg(0) boolean arg0) {
		@Pc(9) byte local9;
		@Pc(7) byte[][] local7;
		if (Static251.aBoolean330 && arg0) {
			local7 = Static13.aByteArrayArray2;
			local9 = 1;
		} else {
			local7 = Static3.aByteArrayArray1;
			local9 = 4;
		}
		@Pc(21) int[] local21 = null;
		for (@Pc(23) int local23 = 0; local23 < local9; local23++) {
			Static65.method4575();
			for (@Pc(30) int local30 = 0; local30 < 13; local30++) {
				for (@Pc(35) int local35 = 0; local35 < 13; local35++) {
					@Pc(42) boolean local42 = false;
					@Pc(50) int local50 = Static209.anIntArrayArrayArray11[local23][local30][local35];
					if (local50 != -1) {
						@Pc(61) int local61 = local50 >> 24 & 0x3;
						if (!arg0 || local61 == 0) {
							@Pc(71) int local71 = local50 >> 1 & 0x3;
							@Pc(77) int local77 = local50 >> 14 & 0x3FF;
							@Pc(83) int local83 = local50 >> 3 & 0x7FF;
							@Pc(93) int local93 = local83 / 8 + (local77 / 8 << 8);
							for (@Pc(95) int local95 = 0; local95 < Static162.anIntArray272.length; local95++) {
								if (Static162.anIntArray272[local95] == local93 && local7[local95] != null) {
									@Pc(131) int[] local131 = Static100.method1659(local30 * 8, local23, local71, Static223.aClass12Array1, local77, local61, arg0, local7[local95], local83, local35 * 8);
									local42 = true;
									if (local21 == null && local131 != null) {
										local21 = local131;
									}
									break;
								}
							}
						}
					}
					if (!local42) {
						Static99.method1628(8, local35 * 8, 8, local30 * 8, local23);
					}
				}
			}
		}
		if (local21 == null) {
			Static28.anInt611 = -1;
			return;
		}
		Static266.anInt5228 = local21[1];
		Static45.anInt1037 = local21[2];
		Static185.anInt3673 = local21[4];
		Static136.anInt2698 = local21[3];
		Static28.anInt611 = local21[0];
	}
}
