import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class4_Sub14_Sub2 extends Class4_Sub14 {

	@OriginalMember(owner = "client!iq", name = "n", descriptor = "Lclient!ub;")
	private final Class244 aClass244_15 = new Class244();

	@OriginalMember(owner = "client!iq", name = "o", descriptor = "Lclient!ub;")
	private final Class244 aClass244_16 = new Class244();

	@OriginalMember(owner = "client!iq", name = "p", descriptor = "I")
	private int anInt3136 = 0;

	@OriginalMember(owner = "client!iq", name = "q", descriptor = "I")
	private int anInt3137 = -1;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method4788(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt3137 < 0) {
				this.method2415(arg0, arg1, arg2);
				return;
			}
			if (this.anInt3136 + arg2 < this.anInt3137) {
				this.anInt3136 += arg2;
				this.method2415(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt3137 - this.anInt3136;
			this.method2415(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt3136 += local33;
			this.method2422();
			@Pc(60) Class4_Sub28 local60 = (Class4_Sub28) this.aClass244_16.method5263();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method3542(this);
				if (local68 < 0) {
					local60.anInt4442 = 0;
					this.method2417(local60);
				} else {
					local60.anInt4442 = local68;
					this.method2416(local60.aClass4_261, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "([III)V")
	private void method2415(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class4_Sub14 local5 = (Class4_Sub14) this.aClass244_15.method5263(); local5 != null; local5 = (Class4_Sub14) this.aClass244_15.method5271()) {
			local5.method4789(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!nd;Lclient!no;)V")
	private void method2416(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4_Sub28 arg1) {
		while (arg0 != this.aClass244_16.aClass4_227 && ((Class4_Sub28) arg0).anInt4442 <= arg1.anInt4442) {
			arg0 = arg0.aClass4_261;
		}
		Static155.method2186(arg0, arg1);
		this.anInt3137 = ((Class4_Sub28) this.aClass244_16.aClass4_227.aClass4_261).anInt4442;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!no;)V")
	private void method2417(@OriginalArg(0) Class4_Sub28 arg0) {
		arg0.method6059();
		arg0.method3541();
		@Pc(9) Class4 local9 = this.aClass244_16.aClass4_227.aClass4_261;
		if (local9 == this.aClass244_16.aClass4_227) {
			this.anInt3137 = -1;
		} else {
			this.anInt3137 = ((Class4_Sub28) local9).anInt4442;
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!hu;)V")
	public synchronized void method2418(@OriginalArg(0) Class4_Sub14 arg0) {
		this.aClass244_15.method5274(arg0);
	}

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "()I")
	public synchronized int method2419() {
		return this.aClass244_15.method5266();
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "()I")
	@Override
	public int method4786() {
		return 0;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method4783(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt3137 < 0) {
				this.method2421(arg0);
				return;
			}
			if (this.anInt3136 + arg0 < this.anInt3137) {
				this.anInt3136 += arg0;
				this.method2421(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt3137 - this.anInt3136;
			this.method2421(local29);
			arg0 -= local29;
			this.anInt3136 += local29;
			this.method2422();
			@Pc(50) Class4_Sub28 local50 = (Class4_Sub28) this.aClass244_16.method5263();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method3542(this);
				if (local58 < 0) {
					local50.anInt4442 = 0;
					this.method2417(local50);
				} else {
					local50.anInt4442 = local58;
					this.method2416(local50.aClass4_261, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "()Lclient!hu;")
	@Override
	public Class4_Sub14 method4787() {
		return (Class4_Sub14) this.aClass244_15.method5271();
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(Lclient!hu;)V")
	public synchronized void method2420(@OriginalArg(0) Class4_Sub14 arg0) {
		arg0.method6059();
	}

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "(I)V")
	private void method2421(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class4_Sub14 local5 = (Class4_Sub14) this.aClass244_15.method5263(); local5 != null; local5 = (Class4_Sub14) this.aClass244_15.method5271()) {
			local5.method4783(arg0);
		}
	}

	@OriginalMember(owner = "client!iq", name = "f", descriptor = "()V")
	private void method2422() {
		if (this.anInt3136 <= 0) {
			return;
		}
		for (@Pc(8) Class4_Sub28 local8 = (Class4_Sub28) this.aClass244_16.method5263(); local8 != null; local8 = (Class4_Sub28) this.aClass244_16.method5271()) {
			local8.anInt4442 -= this.anInt3136;
		}
		this.anInt3137 -= this.anInt3136;
		this.anInt3136 = 0;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "()Lclient!hu;")
	@Override
	public Class4_Sub14 method4784() {
		return (Class4_Sub14) this.aClass244_15.method5263();
	}
}
