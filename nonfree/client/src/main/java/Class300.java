import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rda")
public final class Class300 {

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "Lclient!ko;")
	private Class5 aClass5_265;

	@OriginalMember(owner = "client!rda", name = "j", descriptor = "J")
	private long aLong237;

	@OriginalMember(owner = "client!rda", name = "o", descriptor = "Lclient!ko;")
	private Class5 aClass5_266;

	@OriginalMember(owner = "client!rda", name = "p", descriptor = "I")
	private int anInt8430 = 0;

	@OriginalMember(owner = "client!rda", name = "l", descriptor = "[Lclient!ko;")
	public final Class5[] aClass5Array1;

	@OriginalMember(owner = "client!rda", name = "i", descriptor = "I")
	public final int anInt8426;

	@OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(I)V")
	public Class300(@OriginalArg(0) int arg0) {
		this.aClass5Array1 = new Class5[arg0];
		this.anInt8426 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class5 local23 = this.aClass5Array1[local13] = new Class5();
			local23.aClass5_337 = local23;
			local23.aClass5_338 = local23;
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(B)Lclient!ko;")
	public Class5 method7182() {
		this.anInt8430 = 0;
		return this.method7192();
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "([Lclient!ko;I)I")
	public int method7184(@OriginalArg(0) Class5[] arg0) {
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt8426; local12++) {
			@Pc(18) Class5 local18 = this.aClass5Array1[local12];
			for (@Pc(21) Class5 local21 = local18.aClass5_338; local21 != local18; local21 = local21.aClass5_338) {
				arg0[local10++] = local21;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(B)I")
	public int method7186() {
		return this.anInt8426;
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(I)Lclient!ko;")
	public Class5 method7187() {
		if (this.aClass5_265 == null) {
			return null;
		}
		@Pc(21) Class5 local21 = this.aClass5Array1[(int) (this.aLong237 & (long) (this.anInt8426 - 1))];
		while (local21 != this.aClass5_265) {
			if (this.aLong237 == this.aClass5_265.aLong307) {
				@Pc(32) Class5 local32 = this.aClass5_265;
				this.aClass5_265 = this.aClass5_265.aClass5_338;
				return local32;
			}
			this.aClass5_265 = this.aClass5_265.aClass5_338;
		}
		this.aClass5_265 = null;
		return null;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(JB)Lclient!ko;")
	public Class5 method7188(@OriginalArg(0) long arg0) {
		this.aLong237 = arg0;
		@Pc(18) Class5 local18 = this.aClass5Array1[(int) (arg0 & (long) (this.anInt8426 - 1))];
		for (this.aClass5_265 = local18.aClass5_338; this.aClass5_265 != local18; this.aClass5_265 = this.aClass5_265.aClass5_338) {
			if (arg0 == this.aClass5_265.aLong307) {
				@Pc(32) Class5 local32 = this.aClass5_265;
				this.aClass5_265 = this.aClass5_265.aClass5_338;
				return local32;
			}
		}
		this.aClass5_265 = null;
		return null;
	}

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "(I)V")
	public void method7189() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt8426; local1++) {
			@Pc(7) Class5 local7 = this.aClass5Array1[local1];
			while (true) {
				@Pc(10) Class5 local10 = local7.aClass5_338;
				if (local10 == local7) {
					break;
				}
				local10.method9052();
			}
		}
		this.aClass5_265 = null;
		this.aClass5_266 = null;
	}

	@OriginalMember(owner = "client!rda", name = "d", descriptor = "(I)I")
	public int method7190() {
		@Pc(5) int local5 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt8426; local14++) {
			@Pc(20) Class5 local20 = this.aClass5Array1[local14];
			@Pc(23) Class5 local23 = local20.aClass5_338;
			while (local20 != local23) {
				local23 = local23.aClass5_338;
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!ko;JI)V")
	public void method7191(@OriginalArg(0) Class5 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass5_337 != null) {
			arg0.method9052();
		}
		@Pc(23) Class5 local23 = this.aClass5Array1[(int) (arg1 & (long) (this.anInt8426 - 1))];
		arg0.aClass5_337 = local23.aClass5_337;
		arg0.aClass5_338 = local23;
		arg0.aClass5_337.aClass5_338 = arg0;
		arg0.aLong307 = arg1;
		arg0.aClass5_338.aClass5_337 = arg0;
	}

	@OriginalMember(owner = "client!rda", name = "e", descriptor = "(I)Lclient!ko;")
	public Class5 method7192() {
		@Pc(22) Class5 local22;
		if (this.anInt8430 > 0 && this.aClass5Array1[this.anInt8430 - 1] != this.aClass5_266) {
			local22 = this.aClass5_266;
			this.aClass5_266 = local22.aClass5_338;
			return local22;
		}
		while (this.anInt8430 < this.anInt8426) {
			local22 = this.aClass5Array1[this.anInt8430++].aClass5_338;
			if (this.aClass5Array1[this.anInt8430 - 1] != local22) {
				this.aClass5_266 = local22.aClass5_338;
				return local22;
			}
		}
		return null;
	}
}
