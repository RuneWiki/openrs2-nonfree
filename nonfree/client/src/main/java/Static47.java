import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!ef", name = "y", descriptor = "[[[Lclient!pf;")
	private static Class1_Sub22[][][] aClass1_Sub22ArrayArrayArray2;

	@OriginalMember(owner = "client!ef", name = "A", descriptor = "Lclient!ai;")
	public static Class7 aClass7_10;

	@OriginalMember(owner = "client!ef", name = "w", descriptor = "Lclient!ah;")
	public static Class6 aClass6_4 = null;

	@OriginalMember(owner = "client!ef", name = "F", descriptor = "Lclient!kh;")
	public static Class60 aClass60_358 = Static200.method3116("::clientdrop");

	@OriginalMember(owner = "client!ef", name = "K", descriptor = "[Z")
	public static boolean[] aBooleanArray4 = new boolean[100];

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)V")
	public static void method806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub22 local7 = Static100.aClass1_Sub22ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass16_1 = null;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)I")
	public static int method807(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
