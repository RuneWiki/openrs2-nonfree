import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ep")
public final class Class69 {

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "Lclient!ad;")
	private final Class5 aClass5_18 = new Class5(64);

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "Lclient!dn;")
	private final Class56 aClass56_25;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lclient!gt;ILclient!dn;)V")
	public Class69(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class56 arg2) {
		this.aClass56_25 = arg2;
		if (this.aClass56_25 != null) {
			this.aClass56_25.method1373(11);
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)V")
	public void method1737() {
		@Pc(8) Class5 local8 = this.aClass5_18;
		synchronized (this.aClass5_18) {
			this.aClass5_18.method116();
		}
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(B)V")
	public void method1738() {
		@Pc(8) Class5 local8 = this.aClass5_18;
		synchronized (this.aClass5_18) {
			this.aClass5_18.method110();
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IB)V")
	public void method1739() {
		@Pc(2) Class5 local2 = this.aClass5_18;
		synchronized (this.aClass5_18) {
			this.aClass5_18.method106(5);
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(II)Lclient!ui;")
	public Class235 method1740(@OriginalArg(1) int arg0) {
		@Pc(6) Class5 local6 = this.aClass5_18;
		@Pc(16) Class235 local16;
		synchronized (this.aClass5_18) {
			local16 = (Class235) this.aClass5_18.method104((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass56_25.method1384(11, arg0);
		local16 = new Class235();
		if (local33 != null) {
			local16.method5457(new Class3_Sub2(local33));
		}
		@Pc(49) Class5 local49 = this.aClass5_18;
		synchronized (this.aClass5_18) {
			this.aClass5_18.method114((long) arg0, local16);
			return local16;
		}
	}
}
