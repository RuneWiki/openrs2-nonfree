import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class2_Sub3_Sub13 extends Class2_Sub3 {

	@OriginalMember(owner = "client!l", name = "N", descriptor = "[Lclient!qa;")
	public Class139[] aClass139Array1;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lclient!jd;Lclient!jd;IZ)V")
	public Class2_Sub3_Sub13(@OriginalArg(0) Class84 arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class1 local7 = new Class1();
		@Pc(12) int local12 = arg0.method2116(arg2);
		this.aClass139Array1 = new Class139[local12];
		@Pc(21) int[] local21 = arg0.method2119(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(35) byte[] local35 = arg0.method2127(local21[local23], arg2);
			@Pc(37) Class2_Sub10 local37 = null;
			@Pc(51) int local51 = (local35[0] & 0xFF) << 8 | local35[1] & 0xFF;
			for (@Pc(56) Class2_Sub10 local56 = (Class2_Sub10) local7.method13(); local56 != null; local56 = (Class2_Sub10) local7.method9()) {
				if (local51 == local56.anInt1508) {
					local37 = local56;
					break;
				}
			}
			if (local37 == null) {
				@Pc(85) byte[] local85 = arg1.method2122(local51, 0);
				local37 = new Class2_Sub10(local51, local85);
				local7.method11(local37);
			}
			this.aClass139Array1[local21[local23]] = new Class139(local35, local37);
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(II)Z")
	public boolean method2467(@OriginalArg(0) int arg0) {
		return this.aClass139Array1[arg0].aBoolean358;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IB)Z")
	public boolean method2470(@OriginalArg(0) int arg0) {
		return this.aClass139Array1[arg0].aBoolean359;
	}
}
