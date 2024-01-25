import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!ts", name = "d", descriptor = "[I")
	public static int[] anIntArray626;

	@OriginalMember(owner = "client!ts", name = "h", descriptor = "Lclient!xa;")
	public static Class71 aClass71_53;

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "[B")
	public static final byte[] aByteArray104 = new byte[2048];

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(JJ)J")
	public static long method6973(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIIIIILjava/lang/String;)V")
	public static void method6975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6) {
		@Pc(12) Class60_Sub2 local12 = new Class60_Sub2();
		local12.anInt3127 = arg5;
		local12.anInt3136 = arg4;
		local12.anInt3126 = arg2;
		local12.aString32 = arg6;
		local12.anInt3131 = arg0;
		local12.anInt3135 = arg3 + Static363.anInt6671;
		local12.anInt3129 = arg1;
		Static500.aClass349_15.method7893(local12);
	}
}
