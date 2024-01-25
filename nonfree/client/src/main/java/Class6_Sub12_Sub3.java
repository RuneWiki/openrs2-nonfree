import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class6_Sub12_Sub3 extends Class6_Sub12 {

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "Lclient!vq;")
	private final Class211 aClass211_34 = new Class211();

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "Lclient!vq;")
	private final Class211 aClass211_35 = new Class211();

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
	private int anInt5386 = -1;

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
	private int anInt5387 = 0;

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method5654(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt5386 < 0) {
				this.method4903(arg0);
				return;
			}
			if (this.anInt5387 + arg0 < this.anInt5386) {
				this.anInt5387 += arg0;
				this.method4903(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt5386 - this.anInt5387;
			this.method4903(local29);
			arg0 -= local29;
			this.anInt5387 += local29;
			this.method4899();
			@Pc(50) Class6_Sub36 local50 = (Class6_Sub36) this.aClass211_35.method5594();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method5096(this);
				if (local58 < 0) {
					local50.anInt5618 = 0;
					this.method4905(local50);
				} else {
					local50.anInt5618 = local58;
					this.method4900(local50.aClass6_248, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "()V")
	private void method4899() {
		if (this.anInt5387 <= 0) {
			return;
		}
		for (@Pc(8) Class6_Sub36 local8 = (Class6_Sub36) this.aClass211_35.method5594(); local8 != null; local8 = (Class6_Sub36) this.aClass211_35.method5582()) {
			local8.anInt5618 -= this.anInt5387;
		}
		this.anInt5386 -= this.anInt5387;
		this.anInt5387 = 0;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!on;Lclient!tb;)V")
	private void method4900(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class6_Sub36 arg1) {
		while (arg0 != this.aClass211_35.aClass6_237 && ((Class6_Sub36) arg0).anInt5618 <= arg1.anInt5618) {
			arg0 = arg0.aClass6_248;
		}
		Static11.method200(arg0, arg1);
		this.anInt5386 = ((Class6_Sub36) this.aClass211_35.aClass6_237.aClass6_248).anInt5618;
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "([III)V")
	private void method4901(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class6_Sub12 local5 = (Class6_Sub12) this.aClass211_34.method5594(); local5 != null; local5 = (Class6_Sub12) this.aClass211_34.method5582()) {
			local5.method5653(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method5657(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt5386 < 0) {
				this.method4901(arg0, arg1, arg2);
				return;
			}
			if (this.anInt5387 + arg2 < this.anInt5386) {
				this.anInt5387 += arg2;
				this.method4901(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt5386 - this.anInt5387;
			this.method4901(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt5387 += local33;
			this.method4899();
			@Pc(60) Class6_Sub36 local60 = (Class6_Sub36) this.aClass211_35.method5594();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method5096(this);
				if (local68 < 0) {
					local60.anInt5618 = 0;
					this.method4905(local60);
				} else {
					local60.anInt5618 = local68;
					this.method4900(local60.aClass6_248, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!wm;)V")
	public synchronized void method4902(@OriginalArg(0) Class6_Sub12 arg0) {
		arg0.method5756();
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)V")
	private void method4903(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class6_Sub12 local5 = (Class6_Sub12) this.aClass211_34.method5594(); local5 != null; local5 = (Class6_Sub12) this.aClass211_34.method5582()) {
			local5.method5654(arg0);
		}
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(Lclient!wm;)V")
	public synchronized void method4904(@OriginalArg(0) Class6_Sub12 arg0) {
		this.aClass211_34.method5588(arg0);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "()Lclient!wm;")
	@Override
	public Class6_Sub12 method5652() {
		return (Class6_Sub12) this.aClass211_34.method5594();
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "()I")
	@Override
	public int method5656() {
		return 0;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!tb;)V")
	private void method4905(@OriginalArg(0) Class6_Sub36 arg0) {
		arg0.method5756();
		arg0.method5097();
		@Pc(9) Class6 local9 = this.aClass211_35.aClass6_237.aClass6_248;
		if (local9 == this.aClass211_35.aClass6_237) {
			this.anInt5386 = -1;
		} else {
			this.anInt5386 = ((Class6_Sub36) local9).anInt5618;
		}
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "()Lclient!wm;")
	@Override
	public Class6_Sub12 method5655() {
		return (Class6_Sub12) this.aClass211_34.method5582();
	}
}
