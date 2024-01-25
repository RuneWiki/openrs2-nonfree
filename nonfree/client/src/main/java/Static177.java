import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!le", name = "b", descriptor = "F")
	public static float aFloat68;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZI)Lclient!vm;")
	public static Class210 method3465(@OriginalArg(1) int arg0) {
		@Pc(7) Class198 local7 = Static91.aClass198_215;
		@Pc(16) Class210 local16;
		synchronized (Static91.aClass198_215) {
			local16 = (Class210) Static91.aClass198_215.method5210((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(36) byte[] local36 = Static315.aClass193_98.method5047(Static296.method4921(arg0), Static69.method1644(arg0));
		local16 = new Class210();
		local16.anInt6484 = arg0;
		local16.aStringArray82 = new String[] { null, null, Static354.aClass159_364.method4311(Static69.anInt1823), null, null };
		local16.aStringArray83 = new String[] { null, null, null, null, Static76.aClass159_107.method4311(Static69.anInt1823) };
		if (local36 != null) {
			local16.method5448(new Class4_Sub11(local36));
		}
		local16.method5453();
		if (local16.anInt6496 != -1) {
			local16.method5449(method3465(local16.anInt6496), method3465(local16.anInt6500));
		}
		if (local16.anInt6509 != -1) {
			local16.method5447(method3465(local16.anInt6509), method3465(local16.anInt6516));
		}
		if (!Static259.aBoolean383 && local16.aBoolean474) {
			local16.aString65 = Static20.aClass159_28.method4311(Static69.anInt1823);
			local16.anIntArray496 = null;
			local16.aStringArray82 = Static309.aStringArray72;
			local16.aStringArray83 = Static73.aStringArray22;
			local16.aBoolean473 = false;
			local16.anInt6515 = 0;
			if (local16.aClass43_36 != null) {
				@Pc(174) boolean local174 = false;
				for (@Pc(179) Class4 local179 = local16.aClass43_36.method1283(); local179 != null; local179 = local16.aClass43_36.method1278()) {
					@Pc(187) Class4_Sub4_Sub21 local187 = Static157.method3056((int) local179.aLong223);
					if (local187.aBoolean472) {
						local179.method5687();
					} else {
						local174 = true;
					}
				}
				if (!local174) {
					local16.aClass43_36 = null;
				}
			}
		}
		@Pc(211) Class198 local211 = Static91.aClass198_215;
		synchronized (Static91.aClass198_215) {
			Static91.aClass198_215.method5201(local16, (long) arg0);
			return local16;
		}
	}
}
