import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static514 {

	@OriginalMember(owner = "client!tm", name = "t", descriptor = "I")
	public static int anInt406;

	@OriginalMember(owner = "client!tm", name = "o", descriptor = "I")
	public static final int anInt401 = 1338;

	@OriginalMember(owner = "client!tm", name = "x", descriptor = "[I")
	public static final int[] anIntArray31 = new int[1000];

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZILclient!pl;)Lclient!ul;")
	public static Class2_Sub45 method235(@OriginalArg(1) int arg0, @OriginalArg(2) Class259 arg1) {
		@Pc(8) byte[] local8 = arg1.method5964(arg0);
		return local8 == null ? null : new Class2_Sub45(local8);
	}

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(I)V")
	public static void method236() {
		for (@Pc(15) Class2_Sub36 local15 = (Class2_Sub36) Static524.aClass8_62.method210(); local15 != null; local15 = (Class2_Sub36) Static524.aClass8_62.method218()) {
			if (local15.anInt6567 == -1) {
				local15.anInt6572 = 0;
				if (local15.anInt6574 >= 0 && local15.anInt6564 >= 0 && Static188.anInt3850 > local15.anInt6574 && Static49.anInt1174 > local15.anInt6564) {
					Static462.method6520(local15);
				}
			} else {
				local15.method7966();
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "(I)I")
	public static int method237() {
		return 46;
	}
}
