import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class2_Sub1_Sub5 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ge", name = "K", descriptor = "[Lclient!n;")
	public final Class55[] aClass55Array1;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lclient!na;Lclient!na;IZ)V")
	public Class2_Sub1_Sub5(@OriginalArg(0) Class56 arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(5) Class13 local5 = new Class13();
		@Pc(10) int local10 = arg0.method1678(arg2);
		this.aClass55Array1 = new Class55[local10];
		@Pc(19) int[] local19 = arg0.method1673(arg2);
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(24) Class2_Sub6 local24 = null;
			@Pc(32) byte[] local32 = arg0.method1666(local19[local21], arg2);
			@Pc(46) int local46 = (local32[0] & 0xFF) << 8 | local32[1] & 0xFF;
			for (@Pc(51) Class2_Sub6 local51 = (Class2_Sub6) local5.method270(); local51 != null; local51 = (Class2_Sub6) local5.method273()) {
				if (local46 == local51.anInt1108) {
					local24 = local51;
					break;
				}
			}
			if (local24 == null) {
				@Pc(87) byte[] local87 = arg1.method1688(0, local46);
				local24 = new Class2_Sub6(local46, local87);
				local5.method263(local24);
			}
			this.aClass55Array1[local19[local21]] = new Class55(local32, local24);
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(II)Z")
	public boolean method670(@OriginalArg(0) int arg0) {
		return this.aClass55Array1[arg0].aBoolean62;
	}
}
