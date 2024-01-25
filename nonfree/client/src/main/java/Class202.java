import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class202 {

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
	public int anInt5345;

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "Lclient!tb;")
	private final Class313 aClass313_30 = new Class313(64);

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "Lclient!tb;")
	public final Class313 aClass313_31 = new Class313(50);

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "Lclient!tb;")
	public final Class313 aClass313_32 = new Class313(5);

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "Lclient!pl;")
	private final Class259 aClass259_91;

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "Lclient!pl;")
	public final Class259 aClass259_90;

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "Z")
	public boolean aBoolean423;

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "Lclient!rf;")
	public final Class284 aClass284_1;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!rf;IZLclient!pl;Lclient!pl;)V")
	public Class202(@OriginalArg(0) Class284 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class259 arg3, @OriginalArg(4) Class259 arg4) {
		this.aClass259_91 = arg3;
		this.aClass259_90 = arg4;
		this.aBoolean423 = arg2;
		this.aClass284_1 = arg0;
		if (this.aClass259_91 != null) {
			@Pc(41) int local41 = this.aClass259_91.method5962() - 1;
			this.aClass259_91.method5969(local41);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
	public void method4485() {
		@Pc(6) Class313 local6 = this.aClass313_30;
		synchronized (this.aClass313_30) {
			this.aClass313_30.method6983();
		}
		local6 = this.aClass313_31;
		synchronized (this.aClass313_31) {
			this.aClass313_31.method6983();
		}
		local6 = this.aClass313_32;
		synchronized (this.aClass313_32) {
			this.aClass313_32.method6983();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)V")
	public void method4487(@OriginalArg(1) int arg0) {
		this.anInt5345 = arg0;
		@Pc(9) Class313 local9 = this.aClass313_31;
		synchronized (this.aClass313_31) {
			this.aClass313_31.method6977();
		}
		local9 = this.aClass313_32;
		synchronized (this.aClass313_32) {
			this.aClass313_32.method6977();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IB)Lclient!du;")
	public Class86 method4488(@OriginalArg(0) int arg0) {
		@Pc(6) Class313 local6 = this.aClass313_30;
		@Pc(21) Class86 local21;
		synchronized (this.aClass313_30) {
			local21 = (Class86) this.aClass313_30.method6989((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class259 local34 = this.aClass259_91;
		@Pc(47) byte[] local47;
		synchronized (this.aClass259_91) {
			local47 = this.aClass259_91.method5985(Static343.method4371(arg0), Static139.method2345(arg0));
		}
		local21 = new Class86();
		local21.anInt2147 = arg0;
		local21.aClass202_1 = this;
		if (local47 != null) {
			local21.method1569(new Class2_Sub15(local47));
		}
		local21.method1565();
		@Pc(78) Class313 local78 = this.aClass313_30;
		synchronized (this.aClass313_30) {
			this.aClass313_30.method6980((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)V")
	public void method4489() {
		@Pc(2) Class313 local2 = this.aClass313_30;
		synchronized (this.aClass313_30) {
			this.aClass313_30.method6982(5);
		}
		local2 = this.aClass313_31;
		synchronized (this.aClass313_31) {
			this.aClass313_31.method6982(5);
		}
		local2 = this.aClass313_32;
		synchronized (this.aClass313_32) {
			this.aClass313_32.method6982(5);
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(B)V")
	public void method4490() {
		@Pc(6) Class313 local6 = this.aClass313_31;
		synchronized (this.aClass313_31) {
			this.aClass313_31.method6977();
		}
		local6 = this.aClass313_32;
		synchronized (this.aClass313_32) {
			this.aClass313_32.method6977();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZB)V")
	public void method4491(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean423) {
			this.aBoolean423 = arg0;
			this.method4492();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
	public void method4492() {
		@Pc(2) Class313 local2 = this.aClass313_30;
		synchronized (this.aClass313_30) {
			this.aClass313_30.method6977();
		}
		local2 = this.aClass313_31;
		synchronized (this.aClass313_31) {
			this.aClass313_31.method6977();
		}
		local2 = this.aClass313_32;
		synchronized (this.aClass313_32) {
			this.aClass313_32.method6977();
		}
	}
}
