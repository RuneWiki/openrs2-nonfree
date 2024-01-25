import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tga")
public final class Class335 {

	@OriginalMember(owner = "client!tga", name = "n", descriptor = "J")
	private long aLong285;

	@OriginalMember(owner = "client!tga", name = "p", descriptor = "Lclient!dn;")
	private Class5 aClass5_295;

	@OriginalMember(owner = "client!tga", name = "u", descriptor = "Lclient!dn;")
	private Class5 aClass5_296;

	@OriginalMember(owner = "client!tga", name = "t", descriptor = "I")
	private int anInt9292 = 0;

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "I")
	public final int anInt9280;

	@OriginalMember(owner = "client!tga", name = "d", descriptor = "[Lclient!dn;")
	public final Class5[] aClass5Array1;

	@OriginalMember(owner = "client!tga", name = "<init>", descriptor = "(I)V")
	public Class335(@OriginalArg(0) int arg0) {
		this.anInt9280 = arg0;
		this.aClass5Array1 = new Class5[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class5 local23 = this.aClass5Array1[local13] = new Class5();
			local23.aClass5_337 = local23;
			local23.aClass5_338 = local23;
		}
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(BJ)Lclient!dn;")
	public Class5 method7766(@OriginalArg(1) long arg0) {
		this.aLong285 = arg0;
		@Pc(18) Class5 local18 = this.aClass5Array1[(int) (arg0 & (long) (this.anInt9280 - 1))];
		for (this.aClass5_295 = local18.aClass5_337; this.aClass5_295 != local18; this.aClass5_295 = this.aClass5_295.aClass5_337) {
			if (arg0 == this.aClass5_295.aLong329) {
				@Pc(41) Class5 local41 = this.aClass5_295;
				this.aClass5_295 = this.aClass5_295.aClass5_337;
				return local41;
			}
		}
		this.aClass5_295 = null;
		return null;
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(I)I")
	public int method7767() {
		@Pc(5) int local5 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt9280; local12++) {
			@Pc(18) Class5 local18 = this.aClass5Array1[local12];
			for (@Pc(21) Class5 local21 = local18.aClass5_337; local21 != local18; local21 = local21.aClass5_337) {
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!tga", name = "b", descriptor = "(I)Lclient!dn;")
	public Class5 method7768() {
		this.anInt9292 = 0;
		return this.method7777();
	}

	@OriginalMember(owner = "client!tga", name = "c", descriptor = "(I)Lclient!dn;")
	public Class5 method7769() {
		if (this.aClass5_295 == null) {
			return null;
		}
		@Pc(21) Class5 local21 = this.aClass5Array1[(int) (this.aLong285 & (long) (this.anInt9280 - 1))];
		while (this.aClass5_295 != local21) {
			if (this.aLong285 == this.aClass5_295.aLong329) {
				@Pc(32) Class5 local32 = this.aClass5_295;
				this.aClass5_295 = this.aClass5_295.aClass5_337;
				return local32;
			}
			this.aClass5_295 = this.aClass5_295.aClass5_337;
		}
		this.aClass5_295 = null;
		return null;
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(JLclient!dn;Z)V")
	public void method7770(@OriginalArg(0) long arg0, @OriginalArg(1) Class5 arg1) {
		if (arg1.aClass5_338 != null) {
			arg1.method8829();
		}
		@Pc(27) Class5 local27 = this.aClass5Array1[(int) ((long) (this.anInt9280 - 1) & arg0)];
		arg1.aClass5_337 = local27;
		arg1.aClass5_338 = local27.aClass5_338;
		arg1.aClass5_338.aClass5_337 = arg1;
		arg1.aLong329 = arg0;
		arg1.aClass5_337.aClass5_338 = arg1;
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(I[Lclient!dn;)I")
	public int method7771(@OriginalArg(1) Class5[] arg0) {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt9280; local7++) {
			@Pc(13) Class5 local13 = this.aClass5Array1[local7];
			for (@Pc(16) Class5 local16 = local13.aClass5_337; local16 != local13; local16 = local16.aClass5_337) {
				arg0[local5++] = local16;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!tga", name = "d", descriptor = "(I)V")
	public void method7773() {
		for (@Pc(8) int local8 = 0; local8 < this.anInt9280; local8++) {
			@Pc(14) Class5 local14 = this.aClass5Array1[local8];
			while (true) {
				@Pc(17) Class5 local17 = local14.aClass5_337;
				if (local14 == local17) {
					break;
				}
				local17.method8829();
			}
		}
		this.aClass5_295 = null;
		this.aClass5_296 = null;
	}

	@OriginalMember(owner = "client!tga", name = "e", descriptor = "(I)I")
	public int method7775() {
		return this.anInt9280;
	}

	@OriginalMember(owner = "client!tga", name = "f", descriptor = "(I)Lclient!dn;")
	public Class5 method7777() {
		@Pc(22) Class5 local22;
		if (this.anInt9292 > 0 && this.aClass5Array1[this.anInt9292 - 1] != this.aClass5_296) {
			local22 = this.aClass5_296;
			this.aClass5_296 = local22.aClass5_337;
			return local22;
		}
		while (this.anInt9280 > this.anInt9292) {
			local22 = this.aClass5Array1[this.anInt9292++].aClass5_337;
			if (this.aClass5Array1[this.anInt9292 - 1] != local22) {
				this.aClass5_296 = local22.aClass5_337;
				return local22;
			}
		}
		return null;
	}
}
