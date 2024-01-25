import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static590 {

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILclient!gaa;FI[BIBFFIIFF)V")
	public static void method8027(@OriginalArg(1) Class115 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(7) float arg4, @OriginalArg(8) float arg5, @OriginalArg(11) float arg6, @OriginalArg(12) float arg7) {
		for (@Pc(3) int local3 = 0; local3 < 16; local3++) {
			Static558.method7639(arg7, arg6, local3, arg2, arg4, arg0, arg5, arg1, arg3);
			arg2 += 16384;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
	public static void method8028() {
		Static416.aClass2_Sub2_Sub11_1 = new Class2_Sub2_Sub11(Static434.aClass271_4.method5972(Static483.anInt7694), "", Static144.anInt2622, 1009, -1, 0L, 0, 0, true, false, 0L, true);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILclient!kc;IB)V")
	public static void method8029(@OriginalArg(0) int arg0, @OriginalArg(1) Class13_Sub1_Sub1_Sub1_Sub2 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = new int[4];
		Static653.method5393(local6, 0, local6.length, arg2);
		Static94.method1467(local6, arg1, arg0);
	}
}
