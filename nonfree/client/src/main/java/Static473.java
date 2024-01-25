import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static473 {

	@OriginalMember(owner = "client!sda", name = "t", descriptor = "I")
	public static int anInt8125;

	@OriginalMember(owner = "client!sda", name = "i", descriptor = "I")
	public static int anInt8115 = -1;

	@OriginalMember(owner = "client!sda", name = "n", descriptor = "Lclient!em;")
	public static final Class83 aClass83_175 = new Class83(73, 7);

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(B)V")
	public static void method6514() {
		if (Static31.aClass78_18.method6794()) {
			Static31.aClass78_18.method6847(Static103.aCanvas2);
			Static77.method7390();
			Static31.aClass78_18.method6780(Static103.aCanvas2);
			Static31.aClass78_18.method6795(Static103.aCanvas2);
		} else {
			Static358.method7632(Static286.anInt5239);
		}
		Static506.method7088();
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(Lclient!vv;Lclient!ks;IB)V")
	public static void method6515(@OriginalArg(0) Class11_Sub1 arg0, @OriginalArg(1) Class197 arg1, @OriginalArg(2) int arg2) {
		if (Static439.anInt8379 >= 50 || (arg1 == null || arg1.anIntArrayArray24 == null || arg1.anIntArrayArray24.length <= arg2 || arg1.anIntArrayArray24[arg2] == null)) {
			return;
		}
		@Pc(32) int local32 = arg1.anIntArrayArray24[arg2][0];
		@Pc(36) int local36 = local32 >> 8;
		@Pc(42) int local42 = local32 >> 5 & 0x7;
		@Pc(46) int local46 = local32 & 0x1F;
		@Pc(65) int local65;
		if (arg1.anIntArrayArray24[arg2].length > 1) {
			local65 = (int) (Math.random() * (double) arg1.anIntArrayArray24[arg2].length);
			if (local65 > 0) {
				local36 = arg1.anIntArrayArray24[arg2][local65];
			}
		}
		local65 = 256;
		if (arg1.anIntArray283 != null && arg1.anIntArray282 != null) {
			local65 = (int) ((double) (arg1.anIntArray282[arg2] - arg1.anIntArray283[arg2]) * Math.random()) + arg1.anIntArray283[arg2];
		}
		@Pc(119) int local119 = arg1.anIntArray281 == null ? 255 : arg1.anIntArray281[arg2];
		if (local46 == 0) {
			if (arg0 == Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2) {
				if (arg1.aBoolean386) {
					Static17.method396(local65, local42, false, local36, local119, 0);
					return;
				}
				Static485.method6697(0, local119, local42, local65, local36);
			}
		} else if (Static86.aClass1_Sub30_Sub1_1.anInt6196 != 0) {
			@Pc(158) int local158 = arg0.anInt8902 - 256 >> 9;
			@Pc(165) int local165 = arg0.anInt8906 - 256 >> 9;
			@Pc(186) int local186 = arg0 == Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2 ? 0 : local46 + (arg0.aByte113 << 24) - (-(local158 << 16) - (local165 << 8));
			Static73.aClass239Array1[Static439.anInt8379++] = new Class239((byte) (arg1.aBoolean386 ? 2 : 1), local36, local42, 0, local119, local186, local65, arg0);
		}
	}
}
