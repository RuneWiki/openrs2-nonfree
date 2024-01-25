import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class83 {

	@OriginalMember(owner = "client!fl", name = "u", descriptor = "I")
	public int anInt2068;

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "Lclient!ku;")
	private final Class139 aClass139_22 = new Class139(64);

	@OriginalMember(owner = "client!fl", name = "s", descriptor = "Lclient!ku;")
	public final Class139 aClass139_23 = new Class139(50);

	@OriginalMember(owner = "client!fl", name = "t", descriptor = "Lclient!ku;")
	public final Class139 aClass139_24 = new Class139(5);

	@OriginalMember(owner = "client!fl", name = "o", descriptor = "Lclient!b;")
	public final Class20 aClass20_29;

	@OriginalMember(owner = "client!fl", name = "g", descriptor = "Lclient!b;")
	private final Class20 aClass20_27;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "Z")
	public boolean aBoolean155;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lclient!ea;IZLclient!b;Lclient!b;)V")
	public Class83(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class20 arg3, @OriginalArg(4) Class20 arg4) {
		this.aClass20_29 = arg4;
		this.aClass20_27 = arg3;
		this.aBoolean155 = arg2;
		if (this.aClass20_27 != null) {
			@Pc(38) int local38 = this.aClass20_27.method229() - 1;
			this.aClass20_27.method231(local38);
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IB)Lclient!dr;")
	public Class61 method1716(@OriginalArg(0) int arg0) {
		@Pc(6) Class139 local6 = this.aClass139_22;
		@Pc(16) Class61 local16;
		synchronized (this.aClass139_22) {
			local16 = (Class61) this.aClass139_22.method3076((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(44) byte[] local44 = this.aClass20_27.method253(Static255.method4132(arg0), Static127.method2043(arg0));
		local16 = new Class61();
		local16.aClass83_1 = this;
		local16.anInt1465 = arg0;
		if (local44 != null) {
			local16.method1206(new Class3_Sub5(local44));
		}
		local16.method1208();
		@Pc(69) Class139 local69 = this.aClass139_22;
		synchronized (this.aClass139_22) {
			this.aClass139_22.method3070(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)V")
	public void method1718() {
		@Pc(11) Class139 local11 = this.aClass139_22;
		synchronized (this.aClass139_22) {
			this.aClass139_22.method3072();
		}
		local11 = this.aClass139_23;
		synchronized (this.aClass139_23) {
			this.aClass139_23.method3072();
		}
		local11 = this.aClass139_24;
		synchronized (this.aClass139_24) {
			this.aClass139_24.method3072();
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V")
	public void method1719() {
		@Pc(2) Class139 local2 = this.aClass139_22;
		synchronized (this.aClass139_22) {
			this.aClass139_22.method3075();
		}
		local2 = this.aClass139_23;
		synchronized (this.aClass139_23) {
			this.aClass139_23.method3075();
		}
		local2 = this.aClass139_24;
		synchronized (this.aClass139_24) {
			this.aClass139_24.method3075();
		}
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V")
	public void method1720() {
		@Pc(6) Class139 local6 = this.aClass139_23;
		synchronized (this.aClass139_23) {
			this.aClass139_23.method3075();
		}
		local6 = this.aClass139_24;
		synchronized (this.aClass139_24) {
			this.aClass139_24.method3075();
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZ)V")
	public void method1722(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean155 != arg0) {
			this.aBoolean155 = arg0;
			this.method1719();
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)V")
	public void method1723(@OriginalArg(1) int arg0) {
		this.anInt2068 = arg0;
		@Pc(17) Class139 local17 = this.aClass139_23;
		synchronized (this.aClass139_23) {
			this.aClass139_23.method3075();
		}
		local17 = this.aClass139_24;
		synchronized (this.aClass139_24) {
			this.aClass139_24.method3075();
		}
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(II)V")
	public void method1724() {
		@Pc(6) Class139 local6 = this.aClass139_22;
		synchronized (this.aClass139_22) {
			this.aClass139_22.method3083(5);
		}
		local6 = this.aClass139_23;
		synchronized (this.aClass139_23) {
			this.aClass139_23.method3083(5);
		}
		local6 = this.aClass139_24;
		synchronized (this.aClass139_24) {
			this.aClass139_24.method3083(5);
		}
	}
}
