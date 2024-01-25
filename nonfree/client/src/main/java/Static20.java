import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
	public static int anInt435;

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "[I")
	public static int[] anIntArray28;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
	public static int anInt434 = -1;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
	public static int anInt438 = -1;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)Lclient!hn;")
	public static Class2_Sub11_Sub8 method679(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub11_Sub8 local15 = (Class2_Sub11_Sub8) Static112.aClass179_5.method5092((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static55.aClass191_158.method5459(19, arg0);
		local15 = new Class2_Sub11_Sub8();
		if (local25 != null) {
			local15.method2579(new Class2_Sub10(local25));
		}
		Static112.aClass179_5.method5085(local15, (long) arg0);
		return local15;
	}
}
