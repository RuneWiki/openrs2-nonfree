import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class1_Sub7_Sub2 extends Class1_Sub7 {

	@OriginalMember(owner = "client!wb", name = "y", descriptor = "Lclient!db;")
	private Class19 aClass19_20 = new Class19();

	@OriginalMember(owner = "client!wb", name = "z", descriptor = "Lclient!db;")
	private Class19 aClass19_21 = new Class19();

	@OriginalMember(owner = "client!wb", name = "A", descriptor = "I")
	private int anInt4586 = 0;

	@OriginalMember(owner = "client!wb", name = "B", descriptor = "I")
	private int anInt4587 = -1;

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "()Lclient!li;")
	@Override
	public Class1_Sub7 method3454() {
		return (Class1_Sub7) this.aClass19_20.method609();
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V")
	private void method3372(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub7 local5 = (Class1_Sub7) this.aClass19_20.method609(); local5 != null; local5 = (Class1_Sub7) this.aClass19_20.method615()) {
			local5.method3450(arg0);
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method3448(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt4587 < 0) {
				this.method3373(arg0, arg1, arg2);
				return;
			}
			if (this.anInt4586 + arg2 < this.anInt4587) {
				this.anInt4586 += arg2;
				this.method3373(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt4587 - this.anInt4586;
			this.method3373(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt4586 += local33;
			this.method3377();
			@Pc(60) Class1_Sub14 local60 = (Class1_Sub14) this.aClass19_21.method609();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method1409(this);
				if (local68 < 0) {
					local60.anInt1921 = 0;
					this.method3375(local60);
				} else {
					local60.anInt1921 = local68;
					this.method3376(local60.aClass1_213, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "([III)V")
	private void method3373(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub7 local5 = (Class1_Sub7) this.aClass19_20.method609(); local5 != null; local5 = (Class1_Sub7) this.aClass19_20.method615()) {
			local5.method3449(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "()Lclient!li;")
	@Override
	public Class1_Sub7 method3452() {
		return (Class1_Sub7) this.aClass19_20.method615();
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "()I")
	@Override
	public int method3453() {
		return 0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!li;)V")
	public synchronized void method3374(@OriginalArg(0) Class1_Sub7 arg0) {
		arg0.method3530();
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!hj;)V")
	private void method3375(@OriginalArg(0) Class1_Sub14 arg0) {
		arg0.method3530();
		arg0.method1410();
		@Pc(9) Class1 local9 = this.aClass19_21.aClass1_37.aClass1_213;
		if (local9 == this.aClass19_21.aClass1_37) {
			this.anInt4587 = -1;
		} else {
			this.anInt4587 = ((Class1_Sub14) local9).anInt1921;
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method3450(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt4587 < 0) {
				this.method3372(arg0);
				return;
			}
			if (this.anInt4586 + arg0 < this.anInt4587) {
				this.anInt4586 += arg0;
				this.method3372(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt4587 - this.anInt4586;
			this.method3372(local29);
			arg0 -= local29;
			this.anInt4586 += local29;
			this.method3377();
			@Pc(50) Class1_Sub14 local50 = (Class1_Sub14) this.aClass19_21.method609();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1409(this);
				if (local58 < 0) {
					local50.anInt1921 = 0;
					this.method3375(local50);
				} else {
					local50.anInt1921 = local58;
					this.method3376(local50.aClass1_213, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!b;Lclient!hj;)V")
	private void method3376(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub14 arg1) {
		while (arg0 != this.aClass19_21.aClass1_37 && ((Class1_Sub14) arg0).anInt1921 <= arg1.anInt1921) {
			arg0 = arg0.aClass1_213;
		}
		this.aClass19_21.method610(arg1, arg0);
		this.anInt4587 = ((Class1_Sub14) this.aClass19_21.aClass1_37.aClass1_213).anInt1921;
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "()V")
	private void method3377() {
		if (this.anInt4586 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub14 local8 = (Class1_Sub14) this.aClass19_21.method609(); local8 != null; local8 = (Class1_Sub14) this.aClass19_21.method615()) {
			local8.anInt1921 -= this.anInt4586;
		}
		this.anInt4587 -= this.anInt4586;
		this.anInt4586 = 0;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(Lclient!li;)V")
	public synchronized void method3378(@OriginalArg(0) Class1_Sub7 arg0) {
		this.aClass19_20.method618(arg0);
	}
}
