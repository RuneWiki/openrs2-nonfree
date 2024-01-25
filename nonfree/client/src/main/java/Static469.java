import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static469 {

	@OriginalMember(owner = "client!tj", name = "C", descriptor = "I")
	public static int anInt8096;

	@OriginalMember(owner = "client!tj", name = "x", descriptor = "I")
	public static int anInt8092 = 765;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIB)Z")
	public static boolean method7144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILjava/lang/String;Lclient!os;)I")
	public static int method7145(@OriginalArg(1) String arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		@Pc(6) int local6 = arg1.anInt4872;
		@Pc(10) byte[] local10 = Static517.method7912(arg0);
		arg1.method4445(local10.length);
		arg1.anInt4872 += Static422.aClass199_1.method5477(arg1.anInt4872, arg1.aByteArray58, local10, local10.length, 0);
		return arg1.anInt4872 - local6;
	}
}
