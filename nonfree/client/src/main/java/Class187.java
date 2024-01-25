import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class187 {

	@OriginalMember(owner = "client!jo", name = "h", descriptor = "J")
	private long aLong154;

	@OriginalMember(owner = "client!jo", name = "t", descriptor = "Lclient!lq;")
	private Class14 aClass14_158;

	@OriginalMember(owner = "client!jo", name = "u", descriptor = "Lclient!lq;")
	private Class14 aClass14_159;

	@OriginalMember(owner = "client!jo", name = "x", descriptor = "I")
	private int anInt4897 = 0;

	@OriginalMember(owner = "client!jo", name = "q", descriptor = "[Lclient!lq;")
	public final Class14[] aClass14Array1;

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "I")
	public final int anInt4883;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(I)V")
	public Class187(@OriginalArg(0) int arg0) {
		this.aClass14Array1 = new Class14[arg0];
		this.anInt4883 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class14 local23 = this.aClass14Array1[local13] = new Class14();
			local23.aClass14_337 = local23;
			local23.aClass14_338 = local23;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
	public void method4076() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4883; local3++) {
			@Pc(10) Class14 local10 = this.aClass14Array1[local3];
			while (true) {
				@Pc(13) Class14 local13 = local10.aClass14_338;
				if (local13 == local10) {
					break;
				}
				local13.method9315();
			}
		}
		this.aClass14_158 = null;
		this.aClass14_159 = null;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IJLclient!lq;)V")
	public void method4077(@OriginalArg(1) long arg0, @OriginalArg(2) Class14 arg1) {
		if (arg1.aClass14_337 != null) {
			arg1.method9315();
		}
		@Pc(21) Class14 local21 = this.aClass14Array1[(int) (arg0 & (long) (this.anInt4883 - 1))];
		arg1.aClass14_337 = local21.aClass14_337;
		arg1.aClass14_338 = local21;
		arg1.aClass14_337.aClass14_338 = arg1;
		arg1.aClass14_338.aClass14_337 = arg1;
		arg1.aLong305 = arg0;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(JI)Lclient!lq;")
	public Class14 method4078(@OriginalArg(0) long arg0) {
		this.aLong154 = arg0;
		@Pc(20) Class14 local20 = this.aClass14Array1[(int) (arg0 & (long) (this.anInt4883 - 1))];
		for (this.aClass14_158 = local20.aClass14_338; this.aClass14_158 != local20; this.aClass14_158 = this.aClass14_158.aClass14_338) {
			if (this.aClass14_158.aLong305 == arg0) {
				@Pc(35) Class14 local35 = this.aClass14_158;
				this.aClass14_158 = this.aClass14_158.aClass14_338;
				return local35;
			}
		}
		this.aClass14_158 = null;
		return null;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)Lclient!lq;")
	public Class14 method4079() {
		this.anInt4897 = 0;
		return this.method4084();
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Z)I")
	public int method4080() {
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt4883; local14++) {
			@Pc(21) Class14 local21 = this.aClass14Array1[local14];
			for (@Pc(24) Class14 local24 = local21.aClass14_338; local24 != local21; local24 = local24.aClass14_338) {
				local12++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)Lclient!lq;")
	public Class14 method4084() {
		@Pc(22) Class14 local22;
		if (this.anInt4897 > 0 && this.aClass14_159 != this.aClass14Array1[this.anInt4897 - 1]) {
			local22 = this.aClass14_159;
			this.aClass14_159 = local22.aClass14_338;
			return local22;
		}
		while (this.anInt4883 > this.anInt4897) {
			local22 = this.aClass14Array1[this.anInt4897++].aClass14_338;
			if (this.aClass14Array1[this.anInt4897 - 1] != local22) {
				this.aClass14_159 = local22.aClass14_338;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(Z)Lclient!lq;")
	public Class14 method4086() {
		if (this.aClass14_158 == null) {
			return null;
		}
		@Pc(23) Class14 local23 = this.aClass14Array1[(int) (this.aLong154 & (long) (this.anInt4883 - 1))];
		while (this.aClass14_158 != local23) {
			if (this.aLong154 == this.aClass14_158.aLong305) {
				@Pc(47) Class14 local47 = this.aClass14_158;
				this.aClass14_158 = this.aClass14_158.aClass14_338;
				return local47;
			}
			this.aClass14_158 = this.aClass14_158.aClass14_338;
		}
		this.aClass14_158 = null;
		return null;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I[Lclient!lq;)I")
	public int method4087(@OriginalArg(1) Class14[] arg0) {
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < this.anInt4883; local16++) {
			@Pc(23) Class14 local23 = this.aClass14Array1[local16];
			for (@Pc(26) Class14 local26 = local23.aClass14_338; local26 != local23; local26 = local26.aClass14_338) {
				arg0[local14++] = local26;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "(I)I")
	public int method4088() {
		return this.anInt4883;
	}
}
