import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class2_Sub2_Sub2 extends Class2_Sub2 {

	@OriginalMember(owner = "client!nc", name = "w", descriptor = "Lclient!of;")
	private final Class58 aClass58_9 = new Class58();

	@OriginalMember(owner = "client!nc", name = "x", descriptor = "Lclient!of;")
	private final Class58 aClass58_10 = new Class58();

	@OriginalMember(owner = "client!nc", name = "y", descriptor = "I")
	private int anInt2010 = 0;

	@OriginalMember(owner = "client!nc", name = "z", descriptor = "I")
	private int anInt2011 = -1;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "()Lclient!kb;")
	@Override
	public Class2_Sub2 method1518() {
		return (Class2_Sub2) this.aClass58_9.method1281();
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V")
	private void method1225(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class2_Sub2 local5 = (Class2_Sub2) this.aClass58_9.method1285(); local5 != null; local5 = (Class2_Sub2) this.aClass58_9.method1281()) {
			local5.method1523(arg0);
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!ed;)V")
	private void method1226(@OriginalArg(0) Class2_Sub3 arg0) {
		arg0.method1961();
		arg0.method587();
		@Pc(9) Class2 local9 = this.aClass58_10.aClass2_77.aClass2_115;
		if (local9 == this.aClass58_10.aClass2_77) {
			this.anInt2011 = -1;
		} else {
			this.anInt2011 = ((Class2_Sub3) local9).anInt1103;
		}
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method1524(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt2011 < 0) {
				this.method1227(arg0, arg1, arg2);
				return;
			}
			if (this.anInt2010 + arg2 < this.anInt2011) {
				this.anInt2010 += arg2;
				this.method1227(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt2011 - this.anInt2010;
			this.method1227(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2010 += local33;
			this.method1230();
			@Pc(60) Class2_Sub3 local60 = (Class2_Sub3) this.aClass58_10.method1285();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method588(this);
				if (local68 < 0) {
					local60.anInt1103 = 0;
					this.method1226(local60);
				} else {
					local60.anInt1103 = local68;
					this.method1228(local60.aClass2_115, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "([III)V")
	private void method1227(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class2_Sub2 local5 = (Class2_Sub2) this.aClass58_9.method1285(); local5 != null; local5 = (Class2_Sub2) this.aClass58_9.method1281()) {
			local5.method1522(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!o;Lclient!ed;)V")
	private void method1228(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub3 arg1) {
		while (arg0 != this.aClass58_10.aClass2_77 && ((Class2_Sub3) arg0).anInt1103 <= arg1.anInt1103) {
			arg0 = arg0.aClass2_115;
		}
		this.aClass58_10.method1290(arg1, arg0);
		this.anInt2011 = ((Class2_Sub3) this.aClass58_10.aClass2_77.aClass2_115).anInt1103;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!kb;)V")
	public synchronized void method1229(@OriginalArg(0) Class2_Sub2 arg0) {
		arg0.method1961();
	}

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "()V")
	private void method1230() {
		if (this.anInt2010 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub3 local8 = (Class2_Sub3) this.aClass58_10.method1285(); local8 != null; local8 = (Class2_Sub3) this.aClass58_10.method1281()) {
			local8.anInt1103 -= this.anInt2010;
		}
		this.anInt2011 -= this.anInt2010;
		this.anInt2010 = 0;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method1523(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2011 < 0) {
				this.method1225(arg0);
				return;
			}
			if (this.anInt2010 + arg0 < this.anInt2011) {
				this.anInt2010 += arg0;
				this.method1225(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2011 - this.anInt2010;
			this.method1225(local29);
			arg0 -= local29;
			this.anInt2010 += local29;
			this.method1230();
			@Pc(50) Class2_Sub3 local50 = (Class2_Sub3) this.aClass58_10.method1285();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method588(this);
				if (local58 < 0) {
					local50.anInt1103 = 0;
					this.method1226(local50);
				} else {
					local50.anInt1103 = local58;
					this.method1228(local50.aClass2_115, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "()Lclient!kb;")
	@Override
	public Class2_Sub2 method1521() {
		return (Class2_Sub2) this.aClass58_9.method1285();
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(Lclient!kb;)V")
	public synchronized void method1231(@OriginalArg(0) Class2_Sub2 arg0) {
		this.aClass58_9.method1289(arg0);
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "()I")
	@Override
	public int method1520() {
		return 0;
	}
}
