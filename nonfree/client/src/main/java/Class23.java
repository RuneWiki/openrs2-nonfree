import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!baa")
public final class Class23 {

	@OriginalMember(owner = "client!baa", name = "c", descriptor = "Lclient!bh;")
	private final Class32 aClass32_8 = new Class32(64);

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "Lclient!wu;")
	public final Class380 aClass380_11;

	@OriginalMember(owner = "client!baa", name = "e", descriptor = "Lclient!wu;")
	private final Class380 aClass380_12;

	@OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lclient!wj;ILclient!wu;Lclient!wu;)V")
	public Class23(@OriginalArg(0) Class375 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class380 arg2, @OriginalArg(3) Class380 arg3) {
		this.aClass380_11 = arg3;
		this.aClass380_12 = arg2;
		this.aClass380_12.method8631(3);
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(B)V")
	public void method547() {
		@Pc(2) Class32 local2 = this.aClass32_8;
		synchronized (this.aClass32_8) {
			this.aClass32_8.method632();
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(BI)Lclient!rha;")
	public Class300 method548(@OriginalArg(1) int arg0) {
		@Pc(6) Class32 local6 = this.aClass32_8;
		@Pc(16) Class300 local16;
		synchronized (this.aClass32_8) {
			local16 = (Class300) this.aClass32_8.method630((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class380 local29 = this.aClass380_12;
		@Pc(38) byte[] local38;
		synchronized (this.aClass380_12) {
			local38 = this.aClass380_12.method8620(3, arg0);
		}
		local16 = new Class300();
		local16.aClass23_3 = this;
		if (local38 != null) {
			local16.method6844(new Class2_Sub22(local38));
		}
		@Pc(68) Class32 local68 = this.aClass32_8;
		synchronized (this.aClass32_8) {
			this.aClass32_8.method629(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!baa", name = "b", descriptor = "(BI)V")
	public void method549() {
		@Pc(6) Class32 local6 = this.aClass32_8;
		synchronized (this.aClass32_8) {
			this.aClass32_8.method634(5);
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)V")
	public void method550() {
		@Pc(6) Class32 local6 = this.aClass32_8;
		synchronized (this.aClass32_8) {
			this.aClass32_8.method640();
		}
	}
}
