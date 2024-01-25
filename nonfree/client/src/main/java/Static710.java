import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static710 {

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "Lclient!nt;")
	public static Class270 aClass270_11 = null;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
	public static void method4894() {
		Static460.aClass307_71.method7006();
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/lang/String;BLclient!ika;)I")
	public static int method4896(@OriginalArg(0) String arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		@Pc(12) int local12 = arg1.anInt2178;
		@Pc(16) byte[] local16 = Static85.method1867(arg0);
		arg1.method2056(local16.length);
		arg1.anInt2178 += Static332.aClass403_1.method9477(local16, 0, local16.length, arg1.anInt2178, arg1.aByteArray20);
		return arg1.anInt2178 - local12;
	}
}
