import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!ap", name = "i", descriptor = "Lclient!dt;")
	public static Class62 aClass62_1;

	@OriginalMember(owner = "client!ap", name = "j", descriptor = "Lclient!wh;")
	public static Class246 aClass246_1;

	@OriginalMember(owner = "client!ap", name = "k", descriptor = "Lclient!ii;")
	public static Class111 aClass111_1;

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "S")
	public static short aShort2 = 320;

	@OriginalMember(owner = "client!ap", name = "l", descriptor = "Lclient!ku;")
	public static final Class139 aClass139_1 = new Class139(64);

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(III)Lclient!wm;")
	public static Class28_Sub4 method200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class48 local7 = Static69.aClass48ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass28_Sub4_1;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(JIII)V")
	public static void method202(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(18) int local18 = (int) arg0 >> 14 & 0x1F;
		@Pc(25) int local25 = (int) arg0 >> 20 & 0x3;
		@Pc(32) int local32 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
		if (local18 != 10 && local18 != 11 && local18 != 22) {
			Static165.method2523(true, local18, 0, 0, arg1, local25, arg2, 0);
			return;
		}
		@Pc(52) Class60 local52 = Static97.aClass217_4.method5007(local32);
		@Pc(62) int local62;
		@Pc(65) int local65;
		if (local25 == 0 || local25 == 2) {
			local65 = local52.anInt1427;
			local62 = local52.anInt1390;
		} else {
			local62 = local52.anInt1427;
			local65 = local52.anInt1390;
		}
		@Pc(76) int local76 = local52.anInt1405;
		if (local25 != 0) {
			local76 = (local76 << local25 & 0xF) + (local76 >> 4 - local25);
		}
		Static165.method2523(true, 0, local62, local76, arg1, 0, arg2, local65);
	}
}
