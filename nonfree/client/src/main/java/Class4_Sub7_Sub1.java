import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class4_Sub7_Sub1 extends Class4_Sub7 {

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "Lclient!oe;")
	private final Class244 aClass244_2 = new Class244();

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "Lclient!oe;")
	private final Class244 aClass244_3 = new Class244();

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
	private int anInt440 = 0;

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
	private int anInt441 = -1;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!pba;)V")
	private void method396(@OriginalArg(0) Class4_Sub33 arg0) {
		arg0.method8379();
		arg0.method6216();
		@Pc(9) Class4 local9 = this.aClass244_3.aClass4_185.aClass4_285;
		if (local9 == this.aClass244_3.aClass4_185) {
			this.anInt441 = -1;
		} else {
			this.anInt441 = ((Class4_Sub33) local9).anInt7523;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!mi;)V")
	public synchronized void method397(@OriginalArg(0) Class4_Sub7 arg0) {
		this.aClass244_2.method5964(arg0);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6402(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt441 < 0) {
				this.method398(arg0);
				return;
			}
			if (this.anInt440 + arg0 < this.anInt441) {
				this.anInt440 += arg0;
				this.method398(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt441 - this.anInt440;
			this.method398(local29);
			arg0 -= local29;
			this.anInt440 += local29;
			this.method403();
			@Pc(50) Class4_Sub33 local50 = (Class4_Sub33) this.aClass244_3.method5963();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method6215(this);
				if (local58 < 0) {
					local50.anInt7523 = 0;
					this.method396(local50);
				} else {
					local50.anInt7523 = local58;
					this.method402(local50.aClass4_285, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
	private void method398(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class4_Sub7 local5 = (Class4_Sub7) this.aClass244_2.method5963(); local5 != null; local5 = (Class4_Sub7) this.aClass244_2.method5965()) {
			local5.method6402(arg0);
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "()Lclient!mi;")
	@Override
	public Class4_Sub7 method6401() {
		return (Class4_Sub7) this.aClass244_2.method5963();
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "()I")
	@Override
	public int method6405() {
		return 0;
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "([III)V")
	private void method399(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class4_Sub7 local5 = (Class4_Sub7) this.aClass244_2.method5963(); local5 != null; local5 = (Class4_Sub7) this.aClass244_2.method5965()) {
			local5.method6403(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method6400(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt441 < 0) {
				this.method399(arg0, arg1, arg2);
				return;
			}
			if (this.anInt440 + arg2 < this.anInt441) {
				this.anInt440 += arg2;
				this.method399(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt441 - this.anInt440;
			this.method399(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt440 += local33;
			this.method403();
			@Pc(60) Class4_Sub33 local60 = (Class4_Sub33) this.aClass244_3.method5963();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method6215(this);
				if (local68 < 0) {
					local60.anInt7523 = 0;
					this.method396(local60);
				} else {
					local60.anInt7523 = local68;
					this.method402(local60.aClass4_285, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "()Lclient!mi;")
	@Override
	public Class4_Sub7 method6404() {
		return (Class4_Sub7) this.aClass244_2.method5965();
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(Lclient!mi;)V")
	public synchronized void method400(@OriginalArg(0) Class4_Sub7 arg0) {
		arg0.method8379();
	}

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "()I")
	public synchronized int method401() {
		return this.aClass244_2.method5973();
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!ii;Lclient!pba;)V")
	private void method402(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4_Sub33 arg1) {
		while (arg0 != this.aClass244_3.aClass4_185 && ((Class4_Sub33) arg0).anInt7523 <= arg1.anInt7523) {
			arg0 = arg0.aClass4_285;
		}
		Static80.method7918(arg0, arg1);
		this.anInt441 = ((Class4_Sub33) this.aClass244_3.aClass4_185.aClass4_285).anInt7523;
	}

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "()V")
	private void method403() {
		if (this.anInt440 <= 0) {
			return;
		}
		for (@Pc(8) Class4_Sub33 local8 = (Class4_Sub33) this.aClass244_3.method5963(); local8 != null; local8 = (Class4_Sub33) this.aClass244_3.method5965()) {
			local8.anInt7523 -= this.anInt440;
		}
		this.anInt441 -= this.anInt440;
		this.anInt440 = 0;
	}
}
