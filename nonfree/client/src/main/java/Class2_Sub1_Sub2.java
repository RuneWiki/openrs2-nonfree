import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class2_Sub1_Sub2 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ba", name = "V", descriptor = "[Lclient!wc;")
	public final Class69[] aClass69Array1;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lclient!ac;Lclient!ac;IZ)V")
	public Class2_Sub1_Sub2(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(5) Class8 local5 = new Class8();
		@Pc(10) int local10 = arg0.method946(arg2);
		this.aClass69Array1 = new Class69[local10];
		@Pc(19) int[] local19 = arg0.method943(arg2);
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(30) byte[] local30 = arg0.method928(local19[local21], arg2);
			@Pc(32) Class2_Sub6 local32 = null;
			@Pc(46) int local46 = (local30[0] & 0xFF) << 8 | local30[1] & 0xFF;
			for (@Pc(51) Class2_Sub6 local51 = (Class2_Sub6) local5.method175(); local51 != null; local51 = (Class2_Sub6) local5.method173()) {
				if (local46 == local51.anInt939) {
					local32 = local51;
					break;
				}
			}
			if (local32 == null) {
				@Pc(76) byte[] local76 = arg1.method931(local46, 0);
				local32 = new Class2_Sub6(local46, local76);
				local5.method187(local32);
			}
			this.aClass69Array1[local19[local21]] = new Class69(local30, local32);
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)Z")
	public boolean method169(@OriginalArg(0) int arg0) {
		return this.aClass69Array1[arg0].aBoolean139;
	}
}
