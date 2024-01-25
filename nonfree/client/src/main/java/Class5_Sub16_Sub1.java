import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class5_Sub16_Sub1 extends Class5_Sub16 {

	@OriginalMember(owner = "client!fk", name = "o", descriptor = "Lclient!ef;")
	private final Class102 aClass102_25 = new Class102();

	@OriginalMember(owner = "client!fk", name = "q", descriptor = "Lclient!ef;")
	private final Class102 aClass102_26 = new Class102();

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
	private int anInt2962 = 0;

	@OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
	private int anInt2961 = -1;

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "()V")
	private void method2548() {
		if (this.anInt2962 <= 0) {
			return;
		}
		for (@Pc(8) Class5_Sub4 local8 = (Class5_Sub4) this.aClass102_26.method1916(); local8 != null; local8 = (Class5_Sub4) this.aClass102_26.method1915()) {
			local8.anInt341 -= this.anInt2962;
		}
		this.anInt2961 -= this.anInt2962;
		this.anInt2962 = 0;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "()Lclient!fq;")
	@Override
	public Class5_Sub16 method8735() {
		return (Class5_Sub16) this.aClass102_25.method1915();
	}

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "()I")
	@Override
	public int method8739() {
		return 0;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!am;)V")
	private void method2549(@OriginalArg(0) Class5_Sub4 arg0) {
		arg0.method9327(1);
		arg0.method326();
		@Pc(9) Class5 local9 = this.aClass102_26.aClass5_61.aClass5_338;
		if (local9 == this.aClass102_26.aClass5_61) {
			this.anInt2961 = -1;
		} else {
			this.anInt2961 = ((Class5_Sub4) local9).anInt341;
		}
	}

	@OriginalMember(owner = "client!fk", name = "f", descriptor = "()I")
	public synchronized int method2550() {
		return this.aClass102_25.method1927();
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method8738(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt2961 < 0) {
				this.method2551(arg0, arg1, arg2);
				return;
			}
			if (this.anInt2962 + arg2 < this.anInt2961) {
				this.anInt2962 += arg2;
				this.method2551(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt2961 - this.anInt2962;
			this.method2551(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2962 += local33;
			this.method2548();
			@Pc(60) Class5_Sub4 local60 = (Class5_Sub4) this.aClass102_26.method1916();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method327(this);
				if (local68 < 0) {
					local60.anInt341 = 0;
					this.method2549(local60);
				} else {
					local60.anInt341 = local68;
					this.method2552(local60.aClass5_338, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "()Lclient!fq;")
	@Override
	public Class5_Sub16 method8737() {
		return (Class5_Sub16) this.aClass102_25.method1916();
	}

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "([III)V")
	private void method2551(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class5_Sub16 local5 = (Class5_Sub16) this.aClass102_25.method1916(); local5 != null; local5 = (Class5_Sub16) this.aClass102_25.method1915()) {
			local5.method8736(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!me;Lclient!am;)V")
	private void method2552(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5_Sub4 arg1) {
		while (arg0 != this.aClass102_26.aClass5_61 && ((Class5_Sub4) arg0).anInt341 <= arg1.anInt341) {
			arg0 = arg0.aClass5_338;
		}
		Static297.method4390(arg0, arg1);
		this.anInt2961 = ((Class5_Sub4) this.aClass102_26.aClass5_61.aClass5_338).anInt341;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8740(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2961 < 0) {
				this.method2553(arg0);
				return;
			}
			if (this.anInt2962 + arg0 < this.anInt2961) {
				this.anInt2962 += arg0;
				this.method2553(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2961 - this.anInt2962;
			this.method2553(local29);
			arg0 -= local29;
			this.anInt2962 += local29;
			this.method2548();
			@Pc(50) Class5_Sub4 local50 = (Class5_Sub4) this.aClass102_26.method1916();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method327(this);
				if (local58 < 0) {
					local50.anInt341 = 0;
					this.method2549(local50);
				} else {
					local50.anInt341 = local58;
					this.method2552(local50.aClass5_338, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V")
	private void method2553(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class5_Sub16 local5 = (Class5_Sub16) this.aClass102_25.method1916(); local5 != null; local5 = (Class5_Sub16) this.aClass102_25.method1915()) {
			local5.method8740(arg0);
		}
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(Lclient!fq;)V")
	public synchronized void method2554(@OriginalArg(0) Class5_Sub16 arg0) {
		arg0.method9327(1);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!fq;)V")
	public synchronized void method2555(@OriginalArg(0) Class5_Sub16 arg0) {
		this.aClass102_25.method1929(arg0);
	}
}
