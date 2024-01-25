import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!ew", name = "C", descriptor = "I")
	public static final int anInt2839 = 1405;

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(Lclient!so;I)Lclient!ifa;")
	public static Class160 method2349(@OriginalArg(0) Class14_Sub29 arg0) {
		@Pc(14) int local14 = arg0.method5866();
		@Pc(21) Class168 local21 = Static191.method2989()[arg0.method5866()];
		@Pc(28) Class339 local28 = Static324.method5108()[arg0.method5866()];
		@Pc(32) int local32 = arg0.method5890();
		@Pc(38) int local38 = arg0.method5890();
		@Pc(42) int local42 = arg0.method5900();
		@Pc(46) int local46 = arg0.method5900();
		@Pc(50) int local50 = arg0.method5878();
		@Pc(54) int local54 = arg0.method5878();
		@Pc(58) int local58 = arg0.method5878();
		@Pc(67) boolean local67 = arg0.method5866() == 1;
		return new Class160(local14, local21, local28, local32, local38, local42, local46, local50, local54, local58, local67);
	}
}
