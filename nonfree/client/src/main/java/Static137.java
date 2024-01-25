import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!ip", name = "f", descriptor = "I")
	public static int anInt2337;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "Z")
	public static volatile boolean aBoolean152 = true;

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "Z")
	public static boolean aBoolean153 = false;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!lj;IIIII)V")
	public static void method2180(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt1945 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) int local16 = Static318.anIntArrayArrayArray19[arg1][local4][local7];
				@Pc(18) int local18 = 0;
				while (true) {
					label49: while (true) {
						if (local18 > 24) {
							continue label54;
						}
						@Pc(25) int local25 = local16 >>> local18 & 0xFF;
						if (local25 <= 0) {
							continue label54;
						}
						@Pc(33) Class5_Sub13_Sub1 local33 = Static233.aClass5_Sub13_Sub1Array3[local25 - 1];
						for (@Pc(35) int local35 = 0; local35 < arg0.anInt1945; local35++) {
							if (arg0.aClass5_Sub13_Sub1Array2[local35] == local33) {
								local18 += 8;
								continue label49;
							}
						}
						arg0.aClass5_Sub13_Sub1Array2[arg0.anInt1945++] = local33;
						if (arg0.anInt1945 == 4) {
							break label56;
						}
						local18 += 8;
					}
				}
			}
		}
		for (local7 = arg0.anInt1945; local7 < 4; local7++) {
			arg0.aClass5_Sub13_Sub1Array2[local7] = null;
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILclient!nf;)V")
	public static void method2182(@OriginalArg(1) Class5_Sub17 arg0) {
		arg0.aBoolean383 = false;
		if (arg0.aClass5_Sub15_5 != null) {
			arg0.aClass5_Sub15_5.anInt2149 = 0;
		}
		for (@Pc(18) Class5_Sub17 local18 = arg0.method4463(); local18 != null; local18 = arg0.method4461()) {
			method2182(local18);
		}
	}
}
