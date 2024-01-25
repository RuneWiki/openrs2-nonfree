import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!lh", name = "A", descriptor = "Lclient!pq;")
	public static Class229 aClass229_9;

	@OriginalMember(owner = "client!lh", name = "u", descriptor = "I")
	public static final int anInt5247 = 1403;

	@OriginalMember(owner = "client!lh", name = "z", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_261 = new Class305(45, -1);

	@OriginalMember(owner = "client!lh", name = "F", descriptor = "Z")
	public static boolean aBoolean392 = false;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILclient!dn;II)Lclient!ei;")
	public static Class81 method4851(@OriginalArg(0) int arg0, @OriginalArg(1) Class69 arg1) {
		@Pc(14) byte[] local14 = arg1.method1888(0, arg0);
		return local14 == null ? null : new Class81(local14);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(III)V")
	public static void method4852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static216.method3997(Static389.aClass252_100);
		Static259.aClass1_Sub17_Sub2_1.method4488(arg1);
		Static259.aClass1_Sub17_Sub2_1.method4473(arg0);
	}
}
