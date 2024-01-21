import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
	public static int anInt2513;

	@OriginalMember(owner = "client!kh", name = "k", descriptor = "Lclient!cg;")
	public static Class1_Sub2_Sub5_Sub1 aClass1_Sub2_Sub5_Sub1_1;

	@OriginalMember(owner = "client!kh", name = "n", descriptor = "[Z")
	public static boolean[] aBooleanArray13;

	@OriginalMember(owner = "client!kh", name = "y", descriptor = "I")
	public static int anInt2522;

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1492 = Static118.method2249("red:");

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
	public static int anInt2510 = 0;

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
	public static int anInt2511 = -1;

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1493 = aClass65_1492;

	@OriginalMember(owner = "client!kh", name = "l", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1494 = aClass65_1492;

	@OriginalMember(owner = "client!kh", name = "p", descriptor = "I")
	public static int anInt2517 = -1;

	@OriginalMember(owner = "client!kh", name = "r", descriptor = "[J")
	public static final long[] aLongArray5 = new long[32];

	@OriginalMember(owner = "client!kh", name = "t", descriptor = "I")
	public static int anInt2519 = 0;

	@OriginalMember(owner = "client!kh", name = "x", descriptor = "[I")
	public static final int[] anIntArray286 = new int[1000];

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(BZ)V")
	public static void method1895(@OriginalArg(1) boolean arg0) {
		if (Static202.aClass23_3 == null) {
			return;
		}
		try {
			@Pc(16) Class1_Sub14 local16 = new Class1_Sub14(4);
			local16.method1710(arg0 ? 2 : 3);
			local16.method1746(0);
			Static202.aClass23_3.method726(4, local16.aByteArray29);
		} catch (@Pc(37) IOException local37) {
			try {
				Static202.aClass23_3.method731();
			} catch (@Pc(42) Exception local42) {
			}
			Static202.aClass23_3 = null;
			Static188.anInt4139++;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIII)I")
	public static int method1896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < arg2) {
			return arg2;
		} else if (arg1 <= arg0) {
			return arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIZ)Lclient!oc;")
	public static Class65 method1901(@OriginalArg(0) int arg0, @OriginalArg(3) boolean arg1) {
		@Pc(24) int local24 = 1;
		for (@Pc(28) int local28 = arg0 / 10; local28 != 0; local28 /= 10) {
			local24++;
		}
		@Pc(41) int local41 = local24;
		if (arg0 < 0 || arg1) {
			local41 = local24 + 1;
		}
		@Pc(52) byte[] local52 = new byte[local41];
		if (arg0 < 0) {
			local52[0] = 45;
		} else if (arg1) {
			local52[0] = 43;
		}
		for (@Pc(70) int local70 = 0; local70 < local24; local70++) {
			@Pc(75) int local75 = arg0 % 10;
			if (local75 < 0) {
				local75 = -local75;
			}
			if (local75 > 9) {
				local75 += 39;
			}
			local52[local41 - local70 - 1] = (byte) (local75 + 48);
			arg0 /= 10;
		}
		@Pc(112) Class65 local112 = new Class65();
		local112.aByteArray37 = local52;
		local112.anInt3190 = local41;
		return local112;
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(IIII)Z")
	public static boolean method1902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = arg2 * Static36.anInt1022 + arg0 * Static14.anInt388 >> 16;
		@Pc(19) int local19 = arg2 * Static14.anInt388 - arg0 * Static36.anInt1022 >> 16;
		@Pc(29) int local29 = arg1 * Static201.anInt3974 + local19 * Static123.anInt3073 >> 16;
		@Pc(39) int local39 = arg1 * Static123.anInt3073 - local19 * Static201.anInt3974 >> 16;
		if (local29 >= 50 && local29 <= 3500) {
			@Pc(55) int local55 = Static125.anInt3097 + (local9 << 9) / local29;
			@Pc(63) int local63 = Static107.anInt2623 + (local39 << 9) / local29;
			return local55 >= Static83.anInt2032 && local55 <= Static4.anInt87 && local63 >= Static78.anInt1921 && local63 <= Static102.anInt2552;
		} else {
			return false;
		}
	}
}
