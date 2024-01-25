import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class2_Sub3_Sub1 extends Class2_Sub3 {

	@OriginalMember(owner = "client!er", name = "o", descriptor = "Lclient!ar;")
	private final Class14 aClass14_18 = new Class14();

	@OriginalMember(owner = "client!er", name = "p", descriptor = "Lclient!ar;")
	private final Class14 aClass14_19 = new Class14();

	@OriginalMember(owner = "client!er", name = "q", descriptor = "I")
	private int anInt2329 = 0;

	@OriginalMember(owner = "client!er", name = "r", descriptor = "I")
	private int anInt2330 = -1;

	@OriginalMember(owner = "client!er", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4619(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt2330 < 0) {
				this.method1824(arg0, arg1, arg2);
				return;
			}
			if (this.anInt2329 + arg2 < this.anInt2330) {
				this.anInt2329 += arg2;
				this.method1824(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt2330 - this.anInt2329;
			this.method1824(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2329 += local33;
			this.method1825();
			@Pc(60) Class2_Sub8 local60 = (Class2_Sub8) this.aClass14_19.method309();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method548(this);
				if (local68 < 0) {
					local60.anInt645 = 0;
					this.method1823(local60);
				} else {
					local60.anInt645 = local68;
					this.method1822(local60.aClass2_261, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!er", name = "e", descriptor = "()I")
	public synchronized int method1821() {
		return this.aClass14_18.method297();
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "()Lclient!ad;")
	@Override
	public Class2_Sub3 method4615() {
		return (Class2_Sub3) this.aClass14_18.method309();
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "()I")
	@Override
	public int method4613() {
		return 0;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!uj;Lclient!bp;)V")
	private void method1822(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub8 arg1) {
		while (arg0 != this.aClass14_19.aClass2_17 && ((Class2_Sub8) arg0).anInt645 <= arg1.anInt645) {
			arg0 = arg0.aClass2_261;
		}
		Static219.method3438(arg0, arg1);
		this.anInt2330 = ((Class2_Sub8) this.aClass14_19.aClass2_17.aClass2_261).anInt645;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!bp;)V")
	private void method1823(@OriginalArg(0) Class2_Sub8 arg0) {
		arg0.method5866();
		arg0.method549();
		@Pc(9) Class2 local9 = this.aClass14_19.aClass2_17.aClass2_261;
		if (local9 == this.aClass14_19.aClass2_17) {
			this.anInt2330 = -1;
		} else {
			this.anInt2330 = ((Class2_Sub8) local9).anInt645;
		}
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "([III)V")
	private void method1824(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class2_Sub3 local5 = (Class2_Sub3) this.aClass14_18.method309(); local5 != null; local5 = (Class2_Sub3) this.aClass14_18.method311()) {
			local5.method4617(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!er", name = "d", descriptor = "()Lclient!ad;")
	@Override
	public Class2_Sub3 method4618() {
		return (Class2_Sub3) this.aClass14_18.method311();
	}

	@OriginalMember(owner = "client!er", name = "f", descriptor = "()V")
	private void method1825() {
		if (this.anInt2329 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub8 local8 = (Class2_Sub8) this.aClass14_19.method309(); local8 != null; local8 = (Class2_Sub8) this.aClass14_19.method311()) {
			local8.anInt645 -= this.anInt2329;
		}
		this.anInt2330 -= this.anInt2329;
		this.anInt2329 = 0;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!ad;)V")
	public synchronized void method1826(@OriginalArg(0) Class2_Sub3 arg0) {
		arg0.method5866();
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method4616(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2330 < 0) {
				this.method1828(arg0);
				return;
			}
			if (this.anInt2329 + arg0 < this.anInt2330) {
				this.anInt2329 += arg0;
				this.method1828(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2330 - this.anInt2329;
			this.method1828(local29);
			arg0 -= local29;
			this.anInt2329 += local29;
			this.method1825();
			@Pc(50) Class2_Sub8 local50 = (Class2_Sub8) this.aClass14_19.method309();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method548(this);
				if (local58 < 0) {
					local50.anInt645 = 0;
					this.method1823(local50);
				} else {
					local50.anInt645 = local58;
					this.method1822(local50.aClass2_261, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(Lclient!ad;)V")
	public synchronized void method1827(@OriginalArg(0) Class2_Sub3 arg0) {
		this.aClass14_18.method308(arg0);
	}

	@OriginalMember(owner = "client!er", name = "d", descriptor = "(I)V")
	private void method1828(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class2_Sub3 local5 = (Class2_Sub3) this.aClass14_18.method309(); local5 != null; local5 = (Class2_Sub3) this.aClass14_18.method311()) {
			local5.method4616(arg0);
		}
	}
}
