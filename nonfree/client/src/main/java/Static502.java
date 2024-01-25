import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static502 {

	@OriginalMember(owner = "client!pv", name = "h", descriptor = "I")
	public static int anInt8594;

	@OriginalMember(owner = "client!pv", name = "d", descriptor = "I")
	public static int anInt8591 = 0;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)I")
	public static int method7210() {
		if (Static691.aFrame2 == null) {
			return Static650.aBoolean755 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IJB)Lclient!bh;")
	public static Class3_Sub4_Sub2 method7211(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		@Pc(20) Class3_Sub4_Sub2 local20 = (Class3_Sub4_Sub2) Static640.aClass136_47.method3503((long) arg0 << 56 | arg1);
		if (local20 == null) {
			local20 = new Class3_Sub4_Sub2(arg0, arg1);
			Static640.aClass136_47.method3508(local20.aLong382, local20);
		}
		return local20;
	}
}
