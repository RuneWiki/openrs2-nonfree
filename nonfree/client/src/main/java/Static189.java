import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!ja", name = "G", descriptor = "I")
	public static int anInt3178 = 0;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIILjava/lang/Object;)[B")
	public static byte[] method2558(@OriginalArg(0) int arg0, @OriginalArg(3) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return Static80.method1166(arg0, local13);
		} else if (arg1 instanceof Class19) {
			@Pc(25) Class19 local25 = (Class19) arg1;
			return local25.method457(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIILclient!so;Lclient!so;)V")
	public static void method2559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub2 arg3, @OriginalArg(4) Class2_Sub2 arg4) {
		@Pc(4) Class258 local4 = Static121.method1714(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass2_Sub2_2 = arg3;
			local4.aClass2_Sub2_3 = arg4;
		}
	}
}
