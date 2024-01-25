import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!hq", name = "J", descriptor = "[S")
	public static short[] aShortArray48;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static115.anInt2362 <= arg0 && arg0 <= Static146.anInt3034 && arg6 >= Static115.anInt2362 && Static146.anInt3034 >= arg6 && Static115.anInt2362 <= arg8 && arg8 <= Static146.anInt3034 && Static115.anInt2362 <= arg7 && Static146.anInt3034 >= arg7 && Static319.anInt5496 <= arg2 && Static160.anInt3220 >= arg2 && arg1 >= Static319.anInt5496 && Static160.anInt3220 >= arg1 && arg4 >= Static319.anInt5496 && Static160.anInt3220 >= arg4 && Static319.anInt5496 <= arg3 && arg3 <= Static160.anInt3220) {
			Static86.method1627(arg5, arg3, arg1, arg0, arg6, arg7, arg4, arg8, arg2);
		} else {
			Static330.method1922(arg3, arg7, arg5, arg1, arg0, arg8, arg6, arg4, arg2);
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!ke;IIIII)V")
	public static void method2684(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt352 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass10_Sub4Array2[local4] != null) {
				arg0.anInt352++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt352; local22++) {
			@Pc(31) long local31 = Static226.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class225 local41;
			while (local31 != 0L) {
				local41 = Static25.aClass225Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass10_Sub4_1 == arg0.aClass10_Sub4Array2[local22]) {
					continue label51;
				}
			}
			local31 = Static226.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static25.aClass225Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass10_Sub4_1 == arg0.aClass10_Sub4Array2[local22]) {
					continue label51;
				}
			}
			for (@Pc(93) int local93 = local22; local93 < arg0.anInt352 - 1; local93++) {
				arg0.aClass10_Sub4Array2[local93] = arg0.aClass10_Sub4Array2[local93 + 1];
			}
			arg0.anInt352--;
		}
	}
}
