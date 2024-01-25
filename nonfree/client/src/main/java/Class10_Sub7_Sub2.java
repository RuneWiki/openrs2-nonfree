import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ew")
public final class Class10_Sub7_Sub2 extends Class10_Sub7 {

	@OriginalMember(owner = "client!ew", name = "o", descriptor = "Lclient!mf;")
	private final Class163 aClass163_20 = new Class163();

	@OriginalMember(owner = "client!ew", name = "p", descriptor = "Lclient!mf;")
	private final Class163 aClass163_21 = new Class163();

	@OriginalMember(owner = "client!ew", name = "q", descriptor = "I")
	private int anInt2122 = -1;

	@OriginalMember(owner = "client!ew", name = "r", descriptor = "I")
	private int anInt2123 = 0;

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "()Lclient!sc;")
	@Override
	public Class10_Sub7 method4818() {
		return (Class10_Sub7) this.aClass163_20.method3620();
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "()Lclient!sc;")
	@Override
	public Class10_Sub7 method4816() {
		return (Class10_Sub7) this.aClass163_20.method3621();
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(Lclient!nq;)V")
	private void method1838(@OriginalArg(0) Class10_Sub32 arg0) {
		arg0.method6033();
		arg0.method3901();
		@Pc(9) Class10 local9 = this.aClass163_21.aClass10_149.aClass10_263;
		if (local9 == this.aClass163_21.aClass10_149) {
			this.anInt2122 = -1;
		} else {
			this.anInt2122 = ((Class10_Sub32) local9).anInt4840;
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method4813(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt2122 < 0) {
				this.method1842(arg0, arg1, arg2);
				return;
			}
			if (this.anInt2123 + arg2 < this.anInt2122) {
				this.anInt2123 += arg2;
				this.method1842(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt2122 - this.anInt2123;
			this.method1842(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2123 += local33;
			this.method1840();
			@Pc(60) Class10_Sub32 local60 = (Class10_Sub32) this.aClass163_21.method3620();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method3900(this);
				if (local68 < 0) {
					local60.anInt4840 = 0;
					this.method1838(local60);
				} else {
					local60.anInt4840 = local68;
					this.method1845(local60.aClass10_263, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method4817(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2122 < 0) {
				this.method1843(arg0);
				return;
			}
			if (this.anInt2123 + arg0 < this.anInt2122) {
				this.anInt2123 += arg0;
				this.method1843(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2122 - this.anInt2123;
			this.method1843(local29);
			arg0 -= local29;
			this.anInt2123 += local29;
			this.method1840();
			@Pc(50) Class10_Sub32 local50 = (Class10_Sub32) this.aClass163_21.method3620();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method3900(this);
				if (local58 < 0) {
					local50.anInt4840 = 0;
					this.method1838(local50);
				} else {
					local50.anInt4840 = local58;
					this.method1845(local50.aClass10_263, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!ew", name = "e", descriptor = "()I")
	public synchronized int method1839() {
		return this.aClass163_20.method3614();
	}

	@OriginalMember(owner = "client!ew", name = "f", descriptor = "()V")
	private void method1840() {
		if (this.anInt2123 <= 0) {
			return;
		}
		for (@Pc(8) Class10_Sub32 local8 = (Class10_Sub32) this.aClass163_21.method3620(); local8 != null; local8 = (Class10_Sub32) this.aClass163_21.method3621()) {
			local8.anInt4840 -= this.anInt2123;
		}
		this.anInt2122 -= this.anInt2123;
		this.anInt2123 = 0;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(Lclient!sc;)V")
	public synchronized void method1841(@OriginalArg(0) Class10_Sub7 arg0) {
		arg0.method6033();
	}

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "([III)V")
	private void method1842(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class10_Sub7 local5 = (Class10_Sub7) this.aClass163_20.method3620(); local5 != null; local5 = (Class10_Sub7) this.aClass163_20.method3621()) {
			local5.method4815(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "(I)V")
	private void method1843(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class10_Sub7 local5 = (Class10_Sub7) this.aClass163_20.method3620(); local5 != null; local5 = (Class10_Sub7) this.aClass163_20.method3621()) {
			local5.method4817(arg0);
		}
	}

	@OriginalMember(owner = "client!ew", name = "d", descriptor = "()I")
	@Override
	public int method4819() {
		return 0;
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(Lclient!sc;)V")
	public synchronized void method1844(@OriginalArg(0) Class10_Sub7 arg0) {
		this.aClass163_20.method3615(arg0);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(Lclient!es;Lclient!nq;)V")
	private void method1845(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class10_Sub32 arg1) {
		while (arg0 != this.aClass163_21.aClass10_149 && ((Class10_Sub32) arg0).anInt4840 <= arg1.anInt4840) {
			arg0 = arg0.aClass10_263;
		}
		Static332.method4493(arg1, arg0);
		this.anInt2122 = ((Class10_Sub32) this.aClass163_21.aClass10_149.aClass10_263).anInt4840;
	}
}
