import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class4_Sub1_Sub6 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ef", name = "C", descriptor = "[Lclient!nc;")
	public final Class59[] aClass59Array1;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!nh;Lclient!nh;IZ)V")
	public Class4_Sub1_Sub6(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class11 local7 = new Class11();
		@Pc(12) int local12 = arg0.method2865(arg2);
		this.aClass59Array1 = new Class59[local12];
		@Pc(21) int[] local21 = arg0.method2856(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method2878(arg2, local21[local23]);
			@Pc(35) Class4_Sub8 local35 = null;
			@Pc(49) int local49 = local33[1] & 0xFF | (local33[0] & 0xFF) << 8;
			for (@Pc(54) Class4_Sub8 local54 = (Class4_Sub8) local7.method274(); local54 != null; local54 = (Class4_Sub8) local7.method271()) {
				if (local54.anInt1059 == local49) {
					local35 = local54;
					break;
				}
			}
			if (local35 == null) {
				@Pc(88) byte[] local88 = arg1.method2853(0, local49);
				local35 = new Class4_Sub8(local49, local88);
				local7.method272(local35);
			}
			this.aClass59Array1[local21[local23]] = new Class59(local33, local35);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)Z")
	public boolean method729(@OriginalArg(0) int arg0) {
		return this.aClass59Array1[arg0].aBoolean119;
	}
}
