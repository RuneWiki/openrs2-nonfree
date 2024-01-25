import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!pea", name = "f", descriptor = "[I")
	public static int[] anIntArray310;

	@OriginalMember(owner = "client!pea", name = "h", descriptor = "I")
	public static int anInt6415;

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "I")
	public static int anInt6411 = 0;

	@OriginalMember(owner = "client!pea", name = "i", descriptor = "Lclient!in;")
	public static final Class169 aClass169_163 = new Class169(56, 5);

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(I[B)Z")
	public static boolean method5730(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Class2_Sub8 local13 = new Class2_Sub8(arg0);
		@Pc(17) int local17 = local13.method5203();
		if (local17 != 2) {
			return false;
		}
		@Pc(31) boolean local31 = local13.method5203() == 1;
		if (local31) {
			Static639.method9458(local13);
		}
		Static7.method128(local13);
		return true;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(III)I")
	public static int method5732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 >>> 31;
		return (local7 + arg0) / arg1 - local7;
	}
}
