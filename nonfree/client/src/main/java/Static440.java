import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
	public static final int anInt7417 = 1401;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILclient!fha;B[I)V")
	public static void method6531(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub1_Sub1_Sub3_Sub1 arg1, @OriginalArg(3) int[] arg2) {
		@Pc(10) boolean local10;
		@Pc(12) int local12;
		if (arg1.anIntArray243 != null) {
			local10 = true;
			for (local12 = 0; local12 < arg1.anIntArray243.length; local12++) {
				if (arg1.anIntArray243[local12] != arg2[local12]) {
					local10 = false;
					break;
				}
			}
			if (local10 && arg1.anInt2930 != -1) {
				@Pc(48) Class200 local48 = Static396.aClass359_2.method8415(arg1.anInt2930);
				@Pc(51) int local51 = local48.anInt4871;
				if (local51 == 1) {
					arg1.anInt2947 = 0;
					arg1.anInt2918 = arg0;
					arg1.anInt2913 = 0;
					arg1.anInt2903 = 1;
					arg1.anInt2914 = 0;
					if (!arg1.aBoolean255) {
						Static270.method4083(local48, arg1.anInt2914, arg1);
					}
				}
				if (local51 == 2) {
					arg1.anInt2913 = 0;
				}
			}
		}
		local10 = true;
		for (local12 = 0; local12 < arg2.length; local12++) {
			if (arg2[local12] != -1) {
				local10 = false;
			}
			if (arg1.anIntArray243 == null || arg1.anIntArray243[local12] == -1 || Static396.aClass359_2.method8415(arg2[local12]).anInt4870 >= Static396.aClass359_2.method8415(arg1.anIntArray243[local12]).anInt4870) {
				arg1.anInt2918 = arg0;
				arg1.anIntArray243 = arg2;
				break;
			}
		}
		if (local10) {
			arg1.anIntArray243 = arg2;
			arg1.anInt2918 = arg0;
		}
	}
}
