import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class155 {

	@OriginalMember(owner = "client!jd", name = "y", descriptor = "I")
	public int anInt4817;

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "Z")
	public boolean aBoolean381 = false;

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "Lclient!h;")
	private Class125 aClass125_31 = new Class125(64);

	@OriginalMember(owner = "client!jd", name = "v", descriptor = "Lclient!h;")
	public final Class125 aClass125_32 = new Class125(500);

	@OriginalMember(owner = "client!jd", name = "w", descriptor = "Lclient!h;")
	public final Class125 aClass125_33 = new Class125(30);

	@OriginalMember(owner = "client!jd", name = "x", descriptor = "Lclient!h;")
	public final Class125 aClass125_34 = new Class125(50);

	@OriginalMember(owner = "client!jd", name = "n", descriptor = "Lclient!an;")
	public final Class16 aClass16_61;

	@OriginalMember(owner = "client!jd", name = "s", descriptor = "Z")
	public boolean aBoolean382;

	@OriginalMember(owner = "client!jd", name = "m", descriptor = "Lclient!an;")
	private final Class16 aClass16_60;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lclient!hu;IZLclient!an;Lclient!an;)V")
	public Class155(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class16 arg3, @OriginalArg(4) Class16 arg4) {
		this.aClass16_61 = arg4;
		this.aBoolean382 = arg2;
		this.aClass16_60 = arg3;
		if (this.aClass16_60 != null) {
			@Pc(47) int local47 = this.aClass16_60.method407() - 1;
			this.aClass16_60.method399(local47);
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI)Lclient!ss;")
	public Class279 method4063(@OriginalArg(1) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_31;
		@Pc(16) Class279 local16;
		synchronized (this.aClass125_31) {
			local16 = (Class279) this.aClass125_31.method3446((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class16 local29 = this.aClass16_60;
		@Pc(42) byte[] local42;
		synchronized (this.aClass16_60) {
			local42 = this.aClass16_60.method408(Static418.method6472(arg0), Static478.method7174(arg0));
		}
		local16 = new Class279();
		local16.aClass155_4 = this;
		local16.anInt8315 = arg0;
		if (local42 != null) {
			local16.method6884(new Class12_Sub8(local42));
		}
		local16.method6875();
		if (local16.aBoolean586) {
			local16.aBoolean588 = false;
			local16.anInt8282 = 0;
		}
		if (!this.aBoolean382 && local16.aBoolean579) {
			local16.anIntArray621 = null;
			local16.aStringArray57 = null;
		}
		@Pc(102) Class125 local102 = this.aClass125_31;
		synchronized (this.aClass125_31) {
			this.aClass125_31.method3437(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
	public void method4064() {
		@Pc(2) Class125 local2 = this.aClass125_31;
		synchronized (this.aClass125_31) {
			this.aClass125_31.method3440();
		}
		local2 = this.aClass125_32;
		synchronized (this.aClass125_32) {
			this.aClass125_32.method3440();
		}
		local2 = this.aClass125_33;
		synchronized (this.aClass125_33) {
			this.aClass125_33.method3440();
		}
		local2 = this.aClass125_34;
		synchronized (this.aClass125_34) {
			this.aClass125_34.method3440();
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
	public void method4066() {
		@Pc(2) Class125 local2 = this.aClass125_31;
		synchronized (this.aClass125_31) {
			this.aClass125_31.method3442();
		}
		local2 = this.aClass125_32;
		synchronized (this.aClass125_32) {
			this.aClass125_32.method3442();
		}
		local2 = this.aClass125_33;
		synchronized (this.aClass125_33) {
			this.aClass125_33.method3442();
		}
		local2 = this.aClass125_34;
		synchronized (this.aClass125_34) {
			this.aClass125_34.method3442();
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)V")
	public void method4067(@OriginalArg(0) int arg0) {
		this.aClass125_31 = new Class125(arg0);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZ)V")
	public void method4068(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean381 != arg0) {
			this.aBoolean381 = arg0;
			this.method4064();
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)V")
	public void method4069() {
		@Pc(2) Class125 local2 = this.aClass125_31;
		synchronized (this.aClass125_31) {
			this.aClass125_31.method3447(5);
		}
		local2 = this.aClass125_32;
		synchronized (this.aClass125_32) {
			this.aClass125_32.method3447(5);
		}
		local2 = this.aClass125_33;
		synchronized (this.aClass125_33) {
			this.aClass125_33.method3447(5);
		}
		local2 = this.aClass125_34;
		synchronized (this.aClass125_34) {
			this.aClass125_34.method3447(5);
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZI)V")
	public void method4071(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean382 != arg0) {
			this.aBoolean382 = arg0;
			this.method4064();
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(ZI)V")
	public void method4073(@OriginalArg(1) int arg0) {
		this.anInt4817 = arg0;
		@Pc(9) Class125 local9 = this.aClass125_32;
		synchronized (this.aClass125_32) {
			this.aClass125_32.method3440();
		}
		local9 = this.aClass125_33;
		synchronized (this.aClass125_33) {
			this.aClass125_33.method3440();
		}
		local9 = this.aClass125_34;
		synchronized (this.aClass125_34) {
			this.aClass125_34.method3440();
		}
	}
}
