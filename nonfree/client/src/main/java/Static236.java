import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_111 = new Class81(19, 0);

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
	public static int anInt4450 = -50;

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "Lclient!jb;")
	public static final Class165 aClass165_2 = new Class165();

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
	public static int anInt4451 = 0;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([[BILclient!sca;)V")
	public static void method3832(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class231_Sub1 arg1) {
		@Pc(15) int local15 = Static331.aByteArrayArray20.length;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(23) byte[] local23 = arg0[local17];
			if (local23 != null) {
				@Pc(36) int local36 = (Static298.anIntArray348[local17] >> 8) * 64 - Static376.anInt6631;
				@Pc(46) int local46 = (Static298.anIntArray348[local17] & 0xFF) * 64 - Static24.anInt674;
				Static99.method1834();
				arg1.method6699(Static136.aClass12_8, local36, local23, Static28.aClass94Array2, local46);
			}
		}
	}
}
