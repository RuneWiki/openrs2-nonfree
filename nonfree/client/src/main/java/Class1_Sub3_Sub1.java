import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class1_Sub3_Sub1 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ca", name = "w", descriptor = "Lclient!qg;")
	private Class131 aClass131_1 = new Class131();

	@OriginalMember(owner = "client!ca", name = "x", descriptor = "Lclient!qg;")
	private Class131 aClass131_2 = new Class131();

	@OriginalMember(owner = "client!ca", name = "y", descriptor = "I")
	private int anInt752 = -1;

	@OriginalMember(owner = "client!ca", name = "z", descriptor = "I")
	private int anInt753 = 0;

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "([III)V")
	private void method516(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub3 local5 = (Class1_Sub3) this.aClass131_1.method3791(); local5 != null; local5 = (Class1_Sub3) this.aClass131_1.method3792()) {
			local5.method2544(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "()V")
	private void method517() {
		if (this.anInt753 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub19 local8 = (Class1_Sub19) this.aClass131_2.method3791(); local8 != null; local8 = (Class1_Sub19) this.aClass131_2.method3792()) {
			local8.anInt2983 -= this.anInt753;
		}
		this.anInt752 -= this.anInt753;
		this.anInt753 = 0;
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V")
	private void method518(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub3 local5 = (Class1_Sub3) this.aClass131_1.method3791(); local5 != null; local5 = (Class1_Sub3) this.aClass131_1.method3792()) {
			local5.method2539(arg0);
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!jl;)V")
	private void method519(@OriginalArg(0) Class1_Sub19 arg0) {
		arg0.method4742();
		arg0.method2265();
		@Pc(9) Class1 local9 = this.aClass131_2.aClass1_180.aClass1_231;
		if (local9 == this.aClass131_2.aClass1_180) {
			this.anInt752 = -1;
		} else {
			this.anInt752 = ((Class1_Sub19) local9).anInt2983;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!ba;)V")
	public synchronized void method520(@OriginalArg(0) Class1_Sub3 arg0) {
		arg0.method4742();
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2540(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt752 < 0) {
				this.method516(arg0, arg1, arg2);
				return;
			}
			if (this.anInt753 + arg2 < this.anInt752) {
				this.anInt753 += arg2;
				this.method516(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt752 - this.anInt753;
			this.method516(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt753 += local33;
			this.method517();
			@Pc(60) Class1_Sub19 local60 = (Class1_Sub19) this.aClass131_2.method3791();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method2264(this);
				if (local68 < 0) {
					local60.anInt2983 = 0;
					this.method519(local60);
				} else {
					local60.anInt2983 = local68;
					this.method521(local60.aClass1_231, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!hl;Lclient!jl;)V")
	private void method521(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub19 arg1) {
		while (arg0 != this.aClass131_2.aClass1_180 && ((Class1_Sub19) arg0).anInt2983 <= arg1.anInt2983) {
			arg0 = arg0.aClass1_231;
		}
		Static89.method1534(arg0, arg1);
		this.anInt752 = ((Class1_Sub19) this.aClass131_2.aClass1_180.aClass1_231).anInt2983;
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "()Lclient!ba;")
	@Override
	public Class1_Sub3 method2542() {
		return (Class1_Sub3) this.aClass131_1.method3792();
	}

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "()Lclient!ba;")
	@Override
	public Class1_Sub3 method2543() {
		return (Class1_Sub3) this.aClass131_1.method3791();
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "()I")
	@Override
	public int method2541() {
		return 0;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(Lclient!ba;)V")
	public synchronized void method522(@OriginalArg(0) Class1_Sub3 arg0) {
		this.aClass131_1.method3793(arg0);
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method2539(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt752 < 0) {
				this.method518(arg0);
				return;
			}
			if (this.anInt753 + arg0 < this.anInt752) {
				this.anInt753 += arg0;
				this.method518(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt752 - this.anInt753;
			this.method518(local29);
			arg0 -= local29;
			this.anInt753 += local29;
			this.method517();
			@Pc(50) Class1_Sub19 local50 = (Class1_Sub19) this.aClass131_2.method3791();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method2264(this);
				if (local58 < 0) {
					local50.anInt2983 = 0;
					this.method519(local50);
				} else {
					local50.anInt2983 = local58;
					this.method521(local50.aClass1_231, local50);
				}
			}
		} while (arg0 != 0);
	}
}
