import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static517 {

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "I")
	public static int anInt8205;

	@OriginalMember(owner = "client!rga", name = "j", descriptor = "[Lclient!vu;")
	public static Class5_Sub1_Sub21[] aClass5_Sub1_Sub21Array3;

	@OriginalMember(owner = "client!rga", name = "i", descriptor = "I")
	public static int anInt8215 = 0;

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(IILclient!wq;)V")
	public static void method7068(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub36 arg1) {
		if (Static683.aClass62_8 == null) {
			return;
		}
		try {
			Static683.aClass62_8.method1160(0L);
			Static683.aClass62_8.method1161(arg0, 24, arg1.aByteArray89);
		} catch (@Pc(23) Exception local23) {
		}
	}
}
