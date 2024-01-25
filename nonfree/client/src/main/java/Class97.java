import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public final class Class97 {

	@OriginalMember(owner = "client!gu", name = "j", descriptor = "Lclient!ku;")
	private final Class139 aClass139_29 = new Class139(64);

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "Lclient!b;")
	private final Class20 aClass20_36;

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lclient!ea;ILclient!b;)V")
	public Class97(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2) {
		this.aClass20_36 = arg2;
		this.aClass20_36.method231(31);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)V")
	public void method2011() {
		@Pc(6) Class139 local6 = this.aClass139_29;
		synchronized (this.aClass139_29) {
			this.aClass139_29.method3083(5);
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IB)Lclient!ap;")
	public Class15 method2012(@OriginalArg(0) int arg0) {
		@Pc(6) Class139 local6 = this.aClass139_29;
		@Pc(16) Class15 local16;
		synchronized (this.aClass139_29) {
			local16 = (Class15) this.aClass139_29.method3076((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass20_36.method253(arg0, 31);
		local16 = new Class15();
		if (local33 != null) {
			local16.method203(new Class3_Sub5(local33));
		}
		@Pc(49) Class139 local49 = this.aClass139_29;
		synchronized (this.aClass139_29) {
			this.aClass139_29.method3070(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)V")
	public void method2013() {
		@Pc(11) Class139 local11 = this.aClass139_29;
		synchronized (this.aClass139_29) {
			this.aClass139_29.method3072();
		}
	}

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "(I)V")
	public void method2015() {
		@Pc(6) Class139 local6 = this.aClass139_29;
		synchronized (this.aClass139_29) {
			this.aClass139_29.method3075();
		}
	}
}
