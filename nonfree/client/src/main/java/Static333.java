import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!qs", name = "i", descriptor = "[[B")
	public static byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "Lclient!mt;")
	public static final Class164 aClass164_22 = new Class164(16);

	@OriginalMember(owner = "client!qs", name = "g", descriptor = "Z")
	public static boolean aBoolean201 = false;

	@OriginalMember(owner = "client!qs", name = "j", descriptor = "I")
	public static int anInt3375 = 104;

	@OriginalMember(owner = "client!qs", name = "n", descriptor = "I")
	public static final int anInt3376 = 50;

	@OriginalMember(owner = "client!qs", name = "k", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray28 = new String[anInt3376];

	@OriginalMember(owner = "client!qs", name = "l", descriptor = "[I")
	public static final int[] anIntArray306 = new int[anInt3376];

	@OriginalMember(owner = "client!qs", name = "m", descriptor = "[I")
	public static final int[] anIntArray307 = new int[anInt3376];

	@OriginalMember(owner = "client!qs", name = "o", descriptor = "[I")
	public static final int[] anIntArray308 = new int[anInt3376];

	@OriginalMember(owner = "client!qs", name = "p", descriptor = "[I")
	public static final int[] anIntArray309 = new int[anInt3376];

	@OriginalMember(owner = "client!qs", name = "q", descriptor = "[I")
	public static final int[] anIntArray310 = new int[anInt3376];

	@OriginalMember(owner = "client!qs", name = "r", descriptor = "[I")
	public static final int[] anIntArray311 = new int[anInt3376];

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(II)Lclient!fe;")
	public static Class19_Sub1 method2746(@OriginalArg(0) int arg0) {
		return Static419.aBoolean436 && Static147.anInt2783 <= arg0 && arg0 <= Static417.anInt6629 ? Static335.aClass19_Sub1Array2[arg0 - Static147.anInt2783] : null;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILclient!vi;)V")
	public static void method2747(@OriginalArg(1) Class26_Sub2_Sub4_Sub2 arg0) {
		@Pc(19) Class7_Sub13 local19 = (Class7_Sub13) Static338.aClass164_31.method3512((long) arg0.anInt7080);
		if (local19 == null) {
			Static130.method2096(0, null, null, arg0, arg0.aByte102, arg0.anIntArray603[0], arg0.anIntArray604[0]);
		} else {
			local19.method1199();
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIII)I")
	public static int method2748(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static244.aClass165Array8 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg2 >> 7;
		@Pc(15) int local15 = arg1 >> 7;
		if (local11 < 0 || local15 < 0 || local11 > anInt3375 - 1 || Static102.anInt2086 - 1 < local15) {
			return 0;
		}
		@Pc(44) int local44 = arg0;
		if (arg0 < 3 && (Static347.aByteArrayArrayArray16[1][local11][local15] & 0x2) != 0) {
			local44 = arg0 + 1;
		}
		return Static244.aClass165Array8[local44].a(arg2, arg1);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZILjava/lang/Object;)[B")
	public static byte[] method2749(@OriginalArg(0) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static66.method968(local13) : local13;
		} else if (arg1 instanceof Class47) {
			@Pc(27) Class47 local27 = (Class47) arg1;
			return local27.method851();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIIII)V")
	public static void method2750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg3 + 1;
		Static404.method5769(Static353.anIntArrayArray48[arg3], arg4, arg0, arg2);
		@Pc(17) int local17 = arg1 - 1;
		Static404.method5769(Static353.anIntArrayArray48[arg1], arg4, arg0, arg2);
		for (@Pc(25) int local25 = local8; local25 <= local17; local25++) {
			@Pc(31) int[] local31 = Static353.anIntArrayArray48[local25];
			local31[arg4] = local31[arg0] = arg2;
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IBII)V")
	public static void method2751(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 0) {
			Static81.method1414(Static182.aClass2_56);
		}
		if (arg0 == 1) {
			Static81.method1414(Static459.aClass2_103);
		}
		Static255.aClass7_Sub14_Sub1_2.method3969(Static310.aClass130_1.method5069(82) ? 1 : 0);
		Static255.aClass7_Sub14_Sub1_2.method3993(Static359.anInt5713 + arg1);
		Static255.aClass7_Sub14_Sub1_2.method3955(Static314.anInt5181 + arg2);
		Static404.aBoolean507 = false;
		Static153.anInt5631 = arg1;
		Static89.anInt1837 = arg2;
		Static87.method1508();
	}
}
