import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!p", name = "c", descriptor = "Lclient!kh;")
	public static Class55 aClass55_2;

	@OriginalMember(owner = "client!p", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString70 = null;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
	public static void method5941(@OriginalArg(0) int arg0) {
		Static71.anInt1486 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static401.anInt6621; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static364.anInt6134; local6++) {
				if (Static30.aClass189ArrayArrayArray2[arg0][local3][local6] == null) {
					Static30.aClass189ArrayArrayArray2[arg0][local3][local6] = new Class189(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V")
	public static void method5942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class189 local7 = Static30.aClass189ArrayArrayArray2[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class189 local28 = Static30.aClass189ArrayArrayArray2[local9][arg0][arg1] = Static30.aClass189ArrayArrayArray2[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte53--;
				for (@Pc(40) Class242 local40 = local28.aClass242_2; local40 != null; local40 = local40.aClass242_4) {
					@Pc(44) Class3_Sub3 local44 = local40.aClass3_Sub3_2;
					if (local44.aShort97 == arg0 && local44.aShort95 == arg1) {
						local44.aByte93--;
					}
				}
			}
		}
		if (Static30.aClass189ArrayArrayArray2[0][arg0][arg1] == null) {
			Static30.aClass189ArrayArrayArray2[0][arg0][arg1] = new Class189(0, arg0, arg1);
			Static30.aClass189ArrayArrayArray2[0][arg0][arg1].aByte58 = 1;
		}
		Static30.aClass189ArrayArrayArray2[0][arg0][arg1].aClass189_1 = local7;
		Static30.aClass189ArrayArrayArray2[3][arg0][arg1] = null;
	}
}
