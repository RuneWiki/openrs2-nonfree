import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static465 {

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_107 = new Class316(59, 2);

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)Z")
	public static boolean method6496(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			return false;
		} else {
			return local7 < 128 || local7 >= 160 || Static73.aCharArray1[local7 - 128] != '\u0000';
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIZ)Z")
	public static boolean method6497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!faa;ZB)V")
	public static void method6499(@OriginalArg(0) Class97 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int local12 = arg0.anInt2658 == 0 ? arg0.anInt2690 : arg0.anInt2658;
		@Pc(21) int local21 = arg0.anInt2603 == 0 ? arg0.anInt2670 : arg0.anInt2603;
		Static110.method1698(local12, arg1, arg0.anInt2678, Static360.aClass97ArrayArray2[arg0.anInt2678 >> 16], local21);
		if (arg0.aClass97Array2 != null) {
			Static110.method1698(local12, arg1, arg0.anInt2678, arg0.aClass97Array2, local21);
		}
		@Pc(62) Class6_Sub43 local62 = (Class6_Sub43) Static162.aClass234_23.method5464((long) arg0.anInt2678);
		if (local62 != null) {
			Static379.method5565(local12, local62.anInt8192, local21, arg1);
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)V")
	public static void method6500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class133 local7 = Static113.aClass133ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null && local7.aClass15_Sub3_2 != null) {
			local7.aClass15_Sub3_2 = null;
		}
	}
}
