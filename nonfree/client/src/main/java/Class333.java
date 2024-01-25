import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tca")
public final class Class333 {

	@OriginalMember(owner = "client!tca", name = "c", descriptor = "J")
	private long aLong255;

	@OriginalMember(owner = "client!tca", name = "k", descriptor = "Lclient!mg;")
	private Class3 aClass3_277;

	@OriginalMember(owner = "client!tca", name = "q", descriptor = "Lclient!mg;")
	private Class3 aClass3_278;

	@OriginalMember(owner = "client!tca", name = "o", descriptor = "I")
	private int anInt9198 = 0;

	@OriginalMember(owner = "client!tca", name = "d", descriptor = "[Lclient!mg;")
	public final Class3[] aClass3Array1;

	@OriginalMember(owner = "client!tca", name = "m", descriptor = "I")
	public final int anInt9196;

	@OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(I)V")
	public Class333(@OriginalArg(0) int arg0) {
		this.aClass3Array1 = new Class3[arg0];
		this.anInt9196 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class3 local23 = this.aClass3Array1[local13] = new Class3();
			local23.aClass3_337 = local23;
			local23.aClass3_338 = local23;
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "([Lclient!mg;I)I")
	public int method7483(@OriginalArg(0) Class3[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt9196; local9++) {
			@Pc(16) Class3 local16 = this.aClass3Array1[local9];
			for (@Pc(19) Class3 local19 = local16.aClass3_337; local19 != local16; local19 = local19.aClass3_337) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(I)Lclient!mg;")
	public Class3 method7484() {
		if (this.aClass3_277 == null) {
			return null;
		}
		@Pc(23) Class3 local23 = this.aClass3Array1[(int) ((long) (this.anInt9196 - 1) & this.aLong255)];
		while (local23 != this.aClass3_277) {
			if (this.aClass3_277.aLong313 == this.aLong255) {
				@Pc(35) Class3 local35 = this.aClass3_277;
				this.aClass3_277 = this.aClass3_277.aClass3_337;
				return local35;
			}
			this.aClass3_277 = this.aClass3_277.aClass3_337;
		}
		this.aClass3_277 = null;
		return null;
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(I)V")
	public void method7485() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt9196; local7++) {
			@Pc(14) Class3 local14 = this.aClass3Array1[local7];
			while (true) {
				@Pc(17) Class3 local17 = local14.aClass3_337;
				if (local17 == local14) {
					break;
				}
				local17.method9034();
			}
		}
		this.aClass3_277 = null;
		this.aClass3_278 = null;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(B)I")
	public int method7486() {
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt9196; local17++) {
			@Pc(24) Class3 local24 = this.aClass3Array1[local17];
			@Pc(27) Class3 local27 = local24.aClass3_337;
			while (local27 != local24) {
				local27 = local27.aClass3_337;
				local15++;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Z)Lclient!mg;")
	public Class3 method7487() {
		@Pc(22) Class3 local22;
		if (this.anInt9198 > 0 && this.aClass3Array1[this.anInt9198 - 1] != this.aClass3_278) {
			local22 = this.aClass3_278;
			this.aClass3_278 = local22.aClass3_337;
			return local22;
		}
		while (this.anInt9198 < this.anInt9196) {
			local22 = this.aClass3Array1[this.anInt9198++].aClass3_337;
			if (this.aClass3Array1[this.anInt9198 - 1] != local22) {
				this.aClass3_278 = local22.aClass3_337;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IJLclient!mg;)V")
	public void method7488(@OriginalArg(1) long arg0, @OriginalArg(2) Class3 arg1) {
		if (arg1.aClass3_338 != null) {
			arg1.method9034();
		}
		@Pc(21) Class3 local21 = this.aClass3Array1[(int) (arg0 & (long) (this.anInt9196 - 1))];
		arg1.aClass3_338 = local21.aClass3_338;
		arg1.aClass3_337 = local21;
		arg1.aClass3_338.aClass3_337 = arg1;
		arg1.aLong313 = arg0;
		arg1.aClass3_337.aClass3_338 = arg1;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IJ)Lclient!mg;")
	public Class3 method7489(@OriginalArg(1) long arg0) {
		this.aLong255 = arg0;
		@Pc(20) Class3 local20 = this.aClass3Array1[(int) ((long) (this.anInt9196 - 1) & arg0)];
		for (this.aClass3_277 = local20.aClass3_337; this.aClass3_277 != local20; this.aClass3_277 = this.aClass3_277.aClass3_337) {
			if (arg0 == this.aClass3_277.aLong313) {
				@Pc(42) Class3 local42 = this.aClass3_277;
				this.aClass3_277 = this.aClass3_277.aClass3_337;
				return local42;
			}
		}
		this.aClass3_277 = null;
		return null;
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(B)Lclient!mg;")
	public Class3 method7490() {
		this.anInt9198 = 0;
		return this.method7487();
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(Z)I")
	public int method7491() {
		return this.anInt9196;
	}
}
