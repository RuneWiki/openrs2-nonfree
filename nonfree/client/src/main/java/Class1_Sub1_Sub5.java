import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class1_Sub1_Sub5 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ea", name = "T", descriptor = "[Lclient!uc;")
	public final Class58[] aClass58Array1;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!ja;Lclient!ja;IZ)V")
	public Class1_Sub1_Sub5(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class22 local7 = new Class22();
		@Pc(12) int local12 = arg0.method1299(arg2);
		this.aClass58Array1 = new Class58[local12];
		@Pc(21) int[] local21 = arg0.method1303(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(27) Class1_Sub5 local27 = null;
			@Pc(35) byte[] local35 = arg0.method1305(local21[local23], arg2);
			@Pc(49) int local49 = (local35[0] & 0xFF) << 8 | local35[1] & 0xFF;
			for (@Pc(54) Class1_Sub5 local54 = (Class1_Sub5) local7.method515(); local54 != null; local54 = (Class1_Sub5) local7.method519()) {
				if (local54.anInt870 == local49) {
					local27 = local54;
					break;
				}
			}
			if (local27 == null) {
				@Pc(80) byte[] local80 = arg1.method1308(local49, 0);
				local27 = new Class1_Sub5(local49, local80);
				local7.method512(local27);
			}
			this.aClass58Array1[local21[local23]] = new Class58(local35, local27);
		}
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(II)Z")
	public boolean method443(@OriginalArg(0) int arg0) {
		return this.aClass58Array1[arg0].aBoolean139;
	}
}
