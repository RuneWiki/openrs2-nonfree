import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!cq", name = "u", descriptor = "[Lclient!og;")
	public static Class86[] aClass86Array1;

	@OriginalMember(owner = "client!cq", name = "p", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_25 = new Class92(9, 8);

	@OriginalMember(owner = "client!cq", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString6 = null;

	@OriginalMember(owner = "client!cq", name = "w", descriptor = "[I")
	public static int[] anIntArray90 = new int[1];

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
	public static String method1238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(8) char[] local8 = new char[arg0];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0; local12++) {
			@Pc(23) int local23 = arg2[arg1 + local12] & 0xFF;
			if (local23 != 0) {
				if (local23 >= 128 && local23 < 160) {
					@Pc(37) char local37 = Static336.aCharArray4[local23 - 128];
					if (local37 == '\u0000') {
						local37 = '?';
					}
					local23 = local37;
				}
				local8[local10++] = (char) local23;
			}
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)[Lclient!pj;")
	public static Class195[] method1239() {
		return new Class195[] { Static433.aClass195_4, Static272.aClass195_2, Static307.aClass195_3 };
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(III)Z")
	public static boolean method1240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!is;IIIII)V")
	public static void method1241(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt7773 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass6_Sub11Array3[local4] != null) {
				arg0.anInt7773++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt7773; local22++) {
			@Pc(31) long local31 = Static441.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class76 local41;
			while (local31 != 0L) {
				local41 = Static411.aClass76Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass6_Sub11_1 == arg0.aClass6_Sub11Array3[local22]) {
					continue label51;
				}
			}
			local31 = Static441.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static411.aClass76Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass6_Sub11_1 == arg0.aClass6_Sub11Array3[local22]) {
					continue label51;
				}
			}
			for (@Pc(93) int local93 = local22; local93 < arg0.anInt7773 - 1; local93++) {
				arg0.aClass6_Sub11Array3[local93] = arg0.aClass6_Sub11Array3[local93 + 1];
			}
			arg0.anInt7773--;
		}
	}
}
