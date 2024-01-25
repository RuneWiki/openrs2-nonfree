import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class88 {

	@OriginalMember(owner = "client!eo", name = "u", descriptor = "I")
	public int anInt2564;

	@OriginalMember(owner = "client!eo", name = "l", descriptor = "Z")
	public boolean aBoolean164 = false;

	@OriginalMember(owner = "client!eo", name = "n", descriptor = "Lclient!uaa;")
	private Class288 aClass288_15 = new Class288(64);

	@OriginalMember(owner = "client!eo", name = "r", descriptor = "Lclient!uaa;")
	public final Class288 aClass288_16 = new Class288(500);

	@OriginalMember(owner = "client!eo", name = "s", descriptor = "Lclient!uaa;")
	public final Class288 aClass288_17 = new Class288(30);

	@OriginalMember(owner = "client!eo", name = "t", descriptor = "Lclient!uaa;")
	public final Class288 aClass288_18 = new Class288(50);

	@OriginalMember(owner = "client!eo", name = "m", descriptor = "Lclient!gp;")
	public final Class117 aClass117_65;

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "Z")
	public boolean aBoolean163;

	@OriginalMember(owner = "client!eo", name = "j", descriptor = "Lclient!gp;")
	private final Class117 aClass117_64;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lclient!jc;IZLclient!gp;Lclient!gp;)V")
	public Class88(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class117 arg3, @OriginalArg(4) Class117 arg4) {
		this.aClass117_65 = arg4;
		this.aBoolean163 = arg2;
		this.aClass117_64 = arg3;
		if (this.aClass117_64 != null) {
			@Pc(47) int local47 = this.aClass117_64.method2972() - 1;
			this.aClass117_64.method2951(local47);
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IB)V")
	public void method2285() {
		@Pc(6) Class288 local6 = this.aClass288_15;
		synchronized (this.aClass288_15) {
			this.aClass288_15.method6735(5);
		}
		local6 = this.aClass288_16;
		synchronized (this.aClass288_16) {
			this.aClass288_16.method6735(5);
		}
		local6 = this.aClass288_17;
		synchronized (this.aClass288_17) {
			this.aClass288_17.method6735(5);
		}
		local6 = this.aClass288_18;
		synchronized (this.aClass288_18) {
			this.aClass288_18.method6735(5);
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)V")
	public void method2286(@OriginalArg(1) int arg0) {
		this.aClass288_15 = new Class288(arg0);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZB)V")
	public void method2287(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean163 != arg0) {
			this.aBoolean163 = arg0;
			this.method2290();
		}
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(IB)V")
	public void method2288(@OriginalArg(0) int arg0) {
		this.anInt2564 = arg0;
		@Pc(16) Class288 local16 = this.aClass288_16;
		synchronized (this.aClass288_16) {
			this.aClass288_16.method6744();
		}
		local16 = this.aClass288_17;
		synchronized (this.aClass288_17) {
			this.aClass288_17.method6744();
		}
		local16 = this.aClass288_18;
		synchronized (this.aClass288_18) {
			this.aClass288_18.method6744();
		}
	}

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "(B)V")
	public void method2289() {
		@Pc(6) Class288 local6 = this.aClass288_15;
		synchronized (this.aClass288_15) {
			this.aClass288_15.method6742();
		}
		local6 = this.aClass288_16;
		synchronized (this.aClass288_16) {
			this.aClass288_16.method6742();
		}
		local6 = this.aClass288_17;
		synchronized (this.aClass288_17) {
			this.aClass288_17.method6742();
		}
		local6 = this.aClass288_18;
		synchronized (this.aClass288_18) {
			this.aClass288_18.method6742();
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V")
	public void method2290() {
		@Pc(6) Class288 local6 = this.aClass288_15;
		synchronized (this.aClass288_15) {
			this.aClass288_15.method6744();
		}
		local6 = this.aClass288_16;
		synchronized (this.aClass288_16) {
			this.aClass288_16.method6744();
		}
		local6 = this.aClass288_17;
		synchronized (this.aClass288_17) {
			this.aClass288_17.method6744();
		}
		local6 = this.aClass288_18;
		synchronized (this.aClass288_18) {
			this.aClass288_18.method6744();
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(BZ)V")
	public void method2291(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean164 != arg0) {
			this.aBoolean164 = arg0;
			this.method2290();
		}
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(II)Lclient!tk;")
	public Class283 method2294(@OriginalArg(1) int arg0) {
		@Pc(6) Class288 local6 = this.aClass288_15;
		@Pc(16) Class283 local16;
		synchronized (this.aClass288_15) {
			local16 = (Class283) this.aClass288_15.method6745((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class117 local29 = this.aClass117_64;
		@Pc(44) byte[] local44;
		synchronized (this.aClass117_64) {
			local44 = this.aClass117_64.method2962(Static264.method4395(arg0), Static171.method3013(arg0));
		}
		local16 = new Class283();
		local16.anInt8190 = arg0;
		local16.aClass88_4 = this;
		if (local44 != null) {
			local16.method6606(new Class5_Sub3(local44));
		}
		local16.method6613();
		if (!this.aBoolean163 && local16.aBoolean589) {
			local16.anIntArray633 = null;
			local16.aStringArray35 = null;
		}
		if (local16.aBoolean585) {
			local16.anInt8165 = 0;
			local16.aBoolean583 = false;
		}
		@Pc(102) Class288 local102 = this.aClass288_15;
		synchronized (this.aClass288_15) {
			this.aClass288_15.method6746(local16, (long) arg0);
			return local16;
		}
	}
}
