import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oda")
public final class Class237 {

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "Lclient!jr;")
	private Class169 aClass169_40 = new Class169(64);

	@OriginalMember(owner = "client!oda", name = "n", descriptor = "Lclient!jr;")
	public Class169 aClass169_41 = new Class169(64);

	@OriginalMember(owner = "client!oda", name = "c", descriptor = "Lclient!in;")
	public final Class157 aClass157_200;

	@OriginalMember(owner = "client!oda", name = "i", descriptor = "Lclient!in;")
	private final Class157 aClass157_201;

	@OriginalMember(owner = "client!oda", name = "<init>", descriptor = "(Lclient!sj;ILclient!in;Lclient!in;)V")
	public Class237(@OriginalArg(0) Class316 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class157 arg2, @OriginalArg(3) Class157 arg3) {
		this.aClass157_200 = arg3;
		this.aClass157_201 = arg2;
		this.aClass157_201.method4561(34);
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(BI)Lclient!rw;")
	public Class306 method6466(@OriginalArg(1) int arg0) {
		@Pc(6) Class169 local6 = this.aClass169_40;
		@Pc(16) Class306 local16;
		synchronized (this.aClass169_40) {
			local16 = (Class306) this.aClass169_40.method5002((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class157 local29 = this.aClass157_201;
		@Pc(40) byte[] local40;
		synchronized (this.aClass157_201) {
			local40 = this.aClass157_201.method4564(34, arg0);
		}
		local16 = new Class306();
		local16.aClass237_4 = this;
		if (local40 != null) {
			local16.method7746(new Class2_Sub11(local40));
		}
		@Pc(70) Class169 local70 = this.aClass169_40;
		synchronized (this.aClass169_40) {
			this.aClass169_40.method5001(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(B)V")
	public void method6467() {
		@Pc(2) Class169 local2 = this.aClass169_40;
		synchronized (this.aClass169_40) {
			this.aClass169_40.method5006();
		}
		local2 = this.aClass169_41;
		synchronized (this.aClass169_41) {
			this.aClass169_41.method5006();
		}
	}

	@OriginalMember(owner = "client!oda", name = "b", descriptor = "(B)V")
	public void method6468() {
		@Pc(2) Class169 local2 = this.aClass169_40;
		synchronized (this.aClass169_40) {
			this.aClass169_40.method5009();
		}
		local2 = this.aClass169_41;
		synchronized (this.aClass169_41) {
			this.aClass169_41.method5009();
		}
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(IB)V")
	public void method6469() {
		@Pc(7) Class169 local7 = this.aClass169_40;
		synchronized (this.aClass169_40) {
			this.aClass169_40.method4997(5);
		}
		local7 = this.aClass169_41;
		synchronized (this.aClass169_41) {
			this.aClass169_41.method4997(5);
		}
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(III)V")
	public void method6471(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass169_40 = new Class169(arg1);
		this.aClass169_41 = new Class169(arg0);
	}
}
