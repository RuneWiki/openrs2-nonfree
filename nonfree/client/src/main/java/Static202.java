import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V")
	public static void method3711() {
		Static196.aClass109_44.method2858();
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILclient!rg;)Lclient!sp;")
	public static Class5_Sub3 method3712(@OriginalArg(1) Class5_Sub12 arg0) {
		arg0.method5115();
		@Pc(13) int local13 = arg0.method5115();
		@Pc(17) Class5_Sub3 local17 = Static264.method4686(local13);
		local17.anInt6801 = arg0.method5115();
		@Pc(26) int local26 = arg0.method5115();
		for (@Pc(33) int local33 = 0; local33 < local26; local33++) {
			@Pc(39) int local39 = arg0.method5115();
			local17.method6017(arg0, local39);
		}
		local17.method6010();
		return local17;
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(II)V")
	public static void method3713(@OriginalArg(1) int arg0) {
		for (@Pc(3) Class5 local3 = Static114.aClass190_10.method5471(); local3 != null; local3 = Static114.aClass190_10.method5465()) {
			if ((local3.aLong235 >> 48 & 0xFFFFL) == (long) arg0) {
				local3.method6005();
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IB)V")
	public static void method3714(@OriginalArg(0) int arg0) {
		Static82.anInt1533 = arg0;
		@Pc(7) Class109 local7 = Static128.aClass109_42;
		synchronized (Static128.aClass109_42) {
			Static128.aClass109_42.method2858();
		}
	}
}
