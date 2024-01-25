import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bfa")
public final class Class1_Sub7_Sub1 extends Class1_Sub7 {

	@OriginalMember(owner = "client!bfa", name = "o", descriptor = "Lclient!wba;")
	private final Class353 aClass353_6 = new Class353();

	@OriginalMember(owner = "client!bfa", name = "p", descriptor = "Lclient!wba;")
	private final Class353 aClass353_7 = new Class353();

	@OriginalMember(owner = "client!bfa", name = "q", descriptor = "I")
	private int anInt534 = 0;

	@OriginalMember(owner = "client!bfa", name = "r", descriptor = "I")
	private int anInt535 = -1;

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lclient!pda;)V")
	public synchronized void method470(@OriginalArg(0) Class1_Sub7 arg0) {
		this.aClass353_6.method7684(arg0);
	}

	@OriginalMember(owner = "client!bfa", name = "e", descriptor = "()V")
	private void method471() {
		if (this.anInt534 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub47 local8 = (Class1_Sub47) this.aClass353_7.method7677(); local8 != null; local8 = (Class1_Sub47) this.aClass353_7.method7687()) {
			local8.anInt9408 -= this.anInt534;
		}
		this.anInt535 -= this.anInt534;
		this.anInt534 = 0;
	}

	@OriginalMember(owner = "client!bfa", name = "c", descriptor = "([III)V")
	private void method472(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub7 local5 = (Class1_Sub7) this.aClass353_6.method7677(); local5 != null; local5 = (Class1_Sub7) this.aClass353_6.method7687()) {
			local5.method6133(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "()Lclient!pda;")
	@Override
	public Class1_Sub7 method6134() {
		return (Class1_Sub7) this.aClass353_6.method7677();
	}

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "()I")
	@Override
	public int method6135() {
		return 0;
	}

	@OriginalMember(owner = "client!bfa", name = "f", descriptor = "()I")
	public synchronized int method473() {
		return this.aClass353_6.method7682();
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lclient!wa;)V")
	private void method474(@OriginalArg(0) Class1_Sub47 arg0) {
		arg0.method7859();
		arg0.method7669();
		@Pc(9) Class1 local9 = this.aClass353_7.aClass1_271.aClass1_285;
		if (local9 == this.aClass353_7.aClass1_271) {
			this.anInt535 = -1;
		} else {
			this.anInt535 = ((Class1_Sub47) local9).anInt9408;
		}
	}

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "(I)V")
	private void method475(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub7 local5 = (Class1_Sub7) this.aClass353_6.method7677(); local5 != null; local5 = (Class1_Sub7) this.aClass353_6.method7687()) {
			local5.method6138(arg0);
		}
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lclient!pca;Lclient!wa;)V")
	private void method476(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub47 arg1) {
		while (arg0 != this.aClass353_7.aClass1_271 && ((Class1_Sub47) arg0).anInt9408 <= arg1.anInt9408) {
			arg0 = arg0.aClass1_285;
		}
		Static509.method4319(arg1, arg0);
		this.anInt535 = ((Class1_Sub47) this.aClass353_7.aClass1_271.aClass1_285).anInt9408;
	}

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "(Lclient!pda;)V")
	public synchronized void method477(@OriginalArg(0) Class1_Sub7 arg0) {
		arg0.method7859();
	}

	@OriginalMember(owner = "client!bfa", name = "c", descriptor = "()Lclient!pda;")
	@Override
	public Class1_Sub7 method6136() {
		return (Class1_Sub7) this.aClass353_6.method7687();
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method6132(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt535 < 0) {
				this.method472(arg0, arg1, arg2);
				return;
			}
			if (this.anInt534 + arg2 < this.anInt535) {
				this.anInt534 += arg2;
				this.method472(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt535 - this.anInt534;
			this.method472(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt534 += local33;
			this.method471();
			@Pc(60) Class1_Sub47 local60 = (Class1_Sub47) this.aClass353_7.method7677();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method7670(this);
				if (local68 < 0) {
					local60.anInt9408 = 0;
					this.method474(local60);
				} else {
					local60.anInt9408 = local68;
					this.method476(local60.aClass1_285, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6138(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt535 < 0) {
				this.method475(arg0);
				return;
			}
			if (this.anInt534 + arg0 < this.anInt535) {
				this.anInt534 += arg0;
				this.method475(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt535 - this.anInt534;
			this.method475(local29);
			arg0 -= local29;
			this.anInt534 += local29;
			this.method471();
			@Pc(50) Class1_Sub47 local50 = (Class1_Sub47) this.aClass353_7.method7677();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method7670(this);
				if (local58 < 0) {
					local50.anInt9408 = 0;
					this.method474(local50);
				} else {
					local50.anInt9408 = local58;
					this.method476(local50.aClass1_285, local50);
				}
			}
		} while (arg0 != 0);
	}
}
