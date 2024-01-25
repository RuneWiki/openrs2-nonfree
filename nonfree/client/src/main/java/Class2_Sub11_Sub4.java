import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class2_Sub11_Sub4 extends Class2_Sub11 {

	@OriginalMember(owner = "client!rc", name = "s", descriptor = "Lclient!vf;")
	private final Class238 aClass238_31 = new Class238();

	@OriginalMember(owner = "client!rc", name = "t", descriptor = "Lclient!vf;")
	private final Class238 aClass238_32 = new Class238();

	@OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
	private int anInt5556 = -1;

	@OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
	private int anInt5557 = 0;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!rk;)V")
	public synchronized void method4878(@OriginalArg(0) Class2_Sub11 arg0) {
		this.aClass238_31.method5804(arg0);
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(Lclient!rk;)V")
	public synchronized void method4879(@OriginalArg(0) Class2_Sub11 arg0) {
		arg0.method6130();
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "([III)V")
	private void method4880(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class2_Sub11 local5 = (Class2_Sub11) this.aClass238_31.method5795(); local5 != null; local5 = (Class2_Sub11) this.aClass238_31.method5799()) {
			local5.method4874(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "()I")
	@Override
	public int method4876() {
		return 0;
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method4875(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt5556 < 0) {
				this.method4884(arg0);
				return;
			}
			if (this.anInt5557 + arg0 < this.anInt5556) {
				this.anInt5557 += arg0;
				this.method4884(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt5556 - this.anInt5557;
			this.method4884(local29);
			arg0 -= local29;
			this.anInt5557 += local29;
			this.method4881();
			@Pc(50) Class2_Sub38 local50 = (Class2_Sub38) this.aClass238_32.method5795();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method5490(this);
				if (local58 < 0) {
					local50.anInt6317 = 0;
					this.method4882(local50);
				} else {
					local50.anInt6317 = local58;
					this.method4883(local50.aClass2_244, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4877(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt5556 < 0) {
				this.method4880(arg0, arg1, arg2);
				return;
			}
			if (this.anInt5557 + arg2 < this.anInt5556) {
				this.anInt5557 += arg2;
				this.method4880(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt5556 - this.anInt5557;
			this.method4880(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt5557 += local33;
			this.method4881();
			@Pc(60) Class2_Sub38 local60 = (Class2_Sub38) this.aClass238_32.method5795();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method5490(this);
				if (local68 < 0) {
					local60.anInt6317 = 0;
					this.method4882(local60);
				} else {
					local60.anInt6317 = local68;
					this.method4883(local60.aClass2_244, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "()V")
	private void method4881() {
		if (this.anInt5557 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub38 local8 = (Class2_Sub38) this.aClass238_32.method5795(); local8 != null; local8 = (Class2_Sub38) this.aClass238_32.method5799()) {
			local8.anInt6317 -= this.anInt5557;
		}
		this.anInt5556 -= this.anInt5557;
		this.anInt5557 = 0;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!tq;)V")
	private void method4882(@OriginalArg(0) Class2_Sub38 arg0) {
		arg0.method6130();
		arg0.method5491();
		@Pc(9) Class2 local9 = this.aClass238_32.aClass2_225.aClass2_244;
		if (local9 == this.aClass238_32.aClass2_225) {
			this.anInt5556 = -1;
		} else {
			this.anInt5556 = ((Class2_Sub38) local9).anInt6317;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "()Lclient!rk;")
	@Override
	public Class2_Sub11 method4871() {
		return (Class2_Sub11) this.aClass238_31.method5795();
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "()Lclient!rk;")
	@Override
	public Class2_Sub11 method4872() {
		return (Class2_Sub11) this.aClass238_31.method5799();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!pt;Lclient!tq;)V")
	private void method4883(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub38 arg1) {
		while (arg0 != this.aClass238_32.aClass2_225 && ((Class2_Sub38) arg0).anInt6317 <= arg1.anInt6317) {
			arg0 = arg0.aClass2_244;
		}
		Static265.method4511(arg0, arg1);
		this.anInt5556 = ((Class2_Sub38) this.aClass238_32.aClass2_225.aClass2_244).anInt6317;
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
	private void method4884(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class2_Sub11 local5 = (Class2_Sub11) this.aClass238_31.method5795(); local5 != null; local5 = (Class2_Sub11) this.aClass238_31.method5799()) {
			local5.method4875(arg0);
		}
	}
}
