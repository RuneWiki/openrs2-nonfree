import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!vf", name = "cb", descriptor = "[[I")
	public static int[][] anIntArrayArray131;

	@OriginalMember(owner = "client!vf", name = "bb", descriptor = "[I")
	public static int[] anIntArray419 = new int[4000];

	@OriginalMember(owner = "client!vf", name = "fb", descriptor = "Z")
	public static volatile boolean aBoolean206 = true;

	@OriginalMember(owner = "client!vf", name = "ob", descriptor = "Lclient!ea;")
	private static Class18 aClass18_1193 = Static8.method128("New User");

	@OriginalMember(owner = "client!vf", name = "gb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1191 = aClass18_1193;

	@OriginalMember(owner = "client!vf", name = "ib", descriptor = "I")
	public static int anInt4600 = 0;

	@OriginalMember(owner = "client!vf", name = "jb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1192 = Static8.method128("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!vf", name = "nb", descriptor = "I")
	public static int anInt4604 = 0;

	@OriginalMember(owner = "client!vf", name = "qb", descriptor = "[Z")
	public static boolean[] aBooleanArray15 = new boolean[100];

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II[Lclient!fh;[BIIIIIB)V")
	public static void method3111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class22[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
				if (arg4 + local7 > 0 && local7 + arg4 < 103 && local11 + arg5 > 0 && local11 + arg5 < 103) {
					arg2[arg8].anIntArrayArray45[local7 + arg4][local11 + arg5] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(85) Class1_Sub6 local85 = new Class1_Sub6(arg3);
		for (@Pc(87) int local87 = 0; local87 < 4; local87++) {
			for (@Pc(91) int local91 = 0; local91 < 64; local91++) {
				for (@Pc(95) int local95 = 0; local95 < 64; local95++) {
					if (local87 == arg6 && local91 >= arg0 && local91 < arg0 + 8 && local95 >= arg1 && arg1 + 8 > local95) {
						Static175.method3157(0, 0, arg7, arg4 + Static83.method3201(local91 & 0x7, arg7, local95 & 0x7), arg8, local85, Static146.method2768(arg7, local91 & 0x7, local95 & 0x7) + arg5);
					} else {
						Static175.method3157(0, 0, 0, -1, 0, local85, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "(I)V")
	public static void method3112() {
		aClass18_1192 = null;
		aBooleanArray15 = null;
		aClass18_1191 = null;
		anIntArray419 = null;
		anIntArrayArray131 = null;
		aClass18_1193 = null;
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(II)Lclient!bb;")
	public static Class1_Sub1_Sub4 method3113(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub4 local10 = (Class1_Sub1_Sub4) Static23.aClass66_3.method2599((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static82.aClass16_9.method2254(arg0, 3);
		local10 = new Class1_Sub1_Sub4();
		if (local25 != null) {
			local10.method197(new Class1_Sub6(local25));
		}
		Static23.aClass66_3.method2597((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(III)I")
	public static int method3114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class1_Sub14 local15 = (Class1_Sub14) Static17.aClass14_8.method569((long) arg1);
		if (local15 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local15.anIntArray248.length) {
			return local15.anIntArray248[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILclient!dd;Lclient!dd;Lclient!dd;Lclient!dd;)V")
	public static void method3115(@OriginalArg(1) Class16 arg0, @OriginalArg(2) Class16 arg1, @OriginalArg(3) Class16 arg2, @OriginalArg(4) Class16 arg3) {
		Static130.aClass16_22 = arg2;
		Static154.aClass16_30 = arg0;
		Static59.aClass16_3 = arg3;
		Static162.aClass16_34 = arg1;
		Static148.aClass20ArrayArray1 = new Class20[Static130.aClass16_22.method2231()][];
		Static110.aBooleanArray11 = new boolean[Static130.aClass16_22.method2231()];
	}
}
