import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static538 {

	@OriginalMember(owner = "client!saa", name = "o", descriptor = "Lclient!ffa;")
	public static Class114 aClass114_2;

	@OriginalMember(owner = "client!saa", name = "i", descriptor = "Lclient!qw;")
	public static final Class302 aClass302_53 = new Class302();

	@OriginalMember(owner = "client!saa", name = "m", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_92 = new Class240(15, 8);

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(II)Lclient!nt;")
	public static Class258 method6887(@OriginalArg(1) int arg0) {
		@Pc(10) Class258 local10 = (Class258) Static393.aClass295_43.method6470((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static544.aClass362_120.method8368(0, arg0);
		local10 = new Class258();
		if (local20 != null) {
			local10.method5628(arg0, new Class3_Sub4(local20));
		}
		Static393.aClass295_43.method6469((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(B)V")
	public static void method6888() throws IOException {
		if (Static12.aClass26_1 == null || Static227.anInt3968 <= 0) {
			return;
		}
		Static643.aClass3_Sub4_8.anInt9739 = 0;
		while (true) {
			@Pc(20) Class3_Sub37 local20 = (Class3_Sub37) Static393.aClass302_44.method6603();
			if (local20 == null || local20.anInt7407 > Static643.aClass3_Sub4_8.aByteArray90.length - Static643.aClass3_Sub4_8.anInt9739) {
				Static12.aClass26_1.method745(Static643.aClass3_Sub4_8.aByteArray90, Static643.aClass3_Sub4_8.anInt9739);
				Static156.anInt2889 = 0;
				Static256.anInt4501 += Static643.aClass3_Sub4_8.anInt9739;
				break;
			}
			Static643.aClass3_Sub4_8.method7939(local20.aClass3_Sub4_Sub1_2.aByteArray90, local20.anInt7407, 0);
			Static227.anInt3968 -= local20.anInt7407;
			local20.method9034();
			local20.aClass3_Sub4_Sub1_2.method7957();
			local20.method6212();
		}
	}
}
