import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static488 {

	@OriginalMember(owner = "client!sw", name = "s", descriptor = "I")
	public static int anInt2823 = 0;

	@OriginalMember(owner = "client!sw", name = "y", descriptor = "Lclient!rw;")
	public static final Class297 aClass297_6 = new Class297(8, 1);

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(III)V")
	public static void method2260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static292.aClass39ArrayArrayArray2[0][arg1][arg2] != null && Static292.aClass39ArrayArrayArray2[0][arg1][arg2].aClass39_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static292.aClass39ArrayArrayArray2[local22][arg1][arg2] == null) {
				@Pc(44) Class39 local44 = Static292.aClass39ArrayArrayArray2[local22][arg1][arg2] = new Class39(local22);
				if (local20) {
					local44.aByte21++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2261(@OriginalArg(0) String arg0) {
		if (Static301.aClass218Array1 != null) {
			@Pc(15) Class1_Sub11 local15 = Static276.method3885(Static521.aClass70_94, Static481.aClass276_2);
			local15.aClass1_Sub35_Sub2_1.method5777(Static358.method4886(arg0));
			local15.aClass1_Sub35_Sub2_1.method5761(arg0);
			Static48.method743(local15);
		}
	}

	@OriginalMember(owner = "client!sw", name = "d", descriptor = "(B)V")
	public static void method2263() {
		if (Static362.aClass109_5.aBoolean206 && Static480.aClass227_3.anInt5547 != -1) {
			Static249.method3697(Static480.aClass227_3.anInt5547, Static480.aClass227_3.aString53);
		}
	}
}
