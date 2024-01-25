import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static545 {

	@OriginalMember(owner = "client!uw", name = "g", descriptor = "Lclient!xa;")
	public static Class13 aClass13_34;

	@OriginalMember(owner = "client!uw", name = "h", descriptor = "I")
	public static int anInt9177 = 0;

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lclient!dw;IIIII)V")
	public static void method7552(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt7407 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass4_Sub32Array5[local4] != null) {
				arg0.anInt7407++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt7407; local22++) {
			@Pc(31) long local31 = Static348.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class32 local41;
			while (local31 != 0L) {
				local41 = Static22.aClass32Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass4_Sub32_2 == arg0.aClass4_Sub32Array5[local22]) {
					continue label51;
				}
			}
			local31 = Static348.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static22.aClass32Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass4_Sub32_2 == arg0.aClass4_Sub32Array5[local22]) {
					continue label51;
				}
			}
			for (@Pc(93) int local93 = local22; local93 < arg0.anInt7407 - 1; local93++) {
				arg0.aClass4_Sub32Array5[local93] = arg0.aClass4_Sub32Array5[local93 + 1];
			}
			arg0.anInt7407--;
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IBC)I")
	public static int method7553(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
		@Pc(12) int local12 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			@Pc(21) char local21 = Character.toLowerCase(arg1);
			local12 = (local21 << 4) + 1;
		}
		return local12;
	}
}
