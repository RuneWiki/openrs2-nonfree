import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static187 {

	@OriginalMember(owner = "client!je", name = "d", descriptor = "Lclient!wt;")
	public static final Class268 aClass268_65 = new Class268("", 10);

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)I")
	public static int method2468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static106.aByteArrayArray14 == null ? 0 : (Static106.aByteArrayArray14[arg0][arg1] & 0xFF) << 3;
	}
}
