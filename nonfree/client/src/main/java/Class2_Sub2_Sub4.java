import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class2_Sub2_Sub4 extends Class2_Sub2 {

	@OriginalMember(owner = "client!se", name = "w", descriptor = "Lclient!cd;")
	private final Class13 aClass13_16 = new Class13();

	@OriginalMember(owner = "client!se", name = "x", descriptor = "Lclient!cd;")
	private final Class13 aClass13_17 = new Class13();

	@OriginalMember(owner = "client!se", name = "z", descriptor = "I")
	private int anInt2441 = 0;

	@OriginalMember(owner = "client!se", name = "y", descriptor = "I")
	private int anInt2440 = -1;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!ad;)V")
	public synchronized void method1770(@OriginalArg(0) Class2_Sub2 arg0) {
		this.aClass13_16.method269(arg0);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method1764(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt2440 < 0) {
				this.method1772(arg0, arg1, arg2);
				return;
			}
			if (this.anInt2441 + arg2 < this.anInt2440) {
				this.anInt2441 += arg2;
				this.method1772(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt2440 - this.anInt2441;
			this.method1772(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2441 += local33;
			this.method1776();
			@Pc(60) Class2_Sub3 local60 = (Class2_Sub3) this.aClass13_17.method270();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method168(this);
				if (local68 < 0) {
					local60.anInt244 = 0;
					this.method1771(local60);
				} else {
					local60.anInt244 = local68;
					this.method1774(local60.aClass2_127, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!bb;)V")
	private void method1771(@OriginalArg(0) Class2_Sub3 arg0) {
		arg0.method2053();
		arg0.method167();
		@Pc(9) Class2 local9 = this.aClass13_17.aClass2_17.aClass2_127;
		if (local9 == this.aClass13_17.aClass2_17) {
			this.anInt2440 = -1;
		} else {
			this.anInt2440 = ((Class2_Sub3) local9).anInt244;
		}
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "([III)V")
	private void method1772(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class2_Sub2 local5 = (Class2_Sub2) this.aClass13_16.method270(); local5 != null; local5 = (Class2_Sub2) this.aClass13_16.method273()) {
			local5.method1768(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method1765(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2440 < 0) {
				this.method1773(arg0);
				return;
			}
			if (this.anInt2441 + arg0 < this.anInt2440) {
				this.anInt2441 += arg0;
				this.method1773(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2440 - this.anInt2441;
			this.method1773(local29);
			arg0 -= local29;
			this.anInt2441 += local29;
			this.method1776();
			@Pc(50) Class2_Sub3 local50 = (Class2_Sub3) this.aClass13_17.method270();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method168(this);
				if (local58 < 0) {
					local50.anInt244 = 0;
					this.method1771(local50);
				} else {
					local50.anInt244 = local58;
					this.method1774(local50.aClass2_127, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "()Lclient!ad;")
	@Override
	public Class2_Sub2 method1769() {
		return (Class2_Sub2) this.aClass13_16.method270();
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "()Lclient!ad;")
	@Override
	public Class2_Sub2 method1766() {
		return (Class2_Sub2) this.aClass13_16.method273();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "()I")
	@Override
	public int method1763() {
		return 0;
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(I)V")
	private void method1773(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class2_Sub2 local5 = (Class2_Sub2) this.aClass13_16.method270(); local5 != null; local5 = (Class2_Sub2) this.aClass13_16.method273()) {
			local5.method1765(arg0);
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!bd;Lclient!bb;)V")
	private void method1774(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub3 arg1) {
		while (arg0 != this.aClass13_17.aClass2_17 && ((Class2_Sub3) arg0).anInt244 <= arg1.anInt244) {
			arg0 = arg0.aClass2_127;
		}
		this.aClass13_17.method262(arg1, arg0);
		this.anInt2440 = ((Class2_Sub3) this.aClass13_17.aClass2_17.aClass2_127).anInt244;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(Lclient!ad;)V")
	public synchronized void method1775(@OriginalArg(0) Class2_Sub2 arg0) {
		arg0.method2053();
	}

	@OriginalMember(owner = "client!se", name = "e", descriptor = "()V")
	private void method1776() {
		if (this.anInt2441 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub3 local8 = (Class2_Sub3) this.aClass13_17.method270(); local8 != null; local8 = (Class2_Sub3) this.aClass13_17.method273()) {
			local8.anInt244 -= this.anInt2441;
		}
		this.anInt2440 -= this.anInt2441;
		this.anInt2441 = 0;
	}
}
