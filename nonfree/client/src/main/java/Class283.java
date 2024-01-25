import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class283 {

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "Lclient!bh;")
	private final Class32 aClass32_67 = new Class32(64);

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "Lclient!wu;")
	private final Class380 aClass380_105;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lclient!wj;ILclient!wu;)V")
	public Class283(@OriginalArg(0) Class375 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class380 arg2) {
		this.aClass380_105 = arg2;
		this.aClass380_105.method8631(32);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
	public void method6255() {
		@Pc(6) Class32 local6 = this.aClass32_67;
		synchronized (this.aClass32_67) {
			this.aClass32_67.method640();
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)V")
	public void method6257() {
		@Pc(2) Class32 local2 = this.aClass32_67;
		synchronized (this.aClass32_67) {
			this.aClass32_67.method634(5);
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
	public void method6259() {
		@Pc(2) Class32 local2 = this.aClass32_67;
		synchronized (this.aClass32_67) {
			this.aClass32_67.method632();
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)Lclient!tf;")
	public Class334 method6260(@OriginalArg(0) int arg0) {
		@Pc(6) Class32 local6 = this.aClass32_67;
		@Pc(16) Class334 local16;
		synchronized (this.aClass32_67) {
			local16 = (Class334) this.aClass32_67.method630((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class380 local29 = this.aClass380_105;
		@Pc(38) byte[] local38;
		synchronized (this.aClass380_105) {
			local38 = this.aClass380_105.method8620(32, arg0);
		}
		local16 = new Class334();
		if (local38 != null) {
			local16.method7496(new Class2_Sub22(local38));
		}
		@Pc(67) Class32 local67 = this.aClass32_67;
		synchronized (this.aClass32_67) {
			this.aClass32_67.method629(local16, (long) arg0);
			return local16;
		}
	}
}
