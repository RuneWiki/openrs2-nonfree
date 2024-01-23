import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "Lclient!pn;")
	public static Class1_Sub2_Sub11 aClass1_Sub2_Sub11_10;

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "Lclient!km;")
	public static Class91 aClass91_72;

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "Lclient!km;")
	public static Class91 aClass91_73;

	@OriginalMember(owner = "client!rj", name = "i", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
	public static int anInt2005 = 0;

	@OriginalMember(owner = "client!rj", name = "j", descriptor = "D")
	public static double aDouble2 = -1.0D;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)Lclient!tj;")
	public static Class12_Sub2 method1568() {
		@Pc(31) Class12_Sub2 local31 = new Class12_Sub2(Static60.anInt1268, Static267.anInt5199, Static268.anIntArray461[0], Static289.anIntArray543[0], Static31.anIntArray78[0], Static44.anIntArray97[0], Static268.aByteArrayArray13[0], Static133.anIntArray266);
		Static91.method1595();
		return local31;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)V")
	public static void method1573(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class119 local7 = Static14.method289(arg0);
		@Pc(10) int local10 = local7.anInt3891;
		@Pc(13) int local13 = local7.anInt3893;
		@Pc(16) int local16 = local7.anInt3899;
		@Pc(23) int local23 = Class114.anIntArray338[local16 - local13];
		if (arg1 < 0 || local23 < arg1) {
			arg1 = 0;
		}
		local23 <<= local13;
		Static170.method2927(local23 & arg1 << local13 | Static13.anIntArray31[local10] & ~local23, local10);
	}
}
