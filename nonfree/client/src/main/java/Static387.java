import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
	public static int anInt6848;

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_98 = new Class252(10, -1);

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "[I")
	public static final int[] anIntArray662 = new int[14];

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIILjava/lang/String;II)V")
	public static void method6182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class46_Sub5 local7 = new Class46_Sub5();
		local7.anInt5226 = arg0;
		local7.anInt5225 = arg2;
		local7.anInt5224 = arg4;
		local7.aString117 = arg5;
		local7.anInt5227 = arg1;
		local7.anInt5230 = Static445.anInt7791 + arg6;
		local7.anInt5229 = arg3;
		Static16.aClass184_50.method5142(local7);
	}
}
