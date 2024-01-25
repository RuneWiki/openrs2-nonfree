import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static676 {

	@OriginalMember(owner = "client!ws", name = "f", descriptor = "J")
	public static long aLong312;

	@OriginalMember(owner = "client!ws", name = "j", descriptor = "[I")
	public static final int[] anIntArray716 = new int[1];

	@OriginalMember(owner = "client!ws", name = "q", descriptor = "[I")
	public static int[] anIntArray717 = new int[4];

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(ZLclient!gga;Lclient!lv;)Lclient!sd;")
	public static Class317 method9113(@OriginalArg(1) Class6_Sub23 arg0, @OriginalArg(2) Class216 arg1) {
		@Pc(10) Class317 local10 = new Class317(arg1);
		@Pc(14) int local14 = arg0.method8374();
		@Pc(25) boolean local25 = (local14 & 0x1) != 0;
		@Pc(41) boolean local41 = (local14 & 0x2) != 0;
		@Pc(49) boolean local49 = (local14 & 0x4) != 0;
		if (local25) {
			local10.anIntArray582[0] = arg0.method8363();
			local10.anIntArray583[0] = arg0.method8363();
			if (arg1.anInt6104 != -1 || arg1.anInt6047 != -1) {
				local10.anIntArray582[1] = arg0.method8363();
				local10.anIntArray583[1] = arg0.method8363();
			}
			if (arg1.anInt6063 != -1 || arg1.anInt6093 != -1) {
				local10.anIntArray582[2] = arg0.method8363();
				local10.anIntArray583[2] = arg0.method8363();
			}
		}
		@Pc(122) boolean local122 = (local14 & 0x8) != 0;
		if (local41) {
			local10.anIntArray585[0] = arg0.method8363();
			local10.anIntArray584[0] = arg0.method8363();
			if (arg1.anInt6057 != -1 || arg1.anInt6094 != -1) {
				local10.anIntArray585[1] = arg0.method8363();
				local10.anIntArray584[1] = arg0.method8363();
			}
		}
		@Pc(167) int local167;
		@Pc(170) int[] local170;
		@Pc(202) int local202;
		if (local49) {
			local167 = arg0.method8363();
			local170 = new int[] { local167 & 0xF, local167 >> 4 & 0xF, (local167 & 0xF69) >> 8, local167 >> 12 & 0xF };
			for (local202 = 0; local202 < 4; local202++) {
				if (local170[local202] != 15) {
					local10.aShortArray129[local170[local202]] = (short) arg0.method8363();
				}
			}
		}
		if (local122) {
			local167 = arg0.method8374();
			local170 = new int[] { local167 & 0xF, local167 >> 4 & 0xF };
			for (local202 = 0; local202 < 2; local202++) {
				if (local170[local202] != 15) {
					local10.aShortArray130[local170[local202]] = (short) arg0.method8363();
				}
			}
		}
		return local10;
	}
}
