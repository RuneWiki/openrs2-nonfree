import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static637 {

	@OriginalMember(owner = "client!wm", name = "G", descriptor = "Lclient!ni;")
	public static Class223 aClass223_143;

	@OriginalMember(owner = "client!wm", name = "F", descriptor = "[J")
	public static final long[] aLongArray10 = new long[10];

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!rl;BII)J")
	public static long method8734(@OriginalArg(0) Interface22 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) long local10 = 4194304L;
		@Pc(12) long local12 = Long.MIN_VALUE;
		@Pc(19) Class356 local19 = Static249.aClass310_1.method7474(arg0.method8436());
		@Pc(42) long local42 = (long) (arg0.method8435() << 14 | arg2 << 7 | arg1 | arg0.method8438() << 20 | 0x40000000);
		if (local19.anInt10253 == 0) {
			local42 |= local12;
		}
		if (local19.anInt10236 == 1) {
			local42 |= local10;
		}
		return local42 | (long) arg0.method8436() << 32;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BLclient!ha;IIII)V")
	public static void method8735(@OriginalArg(1) Class5 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static293.aClass5_6 = arg0;
		Static319.aClass115_3 = Static293.aClass5_6.method6184();
		Static428.aClass115_7 = Static293.aClass5_6.method6184();
		Static368.aClass115_4 = Static293.aClass5_6.method6184();
		Static326.anIntArray304 = null;
		Static401.anInt7435 = 100;
		Static642.anInt10730 = 100;
		Static320.anInterface20Array1 = null;
		Static552.anInt9486 = 0;
		Static381.method6035(arg1, arg2);
		Static274.anInt5859 = -1;
		Static226.anInt5045 = -1;
		Static198.anInt4244 = -1;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method8736(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
