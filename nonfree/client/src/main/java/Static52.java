import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!bw", name = "M", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_39 = new Class123(6, -2);

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lclient!dw;B)V")
	public static void method1261(@OriginalArg(0) Class77 arg0) {
		Static417.aClass77_1 = arg0;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lclient!pba;B)V")
	public static void method1263(@OriginalArg(0) Class25_Sub2_Sub2_Sub5_Sub1 arg0) {
		@Pc(15) Class3_Sub30 local15 = (Class3_Sub30) Static66.aClass297_3.method6531((long) arg0.anInt8529);
		if (local15 == null) {
			return;
		}
		if (local15.aClass3_Sub16_Sub2_2 != null) {
			Static354.aClass3_Sub16_Sub4_2.method7757(local15.aClass3_Sub16_Sub2_2);
			local15.aClass3_Sub16_Sub2_2 = null;
		}
		local15.method8128();
	}
}
