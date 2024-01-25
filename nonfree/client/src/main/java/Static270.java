import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!jda", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString45;

	@OriginalMember(owner = "client!jda", name = "e", descriptor = "I")
	public static int anInt4747 = 0;

	@OriginalMember(owner = "client!jda", name = "k", descriptor = "[I")
	public static final int[] anIntArray427 = new int[4];

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lclient!ha;ILclient!oja;IILclient!rs;ZLclient!dm;I)V")
	public static void method4397(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class256 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class308 arg5, @OriginalArg(7) Class3_Sub18 arg6, @OriginalArg(8) int arg7) {
		@Pc(14) int local14 = arg4 - arg7 / 2 - 5;
		@Pc(23) int local23 = arg1 + 2;
		if (arg5.anInt8807 != 0) {
			arg0.method8452(arg7 + 10, local23, arg1 + arg3 * arg2.method6196() + 1 - local23, local14, arg5.anInt8807);
		}
		if (arg5.anInt8803 != 0) {
			arg0.method8460(local23, arg1 + arg2.method6196() * arg3 + 1 - local23, arg5.anInt8803, local14, arg7 + 10);
		}
		@Pc(78) int local78 = arg5.anInt8802;
		if (arg6.aBoolean187 && arg5.anInt8800 != -1) {
			local78 = arg5.anInt8800;
		}
		for (@Pc(91) int local91 = 0; local91 < arg3; local91++) {
			@Pc(97) String local97 = Static158.aStringArray3[local91];
			if (arg3 - 1 > local91) {
				local97 = local97.substring(0, local97.length() - 4);
			}
			arg2.method6199(arg0, local97, arg4, arg1, local78);
			arg1 += arg2.method6196();
		}
	}
}
