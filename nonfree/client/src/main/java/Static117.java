import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "I")
	public static int anInt2450 = 104;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(III)Z")
	public static boolean method2023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static2.method5318(arg0, arg1) | (arg0 & 0x800) != 0 || Static173.method2864(arg1, arg0);
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
	public static void method2028() {
		for (@Pc(12) Class6_Sub2_Sub9 local12 = (Class6_Sub2_Sub9) Static5.aClass244_3.method5976(); local12 != null; local12 = (Class6_Sub2_Sub9) Static5.aClass244_3.method5964()) {
			@Pc(22) Class3_Sub2_Sub5 local22 = local12.aClass3_Sub2_Sub5_1;
			if (local22.aByte103 != Static388.anInt6870 || Static66.anInt1741 > local22.anInt4334) {
				local12.method6525();
				local22.method3665();
			} else if (local22.anInt4335 <= Static66.anInt1741) {
				if (local22.anInt4351 > 0) {
					@Pc(48) Class3_Sub2_Sub1_Sub1 local48 = Static308.aClass3_Sub2_Sub1_Sub1Array1[local22.anInt4351 - 1];
					if (local48 != null && local48.anInt7202 >= 0 && local48.anInt7202 < Static181.anInt3574 * 128 && local48.anInt7207 >= 0 && local48.anInt7207 < anInt2450 * 128) {
						local22.method3661(Static66.anInt1741, Static221.method3331(local22.aByte103, local48.anInt7207, local48.anInt7202) - local22.anInt4333, local48.anInt7207, local48.anInt7202);
					}
				}
				if (local22.anInt4351 < 0) {
					@Pc(111) int local111 = -local22.anInt4351 - 1;
					@Pc(120) Class3_Sub2_Sub1_Sub2 local120;
					if (Static4.anInt7923 == local111) {
						local120 = Static302.aClass3_Sub2_Sub1_Sub2_2;
					} else {
						local120 = Static374.aClass3_Sub2_Sub1_Sub2Array1[local111];
					}
					if (local120 != null && local120.anInt7202 >= 0 && Static181.anInt3574 * 128 > local120.anInt7202 && local120.anInt7207 >= 0 && anInt2450 * 128 > local120.anInt7207) {
						local22.method3661(Static66.anInt1741, Static221.method3331(local22.aByte103, local120.anInt7207, local120.anInt7202) - local22.anInt4333, local120.anInt7207, local120.anInt7202);
					}
				}
				local22.method3664(Static254.anInt4641);
				Static411.method6066(local22, true);
			}
		}
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(ILclient!ae;)Lclient!n;")
	public static Class7_Sub3 method2029(@OriginalArg(1) Class6_Sub1 arg0) {
		return new Class7_Sub3(arg0.method6428(), arg0.method6428(), arg0.method6428(), arg0.method6428(), arg0.method6435(), arg0.method6433());
	}
}
