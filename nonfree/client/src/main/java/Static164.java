import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "[[B")
	public static byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "Lclient!ge;")
	public static final Class83 aClass83_24 = new Class83(5);

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
	public static int anInt3259 = 0;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIILclient!pl;Lclient!pl;)V")
	public static void method2905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub3 arg3, @OriginalArg(4) Class11_Sub3 arg4) {
		@Pc(4) Class162 local4 = Static408.method5689(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass11_Sub3_1 = arg3;
			local4.aClass11_Sub3_2 = arg4;
		}
	}
}
