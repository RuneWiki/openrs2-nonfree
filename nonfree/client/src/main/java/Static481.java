import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static481 {

	@OriginalMember(owner = "client!ov", name = "d", descriptor = "I")
	public static int anInt7537;

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_120 = new Class397(40, 7);

	@OriginalMember(owner = "client!ov", name = "i", descriptor = "I")
	public static int anInt7534 = 0;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIII)V")
	public static void method6508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class3_Sub7_Sub21 local9 = Static136.method2378((long) arg1, 11);
		local9.method9256();
		local9.anInt10897 = arg0;
		local9.anInt10899 = arg2;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIB)V")
	public static void method6509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class208 local9 = Static343.aClass208ArrayArray1[arg0][arg1];
		if (local9 != null) {
			Static544.anInt9947 = local9.anInt5419;
			Static717.anInt11159 = local9.anInt5428;
			Static214.anInt3521 = local9.anInt5415;
		}
		Static92.method1942();
	}
}
