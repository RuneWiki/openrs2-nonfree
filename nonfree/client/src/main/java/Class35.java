import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class35 {

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "Lclient!of;")
	private final Class188 aClass188_4 = new Class188(16);

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "Lclient!mn;")
	private final Class171 aClass171_7;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lclient!pr;ILclient!mn;)V")
	public Class35(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_7 = arg2;
		this.aClass171_7.method3662(30);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
	public void method651() {
		@Pc(6) Class188 local6 = this.aClass188_4;
		synchronized (this.aClass188_4) {
			this.aClass188_4.method4154();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)Lclient!fj;")
	public Class79 method652(@OriginalArg(0) int arg0) {
		@Pc(12) Class188 local12 = this.aClass188_4;
		@Pc(22) Class79 local22;
		synchronized (this.aClass188_4) {
			local22 = (Class79) this.aClass188_4.method4158((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class171 local35 = this.aClass171_7;
		@Pc(44) byte[] local44;
		synchronized (this.aClass171_7) {
			local44 = this.aClass171_7.method3658(30, arg0);
		}
		local22 = new Class79();
		if (local44 != null) {
			local22.method1867(new Class2_Sub17(local44));
		}
		@Pc(66) Class188 local66 = this.aClass188_4;
		synchronized (this.aClass188_4) {
			this.aClass188_4.method4155((long) arg0, local22);
			return local22;
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)V")
	public void method653() {
		@Pc(2) Class188 local2 = this.aClass188_4;
		synchronized (this.aClass188_4) {
			this.aClass188_4.method4156();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)V")
	public void method655() {
		@Pc(6) Class188 local6 = this.aClass188_4;
		synchronized (this.aClass188_4) {
			this.aClass188_4.method4169(5);
		}
	}
}
