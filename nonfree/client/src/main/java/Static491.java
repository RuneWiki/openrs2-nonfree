import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static491 {

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "Lclient!qja;")
	public static Class26 aClass26_12;

	@OriginalMember(owner = "client!qq", name = "f", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_153 = new Class44(69, 1);

	@OriginalMember(owner = "client!qq", name = "h", descriptor = "I")
	public static int anInt8761 = 0;

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method7256(@OriginalArg(1) String arg0) {
		if (!Static238.aBoolean302 || (Static156.anInt3080 & 0x18) == 0) {
			return;
		}
		@Pc(17) boolean local17 = false;
		@Pc(27) int local27 = Static209.anInt3954;
		@Pc(29) int[] local29 = Static457.anIntArray607;
		for (@Pc(31) int local31 = 0; local31 < local27; local31++) {
			@Pc(39) Class12_Sub2_Sub2_Sub1_Sub2 local39 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local29[local31]];
			if (local39.aString35 != null && local39.aString35.equalsIgnoreCase(arg0) && (Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2 == local39 && (Static156.anInt3080 & 0x10) != 0 || local39 != null && (Static156.anInt3080 & 0x8) != 0)) {
				@Pc(75) Class14_Sub19 local75 = Static286.method4081(Static205.aClass394_1, Static100.aClass100_30);
				local75.aClass14_Sub29_Sub1_1.method5871(Static68.anInt1565);
				local75.aClass14_Sub29_Sub1_1.method5894(Static639.anInt10686);
				local75.aClass14_Sub29_Sub1_1.method5871(local29[local31]);
				local75.aClass14_Sub29_Sub1_1.method5849(Static402.anInt10315);
				local75.aClass14_Sub29_Sub1_1.method5896(0);
				Static576.method8234(local75);
				local17 = true;
				Static380.method5625(local39.method2422(), -2, local39.method2422(), local39.anIntArray241[0], true, local39.anIntArray242[0], 0, 0);
				break;
			}
		}
		if (!local17) {
			Static271.method3957(Static514.aClass303_23.method7473(Static232.anInt4258) + arg0);
		}
		if (Static238.aBoolean302) {
			Static141.method1563();
		}
	}
}
