import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class97 {

	@OriginalMember(owner = "client!hm", name = "j", descriptor = "Lclient!co;")
	private final Class41 aClass41_34 = new Class41(64);

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "Lclient!g;")
	private final Class83 aClass83_58;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lclient!ci;ILclient!g;)V")
	public Class97(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class83 arg2) {
		this.aClass83_58 = arg2;
		if (this.aClass83_58 != null) {
			this.aClass83_58.method1955(35);
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)Lclient!ri;")
	public Class201 method2360(@OriginalArg(1) int arg0) {
		@Pc(6) Class41 local6 = this.aClass41_34;
		@Pc(16) Class201 local16;
		synchronized (this.aClass41_34) {
			local16 = (Class201) this.aClass41_34.method823((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass83_58.method1968(arg0, 35);
		local16 = new Class201();
		if (local33 != null) {
			local16.method4926(new Class2_Sub24(local33));
		}
		local16.method4923();
		@Pc(52) Class41 local52 = this.aClass41_34;
		synchronized (this.aClass41_34) {
			this.aClass41_34.method832((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V")
	public void method2361() {
		@Pc(10) Class41 local10 = this.aClass41_34;
		synchronized (this.aClass41_34) {
			this.aClass41_34.method829();
		}
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(II)V")
	public void method2362() {
		@Pc(2) Class41 local2 = this.aClass41_34;
		synchronized (this.aClass41_34) {
			this.aClass41_34.method826(5);
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V")
	public void method2363() {
		@Pc(12) Class41 local12 = this.aClass41_34;
		synchronized (this.aClass41_34) {
			this.aClass41_34.method825();
		}
	}
}
