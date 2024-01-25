import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(II)V")
	public static void method4489(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = Static177.anInt3088 - Static632.anInt9868;
		if (local8 >= 100) {
			Static286.anInt4563 = -1;
			Static77.anInt1632 = -1;
			Static259.anInt4200 = 1;
			return;
		}
		@Pc(23) int local23 = (int) Static275.aFloat105;
		if (local23 < Static201.anInt3305 >> 8) {
			local23 = Static201.anInt3305 >> 8;
		}
		if (Static527.aBooleanArray18[4] && local23 < Static131.anIntArray160[4] + 128) {
			local23 = Static131.anIntArray160[4] + 128;
		}
		@Pc(56) int local56 = (int) Static642.aFloat230 + Static617.anInt9695 & 0x3FFF;
		Static203.method3068(Static674.method8951(Static296.anInt4684, Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9917, Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9925) - 200, Static27.anInt610, (local23 >> 3) * 3 + 600 << 2, arg0, Static11.anInt171, local23, local56);
		@Pc(102) float local102 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static611.anInt9382 = (int) ((float) (Static611.anInt9382 - Static69.anInt1456) * local102 + (float) Static69.anInt1456);
		Static652.anInt10283 = (int) ((float) Static10.anInt163 + (float) (Static652.anInt10283 - Static10.anInt163) * local102);
		Static618.anInt9710 = (int) ((float) Static27.anInt616 + (float) (Static618.anInt9710 - Static27.anInt616) * local102);
		Static383.anInt9871 = (int) ((float) (Static383.anInt9871 - Static392.anInt5769) * local102 + (float) Static392.anInt5769);
		@Pc(153) int local153 = Static226.anInt3586 - Static378.anInt5618;
		if (local153 > 8192) {
			local153 -= 16384;
		} else if (local153 < -8192) {
			local153 += 16384;
		}
		Static226.anInt3586 = (int) ((float) local153 * local102 + (float) Static378.anInt5618);
		Static226.anInt3586 &= 0x3FFF;
	}
}
