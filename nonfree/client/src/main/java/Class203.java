import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class203 {

	@OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
	public int anInt5094;

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "Lclient!ku;")
	private final Class139 aClass139_61 = new Class139(64);

	@OriginalMember(owner = "client!rd", name = "n", descriptor = "Lclient!ku;")
	public final Class139 aClass139_63 = new Class139(30);

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "Lclient!b;")
	private final Class20 aClass20_71;

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "Lclient!b;")
	public final Class20 aClass20_72;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lclient!ea;ILclient!b;Lclient!b;)V")
	public Class203(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2, @OriginalArg(3) Class20 arg3) {
		this.aClass20_71 = arg2;
		this.aClass20_72 = arg3;
		@Pc(26) int local26 = this.aClass20_71.method229() - 1;
		this.aClass20_71.method231(local26);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)V")
	public void method4556(@OriginalArg(0) int arg0) {
		this.anInt5094 = arg0;
		@Pc(9) Class139 local9 = this.aClass139_63;
		synchronized (this.aClass139_63) {
			this.aClass139_63.method3075();
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)Lclient!jq;")
	public Class125 method4559(@OriginalArg(0) int arg0) {
		@Pc(6) Class139 local6 = this.aClass139_61;
		@Pc(16) Class125 local16;
		synchronized (this.aClass139_61) {
			local16 = (Class125) this.aClass139_61.method3076((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass20_71.method253(Static369.method5526(arg0), Static207.method1895(arg0));
		local16 = new Class125();
		local16.anInt3056 = arg0;
		local16.aClass203_1 = this;
		if (local37 != null) {
			local16.method2693(new Class3_Sub5(local37));
		}
		@Pc(59) Class139 local59 = this.aClass139_61;
		synchronized (this.aClass139_61) {
			this.aClass139_61.method3070(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
	public void method4561() {
		@Pc(6) Class139 local6 = this.aClass139_61;
		synchronized (this.aClass139_61) {
			this.aClass139_61.method3075();
		}
		local6 = this.aClass139_63;
		synchronized (this.aClass139_63) {
			this.aClass139_63.method3075();
		}
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(II)V")
	public void method4562() {
		@Pc(2) Class139 local2 = this.aClass139_61;
		synchronized (this.aClass139_61) {
			this.aClass139_61.method3083(5);
		}
		local2 = this.aClass139_63;
		synchronized (this.aClass139_63) {
			this.aClass139_63.method3083(5);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
	public void method4563() {
		@Pc(2) Class139 local2 = this.aClass139_61;
		synchronized (this.aClass139_61) {
			this.aClass139_61.method3072();
		}
		local2 = this.aClass139_63;
		synchronized (this.aClass139_63) {
			this.aClass139_63.method3072();
		}
	}
}
