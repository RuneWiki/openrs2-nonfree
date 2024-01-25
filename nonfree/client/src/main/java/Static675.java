import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static675 {

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "F")
	public static float aFloat194;

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "Lclient!jj;")
	public static Class193 aClass193_8;

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "Lclient!ik;")
	public static Class182 aClass182_124;

	@OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
	public static int anInt10593 = 0;

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_103 = new Class144(14, 7);

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)Z")
	public static boolean method9005(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZB)V")
	public static void method9007(@OriginalArg(0) boolean arg0) {
		for (@Pc(11) Class3_Sub56 local11 = (Class3_Sub56) Static581.aClass342_71.method7644(); local11 != null; local11 = (Class3_Sub56) Static581.aClass342_71.method7650()) {
			if (local11.aClass3_Sub33_Sub5_1 != null) {
				Static391.aClass3_Sub33_Sub4_1.method8544(local11.aClass3_Sub33_Sub5_1);
				local11.aClass3_Sub33_Sub5_1 = null;
			}
			if (local11.aClass3_Sub33_Sub5_2 != null) {
				Static391.aClass3_Sub33_Sub4_1.method8544(local11.aClass3_Sub33_Sub5_2);
				local11.aClass3_Sub33_Sub5_2 = null;
			}
			local11.method9596();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(64) Class3_Sub56 local64 = (Class3_Sub56) Static420.aClass342_49.method7644(); local64 != null; local64 = (Class3_Sub56) Static420.aClass342_49.method7650()) {
			if (local64.aClass3_Sub33_Sub5_1 != null) {
				Static391.aClass3_Sub33_Sub4_1.method8544(local64.aClass3_Sub33_Sub5_1);
				local64.aClass3_Sub33_Sub5_1 = null;
			}
			local64.method9596();
		}
		for (@Pc(95) Class3_Sub56 local95 = (Class3_Sub56) Static251.aClass313_20.method7103(); local95 != null; local95 = (Class3_Sub56) Static251.aClass313_20.method7110()) {
			if (local95.aClass3_Sub33_Sub5_1 != null) {
				Static391.aClass3_Sub33_Sub4_1.method8544(local95.aClass3_Sub33_Sub5_1);
				local95.aClass3_Sub33_Sub5_1 = null;
			}
			local95.method9596();
		}
	}
}
