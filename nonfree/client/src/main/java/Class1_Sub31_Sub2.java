import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class1_Sub31_Sub2 extends Class1_Sub31 {

	@OriginalMember(owner = "client!qf", name = "o", descriptor = "Lclient!ar;")
	private final Class14 aClass14_26 = new Class14();

	@OriginalMember(owner = "client!qf", name = "p", descriptor = "Lclient!ar;")
	private final Class14 aClass14_27 = new Class14();

	@OriginalMember(owner = "client!qf", name = "q", descriptor = "I")
	private int anInt5118 = 0;

	@OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
	private int anInt5119 = -1;

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method5516(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt5119 < 0) {
				this.method4446(arg0, arg1, arg2);
				return;
			}
			if (this.anInt5118 + arg2 < this.anInt5119) {
				this.anInt5118 += arg2;
				this.method4446(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt5119 - this.anInt5118;
			this.method4446(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt5118 += local33;
			this.method4442();
			@Pc(60) Class1_Sub7 local60 = (Class1_Sub7) this.aClass14_27.method302();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method601(this);
				if (local68 < 0) {
					local60.anInt659 = 0;
					this.method4443(local60);
				} else {
					local60.anInt659 = local68;
					this.method4445(local60.aClass1_247, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "()V")
	private void method4442() {
		if (this.anInt5118 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub7 local8 = (Class1_Sub7) this.aClass14_27.method302(); local8 != null; local8 = (Class1_Sub7) this.aClass14_27.method313()) {
			local8.anInt659 -= this.anInt5118;
		}
		this.anInt5119 -= this.anInt5118;
		this.anInt5118 = 0;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!cc;)V")
	private void method4443(@OriginalArg(0) Class1_Sub7 arg0) {
		arg0.method5796();
		arg0.method602();
		@Pc(9) Class1 local9 = this.aClass14_27.aClass1_17.aClass1_247;
		if (local9 == this.aClass14_27.aClass1_17) {
			this.anInt5119 = -1;
		} else {
			this.anInt5119 = ((Class1_Sub7) local9).anInt659;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!pl;)V")
	public synchronized void method4444(@OriginalArg(0) Class1_Sub31 arg0) {
		arg0.method5796();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!fb;Lclient!cc;)V")
	private void method4445(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub7 arg1) {
		while (arg0 != this.aClass14_27.aClass1_17 && ((Class1_Sub7) arg0).anInt659 <= arg1.anInt659) {
			arg0 = arg0.aClass1_247;
		}
		Static1.method13(arg1, arg0);
		this.anInt5119 = ((Class1_Sub7) this.aClass14_27.aClass1_17.aClass1_247).anInt659;
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "([III)V")
	private void method4446(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub31 local5 = (Class1_Sub31) this.aClass14_26.method302(); local5 != null; local5 = (Class1_Sub31) this.aClass14_26.method313()) {
			local5.method5515(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "()Lclient!pl;")
	@Override
	public Class1_Sub31 method5517() {
		return (Class1_Sub31) this.aClass14_26.method302();
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "(I)V")
	private void method4447(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub31 local5 = (Class1_Sub31) this.aClass14_26.method302(); local5 != null; local5 = (Class1_Sub31) this.aClass14_26.method313()) {
			local5.method5514(arg0);
		}
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "()Lclient!pl;")
	@Override
	public Class1_Sub31 method5513() {
		return (Class1_Sub31) this.aClass14_26.method313();
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method5514(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt5119 < 0) {
				this.method4447(arg0);
				return;
			}
			if (this.anInt5118 + arg0 < this.anInt5119) {
				this.anInt5118 += arg0;
				this.method4447(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt5119 - this.anInt5118;
			this.method4447(local29);
			arg0 -= local29;
			this.anInt5118 += local29;
			this.method4442();
			@Pc(50) Class1_Sub7 local50 = (Class1_Sub7) this.aClass14_27.method302();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method601(this);
				if (local58 < 0) {
					local50.anInt659 = 0;
					this.method4443(local50);
				} else {
					local50.anInt659 = local58;
					this.method4445(local50.aClass1_247, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(Lclient!pl;)V")
	public synchronized void method4448(@OriginalArg(0) Class1_Sub31 arg0) {
		this.aClass14_26.method306(arg0);
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "()I")
	@Override
	public int method5518() {
		return 0;
	}
}
