import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class1_Sub6_Sub3 extends Class1_Sub6 {

	@OriginalMember(owner = "client!n", name = "t", descriptor = "Lclient!eb;")
	private final Class42 aClass42_35 = new Class42();

	@OriginalMember(owner = "client!n", name = "u", descriptor = "Lclient!eb;")
	private final Class42 aClass42_36 = new Class42();

	@OriginalMember(owner = "client!n", name = "v", descriptor = "I")
	private int anInt4079 = 0;

	@OriginalMember(owner = "client!n", name = "w", descriptor = "I")
	private int anInt4080 = -1;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!ar;)V")
	public synchronized void method3785(@OriginalArg(0) Class1_Sub6 arg0) {
		this.aClass42_35.method1539(arg0);
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4055(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt4080 < 0) {
				this.method3791(arg0, arg1, arg2);
				return;
			}
			if (this.anInt4079 + arg2 < this.anInt4080) {
				this.anInt4079 += arg2;
				this.method3791(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt4080 - this.anInt4079;
			this.method3791(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt4079 += local33;
			this.method3788();
			@Pc(60) Class1_Sub34 local60 = (Class1_Sub34) this.aClass42_36.method1543();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method4706(this);
				if (local68 < 0) {
					local60.anInt5093 = 0;
					this.method3789(local60);
				} else {
					local60.anInt5093 = local68;
					this.method3790(local60.aClass1_251, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(Lclient!ar;)V")
	public synchronized void method3786(@OriginalArg(0) Class1_Sub6 arg0) {
		arg0.method6045();
	}

	@OriginalMember(owner = "client!n", name = "e", descriptor = "(I)V")
	private void method3787(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub6 local5 = (Class1_Sub6) this.aClass42_35.method1543(); local5 != null; local5 = (Class1_Sub6) this.aClass42_35.method1551()) {
			local5.method4051(arg0);
		}
	}

	@OriginalMember(owner = "client!n", name = "e", descriptor = "()V")
	private void method3788() {
		if (this.anInt4079 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub34 local8 = (Class1_Sub34) this.aClass42_36.method1543(); local8 != null; local8 = (Class1_Sub34) this.aClass42_36.method1551()) {
			local8.anInt5093 -= this.anInt4079;
		}
		this.anInt4080 -= this.anInt4079;
		this.anInt4079 = 0;
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "()Lclient!ar;")
	@Override
	public Class1_Sub6 method4056() {
		return (Class1_Sub6) this.aClass42_35.method1551();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!ps;)V")
	private void method3789(@OriginalArg(0) Class1_Sub34 arg0) {
		arg0.method6045();
		arg0.method4707();
		@Pc(9) Class1 local9 = this.aClass42_36.aClass1_73.aClass1_251;
		if (local9 == this.aClass42_36.aClass1_73) {
			this.anInt4080 = -1;
		} else {
			this.anInt4080 = ((Class1_Sub34) local9).anInt5093;
		}
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "()Lclient!ar;")
	@Override
	public Class1_Sub6 method4054() {
		return (Class1_Sub6) this.aClass42_35.method1543();
	}

	@OriginalMember(owner = "client!n", name = "d", descriptor = "()I")
	@Override
	public int method4057() {
		return 0;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!gk;Lclient!ps;)V")
	private void method3790(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub34 arg1) {
		while (arg0 != this.aClass42_36.aClass1_73 && ((Class1_Sub34) arg0).anInt5093 <= arg1.anInt5093) {
			arg0 = arg0.aClass1_251;
		}
		Static188.method3533(arg1, arg0);
		this.anInt4080 = ((Class1_Sub34) this.aClass42_36.aClass1_73.aClass1_251).anInt5093;
	}

	@OriginalMember(owner = "client!n", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method4051(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt4080 < 0) {
				this.method3787(arg0);
				return;
			}
			if (this.anInt4079 + arg0 < this.anInt4080) {
				this.anInt4079 += arg0;
				this.method3787(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt4080 - this.anInt4079;
			this.method3787(local29);
			arg0 -= local29;
			this.anInt4079 += local29;
			this.method3788();
			@Pc(50) Class1_Sub34 local50 = (Class1_Sub34) this.aClass42_36.method1543();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method4706(this);
				if (local58 < 0) {
					local50.anInt5093 = 0;
					this.method3789(local50);
				} else {
					local50.anInt5093 = local58;
					this.method3790(local50.aClass1_251, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "([III)V")
	private void method3791(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub6 local5 = (Class1_Sub6) this.aClass42_35.method1543(); local5 != null; local5 = (Class1_Sub6) this.aClass42_35.method1551()) {
			local5.method4052(arg0, arg1, arg2);
		}
	}
}
