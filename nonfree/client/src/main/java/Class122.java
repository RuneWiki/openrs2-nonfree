import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Class122 {

	@OriginalMember(owner = "client!gq", name = "v", descriptor = "I")
	public int anInt3254;

	@OriginalMember(owner = "client!gq", name = "r", descriptor = "Z")
	public boolean aBoolean238 = false;

	@OriginalMember(owner = "client!gq", name = "l", descriptor = "Lclient!lga;")
	private Class207 aClass207_16 = new Class207(64);

	@OriginalMember(owner = "client!gq", name = "s", descriptor = "Lclient!lga;")
	public final Class207 aClass207_17 = new Class207(500);

	@OriginalMember(owner = "client!gq", name = "t", descriptor = "Lclient!lga;")
	public final Class207 aClass207_18 = new Class207(30);

	@OriginalMember(owner = "client!gq", name = "u", descriptor = "Lclient!lga;")
	public final Class207 aClass207_19 = new Class207(50);

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "Lclient!sea;")
	public final Class308 aClass308_70;

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "Lclient!sea;")
	private final Class308 aClass308_71;

	@OriginalMember(owner = "client!gq", name = "e", descriptor = "Z")
	public boolean aBoolean237;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lclient!ci;IZLclient!sea;Lclient!sea;)V")
	public Class122(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class308 arg3, @OriginalArg(4) Class308 arg4) {
		this.aClass308_70 = arg4;
		this.aClass308_71 = arg3;
		this.aBoolean237 = arg2;
		if (this.aClass308_71 != null) {
			@Pc(47) int local47 = this.aClass308_71.method6564() - 1;
			this.aClass308_71.method6568(local47);
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V")
	public void method2767() {
		@Pc(2) Class207 local2 = this.aClass207_16;
		synchronized (this.aClass207_16) {
			this.aClass207_16.method4398();
		}
		local2 = this.aClass207_17;
		synchronized (this.aClass207_17) {
			this.aClass207_17.method4398();
		}
		local2 = this.aClass207_18;
		synchronized (this.aClass207_18) {
			this.aClass207_18.method4398();
		}
		local2 = this.aClass207_19;
		synchronized (this.aClass207_19) {
			this.aClass207_19.method4398();
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IZ)V")
	public void method2768(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean238 != arg0) {
			this.aBoolean238 = arg0;
			this.method2774();
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(BI)V")
	public void method2769(@OriginalArg(1) int arg0) {
		this.anInt3254 = arg0;
		@Pc(9) Class207 local9 = this.aClass207_17;
		synchronized (this.aClass207_17) {
			this.aClass207_17.method4392();
		}
		local9 = this.aClass207_18;
		synchronized (this.aClass207_18) {
			this.aClass207_18.method4392();
		}
		local9 = this.aClass207_19;
		synchronized (this.aClass207_19) {
			this.aClass207_19.method4392();
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(II)Lclient!js;")
	public Class178 method2770(@OriginalArg(0) int arg0) {
		@Pc(6) Class207 local6 = this.aClass207_16;
		@Pc(16) Class178 local16;
		synchronized (this.aClass207_16) {
			local16 = (Class178) this.aClass207_16.method4390((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class308 local29 = this.aClass308_71;
		@Pc(42) byte[] local42;
		synchronized (this.aClass308_71) {
			local42 = this.aClass308_71.method6569(Static414.method6217(arg0), Static399.method5769(arg0));
		}
		local16 = new Class178();
		local16.aClass122_3 = this;
		local16.anInt4643 = arg0;
		if (local42 != null) {
			local16.method3712(new Class1_Sub3(local42));
		}
		local16.method3704();
		if (!this.aBoolean237 && local16.aBoolean344) {
			local16.aStringArray13 = null;
			local16.anIntArray253 = null;
		}
		if (local16.aBoolean346) {
			local16.aBoolean356 = false;
			local16.anInt4666 = 0;
		}
		@Pc(101) Class207 local101 = this.aClass207_16;
		synchronized (this.aClass207_16) {
			this.aClass207_16.method4391((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(IZ)V")
	public void method2771(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean237) {
			this.aBoolean237 = arg0;
			this.method2774();
		}
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(II)V")
	public void method2772(@OriginalArg(0) int arg0) {
		this.aClass207_16 = new Class207(arg0);
	}

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "(II)V")
	public void method2773() {
		@Pc(2) Class207 local2 = this.aClass207_16;
		synchronized (this.aClass207_16) {
			this.aClass207_16.method4397(5);
		}
		local2 = this.aClass207_17;
		synchronized (this.aClass207_17) {
			this.aClass207_17.method4397(5);
		}
		local2 = this.aClass207_18;
		synchronized (this.aClass207_18) {
			this.aClass207_18.method4397(5);
		}
		local2 = this.aClass207_19;
		synchronized (this.aClass207_19) {
			this.aClass207_19.method4397(5);
		}
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)V")
	public void method2774() {
		@Pc(2) Class207 local2 = this.aClass207_16;
		synchronized (this.aClass207_16) {
			this.aClass207_16.method4392();
		}
		local2 = this.aClass207_17;
		synchronized (this.aClass207_17) {
			this.aClass207_17.method4392();
		}
		local2 = this.aClass207_18;
		synchronized (this.aClass207_18) {
			this.aClass207_18.method4392();
		}
		local2 = this.aClass207_19;
		synchronized (this.aClass207_19) {
			this.aClass207_19.method4392();
		}
	}
}
