import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "[[[Lclient!vda;")
	public static Class368[][][] aClass368ArrayArrayArray1;

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
	public static int anInt3524;

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "Lclient!uq;")
	public static Class362 aClass362_41;

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
	public static int anInt3525 = 503;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIB)V")
	public static void method3009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class3_Sub5_Sub20 local13 = Static447.method6065((long) arg1, 12);
		local13.method8832();
		local13.anInt10754 = arg0;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method3010(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
