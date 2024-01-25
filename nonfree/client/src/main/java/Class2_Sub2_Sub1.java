import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class2_Sub2_Sub1 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ad", name = "s", descriptor = "Lclient!sm;")
	private final Class210 aClass210_1 = new Class210();

	@OriginalMember(owner = "client!ad", name = "t", descriptor = "Lclient!sm;")
	private final Class210 aClass210_2 = new Class210();

	@OriginalMember(owner = "client!ad", name = "u", descriptor = "I")
	private int anInt74 = 0;

	@OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
	private int anInt75 = -1;

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "()Lclient!gh;")
	@Override
	public Class2_Sub2 method4832() {
		return (Class2_Sub2) this.aClass210_1.method5035();
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)V")
	private void method109(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class2_Sub2 local5 = (Class2_Sub2) this.aClass210_1.method5035(); local5 != null; local5 = (Class2_Sub2) this.aClass210_1.method5037()) {
			local5.method4833(arg0);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!gh;)V")
	public synchronized void method110(@OriginalArg(0) Class2_Sub2 arg0) {
		arg0.method5745();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!ag;Lclient!jl;)V")
	private void method111(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub21 arg1) {
		while (arg0 != this.aClass210_2.aClass2_199 && ((Class2_Sub21) arg0).anInt3052 <= arg1.anInt3052) {
			arg0 = arg0.aClass2_244;
		}
		Static335.method5120(arg1, arg0);
		this.anInt75 = ((Class2_Sub21) this.aClass210_2.aClass2_199.aClass2_244).anInt3052;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(Lclient!gh;)V")
	public synchronized void method112(@OriginalArg(0) Class2_Sub2 arg0) {
		this.aClass210_1.method5032(arg0);
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "()I")
	@Override
	public int method4834() {
		return 0;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method4828(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt75 < 0) {
				this.method113(arg0, arg1, arg2);
				return;
			}
			if (this.anInt74 + arg2 < this.anInt75) {
				this.anInt74 += arg2;
				this.method113(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt75 - this.anInt74;
			this.method113(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt74 += local33;
			this.method115();
			@Pc(60) Class2_Sub21 local60 = (Class2_Sub21) this.aClass210_2.method5035();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method2770(this);
				if (local68 < 0) {
					local60.anInt3052 = 0;
					this.method114(local60);
				} else {
					local60.anInt3052 = local68;
					this.method111(local60.aClass2_244, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "()Lclient!gh;")
	@Override
	public Class2_Sub2 method4830() {
		return (Class2_Sub2) this.aClass210_1.method5037();
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method4833(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt75 < 0) {
				this.method109(arg0);
				return;
			}
			if (this.anInt74 + arg0 < this.anInt75) {
				this.anInt74 += arg0;
				this.method109(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt75 - this.anInt74;
			this.method109(local29);
			arg0 -= local29;
			this.anInt74 += local29;
			this.method115();
			@Pc(50) Class2_Sub21 local50 = (Class2_Sub21) this.aClass210_2.method5035();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method2770(this);
				if (local58 < 0) {
					local50.anInt3052 = 0;
					this.method114(local50);
				} else {
					local50.anInt3052 = local58;
					this.method111(local50.aClass2_244, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "([III)V")
	private void method113(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class2_Sub2 local5 = (Class2_Sub2) this.aClass210_1.method5035(); local5 != null; local5 = (Class2_Sub2) this.aClass210_1.method5037()) {
			local5.method4831(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!jl;)V")
	private void method114(@OriginalArg(0) Class2_Sub21 arg0) {
		arg0.method5745();
		arg0.method2769();
		@Pc(9) Class2 local9 = this.aClass210_2.aClass2_199.aClass2_244;
		if (local9 == this.aClass210_2.aClass2_199) {
			this.anInt75 = -1;
		} else {
			this.anInt75 = ((Class2_Sub21) local9).anInt3052;
		}
	}

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "()V")
	private void method115() {
		if (this.anInt74 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub21 local8 = (Class2_Sub21) this.aClass210_2.method5035(); local8 != null; local8 = (Class2_Sub21) this.aClass210_2.method5037()) {
			local8.anInt3052 -= this.anInt74;
		}
		this.anInt75 -= this.anInt74;
		this.anInt74 = 0;
	}
}
