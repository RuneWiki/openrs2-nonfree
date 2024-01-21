import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class1_Sub1_Sub18 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ve", name = "Z", descriptor = "[Lclient!ea;")
	public final Class15[] aClass15Array1;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!rb;Lclient!rb;IZ)V")
	public Class1_Sub1_Sub18(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class55 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(5) Class45 local5 = new Class45();
		@Pc(10) int local10 = arg0.method1865(arg2);
		this.aClass15Array1 = new Class15[local10];
		@Pc(19) int[] local19 = arg0.method1875(arg2);
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(30) byte[] local30 = arg0.method1867(local19[local21], arg2);
			@Pc(32) Class1_Sub10 local32 = null;
			@Pc(46) int local46 = local30[1] & 0xFF | (local30[0] & 0xFF) << 8;
			for (@Pc(51) Class1_Sub10 local51 = (Class1_Sub10) local5.method1299(); local51 != null; local51 = (Class1_Sub10) local5.method1288()) {
				if (local51.anInt1958 == local46) {
					local32 = local51;
					break;
				}
			}
			if (local32 == null) {
				@Pc(87) byte[] local87 = arg1.method1883(local46, 0);
				local32 = new Class1_Sub10(local46, local87);
				local5.method1295(local32);
			}
			this.aClass15Array1[local19[local21]] = new Class15(local30, local32);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI)Z")
	public boolean method1860(@OriginalArg(1) int arg0) {
		return this.aClass15Array1[arg0].aBoolean35;
	}
}
