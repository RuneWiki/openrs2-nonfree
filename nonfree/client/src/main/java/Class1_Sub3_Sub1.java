import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class1_Sub3_Sub1 extends Class1_Sub3 {

	@OriginalMember(owner = "client!aj", name = "u", descriptor = "Lclient!s;")
	private final Class87 aClass87_4 = new Class87();

	@OriginalMember(owner = "client!aj", name = "v", descriptor = "Lclient!s;")
	private final Class87 aClass87_5 = new Class87();

	@OriginalMember(owner = "client!aj", name = "x", descriptor = "I")
	private int anInt267 = -1;

	@OriginalMember(owner = "client!aj", name = "w", descriptor = "I")
	private int anInt266 = 0;

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method2858(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt267 < 0) {
				this.method277(arg0);
				return;
			}
			if (this.anInt266 + arg0 < this.anInt267) {
				this.anInt266 += arg0;
				this.method277(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt267 - this.anInt266;
			this.method277(local29);
			arg0 -= local29;
			this.anInt266 += local29;
			this.method276();
			@Pc(50) Class1_Sub18 local50 = (Class1_Sub18) this.aClass87_5.method2827();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method2132(this);
				if (local58 < 0) {
					local50.anInt2798 = 0;
					this.method272(local50);
				} else {
					local50.anInt2798 = local58;
					this.method274(local50.aClass1_214, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2855(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt267 < 0) {
				this.method273(arg0, arg1, arg2);
				return;
			}
			if (this.anInt266 + arg2 < this.anInt267) {
				this.anInt266 += arg2;
				this.method273(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt267 - this.anInt266;
			this.method273(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt266 += local33;
			this.method276();
			@Pc(60) Class1_Sub18 local60 = (Class1_Sub18) this.aClass87_5.method2827();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method2132(this);
				if (local68 < 0) {
					local60.anInt2798 = 0;
					this.method272(local60);
				} else {
					local60.anInt2798 = local68;
					this.method274(local60.aClass1_214, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!nc;)V")
	private void method272(@OriginalArg(0) Class1_Sub18 arg0) {
		arg0.method3563();
		arg0.method2133();
		@Pc(9) Class1 local9 = this.aClass87_5.aClass1_163.aClass1_214;
		if (local9 == this.aClass87_5.aClass1_163) {
			this.anInt267 = -1;
		} else {
			this.anInt267 = ((Class1_Sub18) local9).anInt2798;
		}
	}

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "([III)V")
	private void method273(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub3 local5 = (Class1_Sub3) this.aClass87_4.method2827(); local5 != null; local5 = (Class1_Sub3) this.aClass87_4.method2830()) {
			local5.method2857(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!rb;Lclient!nc;)V")
	private void method274(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub18 arg1) {
		while (arg0 != this.aClass87_5.aClass1_163 && ((Class1_Sub18) arg0).anInt2798 <= arg1.anInt2798) {
			arg0 = arg0.aClass1_214;
		}
		this.aClass87_5.method2835(arg1, arg0);
		this.anInt267 = ((Class1_Sub18) this.aClass87_5.aClass1_163.aClass1_214).anInt2798;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!rd;)V")
	public synchronized void method275(@OriginalArg(0) Class1_Sub3 arg0) {
		this.aClass87_4.method2824(arg0);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "()Lclient!rd;")
	@Override
	public Class1_Sub3 method2854() {
		return (Class1_Sub3) this.aClass87_4.method2827();
	}

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "()V")
	private void method276() {
		if (this.anInt266 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub18 local8 = (Class1_Sub18) this.aClass87_5.method2827(); local8 != null; local8 = (Class1_Sub18) this.aClass87_5.method2830()) {
			local8.anInt2798 -= this.anInt266;
		}
		this.anInt267 -= this.anInt266;
		this.anInt266 = 0;
	}

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "()Lclient!rd;")
	@Override
	public Class1_Sub3 method2860() {
		return (Class1_Sub3) this.aClass87_4.method2830();
	}

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "(I)V")
	private void method277(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub3 local5 = (Class1_Sub3) this.aClass87_4.method2827(); local5 != null; local5 = (Class1_Sub3) this.aClass87_4.method2830()) {
			local5.method2858(arg0);
		}
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(Lclient!rd;)V")
	public synchronized void method278(@OriginalArg(0) Class1_Sub3 arg0) {
		arg0.method3563();
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "()I")
	@Override
	public int method2856() {
		return 0;
	}
}
