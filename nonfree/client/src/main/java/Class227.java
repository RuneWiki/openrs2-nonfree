import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class227 {

	@OriginalMember(owner = "client!tr", name = "e", descriptor = "Lclient!ad;")
	private Class5 aClass5_53 = new Class5(64);

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "Lclient!dn;")
	private final Class56 aClass56_79;

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Lclient!gt;ILclient!dn;)V")
	public Class227(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class56 arg2) {
		this.aClass56_79 = arg2;
		if (this.aClass56_79 != null) {
			@Pc(20) int local20 = this.aClass56_79.method1380() - 1;
			this.aClass56_79.method1373(local20);
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IZ)V")
	public void method5295(@OriginalArg(0) int arg0) {
		@Pc(2) Class5 local2 = this.aClass5_53;
		synchronized (this.aClass5_53) {
			this.aClass5_53.method116();
			this.aClass5_53 = new Class5(arg0);
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IB)V")
	public void method5296() {
		@Pc(2) Class5 local2 = this.aClass5_53;
		synchronized (this.aClass5_53) {
			this.aClass5_53.method106(5);
		}
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(I)V")
	public void method5297() {
		@Pc(6) Class5 local6 = this.aClass5_53;
		synchronized (this.aClass5_53) {
			this.aClass5_53.method110();
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZI)Lclient!pq;")
	public Class187 method5299(@OriginalArg(1) int arg0) {
		@Pc(6) Class5 local6 = this.aClass5_53;
		@Pc(16) Class187 local16;
		synchronized (this.aClass5_53) {
			local16 = (Class187) this.aClass5_53.method104((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(43) byte[] local43 = this.aClass56_79.method1384(Static330.method4797(arg0), Static241.method3753(arg0));
		local16 = new Class187();
		if (local43 != null) {
			local16.method4573(new Class3_Sub2(local43));
		}
		@Pc(59) Class5 local59 = this.aClass5_53;
		synchronized (this.aClass5_53) {
			this.aClass5_53.method114((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Z)V")
	public void method5300() {
		@Pc(6) Class5 local6 = this.aClass5_53;
		synchronized (this.aClass5_53) {
			this.aClass5_53.method116();
		}
	}
}
