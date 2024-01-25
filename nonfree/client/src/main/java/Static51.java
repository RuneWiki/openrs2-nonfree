import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!cp", name = "k", descriptor = "I")
	public static int anInt5042;

	@OriginalMember(owner = "client!cp", name = "r", descriptor = "Lclient!tc;")
	public static Class195 aClass195_44 = new Class195();

	@OriginalMember(owner = "client!cp", name = "u", descriptor = "I")
	public static int anInt5048 = 0;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIILclient!tr;)J")
	public static long method4581(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface8 arg2) {
		@Pc(13) long local13 = 4194304L;
		@Pc(15) long local15 = 2147483648L;
		@Pc(17) long local17 = Long.MIN_VALUE;
		@Pc(23) Class188 local23 = Static126.method2405(arg2.method5697());
		@Pc(44) long local44 = (long) (arg2.method5699() << 14 | arg0 | arg1 << 7 | arg2.method5701() << 20 | 0x40000000);
		if (local23.anInt5546 == 0) {
			local44 |= local17;
		}
		if (local23.anInt5522 == 1) {
			local44 |= local13;
		}
		if (local23.aBoolean486) {
			local44 |= local15;
		}
		return local44 | (long) arg2.method5697() << 32;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(BJ)V")
	public static void method4583(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(10) InterruptedException local10) {
		}
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(II)Lclient!gp;")
	public static Class74_Sub1 method4585(@OriginalArg(0) int arg0) {
		return Static293.aBoolean499 && arg0 >= Static116.anInt2306 && arg0 <= Static5.anInt98 ? Static253.aClass74_Sub1Array1[arg0 - Static116.anInt2306] : null;
	}
}
