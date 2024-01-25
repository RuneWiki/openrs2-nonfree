import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class2_Sub10_Sub1 extends Class2_Sub10 {

	@OriginalMember(owner = "client!ch", name = "o", descriptor = "Lclient!ae;")
	private final Class8 aClass8_5 = new Class8();

	@OriginalMember(owner = "client!ch", name = "p", descriptor = "Lclient!ae;")
	private final Class8 aClass8_6 = new Class8();

	@OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
	private int anInt1453 = 0;

	@OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
	private int anInt1454 = -1;

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "()V")
	private void method1007() {
		if (this.anInt1453 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub50 local8 = (Class2_Sub50) this.aClass8_6.method210(); local8 != null; local8 = (Class2_Sub50) this.aClass8_6.method218()) {
			local8.anInt9371 -= this.anInt1453;
		}
		this.anInt1454 -= this.anInt1453;
		this.anInt1453 = 0;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "()Lclient!pn;")
	@Override
	public Class2_Sub10 method3364() {
		return (Class2_Sub10) this.aClass8_5.method218();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method3361(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt1454 < 0) {
				this.method1008(arg0);
				return;
			}
			if (this.anInt1453 + arg0 < this.anInt1454) {
				this.anInt1453 += arg0;
				this.method1008(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt1454 - this.anInt1453;
			this.method1008(local29);
			arg0 -= local29;
			this.anInt1453 += local29;
			this.method1007();
			@Pc(50) Class2_Sub50 local50 = (Class2_Sub50) this.aClass8_6.method210();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method7792(this);
				if (local58 < 0) {
					local50.anInt9371 = 0;
					this.method1010(local50);
				} else {
					local50.anInt9371 = local58;
					this.method1009(local50.aClass2_286, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
	private void method1008(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class2_Sub10 local5 = (Class2_Sub10) this.aClass8_5.method210(); local5 != null; local5 = (Class2_Sub10) this.aClass8_5.method218()) {
			local5.method3361(arg0);
		}
	}

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "()I")
	@Override
	public int method3366() {
		return 0;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!d;Lclient!wba;)V")
	private void method1009(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub50 arg1) {
		while (arg0 != this.aClass8_6.aClass2_9 && ((Class2_Sub50) arg0).anInt9371 <= arg1.anInt9371) {
			arg0 = arg0.aClass2_286;
		}
		Static398.method7273(arg1, arg0);
		this.anInt1454 = ((Class2_Sub50) this.aClass8_6.aClass2_9.aClass2_286).anInt9371;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!wba;)V")
	private void method1010(@OriginalArg(0) Class2_Sub50 arg0) {
		arg0.method7966();
		arg0.method7793();
		@Pc(9) Class2 local9 = this.aClass8_6.aClass2_9.aClass2_286;
		if (local9 == this.aClass8_6.aClass2_9) {
			this.anInt1454 = -1;
		} else {
			this.anInt1454 = ((Class2_Sub50) local9).anInt9371;
		}
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method3363(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt1454 < 0) {
				this.method1011(arg0, arg1, arg2);
				return;
			}
			if (this.anInt1453 + arg2 < this.anInt1454) {
				this.anInt1453 += arg2;
				this.method1011(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt1454 - this.anInt1453;
			this.method1011(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt1453 += local33;
			this.method1007();
			@Pc(60) Class2_Sub50 local60 = (Class2_Sub50) this.aClass8_6.method210();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method7792(this);
				if (local68 < 0) {
					local60.anInt9371 = 0;
					this.method1010(local60);
				} else {
					local60.anInt9371 = local68;
					this.method1009(local60.aClass2_286, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "([III)V")
	private void method1011(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class2_Sub10 local5 = (Class2_Sub10) this.aClass8_5.method210(); local5 != null; local5 = (Class2_Sub10) this.aClass8_5.method218()) {
			local5.method3362(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!pn;)V")
	public synchronized void method1012(@OriginalArg(0) Class2_Sub10 arg0) {
		arg0.method7966();
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(Lclient!pn;)V")
	public synchronized void method1013(@OriginalArg(0) Class2_Sub10 arg0) {
		this.aClass8_5.method209(arg0);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "()Lclient!pn;")
	@Override
	public Class2_Sub10 method3360() {
		return (Class2_Sub10) this.aClass8_5.method210();
	}

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "()I")
	public synchronized int method1014() {
		return this.aClass8_5.method214();
	}
}
