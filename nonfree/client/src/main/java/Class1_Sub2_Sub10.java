import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class1_Sub2_Sub10 extends Class1_Sub2 {

	@OriginalMember(owner = "client!gk", name = "D", descriptor = "[Lclient!em;")
	public Class39[] aClass39Array1;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!km;Lclient!km;IZ)V")
	public Class1_Sub2_Sub10(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class91 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class61 local7 = new Class61();
		@Pc(12) int local12 = arg0.method2510(arg2);
		this.aClass39Array1 = new Class39[local12];
		@Pc(21) int[] local21 = arg0.method2494(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(35) byte[] local35 = arg0.method2495(arg2, local21[local23]);
			@Pc(49) int local49 = (local35[0] & 0xFF) << 8 | local35[1] & 0xFF;
			@Pc(51) Class1_Sub30 local51 = null;
			for (@Pc(56) Class1_Sub30 local56 = (Class1_Sub30) local7.method1835(); local56 != null; local56 = (Class1_Sub30) local7.method1836()) {
				if (local49 == local56.anInt4903) {
					local51 = local56;
					break;
				}
			}
			if (local51 == null) {
				@Pc(92) byte[] local92 = arg1.method2487(local49, 0);
				local51 = new Class1_Sub30(local49, local92);
				local7.method1839(local51);
			}
			this.aClass39Array1[local21[local23]] = new Class39(local35, local51);
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)Z")
	public boolean method1587(@OriginalArg(1) int arg0) {
		return this.aClass39Array1[arg0].aBoolean99;
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(II)Z")
	public boolean method1589(@OriginalArg(0) int arg0) {
		return this.aClass39Array1[arg0].aBoolean98;
	}
}
