import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static488 {

	@OriginalMember(owner = "client!qia", name = "G", descriptor = "[I")
	public static final int[] anIntArray534 = new int[2];

	@OriginalMember(owner = "client!qia", name = "J", descriptor = "Lclient!pja;")
	public static final Class279 aClass279_44 = new Class279(5);

	@OriginalMember(owner = "client!qia", name = "c", descriptor = "(I)V")
	public static void method7007() {
		Static254.method4038();
		Static548.anInt8905 = 0;
		Static253.anInt4769 = 0;
		Static215.aClass126_116 = null;
		Static213.aClass126_73 = null;
		Static3.aClass126_2 = null;
		Static39.aClass126_16 = null;
		Static253.anInt4788 = 0;
		Static67.aClass3_Sub17_Sub2_4.lb = 0;
		Static455.method6555();
		Static653.method8544();
		for (@Pc(30) int local30 = 0; local30 < 2048; local30++) {
			Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local30] = null;
		}
		Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2 = null;
		for (@Pc(44) int local44 = 0; local44 < Static609.anInt6433; local44++) {
			@Pc(51) Class23_Sub2_Sub1_Sub2_Sub2 local51 = Static43.aClass3_Sub11Array1[local44].aClass23_Sub2_Sub1_Sub2_Sub2_1;
			if (local51 != null) {
				local51.anInt10178 = -1;
			}
		}
		Static522.method7358();
		Static378.anInt6662 = 1;
		Static18.anInt682 = -1;
		Static65.anInt1581 = -1;
		Static482.method6863(10);
		for (@Pc(77) int local77 = 0; local77 < 100; local77++) {
			Static119.aBooleanArray10[local77] = true;
		}
		Static430.method6354();
		Static4.aLong3 = 0L;
		Static196.aClass3_Sub55_1 = null;
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(I[B)[B")
	public static byte[] method7008(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static689.method8055(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(ILclient!kh;BI)V")
	public static void method7009(@OriginalArg(0) int arg0, @OriginalArg(1) Class208 arg1, @OriginalArg(3) int arg2) {
		Static503.anInt8455 = arg0;
		Static328.aClass208_7 = arg1;
		Static27.anInt793 = arg2;
	}
}
