import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class207 {

	@OriginalMember(owner = "client!lg", name = "n", descriptor = "Lclient!bh;")
	private Class32 aClass32_51 = new Class32(64);

	@OriginalMember(owner = "client!lg", name = "o", descriptor = "Lclient!bh;")
	public Class32 aClass32_52 = new Class32(64);

	@OriginalMember(owner = "client!lg", name = "g", descriptor = "Lclient!wu;")
	public final Class380 aClass380_77;

	@OriginalMember(owner = "client!lg", name = "i", descriptor = "Lclient!wu;")
	private final Class380 aClass380_78;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lclient!wj;ILclient!wu;Lclient!wu;)V")
	public Class207(@OriginalArg(0) Class375 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class380 arg2, @OriginalArg(3) Class380 arg3) {
		this.aClass380_77 = arg3;
		this.aClass380_78 = arg2;
		this.aClass380_78.method8631(34);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
	public void method4279() {
		@Pc(2) Class32 local2 = this.aClass32_51;
		synchronized (this.aClass32_51) {
			this.aClass32_51.method640();
		}
		local2 = this.aClass32_52;
		synchronized (this.aClass32_52) {
			this.aClass32_52.method640();
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(BI)V")
	public void method4281() {
		@Pc(10) Class32 local10 = this.aClass32_51;
		synchronized (this.aClass32_51) {
			this.aClass32_51.method634(5);
		}
		local10 = this.aClass32_52;
		synchronized (this.aClass32_52) {
			this.aClass32_52.method634(5);
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IBI)V")
	public void method4283(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass32_51 = new Class32(arg0);
		this.aClass32_52 = new Class32(arg1);
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V")
	public void method4284() {
		@Pc(9) Class32 local9 = this.aClass32_51;
		synchronized (this.aClass32_51) {
			this.aClass32_51.method632();
		}
		local9 = this.aClass32_52;
		synchronized (this.aClass32_52) {
			this.aClass32_52.method632();
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)Lclient!pq;")
	public Class273 method4286(@OriginalArg(1) int arg0) {
		@Pc(6) Class32 local6 = this.aClass32_51;
		@Pc(16) Class273 local16;
		synchronized (this.aClass32_51) {
			local16 = (Class273) this.aClass32_51.method630((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class380 local29 = this.aClass380_78;
		@Pc(38) byte[] local38;
		synchronized (this.aClass380_78) {
			local38 = this.aClass380_78.method8620(34, arg0);
		}
		local16 = new Class273();
		local16.aClass207_4 = this;
		if (local38 != null) {
			local16.method6029(new Class2_Sub22(local38));
		}
		@Pc(70) Class32 local70 = this.aClass32_51;
		synchronized (this.aClass32_51) {
			this.aClass32_51.method629(local16, (long) arg0);
			return local16;
		}
	}
}
