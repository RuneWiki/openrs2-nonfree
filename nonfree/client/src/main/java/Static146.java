import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!ek", name = "s", descriptor = "Lclient!jj;")
	public static Class193 aClass193_6;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZIIILclient!mf;)V")
	public static void method6876(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class247 arg3) {
		for (@Pc(17) Class3_Sub56 local17 = (Class3_Sub56) Static581.aClass342_71.method7644(); local17 != null; local17 = (Class3_Sub56) Static581.aClass342_71.method7650()) {
			if (arg1 == local17.anInt10753 && local17.anInt10743 == arg2 << 9 && arg0 << 9 == local17.anInt10741 && arg3.anInt6249 == local17.aClass247_1.anInt6249) {
				if (local17.aClass3_Sub33_Sub5_1 != null) {
					Static391.aClass3_Sub33_Sub4_1.method8544(local17.aClass3_Sub33_Sub5_1);
					local17.aClass3_Sub33_Sub5_1 = null;
				}
				if (local17.aClass3_Sub33_Sub5_2 != null) {
					Static391.aClass3_Sub33_Sub4_1.method8544(local17.aClass3_Sub33_Sub5_2);
					local17.aClass3_Sub33_Sub5_2 = null;
				}
				local17.method9596();
				return;
			}
		}
	}
}
