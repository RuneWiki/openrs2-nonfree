import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class74 {

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "Lclient!ub;")
	private Class2 aClass2_163;

	@OriginalMember(owner = "client!sa", name = "t", descriptor = "J")
	private long aLong103;

	@OriginalMember(owner = "client!sa", name = "w", descriptor = "Lclient!ub;")
	private Class2 aClass2_164;

	@OriginalMember(owner = "client!sa", name = "x", descriptor = "I")
	private int anInt3529 = 0;

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
	private final int anInt3523;

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "[Lclient!ub;")
	private final Class2[] aClass2Array1;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(I)V")
	public Class74(@OriginalArg(0) int arg0) {
		this.anInt3523 = arg0;
		this.aClass2Array1 = new Class2[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local13] = new Class2();
			local23.aClass2_210 = local23;
			local23.aClass2_209 = local23;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)Lclient!ub;")
	public Class2 method2430() {
		this.anInt3529 = 0;
		return this.method2435();
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "([Lclient!ub;I)I")
	public int method2431(@OriginalArg(0) Class2[] arg0) {
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt3523; local12++) {
			@Pc(18) Class2 local18 = this.aClass2Array1[local12];
			for (@Pc(21) Class2 local21 = local18.aClass2_210; local21 != local18; local21 = local21.aClass2_210) {
				arg0[local10++] = local21;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(JZLclient!ub;)V")
	public void method2432(@OriginalArg(0) long arg0, @OriginalArg(2) Class2 arg1) {
		if (arg1.aClass2_209 != null) {
			arg1.method3004();
		}
		@Pc(29) Class2 local29 = this.aClass2Array1[(int) ((long) (this.anInt3523 - 1) & arg0)];
		arg1.aLong134 = arg0;
		arg1.aClass2_209 = local29.aClass2_209;
		arg1.aClass2_210 = local29;
		arg1.aClass2_209.aClass2_210 = arg1;
		arg1.aClass2_210.aClass2_209 = arg1;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(JB)Lclient!ub;")
	public Class2 method2433(@OriginalArg(0) long arg0) {
		this.aLong103 = arg0;
		@Pc(23) Class2 local23 = this.aClass2Array1[(int) ((long) (this.anInt3523 - 1) & arg0)];
		for (this.aClass2_163 = local23.aClass2_210; this.aClass2_163 != local23; this.aClass2_163 = this.aClass2_163.aClass2_210) {
			if (this.aClass2_163.aLong134 == arg0) {
				@Pc(41) Class2 local41 = this.aClass2_163;
				this.aClass2_163 = this.aClass2_163.aClass2_210;
				return local41;
			}
		}
		this.aClass2_163 = null;
		return null;
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)Lclient!ub;")
	public Class2 method2435() {
		@Pc(22) Class2 local22;
		if (this.anInt3529 > 0 && this.aClass2Array1[this.anInt3529 - 1] != this.aClass2_164) {
			local22 = this.aClass2_164;
			this.aClass2_164 = local22.aClass2_210;
			return local22;
		}
		while (this.anInt3523 > this.anInt3529) {
			local22 = this.aClass2Array1[this.anInt3529++].aClass2_210;
			if (this.aClass2Array1[this.anInt3529 - 1] != local22) {
				this.aClass2_164 = local22.aClass2_210;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)Lclient!ub;")
	public Class2 method2437() {
		if (this.aClass2_163 == null) {
			return null;
		}
		@Pc(27) Class2 local27 = this.aClass2Array1[(int) ((long) (this.anInt3523 - 1) & this.aLong103)];
		while (this.aClass2_163 != local27) {
			if (this.aClass2_163.aLong134 == this.aLong103) {
				@Pc(42) Class2 local42 = this.aClass2_163;
				this.aClass2_163 = this.aClass2_163.aClass2_210;
				return local42;
			}
			this.aClass2_163 = this.aClass2_163.aClass2_210;
		}
		this.aClass2_163 = null;
		return null;
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(B)I")
	public int method2438() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt3523; local9++) {
			@Pc(24) Class2 local24 = this.aClass2Array1[local9];
			@Pc(27) Class2 local27 = local24.aClass2_210;
			while (local27 != local24) {
				local27 = local27.aClass2_210;
				local7++;
			}
		}
		return local7;
	}
}
