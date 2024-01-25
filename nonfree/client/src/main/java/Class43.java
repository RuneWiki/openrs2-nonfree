import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class43 {

	@OriginalMember(owner = "client!cn", name = "g", descriptor = "Lclient!ku;")
	private final Class139 aClass139_6 = new Class139(64);

	@OriginalMember(owner = "client!cn", name = "l", descriptor = "Lclient!ku;")
	private final Class139 aClass139_7 = new Class139(100);

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "Lclient!b;")
	private final Class20 aClass20_17;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lclient!ea;ILclient!b;Lclient!b;Lclient!b;)V")
	public Class43(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2, @OriginalArg(3) Class20 arg3, @OriginalArg(4) Class20 arg4) {
		this.aClass20_17 = arg2;
		if (this.aClass20_17 != null) {
			@Pc(26) int local26 = this.aClass20_17.method229() - 1;
			this.aClass20_17.method231(local26);
		}
		Static361.method5395(arg4, arg3);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)Lclient!ok;")
	public Class177 method930(@OriginalArg(0) int arg0) {
		@Pc(6) Class139 local6 = this.aClass139_6;
		@Pc(16) Class177 local16;
		synchronized (this.aClass139_6) {
			local16 = (Class177) this.aClass139_6.method3076((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass20_17.method253(Static313.method5206(arg0), Static54.method990(arg0));
		local16 = new Class177();
		local16.anInt4515 = arg0;
		local16.aClass43_3 = this;
		if (local37 != null) {
			local16.method4085(new Class3_Sub5(local37));
		}
		local16.method4082();
		@Pc(64) Class139 local64 = this.aClass139_6;
		synchronized (this.aClass139_6) {
			this.aClass139_6.method3070(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(II)Lclient!vo;")
	public Class3_Sub7_Sub15 method931(@OriginalArg(1) int arg0) {
		@Pc(14) Class139 local14 = this.aClass139_7;
		@Pc(24) Class3_Sub7_Sub15 local24;
		synchronized (this.aClass139_7) {
			local24 = (Class3_Sub7_Sub15) this.aClass139_7.method3076((long) arg0);
			if (local24 == null) {
				local24 = new Class3_Sub7_Sub15(arg0);
				this.aClass139_7.method3070(local24, (long) arg0);
			}
		}
		synchronized (local24) {
			return local24.method5585() ? local24 : null;
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
	public void method933() {
		@Pc(6) Class139 local6 = this.aClass139_6;
		synchronized (this.aClass139_6) {
			this.aClass139_6.method3075();
		}
		local6 = this.aClass139_7;
		synchronized (this.aClass139_7) {
			this.aClass139_7.method3075();
		}
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)V")
	public void method934() {
		@Pc(2) Class139 local2 = this.aClass139_6;
		synchronized (this.aClass139_6) {
			this.aClass139_6.method3072();
		}
		local2 = this.aClass139_7;
		synchronized (this.aClass139_7) {
			this.aClass139_7.method3072();
		}
	}

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "(II)V")
	public void method935() {
		@Pc(6) Class139 local6 = this.aClass139_6;
		synchronized (this.aClass139_6) {
			this.aClass139_6.method3083(5);
		}
		local6 = this.aClass139_7;
		synchronized (this.aClass139_7) {
			this.aClass139_7.method3083(5);
		}
	}
}
