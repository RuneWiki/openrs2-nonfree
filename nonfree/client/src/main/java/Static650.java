import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static650 {

	@OriginalMember(owner = "client!wb", name = "r", descriptor = "Lclient!ol;")
	public static Class2_Sub8 aClass2_Sub8_10;

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "[B")
	public static final byte[] aByteArray102 = new byte[520];

	@OriginalMember(owner = "client!wb", name = "t", descriptor = "I")
	public static final int anInt11186 = 1405;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(JI)V")
	public static void method9565(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % (long) 10 == 0L) {
			Static223.method4117(arg0 - 1L);
			Static223.method4117(1L);
		} else {
			Static223.method4117(arg0);
		}
	}
}
