import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class1_Sub5_Sub4 extends Class1_Sub5 {

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "Lclient!hi;")
	private Class61 aClass61_31 = new Class61();

	@OriginalMember(owner = "client!wd", name = "r", descriptor = "Lclient!hi;")
	private Class61 aClass61_32 = new Class61();

	@OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
	private int anInt5512 = -1;

	@OriginalMember(owner = "client!wd", name = "s", descriptor = "I")
	private int anInt5511 = 0;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!an;)V")
	public synchronized void method4376(@OriginalArg(0) Class1_Sub5 arg0) {
		this.aClass61_31.method1843(arg0);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method4372(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt5512 < 0) {
				this.method4377(arg0);
				return;
			}
			if (this.anInt5511 + arg0 < this.anInt5512) {
				this.anInt5511 += arg0;
				this.method4377(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt5512 - this.anInt5511;
			this.method4377(local29);
			arg0 -= local29;
			this.anInt5511 += local29;
			this.method4379();
			@Pc(50) Class1_Sub21 local50 = (Class1_Sub21) this.aClass61_32.method1835();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method2718(this);
				if (local58 < 0) {
					local50.anInt3360 = 0;
					this.method4382(local50);
				} else {
					local50.anInt3360 = local58;
					this.method4381(local50.aClass1_231, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "()Lclient!an;")
	@Override
	public Class1_Sub5 method4375() {
		return (Class1_Sub5) this.aClass61_31.method1836();
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4374(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt5512 < 0) {
				this.method4378(arg0, arg1, arg2);
				return;
			}
			if (this.anInt5511 + arg2 < this.anInt5512) {
				this.anInt5511 += arg2;
				this.method4378(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt5512 - this.anInt5511;
			this.method4378(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt5511 += local33;
			this.method4379();
			@Pc(60) Class1_Sub21 local60 = (Class1_Sub21) this.aClass61_32.method1835();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method2718(this);
				if (local68 < 0) {
					local60.anInt3360 = 0;
					this.method4382(local60);
				} else {
					local60.anInt3360 = local68;
					this.method4381(local60.aClass1_231, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "()I")
	@Override
	public int method4373() {
		return 0;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V")
	private void method4377(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub5 local5 = (Class1_Sub5) this.aClass61_31.method1835(); local5 != null; local5 = (Class1_Sub5) this.aClass61_31.method1836()) {
			local5.method4372(arg0);
		}
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "([III)V")
	private void method4378(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub5 local5 = (Class1_Sub5) this.aClass61_31.method1835(); local5 != null; local5 = (Class1_Sub5) this.aClass61_31.method1836()) {
			local5.method4369(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "()V")
	private void method4379() {
		if (this.anInt5511 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub21 local8 = (Class1_Sub21) this.aClass61_32.method1835(); local8 != null; local8 = (Class1_Sub21) this.aClass61_32.method1836()) {
			local8.anInt3360 -= this.anInt5511;
		}
		this.anInt5512 -= this.anInt5511;
		this.anInt5511 = 0;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(Lclient!an;)V")
	public synchronized void method4380(@OriginalArg(0) Class1_Sub5 arg0) {
		arg0.method4441();
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!im;Lclient!ll;)V")
	private void method4381(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub21 arg1) {
		while (arg0 != this.aClass61_32.aClass1_106 && ((Class1_Sub21) arg0).anInt3360 <= arg1.anInt3360) {
			arg0 = arg0.aClass1_231;
		}
		Static119.method2128(arg1, arg0);
		this.anInt5512 = ((Class1_Sub21) this.aClass61_32.aClass1_106.aClass1_231).anInt3360;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!ll;)V")
	private void method4382(@OriginalArg(0) Class1_Sub21 arg0) {
		arg0.method4441();
		arg0.method2717();
		@Pc(9) Class1 local9 = this.aClass61_32.aClass1_106.aClass1_231;
		if (local9 == this.aClass61_32.aClass1_106) {
			this.anInt5512 = -1;
		} else {
			this.anInt5512 = ((Class1_Sub21) local9).anInt3360;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "()Lclient!an;")
	@Override
	public Class1_Sub5 method4370() {
		return (Class1_Sub5) this.aClass61_31.method1835();
	}
}
