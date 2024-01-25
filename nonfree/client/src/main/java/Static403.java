import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)Lclient!nc;")
	public static Class1_Sub5_Sub14 method5238(@OriginalArg(1) int arg0) {
		@Pc(18) Class1_Sub5_Sub14 local18 = (Class1_Sub5_Sub14) Static13.aClass17_1.method317((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static73.aClass82_19.method1817(arg0, 0);
		if (local28 == null || local28.length <= 1) {
			return null;
		} else {
			local18 = Static188.method2687(local28);
			Static13.aClass17_1.method315((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)Z")
	public static boolean method5239(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static134.method2066(arg0, arg1) & Static328.method4414(arg1, arg0);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZI)I")
	public static int method5241(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
	public static void method5242() {
		@Pc(7) Class98 local7 = null;
		try {
			@Pc(13) Class232 local13 = Static183.aClass83_2.method1877("2", true);
			while (local13.anInt6402 == 0) {
				Static223.method4582(1L);
			}
			if (local13.anInt6402 == 1) {
				local7 = (Class98) local13.anObject8;
				@Pc(35) byte[] local35 = new byte[(int) local7.method2225()];
				@Pc(50) int local50;
				for (@Pc(37) int local37 = 0; local37 < local35.length; local37 += local50) {
					local50 = local7.method2223(local35.length - local37, local37, local35);
					if (local50 == -1) {
						throw new IOException("EOF");
					}
				}
				Static88.method1422(new Class1_Sub28(local35));
			}
		} catch (@Pc(88) Exception local88) {
		}
		try {
			if (local7 != null) {
				local7.method2224();
			}
		} catch (@Pc(95) Exception local95) {
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLclient!lr;)V")
	public static void method5243(@OriginalArg(1) Class25_Sub5_Sub1_Sub2 arg0) {
		@Pc(15) Class1_Sub10 local15 = (Class1_Sub10) Static38.aClass199_25.method4387((long) arg0.anInt4284);
		if (local15 == null) {
			Static81.method1356(arg0.aByte94, 0, arg0.anIntArray284[0], null, null, arg0.anIntArray283[0], arg0);
		} else {
			local15.method834();
		}
	}
}
