import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!kd", name = "X", descriptor = "[[S")
	public static short[][] aShortArrayArray9;

	@OriginalMember(owner = "client!kd", name = "Q", descriptor = "I")
	public static int anInt2605 = 0;

	@OriginalMember(owner = "client!kd", name = "S", descriptor = "I")
	public static int anInt2607 = 0;

	@OriginalMember(owner = "client!kd", name = "U", descriptor = "[I")
	public static int[] anIntArray314 = new int[5];

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIII)V")
	public static void method2187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(32) String local32 = "::tele " + arg0 + "," + (arg1 >> 6) + "," + (arg2 >> 6) + "," + (arg1 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local32);
		Static33.method616(local32);
	}

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "(I)Z")
	public static boolean method2189() {
		return Static137.anInt3867 == 0 ? Static256.aClass1_Sub8_Sub4_3.method4225() : true;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)I")
	public static int method2190(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg1 * 57 + arg0;
		@Pc(15) int local15 = local9 << 13 ^ local9;
		@Pc(29) int local29 = (local15 * 15731 * local15 + 789221) * local15 + 1376312589 & Integer.MAX_VALUE;
		return local29 >> 19 & 0xFF;
	}
}
