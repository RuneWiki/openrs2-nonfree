import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!rm", name = "J", descriptor = "Lclient!fk;")
	public static Class95 aClass95_2;

	@OriginalMember(owner = "client!rm", name = "I", descriptor = "Lclient!im;")
	public static final Class140 aClass140_115 = new Class140(42, 8);

	@OriginalMember(owner = "client!rm", name = "K", descriptor = "Lclient!bv;")
	public static final Class37 aClass37_80 = new Class37();

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZZ)Z")
	public static boolean method6172(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!jq;BLclient!qa;)V")
	public static void method6173(@OriginalArg(0) Class156 arg0, @OriginalArg(2) Class122 arg1) {
		@Pc(31) boolean local31 = Static342.aClass250_2.method5976(arg1, arg0.anInt4697, arg0.anInt4672, arg0.anInt4696, arg0.aBoolean328 ? Static63.aClass49_Sub2_Sub2_Sub1_1.aClass206_1 : null, arg0.anInt4728, arg0.anInt4651 | 0xFF000000) == null;
		if (local31) {
			Static467.aClass37_86.method970(new Class1_Sub23(arg0.anInt4697, arg0.anInt4728, arg0.anInt4672, arg0.anInt4651 | 0xFF000000, arg0.anInt4696, arg0.aBoolean328));
			Static473.method6593(arg0);
		}
	}
}
