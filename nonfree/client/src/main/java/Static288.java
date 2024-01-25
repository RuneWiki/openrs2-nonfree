import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!ol", name = "k", descriptor = "I")
	public static int anInt4731 = 0;

	@OriginalMember(owner = "client!ol", name = "m", descriptor = "[B")
	public static final byte[] aByteArray59 = new byte[2048];

	@OriginalMember(owner = "client!ol", name = "H", descriptor = "I")
	public static int anInt4743 = -1;

	@OriginalMember(owner = "client!ol", name = "M", descriptor = "[I")
	public static final int[] anIntArray412 = new int[1];

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZZI)V")
	public static void method3840(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class2_Sub36 local13 = Static382.method4911(arg0, arg1);
		if (local13 != null) {
			local13.method5703();
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)I")
	public static int method3842() {
		return 2;
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)V")
	public static void method3843() {
		Static251.method3194();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static361.aClass71Array1[local8].method1621();
		}
		Static12.method161();
		Static190.method2553();
		System.gc();
	}
}
