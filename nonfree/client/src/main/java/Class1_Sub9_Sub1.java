import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class1_Sub9_Sub1 extends Class1_Sub9 {

	@OriginalMember(owner = "client!po", name = "r", descriptor = "Lclient!am;")
	private final Class14 aClass14_35 = new Class14();

	@OriginalMember(owner = "client!po", name = "s", descriptor = "Lclient!am;")
	private final Class14 aClass14_36 = new Class14();

	@OriginalMember(owner = "client!po", name = "t", descriptor = "I")
	private int anInt5331 = -1;

	@OriginalMember(owner = "client!po", name = "u", descriptor = "I")
	private int anInt5332 = 0;

	@OriginalMember(owner = "client!po", name = "d", descriptor = "()Lclient!cv;")
	@Override
	public Class1_Sub9 method5014() {
		return (Class1_Sub9) this.aClass14_35.method208();
	}

	@OriginalMember(owner = "client!po", name = "e", descriptor = "()V")
	private void method4256() {
		if (this.anInt5332 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub26 local8 = (Class1_Sub26) this.aClass14_36.method203(); local8 != null; local8 = (Class1_Sub26) this.aClass14_36.method208()) {
			local8.anInt3797 -= this.anInt5332;
		}
		this.anInt5331 -= this.anInt5332;
		this.anInt5332 = 0;
	}

	@OriginalMember(owner = "client!po", name = "c", descriptor = "([III)V")
	private void method4257(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub9 local5 = (Class1_Sub9) this.aClass14_35.method203(); local5 != null; local5 = (Class1_Sub9) this.aClass14_35.method208()) {
			local5.method5015(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!po", name = "f", descriptor = "()I")
	public synchronized int method4258() {
		return this.aClass14_35.method213();
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!ju;)V")
	private void method4259(@OriginalArg(0) Class1_Sub26 arg0) {
		arg0.method5953();
		arg0.method2983();
		@Pc(9) Class1 local9 = this.aClass14_36.aClass1_5.aClass1_267;
		if (local9 == this.aClass14_36.aClass1_5) {
			this.anInt5331 = -1;
		} else {
			this.anInt5331 = ((Class1_Sub26) local9).anInt3797;
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method5016(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt5331 < 0) {
				this.method4262(arg0);
				return;
			}
			if (this.anInt5332 + arg0 < this.anInt5331) {
				this.anInt5332 += arg0;
				this.method4262(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt5331 - this.anInt5332;
			this.method4262(local29);
			arg0 -= local29;
			this.anInt5332 += local29;
			this.method4256();
			@Pc(50) Class1_Sub26 local50 = (Class1_Sub26) this.aClass14_36.method203();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method2984(this);
				if (local58 < 0) {
					local50.anInt3797 = 0;
					this.method4259(local50);
				} else {
					local50.anInt3797 = local58;
					this.method4261(local50.aClass1_267, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!cv;)V")
	public synchronized void method4260(@OriginalArg(0) Class1_Sub9 arg0) {
		this.aClass14_35.method206(arg0);
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "()I")
	@Override
	public int method5011() {
		return 0;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5012(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt5331 < 0) {
				this.method4257(arg0, arg1, arg2);
				return;
			}
			if (this.anInt5332 + arg2 < this.anInt5331) {
				this.anInt5332 += arg2;
				this.method4257(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt5331 - this.anInt5332;
			this.method4257(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt5332 += local33;
			this.method4256();
			@Pc(60) Class1_Sub26 local60 = (Class1_Sub26) this.aClass14_36.method203();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method2984(this);
				if (local68 < 0) {
					local60.anInt3797 = 0;
					this.method4259(local60);
				} else {
					local60.anInt3797 = local68;
					this.method4261(local60.aClass1_267, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!ev;Lclient!ju;)V")
	private void method4261(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub26 arg1) {
		while (arg0 != this.aClass14_36.aClass1_5 && ((Class1_Sub26) arg0).anInt3797 <= arg1.anInt3797) {
			arg0 = arg0.aClass1_267;
		}
		Static445.method5627(arg1, arg0);
		this.anInt5331 = ((Class1_Sub26) this.aClass14_36.aClass1_5.aClass1_267).anInt3797;
	}

	@OriginalMember(owner = "client!po", name = "e", descriptor = "(I)V")
	private void method4262(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub9 local5 = (Class1_Sub9) this.aClass14_35.method203(); local5 != null; local5 = (Class1_Sub9) this.aClass14_35.method208()) {
			local5.method5016(arg0);
		}
	}

	@OriginalMember(owner = "client!po", name = "c", descriptor = "()Lclient!cv;")
	@Override
	public Class1_Sub9 method5013() {
		return (Class1_Sub9) this.aClass14_35.method203();
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(Lclient!cv;)V")
	public synchronized void method4263(@OriginalArg(0) Class1_Sub9 arg0) {
		arg0.method5953();
	}
}
