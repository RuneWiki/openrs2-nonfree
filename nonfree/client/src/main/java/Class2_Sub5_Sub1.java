import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class2_Sub5_Sub1 extends Class2_Sub5 {

	@OriginalMember(owner = "client!be", name = "x", descriptor = "Lclient!a;")
	private Class1 aClass1_2 = new Class1();

	@OriginalMember(owner = "client!be", name = "y", descriptor = "Lclient!a;")
	private Class1 aClass1_3 = new Class1();

	@OriginalMember(owner = "client!be", name = "A", descriptor = "I")
	private int anInt457 = -1;

	@OriginalMember(owner = "client!be", name = "z", descriptor = "I")
	private int anInt456 = 0;

	@OriginalMember(owner = "client!be", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method3550(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt457 < 0) {
				this.method405(arg0, arg1, arg2);
				return;
			}
			if (this.anInt456 + arg2 < this.anInt457) {
				this.anInt456 += arg2;
				this.method405(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt457 - this.anInt456;
			this.method405(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt456 += local33;
			this.method401();
			@Pc(60) Class2_Sub8 local60 = (Class2_Sub8) this.aClass1_3.method13();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method1058(this);
				if (local68 < 0) {
					local60.anInt1232 = 0;
					this.method406(local60);
				} else {
					local60.anInt1232 = local68;
					this.method407(local60.aClass2_231, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!be", name = "f", descriptor = "()V")
	private void method401() {
		if (this.anInt456 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub8 local8 = (Class2_Sub8) this.aClass1_3.method13(); local8 != null; local8 = (Class2_Sub8) this.aClass1_3.method9()) {
			local8.anInt1232 -= this.anInt456;
		}
		this.anInt457 -= this.anInt456;
		this.anInt456 = 0;
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "()Lclient!md;")
	@Override
	public Class2_Sub5 method3551() {
		return (Class2_Sub5) this.aClass1_2.method9();
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(I)V")
	private void method402(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class2_Sub5 local5 = (Class2_Sub5) this.aClass1_2.method13(); local5 != null; local5 = (Class2_Sub5) this.aClass1_2.method9()) {
			local5.method3546(arg0);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!md;)V")
	public synchronized void method403(@OriginalArg(0) Class2_Sub5 arg0) {
		this.aClass1_2.method8(arg0);
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "()Lclient!md;")
	@Override
	public Class2_Sub5 method3548() {
		return (Class2_Sub5) this.aClass1_2.method13();
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "()I")
	@Override
	public int method3549() {
		return 0;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(Lclient!md;)V")
	public synchronized void method404(@OriginalArg(0) Class2_Sub5 arg0) {
		arg0.method4926();
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "([III)V")
	private void method405(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class2_Sub5 local5 = (Class2_Sub5) this.aClass1_2.method13(); local5 != null; local5 = (Class2_Sub5) this.aClass1_2.method9()) {
			local5.method3547(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method3546(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt457 < 0) {
				this.method402(arg0);
				return;
			}
			if (this.anInt456 + arg0 < this.anInt457) {
				this.anInt456 += arg0;
				this.method402(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt457 - this.anInt456;
			this.method402(local29);
			arg0 -= local29;
			this.anInt456 += local29;
			this.method401();
			@Pc(50) Class2_Sub8 local50 = (Class2_Sub8) this.aClass1_3.method13();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1058(this);
				if (local58 < 0) {
					local50.anInt1232 = 0;
					this.method406(local50);
				} else {
					local50.anInt1232 = local58;
					this.method407(local50.aClass2_231, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!ea;)V")
	private void method406(@OriginalArg(0) Class2_Sub8 arg0) {
		arg0.method4926();
		arg0.method1059();
		@Pc(9) Class2 local9 = this.aClass1_3.aClass2_1.aClass2_231;
		if (local9 == this.aClass1_3.aClass2_1) {
			this.anInt457 = -1;
		} else {
			this.anInt457 = ((Class2_Sub8) local9).anInt1232;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!ma;Lclient!ea;)V")
	private void method407(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub8 arg1) {
		while (arg0 != this.aClass1_3.aClass2_1 && ((Class2_Sub8) arg0).anInt1232 <= arg1.anInt1232) {
			arg0 = arg0.aClass2_231;
		}
		Static254.method4111(arg1, arg0);
		this.anInt457 = ((Class2_Sub8) this.aClass1_3.aClass2_1.aClass2_231).anInt1232;
	}
}
