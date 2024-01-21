import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class5_Sub5_Sub4 extends Class5_Sub5 {

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "Lclient!qb;")
	private final Class58 aClass58_49 = new Class58();

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "Lclient!qb;")
	private final Class58 aClass58_50 = new Class58();

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "I")
	private int anInt2357 = 0;

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "I")
	private int anInt2358 = -1;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!sd;)V")
	public synchronized void method1563(@OriginalArg(0) Class5_Sub5 arg0) {
		this.aClass58_49.method1674(arg0);
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "([III)V")
	private void method1564(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class5_Sub5 local5 = (Class5_Sub5) this.aClass58_49.method1669(); local5 != null; local5 = (Class5_Sub5) this.aClass58_49.method1664()) {
			local5.method1562(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ob;Lclient!q;)V")
	private void method1565(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5_Sub19 arg1) {
		while (arg0 != this.aClass58_50.aClass5_99 && ((Class5_Sub19) arg0).anInt2531 <= arg1.anInt2531) {
			arg0 = arg0.aClass5_127;
		}
		this.aClass58_50.method1672(arg1, arg0);
		this.anInt2358 = ((Class5_Sub19) this.aClass58_50.aClass5_99.aClass5_127).anInt2531;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "()Lclient!sd;")
	@Override
	public Class5_Sub5 method1558() {
		return (Class5_Sub5) this.aClass58_49.method1669();
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "()V")
	private void method1566() {
		if (this.anInt2357 <= 0) {
			return;
		}
		for (@Pc(8) Class5_Sub19 local8 = (Class5_Sub19) this.aClass58_50.method1669(); local8 != null; local8 = (Class5_Sub19) this.aClass58_50.method1664()) {
			local8.anInt2531 -= this.anInt2357;
		}
		this.anInt2358 -= this.anInt2357;
		this.anInt2357 = 0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!q;)V")
	private void method1567(@OriginalArg(0) Class5_Sub19 arg0) {
		arg0.method2189();
		arg0.method1647();
		@Pc(9) Class5 local9 = this.aClass58_50.aClass5_99.aClass5_127;
		if (local9 == this.aClass58_50.aClass5_99) {
			this.anInt2358 = -1;
		} else {
			this.anInt2358 = ((Class5_Sub19) local9).anInt2531;
		}
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "()Lclient!sd;")
	@Override
	public Class5_Sub5 method1560() {
		return (Class5_Sub5) this.aClass58_49.method1664();
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
	private void method1568(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class5_Sub5 local5 = (Class5_Sub5) this.aClass58_49.method1669(); local5 != null; local5 = (Class5_Sub5) this.aClass58_49.method1664()) {
			local5.method1556(arg0);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "()I")
	@Override
	public int method1557() {
		return 0;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method1556(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2358 < 0) {
				this.method1568(arg0);
				return;
			}
			if (this.anInt2357 + arg0 < this.anInt2358) {
				this.anInt2357 += arg0;
				this.method1568(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2358 - this.anInt2357;
			this.method1568(local29);
			arg0 -= local29;
			this.anInt2357 += local29;
			this.method1566();
			@Pc(50) Class5_Sub19 local50 = (Class5_Sub19) this.aClass58_50.method1669();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1648(this);
				if (local58 < 0) {
					local50.anInt2531 = 0;
					this.method1567(local50);
				} else {
					local50.anInt2531 = local58;
					this.method1565(local50.aClass5_127, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Lclient!sd;)V")
	public synchronized void method1569(@OriginalArg(0) Class5_Sub5 arg0) {
		arg0.method2189();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method1561(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt2358 < 0) {
				this.method1564(arg0, arg1, arg2);
				return;
			}
			if (this.anInt2357 + arg2 < this.anInt2358) {
				this.anInt2357 += arg2;
				this.method1564(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt2358 - this.anInt2357;
			this.method1564(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2357 += local33;
			this.method1566();
			@Pc(60) Class5_Sub19 local60 = (Class5_Sub19) this.aClass58_50.method1669();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method1648(this);
				if (local68 < 0) {
					local60.anInt2531 = 0;
					this.method1567(local60);
				} else {
					local60.anInt2531 = local68;
					this.method1565(local60.aClass5_127, local60);
				}
			}
		} while (arg2 != 0);
	}
}
