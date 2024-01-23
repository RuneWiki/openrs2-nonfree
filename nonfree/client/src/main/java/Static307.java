import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!wl", name = "B", descriptor = "[[B")
	public static byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!wl", name = "y", descriptor = "I")
	public static int anInt5856 = 0;

	@OriginalMember(owner = "client!wl", name = "C", descriptor = "Lclient!nb;")
	public static Class111 aClass111_17 = new Class111(16);

	@OriginalMember(owner = "client!wl", name = "J", descriptor = "[I")
	public static int[] anIntArray488 = new int[2];

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIBI)V")
	public static void method4703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= Static173.anInt3481 && arg1 <= Static121.anInt2460) {
			@Pc(23) int local23 = Static101.method1680(Static100.anInt1982, Static293.anInt5688, arg0);
			@Pc(29) int local29 = Static101.method1680(Static100.anInt1982, Static293.anInt5688, arg2);
			Static183.method2966(local29, arg3, arg1, local23);
		}
	}

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "(II)I")
	public static int method4704(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIZBIIFI)[I")
	public static int[] method4706(@OriginalArg(6) float arg0) {
		@Pc(7) Class4_Sub1_Sub9 local7 = new Class4_Sub1_Sub9();
		local7.anInt1663 = 8;
		@Pc(13) int[] local13 = new int[2048];
		local7.anInt1667 = 4;
		local7.anInt1657 = 8;
		local7.anInt1659 = (int) (arg0 * 4096.0F);
		local7.aBoolean98 = true;
		local7.anInt1655 = 35;
		local7.method4537();
		Static28.method588(2048, 1);
		local7.method1360(local13, 0);
		return local13;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(III)J")
	public static long method4707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub21 local7 = Static261.aClass4_Sub21ArrayArrayArray4[arg0][arg1][arg2];
		return local7 == null || local7.aClass35_1 == null ? 0L : local7.aClass35_1.aLong48;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ljava/lang/String;ZC)[Ljava/lang/String;")
	public static String[] method4708(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(10) int local10 = Static141.method2269(arg1, arg0);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < local10; local27++) {
			@Pc(32) int local32;
			for (local32 = local25; arg1 != arg0.charAt(local32); local32++) {
			}
			local15[local23++] = arg0.substring(local25, local32);
			local25 = local32 + 1;
		}
		local15[local10] = arg0.substring(local25);
		return local15;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZI)V")
	public static void method4710(@OriginalArg(0) boolean arg0) {
		@Pc(15) byte[][] local15;
		if (Static251.aBoolean330 && arg0) {
			local15 = Static218.aByteArrayArray11;
		} else {
			local15 = Static121.aByteArrayArray9;
		}
		@Pc(22) int local22 = Static3.aByteArrayArray1.length;
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(31) byte[] local31 = local15[local24];
			if (local31 != null) {
				@Pc(45) int local45 = (Static162.anIntArray272[local24] >> 8) * 64 - Static269.anInt5357;
				@Pc(56) int local56 = (Static162.anIntArray272[local24] & 0xFF) * 64 - Static105.anInt2105;
				Static65.method4575();
				Static75.method1265(Static223.aClass12Array1, local31, local56, arg0, local45);
			}
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I[I[J)V")
	public static void method4711(@OriginalArg(1) int[] arg0, @OriginalArg(2) long[] arg1) {
		Static235.method3641(arg0, arg1.length - 1, 0, arg1);
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(III)Lclient!dl;")
	public static Class35 method4712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub21 local7 = Static261.aClass4_Sub21ArrayArrayArray4[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass35_1;
	}
}
