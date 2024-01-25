import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)Lclient!ija;")
	public static Class5_Sub5_Sub12 method5809() {
		return Static629.aClass5_Sub5_Sub12_3;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)V")
	public static void method5810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class5_Sub5_Sub6 local9 = Static478.method6972((long) arg1, 7);
		local9.method2687();
		local9.anInt3058 = arg0;
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(Z)V")
	public static void method5811() {
		for (@Pc(10) Class5_Sub5_Sub18 local10 = (Class5_Sub5_Sub18) Static86.aClass149_5.method2890(); local10 != null; local10 = (Class5_Sub5_Sub18) Static86.aClass149_5.method2894()) {
			if (local10.anInt7610 > 1) {
				local10.anInt7610 = 0;
				Static488.aClass391_46.method9273(((Class5_Sub5_Sub19) local10.aClass149_8.aClass5_Sub5_24.aClass5_Sub5_66).aLong268, local10, 1);
				local10.aClass149_8.method2891();
			}
		}
		Static220.anInt3580 = 0;
		Static481.anInt8130 = 0;
		Static199.aClass102_63.method1932();
		Static595.aClass291_42.method6986(-93);
		Static86.aClass149_5.method2891();
		Static298.method4400(Static262.aClass5_Sub5_Sub19_4);
	}
}
