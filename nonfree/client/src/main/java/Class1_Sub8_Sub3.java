import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class1_Sub8_Sub3 extends Class1_Sub8 {

	@OriginalMember(owner = "client!li", name = "t", descriptor = "Lclient!hh;")
	private Class69 aClass69_19 = new Class69();

	@OriginalMember(owner = "client!li", name = "u", descriptor = "Lclient!hh;")
	private Class69 aClass69_20 = new Class69();

	@OriginalMember(owner = "client!li", name = "v", descriptor = "I")
	private int anInt2885 = 0;

	@OriginalMember(owner = "client!li", name = "w", descriptor = "I")
	private int anInt2886 = -1;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method4204(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt2886 < 0) {
				this.method2413(arg0, arg1, arg2);
				return;
			}
			if (this.anInt2885 + arg2 < this.anInt2886) {
				this.anInt2885 += arg2;
				this.method2413(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt2886 - this.anInt2885;
			this.method2413(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2885 += local33;
			this.method2411();
			@Pc(60) Class1_Sub11 local60 = (Class1_Sub11) this.aClass69_20.method1636();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method1590(this);
				if (local68 < 0) {
					local60.anInt1853 = 0;
					this.method2414(local60);
				} else {
					local60.anInt1853 = local68;
					this.method2412(local60.aClass1_230, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!li", name = "d", descriptor = "(I)V")
	private void method2408(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub8 local5 = (Class1_Sub8) this.aClass69_19.method1636(); local5 != null; local5 = (Class1_Sub8) this.aClass69_19.method1631()) {
			local5.method4209(arg0);
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!sm;)V")
	public synchronized void method2409(@OriginalArg(0) Class1_Sub8 arg0) {
		arg0.method4534();
	}

	@OriginalMember(owner = "client!li", name = "d", descriptor = "()Lclient!sm;")
	@Override
	public Class1_Sub8 method4208() {
		return (Class1_Sub8) this.aClass69_19.method1636();
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(Lclient!sm;)V")
	public synchronized void method2410(@OriginalArg(0) Class1_Sub8 arg0) {
		this.aClass69_19.method1627(arg0);
	}

	@OriginalMember(owner = "client!li", name = "e", descriptor = "()V")
	private void method2411() {
		if (this.anInt2885 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub11 local8 = (Class1_Sub11) this.aClass69_20.method1636(); local8 != null; local8 = (Class1_Sub11) this.aClass69_20.method1631()) {
			local8.anInt1853 -= this.anInt2885;
		}
		this.anInt2886 -= this.anInt2885;
		this.anInt2885 = 0;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!tf;Lclient!hb;)V")
	private void method2412(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		while (arg0 != this.aClass69_20.aClass1_85 && ((Class1_Sub11) arg0).anInt1853 <= arg1.anInt1853) {
			arg0 = arg0.aClass1_230;
		}
		Static233.method3724(arg0, arg1);
		this.anInt2886 = ((Class1_Sub11) this.aClass69_20.aClass1_85.aClass1_230).anInt1853;
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "([III)V")
	private void method2413(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub8 local5 = (Class1_Sub8) this.aClass69_19.method1636(); local5 != null; local5 = (Class1_Sub8) this.aClass69_19.method1631()) {
			local5.method4205(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!hb;)V")
	private void method2414(@OriginalArg(0) Class1_Sub11 arg0) {
		arg0.method4534();
		arg0.method1591();
		@Pc(9) Class1 local9 = this.aClass69_20.aClass1_85.aClass1_230;
		if (local9 == this.aClass69_20.aClass1_85) {
			this.anInt2886 = -1;
		} else {
			this.anInt2886 = ((Class1_Sub11) local9).anInt1853;
		}
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "()Lclient!sm;")
	@Override
	public Class1_Sub8 method4206() {
		return (Class1_Sub8) this.aClass69_19.method1631();
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "()I")
	@Override
	public int method4207() {
		return 0;
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method4209(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2886 < 0) {
				this.method2408(arg0);
				return;
			}
			if (this.anInt2885 + arg0 < this.anInt2886) {
				this.anInt2885 += arg0;
				this.method2408(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2886 - this.anInt2885;
			this.method2408(local29);
			arg0 -= local29;
			this.anInt2885 += local29;
			this.method2411();
			@Pc(50) Class1_Sub11 local50 = (Class1_Sub11) this.aClass69_20.method1636();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1590(this);
				if (local58 < 0) {
					local50.anInt1853 = 0;
					this.method2414(local50);
				} else {
					local50.anInt1853 = local58;
					this.method2412(local50.aClass1_230, local50);
				}
			}
		} while (arg0 != 0);
	}
}
