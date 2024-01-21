import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class4_Sub12_Sub4 extends Class4_Sub12 {

	@OriginalMember(owner = "client!ta", name = "w", descriptor = "Lclient!vf;")
	private final Class78 aClass78_11 = new Class78();

	@OriginalMember(owner = "client!ta", name = "x", descriptor = "Lclient!vf;")
	private final Class78 aClass78_12 = new Class78();

	@OriginalMember(owner = "client!ta", name = "z", descriptor = "I")
	private int anInt2427 = 0;

	@OriginalMember(owner = "client!ta", name = "y", descriptor = "I")
	private int anInt2426 = -1;

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method1697(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt2426 < 0) {
				this.method1703(arg0, arg1, arg2);
				return;
			}
			if (this.anInt2427 + arg2 < this.anInt2426) {
				this.anInt2427 += arg2;
				this.method1703(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt2426 - this.anInt2427;
			this.method1703(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2427 += local33;
			this.method1698();
			@Pc(60) Class4_Sub7 local60 = (Class4_Sub7) this.aClass78_12.method1916();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method247(this);
				if (local68 < 0) {
					local60.anInt358 = 0;
					this.method1704(local60);
				} else {
					local60.anInt358 = local68;
					this.method1701(local60.aClass4_127, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "()I")
	@Override
	public int method1691() {
		return 0;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "()Lclient!ld;")
	@Override
	public Class4_Sub12 method1694() {
		return (Class4_Sub12) this.aClass78_11.method1920();
	}

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "()Lclient!ld;")
	@Override
	public Class4_Sub12 method1696() {
		return (Class4_Sub12) this.aClass78_11.method1916();
	}

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "()V")
	private void method1698() {
		if (this.anInt2427 <= 0) {
			return;
		}
		for (@Pc(8) Class4_Sub7 local8 = (Class4_Sub7) this.aClass78_12.method1916(); local8 != null; local8 = (Class4_Sub7) this.aClass78_12.method1920()) {
			local8.anInt358 -= this.anInt2427;
		}
		this.anInt2426 -= this.anInt2427;
		this.anInt2427 = 0;
	}

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "(I)V")
	private void method1699(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class4_Sub12 local5 = (Class4_Sub12) this.aClass78_11.method1916(); local5 != null; local5 = (Class4_Sub12) this.aClass78_11.method1920()) {
			local5.method1693(arg0);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ld;)V")
	public synchronized void method1700(@OriginalArg(0) Class4_Sub12 arg0) {
		this.aClass78_11.method1915(arg0);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ec;Lclient!da;)V")
	private void method1701(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4_Sub7 arg1) {
		while (arg0 != this.aClass78_12.aClass4_123 && ((Class4_Sub7) arg0).anInt358 <= arg1.anInt358) {
			arg0 = arg0.aClass4_127;
		}
		this.aClass78_12.method1925(arg0, arg1);
		this.anInt2426 = ((Class4_Sub7) this.aClass78_12.aClass4_123.aClass4_127).anInt358;
	}

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method1693(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2426 < 0) {
				this.method1699(arg0);
				return;
			}
			if (this.anInt2427 + arg0 < this.anInt2426) {
				this.anInt2427 += arg0;
				this.method1699(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2426 - this.anInt2427;
			this.method1699(local29);
			arg0 -= local29;
			this.anInt2427 += local29;
			this.method1698();
			@Pc(50) Class4_Sub7 local50 = (Class4_Sub7) this.aClass78_12.method1916();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method247(this);
				if (local58 < 0) {
					local50.anInt358 = 0;
					this.method1704(local50);
				} else {
					local50.anInt358 = local58;
					this.method1701(local50.aClass4_127, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(Lclient!ld;)V")
	public synchronized void method1702(@OriginalArg(0) Class4_Sub12 arg0) {
		arg0.method2004();
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "([III)V")
	private void method1703(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class4_Sub12 local5 = (Class4_Sub12) this.aClass78_11.method1916(); local5 != null; local5 = (Class4_Sub12) this.aClass78_11.method1920()) {
			local5.method1692(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!da;)V")
	private void method1704(@OriginalArg(0) Class4_Sub7 arg0) {
		arg0.method2004();
		arg0.method246();
		@Pc(9) Class4 local9 = this.aClass78_12.aClass4_123.aClass4_127;
		if (local9 == this.aClass78_12.aClass4_123) {
			this.anInt2426 = -1;
		} else {
			this.anInt2426 = ((Class4_Sub7) local9).anInt358;
		}
	}
}
