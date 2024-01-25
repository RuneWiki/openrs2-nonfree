import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!ft", name = "B", descriptor = "F")
	public static float aFloat49;

	@OriginalMember(owner = "client!ft", name = "I", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray19;

	@OriginalMember(owner = "client!ft", name = "J", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray20;

	@OriginalMember(owner = "client!ft", name = "H", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable2 = new Hashtable();

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILclient!og;[II)V")
	public static void method2826(@OriginalArg(1) Class9_Sub1_Sub1_Sub2_Sub2 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(10) boolean local10;
		@Pc(12) int local12;
		if (arg0.anIntArray515 != null) {
			local10 = true;
			for (local12 = 0; local12 < arg0.anIntArray515.length; local12++) {
				if (arg0.anIntArray515[local12] != arg1[local12]) {
					local10 = false;
					break;
				}
			}
			if (local10 && arg0.anInt6453 != -1) {
				@Pc(48) Class17 local48 = Static330.aClass279_2.method6216(arg0.anInt6453);
				@Pc(51) int local51 = local48.anInt555;
				if (local51 == 1) {
					arg0.anInt6440 = 1;
					arg0.anInt6438 = arg2;
					arg0.anInt6441 = 0;
					arg0.anInt6385 = 0;
					arg0.anInt6423 = 0;
					Static351.method5300(arg0.anInt6385, local48, arg0.anInt8980, arg0.anInt8975, arg0.aByte126, Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2 == arg0);
				}
				if (local51 == 2) {
					arg0.anInt6423 = 0;
				}
			}
		}
		local10 = true;
		for (local12 = 0; local12 < arg1.length; local12++) {
			if (arg1[local12] != -1) {
				local10 = false;
			}
			if (arg0.anIntArray515 == null || arg0.anIntArray515[local12] == -1 || Static330.aClass279_2.method6216(arg1[local12]).anInt559 >= Static330.aClass279_2.method6216(arg0.anIntArray515[local12]).anInt559) {
				arg0.anIntArray515 = arg1;
				arg0.anInt6438 = arg2;
				break;
			}
		}
		if (local10) {
			arg0.anIntArray515 = arg1;
			arg0.anInt6438 = arg2;
		}
	}
}
