import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static321 {

	@OriginalMember(owner = "client!mea", name = "y", descriptor = "[S")
	public static final short[] aShortArray70 = new short[] { -10304, 9104, 25485, 4620, 4540 };

	@OriginalMember(owner = "client!mea", name = "C", descriptor = "[S")
	private static final short[] aShortArray71 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!mea", name = "F", descriptor = "[S")
	private static final short[] aShortArray72 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!mea", name = "K", descriptor = "[[S")
	public static final short[][] aShortArrayArray7 = new short[][] { aShortArray72, aShortArray70, aShortArray71 };

	@OriginalMember(owner = "client!mea", name = "L", descriptor = "I")
	public static int anInt5786 = 0;

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Lclient!uq;Lclient!uq;I)V")
	public static void method4884(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(1) Class1_Sub3 arg1) {
		if (arg1.aClass1_Sub3_61 != null) {
			arg1.method7811();
		}
		arg1.aClass1_Sub3_62 = arg0.aClass1_Sub3_62;
		arg1.aClass1_Sub3_61 = arg0;
		arg1.aClass1_Sub3_61.aClass1_Sub3_62 = arg1;
		arg1.aClass1_Sub3_62.aClass1_Sub3_61 = arg1;
	}
}
