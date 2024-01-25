import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class199 {

	@OriginalMember(owner = "client!qh", name = "j", descriptor = "J")
	private long aLong167;

	@OriginalMember(owner = "client!qh", name = "n", descriptor = "Lclient!pe;")
	private Class1 aClass1_201;

	@OriginalMember(owner = "client!qh", name = "q", descriptor = "Lclient!pe;")
	private Class1 aClass1_202;

	@OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
	private int anInt5583 = 0;

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "[Lclient!pe;")
	public final Class1[] aClass1Array1;

	@OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
	public final int anInt5580;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(I)V")
	public Class199(@OriginalArg(0) int arg0) {
		this.aClass1Array1 = new Class1[arg0];
		this.anInt5580 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_262 = local23;
			local23.aClass1_261 = local23;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(JLclient!pe;I)V")
	public void method4383(@OriginalArg(0) long arg0, @OriginalArg(1) Class1 arg1) {
		if (arg1.aClass1_262 != null) {
			arg1.method5915();
		}
		@Pc(25) Class1 local25 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt5580 - 1))];
		arg1.aClass1_262 = local25.aClass1_262;
		arg1.aClass1_261 = local25;
		arg1.aClass1_262.aClass1_261 = arg1;
		arg1.aLong230 = arg0;
		arg1.aClass1_261.aClass1_262 = arg1;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V")
	public void method4385() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt5580; local11++) {
			@Pc(18) Class1 local18 = this.aClass1Array1[local11];
			while (true) {
				@Pc(21) Class1 local21 = local18.aClass1_261;
				if (local18 == local21) {
					break;
				}
				local21.method5915();
			}
		}
		this.aClass1_202 = null;
		this.aClass1_201 = null;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)I")
	public int method4386() {
		return this.anInt5580;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(JI)Lclient!pe;")
	public Class1 method4387(@OriginalArg(0) long arg0) {
		this.aLong167 = arg0;
		@Pc(20) Class1 local20 = this.aClass1Array1[(int) ((long) (this.anInt5580 - 1) & arg0)];
		for (this.aClass1_201 = local20.aClass1_261; this.aClass1_201 != local20; this.aClass1_201 = this.aClass1_201.aClass1_261) {
			if (this.aClass1_201.aLong230 == arg0) {
				@Pc(39) Class1 local39 = this.aClass1_201;
				this.aClass1_201 = this.aClass1_201.aClass1_261;
				return local39;
			}
		}
		this.aClass1_201 = null;
		return null;
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)Lclient!pe;")
	public Class1 method4389() {
		if (this.aClass1_201 == null) {
			return null;
		}
		@Pc(23) Class1 local23 = this.aClass1Array1[(int) ((long) (this.anInt5580 - 1) & this.aLong167)];
		while (this.aClass1_201 != local23) {
			if (this.aClass1_201.aLong230 == this.aLong167) {
				@Pc(41) Class1 local41 = this.aClass1_201;
				this.aClass1_201 = this.aClass1_201.aClass1_261;
				return local41;
			}
			this.aClass1_201 = this.aClass1_201.aClass1_261;
		}
		this.aClass1_201 = null;
		return null;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)I")
	public int method4390() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt5580; local9++) {
			@Pc(16) Class1 local16 = this.aClass1Array1[local9];
			@Pc(19) Class1 local19 = local16.aClass1_261;
			while (local19 != local16) {
				local19 = local19.aClass1_261;
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I[Lclient!pe;)I")
	public int method4391(@OriginalArg(1) Class1[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt5580; local9++) {
			@Pc(16) Class1 local16 = this.aClass1Array1[local9];
			for (@Pc(19) Class1 local19 = local16.aClass1_261; local19 != local16; local19 = local19.aClass1_261) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "(B)Lclient!pe;")
	public Class1 method4392() {
		this.anInt5583 = 0;
		return this.method4393();
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)Lclient!pe;")
	public Class1 method4393() {
		@Pc(30) Class1 local30;
		if (this.anInt5583 > 0 && this.aClass1_202 != this.aClass1Array1[this.anInt5583 - 1]) {
			local30 = this.aClass1_202;
			this.aClass1_202 = local30.aClass1_261;
			return local30;
		}
		while (this.anInt5583 < this.anInt5580) {
			local30 = this.aClass1Array1[this.anInt5583++].aClass1_261;
			if (this.aClass1Array1[this.anInt5583 - 1] != local30) {
				this.aClass1_202 = local30.aClass1_261;
				return local30;
			}
		}
		return null;
	}
}
