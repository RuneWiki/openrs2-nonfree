import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!lv", name = "nb", descriptor = "Lclient!pb;")
	public static final Class265 aClass265_14 = new Class265(1);

	@OriginalMember(owner = "client!lv", name = "sb", descriptor = "Z")
	public static boolean aBoolean402 = false;

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(ILclient!gga;)V")
	public static void method5145(@OriginalArg(1) Class6_Sub23 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static446.aClass238_7 != null) {
			@Pc(22) int local22;
			try {
				Static446.aClass238_7.method5542(0L);
				Static446.aClass238_7.method5539(local8);
				for (local22 = 0; local22 < 24 && local8[local22] == 0; local22++) {
				}
				if (local22 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(46) Exception local46) {
				for (local22 = 0; local22 < 24; local22++) {
					local8[local22] = -1;
				}
			}
		}
		arg0.method8358(local8, 0, 24);
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)V")
	public static void method5157() throws IOException {
		if (Static163.aClass170_1 == null || Static630.anInt6215 <= 0) {
			return;
		}
		Static673.aClass6_Sub23_10.anInt9901 = 0;
		while (true) {
			@Pc(20) Class6_Sub26 local20 = (Class6_Sub26) Static104.aClass362_10.method8538();
			if (local20 == null || local20.anInt3955 > Static673.aClass6_Sub23_10.aByteArray101.length - Static673.aClass6_Sub23_10.anInt9901) {
				Static163.aClass170_1.method8773(Static673.aClass6_Sub23_10.anInt9901, Static673.aClass6_Sub23_10.aByteArray101);
				Static332.anInt7617 += Static673.aClass6_Sub23_10.anInt9901;
				Static145.anInt2484 = 0;
				break;
			}
			Static673.aClass6_Sub23_10.method8358(local20.aClass6_Sub23_Sub1_2.aByteArray101, 0, local20.anInt3955);
			Static630.anInt6215 -= local20.anInt3955;
			local20.method9174();
			local20.aClass6_Sub23_Sub1_2.method8372();
			local20.method3398();
		}
	}
}
