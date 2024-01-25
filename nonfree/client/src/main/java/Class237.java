import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class237 {

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "Lclient!dc;")
	private final Class44 aClass44_52 = new Class44(64);

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "Lclient!he;")
	private final Class100 aClass100_86;

	@OriginalMember(owner = "client!tp", name = "d", descriptor = "Lclient!he;")
	private final Class100 aClass100_87;

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(ILclient!he;Lclient!he;)V")
	public Class237(@OriginalArg(0) int arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(2) Class100 arg2) {
		this.aClass100_86 = arg1;
		this.aClass100_87 = arg2;
		if (this.aClass100_86 != null) {
			this.aClass100_86.method2523(0);
		}
		if (this.aClass100_87 != null) {
			this.aClass100_87.method2523(0);
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IB)Lclient!ut;")
	public Class6_Sub2_Sub16 method5714(@OriginalArg(0) int arg0) {
		@Pc(11) Class6_Sub2_Sub16 local11 = (Class6_Sub2_Sub16) this.aClass44_52.method1353((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 >= 32768) {
			local27 = this.aClass100_87.method2520(arg0 & 0x7FFF, 0);
		} else {
			local27 = this.aClass100_86.method2520(arg0, 0);
		}
		local11 = new Class6_Sub2_Sub16();
		if (local27 != null) {
			local11.method6064(new Class6_Sub1(local27));
		}
		if (arg0 >= 32768) {
			local11.method6067();
		}
		this.aClass44_52.method1349(local11, (long) arg0);
		return local11;
	}
}
