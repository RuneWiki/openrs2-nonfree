import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class120 {

	@OriginalMember(owner = "client!je", name = "h", descriptor = "Lclient!ad;")
	private final Class5 aClass5_32 = new Class5(64);

	@OriginalMember(owner = "client!je", name = "d", descriptor = "Lclient!dn;")
	private final Class56 aClass56_47;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lclient!gt;ILclient!dn;)V")
	public Class120(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class56 arg2) {
		this.aClass56_47 = arg2;
		if (this.aClass56_47 != null) {
			this.aClass56_47.method1373(35);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)V")
	public void method3119() {
		@Pc(10) Class5 local10 = this.aClass5_32;
		synchronized (this.aClass5_32) {
			this.aClass5_32.method106(5);
		}
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(II)Lclient!da;")
	public Class44 method3120(@OriginalArg(1) int arg0) {
		@Pc(6) Class5 local6 = this.aClass5_32;
		@Pc(16) Class44 local16;
		synchronized (this.aClass5_32) {
			local16 = (Class44) this.aClass5_32.method104((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass56_47.method1384(35, arg0);
		local16 = new Class44();
		if (local33 != null) {
			local16.method1282(new Class3_Sub2(local33));
		}
		local16.method1280();
		@Pc(58) Class5 local58 = this.aClass5_32;
		synchronized (this.aClass5_32) {
			this.aClass5_32.method114((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	public void method3121() {
		@Pc(12) Class5 local12 = this.aClass5_32;
		synchronized (this.aClass5_32) {
			this.aClass5_32.method110();
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V")
	public void method3122() {
		@Pc(14) Class5 local14 = this.aClass5_32;
		synchronized (this.aClass5_32) {
			this.aClass5_32.method116();
		}
	}
}
