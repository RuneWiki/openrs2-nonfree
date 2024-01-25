import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static514 {

	@OriginalMember(owner = "client!sc", name = "fb", descriptor = "[I")
	public static int[] anIntArray465;

	@OriginalMember(owner = "client!sc", name = "gb", descriptor = "I")
	public static int anInt8985;

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
	public static final int anInt8951 = 1405;

	@OriginalMember(owner = "client!sc", name = "W", descriptor = "Lclient!wr;")
	public static final Class380 aClass380_39 = new Class380(16);

	@OriginalMember(owner = "client!sc", name = "hb", descriptor = "[I")
	public static final int[] anIntArray466 = new int[1000];

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIII)Z")
	public static boolean method7364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if ((Static495.aByteArrayArrayArray17[0][arg2][arg0] & 0x2) != 0) {
			return true;
		} else if ((Static495.aByteArrayArrayArray17[arg1][arg2][arg0] & 0x10) == 0) {
			return Static621.method8517(arg0, arg1, arg2) == arg3;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIII)V")
	public static void method7366(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(3) Class50[] local3 = Static189.aClass50Array1;
		for (@Pc(5) int local5 = 0; local5 < local3.length; local5++) {
			@Pc(13) Class50 local13 = local3[local5];
			if (local13 != null && local13.anInt2414 == 2) {
				Static2.method4207(local13.anInt2408, local13.anInt2404, local13.anInt2409 * 2, local13.anInt2415, arg1 >> 1, arg0 >> 1);
				if (Static456.anIntArray426[0] > -1 && Static384.anInt7234 % 20 < 10) {
					@Pc(59) Class4 local59 = Static530.aClass4Array13[local13.anInt2407];
					@Pc(67) int local67 = Static456.anIntArray426[0] + arg2 - 12;
					@Pc(75) int local75 = arg3 + Static456.anIntArray426[1] - 28;
					local59.method7698(local67, local75);
					Static215.method3836(local75 + local59.method7712(), local75, local67, local67 + local59.method7700());
				}
			}
		}
	}
}
