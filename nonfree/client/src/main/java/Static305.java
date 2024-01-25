import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!ph", name = "r", descriptor = "Lclient!fh;")
	public static Class4_Sub9 aClass4_Sub9_8;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IBI)Z")
	public static boolean method3991(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static347.method4605(arg0, arg1) | (arg1 & 0x40000) != 0 || Static107.method1597(arg0, arg1);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZIILclient!qn;)Lclient!mb;")
	public static Class166 method3992(@OriginalArg(1) int arg0, @OriginalArg(3) Class211 arg1) {
		@Pc(14) byte[] local14 = arg1.method4377(arg0, 0);
		return local14 == null ? null : new Class166(local14);
	}
}
