import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class172 {

	@OriginalMember(owner = "client!om", name = "g", descriptor = "Lclient!co;")
	private final Class41 aClass41_57 = new Class41(256);

	@OriginalMember(owner = "client!om", name = "h", descriptor = "Lclient!g;")
	private final Class83 aClass83_88;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!ci;ILclient!g;)V")
	public Class172(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class83 arg2) {
		this.aClass83_88 = arg2;
		this.aClass83_88.method1955(26);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IB)V")
	public void method4330() {
		@Pc(12) Class41 local12 = this.aClass41_57;
		synchronized (this.aClass41_57) {
			this.aClass41_57.method826(5);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V")
	public void method4331() {
		@Pc(6) Class41 local6 = this.aClass41_57;
		synchronized (this.aClass41_57) {
			this.aClass41_57.method825();
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V")
	public void method4333() {
		@Pc(10) Class41 local10 = this.aClass41_57;
		synchronized (this.aClass41_57) {
			this.aClass41_57.method829();
		}
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(II)Lclient!je;")
	public Class2_Sub7_Sub9 method4335(@OriginalArg(0) int arg0) {
		@Pc(6) Class41 local6 = this.aClass41_57;
		@Pc(16) Class2_Sub7_Sub9 local16;
		synchronized (this.aClass41_57) {
			local16 = (Class2_Sub7_Sub9) this.aClass41_57.method823((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass83_88.method1968(arg0, 26);
		local16 = new Class2_Sub7_Sub9();
		if (local33 != null) {
			local16.method2834(new Class2_Sub24(local33));
		}
		@Pc(49) Class41 local49 = this.aClass41_57;
		synchronized (this.aClass41_57) {
			this.aClass41_57.method832((long) arg0, local16);
			return local16;
		}
	}
}
