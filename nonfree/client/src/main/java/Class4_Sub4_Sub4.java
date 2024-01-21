import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class4_Sub4_Sub4 extends Class4_Sub4 {

	@OriginalMember(owner = "client!qe", name = "v", descriptor = "Lclient!wd;")
	private final Class82 aClass82_10 = new Class82();

	@OriginalMember(owner = "client!qe", name = "w", descriptor = "Lclient!wd;")
	private final Class82 aClass82_11 = new Class82();

	@OriginalMember(owner = "client!qe", name = "x", descriptor = "I")
	private int anInt2547 = -1;

	@OriginalMember(owner = "client!qe", name = "y", descriptor = "I")
	private int anInt2548 = 0;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!fd;)V")
	public synchronized void method1642(@OriginalArg(0) Class4_Sub4 arg0) {
		arg0.method1999();
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method1637(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt2547 < 0) {
				this.method1643(arg0, arg1, arg2);
				return;
			}
			if (this.anInt2548 + arg2 < this.anInt2547) {
				this.anInt2548 += arg2;
				this.method1643(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt2547 - this.anInt2548;
			this.method1643(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2548 += local33;
			this.method1646();
			@Pc(60) Class4_Sub23 local60 = (Class4_Sub23) this.aClass82_11.method2025();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method1997(this);
				if (local68 < 0) {
					local60.anInt3075 = 0;
					this.method1648(local60);
				} else {
					local60.anInt3075 = local68;
					this.method1644(local60.aClass4_124, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "([III)V")
	private void method1643(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class4_Sub4 local5 = (Class4_Sub4) this.aClass82_10.method2025(); local5 != null; local5 = (Class4_Sub4) this.aClass82_10.method2023()) {
			local5.method1636(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!v;Lclient!w;)V")
	private void method1644(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4_Sub23 arg1) {
		while (arg0 != this.aClass82_11.aClass4_127 && ((Class4_Sub23) arg0).anInt3075 <= arg1.anInt3075) {
			arg0 = arg0.aClass4_124;
		}
		this.aClass82_11.method2030(arg1, arg0);
		this.anInt2547 = ((Class4_Sub23) this.aClass82_11.aClass4_127.aClass4_124).anInt3075;
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method1639(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2547 < 0) {
				this.method1645(arg0);
				return;
			}
			if (this.anInt2548 + arg0 < this.anInt2547) {
				this.anInt2548 += arg0;
				this.method1645(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2547 - this.anInt2548;
			this.method1645(local29);
			arg0 -= local29;
			this.anInt2548 += local29;
			this.method1646();
			@Pc(50) Class4_Sub23 local50 = (Class4_Sub23) this.aClass82_11.method2025();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1997(this);
				if (local58 < 0) {
					local50.anInt3075 = 0;
					this.method1648(local50);
				} else {
					local50.anInt3075 = local58;
					this.method1644(local50.aClass4_124, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "()Lclient!fd;")
	@Override
	public Class4_Sub4 method1640() {
		return (Class4_Sub4) this.aClass82_10.method2025();
	}

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)V")
	private void method1645(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class4_Sub4 local5 = (Class4_Sub4) this.aClass82_10.method2025(); local5 != null; local5 = (Class4_Sub4) this.aClass82_10.method2023()) {
			local5.method1639(arg0);
		}
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "()Lclient!fd;")
	@Override
	public Class4_Sub4 method1638() {
		return (Class4_Sub4) this.aClass82_10.method2023();
	}

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "()V")
	private void method1646() {
		if (this.anInt2548 <= 0) {
			return;
		}
		for (@Pc(8) Class4_Sub23 local8 = (Class4_Sub23) this.aClass82_11.method2025(); local8 != null; local8 = (Class4_Sub23) this.aClass82_11.method2023()) {
			local8.anInt3075 -= this.anInt2548;
		}
		this.anInt2547 -= this.anInt2548;
		this.anInt2548 = 0;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(Lclient!fd;)V")
	public synchronized void method1647(@OriginalArg(0) Class4_Sub4 arg0) {
		this.aClass82_10.method2021(arg0);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!w;)V")
	private void method1648(@OriginalArg(0) Class4_Sub23 arg0) {
		arg0.method1999();
		arg0.method1998();
		@Pc(9) Class4 local9 = this.aClass82_11.aClass4_127.aClass4_124;
		if (local9 == this.aClass82_11.aClass4_127) {
			this.anInt2547 = -1;
		} else {
			this.anInt2547 = ((Class4_Sub23) local9).anInt3075;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "()I")
	@Override
	public int method1635() {
		return 0;
	}
}
