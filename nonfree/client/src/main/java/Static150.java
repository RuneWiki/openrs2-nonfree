import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!fda", name = "e", descriptor = "Lclient!hia;")
	public static Class145 aClass145_1;

	@OriginalMember(owner = "client!fda", name = "f", descriptor = "Lclient!hia;")
	public static Class145 aClass145_2;

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_105 = new Class179(104, 6);

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray15 = new int[2][][];

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(II)Z")
	public static boolean method2158(@OriginalArg(0) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(ILclient!ro;III)V")
	public static void method2159(@OriginalArg(0) int arg0, @OriginalArg(1) Class308 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) Class6_Sub35 local15 = (Class6_Sub35) Static130.aClass362_12.method8538(); local15 != null; local15 = (Class6_Sub35) Static130.aClass362_12.method8530()) {
			if (local15.anInt5736 == arg2 && local15.anInt5741 == arg0 << 9 && local15.anInt5740 == arg3 << 9 && arg1.anInt8569 == local15.aClass308_1.anInt8569) {
				if (local15.aClass6_Sub8_Sub5_2 != null) {
					Static106.aClass6_Sub8_Sub3_2.method4258(local15.aClass6_Sub8_Sub5_2);
					local15.aClass6_Sub8_Sub5_2 = null;
				}
				if (local15.aClass6_Sub8_Sub5_3 != null) {
					Static106.aClass6_Sub8_Sub3_2.method4258(local15.aClass6_Sub8_Sub5_3);
					local15.aClass6_Sub8_Sub5_3 = null;
				}
				local15.method9174();
				return;
			}
		}
	}
}
