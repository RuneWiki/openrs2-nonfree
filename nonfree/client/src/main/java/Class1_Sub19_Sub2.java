import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fw")
public final class Class1_Sub19_Sub2 extends Class1_Sub19 {

	@OriginalMember(owner = "client!fw", name = "o", descriptor = "Lclient!oe;")
	private final Class181 aClass181_20 = new Class181();

	@OriginalMember(owner = "client!fw", name = "p", descriptor = "Lclient!oe;")
	private final Class181 aClass181_21 = new Class181();

	@OriginalMember(owner = "client!fw", name = "q", descriptor = "I")
	private int anInt2454 = 0;

	@OriginalMember(owner = "client!fw", name = "r", descriptor = "I")
	private int anInt2455 = -1;

	@OriginalMember(owner = "client!fw", name = "e", descriptor = "()I")
	public synchronized int method2183() {
		return this.aClass181_20.method4108();
	}

	@OriginalMember(owner = "client!fw", name = "c", descriptor = "([III)V")
	private void method2184(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub19 local5 = (Class1_Sub19) this.aClass181_20.method4112(); local5 != null; local5 = (Class1_Sub19) this.aClass181_20.method4104()) {
			local5.method3648(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lclient!fp;)V")
	public synchronized void method2185(@OriginalArg(0) Class1_Sub19 arg0) {
		arg0.method6020();
	}

	@OriginalMember(owner = "client!fw", name = "c", descriptor = "()Lclient!fp;")
	@Override
	public Class1_Sub19 method3649() {
		return (Class1_Sub19) this.aClass181_20.method4112();
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method3647(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt2455 < 0) {
				this.method2184(arg0, arg1, arg2);
				return;
			}
			if (this.anInt2454 + arg2 < this.anInt2455) {
				this.anInt2454 += arg2;
				this.method2184(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt2455 - this.anInt2454;
			this.method2184(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2454 += local33;
			this.method2186();
			@Pc(60) Class1_Sub18 local60 = (Class1_Sub18) this.aClass181_21.method4112();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method1971(this);
				if (local68 < 0) {
					local60.anInt2275 = 0;
					this.method2187(local60);
				} else {
					local60.anInt2275 = local68;
					this.method2190(local60.aClass1_261, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!fw", name = "f", descriptor = "()V")
	private void method2186() {
		if (this.anInt2454 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub18 local8 = (Class1_Sub18) this.aClass181_21.method4112(); local8 != null; local8 = (Class1_Sub18) this.aClass181_21.method4104()) {
			local8.anInt2275 -= this.anInt2454;
		}
		this.anInt2455 -= this.anInt2454;
		this.anInt2454 = 0;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method3650(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2455 < 0) {
				this.method2189(arg0);
				return;
			}
			if (this.anInt2454 + arg0 < this.anInt2455) {
				this.anInt2454 += arg0;
				this.method2189(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2455 - this.anInt2454;
			this.method2189(local29);
			arg0 -= local29;
			this.anInt2454 += local29;
			this.method2186();
			@Pc(50) Class1_Sub18 local50 = (Class1_Sub18) this.aClass181_21.method4112();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1971(this);
				if (local58 < 0) {
					local50.anInt2275 = 0;
					this.method2187(local50);
				} else {
					local50.anInt2275 = local58;
					this.method2190(local50.aClass1_261, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lclient!fd;)V")
	private void method2187(@OriginalArg(0) Class1_Sub18 arg0) {
		arg0.method6020();
		arg0.method1970();
		@Pc(9) Class1 local9 = this.aClass181_21.aClass1_179.aClass1_261;
		if (local9 == this.aClass181_21.aClass1_179) {
			this.anInt2455 = -1;
		} else {
			this.anInt2455 = ((Class1_Sub18) local9).anInt2275;
		}
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "()I")
	@Override
	public int method3646() {
		return 0;
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(Lclient!fp;)V")
	public synchronized void method2188(@OriginalArg(0) Class1_Sub19 arg0) {
		this.aClass181_20.method4106(arg0);
	}

	@OriginalMember(owner = "client!fw", name = "g", descriptor = "(I)V")
	private void method2189(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub19 local5 = (Class1_Sub19) this.aClass181_20.method4112(); local5 != null; local5 = (Class1_Sub19) this.aClass181_20.method4104()) {
			local5.method3650(arg0);
		}
	}

	@OriginalMember(owner = "client!fw", name = "d", descriptor = "()Lclient!fp;")
	@Override
	public Class1_Sub19 method3651() {
		return (Class1_Sub19) this.aClass181_20.method4104();
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lclient!cf;Lclient!fd;)V")
	private void method2190(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub18 arg1) {
		while (arg0 != this.aClass181_21.aClass1_179 && ((Class1_Sub18) arg0).anInt2275 <= arg1.anInt2275) {
			arg0 = arg0.aClass1_261;
		}
		Static221.method2301(arg1, arg0);
		this.anInt2455 = ((Class1_Sub18) this.aClass181_21.aClass1_179.aClass1_261).anInt2275;
	}
}
