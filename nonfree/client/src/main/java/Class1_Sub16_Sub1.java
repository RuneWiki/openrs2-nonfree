import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fea")
public final class Class1_Sub16_Sub1 extends Class1_Sub16 {

	@OriginalMember(owner = "client!fea", name = "n", descriptor = "Lclient!bv;")
	private final Class37 aClass37_33 = new Class37();

	@OriginalMember(owner = "client!fea", name = "o", descriptor = "Lclient!bv;")
	private final Class37 aClass37_34 = new Class37();

	@OriginalMember(owner = "client!fea", name = "p", descriptor = "I")
	private int anInt2636 = -1;

	@OriginalMember(owner = "client!fea", name = "q", descriptor = "I")
	private int anInt2637 = 0;

	@OriginalMember(owner = "client!fea", name = "e", descriptor = "()I")
	public synchronized int method2230() {
		return this.aClass37_33.method965();
	}

	@OriginalMember(owner = "client!fea", name = "d", descriptor = "()Lclient!gv;")
	@Override
	public Class1_Sub16 method5752() {
		return (Class1_Sub16) this.aClass37_33.method971();
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lclient!gv;)V")
	public synchronized void method2231(@OriginalArg(0) Class1_Sub16 arg0) {
		arg0.method7525();
	}

	@OriginalMember(owner = "client!fea", name = "f", descriptor = "()V")
	private void method2232() {
		if (this.anInt2637 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub19 local8 = (Class1_Sub19) this.aClass37_34.method977(); local8 != null; local8 = (Class1_Sub19) this.aClass37_34.method971()) {
			local8.anInt2787 -= this.anInt2637;
		}
		this.anInt2636 -= this.anInt2637;
		this.anInt2637 = 0;
	}

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method5753(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt2636 < 0) {
				this.method2235(arg0, arg1, arg2);
				return;
			}
			if (this.anInt2637 + arg2 < this.anInt2636) {
				this.anInt2637 += arg2;
				this.method2235(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt2636 - this.anInt2637;
			this.method2235(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2637 += local33;
			this.method2232();
			@Pc(60) Class1_Sub19 local60 = (Class1_Sub19) this.aClass37_34.method977();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method2379(this);
				if (local68 < 0) {
					local60.anInt2787 = 0;
					this.method2233(local60);
				} else {
					local60.anInt2787 = local68;
					this.method2237(local60.aClass1_284, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lclient!ga;)V")
	private void method2233(@OriginalArg(0) Class1_Sub19 arg0) {
		arg0.method7525();
		arg0.method2378();
		@Pc(9) Class1 local9 = this.aClass37_34.aClass1_47.aClass1_284;
		if (local9 == this.aClass37_34.aClass1_47) {
			this.anInt2636 = -1;
		} else {
			this.anInt2636 = ((Class1_Sub19) local9).anInt2787;
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method5754(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2636 < 0) {
				this.method2234(arg0);
				return;
			}
			if (this.anInt2637 + arg0 < this.anInt2636) {
				this.anInt2637 += arg0;
				this.method2234(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2636 - this.anInt2637;
			this.method2234(local29);
			arg0 -= local29;
			this.anInt2637 += local29;
			this.method2232();
			@Pc(50) Class1_Sub19 local50 = (Class1_Sub19) this.aClass37_34.method977();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method2379(this);
				if (local58 < 0) {
					local50.anInt2787 = 0;
					this.method2233(local50);
				} else {
					local50.anInt2787 = local58;
					this.method2237(local50.aClass1_284, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "(I)V")
	private void method2234(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub16 local5 = (Class1_Sub16) this.aClass37_33.method977(); local5 != null; local5 = (Class1_Sub16) this.aClass37_33.method971()) {
			local5.method5754(arg0);
		}
	}

	@OriginalMember(owner = "client!fea", name = "c", descriptor = "([III)V")
	private void method2235(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub16 local5 = (Class1_Sub16) this.aClass37_33.method977(); local5 != null; local5 = (Class1_Sub16) this.aClass37_33.method971()) {
			local5.method5750(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "(Lclient!gv;)V")
	public synchronized void method2236(@OriginalArg(0) Class1_Sub16 arg0) {
		this.aClass37_33.method976(arg0);
	}

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "()I")
	@Override
	public int method5749() {
		return 0;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "()Lclient!gv;")
	@Override
	public Class1_Sub16 method5748() {
		return (Class1_Sub16) this.aClass37_33.method977();
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lclient!um;Lclient!ga;)V")
	private void method2237(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub19 arg1) {
		while (arg0 != this.aClass37_34.aClass1_47 && ((Class1_Sub19) arg0).anInt2787 <= arg1.anInt2787) {
			arg0 = arg0.aClass1_284;
		}
		Static83.method1449(arg0, arg1);
		this.anInt2636 = ((Class1_Sub19) this.aClass37_34.aClass1_47.aClass1_284).anInt2787;
	}
}
