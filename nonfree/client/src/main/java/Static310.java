import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!tg", name = "F", descriptor = "Lclient!jd;")
	public static Class13 aClass13_21;

	@OriginalMember(owner = "client!tg", name = "K", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray67;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)Z", line = 141)
	public static boolean method6319() {
		return Class11_Sub1_Sub2.aBoolean24;
	}

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "(I)I", line = 484)
	public static int method6332() {
		if ((double) Static321.aFloat72 == 3.0D) {
			return 37;
		} else if ((double) Static321.aFloat72 == 4.0D) {
			return 50;
		} else if ((double) Static321.aFloat72 == 6.0D) {
			return 75;
		} else if ((double) Static321.aFloat72 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILclient!r;)I", line = 519)
	public static int method6334(@OriginalArg(1) Class197 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method5088(Class2_Sub9.anInt1734)) {
			local5++;
		}
		if (arg0.method5088(Class173_Sub2.anInt4846)) {
			local5++;
		}
		return local5;
	}
}
