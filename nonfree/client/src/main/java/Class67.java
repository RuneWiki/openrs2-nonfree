import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class67 {

	@OriginalMember(owner = "client!eo", name = "m", descriptor = "Lclient!co;")
	private final Class41 aClass41_20 = new Class41(64);

	@OriginalMember(owner = "client!eo", name = "n", descriptor = "Lclient!co;")
	public final Class41 aClass41_21 = new Class41(2);

	@OriginalMember(owner = "client!eo", name = "f", descriptor = "Lclient!g;")
	public final Class83 aClass83_39;

	@OriginalMember(owner = "client!eo", name = "h", descriptor = "Lclient!g;")
	private final Class83 aClass83_40;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lclient!ci;ILclient!g;Lclient!g;)V")
	public Class67(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class83 arg2, @OriginalArg(3) Class83 arg3) {
		this.aClass83_39 = arg3;
		this.aClass83_40 = arg2;
		this.aClass83_40.method1955(33);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)V")
	public void method1490() {
		@Pc(2) Class41 local2 = this.aClass41_20;
		synchronized (this.aClass41_20) {
			this.aClass41_20.method829();
		}
		local2 = this.aClass41_21;
		synchronized (this.aClass41_21) {
			this.aClass41_21.method829();
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(BI)V")
	public void method1491() {
		@Pc(12) Class41 local12 = this.aClass41_20;
		synchronized (this.aClass41_20) {
			this.aClass41_20.method826(5);
		}
		local12 = this.aClass41_21;
		synchronized (this.aClass41_21) {
			this.aClass41_21.method826(5);
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IZ)Lclient!fd;")
	public Class74 method1494(@OriginalArg(0) int arg0) {
		@Pc(11) Class41 local11 = this.aClass41_20;
		@Pc(21) Class74 local21;
		synchronized (this.aClass41_20) {
			local21 = (Class74) this.aClass41_20.method823((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(38) byte[] local38 = this.aClass83_40.method1968(arg0, 33);
		local21 = new Class74();
		local21.aClass67_1 = this;
		if (local38 != null) {
			local21.method1641(new Class2_Sub24(local38));
		}
		@Pc(57) Class41 local57 = this.aClass41_20;
		synchronized (this.aClass41_20) {
			this.aClass41_20.method832((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)V")
	public void method1495() {
		@Pc(6) Class41 local6 = this.aClass41_20;
		synchronized (this.aClass41_20) {
			this.aClass41_20.method825();
		}
		local6 = this.aClass41_21;
		synchronized (this.aClass41_21) {
			this.aClass41_21.method825();
		}
	}
}
