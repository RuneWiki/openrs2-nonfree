import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!v", name = "e", descriptor = "Lclient!qa;")
	public static Class30 aClass30_12;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILclient!ri;)V")
	public static void method5426(@OriginalArg(1) Class4_Sub36 arg0) {
		if (Static40.aClass53ArrayArrayArray2 == null) {
			return;
		}
		@Pc(13) Interface11 local13 = null;
		if (arg0.anInt6027 == 0) {
			local13 = (Interface11) Static138.method1998(arg0.anInt6038, arg0.anInt6026, arg0.anInt6039);
		}
		if (arg0.anInt6027 == 1) {
			local13 = (Interface11) Static351.method4929(arg0.anInt6038, arg0.anInt6026, arg0.anInt6039);
		}
		if (arg0.anInt6027 == 2) {
			local13 = (Interface11) Static134.method1950(arg0.anInt6038, arg0.anInt6026, arg0.anInt6039, ou.class);
		}
		if (arg0.anInt6027 == 3) {
			local13 = (Interface11) Static40.method729(arg0.anInt6038, arg0.anInt6026, arg0.anInt6039);
		}
		if (local13 == null) {
			arg0.anInt6032 = 0;
			arg0.anInt6031 = 0;
			arg0.anInt6037 = -1;
		} else {
			arg0.anInt6037 = local13.method5648();
			arg0.anInt6031 = local13.method5644();
			arg0.anInt6032 = local13.method5649();
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BI)Z")
	public static boolean method5427(@OriginalArg(1) int arg0) {
		if (Static389.aBooleanArray25[arg0]) {
			return true;
		} else if (Static247.aClass166_209.method3680(arg0)) {
			@Pc(23) int local23 = Static247.aClass166_209.method3691(arg0);
			if (local23 == 0) {
				Static389.aBooleanArray25[arg0] = true;
				return true;
			}
			if (Static320.aClass126ArrayArray2[arg0] == null) {
				Static320.aClass126ArrayArray2[arg0] = new Class126[local23];
			}
			for (@Pc(47) int local47 = 0; local47 < local23; local47++) {
				if (Static320.aClass126ArrayArray2[arg0][local47] == null) {
					@Pc(61) byte[] local61 = Static247.aClass166_209.method3696(local47, arg0);
					if (local61 != null) {
						@Pc(73) Class126 local73 = Static320.aClass126ArrayArray2[arg0][local47] = new Class126();
						local73.anInt3397 = local47 + (arg0 << 16);
						if (local61[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local73.method2667(new Class4_Sub30(local61));
					}
				}
			}
			Static389.aBooleanArray25[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
