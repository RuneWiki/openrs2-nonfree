import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!we", name = "k", descriptor = "[I")
	public static int[] anIntArray381 = new int[2];

	@OriginalMember(owner = "client!we", name = "u", descriptor = "Lclient!vb;")
	public static Class120 aClass120_22 = new Class120();

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(I)[Lclient!tg;")
	public static Class1_Sub2_Sub2[] method3725() {
		@Pc(8) Class1_Sub2_Sub2[] local8 = new Class1_Sub2_Sub2[Static40.anInt855];
		for (@Pc(10) int local10 = 0; local10 < Static40.anInt855; local10++) {
			@Pc(20) int local20 = Static172.anIntArray329[local10] * Static141.anIntArray266[local10];
			@Pc(23) int[] local23 = new int[local20];
			@Pc(27) byte[] local27 = Static158.aByteArrayArray7[local10];
			for (@Pc(29) int local29 = 0; local29 < local20; local29++) {
				local23[local29] = Static169.anIntArray324[local27[local29] & 0xFF];
			}
			local8[local10] = new Class1_Sub2_Sub2_Sub1(Static155.anInt432, Static182.anInt4094, Static56.anIntArray124[local10], Static223.anIntArray373[local10], Static141.anIntArray266[local10], Static172.anIntArray329[local10], local23);
		}
		Static158.method2564();
		return local8;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II)Lclient!ii;")
	public static Class58 method3726(@OriginalArg(1) int arg0) {
		@Pc(6) Class58 local6 = (Class58) Static165.aClass61_43.method1693((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static72.aClass28_30.method819(arg0, 3);
		local6 = new Class58();
		if (local20 != null) {
			local6.method1580(new Class1_Sub26(local20));
		}
		Static165.aClass61_43.method1694((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IZ)V")
	public static void method3727() {
		Static97.aBoolean190 = false;
		Static114.anInt2517 = -1;
		Static116.anInt2569 = 1;
		Static16.aClass28_7 = null;
		Static105.anInt2303 = 0;
		Static37.anInt766 = 2;
		Static125.anInt2704 = -1;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
	public static void method3728() {
		if (Static132.aBooleanArray19[98]) {
			Static140.anInt679 += (12 - Static140.anInt679) / 2;
		} else if (Static132.aBooleanArray19[99]) {
			Static140.anInt679 += (-Static140.anInt679 - 12) / 2;
		} else {
			Static140.anInt679 /= 2;
		}
		Static88.anInt1924 += Static140.anInt679 / 2;
		if (Static132.aBooleanArray19[96]) {
			Static223.anInt4870 += (-Static223.anInt4870 - 24) / 2;
		} else if (Static132.aBooleanArray19[97]) {
			Static223.anInt4870 += (24 - Static223.anInt4870) / 2;
		} else {
			Static223.anInt4870 /= 2;
		}
		Static79.anInt1741 += Static223.anInt4870 / 2;
		@Pc(91) int local91 = Static204.aClass5_Sub5_Sub1_2.anInt3044 + Static162.anInt3539;
		@Pc(96) int local96 = Static152.anInt3367 + Static204.aClass5_Sub5_Sub1_2.anInt3021;
		if (Static21.anInt411 - local96 < -500 || Static21.anInt411 - local96 > 500 || Static77.anInt1730 - local91 < -500 || Static77.anInt1730 - local91 > 500) {
			Static21.anInt411 = local96;
			Static77.anInt1730 = local91;
		}
		if (local96 != Static21.anInt411) {
			Static21.anInt411 += (local96 - Static21.anInt411) / 16;
		}
		if (Static77.anInt1730 != local91) {
			Static77.anInt1730 += (local91 - Static77.anInt1730) / 16;
		}
		Static70.method1250();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IZIIII)V")
	public static void method3729(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(16) int local16 = Static123.method2091(Static47.anInt1057, Static223.anInt4869, arg3);
		@Pc(22) int local22 = Static123.method2091(Static47.anInt1057, Static223.anInt4869, arg1);
		@Pc(28) int local28 = Static123.method2091(Static38.anInt784, Static99.anInt915, arg0);
		@Pc(34) int local34 = Static123.method2091(Static38.anInt784, Static99.anInt915, arg4);
		for (@Pc(36) int local36 = local16; local36 <= local22; local36++) {
			Static162.method2605(Static231.anIntArrayArray44[local36], local28, arg2, local34);
		}
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V")
	public static void method3730() {
		Static97.anInt2101 = 0;
		@Pc(8) int local8 = Static152.anInt3377 + (Static204.aClass5_Sub5_Sub1_2.anInt3044 >> 7);
		@Pc(19) int local19 = Static36.anInt764 + (Static204.aClass5_Sub5_Sub1_2.anInt3021 >> 7);
		if (local19 >= 3053 && local19 <= 3156 && local8 >= 3056 && local8 <= 3136) {
			Static97.anInt2101 = 1;
		}
		if (local19 >= 3072 && local19 <= 3118 && local8 >= 9492 && local8 <= 9535) {
			Static97.anInt2101 = 1;
		}
		if (Static97.anInt2101 == 1 && local19 >= 3139 && local19 <= 3199 && local8 >= 3008 && local8 <= 3062) {
			Static97.anInt2101 = 0;
		}
	}
}
