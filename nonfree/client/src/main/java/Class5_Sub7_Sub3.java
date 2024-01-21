import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class5_Sub7_Sub3 extends Class5_Sub7 {

	@OriginalMember(owner = "client!ue", name = "B", descriptor = "Lclient!ca;")
	private final Class10 aClass10_13 = new Class10();

	@OriginalMember(owner = "client!ue", name = "C", descriptor = "Lclient!ca;")
	private final Class10 aClass10_14 = new Class10();

	@OriginalMember(owner = "client!ue", name = "D", descriptor = "I")
	private int anInt2920 = 0;

	@OriginalMember(owner = "client!ue", name = "E", descriptor = "I")
	private int anInt2921 = -1;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!cb;Lclient!dc;)V")
	private void method2005(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5_Sub4 arg1) {
		while (arg0 != this.aClass10_14.aClass5_17 && ((Class5_Sub4) arg0).anInt648 <= arg1.anInt648) {
			arg0 = arg0.aClass5_115;
		}
		this.aClass10_14.method221(arg0, arg1);
		this.anInt2921 = ((Class5_Sub4) this.aClass10_14.aClass5_17.aClass5_115).anInt648;
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method2023(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2921 < 0) {
				this.method2010(arg0);
				return;
			}
			if (this.anInt2920 + arg0 < this.anInt2921) {
				this.anInt2920 += arg0;
				this.method2010(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2921 - this.anInt2920;
			this.method2010(local29);
			arg0 -= local29;
			this.anInt2920 += local29;
			this.method2007();
			@Pc(50) Class5_Sub4 local50 = (Class5_Sub4) this.aClass10_14.method230();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method394(this);
				if (local58 < 0) {
					local50.anInt648 = 0;
					this.method2006(local50);
				} else {
					local50.anInt648 = local58;
					this.method2005(local50.aClass5_115, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "()I")
	@Override
	public int method2021() {
		return 0;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method2025(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt2921 < 0) {
				this.method2008(arg0, arg1, arg2);
				return;
			}
			if (this.anInt2920 + arg2 < this.anInt2921) {
				this.anInt2920 += arg2;
				this.method2008(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt2921 - this.anInt2920;
			this.method2008(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2920 += local33;
			this.method2007();
			@Pc(60) Class5_Sub4 local60 = (Class5_Sub4) this.aClass10_14.method230();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method394(this);
				if (local68 < 0) {
					local60.anInt648 = 0;
					this.method2006(local60);
				} else {
					local60.anInt648 = local68;
					this.method2005(local60.aClass5_115, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!dc;)V")
	private void method2006(@OriginalArg(0) Class5_Sub4 arg0) {
		arg0.method2144();
		arg0.method393();
		@Pc(9) Class5 local9 = this.aClass10_14.aClass5_17.aClass5_115;
		if (local9 == this.aClass10_14.aClass5_17) {
			this.anInt2921 = -1;
		} else {
			this.anInt2921 = ((Class5_Sub4) local9).anInt648;
		}
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "()Lclient!u;")
	@Override
	public Class5_Sub7 method2024() {
		return (Class5_Sub7) this.aClass10_13.method230();
	}

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "()V")
	private void method2007() {
		if (this.anInt2920 <= 0) {
			return;
		}
		for (@Pc(8) Class5_Sub4 local8 = (Class5_Sub4) this.aClass10_14.method230(); local8 != null; local8 = (Class5_Sub4) this.aClass10_14.method233()) {
			local8.anInt648 -= this.anInt2920;
		}
		this.anInt2921 -= this.anInt2920;
		this.anInt2920 = 0;
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "([III)V")
	private void method2008(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class5_Sub7 local5 = (Class5_Sub7) this.aClass10_13.method230(); local5 != null; local5 = (Class5_Sub7) this.aClass10_13.method233()) {
			local5.method2020(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!u;)V")
	public synchronized void method2009(@OriginalArg(0) Class5_Sub7 arg0) {
		arg0.method2144();
	}

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)V")
	private void method2010(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class5_Sub7 local5 = (Class5_Sub7) this.aClass10_13.method230(); local5 != null; local5 = (Class5_Sub7) this.aClass10_13.method233()) {
			local5.method2023(arg0);
		}
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(Lclient!u;)V")
	public synchronized void method2011(@OriginalArg(0) Class5_Sub7 arg0) {
		this.aClass10_13.method235(arg0);
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "()Lclient!u;")
	@Override
	public Class5_Sub7 method2026() {
		return (Class5_Sub7) this.aClass10_13.method233();
	}
}
