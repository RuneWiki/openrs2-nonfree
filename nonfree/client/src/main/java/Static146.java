import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!fr", name = "r", descriptor = "S")
	public static short aShort126 = 205;

	@OriginalMember(owner = "client!fr", name = "s", descriptor = "Lclient!ft;")
	public static final Class110 aClass110_39 = new Class110(4, 16);

	@OriginalMember(owner = "client!fr", name = "v", descriptor = "I")
	public static int anInt9947 = 0;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V")
	public static void method8073() {
		Static234.aClass211_35.method5535();
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(CB)Z")
	public static boolean method8075(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)I")
	public static int method8077() {
		if (Static256.aBoolean474) {
			return 6;
		} else if (Static201.aClass3_Sub40_3 == null) {
			return 0;
		} else {
			@Pc(19) int local19 = Static201.aClass3_Sub40_3.anInt7324;
			if (Static8.method307(local19)) {
				return 1;
			} else if (Static211.method3720(local19)) {
				return 2;
			} else if (Static127.method2533(local19)) {
				return 3;
			} else if (Static566.method8142(local19)) {
				return 4;
			} else {
				return 5;
			}
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(ZIZLclient!hw;)V")
	public static void method8079(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class3_Sub18 arg2) {
		@Pc(6) int local6 = arg2.anInt3962;
		@Pc(10) int local10 = (int) arg2.aLong262;
		arg2.method8412();
		if (arg1) {
			Static595.method8405(local6);
		}
		Static182.method3237(local6);
		@Pc(25) Class305 local25 = Static220.method3786(local10);
		if (local25 != null) {
			Static282.method4860(local25);
		}
		Static442.method6914();
		if (!arg0 && Static25.anInt779 != -1) {
			Static474.method7273(1, Static25.anInt779);
		}
		@Pc(46) Class324 local46 = new Class324(Static283.aClass25_23);
		for (@Pc(56) Class3_Sub18 local56 = (Class3_Sub18) local46.method7771(); local56 != null; local56 = (Class3_Sub18) local46.method7772()) {
			if (!local56.method8414()) {
				local56 = (Class3_Sub18) local46.method7771();
				if (local56 == null) {
					return;
				}
			}
			if (local56.anInt3964 == 3) {
				@Pc(79) int local79 = (int) local56.aLong262;
				if (local79 >>> 16 == local6) {
					method8079(arg0, true, local56);
				}
			}
		}
	}
}
