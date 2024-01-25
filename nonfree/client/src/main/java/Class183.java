import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class183 {

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "Lclient!ku;")
	private final Class139 aClass139_55 = new Class139(64);

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "Lclient!b;")
	private final Class20 aClass20_60;

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
	public final int anInt4736;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lclient!ea;ILclient!b;)V")
	public Class183(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2) {
		this.aClass20_60 = arg2;
		if (this.aClass20_60 == null) {
			this.anInt4736 = 0;
		} else {
			this.anInt4736 = this.aClass20_60.method231(16);
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)Lclient!te;")
	public Class221 method4256(@OriginalArg(1) int arg0) {
		@Pc(6) Class139 local6 = this.aClass139_55;
		@Pc(16) Class221 local16;
		synchronized (this.aClass139_55) {
			local16 = (Class221) this.aClass139_55.method3076((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass20_60.method253(arg0, 16);
		local16 = new Class221();
		if (local33 != null) {
			local16.method5025(new Class3_Sub5(local33));
		}
		@Pc(57) Class139 local57 = this.aClass139_55;
		synchronized (this.aClass139_55) {
			this.aClass139_55.method3070(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
	public void method4257() {
		@Pc(2) Class139 local2 = this.aClass139_55;
		synchronized (this.aClass139_55) {
			this.aClass139_55.method3075();
		}
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(B)V")
	public void method4261() {
		@Pc(6) Class139 local6 = this.aClass139_55;
		synchronized (this.aClass139_55) {
			this.aClass139_55.method3072();
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZI)V")
	public void method4262() {
		@Pc(6) Class139 local6 = this.aClass139_55;
		synchronized (this.aClass139_55) {
			this.aClass139_55.method3083(5);
		}
	}
}
