import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class104 {

	@OriginalMember(owner = "client!hl", name = "s", descriptor = "I")
	public int anInt3147;

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "Z")
	public boolean aBoolean199 = false;

	@OriginalMember(owner = "client!hl", name = "l", descriptor = "Lclient!dc;")
	private Class44 aClass44_17 = new Class44(64);

	@OriginalMember(owner = "client!hl", name = "n", descriptor = "Lclient!dc;")
	public final Class44 aClass44_18 = new Class44(500);

	@OriginalMember(owner = "client!hl", name = "p", descriptor = "Lclient!dc;")
	public final Class44 aClass44_19 = new Class44(30);

	@OriginalMember(owner = "client!hl", name = "r", descriptor = "Lclient!dc;")
	public final Class44 aClass44_20 = new Class44(50);

	@OriginalMember(owner = "client!hl", name = "j", descriptor = "Lclient!he;")
	private final Class100 aClass100_27;

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "Z")
	public boolean aBoolean200;

	@OriginalMember(owner = "client!hl", name = "h", descriptor = "Lclient!he;")
	public final Class100 aClass100_26;

	static {
		new Class267(null, "der Spieler ist momentan nicht verfügbar.", null, null);
	}

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lclient!ci;IZLclient!he;Lclient!he;)V")
	public Class104(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class100 arg3, @OriginalArg(4) Class100 arg4) {
		this.aClass100_27 = arg3;
		this.aBoolean200 = arg2;
		this.aClass100_26 = arg4;
		if (this.aClass100_27 != null) {
			@Pc(47) int local47 = this.aClass100_27.method2516() - 1;
			this.aClass100_27.method2523(local47);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
	public void method2613() {
		@Pc(2) Class44 local2 = this.aClass44_17;
		synchronized (this.aClass44_17) {
			this.aClass44_17.method1348();
		}
		local2 = this.aClass44_18;
		synchronized (this.aClass44_18) {
			this.aClass44_18.method1348();
		}
		local2 = this.aClass44_19;
		synchronized (this.aClass44_19) {
			this.aClass44_19.method1348();
		}
		local2 = this.aClass44_20;
		synchronized (this.aClass44_20) {
			this.aClass44_20.method1348();
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)V")
	public void method2614(@OriginalArg(1) int arg0) {
		this.aClass44_17 = new Class44(arg0);
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(II)V")
	public void method2615() {
		@Pc(2) Class44 local2 = this.aClass44_17;
		synchronized (this.aClass44_17) {
			this.aClass44_17.method1352(5);
		}
		local2 = this.aClass44_18;
		synchronized (this.aClass44_18) {
			this.aClass44_18.method1352(5);
		}
		local2 = this.aClass44_19;
		synchronized (this.aClass44_19) {
			this.aClass44_19.method1352(5);
		}
		local2 = this.aClass44_20;
		synchronized (this.aClass44_20) {
			this.aClass44_20.method1352(5);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(BI)Lclient!hn;")
	public Class106 method2616(@OriginalArg(1) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_17;
		@Pc(16) Class106 local16;
		synchronized (this.aClass44_17) {
			local16 = (Class106) this.aClass44_17.method1353((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass100_27.method2520(Static3.method70(arg0), Static103.method1841(arg0));
		local16 = new Class106();
		local16.anInt3167 = arg0;
		local16.aClass104_3 = this;
		if (local37 != null) {
			local16.method2638(new Class6_Sub1(local37));
		}
		local16.method2635();
		if (!this.aBoolean200 && local16.aBoolean205) {
			local16.anIntArray191 = null;
			local16.aStringArray17 = null;
		}
		if (local16.aBoolean201) {
			local16.anInt3186 = 0;
			local16.aBoolean209 = false;
		}
		@Pc(90) Class44 local90 = this.aClass44_17;
		synchronized (this.aClass44_17) {
			this.aClass44_17.method1349(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZ)V")
	public void method2617(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean200) {
			this.aBoolean200 = arg0;
			this.method2620();
		}
	}

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "(II)V")
	public void method2618(@OriginalArg(1) int arg0) {
		this.anInt3147 = arg0;
		@Pc(9) Class44 local9 = this.aClass44_18;
		synchronized (this.aClass44_18) {
			this.aClass44_18.method1351();
		}
		local9 = this.aClass44_19;
		synchronized (this.aClass44_19) {
			this.aClass44_19.method1351();
		}
		local9 = this.aClass44_20;
		synchronized (this.aClass44_20) {
			this.aClass44_20.method1351();
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZI)V")
	public void method2619(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean199) {
			this.aBoolean199 = arg0;
			this.method2620();
		}
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V")
	public void method2620() {
		@Pc(12) Class44 local12 = this.aClass44_17;
		synchronized (this.aClass44_17) {
			this.aClass44_17.method1351();
		}
		local12 = this.aClass44_18;
		synchronized (this.aClass44_18) {
			this.aClass44_18.method1351();
		}
		local12 = this.aClass44_19;
		synchronized (this.aClass44_19) {
			this.aClass44_19.method1351();
		}
		local12 = this.aClass44_20;
		synchronized (this.aClass44_20) {
			this.aClass44_20.method1351();
		}
	}
}
