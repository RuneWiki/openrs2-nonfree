import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class1_Sub8_Sub3 extends Class1_Sub8 {

	@OriginalMember(owner = "client!qb", name = "E", descriptor = "Lclient!ie;")
	private final Class31 aClass31_56 = new Class31();

	@OriginalMember(owner = "client!qb", name = "F", descriptor = "Lclient!ie;")
	private final Class31 aClass31_57 = new Class31();

	@OriginalMember(owner = "client!qb", name = "G", descriptor = "I")
	private int anInt2293 = 0;

	@OriginalMember(owner = "client!qb", name = "H", descriptor = "I")
	private int anInt2294 = -1;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!qf;)V")
	public synchronized void method1634(@OriginalArg(0) Class1_Sub8 arg0) {
		arg0.method2128();
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!ue;Lclient!bb;)V")
	private void method1635(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub5 arg1) {
		while (arg0 != this.aClass31_57.aClass1_61 && ((Class1_Sub5) arg0).anInt447 <= arg1.anInt447) {
			arg0 = arg0.aClass1_119;
		}
		this.aClass31_57.method994(arg1, arg0);
		this.anInt2294 = ((Class1_Sub5) this.aClass31_57.aClass1_61.aClass1_119).anInt447;
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "()Lclient!qf;")
	@Override
	public Class1_Sub8 method1738() {
		return (Class1_Sub8) this.aClass31_56.method1003();
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
	private void method1636(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub8 local5 = (Class1_Sub8) this.aClass31_56.method1000(); local5 != null; local5 = (Class1_Sub8) this.aClass31_56.method1003()) {
			local5.method1739(arg0);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method1739(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2294 < 0) {
				this.method1636(arg0);
				return;
			}
			if (this.anInt2293 + arg0 < this.anInt2294) {
				this.anInt2293 += arg0;
				this.method1636(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2294 - this.anInt2293;
			this.method1636(local29);
			arg0 -= local29;
			this.anInt2293 += local29;
			this.method1638();
			@Pc(50) Class1_Sub5 local50 = (Class1_Sub5) this.aClass31_57.method1000();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method239(this);
				if (local58 < 0) {
					local50.anInt447 = 0;
					this.method1637(local50);
				} else {
					local50.anInt447 = local58;
					this.method1635(local50.aClass1_119, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!bb;)V")
	private void method1637(@OriginalArg(0) Class1_Sub5 arg0) {
		arg0.method2128();
		arg0.method238();
		@Pc(9) Class1 local9 = this.aClass31_57.aClass1_61.aClass1_119;
		if (local9 == this.aClass31_57.aClass1_61) {
			this.anInt2294 = -1;
		} else {
			this.anInt2294 = ((Class1_Sub5) local9).anInt447;
		}
	}

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "()V")
	private void method1638() {
		if (this.anInt2293 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub5 local8 = (Class1_Sub5) this.aClass31_57.method1000(); local8 != null; local8 = (Class1_Sub5) this.aClass31_57.method1003()) {
			local8.anInt447 -= this.anInt2293;
		}
		this.anInt2294 -= this.anInt2293;
		this.anInt2293 = 0;
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "([III)V")
	private void method1639(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub8 local5 = (Class1_Sub8) this.aClass31_56.method1000(); local5 != null; local5 = (Class1_Sub8) this.aClass31_56.method1003()) {
			local5.method1737(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "()Lclient!qf;")
	@Override
	public Class1_Sub8 method1734() {
		return (Class1_Sub8) this.aClass31_56.method1000();
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(Lclient!qf;)V")
	public synchronized void method1640(@OriginalArg(0) Class1_Sub8 arg0) {
		this.aClass31_56.method996(arg0);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method1736(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt2294 < 0) {
				this.method1639(arg0, arg1, arg2);
				return;
			}
			if (this.anInt2293 + arg2 < this.anInt2294) {
				this.anInt2293 += arg2;
				this.method1639(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt2294 - this.anInt2293;
			this.method1639(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2293 += local33;
			this.method1638();
			@Pc(60) Class1_Sub5 local60 = (Class1_Sub5) this.aClass31_57.method1000();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method239(this);
				if (local68 < 0) {
					local60.anInt447 = 0;
					this.method1637(local60);
				} else {
					local60.anInt447 = local68;
					this.method1635(local60.aClass1_119, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "()I")
	@Override
	public int method1733() {
		return 0;
	}
}
