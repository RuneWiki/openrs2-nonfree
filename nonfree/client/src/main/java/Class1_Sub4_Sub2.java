import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gw")
public final class Class1_Sub4_Sub2 extends Class1_Sub4 {

	@OriginalMember(owner = "client!gw", name = "q", descriptor = "Lclient!ui;")
	private final Class295 aClass295_13 = new Class295();

	@OriginalMember(owner = "client!gw", name = "r", descriptor = "Lclient!ui;")
	private final Class295 aClass295_14 = new Class295();

	@OriginalMember(owner = "client!gw", name = "t", descriptor = "I")
	private int anInt3406 = 0;

	@OriginalMember(owner = "client!gw", name = "s", descriptor = "I")
	private int anInt3405 = -1;

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lclient!nc;)V")
	private void method3182(@OriginalArg(0) Class1_Sub38 arg0) {
		arg0.method8239();
		arg0.method5447();
		@Pc(9) Class1 local9 = this.aClass295_14.aClass1_260.aClass1_283;
		if (local9 == this.aClass295_14.aClass1_260) {
			this.anInt3405 = -1;
		} else {
			this.anInt3405 = ((Class1_Sub38) local9).anInt6012;
		}
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method7986(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt3405 < 0) {
				this.method3187(arg0, arg1, arg2);
				return;
			}
			if (this.anInt3406 + arg2 < this.anInt3405) {
				this.anInt3406 += arg2;
				this.method3187(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt3405 - this.anInt3406;
			this.method3187(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt3406 += local33;
			this.method3188();
			@Pc(60) Class1_Sub38 local60 = (Class1_Sub38) this.aClass295_14.method7543();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method5448(this);
				if (local68 < 0) {
					local60.anInt6012 = 0;
					this.method3182(local60);
				} else {
					local60.anInt6012 = local68;
					this.method3183(local60.aClass1_283, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!gw", name = "d", descriptor = "()I")
	@Override
	public int method7987() {
		return 0;
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "()Lclient!vv;")
	@Override
	public Class1_Sub4 method7984() {
		return (Class1_Sub4) this.aClass295_13.method7540();
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lclient!wda;Lclient!nc;)V")
	private void method3183(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub38 arg1) {
		while (arg0 != this.aClass295_14.aClass1_260 && ((Class1_Sub38) arg0).anInt6012 <= arg1.anInt6012) {
			arg0 = arg0.aClass1_283;
		}
		Static363.method5896(arg1, arg0);
		this.anInt3405 = ((Class1_Sub38) this.aClass295_14.aClass1_260.aClass1_283).anInt6012;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lclient!vv;)V")
	public synchronized void method3184(@OriginalArg(0) Class1_Sub4 arg0) {
		arg0.method8239();
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7981(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt3405 < 0) {
				this.method3185(arg0);
				return;
			}
			if (this.anInt3406 + arg0 < this.anInt3405) {
				this.anInt3406 += arg0;
				this.method3185(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt3405 - this.anInt3406;
			this.method3185(local29);
			arg0 -= local29;
			this.anInt3406 += local29;
			this.method3188();
			@Pc(50) Class1_Sub38 local50 = (Class1_Sub38) this.aClass295_14.method7543();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method5448(this);
				if (local58 < 0) {
					local50.anInt6012 = 0;
					this.method3182(local50);
				} else {
					local50.anInt6012 = local58;
					this.method3183(local50.aClass1_283, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)V")
	private void method3185(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub4 local5 = (Class1_Sub4) this.aClass295_13.method7543(); local5 != null; local5 = (Class1_Sub4) this.aClass295_13.method7540()) {
			local5.method7981(arg0);
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "()Lclient!vv;")
	@Override
	public Class1_Sub4 method7983() {
		return (Class1_Sub4) this.aClass295_13.method7543();
	}

	@OriginalMember(owner = "client!gw", name = "e", descriptor = "()I")
	public synchronized int method3186() {
		return this.aClass295_13.method7548();
	}

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "([III)V")
	private void method3187(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub4 local5 = (Class1_Sub4) this.aClass295_13.method7543(); local5 != null; local5 = (Class1_Sub4) this.aClass295_13.method7540()) {
			local5.method7982(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!gw", name = "f", descriptor = "()V")
	private void method3188() {
		if (this.anInt3406 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub38 local8 = (Class1_Sub38) this.aClass295_14.method7543(); local8 != null; local8 = (Class1_Sub38) this.aClass295_14.method7540()) {
			local8.anInt6012 -= this.anInt3406;
		}
		this.anInt3405 -= this.anInt3406;
		this.anInt3406 = 0;
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(Lclient!vv;)V")
	public synchronized void method3189(@OriginalArg(0) Class1_Sub4 arg0) {
		this.aClass295_13.method7546(arg0);
	}
}
