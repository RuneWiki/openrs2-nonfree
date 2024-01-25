import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!ip", name = "o", descriptor = "Lclient!ts;")
	public static Class8 aClass8_1;

	@OriginalMember(owner = "client!ip", name = "D", descriptor = "B")
	public static byte aByte38;

	@OriginalMember(owner = "client!ip", name = "y", descriptor = "I")
	public static int anInt4616 = 503;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIB)V")
	public static void method3886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class3_Sub4_Sub6 local12 = Static367.method6025(5, arg1);
		local12.method1898();
		local12.anInt1945 = arg0;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(JJ)J")
	public static long method3887(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}
}
