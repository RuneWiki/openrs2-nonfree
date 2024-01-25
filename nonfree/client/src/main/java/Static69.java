import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "Lclient!uh;")
	public static Class362 aClass362_1;

	@OriginalMember(owner = "client!cja", name = "c", descriptor = "I")
	public static int anInt1172 = 0;

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(Lclient!ko;III)Lclient!kca;")
	public static Class5_Sub1_Sub10 method1144(@OriginalArg(0) Class208 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg0.anInt5328 | arg1 << 10;
		@Pc(21) Class5_Sub1_Sub10 local21 = (Class5_Sub1_Sub10) Static397.aClass370_5.method8484((long) local10 << 16);
		if (local21 != null) {
			return local21;
		}
		@Pc(34) byte[] local34 = Static230.aClass126_115.method3069(Static230.aClass126_115.method3061(local10));
		if (local34 == null) {
			local10 = arg0.anInt5328 | arg2 + 65536 << 10;
			local21 = (Class5_Sub1_Sub10) Static397.aClass370_5.method8484((long) local10 << 16);
			if (local21 != null) {
				return local21;
			}
			local34 = Static230.aClass126_115.method3069(Static230.aClass126_115.method3061(local10));
			if (local34 == null) {
				local10 = arg0.anInt5328 | 0x3FFFC00;
				local21 = (Class5_Sub1_Sub10) Static397.aClass370_5.method8484((long) local10 << 16);
				if (local21 != null) {
					return local21;
				}
				local34 = Static230.aClass126_115.method3069(Static230.aClass126_115.method3061(local10));
				if (local34 == null) {
					return null;
				} else if (local34.length <= 1) {
					return null;
				} else {
					try {
						local21 = Static84.method1344(local34);
					} catch (@Pc(213) Exception local213) {
						throw new RuntimeException(local213.getMessage() + " S: " + local10);
					}
					local21.aClass208_3 = arg0;
					Static397.aClass370_5.method8485(local21, (long) local10 << 16);
					return local21;
				}
			} else if (local34.length <= 1) {
				return null;
			} else {
				try {
					local21 = Static84.method1344(local34);
				} catch (@Pc(131) Exception local131) {
					throw new RuntimeException(local131.getMessage() + " S: " + local10);
				}
				local21.aClass208_3 = arg0;
				Static397.aClass370_5.method8485(local21, (long) local10 << 16);
				return local21;
			}
		} else if (local34.length <= 1) {
			return null;
		} else {
			try {
				local21 = Static84.method1344(local34);
			} catch (@Pc(51) Exception local51) {
				throw new RuntimeException(local51.getMessage() + " S: " + local10);
			}
			local21.aClass208_3 = arg0;
			Static397.aClass370_5.method8485(local21, (long) local10 << 16);
			return local21;
		}
	}
}
