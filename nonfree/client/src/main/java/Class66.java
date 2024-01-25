import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dda")
public final class Class66 {

	@OriginalMember(owner = "client!dda", name = "d", descriptor = "Lclient!bh;")
	private final Class32 aClass32_16 = new Class32(64);

	@OriginalMember(owner = "client!dda", name = "k", descriptor = "Lclient!wu;")
	private final Class380 aClass380_28;

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lclient!wj;ILclient!wu;)V")
	public Class66(@OriginalArg(0) Class375 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class380 arg2) {
		this.aClass380_28 = arg2;
		if (this.aClass380_28 != null) {
			this.aClass380_28.method8631(11);
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)V")
	public void method1433() {
		@Pc(11) Class32 local11 = this.aClass32_16;
		synchronized (this.aClass32_16) {
			this.aClass32_16.method640();
		}
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(II)V")
	public void method1435() {
		@Pc(11) Class32 local11 = this.aClass32_16;
		synchronized (this.aClass32_16) {
			this.aClass32_16.method634(5);
		}
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(I)V")
	public void method1436() {
		@Pc(10) Class32 local10 = this.aClass32_16;
		synchronized (this.aClass32_16) {
			this.aClass32_16.method632();
		}
	}

	@OriginalMember(owner = "client!dda", name = "c", descriptor = "(II)Lclient!np;")
	public Class238 method1439(@OriginalArg(1) int arg0) {
		@Pc(6) Class32 local6 = this.aClass32_16;
		@Pc(18) Class238 local18;
		synchronized (this.aClass32_16) {
			local18 = (Class238) this.aClass32_16.method630((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(36) Class380 local36 = this.aClass380_28;
		@Pc(45) byte[] local45;
		synchronized (this.aClass380_28) {
			local45 = this.aClass380_28.method8620(11, arg0);
		}
		local18 = new Class238();
		if (local45 != null) {
			local18.method5152(new Class2_Sub22(local45));
		}
		@Pc(67) Class32 local67 = this.aClass32_16;
		synchronized (this.aClass32_16) {
			this.aClass32_16.method629(local18, (long) arg0);
			return local18;
		}
	}
}
