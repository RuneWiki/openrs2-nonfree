import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
	public static int anInt5198;

	@OriginalMember(owner = "client!ob", name = "x", descriptor = "I")
	public static int anInt5206;

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
	public static int anInt5200 = 50;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "[I")
	public static int[] anIntArray562 = new int[anInt5200];

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
	public static int anInt5196 = -1;

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "[I")
	public static int[] anIntArray563 = new int[anInt5200];

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "[I")
	public static int[] anIntArray564 = new int[anInt5200];

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "Lclient!dj;")
	public static Class40 aClass40_14 = new Class40(64);

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "[I")
	public static int[] anIntArray565 = new int[anInt5200];

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "[I")
	public static int[] anIntArray566 = new int[anInt5200];

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "[I")
	public static int[] anIntArray567 = new int[anInt5200];

	@OriginalMember(owner = "client!ob", name = "o", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray34 = new String[anInt5200];

	@OriginalMember(owner = "client!ob", name = "u", descriptor = "[I")
	public static int[] anIntArray569 = new int[anInt5200];

	@OriginalMember(owner = "client!ob", name = "v", descriptor = "D")
	public static double aDouble11 = -1.0D;

	@OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
	public static int anInt5205 = 0;

	@OriginalMember(owner = "client!ob", name = "y", descriptor = "I")
	public static int anInt5207 = 0;

	@OriginalMember(owner = "client!ob", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString321 = "Use";

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!ic;Lclient!oh;B)Lclient!ih;")
	public static Class4_Sub12 method4274(@OriginalArg(0) Class85 arg0, @OriginalArg(1) Class129 arg1) {
		@Pc(27) long local27 = ((long) arg1.anInt3868 << 56) + ((long) arg1.anInt3874 << 32) + (long) (arg1.anInt3876 + (arg1.anInt3877 + 1 << 16));
		@Pc(39) Class4_Sub12 local39 = (Class4_Sub12) arg0.method1845(local27);
		if (local39 == null) {
			local39 = new Class4_Sub12(arg1.anInt3877, (float) arg1.anInt3876, true, false, arg1.anInt3874);
			arg0.method1841(local39, local27);
		}
		return local39;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
	public static void method4276() {
		anInt5207 = 0;
		Static105.aBoolean147 = false;
		Static102.anInt2140 = 0;
		Static153.anInt3020 = -1;
		Static239.anInt4507 = 0;
		Static41.aByte1 = 0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IBIIII)V")
	public static void method4278(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static218.anInt4231 < arg2 || Static156.anInt3086 > arg1) {
			return;
		}
		@Pc(23) boolean local23;
		if (Static48.anInt902 > arg4) {
			arg4 = Static48.anInt902;
			local23 = false;
		} else if (arg4 > Static131.anInt2553) {
			arg4 = Static131.anInt2553;
			local23 = false;
		} else {
			local23 = true;
		}
		@Pc(51) boolean local51;
		if (arg0 < Static48.anInt902) {
			arg0 = Static48.anInt902;
			local51 = false;
		} else if (Static131.anInt2553 < arg0) {
			arg0 = Static131.anInt2553;
			local51 = false;
		} else {
			local51 = true;
		}
		if (Static156.anInt3086 <= arg2) {
			Static99.method1656(Static220.anIntArrayArray36[arg2++], arg3, arg4, arg0);
		} else {
			arg2 = Static156.anInt3086;
		}
		if (Static218.anInt4231 < arg1) {
			arg1 = Static218.anInt4231;
		} else {
			Static99.method1656(Static220.anIntArrayArray36[arg1--], arg3, arg4, arg0);
		}
		@Pc(106) int local106;
		if (local23 && local51) {
			for (local106 = arg2; local106 <= arg1; local106++) {
				@Pc(113) int[] local113 = Static220.anIntArrayArray36[local106];
				local113[arg4] = local113[arg0] = arg3;
			}
		} else if (local23) {
			for (local106 = arg2; local106 <= arg1; local106++) {
				Static220.anIntArrayArray36[local106][arg4] = arg3;
			}
		} else if (local51) {
			for (local106 = arg2; local106 <= arg1; local106++) {
				Static220.anIntArrayArray36[local106][arg0] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)V")
	public static void method4280(@OriginalArg(1) int arg0) {
		if (Static79.method1364(arg0)) {
			Static218.method3532(Static188.aClass189ArrayArray115[arg0], -1);
		}
	}
}
