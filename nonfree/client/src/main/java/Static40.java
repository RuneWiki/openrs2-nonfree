import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!da", name = "m", descriptor = "I")
	public static int anInt816;

	@OriginalMember(owner = "client!da", name = "s", descriptor = "[I")
	public static int[] anIntArray59;

	@OriginalMember(owner = "client!da", name = "u", descriptor = "[[B")
	public static byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!da", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString24 = "flash2:";

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZI)V")
	public static void method718(@OriginalArg(0) boolean arg0) {
		Static96.method1397(Static66.anInt1299, Static314.aFloat62, Static23.aFloat4, Static44.aFloat7);
		Static96.method1388(Static127.anInt2542, Static119.anInt5886, arg0);
		Static96.method1392((float) Static20.anInt396, (float) Static59.anInt1171, (float) Static73.anInt1415);
		Static96.method1390();
		Static170.aFloat38 = Static101.aFloat16;
		Static188.aClass1_Sub1_Sub16_5 = Static245.aClass1_Sub1_Sub16_3;
		Static170.aFloat37 = Static97.aFloat15;
		Static170.aFloat36 = Static30.aFloat6;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([BIII)I")
	public static int method719(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = -1;
		for (@Pc(15) int local15 = arg2; local15 < arg1; local15++) {
			local13 = local13 >>> 8 ^ Class22_Sub6.anIntArray219[(arg0[local15] ^ local13) & 0xFF];
		}
		return ~local13;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)Lclient!uo;")
	public static Class182_Sub1 method720(@OriginalArg(0) int arg0) {
		return Static156.aBoolean233 && Static110.anInt2186 <= arg0 && arg0 <= Static138.anInt2725 ? Static219.aClass182_Sub1Array2[arg0 - Static110.anInt2186] : null;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Ljava/lang/String;I[SIB)V")
	public static void method722(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		@Pc(14) int local14 = arg3;
		@Pc(20) int local20 = (arg1 + arg3) / 2;
		@Pc(24) String local24 = arg0[local20];
		arg0[local20] = arg0[arg1];
		arg0[arg1] = local24;
		@Pc(38) short local38 = arg2[local20];
		arg2[local20] = arg2[arg1];
		arg2[arg1] = local38;
		for (@Pc(50) int local50 = arg3; local50 < arg1; local50++) {
			if (local24 == null || arg0[local50] != null && arg0[local50].compareTo(local24) < (local50 & 0x1)) {
				@Pc(76) String local76 = arg0[local50];
				arg0[local50] = arg0[local14];
				arg0[local14] = local76;
				@Pc(90) short local90 = arg2[local50];
				arg2[local50] = arg2[local14];
				arg2[local14++] = local90;
			}
		}
		arg0[arg1] = arg0[local14];
		arg0[local14] = local24;
		arg2[arg1] = arg2[local14];
		arg2[local14] = local38;
		method722(arg0, local14 - 1, arg2, arg3);
		method722(arg0, arg1, arg2, local14 + 1);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
	public static void method723(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(4) Class1_Sub1_Sub2 local4 = Static46.method824(9, arg1);
		local4.method294();
		local4.anInt293 = arg2;
		local4.anInt296 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IZ)I")
	public static int method724(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(II)I")
	public static int method725(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
