import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
	public static int anInt778;

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
	public static int anInt780;

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
	public static int anInt782;

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "Lclient!of;")
	public static Class5_Sub17_Sub4 aClass5_Sub17_Sub4_2;

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "[I")
	public static final int[] anIntArray43 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZLclient!sv;II)V")
	public static void method704(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub51 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg3 | arg2 << 14 | arg0 << 28);
		@Pc(22) Class5_Sub31 local22 = (Class5_Sub31) Static548.aClass300_41.method7188(local16);
		if (local22 == null) {
			local22 = new Class5_Sub31();
			Static548.aClass300_41.method7191(local22, local16);
			local22.aClass114_39.method2807(arg1);
			return;
		}
		@Pc(45) Class238 local45 = Static110.aClass105_1.method2659(arg1.anInt9059);
		@Pc(48) int local48 = local45.anInt6842;
		if (local45.anInt6890 == 1) {
			local48 *= arg1.anInt9060 + 1;
		}
		for (@Pc(67) Class5_Sub51 local67 = (Class5_Sub51) local22.aClass114_39.method2805(); local67 != null; local67 = (Class5_Sub51) local22.aClass114_39.method2814()) {
			local45 = Static110.aClass105_1.method2659(local67.anInt9059);
			@Pc(78) int local78 = local45.anInt6842;
			if (local45.anInt6890 == 1) {
				local78 *= local67.anInt9060 + 1;
			}
			if (local48 > local78) {
				Static619.method8412(local67, arg1);
				return;
			}
		}
		local22.aClass114_39.method2807(arg1);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!kh;Lclient!kh;)V")
	public static void method705(@OriginalArg(1) Class5_Sub3 arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0.aClass5_Sub3_67 != null) {
			arg0.method8687();
		}
		arg0.aClass5_Sub3_66 = arg1.aClass5_Sub3_66;
		arg0.aClass5_Sub3_67 = arg1;
		arg0.aClass5_Sub3_67.aClass5_Sub3_66 = arg0;
		arg0.aClass5_Sub3_66.aClass5_Sub3_67 = arg0;
	}
}
