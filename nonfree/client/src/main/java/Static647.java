import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static647 {

	@OriginalMember(owner = "client!vs", name = "g", descriptor = "Lclient!gda;")
	public static Class126 aClass126_291;

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "Lclient!vb;")
	public static Class371 aClass371_15;

	@OriginalMember(owner = "client!vs", name = "l", descriptor = "I")
	public static int anInt10548;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(ILclient!vn;Lclient!wha;)Lclient!nq;")
	public static Class5_Sub41 method8905(@OriginalArg(1) Class381 arg0, @OriginalArg(2) Class393 arg1) {
		@Pc(15) Class5_Sub41 local15 = Static9.method145();
		local15.aClass381_174 = arg0;
		local15.anInt6757 = arg0.anInt10520;
		if (local15.anInt6757 == -1) {
			local15.aClass5_Sub36_Sub2_1 = new Class5_Sub36_Sub2(260);
		} else if (local15.anInt6757 == -2) {
			local15.aClass5_Sub36_Sub2_1 = new Class5_Sub36_Sub2(10000);
		} else if (local15.anInt6757 <= 18) {
			local15.aClass5_Sub36_Sub2_1 = new Class5_Sub36_Sub2(20);
		} else if (local15.anInt6757 > 98) {
			local15.aClass5_Sub36_Sub2_1 = new Class5_Sub36_Sub2(260);
		} else {
			local15.aClass5_Sub36_Sub2_1 = new Class5_Sub36_Sub2(100);
		}
		local15.aClass5_Sub36_Sub2_1.method7335(arg1);
		local15.aClass5_Sub36_Sub2_1.method7334(local15.aClass381_174.method8886());
		local15.anInt6761 = 0;
		return local15;
	}

	@OriginalMember(owner = "client!vs", name = "e", descriptor = "(I)V")
	public static void method8907() {
		Static220.aClass168_40.method3862();
	}
}
