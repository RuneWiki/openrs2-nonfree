import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static588 {

	@OriginalMember(owner = "client!va", name = "e", descriptor = "[[S")
	public static short[][] aShortArrayArray31;

	@OriginalMember(owner = "client!va", name = "q", descriptor = "I")
	public static int anInt9702 = 0;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(III)Z")
	public static boolean method8115(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
	public static void method8118() {
		Static399.aClass78ArrayArray1 = new Class78[Static455.aClass97_116.method2546()][];
		Static629.aClass78ArrayArray2 = new Class78[Static455.aClass97_116.method2546()][];
		Static214.aBooleanArray27 = new boolean[Static455.aClass97_116.method2546()];
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZLclient!ak;[II)V")
	public static void method8119(@OriginalArg(1) Class11_Sub1_Sub1_Sub2_Sub1 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(4) boolean local4;
		@Pc(6) int local6;
		if (arg0.anIntArray226 != null) {
			local4 = true;
			for (local6 = 0; local6 < arg0.anIntArray226.length; local6++) {
				if (arg1[local6] != arg0.anIntArray226[local6]) {
					local4 = false;
					break;
				}
			}
			if (local4 && arg0.anInt3258 != -1) {
				@Pc(41) Class149 local41 = Static185.aClass303_1.method7201(arg0.anInt3258);
				@Pc(44) int local44 = local41.anInt4516;
				if (local44 == 1) {
					arg0.anInt3235 = 1;
					arg0.anInt3257 = 0;
					arg0.anInt3225 = 0;
					arg0.anInt3263 = 0;
					arg0.anInt3232 = arg2;
					if (!arg0.aBoolean276) {
						Static330.method3630(arg0.anInt3263, local41, arg0);
					}
				}
				if (local44 == 2) {
					arg0.anInt3257 = 0;
				}
			}
		}
		local4 = true;
		for (local6 = 0; local6 < arg1.length; local6++) {
			if (arg1[local6] != -1) {
				local4 = false;
			}
			if (arg0.anIntArray226 == null || arg0.anIntArray226[local6] == -1 || Static185.aClass303_1.method7201(arg1[local6]).anInt4518 >= Static185.aClass303_1.method7201(arg0.anIntArray226[local6]).anInt4518) {
				arg0.anIntArray226 = arg1;
				arg0.anInt3232 = arg2;
				break;
			}
		}
		if (local4) {
			arg0.anIntArray226 = arg1;
			arg0.anInt3232 = arg2;
		}
	}
}
