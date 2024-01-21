import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class1_Sub8_Sub1 extends Class1_Sub8 {

	@OriginalMember(owner = "client!ef", name = "z", descriptor = "Lclient!ad;")
	private final Class4 aClass4_5 = new Class4();

	@OriginalMember(owner = "client!ef", name = "A", descriptor = "Lclient!ad;")
	private final Class4 aClass4_6 = new Class4();

	@OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
	private int anInt1464 = -1;

	@OriginalMember(owner = "client!ef", name = "D", descriptor = "I")
	private int anInt1465 = 0;

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "()Lclient!qh;")
	@Override
	public Class1_Sub8 method2942() {
		return (Class1_Sub8) this.aClass4_5.method174();
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method2941(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt1464 < 0) {
				this.method1092(arg0, arg1, arg2);
				return;
			}
			if (this.anInt1465 + arg2 < this.anInt1464) {
				this.anInt1465 += arg2;
				this.method1092(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt1464 - this.anInt1465;
			this.method1092(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt1465 += local33;
			this.method1091();
			@Pc(60) Class1_Sub12 local60 = (Class1_Sub12) this.aClass4_6.method174();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method1654(this);
				if (local68 < 0) {
					local60.anInt2239 = 0;
					this.method1089(local60);
				} else {
					local60.anInt2239 = local68;
					this.method1086(local60.aClass1_213, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "()Lclient!qh;")
	@Override
	public Class1_Sub8 method2937() {
		return (Class1_Sub8) this.aClass4_5.method181();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!jd;Lclient!i;)V")
	private void method1086(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub12 arg1) {
		while (arg0 != this.aClass4_6.aClass1_11 && ((Class1_Sub12) arg0).anInt2239 <= arg1.anInt2239) {
			arg0 = arg0.aClass1_213;
		}
		this.aClass4_6.method178(arg0, arg1);
		this.anInt1464 = ((Class1_Sub12) this.aClass4_6.aClass1_11.aClass1_213).anInt2239;
	}

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "(I)V")
	private void method1087(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub8 local5 = (Class1_Sub8) this.aClass4_5.method174(); local5 != null; local5 = (Class1_Sub8) this.aClass4_5.method181()) {
			local5.method2943(arg0);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!qh;)V")
	public synchronized void method1088(@OriginalArg(0) Class1_Sub8 arg0) {
		arg0.method3499();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!i;)V")
	private void method1089(@OriginalArg(0) Class1_Sub12 arg0) {
		arg0.method3499();
		arg0.method1655();
		@Pc(9) Class1 local9 = this.aClass4_6.aClass1_11.aClass1_213;
		if (local9 == this.aClass4_6.aClass1_11) {
			this.anInt1464 = -1;
		} else {
			this.anInt1464 = ((Class1_Sub12) local9).anInt2239;
		}
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method2943(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt1464 < 0) {
				this.method1087(arg0);
				return;
			}
			if (this.anInt1465 + arg0 < this.anInt1464) {
				this.anInt1465 += arg0;
				this.method1087(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt1464 - this.anInt1465;
			this.method1087(local29);
			arg0 -= local29;
			this.anInt1465 += local29;
			this.method1091();
			@Pc(50) Class1_Sub12 local50 = (Class1_Sub12) this.aClass4_6.method174();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1654(this);
				if (local58 < 0) {
					local50.anInt2239 = 0;
					this.method1089(local50);
				} else {
					local50.anInt2239 = local58;
					this.method1086(local50.aClass1_213, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "()I")
	@Override
	public int method2938() {
		return 0;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(Lclient!qh;)V")
	public synchronized void method1090(@OriginalArg(0) Class1_Sub8 arg0) {
		this.aClass4_5.method180(arg0);
	}

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "()V")
	private void method1091() {
		if (this.anInt1465 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub12 local8 = (Class1_Sub12) this.aClass4_6.method174(); local8 != null; local8 = (Class1_Sub12) this.aClass4_6.method181()) {
			local8.anInt2239 -= this.anInt1465;
		}
		this.anInt1464 -= this.anInt1465;
		this.anInt1465 = 0;
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "([III)V")
	private void method1092(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub8 local5 = (Class1_Sub8) this.aClass4_5.method174(); local5 != null; local5 = (Class1_Sub8) this.aClass4_5.method181()) {
			local5.method2939(arg0, arg1, arg2);
		}
	}
}
