import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static668 {

	@OriginalMember(owner = "client!wl", name = "q", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_251 = new Class359(94, 6);

	@OriginalMember(owner = "client!wl", name = "x", descriptor = "[I")
	public static final int[] anIntArray608 = new int[8];

	@OriginalMember(owner = "client!wl", name = "A", descriptor = "I")
	public static final int anInt10703 = 1407;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!ck;I)V")
	public static void method8899(@OriginalArg(0) Class65_Sub1 arg0) {
		@Pc(16) byte[] local16;
		if (Static493.anObject17 == null) {
			@Pc(9) Class13_Sub2_Sub1 local9 = new Class13_Sub2_Sub1();
			local16 = local9.method6396();
			Static493.anObject17 = Static249.method3855(local16);
		}
		if (Static322.anObject11 == null) {
			@Pc(33) Class13_Sub1_Sub2 local33 = new Class13_Sub1_Sub2();
			local16 = local33.method2938();
			Static322.anObject11 = Static249.method3855(local16);
		}
		@Pc(48) Class112 local48 = arg0.aClass112_1;
		if (local48.method2789() && Static468.anObject16 == null) {
			local16 = Static86.method1838(16.0F, 0.5F, 0.6F, 4.0F, new Class34_Sub1(419684), 4.0F);
			Static468.anObject16 = Static249.method3855(local16);
		}
	}
}
