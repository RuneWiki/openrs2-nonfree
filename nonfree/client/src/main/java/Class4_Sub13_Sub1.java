import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class4_Sub13_Sub1 extends Class4_Sub13 {

	@OriginalMember(owner = "client!ds", name = "m", descriptor = "Lclient!gj;")
	private final Class124 aClass124_15 = new Class124();

	@OriginalMember(owner = "client!ds", name = "n", descriptor = "Lclient!gj;")
	private final Class124 aClass124_16 = new Class124();

	@OriginalMember(owner = "client!ds", name = "o", descriptor = "I")
	private int anInt2544 = 0;

	@OriginalMember(owner = "client!ds", name = "p", descriptor = "I")
	private int anInt2545 = -1;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!qu;)V")
	private void method2267(@OriginalArg(0) Class4_Sub40 arg0) {
		arg0.method8013();
		arg0.method6276();
		@Pc(9) Class4 local9 = this.aClass124_16.aClass4_90.aClass4_287;
		if (local9 == this.aClass124_16.aClass4_90) {
			this.anInt2545 = -1;
		} else {
			this.anInt2545 = ((Class4_Sub40) local9).anInt7583;
		}
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(I)V")
	private void method2268(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class4_Sub13 local5 = (Class4_Sub13) this.aClass124_15.method3267(); local5 != null; local5 = (Class4_Sub13) this.aClass124_15.method3273()) {
			local5.method6215(arg0);
		}
	}

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "([III)V")
	private void method2269(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class4_Sub13 local5 = (Class4_Sub13) this.aClass124_15.method3267(); local5 != null; local5 = (Class4_Sub13) this.aClass124_15.method3273()) {
			local5.method6219(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "()Lclient!sda;")
	@Override
	public Class4_Sub13 method6216() {
		return (Class4_Sub13) this.aClass124_15.method3273();
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!rc;Lclient!qu;)V")
	private void method2270(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4_Sub40 arg1) {
		while (arg0 != this.aClass124_16.aClass4_90 && ((Class4_Sub40) arg0).anInt7583 <= arg1.anInt7583) {
			arg0 = arg0.aClass4_287;
		}
		Static130.method2735(arg0, arg1);
		this.anInt2545 = ((Class4_Sub40) this.aClass124_16.aClass4_90.aClass4_287).anInt7583;
	}

	@OriginalMember(owner = "client!ds", name = "e", descriptor = "()I")
	public synchronized int method2271() {
		return this.aClass124_15.method3271();
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!sda;)V")
	public synchronized void method2272(@OriginalArg(0) Class4_Sub13 arg0) {
		this.aClass124_15.method3268(arg0);
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method6221(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt2545 < 0) {
				this.method2269(arg0, arg1, arg2);
				return;
			}
			if (this.anInt2544 + arg2 < this.anInt2545) {
				this.anInt2544 += arg2;
				this.method2269(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt2545 - this.anInt2544;
			this.method2269(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2544 += local33;
			this.method2273();
			@Pc(60) Class4_Sub40 local60 = (Class4_Sub40) this.aClass124_16.method3267();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method6277(this);
				if (local68 < 0) {
					local60.anInt7583 = 0;
					this.method2267(local60);
				} else {
					local60.anInt7583 = local68;
					this.method2270(local60.aClass4_287, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!ds", name = "f", descriptor = "()V")
	private void method2273() {
		if (this.anInt2544 <= 0) {
			return;
		}
		for (@Pc(8) Class4_Sub40 local8 = (Class4_Sub40) this.aClass124_16.method3267(); local8 != null; local8 = (Class4_Sub40) this.aClass124_16.method3273()) {
			local8.anInt7583 -= this.anInt2544;
		}
		this.anInt2545 -= this.anInt2544;
		this.anInt2544 = 0;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6215(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2545 < 0) {
				this.method2268(arg0);
				return;
			}
			if (this.anInt2544 + arg0 < this.anInt2545) {
				this.anInt2544 += arg0;
				this.method2268(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2545 - this.anInt2544;
			this.method2268(local29);
			arg0 -= local29;
			this.anInt2544 += local29;
			this.method2273();
			@Pc(50) Class4_Sub40 local50 = (Class4_Sub40) this.aClass124_16.method3267();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method6277(this);
				if (local58 < 0) {
					local50.anInt7583 = 0;
					this.method2267(local50);
				} else {
					local50.anInt7583 = local58;
					this.method2270(local50.aClass4_287, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "()I")
	@Override
	public int method6217() {
		return 0;
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(Lclient!sda;)V")
	public synchronized void method2274(@OriginalArg(0) Class4_Sub13 arg0) {
		arg0.method8013();
	}

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "()Lclient!sda;")
	@Override
	public Class4_Sub13 method6220() {
		return (Class4_Sub13) this.aClass124_15.method3267();
	}
}
