import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static164 {

	@OriginalMember(owner = "client!fp", name = "C", descriptor = "I")
	public static int anInt5714;

	@OriginalMember(owner = "client!fp", name = "G", descriptor = "I")
	public static int anInt5717 = 0;

	@OriginalMember(owner = "client!fp", name = "Q", descriptor = "I")
	public static int anInt5725 = -1;

	@OriginalMember(owner = "client!fp", name = "R", descriptor = "[I")
	public static final int[] anIntArray424 = new int[8];

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!dg;BLclient!dg;)V")
	public static void method5099(@OriginalArg(0) Class5_Sub4 arg0, @OriginalArg(2) Class5_Sub4 arg1) {
		if (arg1.aClass5_Sub4_66 != null) {
			arg1.method8741();
		}
		arg1.aClass5_Sub4_66 = arg0.aClass5_Sub4_66;
		arg1.aClass5_Sub4_67 = arg0;
		arg1.aClass5_Sub4_66.aClass5_Sub4_67 = arg1;
		arg1.aClass5_Sub4_67.aClass5_Sub4_66 = arg1;
	}
}
