import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class1_Sub12_Sub1 extends Class1_Sub12 {

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "Lclient!mi;")
	private Class75 aClass75_7 = new Class75();

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "Lclient!mi;")
	private Class75 aClass75_8 = new Class75();

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
	private int anInt1177 = 0;

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
	private int anInt1178 = -1;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method3036(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt1178 < 0) {
				this.method896(arg0, arg1, arg2);
				return;
			}
			if (this.anInt1177 + arg2 < this.anInt1178) {
				this.anInt1177 += arg2;
				this.method896(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt1178 - this.anInt1177;
			this.method896(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt1177 += local33;
			this.method900();
			@Pc(60) Class1_Sub8 local60 = (Class1_Sub8) this.aClass75_8.method2239();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method591(this);
				if (local68 < 0) {
					local60.anInt784 = 0;
					this.method899(local60);
				} else {
					local60.anInt784 = local68;
					this.method897(local60.aClass1_203, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "()I")
	@Override
	public int method3033() {
		return 0;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!ge;)V")
	public synchronized void method894(@OriginalArg(0) Class1_Sub12 arg0) {
		arg0.method3525();
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(Lclient!ge;)V")
	public synchronized void method895(@OriginalArg(0) Class1_Sub12 arg0) {
		this.aClass75_7.method2236(arg0);
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "([III)V")
	private void method896(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub12 local5 = (Class1_Sub12) this.aClass75_7.method2239(); local5 != null; local5 = (Class1_Sub12) this.aClass75_7.method2238()) {
			local5.method3039(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method3037(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt1178 < 0) {
				this.method898(arg0);
				return;
			}
			if (this.anInt1177 + arg0 < this.anInt1178) {
				this.anInt1177 += arg0;
				this.method898(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt1178 - this.anInt1177;
			this.method898(local29);
			arg0 -= local29;
			this.anInt1177 += local29;
			this.method900();
			@Pc(50) Class1_Sub8 local50 = (Class1_Sub8) this.aClass75_8.method2239();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method591(this);
				if (local58 < 0) {
					local50.anInt784 = 0;
					this.method899(local50);
				} else {
					local50.anInt784 = local58;
					this.method897(local50.aClass1_203, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!sa;Lclient!da;)V")
	private void method897(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub8 arg1) {
		while (arg0 != this.aClass75_8.aClass1_129 && ((Class1_Sub8) arg0).anInt784 <= arg1.anInt784) {
			arg0 = arg0.aClass1_203;
		}
		Static119.method1895(arg0, arg1);
		this.anInt1178 = ((Class1_Sub8) this.aClass75_8.aClass1_129.aClass1_203).anInt784;
	}

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)V")
	private void method898(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub12 local5 = (Class1_Sub12) this.aClass75_7.method2239(); local5 != null; local5 = (Class1_Sub12) this.aClass75_7.method2238()) {
			local5.method3037(arg0);
		}
	}

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "()Lclient!ge;")
	@Override
	public Class1_Sub12 method3038() {
		return (Class1_Sub12) this.aClass75_7.method2239();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!da;)V")
	private void method899(@OriginalArg(0) Class1_Sub8 arg0) {
		arg0.method3525();
		arg0.method590();
		@Pc(9) Class1 local9 = this.aClass75_8.aClass1_129.aClass1_203;
		if (local9 == this.aClass75_8.aClass1_129) {
			this.anInt1178 = -1;
		} else {
			this.anInt1178 = ((Class1_Sub8) local9).anInt784;
		}
	}

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "()V")
	private void method900() {
		if (this.anInt1177 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub8 local8 = (Class1_Sub8) this.aClass75_8.method2239(); local8 != null; local8 = (Class1_Sub8) this.aClass75_8.method2238()) {
			local8.anInt784 -= this.anInt1177;
		}
		this.anInt1178 -= this.anInt1177;
		this.anInt1177 = 0;
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "()Lclient!ge;")
	@Override
	public Class1_Sub12 method3035() {
		return (Class1_Sub12) this.aClass75_7.method2238();
	}
}
