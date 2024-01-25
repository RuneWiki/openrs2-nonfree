import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class170 {

	@OriginalMember(owner = "client!np", name = "g", descriptor = "Lclient!ff;")
	private Class83 aClass83_40 = new Class83(64);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "Lclient!vh;")
	private final Class250 aClass250_58;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lclient!lf;ILclient!vh;)V")
	public Class170(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2) {
		this.aClass250_58 = arg2;
		if (this.aClass250_58 != null) {
			@Pc(20) int local20 = this.aClass250_58.method5666() - 1;
			this.aClass250_58.method5653(local20);
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(II)V")
	public void method3949(@OriginalArg(0) int arg0) {
		@Pc(2) Class83 local2 = this.aClass83_40;
		synchronized (this.aClass83_40) {
			this.aClass83_40.method1669();
			this.aClass83_40 = new Class83(arg0);
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V")
	public void method3950() {
		@Pc(2) Class83 local2 = this.aClass83_40;
		synchronized (this.aClass83_40) {
			this.aClass83_40.method1667();
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(BI)V")
	public void method3951() {
		@Pc(2) Class83 local2 = this.aClass83_40;
		synchronized (this.aClass83_40) {
			this.aClass83_40.method1663(5);
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IB)Lclient!fe;")
	public Class82 method3952(@OriginalArg(0) int arg0) {
		@Pc(6) Class83 local6 = this.aClass83_40;
		@Pc(16) Class82 local16;
		synchronized (this.aClass83_40) {
			local16 = (Class82) this.aClass83_40.method1658((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(42) byte[] local42 = this.aClass250_58.method5667(Static22.method3261(arg0), Static321.method4523(arg0));
		local16 = new Class82();
		if (local42 != null) {
			local16.method1655(new Class1_Sub1(local42));
		}
		@Pc(58) Class83 local58 = this.aClass83_40;
		synchronized (this.aClass83_40) {
			this.aClass83_40.method1675((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(I)V")
	public void method3954() {
		@Pc(11) Class83 local11 = this.aClass83_40;
		synchronized (this.aClass83_40) {
			this.aClass83_40.method1669();
		}
	}
}
