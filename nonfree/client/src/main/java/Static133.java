import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!we", name = "e", descriptor = "Lclient!pa;")
	public static Class35_Sub1 aClass35_Sub1_29;

	@OriginalMember(owner = "client!we", name = "i", descriptor = "Z")
	public static boolean aBoolean186;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray7 = new int[4][13][13];

	@OriginalMember(owner = "client!we", name = "f", descriptor = "Lclient!id;")
	public static Class34 aClass34_1594 = Static9.method266("http:)4)4www)3runescape)3com");

	@OriginalMember(owner = "client!we", name = "o", descriptor = "Lclient!id;")
	private static Class34 aClass34_1599 = Static9.method266("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!we", name = "g", descriptor = "Lclient!id;")
	public static Class34 aClass34_1595 = aClass34_1599;

	@OriginalMember(owner = "client!we", name = "h", descriptor = "Lclient!id;")
	public static Class34 aClass34_1596 = Static9.method266("title_mute");

	@OriginalMember(owner = "client!we", name = "j", descriptor = "I")
	public static int anInt3171 = 2;

	@OriginalMember(owner = "client!we", name = "l", descriptor = "I")
	public static final int anInt3173 = 2301979;

	@OriginalMember(owner = "client!we", name = "m", descriptor = "Lclient!id;")
	public static Class34 aClass34_1597 = Static9.method266("<col=ff3000>");

	@OriginalMember(owner = "client!we", name = "n", descriptor = "Lclient!id;")
	public static Class34 aClass34_1598 = Static9.method266("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!vb;IIIII)V")
	public static void method2107(@OriginalArg(0) Class1_Sub1_Sub16 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class1_Sub23 local7 = new Class1_Sub23();
		local7.anInt2873 = arg2 * 128;
		local7.anInt2883 = arg0.anInt2950;
		@Pc(19) int local19 = arg0.anInt2946;
		local7.anInt2881 = arg0.anInt2977;
		local7.anInt2876 = arg3;
		@Pc(29) int local29 = arg0.anInt2962;
		if (arg1 == 1 || arg1 == 3) {
			local19 = arg0.anInt2962;
			local29 = arg0.anInt2946;
		}
		local7.anInt2872 = (local29 + arg4) * 128;
		local7.anInt2869 = (arg2 + local19) * 128;
		local7.anInt2875 = arg0.anInt2965;
		local7.anIntArray356 = arg0.anIntArray365;
		local7.anInt2874 = arg4 * 128;
		local7.anInt2882 = arg0.anInt2955 * 128;
		if (arg0.anIntArray366 != null) {
			local7.aClass1_Sub1_Sub16_1 = arg0;
			local7.method1918();
		}
		Static127.aClass38_16.method1046(local7);
		if (local7.anIntArray356 != null) {
			local7.anInt2879 = (int) ((double) (local7.anInt2875 - local7.anInt2881) * Math.random()) + local7.anInt2881;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
	public static void method2108() {
		aClass34_1596 = null;
		aClass34_1598 = null;
		anIntArrayArrayArray7 = null;
		aClass34_1594 = null;
		aClass34_1595 = null;
		aClass34_1599 = null;
		aClass34_1597 = null;
		aClass35_Sub1_29 = null;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(III)Lclient!fd;")
	public static Class1_Sub9 method2109(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class1_Sub9 local7 = Static113.method1814(arg1);
		if (arg0 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass1_Sub9Array2 == null || arg0 >= local7.aClass1_Sub9Array2.length) {
			return null;
		} else {
			return local7.aClass1_Sub9Array2[arg0];
		}
	}
}
