import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!cf", name = "C", descriptor = "[I")
	public static int[] anIntArray445;

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
	public static int anInt3983 = 0;

	@OriginalMember(owner = "client!cf", name = "u", descriptor = "I")
	public static int anInt3990 = 0;

	@OriginalMember(owner = "client!cf", name = "z", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1450 = Static65.method1172("Lade)3)3)3");

	@OriginalMember(owner = "client!cf", name = "A", descriptor = "I")
	public static int anInt3993 = -1;

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V")
	public static void method2907() {
		anIntArray445 = null;
		aClass46_1450 = null;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!kb;Lclient!jg;BLclient!kb;)[Lclient!na;")
	public static Class3_Sub2_Sub3_Sub2[] method2908(@OriginalArg(0) Class46 arg0, @OriginalArg(1) Class44 arg1, @OriginalArg(3) Class46 arg2) {
		@Pc(8) int local8 = arg1.method1617(arg0);
		@Pc(19) int local19 = arg1.method1631(arg2, local8);
		return Static55.method1037(local19, local8, arg1);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)Z")
	public static boolean method2912(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(22) int local22 = Static134.anIntArray352[arg0];
		if (local22 >= 2000) {
			local22 -= 2000;
		}
		return local22 == 1006;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIII)I")
	public static int method2917(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static119.aByteArrayArrayArray5[arg2][arg0][arg1] & 0x8) == 0) {
			return arg2 <= 0 || (Static119.aByteArrayArrayArray5[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}
}
