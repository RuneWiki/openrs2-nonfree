import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static394 {

	@OriginalMember(owner = "client!qc", name = "M", descriptor = "I")
	public static int anInt7079;

	@OriginalMember(owner = "client!qc", name = "B", descriptor = "[S")
	public static final short[] aShortArray111 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!qc", name = "J", descriptor = "[[I")
	public static final int[][] anIntArrayArray59 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(III)Z")
	public static boolean method5746(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!ke;Lclient!ke;B)V")
	public static void method5747(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) Class5_Sub2 arg1) {
		if (arg1.aClass5_Sub2_59 != null) {
			arg1.method7323();
		}
		arg1.aClass5_Sub2_60 = arg0.aClass5_Sub2_60;
		arg1.aClass5_Sub2_59 = arg0;
		arg1.aClass5_Sub2_59.aClass5_Sub2_60 = arg1;
		arg1.aClass5_Sub2_60.aClass5_Sub2_59 = arg1;
	}
}
