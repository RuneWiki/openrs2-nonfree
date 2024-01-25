import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hw")
public final class Class7_Sub8_Sub1 extends Class7_Sub8 {

	@OriginalMember(owner = "client!hw", name = "m", descriptor = "Lclient!fr;")
	private final Class85 aClass85_16 = new Class85();

	@OriginalMember(owner = "client!hw", name = "n", descriptor = "Lclient!fr;")
	private final Class85 aClass85_17 = new Class85();

	@OriginalMember(owner = "client!hw", name = "o", descriptor = "I")
	private int anInt3019 = 0;

	@OriginalMember(owner = "client!hw", name = "p", descriptor = "I")
	private int anInt3020 = -1;

	@OriginalMember(owner = "client!hw", name = "e", descriptor = "()V")
	private void method2426() {
		if (this.anInt3019 <= 0) {
			return;
		}
		for (@Pc(8) Class7_Sub25 local8 = (Class7_Sub25) this.aClass85_17.method2010(); local8 != null; local8 = (Class7_Sub25) this.aClass85_17.method2000()) {
			local8.anInt3091 -= this.anInt3019;
		}
		this.anInt3020 -= this.anInt3019;
		this.anInt3019 = 0;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method4870(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt3020 < 0) {
				this.method2433(arg0);
				return;
			}
			if (this.anInt3019 + arg0 < this.anInt3020) {
				this.anInt3019 += arg0;
				this.method2433(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt3020 - this.anInt3019;
			this.method2433(local29);
			arg0 -= local29;
			this.anInt3019 += local29;
			this.method2426();
			@Pc(50) Class7_Sub25 local50 = (Class7_Sub25) this.aClass85_17.method2010();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method2501(this);
				if (local58 < 0) {
					local50.anInt3091 = 0;
					this.method2429(local50);
				} else {
					local50.anInt3091 = local58;
					this.method2431(local50.aClass7_262, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "([III)V")
	private void method2427(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class7_Sub8 local5 = (Class7_Sub8) this.aClass85_16.method2010(); local5 != null; local5 = (Class7_Sub8) this.aClass85_16.method2000()) {
			local5.method4868(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Lclient!bs;)V")
	public synchronized void method2428(@OriginalArg(0) Class7_Sub8 arg0) {
		arg0.method5802();
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "()Lclient!bs;")
	@Override
	public Class7_Sub8 method4866() {
		return (Class7_Sub8) this.aClass85_16.method2010();
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4871(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt3020 < 0) {
				this.method2427(arg0, arg1, arg2);
				return;
			}
			if (this.anInt3019 + arg2 < this.anInt3020) {
				this.anInt3019 += arg2;
				this.method2427(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt3020 - this.anInt3019;
			this.method2427(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt3019 += local33;
			this.method2426();
			@Pc(60) Class7_Sub25 local60 = (Class7_Sub25) this.aClass85_17.method2010();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method2501(this);
				if (local68 < 0) {
					local60.anInt3091 = 0;
					this.method2429(local60);
				} else {
					local60.anInt3091 = local68;
					this.method2431(local60.aClass7_262, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Lclient!ih;)V")
	private void method2429(@OriginalArg(0) Class7_Sub25 arg0) {
		arg0.method5802();
		arg0.method2500();
		@Pc(9) Class7 local9 = this.aClass85_17.aClass7_81.aClass7_262;
		if (local9 == this.aClass85_17.aClass7_81) {
			this.anInt3020 = -1;
		} else {
			this.anInt3020 = ((Class7_Sub25) local9).anInt3091;
		}
	}

	@OriginalMember(owner = "client!hw", name = "f", descriptor = "()I")
	public synchronized int method2430() {
		return this.aClass85_16.method2013();
	}

	@OriginalMember(owner = "client!hw", name = "d", descriptor = "()Lclient!bs;")
	@Override
	public Class7_Sub8 method4872() {
		return (Class7_Sub8) this.aClass85_16.method2000();
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Lclient!ea;Lclient!ih;)V")
	private void method2431(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class7_Sub25 arg1) {
		while (arg0 != this.aClass85_17.aClass7_81 && ((Class7_Sub25) arg0).anInt3091 <= arg1.anInt3091) {
			arg0 = arg0.aClass7_262;
		}
		Static213.method3050(arg1, arg0);
		this.anInt3020 = ((Class7_Sub25) this.aClass85_17.aClass7_81.aClass7_262).anInt3091;
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(Lclient!bs;)V")
	public synchronized void method2432(@OriginalArg(0) Class7_Sub8 arg0) {
		this.aClass85_16.method2006(arg0);
	}

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "()I")
	@Override
	public int method4869() {
		return 0;
	}

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "(I)V")
	private void method2433(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class7_Sub8 local5 = (Class7_Sub8) this.aClass85_16.method2010(); local5 != null; local5 = (Class7_Sub8) this.aClass85_16.method2000()) {
			local5.method4870(arg0);
		}
	}
}
