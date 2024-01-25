import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class97 {

	@OriginalMember(owner = "client!ek", name = "y", descriptor = "I")
	public int anInt2398;

	@OriginalMember(owner = "client!ek", name = "i", descriptor = "Z")
	public boolean aBoolean207 = false;

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "Lclient!tb;")
	private Class313 aClass313_16 = new Class313(64);

	@OriginalMember(owner = "client!ek", name = "u", descriptor = "Lclient!tb;")
	public final Class313 aClass313_17 = new Class313(500);

	@OriginalMember(owner = "client!ek", name = "v", descriptor = "Lclient!tb;")
	public final Class313 aClass313_18 = new Class313(30);

	@OriginalMember(owner = "client!ek", name = "x", descriptor = "Lclient!tb;")
	public final Class313 aClass313_19 = new Class313(50);

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "Lclient!pl;")
	private final Class259 aClass259_46;

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "Z")
	public boolean aBoolean206;

	@OriginalMember(owner = "client!ek", name = "o", descriptor = "Lclient!pl;")
	public final Class259 aClass259_48;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lclient!rf;IZLclient!pl;Lclient!pl;)V")
	public Class97(@OriginalArg(0) Class284 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class259 arg3, @OriginalArg(4) Class259 arg4) {
		this.aClass259_46 = arg3;
		this.aBoolean206 = arg2;
		this.aClass259_48 = arg4;
		if (this.aClass259_46 != null) {
			@Pc(47) int local47 = this.aClass259_46.method5962() - 1;
			this.aClass259_46.method5969(local47);
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB)V")
	public void method1789() {
		@Pc(2) Class313 local2 = this.aClass313_16;
		synchronized (this.aClass313_16) {
			this.aClass313_16.method6982(5);
		}
		local2 = this.aClass313_17;
		synchronized (this.aClass313_17) {
			this.aClass313_17.method6982(5);
		}
		local2 = this.aClass313_18;
		synchronized (this.aClass313_18) {
			this.aClass313_18.method6982(5);
		}
		local2 = this.aClass313_19;
		synchronized (this.aClass313_19) {
			this.aClass313_19.method6982(5);
		}
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
	public void method1791() {
		@Pc(6) Class313 local6 = this.aClass313_16;
		synchronized (this.aClass313_16) {
			this.aClass313_16.method6977();
		}
		local6 = this.aClass313_17;
		synchronized (this.aClass313_17) {
			this.aClass313_17.method6977();
		}
		local6 = this.aClass313_18;
		synchronized (this.aClass313_18) {
			this.aClass313_18.method6977();
		}
		local6 = this.aClass313_19;
		synchronized (this.aClass313_19) {
			this.aClass313_19.method6977();
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)V")
	public void method1792(@OriginalArg(1) int arg0) {
		this.aClass313_16 = new Class313(arg0);
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)V")
	public void method1793() {
		@Pc(2) Class313 local2 = this.aClass313_16;
		synchronized (this.aClass313_16) {
			this.aClass313_16.method6983();
		}
		local2 = this.aClass313_17;
		synchronized (this.aClass313_17) {
			this.aClass313_17.method6983();
		}
		local2 = this.aClass313_18;
		synchronized (this.aClass313_18) {
			this.aClass313_18.method6983();
		}
		local2 = this.aClass313_19;
		synchronized (this.aClass313_19) {
			this.aClass313_19.method6983();
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BI)Lclient!bda;")
	public Class32 method1794(@OriginalArg(1) int arg0) {
		@Pc(6) Class313 local6 = this.aClass313_16;
		@Pc(16) Class32 local16;
		synchronized (this.aClass313_16) {
			local16 = (Class32) this.aClass313_16.method6989((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class259 local29 = this.aClass259_46;
		@Pc(42) byte[] local42;
		synchronized (this.aClass259_46) {
			local42 = this.aClass259_46.method5985(Static564.method7656(arg0), Static576.method6554(arg0));
		}
		local16 = new Class32();
		local16.anInt773 = arg0;
		local16.aClass97_1 = this;
		if (local42 != null) {
			local16.method564(new Class2_Sub15(local42));
		}
		local16.method556();
		if (local16.aBoolean41) {
			local16.aBoolean53 = false;
			local16.anInt803 = 0;
		}
		if (!this.aBoolean206 && local16.aBoolean55) {
			local16.aStringArray10 = null;
			local16.anIntArray45 = null;
		}
		@Pc(99) Class313 local99 = this.aClass313_16;
		synchronized (this.aClass313_16) {
			this.aClass313_16.method6980((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(BI)V")
	public void method1796(@OriginalArg(1) int arg0) {
		this.anInt2398 = arg0;
		@Pc(15) Class313 local15 = this.aClass313_17;
		synchronized (this.aClass313_17) {
			this.aClass313_17.method6977();
		}
		local15 = this.aClass313_18;
		synchronized (this.aClass313_18) {
			this.aClass313_18.method6977();
		}
		local15 = this.aClass313_19;
		synchronized (this.aClass313_19) {
			this.aClass313_19.method6977();
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZI)V")
	public void method1799(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean206 != arg0) {
			this.aBoolean206 = arg0;
			this.method1791();
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IZ)V")
	public void method1800(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean207) {
			this.aBoolean207 = arg0;
			this.method1791();
		}
	}
}
