import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sca")
public final class Class1_Sub12_Sub3 extends Class1_Sub12 {

	@OriginalMember(owner = "client!sca", name = "m", descriptor = "Lclient!bu;")
	private final Class38 aClass38_58 = new Class38();

	@OriginalMember(owner = "client!sca", name = "n", descriptor = "Lclient!bu;")
	private final Class38 aClass38_59 = new Class38();

	@OriginalMember(owner = "client!sca", name = "p", descriptor = "I")
	private int anInt7450 = -1;

	@OriginalMember(owner = "client!sca", name = "o", descriptor = "I")
	private int anInt7449 = 0;

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "()Lclient!kca;")
	@Override
	public Class1_Sub12 method6515() {
		return (Class1_Sub12) this.aClass38_58.method1419();
	}

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "()Lclient!kca;")
	@Override
	public Class1_Sub12 method6517() {
		return (Class1_Sub12) this.aClass38_58.method1415();
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lclient!kca;)V")
	public synchronized void method6363(@OriginalArg(0) Class1_Sub12 arg0) {
		arg0.method7983();
	}

	@OriginalMember(owner = "client!sca", name = "e", descriptor = "()I")
	public synchronized int method6364() {
		return this.aClass38_58.method1422();
	}

	@OriginalMember(owner = "client!sca", name = "c", descriptor = "([III)V")
	private void method6365(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub12 local5 = (Class1_Sub12) this.aClass38_58.method1419(); local5 != null; local5 = (Class1_Sub12) this.aClass38_58.method1415()) {
			local5.method6520(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lclient!kp;Lclient!hb;)V")
	private void method6366(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub19 arg1) {
		while (arg0 != this.aClass38_59.aClass1_27 && ((Class1_Sub19) arg0).anInt3755 <= arg1.anInt3755) {
			arg0 = arg0.aClass1_283;
		}
		Static157.method3128(arg0, arg1);
		this.anInt7450 = ((Class1_Sub19) this.aClass38_59.aClass1_27.aClass1_283).anInt3755;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method6519(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt7450 < 0) {
				this.method6365(arg0, arg1, arg2);
				return;
			}
			if (this.anInt7449 + arg2 < this.anInt7450) {
				this.anInt7449 += arg2;
				this.method6365(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt7450 - this.anInt7449;
			this.method6365(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt7449 += local33;
			this.method6368();
			@Pc(60) Class1_Sub19 local60 = (Class1_Sub19) this.aClass38_59.method1419();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method3338(this);
				if (local68 < 0) {
					local60.anInt3755 = 0;
					this.method6367(local60);
				} else {
					local60.anInt3755 = local68;
					this.method6366(local60.aClass1_283, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6516(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt7450 < 0) {
				this.method6370(arg0);
				return;
			}
			if (this.anInt7449 + arg0 < this.anInt7450) {
				this.anInt7449 += arg0;
				this.method6370(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt7450 - this.anInt7449;
			this.method6370(local29);
			arg0 -= local29;
			this.anInt7449 += local29;
			this.method6368();
			@Pc(50) Class1_Sub19 local50 = (Class1_Sub19) this.aClass38_59.method1419();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method3338(this);
				if (local58 < 0) {
					local50.anInt3755 = 0;
					this.method6367(local50);
				} else {
					local50.anInt3755 = local58;
					this.method6366(local50.aClass1_283, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lclient!hb;)V")
	private void method6367(@OriginalArg(0) Class1_Sub19 arg0) {
		arg0.method7983();
		arg0.method3339();
		@Pc(9) Class1 local9 = this.aClass38_59.aClass1_27.aClass1_283;
		if (local9 == this.aClass38_59.aClass1_27) {
			this.anInt7450 = -1;
		} else {
			this.anInt7450 = ((Class1_Sub19) local9).anInt3755;
		}
	}

	@OriginalMember(owner = "client!sca", name = "d", descriptor = "()I")
	@Override
	public int method6521() {
		return 0;
	}

	@OriginalMember(owner = "client!sca", name = "f", descriptor = "()V")
	private void method6368() {
		if (this.anInt7449 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub19 local8 = (Class1_Sub19) this.aClass38_59.method1419(); local8 != null; local8 = (Class1_Sub19) this.aClass38_59.method1415()) {
			local8.anInt3755 -= this.anInt7449;
		}
		this.anInt7450 -= this.anInt7449;
		this.anInt7449 = 0;
	}

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "(Lclient!kca;)V")
	public synchronized void method6369(@OriginalArg(0) Class1_Sub12 arg0) {
		this.aClass38_58.method1418(arg0);
	}

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "(I)V")
	private void method6370(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub12 local5 = (Class1_Sub12) this.aClass38_58.method1419(); local5 != null; local5 = (Class1_Sub12) this.aClass38_58.method1415()) {
			local5.method6516(arg0);
		}
	}
}
