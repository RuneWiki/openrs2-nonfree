import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static134 {

	@OriginalMember(owner = "client!ev", name = "d", descriptor = "Lclient!wa;")
	public static final Class354 aClass354_11 = new Class354(512);

	@OriginalMember(owner = "client!ev", name = "f", descriptor = "Lclient!gk;")
	public static final Class112 aClass112_21 = new Class112();

	@OriginalMember(owner = "client!ev", name = "g", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!ev", name = "h", descriptor = "Lclient!ps;")
	public static final Class262 aClass262_4 = new Class262(3, 5);

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lclient!tf;Z)V")
	public static void method2621(@OriginalArg(0) Class322 arg0) {
		Static372.aClass322_113 = arg0;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(ILclient!np;)Lclient!tr;")
	public static Class37_Sub3 method2623(@OriginalArg(1) Class3_Sub11 arg0) {
		return new Class37_Sub3(arg0.method5231(), arg0.method5231(), arg0.method5231(), arg0.method5231(), arg0.method5230(), arg0.method5175());
	}

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "(B)I")
	public static int method2624() {
		return 46;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(ZII)Z")
	public static boolean method2625(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100) != 0;
	}
}
