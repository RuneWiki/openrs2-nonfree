import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static75 {

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "Lclient!mo;")
	public static final Class215 aClass215_1 = new Class215("LIVE", 0);

	@OriginalMember(owner = "client!cr", name = "g", descriptor = "Lclient!sk;")
	public static final Class309 aClass309_3 = new Class309();

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)V")
	public static void method1683(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static190.anInt3685 = arg0;
		Static397.aClass9_Sub6Array1 = new Class9_Sub6[Static26.anIntArray657[Static190.anInt3685] + 1];
		Static516.anInt8174 = 0;
		Static537.anInt4383 = 0;
	}
}
