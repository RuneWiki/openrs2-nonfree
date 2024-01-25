import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!we", name = "G", descriptor = "Lclient!ul;")
	public static Class246 aClass246_219;

	@OriginalMember(owner = "client!we", name = "J", descriptor = "[[S")
	public static short[][] aShortArrayArray8;

	@OriginalMember(owner = "client!we", name = "L", descriptor = "[Lclient!go;")
	public static Class91_Sub1[] aClass91_Sub1Array2;

	@OriginalMember(owner = "client!we", name = "O", descriptor = "I")
	public static int anInt7150 = 0;

	@OriginalMember(owner = "client!we", name = "R", descriptor = "Lclient!ee;")
	public static final Class61 aClass61_7 = new Class61("runescape", 0);

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IBI)I")
	public static int method5852(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(40) int local40 = Static350.method4855(arg0 - 1, arg1 + -1) + Static350.method4855(arg0 + 1, arg1 + -1) + Static350.method4855(arg0 + -1, arg1 + 1) + Static350.method4855(arg0 - -1, arg1 + 1);
		@Pc(70) int local70 = Static350.method4855(arg0 - 1, arg1) + Static350.method4855(arg0 + 1, arg1) + Static350.method4855(arg0, arg1 + -1) + Static350.method4855(arg0, arg1 + 1);
		@Pc(80) int local80 = Static350.method4855(arg0, arg1);
		return local80 / 4 + local70 / 8 + local40 / 16;
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(II)V")
	public static void method5854(@OriginalArg(0) int arg0) {
		if (Static347.anInt5822 == arg0) {
			return;
		}
		Static195.anInt3537 = Static118.anInt2419 = Static385.anIntArray569[arg0];
		Static14.method384();
		Static409.anIntArrayArray60 = new int[Static195.anInt3537][Static118.anInt2419];
		Static59.anIntArrayArray10 = new int[Static195.anInt3537][Static118.anInt2419];
		Static411.anIntArrayArrayArray14 = new int[4][Static195.anInt3537 >> 3][Static118.anInt2419 >> 3];
		for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
			Static125.aClass188Array1[local40] = Static348.method4851(Static118.anInt2419, Static195.anInt3537);
		}
		Static22.aByteArrayArrayArray10 = new byte[4][Static195.anInt3537][Static118.anInt2419];
		Static265.method3923(Static195.anInt3537, Static118.anInt2419);
		Static357.method4897(Static415.aClass39_11, Static195.anInt3537 >> 3, Static118.anInt2419 >> 3);
		Static347.anInt5822 = arg0;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIBBLclient!cl;)V")
	public static void method5855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) Class31_Sub2_Sub1_Sub1 arg2) {
		@Pc(10) int local10 = arg2.anIntArray658[0];
		@Pc(15) int local15 = arg2.anIntArray657[0];
		if (local10 < 0 || local10 >= Static195.anInt3537 || local15 < 0 || local15 >= Static118.anInt2419 || (arg0 < 0 || Static195.anInt3537 <= arg0 || arg1 < 0 || arg1 >= Static118.anInt2419)) {
			return;
		}
		@Pc(84) int local84 = Static210.method3331(arg2.method5989(), Static295.anIntArray443, arg0, 0, arg1, 0, Static125.aClass188Array1[arg2.aByte100], 0, local15, -4, true, Static119.anIntArray65, 0, local10);
		if (local84 >= 1 && local84 <= 3) {
			for (@Pc(104) int local104 = 0; local104 < local84 - 1; local104++) {
				arg2.method1183(Static119.anIntArray65[local104], Static295.anIntArray443[local104], (byte) 2);
			}
		}
	}
}
