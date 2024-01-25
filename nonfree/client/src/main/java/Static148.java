import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_60 = new Class298(6, 5);

	@OriginalMember(owner = "client!fl", name = "h", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_61 = new Class298(56, -1);

	@OriginalMember(owner = "client!fl", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString42 = null;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BI)I")
	public static int method2766(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAA) >>> 1);
		@Pc(24) int local24 = (local9 & 0x33333333) + (local9 >>> 2 & 0xB3333333);
		@Pc(37) int local37 = (local24 >>> 4) + local24 & 0xF0F0F0F;
		@Pc(43) int local43 = local37 + (local37 >>> 8);
		@Pc(49) int local49 = local43 + (local43 >>> 16);
		return local49 & 0xFF;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!lk;II)I")
	public static int method2768(@OriginalArg(0) Class203 arg0, @OriginalArg(2) int arg1) {
		if (!Static69.method1651(arg0).method570(arg1) && arg0.anObjectArray29 == null) {
			return -1;
		} else if (arg0.anIntArray415 == null || arg0.anIntArray415.length <= arg1) {
			return -1;
		} else {
			return arg0.anIntArray415[arg1];
		}
	}
}
