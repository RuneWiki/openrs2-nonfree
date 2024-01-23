import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class1_Sub24_Sub3 extends Class1_Sub24 {

	@OriginalMember(owner = "client!vf", name = "o", descriptor = "Lclient!gj;")
	private Class59 aClass59_38 = new Class59();

	@OriginalMember(owner = "client!vf", name = "p", descriptor = "Lclient!gj;")
	private Class59 aClass59_39 = new Class59();

	@OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
	private int anInt5302 = -1;

	@OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
	private int anInt5303 = 0;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!ba;Lclient!ug;)V")
	private void method4512(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub30 arg1) {
		while (arg0 != this.aClass59_39.aClass1_83 && ((Class1_Sub30) arg0).anInt5107 <= arg1.anInt5107) {
			arg0 = arg0.aClass1_235;
		}
		Static69.method4280(arg0, arg1);
		this.anInt5302 = ((Class1_Sub30) this.aClass59_39.aClass1_83.aClass1_235).anInt5107;
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method4619(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt5302 < 0) {
				this.method4516(arg0);
				return;
			}
			if (this.anInt5303 + arg0 < this.anInt5302) {
				this.anInt5303 += arg0;
				this.method4516(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt5302 - this.anInt5303;
			this.method4516(local29);
			arg0 -= local29;
			this.anInt5303 += local29;
			this.method4513();
			@Pc(50) Class1_Sub30 local50 = (Class1_Sub30) this.aClass59_39.method1704();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method4365(this);
				if (local58 < 0) {
					local50.anInt5107 = 0;
					this.method4517(local50);
				} else {
					local50.anInt5107 = local58;
					this.method4512(local50.aClass1_235, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "()I")
	@Override
	public int method4623() {
		return 0;
	}

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "()V")
	private void method4513() {
		if (this.anInt5303 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub30 local8 = (Class1_Sub30) this.aClass59_39.method1704(); local8 != null; local8 = (Class1_Sub30) this.aClass59_39.method1701()) {
			local8.anInt5107 -= this.anInt5303;
		}
		this.anInt5302 -= this.anInt5303;
		this.anInt5303 = 0;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4624(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt5302 < 0) {
				this.method4515(arg0, arg1, arg2);
				return;
			}
			if (this.anInt5303 + arg2 < this.anInt5302) {
				this.anInt5303 += arg2;
				this.method4515(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt5302 - this.anInt5303;
			this.method4515(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt5303 += local33;
			this.method4513();
			@Pc(60) Class1_Sub30 local60 = (Class1_Sub30) this.aClass59_39.method1704();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method4365(this);
				if (local68 < 0) {
					local60.anInt5107 = 0;
					this.method4517(local60);
				} else {
					local60.anInt5107 = local68;
					this.method4512(local60.aClass1_235, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "()Lclient!qd;")
	@Override
	public Class1_Sub24 method4622() {
		return (Class1_Sub24) this.aClass59_38.method1701();
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!qd;)V")
	public synchronized void method4514(@OriginalArg(0) Class1_Sub24 arg0) {
		this.aClass59_38.method1702(arg0);
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "([III)V")
	private void method4515(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub24 local5 = (Class1_Sub24) this.aClass59_38.method1704(); local5 != null; local5 = (Class1_Sub24) this.aClass59_38.method1701()) {
			local5.method4620(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)V")
	private void method4516(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub24 local5 = (Class1_Sub24) this.aClass59_38.method1704(); local5 != null; local5 = (Class1_Sub24) this.aClass59_38.method1701()) {
			local5.method4619(arg0);
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!ug;)V")
	private void method4517(@OriginalArg(0) Class1_Sub30 arg0) {
		arg0.method4779();
		arg0.method4366();
		@Pc(9) Class1 local9 = this.aClass59_39.aClass1_83.aClass1_235;
		if (local9 == this.aClass59_39.aClass1_83) {
			this.anInt5302 = -1;
		} else {
			this.anInt5302 = ((Class1_Sub30) local9).anInt5107;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "()Lclient!qd;")
	@Override
	public Class1_Sub24 method4618() {
		return (Class1_Sub24) this.aClass59_38.method1704();
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(Lclient!qd;)V")
	public synchronized void method4518(@OriginalArg(0) Class1_Sub24 arg0) {
		arg0.method4779();
	}
}
