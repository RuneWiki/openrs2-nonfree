import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aca")
public final class Class5 {

	@OriginalMember(owner = "client!aca", name = "b", descriptor = "Lclient!sw;")
	private final Class277 aClass277_4 = new Class277(64);

	@OriginalMember(owner = "client!aca", name = "f", descriptor = "Lclient!dn;")
	private final Class69 aClass69_3;

	@OriginalMember(owner = "client!aca", name = "c", descriptor = "Lclient!dn;")
	private final Class69 aClass69_2;

	@OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(ILclient!dn;Lclient!dn;)V")
	public Class5(@OriginalArg(0) int arg0, @OriginalArg(1) Class69 arg1, @OriginalArg(2) Class69 arg2) {
		this.aClass69_3 = arg1;
		this.aClass69_2 = arg2;
		if (this.aClass69_3 != null) {
			this.aClass69_3.method1884(0);
		}
		if (this.aClass69_2 != null) {
			this.aClass69_2.method1884(0);
		}
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(II)Lclient!aea;")
	public Class1_Sub2_Sub1 method375(@OriginalArg(0) int arg0) {
		@Pc(11) Class1_Sub2_Sub1 local11 = (Class1_Sub2_Sub1) this.aClass277_4.method7014((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(29) byte[] local29;
		if (arg0 >= 32768) {
			local29 = this.aClass69_2.method1888(arg0 & 0x7FFF, 0);
		} else {
			local29 = this.aClass69_3.method1888(arg0, 0);
		}
		local11 = new Class1_Sub2_Sub1();
		if (local29 != null) {
			local11.method427(new Class1_Sub17(local29));
		}
		if (arg0 >= 32768) {
			local11.method428();
		}
		this.aClass277_4.method7016(local11, (long) arg0);
		return local11;
	}
}
