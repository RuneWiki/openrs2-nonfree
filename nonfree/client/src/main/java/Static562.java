import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static562 {

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "[I")
	public static final int[] anIntArray508 = new int[1024];

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
	public static final int anInt9684 = 1338;

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
	public static int anInt9689 = -1;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BIIILjava/lang/String;III)V")
	public static void method7923(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class9_Sub7 local7 = new Class9_Sub7();
		local7.anInt6818 = Static384.anInt7234 + arg2;
		local7.anInt6814 = arg6;
		local7.anInt6821 = arg1;
		local7.aString71 = arg3;
		local7.anInt6815 = arg0;
		local7.anInt6819 = arg5;
		local7.anInt6820 = arg4;
		Static482.aClass234_12.method6097(local7);
	}
}
