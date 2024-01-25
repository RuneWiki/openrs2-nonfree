import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class146 {

	@OriginalMember(owner = "client!me", name = "a", descriptor = "Lclient!co;")
	private final Class41 aClass41_49 = new Class41(64);

	@OriginalMember(owner = "client!me", name = "c", descriptor = "Lclient!g;")
	private final Class83 aClass83_75;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!ci;ILclient!g;)V")
	public Class146(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class83 arg2) {
		this.aClass83_75 = arg2;
		this.aClass83_75.method1955(5);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II)Lclient!ol;")
	public Class2_Sub7_Sub13 method3775(@OriginalArg(1) int arg0) {
		@Pc(10) Class41 local10 = this.aClass41_49;
		@Pc(20) Class2_Sub7_Sub13 local20;
		synchronized (this.aClass41_49) {
			local20 = (Class2_Sub7_Sub13) this.aClass41_49.method823((long) arg0);
		}
		if (local20 != null) {
			return local20;
		}
		@Pc(37) byte[] local37 = this.aClass83_75.method1968(arg0, 5);
		local20 = new Class2_Sub7_Sub13();
		if (local37 != null) {
			local20.method4327(new Class2_Sub24(local37));
		}
		@Pc(53) Class41 local53 = this.aClass41_49;
		synchronized (this.aClass41_49) {
			this.aClass41_49.method832((long) arg0, local20);
			return local20;
		}
	}
}
