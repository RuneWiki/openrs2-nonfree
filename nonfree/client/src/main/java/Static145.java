import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!en", name = "a", descriptor = "J")
	public static long aLong74;

	@OriginalMember(owner = "client!en", name = "b", descriptor = "Lclient!qj;")
	public static final Class295 aClass295_11 = new Class295(50);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!tq;III)Lclient!nba;")
	public static Class3_Sub5_Sub14 method2353(@OriginalArg(0) Class343 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg1 << 10 | arg0.anInt9545;
		@Pc(24) Class3_Sub5_Sub14 local24 = (Class3_Sub5_Sub14) Static527.aClass325_2.method7319((long) local10 << 16);
		if (local24 != null) {
			return local24;
		}
		@Pc(36) byte[] local36 = Static413.aClass362_88.method8356(Static413.aClass362_88.method8359(local10));
		if (local36 == null) {
			local10 = arg2 + 65536 << 10 | arg0.anInt9545;
			local24 = (Class3_Sub5_Sub14) Static527.aClass325_2.method7319((long) local10 << 16);
			if (local24 != null) {
				return local24;
			}
			local36 = Static413.aClass362_88.method8356(Static413.aClass362_88.method8359(local10));
			if (local36 == null) {
				local10 = arg0.anInt9545 | 0x3FFFC00;
				local24 = (Class3_Sub5_Sub14) Static527.aClass325_2.method7319((long) local10 << 16);
				if (local24 != null) {
					return local24;
				}
				local36 = Static413.aClass362_88.method8356(Static413.aClass362_88.method8359(local10));
				if (local36 == null) {
					return null;
				} else if (local36.length <= 1) {
					return null;
				} else {
					try {
						local24 = Static460.method6185(local36);
					} catch (@Pc(200) Exception local200) {
						throw new RuntimeException(local200.getMessage() + " S: " + local10);
					}
					local24.aClass343_6 = arg0;
					Static527.aClass325_2.method7322(local24, (long) local10 << 16);
					return local24;
				}
			} else if (local36.length <= 1) {
				return null;
			} else {
				try {
					local24 = Static460.method6185(local36);
				} catch (@Pc(130) Exception local130) {
					throw new RuntimeException(local130.getMessage() + " S: " + local10);
				}
				local24.aClass343_6 = arg0;
				Static527.aClass325_2.method7322(local24, (long) local10 << 16);
				return local24;
			}
		} else if (local36.length <= 1) {
			return null;
		} else {
			try {
				local24 = Static460.method6185(local36);
			} catch (@Pc(52) Exception local52) {
				throw new RuntimeException(local52.getMessage() + " S: " + local10);
			}
			local24.aClass343_6 = arg0;
			Static527.aClass325_2.method7322(local24, (long) local10 << 16);
			return local24;
		}
	}
}
