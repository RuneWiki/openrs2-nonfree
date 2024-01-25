import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "I")
	public static int anInt5229;

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "Lclient!wl;")
	public static final Class265 aClass265_41 = new Class265();

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method4217(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class2_Sub2_Sub2 local12 = Static15.method236(arg1, 2);
		local12.method434();
		local12.aString2 = arg0;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IB)I")
	public static int method4219(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(25) int local25 = local19 | local19 >>> 4;
		@Pc(31) int local31 = local25 | local25 >>> 8;
		@Pc(42) int local42 = local31 | local31 >>> 16;
		return arg0 & ~local42;
	}
}
