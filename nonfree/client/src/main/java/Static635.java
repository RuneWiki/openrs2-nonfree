import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static635 {

	@OriginalMember(owner = "client!vha", name = "w", descriptor = "[J")
	public static long[] aLongArray19;

	@OriginalMember(owner = "client!vha", name = "y", descriptor = "Lclient!tv;")
	public static Class356 aClass356_1;

	@OriginalMember(owner = "client!vha", name = "t", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_207 = new Class156(48, 5);

	@OriginalMember(owner = "client!vha", name = "B", descriptor = "[I")
	public static final int[] anIntArray587 = new int[4096];

	@OriginalMember(owner = "client!vha", name = "z", descriptor = "[I")
	public static final int[] anIntArray588 = new int[2];

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(I)V")
	public static void method8807() {
		@Pc(15) int local15 = Static577.aClass5_Sub19_25.aClass17_Sub19_2.method6648();
		if (local15 == 0) {
			Static524.aByteArrayArrayArray22 = null;
			Static361.method5254(0);
		} else if (local15 == 1) {
			Static249.method3984((byte) 0);
			Static361.method5254(512);
			if (Static172.aByteArrayArrayArray23 != null) {
				Static356.method5226();
			}
		} else {
			Static249.method3984((byte) (Static154.anInt3001 - 4 & 0xFF));
			Static361.method5254(2);
		}
		Static6.anInt74 = Static324.anInt5529;
	}
}
