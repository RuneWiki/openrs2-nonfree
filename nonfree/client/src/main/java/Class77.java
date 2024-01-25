import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class77 {

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "Lclient!fi;")
	private Class1 aClass1_62;

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "J")
	private long aLong50;

	@OriginalMember(owner = "client!fa", name = "s", descriptor = "Lclient!fi;")
	private Class1 aClass1_63;

	@OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
	private int anInt1689 = 0;

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "[Lclient!fi;")
	public final Class1[] aClass1Array1;

	@OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
	public final int anInt1687;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(I)V")
	public Class77(@OriginalArg(0) int arg0) {
		this.aClass1Array1 = new Class1[arg0];
		this.anInt1687 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_244 = local23;
			local23.aClass1_243 = local23;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)Lclient!fi;")
	public Class1 method1359() {
		this.anInt1689 = 0;
		return this.method1360();
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)Lclient!fi;")
	public Class1 method1360() {
		@Pc(19) Class1 local19;
		if (this.anInt1689 > 0 && this.aClass1_63 != this.aClass1Array1[this.anInt1689 - 1]) {
			local19 = this.aClass1_63;
			this.aClass1_63 = local19.aClass1_243;
			return local19;
		}
		while (this.anInt1687 > this.anInt1689) {
			local19 = this.aClass1Array1[this.anInt1689++].aClass1_243;
			if (this.aClass1Array1[this.anInt1689 - 1] != local19) {
				this.aClass1_63 = local19.aClass1_243;
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)V")
	public void method1362() {
		for (@Pc(9) int local9 = 0; local9 < this.anInt1687; local9++) {
			@Pc(16) Class1 local16 = this.aClass1Array1[local9];
			while (true) {
				@Pc(19) Class1 local19 = local16.aClass1_243;
				if (local19 == local16) {
					break;
				}
				local19.method5577();
			}
		}
		this.aClass1_63 = null;
		this.aClass1_62 = null;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)I")
	public int method1363() {
		return this.anInt1687;
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(Z)I")
	public int method1365() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt1687; local9++) {
			@Pc(16) Class1 local16 = this.aClass1Array1[local9];
			for (@Pc(19) Class1 local19 = local16.aClass1_243; local19 != local16; local19 = local19.aClass1_243) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I[Lclient!fi;)I")
	public int method1367(@OriginalArg(1) Class1[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt1687; local9++) {
			@Pc(16) Class1 local16 = this.aClass1Array1[local9];
			for (@Pc(19) Class1 local19 = local16.aClass1_243; local19 != local16; local19 = local19.aClass1_243) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(JB)Lclient!fi;")
	public Class1 method1368(@OriginalArg(0) long arg0) {
		this.aLong50 = arg0;
		@Pc(27) Class1 local27 = this.aClass1Array1[(int) ((long) (this.anInt1687 - 1) & arg0)];
		for (this.aClass1_62 = local27.aClass1_243; this.aClass1_62 != local27; this.aClass1_62 = this.aClass1_62.aClass1_243) {
			if (this.aClass1_62.aLong207 == arg0) {
				@Pc(46) Class1 local46 = this.aClass1_62;
				this.aClass1_62 = this.aClass1_62.aClass1_243;
				return local46;
			}
		}
		this.aClass1_62 = null;
		return null;
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(B)Lclient!fi;")
	public Class1 method1369() {
		if (this.aClass1_62 == null) {
			return null;
		}
		@Pc(29) Class1 local29 = this.aClass1Array1[(int) (this.aLong50 & (long) (this.anInt1687 - 1))];
		while (this.aClass1_62 != local29) {
			if (this.aLong50 == this.aClass1_62.aLong207) {
				@Pc(45) Class1 local45 = this.aClass1_62;
				this.aClass1_62 = this.aClass1_62.aClass1_243;
				return local45;
			}
			this.aClass1_62 = this.aClass1_62.aClass1_243;
		}
		this.aClass1_62 = null;
		return null;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(JLclient!fi;B)V")
	public void method1370(@OriginalArg(0) long arg0, @OriginalArg(1) Class1 arg1) {
		if (arg1.aClass1_244 != null) {
			arg1.method5577();
		}
		@Pc(21) Class1 local21 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt1687 - 1))];
		arg1.aClass1_243 = local21;
		arg1.aClass1_244 = local21.aClass1_244;
		arg1.aClass1_244.aClass1_243 = arg1;
		arg1.aLong207 = arg0;
		arg1.aClass1_243.aClass1_244 = arg1;
	}
}
