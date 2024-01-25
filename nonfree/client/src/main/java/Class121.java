import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class121 {

	@OriginalMember(owner = "client!je", name = "d", descriptor = "Lclient!hn;")
	private final Class102 aClass102_22 = new Class102(64);

	@OriginalMember(owner = "client!je", name = "f", descriptor = "Lclient!fo;")
	private final Class82 aClass82_49;

	@OriginalMember(owner = "client!je", name = "e", descriptor = "Lclient!fo;")
	private final Class82 aClass82_48;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(ILclient!fo;Lclient!fo;)V")
	public Class121(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) Class82 arg2) {
		this.aClass82_49 = arg2;
		this.aClass82_48 = arg1;
		if (this.aClass82_48 != null) {
			this.aClass82_48.method1823(0);
		}
		if (this.aClass82_49 != null) {
			this.aClass82_49.method1823(0);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)Lclient!ep;")
	public Class1_Sub5_Sub4 method2691(@OriginalArg(1) int arg0) {
		@Pc(11) Class1_Sub5_Sub4 local11 = (Class1_Sub5_Sub4) this.aClass102_22.method2258((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(29) byte[] local29;
		if (arg0 < 32768) {
			local29 = this.aClass82_48.method1817(0, arg0);
		} else {
			local29 = this.aClass82_49.method1817(0, arg0 & 0x7FFF);
		}
		local11 = new Class1_Sub5_Sub4();
		if (local29 != null) {
			local11.method1512(new Class1_Sub28(local29));
		}
		if (arg0 >= 32768) {
			local11.method1509();
		}
		this.aClass102_22.method2272((long) arg0, local11);
		return local11;
	}
}
