import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class26 {

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "Lclient!ku;")
	private final Class139 aClass139_5 = new Class139(64);

	@OriginalMember(owner = "client!bh", name = "k", descriptor = "Lclient!b;")
	private final Class20 aClass20_11;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lclient!ea;ILclient!b;)V")
	public Class26(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2) {
		this.aClass20_11 = arg2;
		if (this.aClass20_11 != null) {
			this.aClass20_11.method231(35);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)Lclient!vl;")
	public Class238 method330(@OriginalArg(0) int arg0) {
		@Pc(11) Class139 local11 = this.aClass139_5;
		@Pc(21) Class238 local21;
		synchronized (this.aClass139_5) {
			local21 = (Class238) this.aClass139_5.method3076((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(40) byte[] local40 = this.aClass20_11.method253(arg0, 35);
		local21 = new Class238();
		if (local40 != null) {
			local21.method5536(new Class3_Sub5(local40));
		}
		local21.method5532();
		@Pc(61) Class139 local61 = this.aClass139_5;
		synchronized (this.aClass139_5) {
			this.aClass139_5.method3070(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
	public void method333() {
		@Pc(6) Class139 local6 = this.aClass139_5;
		synchronized (this.aClass139_5) {
			this.aClass139_5.method3075();
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IB)V")
	public void method334() {
		@Pc(2) Class139 local2 = this.aClass139_5;
		synchronized (this.aClass139_5) {
			this.aClass139_5.method3083(5);
		}
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)V")
	public void method335() {
		@Pc(2) Class139 local2 = this.aClass139_5;
		synchronized (this.aClass139_5) {
			this.aClass139_5.method3072();
		}
	}
}
