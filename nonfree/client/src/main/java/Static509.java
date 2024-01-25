import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static509 {

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "Lclient!la;")
	public static Class207 aClass207_108;

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "[I")
	public static final int[] anIntArray489 = new int[13];

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
	public static int anInt8839 = 0;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
	public static void method7616() {
		if (Static199.anInt3910 == 0) {
			return;
		}
		try {
			if (++Static36.anInt573 > 2000) {
				if (Static495.aClass170_2 != null) {
					Static495.aClass170_2.method8119();
					Static495.aClass170_2 = null;
				}
				if (Static275.anInt4921 >= 2) {
					Static581.anInt9774 = -5;
					Static199.anInt3910 = 0;
					return;
				}
				Static104.aClass306_2.method7223();
				Static275.anInt4921++;
				Static199.anInt3910 = 1;
				Static36.anInt573 = 0;
			}
			if (Static199.anInt3910 == 1) {
				Static302.aClass91_6 = Static104.aClass306_2.method7224(Static470.aClass100_14);
				Static199.anInt3910 = 2;
			}
			if (Static199.anInt3910 == 2) {
				if (Static302.aClass91_6.anInt2271 == 2) {
					throw new IOException();
				}
				if (Static302.aClass91_6.anInt2271 != 1) {
					return;
				}
				Static495.aClass170_2 = Static295.method4602((Socket) Static302.aClass91_6.anObject2);
				Static302.aClass91_6 = null;
				Static386.method5642();
				Static199.anInt3910 = 4;
			}
			if (Static199.anInt3910 == 4 && Static495.aClass170_2.method8122(1)) {
				Static495.aClass170_2.method8123(0, 1, Static257.aClass5_Sub22_Sub1_1.aByteArray71);
				@Pc(117) int local117 = Static257.aClass5_Sub22_Sub1_1.aByteArray71[0] & 0xFF;
				Static581.anInt9774 = local117;
				Static199.anInt3910 = 0;
				Static495.aClass170_2.method8119();
				Static495.aClass170_2 = null;
			}
		} catch (@Pc(128) IOException local128) {
			if (Static495.aClass170_2 != null) {
				Static495.aClass170_2.method8119();
				Static495.aClass170_2 = null;
			}
			if (Static275.anInt4921 >= 2) {
				Static199.anInt3910 = 0;
				Static581.anInt9774 = -4;
			} else {
				Static104.aClass306_2.method7223();
				Static36.anInt573 = 0;
				Static199.anInt3910 = 1;
				Static275.anInt4921++;
			}
		}
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)V")
	public static void method7617() {
		for (@Pc(7) int local7 = 0; local7 < Static280.anInt4989; local7++) {
			@Pc(13) int local13 = Static209.anIntArray198[local7];
			@Pc(20) Class5_Sub3 local20 = (Class5_Sub3) Static445.aClass273_29.method6581((long) local13);
			if (local20 != null) {
				@Pc(25) Class4_Sub2_Sub1_Sub1_Sub2 local25 = local20.aClass4_Sub2_Sub1_Sub1_Sub2_1;
				Static106.method1670(local25.aClass225_1.anInt5618, local25);
			}
		}
	}
}
