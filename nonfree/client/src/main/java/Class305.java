import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class305 {

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "Lclient!mu;")
	private Class6 aClass6_238;

	@OriginalMember(owner = "client!tq", name = "h", descriptor = "J")
	private long aLong214;

	@OriginalMember(owner = "client!tq", name = "o", descriptor = "Lclient!mu;")
	private Class6 aClass6_239;

	@OriginalMember(owner = "client!tq", name = "p", descriptor = "I")
	private int anInt8877 = 0;

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
	public final int anInt8868;

	@OriginalMember(owner = "client!tq", name = "j", descriptor = "[Lclient!mu;")
	public final Class6[] aClass6Array1;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(I)V")
	public Class305(@OriginalArg(0) int arg0) {
		this.anInt8868 = arg0;
		this.aClass6Array1 = new Class6[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class6 local23 = this.aClass6Array1[local13] = new Class6();
			local23.aClass6_284 = local23;
			local23.aClass6_283 = local23;
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V")
	public void method7440() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt8868; local3++) {
			@Pc(10) Class6 local10 = this.aClass6Array1[local3];
			while (true) {
				@Pc(13) Class6 local13 = local10.aClass6_283;
				if (local13 == local10) {
					break;
				}
				local13.method8151();
			}
		}
		this.aClass6_238 = null;
		this.aClass6_239 = null;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)I")
	public int method7441() {
		return this.anInt8868;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "([Lclient!mu;I)I")
	public int method7442(@OriginalArg(0) Class6[] arg0) {
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt8868; local14++) {
			@Pc(21) Class6 local21 = this.aClass6Array1[local14];
			for (@Pc(24) Class6 local24 = local21.aClass6_283; local24 != local21; local24 = local24.aClass6_283) {
				arg0[local12++] = local24;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Z)I")
	public int method7443() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt8868; local9++) {
			@Pc(16) Class6 local16 = this.aClass6Array1[local9];
			for (@Pc(19) Class6 local19 = local16.aClass6_283; local19 != local16; local19 = local19.aClass6_283) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)Lclient!mu;")
	public Class6 method7445() {
		this.anInt8877 = 0;
		return this.method7449();
	}

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "(I)Lclient!mu;")
	public Class6 method7446() {
		if (this.aClass6_238 == null) {
			return null;
		}
		@Pc(29) Class6 local29 = this.aClass6Array1[(int) ((long) (this.anInt8868 - 1) & this.aLong214)];
		while (this.aClass6_238 != local29) {
			if (this.aLong214 == this.aClass6_238.aLong252) {
				@Pc(41) Class6 local41 = this.aClass6_238;
				this.aClass6_238 = this.aClass6_238.aClass6_283;
				return local41;
			}
			this.aClass6_238 = this.aClass6_238.aClass6_283;
		}
		this.aClass6_238 = null;
		return null;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BJ)Lclient!mu;")
	public Class6 method7447(@OriginalArg(1) long arg0) {
		this.aLong214 = arg0;
		@Pc(18) Class6 local18 = this.aClass6Array1[(int) ((long) (this.anInt8868 - 1) & arg0)];
		for (this.aClass6_238 = local18.aClass6_283; this.aClass6_238 != local18; this.aClass6_238 = this.aClass6_238.aClass6_283) {
			if (this.aClass6_238.aLong252 == arg0) {
				@Pc(36) Class6 local36 = this.aClass6_238;
				this.aClass6_238 = this.aClass6_238.aClass6_283;
				return local36;
			}
		}
		this.aClass6_238 = null;
		return null;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(JILclient!mu;)V")
	public void method7448(@OriginalArg(0) long arg0, @OriginalArg(2) Class6 arg1) {
		if (arg1.aClass6_284 != null) {
			arg1.method8151();
		}
		@Pc(21) Class6 local21 = this.aClass6Array1[(int) ((long) (this.anInt8868 - 1) & arg0)];
		arg1.aClass6_283 = local21;
		arg1.aClass6_284 = local21.aClass6_284;
		arg1.aClass6_284.aClass6_283 = arg1;
		arg1.aClass6_283.aClass6_284 = arg1;
		arg1.aLong252 = arg0;
	}

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "(I)Lclient!mu;")
	public Class6 method7449() {
		@Pc(19) Class6 local19;
		if (this.anInt8877 > 0 && this.aClass6Array1[this.anInt8877 - 1] != this.aClass6_239) {
			local19 = this.aClass6_239;
			this.aClass6_239 = local19.aClass6_283;
			return local19;
		}
		while (this.anInt8868 > this.anInt8877) {
			local19 = this.aClass6Array1[this.anInt8877++].aClass6_283;
			if (this.aClass6Array1[this.anInt8877 - 1] != local19) {
				this.aClass6_239 = local19.aClass6_283;
				return local19;
			}
		}
		return null;
	}
}
