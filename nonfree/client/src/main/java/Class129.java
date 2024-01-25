import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jt")
public final class Class129 {

	@OriginalMember(owner = "client!jt", name = "d", descriptor = "Lclient!ng;")
	private final Class167 aClass167_53 = new Class167(64);

	@OriginalMember(owner = "client!jt", name = "g", descriptor = "Lclient!ic;")
	private final Class113 aClass113_65;

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "Lclient!ic;")
	public final Class113 aClass113_63;

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Lclient!ai;ILclient!ic;Lclient!ic;)V")
	public Class129(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class113 arg2, @OriginalArg(3) Class113 arg3) {
		this.aClass113_65 = arg2;
		this.aClass113_63 = arg3;
		this.aClass113_65.method2271(3);
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IZ)Lclient!eq;")
	public Class70 method2712(@OriginalArg(0) int arg0) {
		@Pc(6) Class167 local6 = this.aClass167_53;
		@Pc(16) Class70 local16;
		synchronized (this.aClass167_53) {
			local16 = (Class70) this.aClass167_53.method3386((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass113_65.method2274(3, arg0);
		local16 = new Class70();
		local16.aClass129_1 = this;
		if (local33 != null) {
			local16.method1440(new Class1_Sub11(local33));
		}
		@Pc(52) Class167 local52 = this.aClass167_53;
		synchronized (this.aClass167_53) {
			this.aClass167_53.method3392(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(B)V")
	public void method2713() {
		@Pc(2) Class167 local2 = this.aClass167_53;
		synchronized (this.aClass167_53) {
			this.aClass167_53.method3389();
		}
	}

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(IZ)V")
	public void method2714() {
		@Pc(11) Class167 local11 = this.aClass167_53;
		synchronized (this.aClass167_53) {
			this.aClass167_53.method3384(5);
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)V")
	public void method2716() {
		@Pc(2) Class167 local2 = this.aClass167_53;
		synchronized (this.aClass167_53) {
			this.aClass167_53.method3390();
		}
	}
}
