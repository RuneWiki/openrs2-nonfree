import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class66 {

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "J")
	private long aLong68;

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "Lclient!oq;")
	private Class4 aClass4_85;

	@OriginalMember(owner = "client!dj", name = "q", descriptor = "Lclient!oq;")
	private Class4 aClass4_86;

	@OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
	private int anInt2041 = 0;

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
	public final int anInt2032;

	@OriginalMember(owner = "client!dj", name = "p", descriptor = "[Lclient!oq;")
	public final Class4[] aClass4Array1;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(I)V")
	public Class66(@OriginalArg(0) int arg0) {
		this.anInt2032 = arg0;
		this.aClass4Array1 = new Class4[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class4 local23 = this.aClass4Array1[local13] = new Class4();
			local23.aClass4_337 = local23;
			local23.aClass4_338 = local23;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)Lclient!oq;")
	public Class4 method1984() {
		@Pc(22) Class4 local22;
		if (this.anInt2041 > 0 && this.aClass4_86 != this.aClass4Array1[this.anInt2041 - 1]) {
			local22 = this.aClass4_86;
			this.aClass4_86 = local22.aClass4_337;
			return local22;
		}
		while (this.anInt2032 > this.anInt2041) {
			local22 = this.aClass4Array1[this.anInt2041++].aClass4_337;
			if (this.aClass4Array1[this.anInt2041 - 1] != local22) {
				this.aClass4_86 = local22.aClass4_337;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!oq;BJ)V")
	public void method1985(@OriginalArg(0) Class4 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass4_338 != null) {
			arg0.method9000();
		}
		@Pc(27) Class4 local27 = this.aClass4Array1[(int) (arg1 & (long) (this.anInt2032 - 1))];
		arg0.aClass4_337 = local27;
		arg0.aClass4_338 = local27.aClass4_338;
		arg0.aClass4_338.aClass4_337 = arg0;
		arg0.aClass4_337.aClass4_338 = arg0;
		arg0.aLong307 = arg1;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "([Lclient!oq;I)I")
	public int method1986(@OriginalArg(0) Class4[] arg0) {
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt2032; local17++) {
			@Pc(24) Class4 local24 = this.aClass4Array1[local17];
			for (@Pc(27) Class4 local27 = local24.aClass4_337; local27 != local24; local27 = local27.aClass4_337) {
				arg0[local15++] = local27;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V")
	public void method1988() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2032; local7++) {
			@Pc(14) Class4 local14 = this.aClass4Array1[local7];
			while (true) {
				@Pc(17) Class4 local17 = local14.aClass4_337;
				if (local14 == local17) {
					break;
				}
				local17.method9000();
			}
		}
		this.aClass4_85 = null;
		this.aClass4_86 = null;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)I")
	public int method1990() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt2032; local9++) {
			@Pc(19) Class4 local19 = this.aClass4Array1[local9];
			@Pc(22) Class4 local22 = local19.aClass4_337;
			while (local19 != local22) {
				local22 = local22.aClass4_337;
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)Lclient!oq;")
	public Class4 method1991() {
		if (this.aClass4_85 == null) {
			return null;
		}
		@Pc(23) Class4 local23 = this.aClass4Array1[(int) ((long) (this.anInt2032 - 1) & this.aLong68)];
		while (local23 != this.aClass4_85) {
			if (this.aLong68 == this.aClass4_85.aLong307) {
				@Pc(39) Class4 local39 = this.aClass4_85;
				this.aClass4_85 = this.aClass4_85.aClass4_337;
				return local39;
			}
			this.aClass4_85 = this.aClass4_85.aClass4_337;
		}
		this.aClass4_85 = null;
		return null;
	}

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)Lclient!oq;")
	public Class4 method1992() {
		this.anInt2041 = 0;
		return this.method1984();
	}

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "(I)I")
	public int method1993() {
		return this.anInt2032;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IJ)Lclient!oq;")
	public Class4 method1994(@OriginalArg(1) long arg0) {
		this.aLong68 = arg0;
		@Pc(27) Class4 local27 = this.aClass4Array1[(int) (arg0 & (long) (this.anInt2032 - 1))];
		for (this.aClass4_85 = local27.aClass4_337; this.aClass4_85 != local27; this.aClass4_85 = this.aClass4_85.aClass4_337) {
			if (this.aClass4_85.aLong307 == arg0) {
				@Pc(46) Class4 local46 = this.aClass4_85;
				this.aClass4_85 = this.aClass4_85.aClass4_337;
				return local46;
			}
		}
		this.aClass4_85 = null;
		return null;
	}
}
