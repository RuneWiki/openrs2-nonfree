import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class1_Sub7_Sub4 extends Class1_Sub7 {

	@OriginalMember(owner = "client!qn", name = "p", descriptor = "Lclient!at;")
	private final Class17 aClass17_57 = new Class17();

	@OriginalMember(owner = "client!qn", name = "q", descriptor = "Lclient!at;")
	private final Class17 aClass17_58 = new Class17();

	@OriginalMember(owner = "client!qn", name = "r", descriptor = "I")
	private int anInt5012 = 0;

	@OriginalMember(owner = "client!qn", name = "s", descriptor = "I")
	private int anInt5013 = -1;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!uh;)V")
	public synchronized void method4410(@OriginalArg(0) Class1_Sub7 arg0) {
		arg0.method5577();
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!vb;)V")
	private void method4411(@OriginalArg(0) Class1_Sub43 arg0) {
		arg0.method5577();
		arg0.method5072();
		@Pc(9) Class1 local9 = this.aClass17_58.aClass1_15.aClass1_243;
		if (local9 == this.aClass17_58.aClass1_15) {
			this.anInt5013 = -1;
		} else {
			this.anInt5013 = ((Class1_Sub43) local9).anInt5887;
		}
	}

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "(I)V")
	private void method4412(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub7 local5 = (Class1_Sub7) this.aClass17_57.method202(); local5 != null; local5 = (Class1_Sub7) this.aClass17_57.method207()) {
			local5.method4405(arg0);
		}
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "()Lclient!uh;")
	@Override
	public Class1_Sub7 method4407() {
		return (Class1_Sub7) this.aClass17_57.method202();
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "()Lclient!uh;")
	@Override
	public Class1_Sub7 method4408() {
		return (Class1_Sub7) this.aClass17_57.method207();
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(Lclient!uh;)V")
	public synchronized void method4413(@OriginalArg(0) Class1_Sub7 arg0) {
		this.aClass17_57.method211(arg0);
	}

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method4405(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt5013 < 0) {
				this.method4412(arg0);
				return;
			}
			if (this.anInt5012 + arg0 < this.anInt5013) {
				this.anInt5012 += arg0;
				this.method4412(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt5013 - this.anInt5012;
			this.method4412(local29);
			arg0 -= local29;
			this.anInt5012 += local29;
			this.method4416();
			@Pc(50) Class1_Sub43 local50 = (Class1_Sub43) this.aClass17_58.method202();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method5071(this);
				if (local58 < 0) {
					local50.anInt5887 = 0;
					this.method4411(local50);
				} else {
					local50.anInt5887 = local58;
					this.method4415(local50.aClass1_243, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "([III)V")
	private void method4414(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub7 local5 = (Class1_Sub7) this.aClass17_57.method202(); local5 != null; local5 = (Class1_Sub7) this.aClass17_57.method207()) {
			local5.method4403(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4404(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt5013 < 0) {
				this.method4414(arg0, arg1, arg2);
				return;
			}
			if (this.anInt5012 + arg2 < this.anInt5013) {
				this.anInt5012 += arg2;
				this.method4414(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt5013 - this.anInt5012;
			this.method4414(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt5012 += local33;
			this.method4416();
			@Pc(60) Class1_Sub43 local60 = (Class1_Sub43) this.aClass17_58.method202();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method5071(this);
				if (local68 < 0) {
					local60.anInt5887 = 0;
					this.method4411(local60);
				} else {
					local60.anInt5887 = local68;
					this.method4415(local60.aClass1_243, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "()I")
	@Override
	public int method4409() {
		return 0;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!fi;Lclient!vb;)V")
	private void method4415(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub43 arg1) {
		while (arg0 != this.aClass17_58.aClass1_15 && ((Class1_Sub43) arg0).anInt5887 <= arg1.anInt5887) {
			arg0 = arg0.aClass1_243;
		}
		Static298.method1645(arg1, arg0);
		this.anInt5013 = ((Class1_Sub43) this.aClass17_58.aClass1_15.aClass1_243).anInt5887;
	}

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "()V")
	private void method4416() {
		if (this.anInt5012 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub43 local8 = (Class1_Sub43) this.aClass17_58.method202(); local8 != null; local8 = (Class1_Sub43) this.aClass17_58.method207()) {
			local8.anInt5887 -= this.anInt5012;
		}
		this.anInt5013 -= this.anInt5012;
		this.anInt5012 = 0;
	}
}
