import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static205 {

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "[B")
	public static final byte[] aByteArray32 = new byte[2048];

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
	public static int anInt3593 = 0;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!fq;)V")
	public static void method3068(@OriginalArg(0) Class34_Sub1 arg0) {
		Static50.aClass95_1.H(arg0.anInt9614, arg0.anInt9622 + (arg0.method7847() >> 1), arg0.anInt9619, Static449.anIntArray395);
		arg0.anInt9623 = Static449.anIntArray395[0];
		arg0.anInt9615 = Static449.anIntArray395[1];
		arg0.anInt9617 = Static449.anIntArray395[2];
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
	public static void method3069() {
		if (Static344.aClass338_8 == null) {
			return;
		}
		if (Static344.aClass338_8.anInt9321 == 1) {
			Static344.aClass338_8 = null;
			return;
		}
		if (Static344.aClass338_8.anInt9321 == 2) {
			Static499.method6549(Static208.aString45, Static164.aClass92_2, 2);
			Static344.aClass338_8 = null;
			return;
		}
	}
}
