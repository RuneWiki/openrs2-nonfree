import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class208 {

	@OriginalMember(owner = "client!qi", name = "g", descriptor = "J")
	private long aLong182;

	@OriginalMember(owner = "client!qi", name = "n", descriptor = "Lclient!ev;")
	private Class1 aClass1_200;

	@OriginalMember(owner = "client!qi", name = "p", descriptor = "Lclient!ev;")
	private Class1 aClass1_201;

	@OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
	private int anInt5502 = 0;

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
	public final int anInt5493;

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "[Lclient!ev;")
	public final Class1[] aClass1Array1;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(I)V")
	public Class208(@OriginalArg(0) int arg0) {
		this.anInt5493 = arg0;
		this.aClass1Array1 = new Class1[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_268 = local23;
			local23.aClass1_267 = local23;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(JI)Lclient!ev;")
	public Class1 method4405(@OriginalArg(0) long arg0) {
		this.aLong182 = arg0;
		@Pc(20) Class1 local20 = this.aClass1Array1[(int) ((long) (this.anInt5493 - 1) & arg0)];
		for (this.aClass1_200 = local20.aClass1_267; this.aClass1_200 != local20; this.aClass1_200 = this.aClass1_200.aClass1_267) {
			if (arg0 == this.aClass1_200.aLong236) {
				@Pc(35) Class1 local35 = this.aClass1_200;
				this.aClass1_200 = this.aClass1_200.aClass1_267;
				return local35;
			}
		}
		this.aClass1_200 = null;
		return null;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)I")
	public int method4406() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt5493; local9++) {
			@Pc(16) Class1 local16 = this.aClass1Array1[local9];
			for (@Pc(19) Class1 local19 = local16.aClass1_267; local19 != local16; local19 = local19.aClass1_267) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "([Lclient!ev;B)I")
	public int method4407(@OriginalArg(0) Class1[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt5493; local9++) {
			@Pc(19) Class1 local19 = this.aClass1Array1[local9];
			for (@Pc(22) Class1 local22 = local19.aClass1_267; local22 != local19; local22 = local22.aClass1_267) {
				arg0[local7++] = local22;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
	public void method4408() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5493; local3++) {
			@Pc(10) Class1 local10 = this.aClass1Array1[local3];
			while (true) {
				@Pc(13) Class1 local13 = local10.aClass1_267;
				if (local13 == local10) {
					break;
				}
				local13.method5953();
			}
		}
		this.aClass1_201 = null;
		this.aClass1_200 = null;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)Lclient!ev;")
	public Class1 method4410() {
		@Pc(24) Class1 local24;
		if (this.anInt5502 > 0 && this.aClass1Array1[this.anInt5502 - 1] != this.aClass1_201) {
			local24 = this.aClass1_201;
			this.aClass1_201 = local24.aClass1_267;
			return local24;
		}
		while (this.anInt5493 > this.anInt5502) {
			local24 = this.aClass1Array1[this.anInt5502++].aClass1_267;
			if (local24 != this.aClass1Array1[this.anInt5502 - 1]) {
				this.aClass1_201 = local24.aClass1_267;
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)I")
	public int method4412() {
		return this.anInt5493;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(JLclient!ev;I)V")
	public void method4413(@OriginalArg(0) long arg0, @OriginalArg(1) Class1 arg1) {
		if (arg1.aClass1_268 != null) {
			arg1.method5953();
		}
		@Pc(21) Class1 local21 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt5493 - 1))];
		arg1.aClass1_268 = local21.aClass1_268;
		arg1.aClass1_267 = local21;
		arg1.aClass1_268.aClass1_267 = arg1;
		arg1.aClass1_267.aClass1_268 = arg1;
		arg1.aLong236 = arg0;
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)Lclient!ev;")
	public Class1 method4414() {
		this.anInt5502 = 0;
		return this.method4410();
	}

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "(I)Lclient!ev;")
	public Class1 method4415() {
		if (this.aClass1_200 == null) {
			return null;
		}
		@Pc(23) Class1 local23 = this.aClass1Array1[(int) ((long) (this.anInt5493 - 1) & this.aLong182)];
		while (local23 != this.aClass1_200) {
			if (this.aClass1_200.aLong236 == this.aLong182) {
				@Pc(35) Class1 local35 = this.aClass1_200;
				this.aClass1_200 = this.aClass1_200.aClass1_267;
				return local35;
			}
			this.aClass1_200 = this.aClass1_200.aClass1_267;
		}
		this.aClass1_200 = null;
		return null;
	}
}
