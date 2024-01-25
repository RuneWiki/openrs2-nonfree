import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public final class Class140 {

	@OriginalMember(owner = "client!gs", name = "v", descriptor = "I")
	public int anInt3267;

	@OriginalMember(owner = "client!gs", name = "d", descriptor = "Z")
	public boolean aBoolean225 = false;

	@OriginalMember(owner = "client!gs", name = "m", descriptor = "Lclient!pa;")
	private Class265 aClass265_15 = new Class265(64);

	@OriginalMember(owner = "client!gs", name = "s", descriptor = "Lclient!pa;")
	public final Class265 aClass265_17 = new Class265(500);

	@OriginalMember(owner = "client!gs", name = "t", descriptor = "Lclient!pa;")
	public final Class265 aClass265_18 = new Class265(30);

	@OriginalMember(owner = "client!gs", name = "u", descriptor = "Lclient!pa;")
	public final Class265 aClass265_19 = new Class265(50);

	@OriginalMember(owner = "client!gs", name = "p", descriptor = "Z")
	public boolean aBoolean226;

	@OriginalMember(owner = "client!gs", name = "j", descriptor = "Lclient!cb;")
	private final Class50 aClass50_53;

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "Lclient!cb;")
	public final Class50 aClass50_52;

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lclient!iv;IZLclient!cb;Lclient!cb;)V")
	public Class140(@OriginalArg(0) Class174 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class50 arg3, @OriginalArg(4) Class50 arg4) {
		this.aBoolean226 = arg2;
		this.aClass50_53 = arg3;
		this.aClass50_52 = arg4;
		if (this.aClass50_53 != null) {
			@Pc(47) int local47 = this.aClass50_53.method902() - 1;
			this.aClass50_53.method913(local47);
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)Lclient!dja;")
	public Class81 method2839(@OriginalArg(1) int arg0) {
		@Pc(14) Class265 local14 = this.aClass265_15;
		@Pc(24) Class81 local24;
		synchronized (this.aClass265_15) {
			local24 = (Class81) this.aClass265_15.method6577((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class50 local37 = this.aClass50_53;
		@Pc(50) byte[] local50;
		synchronized (this.aClass50_53) {
			local50 = this.aClass50_53.method916(Static186.method2716(arg0), Static455.method6716(arg0));
		}
		local24 = new Class81();
		local24.aClass140_1 = this;
		local24.anInt1883 = arg0;
		if (local50 != null) {
			local24.method1751(new Class5_Sub15(local50));
		}
		local24.method1746();
		if (!this.aBoolean226 && local24.aBoolean128) {
			local24.aStringArray5 = null;
			local24.anIntArray96 = null;
		}
		if (local24.aBoolean127) {
			local24.anInt1881 = 0;
			local24.aBoolean131 = false;
		}
		@Pc(102) Class265 local102 = this.aClass265_15;
		synchronized (this.aClass265_15) {
			this.aClass265_15.method6566(local24, (long) arg0);
			return local24;
		}
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(II)V")
	public void method2840(@OriginalArg(1) int arg0) {
		this.anInt3267 = arg0;
		@Pc(9) Class265 local9 = this.aClass265_17;
		synchronized (this.aClass265_17) {
			this.aClass265_17.method6568();
		}
		local9 = this.aClass265_18;
		synchronized (this.aClass265_18) {
			this.aClass265_18.method6568();
		}
		local9 = this.aClass265_19;
		synchronized (this.aClass265_19) {
			this.aClass265_19.method6568();
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(BZ)V")
	public void method2841(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean225 != arg0) {
			this.aBoolean225 = arg0;
			this.method2843();
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IZ)V")
	public void method2842(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean226 != arg0) {
			this.aBoolean226 = arg0;
			this.method2843();
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Z)V")
	public void method2843() {
		@Pc(2) Class265 local2 = this.aClass265_15;
		synchronized (this.aClass265_15) {
			this.aClass265_15.method6568();
		}
		local2 = this.aClass265_17;
		synchronized (this.aClass265_17) {
			this.aClass265_17.method6568();
		}
		local2 = this.aClass265_18;
		synchronized (this.aClass265_18) {
			this.aClass265_18.method6568();
		}
		local2 = this.aClass265_19;
		synchronized (this.aClass265_19) {
			this.aClass265_19.method6568();
		}
	}

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "(II)V")
	public void method2846(@OriginalArg(0) int arg0) {
		this.aClass265_15 = new Class265(arg0);
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)V")
	public void method2847() {
		@Pc(2) Class265 local2 = this.aClass265_15;
		synchronized (this.aClass265_15) {
			this.aClass265_15.method6573();
		}
		local2 = this.aClass265_17;
		synchronized (this.aClass265_17) {
			this.aClass265_17.method6573();
		}
		local2 = this.aClass265_18;
		synchronized (this.aClass265_18) {
			this.aClass265_18.method6573();
		}
		local2 = this.aClass265_19;
		synchronized (this.aClass265_19) {
			this.aClass265_19.method6573();
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IB)V")
	public void method2849() {
		@Pc(14) Class265 local14 = this.aClass265_15;
		synchronized (this.aClass265_15) {
			this.aClass265_15.method6570(5);
		}
		local14 = this.aClass265_17;
		synchronized (this.aClass265_17) {
			this.aClass265_17.method6570(5);
		}
		local14 = this.aClass265_18;
		synchronized (this.aClass265_18) {
			this.aClass265_18.method6570(5);
		}
		local14 = this.aClass265_19;
		synchronized (this.aClass265_19) {
			this.aClass265_19.method6570(5);
		}
	}
}
