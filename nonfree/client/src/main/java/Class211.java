import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class211 {

	@OriginalMember(owner = "client!so", name = "c", descriptor = "Lclient!ad;")
	private final Class5 aClass5_52 = new Class5(16);

	@OriginalMember(owner = "client!so", name = "b", descriptor = "Lclient!dn;")
	private final Class56 aClass56_75;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lclient!gt;ILclient!dn;)V")
	public Class211(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class56 arg2) {
		this.aClass56_75 = arg2;
		this.aClass56_75.method1373(30);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(BI)V")
	public void method5151() {
		@Pc(2) Class5 local2 = this.aClass5_52;
		synchronized (this.aClass5_52) {
			this.aClass5_52.method106(5);
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(II)Lclient!hc;")
	public Class93 method5152(@OriginalArg(1) int arg0) {
		@Pc(6) Class5 local6 = this.aClass5_52;
		@Pc(16) Class93 local16;
		synchronized (this.aClass5_52) {
			local16 = (Class93) this.aClass5_52.method104((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass56_75.method1384(30, arg0);
		local16 = new Class93();
		if (local33 != null) {
			local16.method2669(new Class3_Sub2(local33));
		}
		@Pc(51) Class5 local51 = this.aClass5_52;
		synchronized (this.aClass5_52) {
			this.aClass5_52.method114((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V")
	public void method5153() {
		@Pc(2) Class5 local2 = this.aClass5_52;
		synchronized (this.aClass5_52) {
			this.aClass5_52.method116();
		}
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(I)V")
	public void method5156() {
		@Pc(2) Class5 local2 = this.aClass5_52;
		synchronized (this.aClass5_52) {
			this.aClass5_52.method110();
		}
	}
}
