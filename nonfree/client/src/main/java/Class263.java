import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class263 {

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "Lclient!jv;")
	private final Class126 aClass126_62 = new Class126(64);

	@OriginalMember(owner = "client!wb", name = "n", descriptor = "Lclient!jv;")
	public final Class126 aClass126_63 = new Class126(2);

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "Lclient!bu;")
	private final Class32 aClass32_91;

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "Lclient!bu;")
	public final Class32 aClass32_90;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!oq;ILclient!bu;Lclient!bu;)V")
	public Class263(@OriginalArg(0) Class183 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32 arg2, @OriginalArg(3) Class32 arg3) {
		this.aClass32_91 = arg2;
		this.aClass32_90 = arg3;
		this.aClass32_91.method790(33);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IZ)Lclient!ii;")
	public Class113 method5814(@OriginalArg(0) int arg0) {
		@Pc(12) Class126 local12 = this.aClass126_62;
		@Pc(22) Class113 local22;
		synchronized (this.aClass126_62) {
			local22 = (Class113) this.aClass126_62.method3141((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(39) byte[] local39 = this.aClass32_91.method785(arg0, 33);
		local22 = new Class113();
		local22.aClass263_3 = this;
		if (local39 != null) {
			local22.method2755(new Class3_Sub7(local39));
		}
		@Pc(58) Class126 local58 = this.aClass126_62;
		synchronized (this.aClass126_62) {
			this.aClass126_62.method3132((long) arg0, local22);
			return local22;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
	public void method5815() {
		@Pc(2) Class126 local2 = this.aClass126_62;
		synchronized (this.aClass126_62) {
			this.aClass126_62.method3131();
		}
		local2 = this.aClass126_63;
		synchronized (this.aClass126_63) {
			this.aClass126_63.method3131();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V")
	public void method5817() {
		@Pc(2) Class126 local2 = this.aClass126_62;
		synchronized (this.aClass126_62) {
			this.aClass126_62.method3140(5);
		}
		local2 = this.aClass126_63;
		synchronized (this.aClass126_63) {
			this.aClass126_63.method3140(5);
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
	public void method5818() {
		@Pc(2) Class126 local2 = this.aClass126_62;
		synchronized (this.aClass126_62) {
			this.aClass126_62.method3135();
		}
		@Pc(29) Class126 local29 = this.aClass126_63;
		synchronized (this.aClass126_63) {
			this.aClass126_63.method3135();
		}
	}
}
