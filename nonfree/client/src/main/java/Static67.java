import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!dd", name = "q", descriptor = "Lclient!wo;")
	public static Class266 aClass266_12;

	@OriginalMember(owner = "client!dd", name = "z", descriptor = "I")
	public static final int anInt1398 = 1337;

	@OriginalMember(owner = "client!dd", name = "F", descriptor = "[B")
	public static final byte[] aByteArray18 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!vh;)I")
	public static int method1187(@OriginalArg(1) Class250 arg0) {
		@Pc(10) int local10 = 0;
		if (arg0.method5668(Static409.anInt7172)) {
			local10++;
		}
		if (arg0.method5668(Static285.anInt7834)) {
			local10++;
		}
		return local10;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BJ)V")
	public static void method1189(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static143.method2136(arg0 - 1L);
			Static143.method2136(1L);
		} else {
			Static143.method2136(arg0);
		}
	}
}
