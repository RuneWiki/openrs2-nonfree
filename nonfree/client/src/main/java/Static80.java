import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!fh", name = "l", descriptor = "[I")
	public static int[] anIntArray164;

	@OriginalMember(owner = "client!fh", name = "o", descriptor = "I")
	public static int anInt1911;

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "Lclient!l;")
	public static Class101 aClass101_4 = new Class101(512);

	@OriginalMember(owner = "client!fh", name = "i", descriptor = "Lclient!sf;")
	public static Class157 aClass157_13 = new Class157(64);

	@OriginalMember(owner = "client!fh", name = "j", descriptor = "J")
	public static long aLong69 = 0L;

	@OriginalMember(owner = "client!fh", name = "m", descriptor = "Lclient!sf;")
	public static Class157 aClass157_14 = new Class157(4);

	@OriginalMember(owner = "client!fh", name = "n", descriptor = "I")
	public static int anInt1910 = 0;

	@OriginalMember(owner = "client!fh", name = "p", descriptor = "[I")
	public static int[] anIntArray165 = new int[8];

	@OriginalMember(owner = "client!fh", name = "q", descriptor = "Z")
	public static boolean aBoolean122 = false;

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)Lclient!gb;")
	public static Class58_Sub1 method1471() {
		Static140.anInt3093 = 0;
		return Static276.method4327();
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIZB)Ljava/lang/String;")
	public static String method1472(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(36) int local36 = 2;
		for (@Pc(40) int local40 = arg0 / 10; local40 != 0; local40 /= 10) {
			local36++;
		}
		@Pc(55) char[] local55 = new char[local36];
		local55[0] = '+';
		for (@Pc(69) int local69 = local36 - 1; local69 > 0; local69--) {
			@Pc(74) int local74 = arg0;
			arg0 /= 10;
			@Pc(85) int local85 = local74 - arg0 * 10;
			if (local85 >= 10) {
				local55[local69] = (char) (local85 + 87);
			} else {
				local55[local69] = (char) (local85 + 48);
			}
		}
		return new String(local55);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)[B")
	public static byte[] method1473(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub8_Sub12 local8 = (Class2_Sub8_Sub12) Static243.aClass106_8.method2986((long) arg0);
		if (local8 == null) {
			@Pc(23) byte[] local23 = new byte[512];
			@Pc(29) Random local29 = new Random((long) arg0);
			@Pc(31) int local31;
			for (local31 = 0; local31 < 255; local31++) {
				local23[local31] = (byte) local31;
			}
			for (local31 = 0; local31 < 255; local31++) {
				@Pc(53) int local53 = 255 - local31;
				@Pc(58) int local58 = Static222.method3672(local29, local53);
				@Pc(62) byte local62 = local23[local58];
				local23[local58] = local23[local53];
				local23[local53] = local23[511 - local31] = local62;
			}
			local8 = new Class2_Sub8_Sub12(local23);
			Static243.aClass106_8.method2990((long) arg0, local8);
		}
		return local8.aByteArray37;
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V")
	public static void method1474() {
		Static120.aClass157_24.method4033();
		Static159.aClass157_30.method4033();
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg0 < 128 || arg6 < 128 || arg0 > 13056 || arg6 > 13056) {
			Static82.anInt1927 = -1;
			Static213.anInt4350 = -1;
			return;
		}
		@Pc(34) int local34 = Static234.method3798(arg6, arg0, Static32.anInt876) - arg1;
		@Pc(38) int local38 = arg6 - Static192.anInt4017;
		@Pc(42) int local42 = Class1.anIntArray3[Static151.anInt3328];
		@Pc(46) int local46 = Class1.anIntArray3[Static295.anInt5738];
		@Pc(50) int local50 = local34 - Static162.anInt3612;
		@Pc(54) int local54 = Class1.anIntArray4[Static151.anInt3328];
		@Pc(58) int local58 = Class1.anIntArray4[Static295.anInt5738];
		@Pc(62) int local62 = arg0 - anInt1911;
		@Pc(77) int local77 = local54 * local38 + local62 * local42 >> 16;
		@Pc(88) int local88 = local38 * local42 - local54 * local62 >> 16;
		@Pc(90) int local90 = local77;
		@Pc(101) int local101 = local50 * local46 - local88 * local58 >> 16;
		@Pc(105) int local105 = local90 + arg5;
		@Pc(115) int local115 = local50 * local58 + local46 * local88 >> 16;
		if (local115 < 50) {
			Static82.anInt1927 = -1;
			Static213.anInt4350 = -1;
		} else if (Static116.aBoolean184) {
			@Pc(136) int local136 = arg2 * 512 >> 8;
			Static213.anInt4350 = arg3 + local136 * local105 / local115;
			@Pc(150) int local150 = arg7 * 512 >> 8;
			Static82.anInt1927 = local150 * local101 / local115 + arg4;
		} else {
			Static82.anInt1927 = arg4 + (local101 << 9) / local115;
			Static213.anInt4350 = (local105 << 9) / local115 + arg3;
		}
	}
}
