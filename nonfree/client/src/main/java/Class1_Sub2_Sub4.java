import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class1_Sub2_Sub4 extends Class1_Sub2 {

	@OriginalMember(owner = "client!bk", name = "G", descriptor = "[Lclient!ih;")
	public Class77[] aClass77Array1;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lclient!ak;Lclient!ak;IZ)V")
	public Class1_Sub2_Sub4(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class69 local7 = new Class69();
		@Pc(12) int local12 = arg0.method265(arg2);
		this.aClass77Array1 = new Class77[local12];
		@Pc(21) int[] local21 = arg0.method266(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(35) byte[] local35 = arg0.method253(local21[local23], arg2);
			@Pc(37) Class1_Sub28 local37 = null;
			@Pc(51) int local51 = local35[1] & 0xFF | (local35[0] & 0xFF) << 8;
			for (@Pc(56) Class1_Sub28 local56 = (Class1_Sub28) local7.method1636(); local56 != null; local56 = (Class1_Sub28) local7.method1631()) {
				if (local56.anInt5017 == local51) {
					local37 = local56;
					break;
				}
			}
			if (local37 == null) {
				@Pc(83) byte[] local83 = arg1.method238(local51, 0);
				local37 = new Class1_Sub28(local51, local83);
				local7.method1628(local37);
			}
			this.aClass77Array1[local21[local23]] = new Class77(local35, local37);
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)Z")
	public boolean method457(@OriginalArg(1) int arg0) {
		return this.aClass77Array1[arg0].aBoolean160;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)Z")
	public boolean method461(@OriginalArg(0) int arg0) {
		return this.aClass77Array1[arg0].aBoolean159;
	}
}
