import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class4_Sub7_Sub4 extends Class4_Sub7 {

	@OriginalMember(owner = "client!tc", name = "s", descriptor = "Lclient!gw;")
	private final Class91 aClass91_47 = new Class91();

	@OriginalMember(owner = "client!tc", name = "t", descriptor = "Lclient!gw;")
	private final Class91 aClass91_48 = new Class91();

	@OriginalMember(owner = "client!tc", name = "u", descriptor = "I")
	private int anInt6775 = 0;

	@OriginalMember(owner = "client!tc", name = "v", descriptor = "I")
	private int anInt6776 = -1;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method5465(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt6776 < 0) {
				this.method5470(arg0);
				return;
			}
			if (this.anInt6775 + arg0 < this.anInt6776) {
				this.anInt6775 += arg0;
				this.method5470(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt6776 - this.anInt6775;
			this.method5470(local29);
			arg0 -= local29;
			this.anInt6775 += local29;
			this.method5475();
			@Pc(50) Class4_Sub26 local50 = (Class4_Sub26) this.aClass91_48.method2584();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method4040(this);
				if (local58 < 0) {
					local50.anInt4745 = 0;
					this.method5472(local50);
				} else {
					local50.anInt4745 = local58;
					this.method5477(local50.aClass4_269, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
	private void method5470(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class4_Sub7 local5 = (Class4_Sub7) this.aClass91_47.method2584(); local5 != null; local5 = (Class4_Sub7) this.aClass91_47.method2586()) {
			local5.method5465(arg0);
		}
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "()Lclient!po;")
	@Override
	public Class4_Sub7 method5468() {
		return (Class4_Sub7) this.aClass91_47.method2586();
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "([III)V")
	private void method5471(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class4_Sub7 local5 = (Class4_Sub7) this.aClass91_47.method2584(); local5 != null; local5 = (Class4_Sub7) this.aClass91_47.method2586()) {
			local5.method5467(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!mg;)V")
	private void method5472(@OriginalArg(0) Class4_Sub26 arg0) {
		arg0.method6330();
		arg0.method4039();
		@Pc(9) Class4 local9 = this.aClass91_48.aClass4_103.aClass4_269;
		if (local9 == this.aClass91_48.aClass4_103) {
			this.anInt6776 = -1;
		} else {
			this.anInt6776 = ((Class4_Sub26) local9).anInt4745;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!po;)V")
	public synchronized void method5473(@OriginalArg(0) Class4_Sub7 arg0) {
		this.aClass91_47.method2574(arg0);
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(Lclient!po;)V")
	public synchronized void method5474(@OriginalArg(0) Class4_Sub7 arg0) {
		arg0.method6330();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "()I")
	@Override
	public int method5464() {
		return 0;
	}

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "()V")
	private void method5475() {
		if (this.anInt6775 <= 0) {
			return;
		}
		for (@Pc(8) Class4_Sub26 local8 = (Class4_Sub26) this.aClass91_48.method2584(); local8 != null; local8 = (Class4_Sub26) this.aClass91_48.method2586()) {
			local8.anInt4745 -= this.anInt6775;
		}
		this.anInt6776 -= this.anInt6775;
		this.anInt6775 = 0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5463(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt6776 < 0) {
				this.method5471(arg0, arg1, arg2);
				return;
			}
			if (this.anInt6775 + arg2 < this.anInt6776) {
				this.anInt6775 += arg2;
				this.method5471(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt6776 - this.anInt6775;
			this.method5471(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt6775 += local33;
			this.method5475();
			@Pc(60) Class4_Sub26 local60 = (Class4_Sub26) this.aClass91_48.method2584();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method4040(this);
				if (local68 < 0) {
					local60.anInt4745 = 0;
					this.method5472(local60);
				} else {
					local60.anInt4745 = local68;
					this.method5477(local60.aClass4_269, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "()I")
	public synchronized int method5476() {
		return this.aClass91_47.method2573();
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "()Lclient!po;")
	@Override
	public Class4_Sub7 method5466() {
		return (Class4_Sub7) this.aClass91_47.method2584();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!ha;Lclient!mg;)V")
	private void method5477(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4_Sub26 arg1) {
		while (arg0 != this.aClass91_48.aClass4_103 && ((Class4_Sub26) arg0).anInt4745 <= arg1.anInt4745) {
			arg0 = arg0.aClass4_269;
		}
		Static113.method2203(arg1, arg0);
		this.anInt6776 = ((Class4_Sub26) this.aClass91_48.aClass4_103.aClass4_269).anInt4745;
	}
}
