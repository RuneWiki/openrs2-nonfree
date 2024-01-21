import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class1_Sub11_Sub3 extends Class1_Sub11 {

	@OriginalMember(owner = "client!ub", name = "y", descriptor = "Lclient!n;")
	private final Class56 aClass56_17 = new Class56();

	@OriginalMember(owner = "client!ub", name = "z", descriptor = "Lclient!n;")
	private final Class56 aClass56_18 = new Class56();

	@OriginalMember(owner = "client!ub", name = "A", descriptor = "I")
	private int anInt3997 = -1;

	@OriginalMember(owner = "client!ub", name = "B", descriptor = "I")
	private int anInt3998 = 0;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "([III)V")
	private void method2814(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub11 local5 = (Class1_Sub11) this.aClass56_17.method1853(); local5 != null; local5 = (Class1_Sub11) this.aClass56_17.method1855()) {
			local5.method2934(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!hb;Lclient!u;)V")
	private void method2815(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub23 arg1) {
		while (arg0 != this.aClass56_18.aClass1_125 && ((Class1_Sub23) arg0).anInt3965 <= arg1.anInt3965) {
			arg0 = arg0.aClass1_210;
		}
		this.aClass56_18.method1845(arg0, arg1);
		this.anInt3997 = ((Class1_Sub23) this.aClass56_18.aClass1_125.aClass1_210).anInt3965;
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "()Lclient!og;")
	@Override
	public Class1_Sub11 method2932() {
		return (Class1_Sub11) this.aClass56_17.method1853();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!u;)V")
	private void method2816(@OriginalArg(0) Class1_Sub23 arg0) {
		arg0.method3141();
		arg0.method2788();
		@Pc(9) Class1 local9 = this.aClass56_18.aClass1_125.aClass1_210;
		if (local9 == this.aClass56_18.aClass1_125) {
			this.anInt3997 = -1;
		} else {
			this.anInt3997 = ((Class1_Sub23) local9).anInt3965;
		}
	}

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V")
	private void method2817(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub11 local5 = (Class1_Sub11) this.aClass56_17.method1853(); local5 != null; local5 = (Class1_Sub11) this.aClass56_17.method1855()) {
			local5.method2935(arg0);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "()I")
	@Override
	public int method2930() {
		return 0;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!og;)V")
	public synchronized void method2818(@OriginalArg(0) Class1_Sub11 arg0) {
		arg0.method3141();
	}

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "()V")
	private void method2819() {
		if (this.anInt3998 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub23 local8 = (Class1_Sub23) this.aClass56_18.method1853(); local8 != null; local8 = (Class1_Sub23) this.aClass56_18.method1855()) {
			local8.anInt3965 -= this.anInt3998;
		}
		this.anInt3997 -= this.anInt3998;
		this.anInt3998 = 0;
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method2935(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt3997 < 0) {
				this.method2817(arg0);
				return;
			}
			if (this.anInt3998 + arg0 < this.anInt3997) {
				this.anInt3998 += arg0;
				this.method2817(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt3997 - this.anInt3998;
			this.method2817(local29);
			arg0 -= local29;
			this.anInt3998 += local29;
			this.method2819();
			@Pc(50) Class1_Sub23 local50 = (Class1_Sub23) this.aClass56_18.method1853();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method2787(this);
				if (local58 < 0) {
					local50.anInt3965 = 0;
					this.method2816(local50);
				} else {
					local50.anInt3965 = local58;
					this.method2815(local50.aClass1_210, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(Lclient!og;)V")
	public synchronized void method2820(@OriginalArg(0) Class1_Sub11 arg0) {
		this.aClass56_17.method1852(arg0);
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "()Lclient!og;")
	@Override
	public Class1_Sub11 method2936() {
		return (Class1_Sub11) this.aClass56_17.method1855();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2933(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt3997 < 0) {
				this.method2814(arg0, arg1, arg2);
				return;
			}
			if (this.anInt3998 + arg2 < this.anInt3997) {
				this.anInt3998 += arg2;
				this.method2814(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt3997 - this.anInt3998;
			this.method2814(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt3998 += local33;
			this.method2819();
			@Pc(60) Class1_Sub23 local60 = (Class1_Sub23) this.aClass56_18.method1853();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method2787(this);
				if (local68 < 0) {
					local60.anInt3965 = 0;
					this.method2816(local60);
				} else {
					local60.anInt3965 = local68;
					this.method2815(local60.aClass1_210, local60);
				}
			}
		} while (arg2 != 0);
	}
}
