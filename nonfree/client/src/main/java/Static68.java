import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!cm", name = "Ab", descriptor = "I")
	public static int anInt1456;

	@OriginalMember(owner = "client!cm", name = "ub", descriptor = "I")
	public static int anInt1451 = 0;

	@OriginalMember(owner = "client!cm", name = "yb", descriptor = "[I")
	public static final int[] anIntArray118 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!lb;I)V")
	public static void method1441(@OriginalArg(0) Class6_Sub5 arg0) {
		arg0.aClass1_1 = null;
		@Pc(12) int local12 = arg0.aClass6_Sub4Array1.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			arg0.aClass6_Sub4Array1[local14].aBoolean247 = false;
		}
		@Pc(28) Class107[] local28 = Class2_Sub9.aClass107Array1;
		synchronized (Class2_Sub9.aClass107Array1) {
			if (Class2_Sub9.aClass107Array1.length > local12 && Static487.anIntArray656[local12] < 200) {
				Class2_Sub9.aClass107Array1[local12].method2830(arg0);
				@Pc(55) int local55 = Static487.anIntArray656[local12]++;
			}
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(BI)V")
	public static void method1442(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub13_Sub15 local8 = Static370.method5893(arg0, 11);
		local8.method6974();
	}
}
