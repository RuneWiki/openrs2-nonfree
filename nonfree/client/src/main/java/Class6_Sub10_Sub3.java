import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class6_Sub10_Sub3 extends Class6_Sub10 {

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "Lclient!mfa;")
	private final Class211 aClass211_40 = new Class211();

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "Lclient!mfa;")
	private final Class211 aClass211_41 = new Class211();

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
	private int anInt5513 = -1;

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
	private int anInt5514 = 0;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!cd;)V")
	public synchronized void method4737(@OriginalArg(0) Class6_Sub10 arg0) {
		this.aClass211_40.method5178(arg0);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!mu;Lclient!fd;)V")
	private void method4738(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class6_Sub19 arg1) {
		while (arg0 != this.aClass211_41.aClass6_154 && ((Class6_Sub19) arg0).anInt2947 <= arg1.anInt2947) {
			arg0 = arg0.aClass6_283;
		}
		Static446.method5093(arg1, arg0);
		this.anInt5513 = ((Class6_Sub19) this.aClass211_41.aClass6_154.aClass6_283).anInt2947;
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "([III)V")
	private void method4739(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class6_Sub10 local5 = (Class6_Sub10) this.aClass211_40.method5183(); local5 != null; local5 = (Class6_Sub10) this.aClass211_40.method5177()) {
			local5.method5653(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!fd;)V")
	private void method4740(@OriginalArg(0) Class6_Sub19 arg0) {
		arg0.method8151();
		arg0.method2600();
		@Pc(9) Class6 local9 = this.aClass211_41.aClass6_154.aClass6_283;
		if (local9 == this.aClass211_41.aClass6_154) {
			this.anInt5513 = -1;
		} else {
			this.anInt5513 = ((Class6_Sub19) local9).anInt2947;
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
	private void method4741(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class6_Sub10 local5 = (Class6_Sub10) this.aClass211_40.method5183(); local5 != null; local5 = (Class6_Sub10) this.aClass211_40.method5177()) {
			local5.method5651(arg0);
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "()Lclient!cd;")
	@Override
	public Class6_Sub10 method5655() {
		return (Class6_Sub10) this.aClass211_40.method5177();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method5651(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt5513 < 0) {
				this.method4741(arg0);
				return;
			}
			if (this.anInt5514 + arg0 < this.anInt5513) {
				this.anInt5514 += arg0;
				this.method4741(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt5513 - this.anInt5514;
			this.method4741(local29);
			arg0 -= local29;
			this.anInt5514 += local29;
			this.method4744();
			@Pc(50) Class6_Sub19 local50 = (Class6_Sub19) this.aClass211_41.method5183();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method2599(this);
				if (local58 < 0) {
					local50.anInt2947 = 0;
					this.method4740(local50);
				} else {
					local50.anInt2947 = local58;
					this.method4738(local50.aClass6_283, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "()I")
	@Override
	public int method5652() {
		return 0;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(Lclient!cd;)V")
	public synchronized void method4742(@OriginalArg(0) Class6_Sub10 arg0) {
		arg0.method8151();
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "()I")
	public synchronized int method4743() {
		return this.aClass211_40.method5174();
	}

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "()V")
	private void method4744() {
		if (this.anInt5514 <= 0) {
			return;
		}
		for (@Pc(8) Class6_Sub19 local8 = (Class6_Sub19) this.aClass211_41.method5183(); local8 != null; local8 = (Class6_Sub19) this.aClass211_41.method5177()) {
			local8.anInt2947 -= this.anInt5514;
		}
		this.anInt5513 -= this.anInt5514;
		this.anInt5514 = 0;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method5657(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt5513 < 0) {
				this.method4739(arg0, arg1, arg2);
				return;
			}
			if (this.anInt5514 + arg2 < this.anInt5513) {
				this.anInt5514 += arg2;
				this.method4739(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt5513 - this.anInt5514;
			this.method4739(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt5514 += local33;
			this.method4744();
			@Pc(60) Class6_Sub19 local60 = (Class6_Sub19) this.aClass211_41.method5183();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method2599(this);
				if (local68 < 0) {
					local60.anInt2947 = 0;
					this.method4740(local60);
				} else {
					local60.anInt2947 = local68;
					this.method4738(local60.aClass6_283, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "()Lclient!cd;")
	@Override
	public Class6_Sub10 method5656() {
		return (Class6_Sub10) this.aClass211_40.method5183();
	}
}
