import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oha")
public final class Class245 {

	@OriginalMember(owner = "client!oha", name = "d", descriptor = "Lclient!jr;")
	private final Class169 aClass169_42 = new Class169(64);

	@OriginalMember(owner = "client!oha", name = "h", descriptor = "Lclient!in;")
	public final Class157 aClass157_203;

	@OriginalMember(owner = "client!oha", name = "b", descriptor = "Lclient!in;")
	private final Class157 aClass157_202;

	@OriginalMember(owner = "client!oha", name = "<init>", descriptor = "(Lclient!sj;ILclient!in;Lclient!in;)V")
	public Class245(@OriginalArg(0) Class316 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class157 arg2, @OriginalArg(3) Class157 arg3) {
		this.aClass157_203 = arg3;
		this.aClass157_202 = arg2;
		this.aClass157_202.method4561(3);
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(BI)Lclient!ic;")
	public Class146 method6498(@OriginalArg(1) int arg0) {
		@Pc(12) Class169 local12 = this.aClass169_42;
		@Pc(22) Class146 local22;
		synchronized (this.aClass169_42) {
			local22 = (Class146) this.aClass169_42.method5002((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class157 local35 = this.aClass157_202;
		@Pc(46) byte[] local46;
		synchronized (this.aClass157_202) {
			local46 = this.aClass157_202.method4564(3, arg0);
		}
		local22 = new Class146();
		local22.aClass245_1 = this;
		if (local46 != null) {
			local22.method4413(new Class2_Sub11(local46));
		}
		@Pc(73) Class169 local73 = this.aClass169_42;
		synchronized (this.aClass169_42) {
			this.aClass169_42.method5001(local22, (long) arg0);
			return local22;
		}
	}

	@OriginalMember(owner = "client!oha", name = "b", descriptor = "(I)V")
	public void method6499() {
		@Pc(2) Class169 local2 = this.aClass169_42;
		synchronized (this.aClass169_42) {
			this.aClass169_42.method5006();
		}
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(B)V")
	public void method6501() {
		@Pc(12) Class169 local12 = this.aClass169_42;
		synchronized (this.aClass169_42) {
			this.aClass169_42.method5009();
		}
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(II)V")
	public void method6502() {
		@Pc(10) Class169 local10 = this.aClass169_42;
		synchronized (this.aClass169_42) {
			this.aClass169_42.method4997(5);
		}
	}
}
