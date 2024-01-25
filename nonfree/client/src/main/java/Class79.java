import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class79 {

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "Lclient!co;")
	private final Class41 aClass41_25 = new Class41(64);

	@OriginalMember(owner = "client!fn", name = "g", descriptor = "Lclient!g;")
	private final Class83 aClass83_50;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lclient!ci;ILclient!g;)V")
	public Class79(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class83 arg2) {
		this.aClass83_50 = arg2;
		if (this.aClass83_50 != null) {
			this.aClass83_50.method1955(11);
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V")
	public void method1848() {
		@Pc(6) Class41 local6 = this.aClass41_25;
		synchronized (this.aClass41_25) {
			this.aClass41_25.method829();
		}
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(B)V")
	public void method1850() {
		@Pc(6) Class41 local6 = this.aClass41_25;
		synchronized (this.aClass41_25) {
			this.aClass41_25.method825();
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(BI)Lclient!bc;")
	public Class20 method1851(@OriginalArg(1) int arg0) {
		@Pc(6) Class41 local6 = this.aClass41_25;
		@Pc(25) Class20 local25;
		synchronized (this.aClass41_25) {
			local25 = (Class20) this.aClass41_25.method823((long) arg0);
		}
		if (local25 != null) {
			return local25;
		}
		@Pc(42) byte[] local42 = this.aClass83_50.method1968(arg0, 11);
		local25 = new Class20();
		if (local42 != null) {
			local25.method273(new Class2_Sub24(local42));
		}
		local6 = this.aClass41_25;
		synchronized (this.aClass41_25) {
			this.aClass41_25.method832((long) arg0, local25);
			return local25;
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(II)V")
	public void method1852() {
		@Pc(2) Class41 local2 = this.aClass41_25;
		synchronized (this.aClass41_25) {
			this.aClass41_25.method826(5);
		}
	}
}
