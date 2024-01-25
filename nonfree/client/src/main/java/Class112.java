import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class112 {

	@OriginalMember(owner = "client!in", name = "f", descriptor = "Lclient!ad;")
	private final Class5 aClass5_30 = new Class5(64);

	@OriginalMember(owner = "client!in", name = "i", descriptor = "Lclient!ad;")
	public final Class5 aClass5_31 = new Class5(2);

	@OriginalMember(owner = "client!in", name = "a", descriptor = "Lclient!dn;")
	private final Class56 aClass56_45;

	@OriginalMember(owner = "client!in", name = "b", descriptor = "Lclient!dn;")
	public final Class56 aClass56_46;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lclient!gt;ILclient!dn;Lclient!dn;)V")
	public Class112(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class56 arg2, @OriginalArg(3) Class56 arg3) {
		this.aClass56_45 = arg2;
		this.aClass56_46 = arg3;
		this.aClass56_45.method1373(33);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IB)V")
	public void method3000() {
		@Pc(6) Class5 local6 = this.aClass5_30;
		synchronized (this.aClass5_30) {
			this.aClass5_30.method106(5);
		}
		local6 = this.aClass5_31;
		synchronized (this.aClass5_31) {
			this.aClass5_31.method106(5);
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V")
	public void method3002() {
		@Pc(6) Class5 local6 = this.aClass5_30;
		synchronized (this.aClass5_30) {
			this.aClass5_30.method110();
		}
		local6 = this.aClass5_31;
		synchronized (this.aClass5_31) {
			this.aClass5_31.method110();
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(II)Lclient!ds;")
	public Class60 method3003(@OriginalArg(0) int arg0) {
		@Pc(6) Class5 local6 = this.aClass5_30;
		@Pc(16) Class60 local16;
		synchronized (this.aClass5_30) {
			local16 = (Class60) this.aClass5_30.method104((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass56_45.method1384(33, arg0);
		local16 = new Class60();
		local16.aClass112_1 = this;
		if (local33 != null) {
			local16.method1417(new Class3_Sub2(local33));
		}
		@Pc(52) Class5 local52 = this.aClass5_30;
		synchronized (this.aClass5_30) {
			this.aClass5_30.method114((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(B)V")
	public void method3004() {
		@Pc(2) Class5 local2 = this.aClass5_30;
		synchronized (this.aClass5_30) {
			this.aClass5_30.method116();
		}
		local2 = this.aClass5_31;
		synchronized (this.aClass5_31) {
			this.aClass5_31.method116();
		}
	}
}
