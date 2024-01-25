import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class242 {

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "Lclient!bh;")
	private final Class32 aClass32_63 = new Class32(128);

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "Lclient!wu;")
	private final Class380 aClass380_95;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!wj;ILclient!wu;)V")
	public Class242(@OriginalArg(0) Class375 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class380 arg2) {
		this.aClass380_95 = arg2;
		this.aClass380_95.method8631(1);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)Lclient!vt;")
	public Class368 method5365(@OriginalArg(0) int arg0) {
		@Pc(6) Class32 local6 = this.aClass32_63;
		@Pc(25) Class368 local25;
		synchronized (this.aClass32_63) {
			local25 = (Class368) this.aClass32_63.method630((long) arg0);
		}
		if (local25 != null) {
			return local25;
		}
		@Pc(38) Class380 local38 = this.aClass380_95;
		@Pc(47) byte[] local47;
		synchronized (this.aClass380_95) {
			local47 = this.aClass380_95.method8620(1, arg0);
		}
		local25 = new Class368();
		if (local47 != null) {
			local25.method8230(new Class2_Sub22(local47));
		}
		local6 = this.aClass32_63;
		synchronized (this.aClass32_63) {
			this.aClass32_63.method629(local25, (long) arg0);
			return local25;
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)V")
	public void method5369() {
		@Pc(6) Class32 local6 = this.aClass32_63;
		synchronized (this.aClass32_63) {
			this.aClass32_63.method634(5);
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
	public void method5370() {
		@Pc(6) Class32 local6 = this.aClass32_63;
		synchronized (this.aClass32_63) {
			this.aClass32_63.method640();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V")
	public void method5371() {
		@Pc(12) Class32 local12 = this.aClass32_63;
		synchronized (this.aClass32_63) {
			this.aClass32_63.method632();
		}
	}
}
