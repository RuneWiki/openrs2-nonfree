import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!tn", name = "v", descriptor = "I")
	public static int anInt5058;

	@OriginalMember(owner = "client!tn", name = "o", descriptor = "I")
	public static int anInt5052 = 0;

	@OriginalMember(owner = "client!tn", name = "r", descriptor = "[I")
	public static final int[] anIntArray385 = new int[200];

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!ol;III)V")
	public static void method4629(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = Static99.anIntArrayArrayArray2[arg1][arg2][arg3];
		@Pc(9) int local9 = 0;
		arg0.anInt6003 = 0;
		@Pc(19) int local19;
		while (local9 <= 24) {
			local19 = local7 >> local9 & 0xFF;
			if (local19 <= 0) {
				break;
			}
			arg0.aClass2_Sub36_Sub1Array6[arg0.anInt6003++] = Static288.aClass2_Sub36_Sub1Array7[local19 - 1];
			local9 += 8;
		}
		for (local19 = arg0.anInt6003; local19 < 4; local19++) {
			arg0.aClass2_Sub36_Sub1Array6[local19] = null;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(BZLjava/awt/Component;)Lclient!fa;")
	public static Class61 method4632(@OriginalArg(2) Component arg0) {
		return new Class61_Sub1(arg0, true);
	}
}
