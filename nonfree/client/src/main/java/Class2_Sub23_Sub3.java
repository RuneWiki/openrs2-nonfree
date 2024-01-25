import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!paa")
public final class Class2_Sub23_Sub3 extends Class2_Sub23 {

	@OriginalMember(owner = "client!paa", name = "q", descriptor = "Lclient!cga;")
	private final Class60 aClass60_154 = new Class60();

	@OriginalMember(owner = "client!paa", name = "t", descriptor = "Lclient!cga;")
	private final Class60 aClass60_155 = new Class60();

	@OriginalMember(owner = "client!paa", name = "r", descriptor = "I")
	private int anInt7609 = -1;

	@OriginalMember(owner = "client!paa", name = "s", descriptor = "I")
	private int anInt7610 = 0;

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "()Lclient!gm;")
	@Override
	public Class2_Sub23 method7677() {
		return (Class2_Sub23) this.aClass60_154.method1228();
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7671(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt7609 < 0) {
				this.method6794(arg0);
				return;
			}
			if (this.anInt7610 + arg0 < this.anInt7609) {
				this.anInt7610 += arg0;
				this.method6794(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt7609 - this.anInt7610;
			this.method6794(local29);
			arg0 -= local29;
			this.anInt7610 += local29;
			this.method6793();
			@Pc(50) Class2_Sub19 local50 = (Class2_Sub19) this.aClass60_155.method1226(7);
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1998(this);
				if (local58 < 0) {
					local50.anInt2265 = 0;
					this.method6799(local50);
				} else {
					local50.anInt2265 = local58;
					this.method6796(local50.aClass2_345, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!paa", name = "e", descriptor = "()V")
	private void method6793() {
		if (this.anInt7610 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub19 local8 = (Class2_Sub19) this.aClass60_155.method1226(7); local8 != null; local8 = (Class2_Sub19) this.aClass60_155.method1228()) {
			local8.anInt2265 -= this.anInt7610;
		}
		this.anInt7609 -= this.anInt7610;
		this.anInt7610 = 0;
	}

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "(I)V")
	private void method6794(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class2_Sub23 local5 = (Class2_Sub23) this.aClass60_154.method1226(7); local5 != null; local5 = (Class2_Sub23) this.aClass60_154.method1228()) {
			local5.method7671(arg0);
		}
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lclient!gm;)V")
	public synchronized void method6795(@OriginalArg(0) Class2_Sub23 arg0) {
		this.aClass60_154.method1234(arg0);
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lclient!hh;Lclient!ee;)V")
	private void method6796(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub19 arg1) {
		while (arg0 != this.aClass60_155.aClass2_47 && ((Class2_Sub19) arg0).anInt2265 <= arg1.anInt2265) {
			arg0 = arg0.aClass2_345;
		}
		Static202.method2861(arg1, arg0);
		this.anInt7609 = ((Class2_Sub19) this.aClass60_155.aClass2_47.aClass2_345).anInt2265;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method7675(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt7609 < 0) {
				this.method6800(arg0, arg1, arg2);
				return;
			}
			if (this.anInt7610 + arg2 < this.anInt7609) {
				this.anInt7610 += arg2;
				this.method6800(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt7609 - this.anInt7610;
			this.method6800(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt7610 += local33;
			this.method6793();
			@Pc(60) Class2_Sub19 local60 = (Class2_Sub19) this.aClass60_155.method1226(7);
			synchronized (local60) {
				@Pc(68) int local68 = local60.method1998(this);
				if (local68 < 0) {
					local60.anInt2265 = 0;
					this.method6799(local60);
				} else {
					local60.anInt2265 = local68;
					this.method6796(local60.aClass2_345, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "(Lclient!gm;)V")
	public synchronized void method6797(@OriginalArg(0) Class2_Sub23 arg0) {
		arg0.method9872();
	}

	@OriginalMember(owner = "client!paa", name = "f", descriptor = "()I")
	public synchronized int method6798() {
		return this.aClass60_154.method1230();
	}

	@OriginalMember(owner = "client!paa", name = "d", descriptor = "()Lclient!gm;")
	@Override
	public Class2_Sub23 method7676() {
		return (Class2_Sub23) this.aClass60_154.method1226(7);
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lclient!ee;)V")
	private void method6799(@OriginalArg(0) Class2_Sub19 arg0) {
		arg0.method9872();
		arg0.method1997();
		@Pc(9) Class2 local9 = this.aClass60_155.aClass2_47.aClass2_345;
		if (local9 == this.aClass60_155.aClass2_47) {
			this.anInt7609 = -1;
		} else {
			this.anInt7609 = ((Class2_Sub19) local9).anInt2265;
		}
	}

	@OriginalMember(owner = "client!paa", name = "c", descriptor = "([III)V")
	private void method6800(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class2_Sub23 local5 = (Class2_Sub23) this.aClass60_154.method1226(7); local5 != null; local5 = (Class2_Sub23) this.aClass60_154.method1228()) {
			local5.method7673(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!paa", name = "c", descriptor = "()I")
	@Override
	public int method7674() {
		return 0;
	}
}
