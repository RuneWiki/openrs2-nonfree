import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class4_Sub2_Sub1 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ga", name = "t", descriptor = "Lclient!bg;")
	private final Class11 aClass11_4 = new Class11();

	@OriginalMember(owner = "client!ga", name = "u", descriptor = "Lclient!bg;")
	private final Class11 aClass11_5 = new Class11();

	@OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
	private int anInt1378 = 0;

	@OriginalMember(owner = "client!ga", name = "w", descriptor = "I")
	private int anInt1379 = -1;

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "()Lclient!ag;")
	@Override
	public Class4_Sub2 method2774() {
		return (Class4_Sub2) this.aClass11_4.method274();
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "()I")
	@Override
	public int method2771() {
		return 0;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2769(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt1379 < 0) {
				this.method1070(arg0, arg1, arg2);
				return;
			}
			if (this.anInt1378 + arg2 < this.anInt1379) {
				this.anInt1378 += arg2;
				this.method1070(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt1379 - this.anInt1378;
			this.method1070(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt1378 += local33;
			this.method1073();
			@Pc(60) Class4_Sub23 local60 = (Class4_Sub23) this.aClass11_5.method274();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method2599(this);
				if (local68 < 0) {
					local60.anInt3455 = 0;
					this.method1071(local60);
				} else {
					local60.anInt3455 = local68;
					this.method1075(local60.aClass4_216, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "([III)V")
	private void method1070(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class4_Sub2 local5 = (Class4_Sub2) this.aClass11_4.method274(); local5 != null; local5 = (Class4_Sub2) this.aClass11_4.method271()) {
			local5.method2772(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!sa;)V")
	private void method1071(@OriginalArg(0) Class4_Sub23 arg0) {
		arg0.method3173();
		arg0.method2600();
		@Pc(9) Class4 local9 = this.aClass11_5.aClass4_25.aClass4_216;
		if (local9 == this.aClass11_5.aClass4_25) {
			this.anInt1379 = -1;
		} else {
			this.anInt1379 = ((Class4_Sub23) local9).anInt3455;
		}
	}

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "(I)V")
	private void method1072(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class4_Sub2 local5 = (Class4_Sub2) this.aClass11_4.method274(); local5 != null; local5 = (Class4_Sub2) this.aClass11_4.method271()) {
			local5.method2773(arg0);
		}
	}

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "()V")
	private void method1073() {
		if (this.anInt1378 <= 0) {
			return;
		}
		for (@Pc(8) Class4_Sub23 local8 = (Class4_Sub23) this.aClass11_5.method274(); local8 != null; local8 = (Class4_Sub23) this.aClass11_5.method271()) {
			local8.anInt3455 -= this.anInt1378;
		}
		this.anInt1379 -= this.anInt1378;
		this.anInt1378 = 0;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!ag;)V")
	public synchronized void method1074(@OriginalArg(0) Class4_Sub2 arg0) {
		arg0.method3173();
	}

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method2773(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt1379 < 0) {
				this.method1072(arg0);
				return;
			}
			if (this.anInt1378 + arg0 < this.anInt1379) {
				this.anInt1378 += arg0;
				this.method1072(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt1379 - this.anInt1378;
			this.method1072(local29);
			arg0 -= local29;
			this.anInt1378 += local29;
			this.method1073();
			@Pc(50) Class4_Sub23 local50 = (Class4_Sub23) this.aClass11_5.method274();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method2599(this);
				if (local58 < 0) {
					local50.anInt3455 = 0;
					this.method1071(local50);
				} else {
					local50.anInt3455 = local58;
					this.method1075(local50.aClass4_216, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!wd;Lclient!sa;)V")
	private void method1075(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4_Sub23 arg1) {
		while (arg0 != this.aClass11_5.aClass4_25 && ((Class4_Sub23) arg0).anInt3455 <= arg1.anInt3455) {
			arg0 = arg0.aClass4_216;
		}
		this.aClass11_5.method270(arg0, arg1);
		this.anInt1379 = ((Class4_Sub23) this.aClass11_5.aClass4_25.aClass4_216).anInt3455;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "()Lclient!ag;")
	@Override
	public Class4_Sub2 method2768() {
		return (Class4_Sub2) this.aClass11_4.method271();
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(Lclient!ag;)V")
	public synchronized void method1076(@OriginalArg(0) Class4_Sub2 arg0) {
		this.aClass11_4.method273(arg0);
	}
}
