import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class156 {

	@OriginalMember(owner = "client!s", name = "g", descriptor = "Lclient!mg;")
	private Class1 aClass1_188;

	@OriginalMember(owner = "client!s", name = "m", descriptor = "J")
	private long aLong184;

	@OriginalMember(owner = "client!s", name = "u", descriptor = "Lclient!mg;")
	private Class1 aClass1_189;

	@OriginalMember(owner = "client!s", name = "t", descriptor = "I")
	private int anInt4918 = 0;

	@OriginalMember(owner = "client!s", name = "s", descriptor = "[Lclient!mg;")
	public Class1[] aClass1Array1;

	@OriginalMember(owner = "client!s", name = "r", descriptor = "I")
	public int anInt4917;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(I)V")
	public Class156(@OriginalArg(0) int arg0) {
		this.aClass1Array1 = new Class1[arg0];
		this.anInt4917 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(29) Class1 local29 = this.aClass1Array1[local13] = new Class1();
			local29.aClass1_232 = local29;
			local29.aClass1_233 = local29;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(JILclient!mg;)V")
	public void method3816(@OriginalArg(0) long arg0, @OriginalArg(2) Class1 arg1) {
		if (arg1.aClass1_232 != null) {
			arg1.method4616();
		}
		@Pc(30) Class1 local30 = this.aClass1Array1[(int) ((long) (this.anInt4917 - 1) & arg0)];
		arg1.aClass1_232 = local30.aClass1_232;
		arg1.aClass1_233 = local30;
		arg1.aLong223 = arg0;
		arg1.aClass1_232.aClass1_233 = arg1;
		arg1.aClass1_233.aClass1_232 = arg1;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Z[Lclient!mg;)I")
	public int method3819(@OriginalArg(1) Class1[] arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt4917; local14++) {
			@Pc(27) Class1 local27 = this.aClass1Array1[local14];
			for (@Pc(30) Class1 local30 = local27.aClass1_233; local30 != local27; local30 = local30.aClass1_233) {
				arg0[local3++] = local30;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)Lclient!mg;")
	public Class1 method3820() {
		@Pc(28) Class1 local28;
		if (this.anInt4918 > 0 && this.aClass1_189 != this.aClass1Array1[this.anInt4918 - 1]) {
			local28 = this.aClass1_189;
			this.aClass1_189 = local28.aClass1_233;
			return local28;
		}
		do {
			if (this.anInt4918 >= this.anInt4917) {
				return null;
			}
			local28 = this.aClass1Array1[this.anInt4918++].aClass1_233;
		} while (local28 == this.aClass1Array1[this.anInt4918 - 1]);
		this.aClass1_189 = local28.aClass1_233;
		return local28;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(JZ)Lclient!mg;")
	public Class1 method3821(@OriginalArg(0) long arg0) {
		this.aLong184 = arg0;
		@Pc(18) Class1 local18 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt4917 - 1))];
		for (this.aClass1_188 = local18.aClass1_233; this.aClass1_188 != local18; this.aClass1_188 = this.aClass1_188.aClass1_233) {
			if (arg0 == this.aClass1_188.aLong223) {
				@Pc(40) Class1 local40 = this.aClass1_188;
				this.aClass1_188 = this.aClass1_188.aClass1_233;
				return local40;
			}
		}
		this.aClass1_188 = null;
		return null;
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(I)Lclient!mg;")
	public Class1 method3822() {
		this.anInt4918 = 0;
		return this.method3820();
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(B)Lclient!mg;")
	public Class1 method3823() {
		if (this.aClass1_188 == null) {
			return null;
		}
		@Pc(24) Class1 local24 = this.aClass1Array1[(int) (this.aLong184 & (long) (this.anInt4917 - 1))];
		while (this.aClass1_188 != local24) {
			if (this.aClass1_188.aLong223 == this.aLong184) {
				@Pc(38) Class1 local38 = this.aClass1_188;
				this.aClass1_188 = this.aClass1_188.aClass1_233;
				return local38;
			}
			this.aClass1_188 = this.aClass1_188.aClass1_233;
		}
		this.aClass1_188 = null;
		return null;
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(I)I")
	public int method3825() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt4917; local9++) {
			@Pc(18) Class1 local18 = this.aClass1Array1[local9];
			for (@Pc(21) Class1 local21 = local18.aClass1_233; local21 != local18; local21 = local21.aClass1_233) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(I)V")
	public void method3826() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4917; local3++) {
			@Pc(20) Class1 local20 = this.aClass1Array1[local3];
			while (true) {
				@Pc(23) Class1 local23 = local20.aClass1_233;
				if (local23 == local20) {
					break;
				}
				local23.method4616();
			}
		}
		this.aClass1_188 = null;
		this.aClass1_189 = null;
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(B)I")
	public int method3829() {
		return this.anInt4917;
	}
}
