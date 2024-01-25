import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!us", name = "a", descriptor = "Lclient!he;")
	public static Class100 aClass100_89;

	@OriginalMember(owner = "client!us", name = "d", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_144 = new Class92(53, 4);

	@OriginalMember(owner = "client!us", name = "f", descriptor = "[I")
	public static final int[] anIntArray504 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!us", name = "g", descriptor = "[B")
	public static final byte[] aByteArray90 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(II)I")
	public static int method6046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static310.aByteArrayArray21 == null ? 0 : (Static310.aByteArrayArray21[arg0][arg1] & 0xFF) << 3;
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(II)V")
	public static void method6047() {
		@Pc(5) Class44 local5 = Static79.aClass44_6;
		synchronized (Static79.aClass44_6) {
			Static79.aClass44_6.method1352(5);
		}
		local5 = Static415.aClass44_53;
		synchronized (Static415.aClass44_53) {
			Static415.aClass44_53.method1352(5);
		}
	}
}
