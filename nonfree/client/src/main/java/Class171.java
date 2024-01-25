import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nv")
public final class Class171 {

	@OriginalMember(owner = "client!nv", name = "i", descriptor = "Lclient!jv;")
	private Class126 aClass126_36 = new Class126(128);

	@OriginalMember(owner = "client!nv", name = "m", descriptor = "Lclient!jv;")
	public Class126 aClass126_37 = new Class126(64);

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "Lclient!bu;")
	public final Class32 aClass32_64;

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "Lclient!bu;")
	private final Class32 aClass32_63;

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Lclient!oq;ILclient!bu;Lclient!bu;)V")
	public Class171(@OriginalArg(0) Class183 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32 arg2, @OriginalArg(3) Class32 arg3) {
		this.aClass32_64 = arg3;
		this.aClass32_63 = arg2;
		this.aClass32_63.method790(36);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)V")
	public void method3938() {
		@Pc(2) Class126 local2 = this.aClass126_36;
		synchronized (this.aClass126_36) {
			this.aClass126_36.method3135();
		}
		local2 = this.aClass126_37;
		synchronized (this.aClass126_37) {
			this.aClass126_37.method3135();
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(BI)Lclient!gj;")
	public Class90 method3940(@OriginalArg(1) int arg0) {
		@Pc(6) Class126 local6 = this.aClass126_36;
		@Pc(16) Class90 local16;
		synchronized (this.aClass126_36) {
			local16 = (Class90) this.aClass126_36.method3141((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) byte[] local35 = this.aClass32_63.method785(arg0, 36);
		local16 = new Class90();
		local16.anInt2713 = arg0;
		local16.aClass171_1 = this;
		if (local35 != null) {
			local16.method2039(new Class3_Sub7(local35));
		}
		local16.method2037();
		@Pc(66) Class126 local66 = this.aClass126_36;
		synchronized (this.aClass126_36) {
			this.aClass126_36.method3132((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(BII)V")
	public void method3941(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass126_36 = new Class126(arg1);
		this.aClass126_37 = new Class126(arg0);
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(B)V")
	public void method3943() {
		@Pc(2) Class126 local2 = this.aClass126_36;
		synchronized (this.aClass126_36) {
			this.aClass126_36.method3131();
		}
		local2 = this.aClass126_37;
		synchronized (this.aClass126_37) {
			this.aClass126_37.method3131();
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IB)V")
	public void method3944() {
		@Pc(14) Class126 local14 = this.aClass126_36;
		synchronized (this.aClass126_36) {
			this.aClass126_36.method3140(5);
		}
		local14 = this.aClass126_37;
		synchronized (this.aClass126_37) {
			this.aClass126_37.method3140(5);
		}
	}
}
