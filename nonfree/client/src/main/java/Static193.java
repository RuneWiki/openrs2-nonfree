import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!p", name = "e", descriptor = "Lclient!lg;")
	public static Class102 aClass102_7;

	@OriginalMember(owner = "client!p", name = "c", descriptor = "[[B")
	public static byte[][] aByteArrayArray12 = new byte[50][];

	@OriginalMember(owner = "client!p", name = "d", descriptor = "[I")
	public static int[] anIntArray287 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V")
	public static void method3018() {
		Static180.aClass61_30.method1379();
		Static293.aClass61_53.method1379();
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)I")
	public static int method3019() {
		return Static30.anInt733;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V")
	public static void method3021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class8_Sub27 local7 = Static178.aClass8_Sub27ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(30) Class8_Sub27 local30 = Static178.aClass8_Sub27ArrayArrayArray1[local9][arg0][arg1] = Static178.aClass8_Sub27ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local30 != null) {
				local30.anInt4850--;
				for (@Pc(40) int local40 = 0; local40 < local30.anInt4857; local40++) {
					@Pc(49) Class170 local49 = local30.aClass170Array3[local40];
					if ((local49.aLong196 >> 29 & 0x3L) == 2L && local49.anInt5463 == arg0 && local49.anInt5460 == arg1) {
						local49.anInt5454--;
					}
				}
			}
		}
		if (Static178.aClass8_Sub27ArrayArrayArray1[0][arg0][arg1] == null) {
			Static178.aClass8_Sub27ArrayArrayArray1[0][arg0][arg1] = new Class8_Sub27(0, arg0, arg1);
		}
		Static178.aClass8_Sub27ArrayArrayArray1[0][arg0][arg1].aClass8_Sub27_1 = local7;
		Static178.aClass8_Sub27ArrayArrayArray1[3][arg0][arg1] = null;
	}
}
