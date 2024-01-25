import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class155 {

	@OriginalMember(owner = "client!io", name = "n", descriptor = "I")
	public int anInt3929;

	@OriginalMember(owner = "client!io", name = "g", descriptor = "Lclient!bh;")
	private final Class32 aClass32_40 = new Class32(64);

	@OriginalMember(owner = "client!io", name = "m", descriptor = "Lclient!bh;")
	public final Class32 aClass32_41 = new Class32(60);

	@OriginalMember(owner = "client!io", name = "i", descriptor = "Lclient!wu;")
	public final Class380 aClass380_59;

	@OriginalMember(owner = "client!io", name = "j", descriptor = "Lclient!wu;")
	private final Class380 aClass380_60;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lclient!wj;ILclient!wu;Lclient!wu;)V")
	public Class155(@OriginalArg(0) Class375 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class380 arg2, @OriginalArg(3) Class380 arg3) {
		this.aClass380_59 = arg3;
		this.aClass380_60 = arg2;
		@Pc(26) int local26 = this.aClass380_60.method8639() - 1;
		this.aClass380_60.method8631(local26);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
	public void method3357() {
		@Pc(6) Class32 local6 = this.aClass32_40;
		synchronized (this.aClass32_40) {
			this.aClass32_40.method640();
		}
		local6 = this.aClass32_41;
		synchronized (this.aClass32_41) {
			this.aClass32_41.method640();
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(II)V")
	public void method3358(@OriginalArg(1) int arg0) {
		this.anInt3929 = arg0;
		@Pc(16) Class32 local16 = this.aClass32_41;
		synchronized (this.aClass32_41) {
			this.aClass32_41.method640();
		}
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(B)V")
	public void method3360() {
		@Pc(10) Class32 local10 = this.aClass32_40;
		synchronized (this.aClass32_40) {
			this.aClass32_40.method632();
		}
		local10 = this.aClass32_41;
		synchronized (this.aClass32_41) {
			this.aClass32_41.method632();
		}
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(II)Lclient!bq;")
	public Class39 method3363(@OriginalArg(1) int arg0) {
		@Pc(11) Class32 local11 = this.aClass32_40;
		@Pc(23) Class39 local23;
		synchronized (this.aClass32_40) {
			local23 = (Class39) this.aClass32_40.method630((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(36) Class380 local36 = this.aClass380_60;
		@Pc(51) byte[] local51;
		synchronized (this.aClass380_60) {
			local51 = this.aClass380_60.method8620(Static128.method1806(arg0), Static72.method1002(arg0));
		}
		local23 = new Class39();
		local23.aClass155_1 = this;
		local23.anInt1046 = arg0;
		if (local51 != null) {
			local23.method817(new Class2_Sub22(local51));
		}
		@Pc(79) Class32 local79 = this.aClass32_40;
		synchronized (this.aClass32_40) {
			this.aClass32_40.method629(local23, (long) arg0);
			return local23;
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ZI)V")
	public void method3364() {
		@Pc(6) Class32 local6 = this.aClass32_40;
		synchronized (this.aClass32_40) {
			this.aClass32_40.method634(5);
		}
		local6 = this.aClass32_41;
		synchronized (this.aClass32_41) {
			this.aClass32_41.method634(5);
		}
	}
}
