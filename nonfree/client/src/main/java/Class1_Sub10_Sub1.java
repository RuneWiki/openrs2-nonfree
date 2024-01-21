import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class1_Sub10_Sub1 extends Class1_Sub10 {

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "Lclient!h;")
	private final Class30 aClass30_5 = new Class30();

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "Lclient!h;")
	private final Class30 aClass30_6 = new Class30();

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
	private int anInt550 = 0;

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
	private int anInt551 = -1;

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method2438(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt551 < 0) {
				this.method450(arg0);
				return;
			}
			if (this.anInt550 + arg0 < this.anInt551) {
				this.anInt550 += arg0;
				this.method450(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt551 - this.anInt550;
			this.method450(local29);
			arg0 -= local29;
			this.anInt550 += local29;
			this.method456();
			@Pc(50) Class1_Sub15 local50 = (Class1_Sub15) this.aClass30_6.method1115();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1228(this);
				if (local58 < 0) {
					local50.anInt1696 = 0;
					this.method455(local50);
				} else {
					local50.anInt1696 = local58;
					this.method451(local50.aClass1_215, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V")
	private void method450(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub10 local5 = (Class1_Sub10) this.aClass30_5.method1115(); local5 != null; local5 = (Class1_Sub10) this.aClass30_5.method1125()) {
			local5.method2438(arg0);
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "()I")
	@Override
	public int method2436() {
		return 0;
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "()Lclient!vh;")
	@Override
	public Class1_Sub10 method2440() {
		return (Class1_Sub10) this.aClass30_5.method1115();
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method2442(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt551 < 0) {
				this.method452(arg0, arg1, arg2);
				return;
			}
			if (this.anInt550 + arg2 < this.anInt551) {
				this.anInt550 += arg2;
				this.method452(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt551 - this.anInt550;
			this.method452(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt550 += local33;
			this.method456();
			@Pc(60) Class1_Sub15 local60 = (Class1_Sub15) this.aClass30_6.method1115();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method1228(this);
				if (local68 < 0) {
					local60.anInt1696 = 0;
					this.method455(local60);
				} else {
					local60.anInt1696 = local68;
					this.method451(local60.aClass1_215, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!o;Lclient!hh;)V")
	private void method451(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub15 arg1) {
		while (arg0 != this.aClass30_6.aClass1_89 && ((Class1_Sub15) arg0).anInt1696 <= arg1.anInt1696) {
			arg0 = arg0.aClass1_215;
		}
		this.aClass30_6.method1117(arg1, arg0);
		this.anInt551 = ((Class1_Sub15) this.aClass30_6.aClass1_89.aClass1_215).anInt1696;
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "([III)V")
	private void method452(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub10 local5 = (Class1_Sub10) this.aClass30_5.method1115(); local5 != null; local5 = (Class1_Sub10) this.aClass30_5.method1125()) {
			local5.method2437(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!vh;)V")
	public synchronized void method453(@OriginalArg(0) Class1_Sub10 arg0) {
		arg0.method3134();
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(Lclient!vh;)V")
	public synchronized void method454(@OriginalArg(0) Class1_Sub10 arg0) {
		this.aClass30_5.method1114(arg0);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!hh;)V")
	private void method455(@OriginalArg(0) Class1_Sub15 arg0) {
		arg0.method3134();
		arg0.method1229();
		@Pc(9) Class1 local9 = this.aClass30_6.aClass1_89.aClass1_215;
		if (local9 == this.aClass30_6.aClass1_89) {
			this.anInt551 = -1;
		} else {
			this.anInt551 = ((Class1_Sub15) local9).anInt1696;
		}
	}

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "()V")
	private void method456() {
		if (this.anInt550 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub15 local8 = (Class1_Sub15) this.aClass30_6.method1115(); local8 != null; local8 = (Class1_Sub15) this.aClass30_6.method1125()) {
			local8.anInt1696 -= this.anInt550;
		}
		this.anInt551 -= this.anInt550;
		this.anInt550 = 0;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "()Lclient!vh;")
	@Override
	public Class1_Sub10 method2439() {
		return (Class1_Sub10) this.aClass30_5.method1125();
	}
}
