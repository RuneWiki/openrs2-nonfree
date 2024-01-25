import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class209 {

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "Lclient!sja;")
	private Class6 aClass6_191;

	@OriginalMember(owner = "client!lk", name = "o", descriptor = "J")
	private long aLong168;

	@OriginalMember(owner = "client!lk", name = "t", descriptor = "Lclient!sja;")
	private Class6 aClass6_192;

	@OriginalMember(owner = "client!lk", name = "u", descriptor = "I")
	private int anInt5930 = 0;

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "[Lclient!sja;")
	public final Class6[] aClass6Array1;

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
	public final int anInt5919;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(I)V")
	public Class209(@OriginalArg(0) int arg0) {
		this.aClass6Array1 = new Class6[arg0];
		this.anInt5919 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class6 local23 = this.aClass6Array1[local13] = new Class6();
			local23.aClass6_337 = local23;
			local23.aClass6_338 = local23;
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "([Lclient!sja;Z)I")
	public int method5032(@OriginalArg(0) Class6[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt5919; local9++) {
			@Pc(19) Class6 local19 = this.aClass6Array1[local9];
			for (@Pc(22) Class6 local22 = local19.aClass6_338; local22 != local19; local22 = local22.aClass6_338) {
				arg0[local7++] = local22;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)I")
	public int method5033() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt5919; local9++) {
			@Pc(16) Class6 local16 = this.aClass6Array1[local9];
			for (@Pc(19) Class6 local19 = local16.aClass6_338; local19 != local16; local19 = local19.aClass6_338) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(BJLclient!sja;)V")
	public void method5035(@OriginalArg(1) long arg0, @OriginalArg(2) Class6 arg1) {
		if (arg1.aClass6_337 != null) {
			arg1.method9174();
		}
		@Pc(23) Class6 local23 = this.aClass6Array1[(int) ((long) (this.anInt5919 - 1) & arg0)];
		arg1.aClass6_337 = local23.aClass6_337;
		arg1.aClass6_338 = local23;
		arg1.aClass6_337.aClass6_338 = arg1;
		arg1.aClass6_338.aClass6_337 = arg1;
		arg1.aLong314 = arg0;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)Lclient!sja;")
	public Class6 method5036() {
		@Pc(22) Class6 local22;
		if (this.anInt5930 > 0 && this.aClass6Array1[this.anInt5930 - 1] != this.aClass6_192) {
			local22 = this.aClass6_192;
			this.aClass6_192 = local22.aClass6_338;
			return local22;
		}
		while (this.anInt5919 > this.anInt5930) {
			local22 = this.aClass6Array1[this.anInt5930++].aClass6_338;
			if (this.aClass6Array1[this.anInt5930 - 1] != local22) {
				this.aClass6_192 = local22.aClass6_338;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)Lclient!sja;")
	public Class6 method5037() {
		this.anInt5930 = 0;
		return this.method5036();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZJ)Lclient!sja;")
	public Class6 method5038(@OriginalArg(1) long arg0) {
		this.aLong168 = arg0;
		@Pc(20) Class6 local20 = this.aClass6Array1[(int) (arg0 & (long) (this.anInt5919 - 1))];
		for (this.aClass6_191 = local20.aClass6_338; this.aClass6_191 != local20; this.aClass6_191 = this.aClass6_191.aClass6_338) {
			if (arg0 == this.aClass6_191.aLong314) {
				@Pc(39) Class6 local39 = this.aClass6_191;
				this.aClass6_191 = this.aClass6_191.aClass6_338;
				return local39;
			}
		}
		this.aClass6_191 = null;
		return null;
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(B)I")
	public int method5039() {
		return this.anInt5919;
	}

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)V")
	public void method5041() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5919; local7++) {
			@Pc(14) Class6 local14 = this.aClass6Array1[local7];
			while (true) {
				@Pc(17) Class6 local17 = local14.aClass6_338;
				if (local17 == local14) {
					break;
				}
				local17.method9174();
			}
		}
		this.aClass6_191 = null;
		this.aClass6_192 = null;
	}

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "(I)Lclient!sja;")
	public Class6 method5042() {
		if (this.aClass6_191 == null) {
			return null;
		}
		@Pc(28) Class6 local28 = this.aClass6Array1[(int) ((long) (this.anInt5919 - 1) & this.aLong168)];
		while (this.aClass6_191 != local28) {
			if (this.aClass6_191.aLong314 == this.aLong168) {
				@Pc(40) Class6 local40 = this.aClass6_191;
				this.aClass6_191 = this.aClass6_191.aClass6_338;
				return local40;
			}
			this.aClass6_191 = this.aClass6_191.aClass6_338;
		}
		this.aClass6_191 = null;
		return null;
	}
}
