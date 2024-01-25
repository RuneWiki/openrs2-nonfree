import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class224 {

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "Lclient!bh;")
	private final Class32 aClass32_56 = new Class32(16);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "Lclient!wu;")
	private final Class380 aClass380_84;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lclient!wj;ILclient!wu;)V")
	public Class224(@OriginalArg(0) Class375 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class380 arg2) {
		this.aClass380_84 = arg2;
		this.aClass380_84.method8631(30);
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)V")
	public void method4712() {
		@Pc(14) Class32 local14 = this.aClass32_56;
		synchronized (this.aClass32_56) {
			this.aClass32_56.method632();
		}
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(B)V")
	public void method4714() {
		@Pc(2) Class32 local2 = this.aClass32_56;
		synchronized (this.aClass32_56) {
			this.aClass32_56.method640();
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)Lclient!jd;")
	public Class164 method4715(@OriginalArg(0) int arg0) {
		@Pc(6) Class32 local6 = this.aClass32_56;
		@Pc(16) Class164 local16;
		synchronized (this.aClass32_56) {
			local16 = (Class164) this.aClass32_56.method630((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) Class380 local33 = this.aClass380_84;
		@Pc(42) byte[] local42;
		synchronized (this.aClass380_84) {
			local42 = this.aClass380_84.method8620(30, arg0);
		}
		local16 = new Class164();
		if (local42 != null) {
			local16.method3529(new Class2_Sub22(local42));
		}
		@Pc(64) Class32 local64 = this.aClass32_56;
		synchronized (this.aClass32_56) {
			this.aClass32_56.method629(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(II)V")
	public void method4716() {
		@Pc(14) Class32 local14 = this.aClass32_56;
		synchronized (this.aClass32_56) {
			this.aClass32_56.method634(5);
		}
	}
}
