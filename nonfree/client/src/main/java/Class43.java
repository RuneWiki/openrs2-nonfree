import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class43 {

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "Lclient!bh;")
	private final Class32 aClass32_11 = new Class32(64);

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "Lclient!wu;")
	private final Class380 aClass380_16;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lclient!wj;ILclient!wu;)V")
	public Class43(@OriginalArg(0) Class375 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class380 arg2) {
		this.aClass380_16 = arg2;
		this.aClass380_16.method8631(31);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
	public void method886() {
		@Pc(10) Class32 local10 = this.aClass32_11;
		synchronized (this.aClass32_11) {
			this.aClass32_11.method640();
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IZ)Lclient!qfa;")
	public Class282 method887(@OriginalArg(0) int arg0) {
		@Pc(6) Class32 local6 = this.aClass32_11;
		@Pc(16) Class282 local16;
		synchronized (this.aClass32_11) {
			local16 = (Class282) this.aClass32_11.method630((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class380 local29 = this.aClass380_16;
		@Pc(38) byte[] local38;
		synchronized (this.aClass380_16) {
			local38 = this.aClass380_16.method8620(31, arg0);
		}
		local16 = new Class282();
		if (local38 != null) {
			local16.method6250(new Class2_Sub22(local38));
		}
		@Pc(60) Class32 local60 = this.aClass32_11;
		synchronized (this.aClass32_11) {
			this.aClass32_11.method629(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BI)V")
	public void method889() {
		@Pc(6) Class32 local6 = this.aClass32_11;
		synchronized (this.aClass32_11) {
			this.aClass32_11.method634(5);
		}
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
	public void method890() {
		@Pc(6) Class32 local6 = this.aClass32_11;
		synchronized (this.aClass32_11) {
			this.aClass32_11.method632();
		}
	}
}
