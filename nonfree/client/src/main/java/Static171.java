import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!ffa", name = "u", descriptor = "I")
	public static int anInt8707;

	@OriginalMember(owner = "client!ffa", name = "w", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_157 = new Class397(27, 7);

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "(B)V")
	public static void method7423() {
		@Pc(9) int[] local9 = new int[Static606.aClass62_2.anInt2047];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static606.aClass62_2.anInt2047; local13++) {
			@Pc(20) Class275 local20 = Static606.aClass62_2.method1887(local13);
			if (local20.anInt7240 >= 0 || local20.anInt7274 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static492.anIntArray567 = new int[local11];
		for (@Pc(57) int local57 = 0; local57 < local11; local57++) {
			Static492.anIntArray567[local57] = local9[local57];
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(BIILclient!id;I)V")
	public static void method7425(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub29 arg2, @OriginalArg(4) int arg3) {
		arg2.aClass3_Sub2_Sub1_1.method2010(arg0);
		arg2.aClass3_Sub2_Sub1_1.method2010(arg1);
		arg2.aClass3_Sub2_Sub1_1.method2024(arg3);
	}
}
