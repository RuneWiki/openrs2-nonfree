import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "[I")
	public static int[] anIntArray237;

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
	public static int anInt5687;

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger4 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "Lclient!o;")
	public static final Class234 aClass234_5 = new Class234();

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!ji;I)Lclient!dv;")
	public static Class72_Sub1 method4756(@OriginalArg(0) Class6_Sub8 arg0) {
		@Pc(12) Class72 local12 = Static201.method6159(arg0);
		@Pc(16) int local16 = arg0.method8244();
		return new Class72_Sub1(local12.anInt2966, local12.aClass79_6, local12.aClass127_7, local12.anInt2968, local12.anInt2969, local16);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILclient!s;)V")
	public static void method4757(@OriginalArg(0) int arg0, @OriginalArg(1) Class245 arg1) {
		Static148.aClass245Array1[arg0] = arg1;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BI)Lclient!it;")
	public static Class147 method4759(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static55.aClass147Array1[arg0] : null;
	}
}
