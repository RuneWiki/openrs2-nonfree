import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class1_Sub5_Sub1 extends Class1_Sub5 {

	@OriginalMember(owner = "client!bh", name = "r", descriptor = "Lclient!ko;")
	private final Class142 aClass142_6 = new Class142();

	@OriginalMember(owner = "client!bh", name = "s", descriptor = "Lclient!ko;")
	private final Class142 aClass142_7 = new Class142();

	@OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
	private int anInt478 = 0;

	@OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
	private int anInt479 = -1;

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "()I")
	public synchronized int method416() {
		return this.aClass142_6.method3208();
	}

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "()V")
	private void method417() {
		if (this.anInt478 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub23 local8 = (Class1_Sub23) this.aClass142_7.method3199(); local8 != null; local8 = (Class1_Sub23) this.aClass142_7.method3198()) {
			local8.anInt3471 -= this.anInt478;
		}
		this.anInt479 -= this.anInt478;
		this.anInt478 = 0;
	}

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "()Lclient!ei;")
	@Override
	public Class1_Sub5 method4447() {
		return (Class1_Sub5) this.aClass142_6.method3198();
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "()I")
	@Override
	public int method4441() {
		return 0;
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method4445(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt479 < 0) {
				this.method421(arg0);
				return;
			}
			if (this.anInt478 + arg0 < this.anInt479) {
				this.anInt478 += arg0;
				this.method421(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt479 - this.anInt478;
			this.method421(local29);
			arg0 -= local29;
			this.anInt478 += local29;
			this.method417();
			@Pc(50) Class1_Sub23 local50 = (Class1_Sub23) this.aClass142_7.method3199();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method2979(this);
				if (local58 < 0) {
					local50.anInt3471 = 0;
					this.method418(local50);
				} else {
					local50.anInt3471 = local58;
					this.method420(local50.aClass1_262, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!jj;)V")
	private void method418(@OriginalArg(0) Class1_Sub23 arg0) {
		arg0.method5965();
		arg0.method2978();
		@Pc(9) Class1 local9 = this.aClass142_7.aClass1_143.aClass1_262;
		if (local9 == this.aClass142_7.aClass1_143) {
			this.anInt479 = -1;
		} else {
			this.anInt479 = ((Class1_Sub23) local9).anInt3471;
		}
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "([III)V")
	private void method419(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub5 local5 = (Class1_Sub5) this.aClass142_6.method3199(); local5 != null; local5 = (Class1_Sub5) this.aClass142_6.method3198()) {
			local5.method4443(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!oo;Lclient!jj;)V")
	private void method420(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub23 arg1) {
		while (arg0 != this.aClass142_7.aClass1_143 && ((Class1_Sub23) arg0).anInt3471 <= arg1.anInt3471) {
			arg0 = arg0.aClass1_262;
		}
		Static158.method2502(arg1, arg0);
		this.anInt479 = ((Class1_Sub23) this.aClass142_7.aClass1_143.aClass1_262).anInt3471;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "()Lclient!ei;")
	@Override
	public Class1_Sub5 method4442() {
		return (Class1_Sub5) this.aClass142_6.method3199();
	}

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)V")
	private void method421(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub5 local5 = (Class1_Sub5) this.aClass142_6.method3199(); local5 != null; local5 = (Class1_Sub5) this.aClass142_6.method3198()) {
			local5.method4445(arg0);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!ei;)V")
	public synchronized void method422(@OriginalArg(0) Class1_Sub5 arg0) {
		this.aClass142_6.method3207(arg0);
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4446(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt479 < 0) {
				this.method419(arg0, arg1, arg2);
				return;
			}
			if (this.anInt478 + arg2 < this.anInt479) {
				this.anInt478 += arg2;
				this.method419(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt479 - this.anInt478;
			this.method419(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt478 += local33;
			this.method417();
			@Pc(60) Class1_Sub23 local60 = (Class1_Sub23) this.aClass142_7.method3199();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method2979(this);
				if (local68 < 0) {
					local60.anInt3471 = 0;
					this.method418(local60);
				} else {
					local60.anInt3471 = local68;
					this.method420(local60.aClass1_262, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(Lclient!ei;)V")
	public synchronized void method423(@OriginalArg(0) Class1_Sub5 arg0) {
		arg0.method5965();
	}
}
