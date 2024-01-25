import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!ma", name = "y", descriptor = "I")
	public static int anInt5460 = 0;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
	public static void method4808() {
		@Pc(7) Class80 local7 = null;
		try {
			@Pc(13) Class281 local13 = Static239.aClass207_2.method4574("");
			while (local13.anInt7338 == 0) {
				Static491.method6679(1L);
			}
			if (local13.anInt7338 == 1) {
				local7 = (Class80) local13.anObject17;
				@Pc(35) Class4_Sub11 local35 = Static124.aClass4_Sub20_4.method3146();
				local7.method2122(local35.anInt10466, local35.aByteArray107, 0);
			}
		} catch (@Pc(45) Exception local45) {
		}
		try {
			if (local7 != null) {
				local7.method2118();
			}
		} catch (@Pc(52) Exception local52) {
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!ha;ILclient!ifa;II)V")
	public static void method4809(@OriginalArg(0) Class33 arg0, @OriginalArg(2) Class163 arg1) {
		Static600.aClass163_64.method3643();
		if (Static205.aBoolean250) {
			return;
		}
		for (@Pc(21) Class4_Sub30 local21 = (Class4_Sub30) arg1.method3639(); local21 != null; local21 = (Class4_Sub30) arg1.method3640()) {
			@Pc(29) Class259 local29 = Static154.aClass59_2.method1798(local21.anInt4794);
			if (Static346.method4666(local29)) {
				@Pc(41) boolean local41 = Static337.method4619(local29, local21, arg0);
				if (local41) {
					Static280.method8740(local29, arg0, local21);
				}
			}
		}
	}
}
