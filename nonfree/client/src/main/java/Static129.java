import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!eha", name = "c", descriptor = "I")
	public static int anInt8997;

	@OriginalMember(owner = "client!eha", name = "f", descriptor = "I")
	public static int anInt9000;

	@OriginalMember(owner = "client!eha", name = "b", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_301 = new Class288(17, 11);

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "([BB)[B")
	public static byte[] method7547(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub22 local8 = new Class2_Sub22(arg0);
		@Pc(12) int local12 = local8.method8547();
		@Pc(16) int local16 = local8.method8542();
		if (local16 < 0 || Static430.anInt8346 != 0 && Static430.anInt8346 < local16) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(47) byte[] local47 = new byte[local16];
			local8.method8502(local47, 0, local16);
			return local47;
		} else {
			@Pc(59) int local59 = local8.method8542();
			if (local59 < 0 || Static430.anInt8346 != 0 && Static430.anInt8346 < local59) {
				throw new RuntimeException();
			}
			@Pc(83) byte[] local83 = new byte[local59];
			if (local12 == 1) {
				Static103.method1540(local83, local59, arg0, local16);
			} else {
				@Pc(97) Class110 local97 = Static591.aClass110_1;
				synchronized (Static591.aClass110_1) {
					Static591.aClass110_1.method2434(local83, local8);
				}
			}
			return local83;
		}
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(I)V")
	public static void method7549() {
		for (@Pc(7) int local7 = 0; local7 < Static27.aByteArrayArrayArray1.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static27.aByteArrayArrayArray1[0].length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < Static27.aByteArrayArrayArray1[0][0].length; local15++) {
					Static27.aByteArrayArrayArray1[local7][local11][local15] = 0;
				}
			}
		}
	}
}
