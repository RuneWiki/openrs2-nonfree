import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class3_Sub14_Sub1 extends Class3_Sub14 {

	@OriginalMember(owner = "client!fg", name = "r", descriptor = "Lclient!ki;")
	private final Class183 aClass183_15 = new Class183();

	@OriginalMember(owner = "client!fg", name = "s", descriptor = "Lclient!ki;")
	private final Class183 aClass183_16 = new Class183();

	@OriginalMember(owner = "client!fg", name = "t", descriptor = "I")
	private int anInt3215 = 0;

	@OriginalMember(owner = "client!fg", name = "u", descriptor = "I")
	private int anInt3216 = -1;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method7823(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt3216 < 0) {
				this.method2821(arg0, arg1, arg2);
				return;
			}
			if (this.anInt3215 + arg2 < this.anInt3216) {
				this.anInt3215 += arg2;
				this.method2821(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt3216 - this.anInt3215;
			this.method2821(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt3215 += local33;
			this.method2823();
			@Pc(60) Class3_Sub12 local60 = (Class3_Sub12) this.aClass183_16.method4795();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method2291(this);
				if (local68 < 0) {
					local60.anInt2596 = 0;
					this.method2817(local60);
				} else {
					local60.anInt2596 = local68;
					this.method2819(local60.aClass3_288, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!ega;)V")
	public synchronized void method2816(@OriginalArg(0) Class3_Sub14 arg0) {
		arg0.method8412();
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!eda;)V")
	private void method2817(@OriginalArg(0) Class3_Sub12 arg0) {
		arg0.method8412();
		arg0.method2290();
		@Pc(9) Class3 local9 = this.aClass183_16.aClass3_161.aClass3_288;
		if (local9 == this.aClass183_16.aClass3_161) {
			this.anInt3216 = -1;
		} else {
			this.anInt3216 = ((Class3_Sub12) local9).anInt2596;
		}
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "()I")
	@Override
	public int method7820() {
		return 0;
	}

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "()Lclient!ega;")
	@Override
	public Class3_Sub14 method7822() {
		return (Class3_Sub14) this.aClass183_15.method4795();
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V")
	private void method2818(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class3_Sub14 local5 = (Class3_Sub14) this.aClass183_15.method4795(); local5 != null; local5 = (Class3_Sub14) this.aClass183_15.method4793()) {
			local5.method7821(arg0);
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!faa;Lclient!eda;)V")
	private void method2819(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3_Sub12 arg1) {
		while (arg0 != this.aClass183_16.aClass3_161 && ((Class3_Sub12) arg0).anInt2596 <= arg1.anInt2596) {
			arg0 = arg0.aClass3_288;
		}
		Static552.method8061(arg0, arg1);
		this.anInt3216 = ((Class3_Sub12) this.aClass183_16.aClass3_161.aClass3_288).anInt2596;
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(Lclient!ega;)V")
	public synchronized void method2820(@OriginalArg(0) Class3_Sub14 arg0) {
		this.aClass183_15.method4787(arg0);
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "([III)V")
	private void method2821(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class3_Sub14 local5 = (Class3_Sub14) this.aClass183_15.method4795(); local5 != null; local5 = (Class3_Sub14) this.aClass183_15.method4793()) {
			local5.method7824(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7821(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt3216 < 0) {
				this.method2818(arg0);
				return;
			}
			if (this.anInt3215 + arg0 < this.anInt3216) {
				this.anInt3215 += arg0;
				this.method2818(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt3216 - this.anInt3215;
			this.method2818(local29);
			arg0 -= local29;
			this.anInt3215 += local29;
			this.method2823();
			@Pc(50) Class3_Sub12 local50 = (Class3_Sub12) this.aClass183_16.method4795();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method2291(this);
				if (local58 < 0) {
					local50.anInt2596 = 0;
					this.method2817(local50);
				} else {
					local50.anInt2596 = local58;
					this.method2819(local50.aClass3_288, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "()Lclient!ega;")
	@Override
	public Class3_Sub14 method7819() {
		return (Class3_Sub14) this.aClass183_15.method4793();
	}

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "()I")
	public synchronized int method2822() {
		return this.aClass183_15.method4799();
	}

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "()V")
	private void method2823() {
		if (this.anInt3215 <= 0) {
			return;
		}
		for (@Pc(8) Class3_Sub12 local8 = (Class3_Sub12) this.aClass183_16.method4795(); local8 != null; local8 = (Class3_Sub12) this.aClass183_16.method4793()) {
			local8.anInt2596 -= this.anInt3215;
		}
		this.anInt3216 -= this.anInt3215;
		this.anInt3215 = 0;
	}
}
