import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class5_Sub14_Sub3 extends Class5_Sub14 {

	@OriginalMember(owner = "client!fe", name = "m", descriptor = "Lclient!ga;")
	private final Class124 aClass124_27 = new Class124();

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "Lclient!ga;")
	private final Class124 aClass124_28 = new Class124();

	@OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
	private int anInt2544 = 0;

	@OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
	private int anInt2545 = -1;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "()Lclient!eha;")
	@Override
	public Class5_Sub14 method8779() {
		return (Class5_Sub14) this.aClass124_27.method2572();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8778(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2545 < 0) {
				this.method2296(arg0);
				return;
			}
			if (this.anInt2544 + arg0 < this.anInt2545) {
				this.anInt2544 += arg0;
				this.method2296(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2545 - this.anInt2544;
			this.method2296(local29);
			arg0 -= local29;
			this.anInt2544 += local29;
			this.method2291();
			@Pc(50) Class5_Sub21 local50 = (Class5_Sub21) this.aClass124_28.method2572();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1983(this);
				if (local58 < 0) {
					local50.anInt2187 = 0;
					this.method2293(local50);
				} else {
					local50.anInt2187 = local58;
					this.method2297(local50.aClass5_337, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "()V")
	private void method2291() {
		if (this.anInt2544 <= 0) {
			return;
		}
		for (@Pc(8) Class5_Sub21 local8 = (Class5_Sub21) this.aClass124_28.method2572(); local8 != null; local8 = (Class5_Sub21) this.aClass124_28.method2569()) {
			local8.anInt2187 -= this.anInt2544;
		}
		this.anInt2545 -= this.anInt2544;
		this.anInt2544 = 0;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "()Lclient!eha;")
	@Override
	public Class5_Sub14 method8780() {
		return (Class5_Sub14) this.aClass124_27.method2569();
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "([III)V")
	private void method2292(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class5_Sub14 local5 = (Class5_Sub14) this.aClass124_27.method2572(); local5 != null; local5 = (Class5_Sub14) this.aClass124_27.method2569()) {
			local5.method8784(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!efa;)V")
	private void method2293(@OriginalArg(0) Class5_Sub21 arg0) {
		arg0.method8829();
		arg0.method1984();
		@Pc(9) Class5 local9 = this.aClass124_28.aClass5_123.aClass5_337;
		if (local9 == this.aClass124_28.aClass5_123) {
			this.anInt2545 = -1;
		} else {
			this.anInt2545 = ((Class5_Sub21) local9).anInt2187;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!eha;)V")
	public synchronized void method2294(@OriginalArg(0) Class5_Sub14 arg0) {
		arg0.method8829();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method8781(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt2545 < 0) {
				this.method2292(arg0, arg1, arg2);
				return;
			}
			if (this.anInt2544 + arg2 < this.anInt2545) {
				this.anInt2544 += arg2;
				this.method2292(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt2545 - this.anInt2544;
			this.method2292(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2544 += local33;
			this.method2291();
			@Pc(60) Class5_Sub21 local60 = (Class5_Sub21) this.aClass124_28.method2572();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method1983(this);
				if (local68 < 0) {
					local60.anInt2187 = 0;
					this.method2293(local60);
				} else {
					local60.anInt2187 = local68;
					this.method2297(local60.aClass5_337, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "()I")
	@Override
	public int method8783() {
		return 0;
	}

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "()I")
	public synchronized int method2295() {
		return this.aClass124_27.method2568();
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
	private void method2296(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class5_Sub14 local5 = (Class5_Sub14) this.aClass124_27.method2572(); local5 != null; local5 = (Class5_Sub14) this.aClass124_27.method2569()) {
			local5.method8778(arg0);
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!dn;Lclient!efa;)V")
	private void method2297(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5_Sub21 arg1) {
		while (arg0 != this.aClass124_28.aClass5_123 && ((Class5_Sub21) arg0).anInt2187 <= arg1.anInt2187) {
			arg0 = arg0.aClass5_337;
		}
		Static332.method5131(arg1, arg0);
		this.anInt2545 = ((Class5_Sub21) this.aClass124_28.aClass5_123.aClass5_337).anInt2187;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(Lclient!eha;)V")
	public synchronized void method2298(@OriginalArg(0) Class5_Sub14 arg0) {
		this.aClass124_27.method2570(arg0);
	}
}
