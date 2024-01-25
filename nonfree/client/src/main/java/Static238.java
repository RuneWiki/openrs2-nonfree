import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!jw", name = "Y", descriptor = "I")
	public static int anInt4639;

	@OriginalMember(owner = "client!jw", name = "Z", descriptor = "I")
	public static int anInt4640;

	@OriginalMember(owner = "client!jw", name = "bb", descriptor = "[I")
	public static int[] anIntArray354;

	@OriginalMember(owner = "client!jw", name = "E", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_69 = new Class252(74, 4);

	@OriginalMember(owner = "client!jw", name = "M", descriptor = "[B")
	public static final byte[] aByteArray52 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!jw", name = "ab", descriptor = "Z")
	public static boolean aBoolean354 = false;

	@OriginalMember(owner = "client!jw", name = "cb", descriptor = "[I")
	public static final int[] anIntArray355 = new int[2];

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(Lclient!lp;IIIII)V")
	public static void method4284(@OriginalArg(0) Class111 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt2977 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass1_Sub5Array3[local4] != null) {
				arg0.anInt2977++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt2977; local22++) {
			@Pc(31) long local31 = Static8.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class108 local41;
			while (local31 != 0L) {
				local41 = Static102.aClass108Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass1_Sub5_1 == arg0.aClass1_Sub5Array3[local22]) {
					continue label51;
				}
			}
			local31 = Static8.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static102.aClass108Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass1_Sub5_1 == arg0.aClass1_Sub5Array3[local22]) {
					continue label51;
				}
			}
			for (@Pc(93) int local93 = local22; local93 < arg0.anInt2977 - 1; local93++) {
				arg0.aClass1_Sub5Array3[local93] = arg0.aClass1_Sub5Array3[local93 + 1];
			}
			arg0.anInt2977--;
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(BLclient!et;)V")
	public static void method4285(@OriginalArg(1) Class91 arg0) {
		if (arg0.anInt2452 == 5 && arg0.anInt2391 != -1) {
			Static158.method2883(Static455.aClass4_11, arg0);
		}
	}
}
