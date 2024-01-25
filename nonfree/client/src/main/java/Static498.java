import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static498 {

	@OriginalMember(owner = "client!ro", name = "l", descriptor = "Lclient!jo;")
	public static Class6_Sub3_Sub4 aClass6_Sub3_Sub4_3;

	@OriginalMember(owner = "client!ro", name = "r", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray22;

	@OriginalMember(owner = "client!ro", name = "o", descriptor = "I")
	public static int anInt8628 = -2;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method7428(@OriginalArg(0) Class100 arg0) {
		if (Static71.aBoolean94) {
			Static40.method758(arg0);
		} else {
			Static612.method7502(arg0);
		}
	}

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "(I)V")
	public static void method7436() {
		for (@Pc(15) Class6_Sub2_Sub13 local15 = (Class6_Sub2_Sub13) Static576.aClass8_29.method149(); local15 != null; local15 = (Class6_Sub2_Sub13) Static576.aClass8_29.method155()) {
			@Pc(20) Class20_Sub2_Sub2_Sub3 local20 = local15.aClass20_Sub2_Sub2_Sub3_1;
			if (local20.aBoolean140) {
				local15.method9043();
				local20.method1609();
			} else if (local20.anInt1956 <= Static113.anInt2243) {
				local20.method1610(Static333.anInt9456);
				if (local20.aBoolean140) {
					local15.method9043();
				} else {
					Static152.method4562(local20, true);
				}
			}
		}
	}
}
