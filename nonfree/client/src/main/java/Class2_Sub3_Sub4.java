import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class2_Sub3_Sub4 extends Class2_Sub3 {

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "Lclient!en;")
	private Class44 aClass44_27 = new Class44();

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "Lclient!en;")
	private Class44 aClass44_28 = new Class44();

	@OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
	private int anInt5945 = -1;

	@OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
	private int anInt5946 = 0;

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method4650(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt5945 < 0) {
				this.method4656(arg0);
				return;
			}
			if (this.anInt5946 + arg0 < this.anInt5945) {
				this.anInt5946 += arg0;
				this.method4656(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt5945 - this.anInt5946;
			this.method4656(local29);
			arg0 -= local29;
			this.anInt5946 += local29;
			this.method4659();
			@Pc(50) Class2_Sub26 local50 = (Class2_Sub26) this.aClass44_28.method1352();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method3967(this);
				if (local58 < 0) {
					local50.anInt4947 = 0;
					this.method4658(local50);
				} else {
					local50.anInt4947 = local58;
					this.method4660(local50.aClass2_232, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4653(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt5945 < 0) {
				this.method4661(arg0, arg1, arg2);
				return;
			}
			if (this.anInt5946 + arg2 < this.anInt5945) {
				this.anInt5946 += arg2;
				this.method4661(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt5945 - this.anInt5946;
			this.method4661(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt5946 += local33;
			this.method4659();
			@Pc(60) Class2_Sub26 local60 = (Class2_Sub26) this.aClass44_28.method1352();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method3967(this);
				if (local68 < 0) {
					local60.anInt4947 = 0;
					this.method4658(local60);
				} else {
					local60.anInt4947 = local68;
					this.method4660(local60.aClass2_232, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V")
	private void method4656(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class2_Sub3 local5 = (Class2_Sub3) this.aClass44_27.method1352(); local5 != null; local5 = (Class2_Sub3) this.aClass44_27.method1360()) {
			local5.method4650(arg0);
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!mh;)V")
	public synchronized void method4657(@OriginalArg(0) Class2_Sub3 arg0) {
		this.aClass44_27.method1355(arg0);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!sa;)V")
	private void method4658(@OriginalArg(0) Class2_Sub26 arg0) {
		arg0.method4743();
		arg0.method3968();
		@Pc(9) Class2 local9 = this.aClass44_28.aClass2_77.aClass2_232;
		if (local9 == this.aClass44_28.aClass2_77) {
			this.anInt5945 = -1;
		} else {
			this.anInt5945 = ((Class2_Sub26) local9).anInt4947;
		}
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "()V")
	private void method4659() {
		if (this.anInt5946 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub26 local8 = (Class2_Sub26) this.aClass44_28.method1352(); local8 != null; local8 = (Class2_Sub26) this.aClass44_28.method1360()) {
			local8.anInt4947 -= this.anInt5946;
		}
		this.anInt5945 -= this.anInt5946;
		this.anInt5946 = 0;
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "()Lclient!mh;")
	@Override
	public Class2_Sub3 method4654() {
		return (Class2_Sub3) this.aClass44_27.method1360();
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "()Lclient!mh;")
	@Override
	public Class2_Sub3 method4649() {
		return (Class2_Sub3) this.aClass44_27.method1352();
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!qk;Lclient!sa;)V")
	private void method4660(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub26 arg1) {
		while (arg0 != this.aClass44_28.aClass2_77 && ((Class2_Sub26) arg0).anInt4947 <= arg1.anInt4947) {
			arg0 = arg0.aClass2_232;
		}
		Static89.method1574(arg0, arg1);
		this.anInt5945 = ((Class2_Sub26) this.aClass44_28.aClass2_77.aClass2_232).anInt4947;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "()I")
	@Override
	public int method4651() {
		return 0;
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "([III)V")
	private void method4661(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class2_Sub3 local5 = (Class2_Sub3) this.aClass44_27.method1352(); local5 != null; local5 = (Class2_Sub3) this.aClass44_27.method1360()) {
			local5.method4652(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(Lclient!mh;)V")
	public synchronized void method4662(@OriginalArg(0) Class2_Sub3 arg0) {
		arg0.method4743();
	}
}
