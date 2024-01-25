import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static455 {

	@OriginalMember(owner = "client!pfa", name = "U", descriptor = "Lclient!km;")
	public static final Class211 aClass211_3 = new Class211(true);

	@OriginalMember(owner = "client!pfa", name = "ib", descriptor = "I")
	public static int anInt7813 = 0;

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method6553(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(38) int local38 = 0;
			@Pc(40) long local40 = arg0;
			while (local40 != 0L) {
				local40 /= 37L;
				local38++;
			}
			@Pc(56) StringBuffer local56 = new StringBuffer(local38);
			while (arg0 != 0L) {
				@Pc(60) long local60 = arg0;
				arg0 /= 37L;
				local56.append(Static154.aCharArray2[(int) (local60 - arg0 * 37L)]);
			}
			return local56.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ZB)Z")
	public static boolean method6554(@OriginalArg(0) boolean arg0) {
		@Pc(11) boolean local11 = Static582.aClass16_12.method8186();
		if (local11 == arg0) {
			return true;
		}
		if (!arg0) {
			Static582.aClass16_12.method8189();
		} else if (!Static582.aClass16_12.method8181()) {
			arg0 = false;
		}
		if (arg0 == local11) {
			return false;
		} else {
			Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub28_1, arg0 ? 1 : 0);
			Static57.method6341();
			return true;
		}
	}

	@OriginalMember(owner = "client!pfa", name = "c", descriptor = "(Z)V")
	public static void method6555() {
		for (@Pc(6) Class3_Sub6_Sub20 local6 = (Class3_Sub6_Sub20) Static239.aClass258_3.method5934(); local6 != null; local6 = (Class3_Sub6_Sub20) Static239.aClass258_3.method5929()) {
			if (local6.anInt9677 > 1) {
				local6.anInt9677 = 0;
				Static438.aClass279_42.method6635(local6, ((Class3_Sub6_Sub16) local6.aClass258_13.aClass3_Sub6_44.aClass3_Sub6_67).aLong203);
				local6.aClass258_13.method5933();
			}
		}
		Static661.anInt10221 = 0;
		Static37.anInt1104 = 0;
		Static362.aClass193_32.method4458();
		Static654.aClass62_51.method1683();
		Static239.aClass258_3.method5933();
		Static463.aBoolean600 = false;
	}
}
