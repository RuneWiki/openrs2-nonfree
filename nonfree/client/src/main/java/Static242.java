import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!ib", name = "p", descriptor = "F")
	public static float aFloat107;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZLclient!od;)V")
	public static void method3906(@OriginalArg(1) Class3_Sub6_Sub16 arg0) {
		if (Static463.aBoolean600) {
			return;
		}
		arg0.method8770();
		Static37.anInt1104--;
		if (!arg0.aBoolean535) {
			@Pc(82) long local82 = arg0.aLong203;
			@Pc(88) Class3_Sub6_Sub20 local88;
			for (local88 = (Class3_Sub6_Sub20) Static654.aClass62_51.method1682(local82); local88 != null && !local88.aString123.equals(arg0.aString97); local88 = (Class3_Sub6_Sub20) Static654.aClass62_51.method1689()) {
			}
			if (local88 != null && local88.method8244(arg0)) {
				Static82.method1755(local88);
			}
			return;
		}
		for (@Pc(27) Class3_Sub6_Sub20 local27 = (Class3_Sub6_Sub20) Static239.aClass258_3.method5934(); local27 != null; local27 = (Class3_Sub6_Sub20) Static239.aClass258_3.method5929()) {
			if (local27.aString123.equals(arg0.aString97)) {
				@Pc(37) boolean local37 = false;
				for (@Pc(43) Class3_Sub6_Sub16 local43 = (Class3_Sub6_Sub16) local27.aClass258_13.method5934(); local43 != null; local43 = (Class3_Sub6_Sub16) local27.aClass258_13.method5929()) {
					if (local43 == arg0) {
						if (local27.method8244(arg0)) {
							Static82.method1755(local27);
						}
						local37 = true;
						break;
					}
				}
				if (local37) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(B)Lclient!rda;")
	public static Class304 method3907() {
		try {
			return (Class304) Class.forName("Class304_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!kh;IIIZLclient!ha;)V")
	public static void method3908(@OriginalArg(0) Class208 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class16 arg4) {
		for (@Pc(7) int local7 = 7; local7 >= 0; local7--) {
			for (@Pc(11) int local11 = 127; local11 >= 0; local11--) {
				@Pc(29) int local29 = local11 & 0x7F | (arg1 & 0x3F) << 10 | (local7 & 0x7) << 7;
				@Pc(37) int local37 = Static422.anIntArray448[Static231.method3710(local29) & 0xFFFF];
				arg4.aa(arg3 + (arg0.anInt5639 * local11 >> 7), (arg0.anInt5630 * (-local7 + 7) >> 3) + arg2, (arg0.anInt5639 >> 7) + 1, (arg0.anInt5630 >> 3) + 1, local37, 0);
			}
		}
	}
}
