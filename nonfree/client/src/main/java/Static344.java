import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_221 = new Class184(69, 3);

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
	public static int anInt6255 = 0;

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V")
	public static void method4923() {
		for (@Pc(5) int local5 = 0; local5 < 5; local5++) {
			Static310.aBooleanArray23[local5] = false;
		}
		Static419.anInt7236 = 0;
		Static70.anInt1610 = -1;
		Static400.anInt6964 = 0;
		Static447.anInt7550 = -1;
		Static107.anInt2382 = 1;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!dn;Lclient!dn;Lclient!li;Lclient!dn;I)Z")
	public static boolean method4924(@OriginalArg(0) Class56 arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) Class3_Sub5_Sub1 arg2, @OriginalArg(3) Class56 arg3) {
		Static398.aClass56_83 = arg1;
		Static408.aClass3_Sub5_Sub1_118 = arg2;
		Static385.aClass56_78 = arg0;
		Static446.aClass56_100 = arg3;
		return true;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!sc;IIIII)V")
	public static void method4925(@OriginalArg(0) Class193 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt5916 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass3_Sub23Array3[local4] != null) {
				arg0.anInt5916++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt5916; local22++) {
			@Pc(31) long local31 = Static341.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class54 local41;
			while (local31 != 0L) {
				local41 = Static303.aClass54Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass3_Sub23_1 == arg0.aClass3_Sub23Array3[local22]) {
					continue label51;
				}
			}
			local31 = Static341.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static303.aClass54Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass3_Sub23_1 == arg0.aClass3_Sub23Array3[local22]) {
					continue label51;
				}
			}
			for (@Pc(93) int local93 = local22; local93 < arg0.anInt5916 - 1; local93++) {
				arg0.aClass3_Sub23Array3[local93] = arg0.aClass3_Sub23Array3[local93 + 1];
			}
			arg0.anInt5916--;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(III)Lclient!tg;")
	public static Class217 method4926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static151.aClass217ArrayArrayArray3[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static151.aClass217ArrayArrayArray3[0][arg1][arg2] != null && Static151.aClass217ArrayArrayArray3[0][arg1][arg2].aClass217_1 != null;
			if (local28 && arg0 >= Static281.anInt5169 - 1) {
				return null;
			}
			Static21.method587(arg0, arg1, arg2);
		}
		return Static151.aClass217ArrayArrayArray3[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZ)V")
	public static void method4927(@OriginalArg(0) int arg0) {
		Static101.anInt2262 = arg0;
		Static58.aClass5_9.method116();
	}
}
