import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "Lclient!ga;")
	public static Class30 aClass30_8;

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "[I")
	public static int[] anIntArray63;

	@OriginalMember(owner = "client!bf", name = "r", descriptor = "[I")
	public static int[] anIntArray64;

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "[[I")
	public static int[][] anIntArrayArray5 = new int[5][5000];

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
	public static int anInt465 = 0;

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "Lclient!ed;")
	private static Class23 aClass23_175 = Static169.method2903("FULL");

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "Lclient!ed;")
	public static Class23 aClass23_176 = aClass23_175;

	@OriginalMember(owner = "client!bf", name = "m", descriptor = "Lclient!ed;")
	public static Class23 aClass23_177 = Static169.method2903("Fps:");

	@OriginalMember(owner = "client!bf", name = "p", descriptor = "Lclient!ed;")
	public static Class23 aClass23_178 = Static169.method2903("swe");

	@OriginalMember(owner = "client!bf", name = "x", descriptor = "Lclient!ed;")
	public static Class23 aClass23_179 = Static169.method2903("Hidden)2use");

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I[Lclient!ed;I[SB)V")
	public static void method255(@OriginalArg(0) int arg0, @OriginalArg(1) Class23[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) short[] arg3) {
		if (arg2 >= arg0) {
			return;
		}
		@Pc(11) int local11 = (arg2 + arg0) / 2;
		@Pc(13) int local13 = arg2;
		@Pc(17) Class23 local17 = arg1[local11];
		arg1[local11] = arg1[arg0];
		arg1[arg0] = local17;
		@Pc(31) short local31 = arg3[local11];
		arg3[local11] = arg3[arg0];
		arg3[arg0] = local31;
		for (@Pc(43) int local43 = arg2; local43 < arg0; local43++) {
			if (local17 == null || arg1[local43] != null && arg1[local43].method656(local17) < (local43 & 0x1)) {
				@Pc(65) Class23 local65 = arg1[local43];
				arg1[local43] = arg1[local13];
				arg1[local13] = local65;
				@Pc(79) short local79 = arg3[local43];
				arg3[local43] = arg3[local13];
				arg3[local13++] = local79;
			}
		}
		arg1[arg0] = arg1[local13];
		arg1[local13] = local17;
		arg3[arg0] = arg3[local13];
		arg3[local13] = local31;
		method255(local13 - 1, arg1, arg2, arg3);
		method255(arg0, arg1, local13 + 1, arg3);
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V")
	public static void method258() {
		anIntArray63 = null;
		aClass23_175 = null;
		aClass23_177 = null;
		aClass30_8 = null;
		aClass23_179 = null;
		aClass23_176 = null;
		aClass23_178 = null;
		anIntArrayArray5 = null;
		anIntArray64 = null;
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)[Lclient!nb;")
	public static Class1_Sub1_Sub12_Sub1[] method261() {
		@Pc(8) Class1_Sub1_Sub12_Sub1[] local8 = new Class1_Sub1_Sub12_Sub1[Static110.anInt2830];
		for (@Pc(10) int local10 = 0; local10 < Static110.anInt2830; local10++) {
			@Pc(16) Class1_Sub1_Sub12_Sub1 local16 = new Class1_Sub1_Sub12_Sub1();
			local16.anInt2800 = Static71.anInt1936;
			local16.anInt2797 = Static62.anInt1654;
			local16.anInt2801 = Static103.anIntArray346[local10];
			local16.anInt2802 = Static59.anIntArray226[local10];
			local16.anInt2798 = Static27.anIntArray109[local10];
			local16.anInt2799 = Static47.anIntArray152[local10];
			@Pc(48) int local48 = local16.anInt2798 * local16.anInt2799;
			@Pc(52) byte[] local52 = Static1.aByteArrayArray1[local10];
			local16.anIntArray374 = new int[local48];
			for (@Pc(58) int local58 = 0; local58 < local48; local58++) {
				local16.anIntArray374[local58] = anIntArray63[local52[local58] & 0xFF];
			}
			local8[local10] = local16;
		}
		Static54.method996();
		return local8;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIII)I")
	public static int method262(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg2 & 0x1) == 1) {
			@Pc(15) int local15 = arg3;
			arg3 = arg1;
			arg1 = local15;
		}
		@Pc(27) int local27 = arg5 & 0x3;
		if (local27 == 0) {
			return arg4;
		} else if (local27 == 1) {
			return arg0;
		} else if (local27 == 2) {
			return 7 + 1 - arg4 - arg3;
		} else {
			return 1 + 7 - arg1 - arg0;
		}
	}
}
