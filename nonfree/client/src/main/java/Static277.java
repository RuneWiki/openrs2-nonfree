import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "[Lclient!mq;")
	public static Class71[] aClass71Array48;

	@OriginalMember(owner = "client!jda", name = "e", descriptor = "[I")
	public static int[] anIntArray597;

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Z)[Lclient!fe;")
	public static Class103[] method9737() {
		return new Class103[] { Static429.aClass103_8, Static27.aClass103_1, Static342.aClass103_5 };
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
	public static void method9738(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		Static353.anInt6795 = -1;
		Static605.anInt10580 = 1;
		Static205.method3904(false, arg1, arg0);
	}

	@OriginalMember(owner = "client!jda", name = "e", descriptor = "(B)V")
	public static void method9739() {
		@Pc(12) Class2_Sub1_Sub5 local12 = Static653.method9595(15, 0L);
		local12.method2489();
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(ILclient!fm;)V")
	public static void method9742(@OriginalArg(1) Class15_Sub3_Sub3_Sub1 arg0) {
		@Pc(14) int local14 = arg0.anInt4008 - Static62.anInt1184;
		@Pc(25) int local25 = arg0.anInt3994 * 512 + arg0.method3690() * 256;
		@Pc(36) int local36 = arg0.anInt3989 * 512 + arg0.method3690() * 256;
		arg0.anInt11022 += (local25 - arg0.anInt11022) / local14;
		arg0.anInt4040 = 0;
		arg0.anInt11024 += (local36 - arg0.anInt11024) / local14;
		if (arg0.anInt3970 == 0) {
			arg0.method3681(8192);
		}
		if (arg0.anInt3970 == 1) {
			arg0.method3681(12288);
		}
		if (arg0.anInt3970 == 2) {
			arg0.method3681(0);
		}
		if (arg0.anInt3970 == 3) {
			arg0.method3681(4096);
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(III)V")
	public static void method9743(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static182.method3547(arg1, arg0);
	}
}
