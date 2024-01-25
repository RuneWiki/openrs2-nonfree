import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
	public static int anInt4202 = -1;

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
	public static int anInt4203 = 1;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!nb;IIIII)V")
	public static void method3583(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt63 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass3_Sub13_Sub1Array2[local4] != null) {
				arg0.anInt63++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt63; local22++) {
			@Pc(31) int local31 = Static145.anIntArrayArrayArray4[arg1][arg2][arg3];
			@Pc(40) Class3_Sub13_Sub1 local40;
			while (local31 != 0) {
				local40 = Static13.aClass3_Sub13_Sub1Array3[(local31 & 0xFF) - 1];
				local31 >>>= 0x8;
				if (local40 == arg0.aClass3_Sub13_Sub1Array2[local22]) {
					continue label51;
				}
			}
			local31 = Static145.anIntArrayArrayArray4[arg1][arg4][arg5];
			while (local31 != 0) {
				local40 = Static13.aClass3_Sub13_Sub1Array3[(local31 & 0xFF) - 1];
				local31 >>>= 0x8;
				if (local40 == arg0.aClass3_Sub13_Sub1Array2[local22]) {
					continue label51;
				}
			}
			for (@Pc(85) int local85 = local22; local85 < arg0.anInt63 - 1; local85++) {
				arg0.aClass3_Sub13_Sub1Array2[local85] = arg0.aClass3_Sub13_Sub1Array2[local85 + 1];
			}
			arg0.anInt63--;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
	public static void method3584() {
		for (@Pc(10) Class8_Sub6 local10 = (Class8_Sub6) Static321.aClass65_8.method1460(); local10 != null; local10 = (Class8_Sub6) Static321.aClass65_8.method1460()) {
			Static29.method592(local10);
		}
		Static47.method814();
		Static47.method830();
		Static47.method812();
		Static47.method829();
		Static47.method825();
		Static47.method827();
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)I")
	public static int method3585(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
