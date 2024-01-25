import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public final class Class3_Sub9_Sub1 extends Class3_Sub9 {

	@OriginalMember(owner = "client!bt", name = "m", descriptor = "Lclient!jia;")
	private final Class193 aClass193_7 = new Class193();

	@OriginalMember(owner = "client!bt", name = "n", descriptor = "Lclient!jia;")
	private final Class193 aClass193_8 = new Class193();

	@OriginalMember(owner = "client!bt", name = "p", descriptor = "I")
	private int anInt1445 = 0;

	@OriginalMember(owner = "client!bt", name = "o", descriptor = "I")
	private int anInt1444 = -1;

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!ri;)V")
	public synchronized void method1419(@OriginalArg(0) Class3_Sub9 arg0) {
		this.aClass193_7.method4455(arg0);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6701(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt1444 < 0) {
				this.method1423(arg0);
				return;
			}
			if (this.anInt1445 + arg0 < this.anInt1444) {
				this.anInt1445 += arg0;
				this.method1423(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt1444 - this.anInt1445;
			this.method1423(local29);
			arg0 -= local29;
			this.anInt1445 += local29;
			this.method1422();
			@Pc(50) Class3_Sub18 local50 = (Class3_Sub18) this.aClass193_8.method4457();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method2750(this);
				if (local58 < 0) {
					local50.anInt3006 = 0;
					this.method1424(local50);
				} else {
					local50.anInt3006 = local58;
					this.method1426(local50.aClass3_337, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(Lclient!ri;)V")
	public synchronized void method1420(@OriginalArg(0) Class3_Sub9 arg0) {
		arg0.method8770();
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "([III)V")
	private void method1421(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class3_Sub9 local5 = (Class3_Sub9) this.aClass193_7.method4457(); local5 != null; local5 = (Class3_Sub9) this.aClass193_7.method4459()) {
			local5.method6697(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "()I")
	@Override
	public int method6699() {
		return 0;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "()Lclient!ri;")
	@Override
	public Class3_Sub9 method6696() {
		return (Class3_Sub9) this.aClass193_7.method4459();
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method6702(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt1444 < 0) {
				this.method1421(arg0, arg1, arg2);
				return;
			}
			if (this.anInt1445 + arg2 < this.anInt1444) {
				this.anInt1445 += arg2;
				this.method1421(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt1444 - this.anInt1445;
			this.method1421(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt1445 += local33;
			this.method1422();
			@Pc(60) Class3_Sub18 local60 = (Class3_Sub18) this.aClass193_8.method4457();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method2750(this);
				if (local68 < 0) {
					local60.anInt3006 = 0;
					this.method1424(local60);
				} else {
					local60.anInt3006 = local68;
					this.method1426(local60.aClass3_337, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "()V")
	private void method1422() {
		if (this.anInt1445 <= 0) {
			return;
		}
		for (@Pc(8) Class3_Sub18 local8 = (Class3_Sub18) this.aClass193_8.method4457(); local8 != null; local8 = (Class3_Sub18) this.aClass193_8.method4459()) {
			local8.anInt3006 -= this.anInt1445;
		}
		this.anInt1444 -= this.anInt1445;
		this.anInt1445 = 0;
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)V")
	private void method1423(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class3_Sub9 local5 = (Class3_Sub9) this.aClass193_7.method4457(); local5 != null; local5 = (Class3_Sub9) this.aClass193_7.method4459()) {
			local5.method6701(arg0);
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!fg;)V")
	private void method1424(@OriginalArg(0) Class3_Sub18 arg0) {
		arg0.method8770();
		arg0.method2751();
		@Pc(9) Class3 local9 = this.aClass193_8.aClass3_155.aClass3_337;
		if (local9 == this.aClass193_8.aClass3_155) {
			this.anInt1444 = -1;
		} else {
			this.anInt1444 = ((Class3_Sub18) local9).anInt3006;
		}
	}

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "()I")
	public synchronized int method1425() {
		return this.aClass193_7.method4463();
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!wk;Lclient!fg;)V")
	private void method1426(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3_Sub18 arg1) {
		while (arg0 != this.aClass193_8.aClass3_155 && ((Class3_Sub18) arg0).anInt3006 <= arg1.anInt3006) {
			arg0 = arg0.aClass3_337;
		}
		Static341.method5167(arg1, arg0);
		this.anInt1444 = ((Class3_Sub18) this.aClass193_8.aClass3_155.aClass3_337).anInt3006;
	}

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "()Lclient!ri;")
	@Override
	public Class3_Sub9 method6700() {
		return (Class3_Sub9) this.aClass193_7.method4457();
	}
}
