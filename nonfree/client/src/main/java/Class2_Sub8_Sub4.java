import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class2_Sub8_Sub4 extends Class2_Sub8 {

	@OriginalMember(owner = "client!sq", name = "s", descriptor = "Lclient!uh;")
	private final Class341 aClass341_61 = new Class341();

	@OriginalMember(owner = "client!sq", name = "t", descriptor = "Lclient!uh;")
	private final Class341 aClass341_62 = new Class341();

	@OriginalMember(owner = "client!sq", name = "u", descriptor = "I")
	private int anInt9531 = -1;

	@OriginalMember(owner = "client!sq", name = "v", descriptor = "I")
	private int anInt9532 = 0;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!jba;)V")
	public synchronized void method7925(@OriginalArg(0) Class2_Sub8 arg0) {
		arg0.method9253();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8818(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt9531 < 0) {
				this.method7929(arg0);
				return;
			}
			if (this.anInt9532 + arg0 < this.anInt9531) {
				this.anInt9532 += arg0;
				this.method7929(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt9531 - this.anInt9532;
			this.method7929(local29);
			arg0 -= local29;
			this.anInt9532 += local29;
			this.method7930();
			@Pc(50) Class2_Sub40 local50 = (Class2_Sub40) this.aClass341_62.method8524();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method6576(this);
				if (local58 < 0) {
					local50.anInt7671 = 0;
					this.method7927(local50);
				} else {
					local50.anInt7671 = local58;
					this.method7926(local50.aClass2_299, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "()Lclient!jba;")
	@Override
	public Class2_Sub8 method8815() {
		return (Class2_Sub8) this.aClass341_61.method8524();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!eh;Lclient!om;)V")
	private void method7926(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub40 arg1) {
		while (arg0 != this.aClass341_62.aClass2_271 && ((Class2_Sub40) arg0).anInt7671 <= arg1.anInt7671) {
			arg0 = arg0.aClass2_299;
		}
		Static458.method7147(arg1, arg0);
		this.anInt9531 = ((Class2_Sub40) this.aClass341_62.aClass2_271.aClass2_299).anInt7671;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!om;)V")
	private void method7927(@OriginalArg(0) Class2_Sub40 arg0) {
		arg0.method9253();
		arg0.method6577();
		@Pc(9) Class2 local9 = this.aClass341_62.aClass2_271.aClass2_299;
		if (local9 == this.aClass341_62.aClass2_271) {
			this.anInt9531 = -1;
		} else {
			this.anInt9531 = ((Class2_Sub40) local9).anInt7671;
		}
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(Lclient!jba;)V")
	public synchronized void method7928(@OriginalArg(0) Class2_Sub8 arg0) {
		this.aClass341_61.method8530(arg0);
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)V")
	private void method7929(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class2_Sub8 local5 = (Class2_Sub8) this.aClass341_61.method8524(); local5 != null; local5 = (Class2_Sub8) this.aClass341_61.method8519()) {
			local5.method8818(arg0);
		}
	}

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "()V")
	private void method7930() {
		if (this.anInt9532 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub40 local8 = (Class2_Sub40) this.aClass341_62.method8524(); local8 != null; local8 = (Class2_Sub40) this.aClass341_62.method8519()) {
			local8.anInt7671 -= this.anInt9532;
		}
		this.anInt9531 -= this.anInt9532;
		this.anInt9532 = 0;
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "([III)V")
	private void method7931(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class2_Sub8 local5 = (Class2_Sub8) this.aClass341_61.method8524(); local5 != null; local5 = (Class2_Sub8) this.aClass341_61.method8519()) {
			local5.method8814(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "()I")
	public synchronized int method7932() {
		return this.aClass341_61.method8527();
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "()Lclient!jba;")
	@Override
	public Class2_Sub8 method8817() {
		return (Class2_Sub8) this.aClass341_61.method8519();
	}

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "()I")
	@Override
	public int method8820() {
		return 0;
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method8816(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt9531 < 0) {
				this.method7931(arg0, arg1, arg2);
				return;
			}
			if (this.anInt9532 + arg2 < this.anInt9531) {
				this.anInt9532 += arg2;
				this.method7931(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt9531 - this.anInt9532;
			this.method7931(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt9532 += local33;
			this.method7930();
			@Pc(60) Class2_Sub40 local60 = (Class2_Sub40) this.aClass341_62.method8524();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method6576(this);
				if (local68 < 0) {
					local60.anInt7671 = 0;
					this.method7927(local60);
				} else {
					local60.anInt7671 = local68;
					this.method7926(local60.aClass2_299, local60);
				}
			}
		} while (arg2 != 0);
	}
}
