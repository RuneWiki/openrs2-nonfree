import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class2_Sub3_Sub1 extends Class2_Sub3 {

	@OriginalMember(owner = "client!aj", name = "t", descriptor = "Lclient!wq;")
	private final Class216 aClass216_5 = new Class216();

	@OriginalMember(owner = "client!aj", name = "u", descriptor = "Lclient!wq;")
	private final Class216 aClass216_6 = new Class216();

	@OriginalMember(owner = "client!aj", name = "v", descriptor = "I")
	private int anInt221 = 0;

	@OriginalMember(owner = "client!aj", name = "w", descriptor = "I")
	private int anInt222 = -1;

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4479(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt222 < 0) {
				this.method366(arg0, arg1, arg2);
				return;
			}
			if (this.anInt221 + arg2 < this.anInt222) {
				this.anInt221 += arg2;
				this.method366(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt222 - this.anInt221;
			this.method366(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt221 += local33;
			this.method364();
			@Pc(60) Class2_Sub33 local60 = (Class2_Sub33) this.aClass216_6.method5992();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method4091(this);
				if (local68 < 0) {
					local60.anInt4554 = 0;
					this.method369(local60);
				} else {
					local60.anInt4554 = local68;
					this.method368(local60.aClass2_250, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method4473(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt222 < 0) {
				this.method370(arg0);
				return;
			}
			if (this.anInt221 + arg0 < this.anInt222) {
				this.anInt221 += arg0;
				this.method370(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt222 - this.anInt221;
			this.method370(local29);
			arg0 -= local29;
			this.anInt221 += local29;
			this.method364();
			@Pc(50) Class2_Sub33 local50 = (Class2_Sub33) this.aClass216_6.method5992();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method4091(this);
				if (local58 < 0) {
					local50.anInt4554 = 0;
					this.method369(local50);
				} else {
					local50.anInt4554 = local58;
					this.method368(local50.aClass2_250, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "()V")
	private void method364() {
		if (this.anInt221 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub33 local8 = (Class2_Sub33) this.aClass216_6.method5992(); local8 != null; local8 = (Class2_Sub33) this.aClass216_6.method6000()) {
			local8.anInt4554 -= this.anInt221;
		}
		this.anInt222 -= this.anInt221;
		this.anInt221 = 0;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "()I")
	@Override
	public int method4474() {
		return 0;
	}

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "()Lclient!j;")
	@Override
	public Class2_Sub3 method4476() {
		return (Class2_Sub3) this.aClass216_5.method6000();
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!j;)V")
	public synchronized void method365(@OriginalArg(0) Class2_Sub3 arg0) {
		arg0.method5945();
	}

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "([III)V")
	private void method366(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class2_Sub3 local5 = (Class2_Sub3) this.aClass216_5.method5992(); local5 != null; local5 = (Class2_Sub3) this.aClass216_5.method6000()) {
			local5.method4477(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(Lclient!j;)V")
	public synchronized void method367(@OriginalArg(0) Class2_Sub3 arg0) {
		this.aClass216_5.method5997(arg0);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!qf;Lclient!os;)V")
	private void method368(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub33 arg1) {
		while (arg0 != this.aClass216_6.aClass2_251 && ((Class2_Sub33) arg0).anInt4554 <= arg1.anInt4554) {
			arg0 = arg0.aClass2_250;
		}
		Static147.method418(arg1, arg0);
		this.anInt222 = ((Class2_Sub33) this.aClass216_6.aClass2_251.aClass2_250).anInt4554;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!os;)V")
	private void method369(@OriginalArg(0) Class2_Sub33 arg0) {
		arg0.method5945();
		arg0.method4090();
		@Pc(9) Class2 local9 = this.aClass216_6.aClass2_251.aClass2_250;
		if (local9 == this.aClass216_6.aClass2_251) {
			this.anInt222 = -1;
		} else {
			this.anInt222 = ((Class2_Sub33) local9).anInt4554;
		}
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "()Lclient!j;")
	@Override
	public Class2_Sub3 method4475() {
		return (Class2_Sub3) this.aClass216_5.method5992();
	}

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)V")
	private void method370(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class2_Sub3 local5 = (Class2_Sub3) this.aClass216_5.method5992(); local5 != null; local5 = (Class2_Sub3) this.aClass216_5.method6000()) {
			local5.method4473(arg0);
		}
	}
}
