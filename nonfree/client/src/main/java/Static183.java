import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static183 {

	@OriginalMember(owner = "client!j", name = "f", descriptor = "Lclient!fq;")
	public static Class83 aClass83_2;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "[I")
	public static final int[] anIntArray205 = new int[5];

	@OriginalMember(owner = "client!j", name = "d", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_95 = new Class12(78, 2);

	@OriginalMember(owner = "client!j", name = "g", descriptor = "I")
	public static int anInt3199 = 0;

	@OriginalMember(owner = "client!j", name = "h", descriptor = "Lclient!d;")
	public static Class48 aClass48_3 = null;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
	public static void method2651() {
		Static337.anIntArray393 = Static333.method4486(0.4F);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(III)Z")
	public static boolean method2653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static114.method1810(arg0, arg1) | (arg1 & 0x70000) != 0 || Static384.method5033(arg1, arg0);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ZII)Z")
	public static boolean method2654(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static147.aByteArrayArrayArray22[1][arg1][arg0] & 0x2) != 0;
	}
}
