import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!ko", name = "k", descriptor = "F")
	public static float aFloat36;

	@OriginalMember(owner = "client!ko", name = "m", descriptor = "[I")
	public static int[] anIntArray305;

	@OriginalMember(owner = "client!ko", name = "p", descriptor = "Lclient!rv;")
	public static Class219 aClass219_1;

	@OriginalMember(owner = "client!ko", name = "o", descriptor = "Lclient!ka;")
	public static final Class132 aClass132_29 = new Class132(8);

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)V")
	public static void method2859() {
		if (Static2.aClass148_Sub1_1.method3047(Static288.anInt4743) || Static280.anInt4592 == Static61.anInt1129) {
			Static184.method2532(Static82.aClass163_1);
			if (Static434.anInt7019 != Static61.anInt1129) {
				Static389.method4967();
			}
		} else {
			Static359.method4735(10, Static283.anInt4621, false, Static429.anInt6931);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!dk;IIZII)V")
	public static void method2861(@OriginalArg(0) Class54 arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2) {
		Static147.anInt2601 = arg1;
		Static412.aClass54_111 = arg0;
		Static101.anInt1907 = 0;
		Static228.anInt3708 = 10000;
		Static430.aBoolean503 = false;
		Static64.anInt1192 = arg2;
		Static76.anInt1460 = 1;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IBII[I)V")
	public static void method2862(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		arg0--;
		@Pc(12) int local12 = arg1 - 1;
		@Pc(16) int local16 = local12 - 7;
		while (local16 > arg0) {
			@Pc(20) int local20 = arg0 + 1;
			arg3[local20] = arg2;
			@Pc(25) int local25 = local20 + 1;
			arg3[local25] = arg2;
			@Pc(30) int local30 = local25 + 1;
			arg3[local30] = arg2;
			@Pc(35) int local35 = local30 + 1;
			arg3[local35] = arg2;
			@Pc(40) int local40 = local35 + 1;
			arg3[local40] = arg2;
			@Pc(45) int local45 = local40 + 1;
			arg3[local45] = arg2;
			@Pc(50) int local50 = local45 + 1;
			arg3[local50] = arg2;
			arg0 = local50 + 1;
			arg3[arg0] = arg2;
		}
		while (local12 > arg0) {
			arg0++;
			arg3[arg0] = arg2;
		}
	}
}
