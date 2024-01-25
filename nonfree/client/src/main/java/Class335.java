import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class335 {

	@OriginalMember(owner = "client!si", name = "e", descriptor = "J")
	private long aLong264;

	@OriginalMember(owner = "client!si", name = "j", descriptor = "Lclient!it;")
	private Class2 aClass2_268;

	@OriginalMember(owner = "client!si", name = "t", descriptor = "Lclient!it;")
	private Class2 aClass2_269;

	@OriginalMember(owner = "client!si", name = "u", descriptor = "I")
	private int anInt9533 = 0;

	@OriginalMember(owner = "client!si", name = "p", descriptor = "I")
	public final int anInt9530;

	@OriginalMember(owner = "client!si", name = "i", descriptor = "[Lclient!it;")
	public final Class2[] aClass2Array1;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(I)V")
	public Class335(@OriginalArg(0) int arg0) {
		this.anInt9530 = arg0;
		this.aClass2Array1 = new Class2[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local13] = new Class2();
			local23.aClass2_338 = local23;
			local23.aClass2_337 = local23;
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I)Lclient!it;")
	public Class2 method8352() {
		if (this.aClass2_268 == null) {
			return null;
		}
		@Pc(27) Class2 local27 = this.aClass2Array1[(int) ((long) (this.anInt9530 - 1) & this.aLong264)];
		while (this.aClass2_268 != local27) {
			if (this.aLong264 == this.aClass2_268.aLong313) {
				@Pc(38) Class2 local38 = this.aClass2_268;
				this.aClass2_268 = this.aClass2_268.aClass2_338;
				return local38;
			}
			this.aClass2_268 = this.aClass2_268.aClass2_338;
		}
		this.aClass2_268 = null;
		return null;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
	public void method8353() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt9530; local1++) {
			@Pc(7) Class2 local7 = this.aClass2Array1[local1];
			while (true) {
				@Pc(10) Class2 local10 = local7.aClass2_338;
				if (local7 == local10) {
					break;
				}
				local10.method9825();
			}
		}
		this.aClass2_269 = null;
		this.aClass2_268 = null;
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(I)I")
	public int method8354() {
		return this.anInt9530;
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(I)Lclient!it;")
	public Class2 method8355() {
		@Pc(19) Class2 local19;
		if (this.anInt9533 > 0 && this.aClass2_269 != this.aClass2Array1[this.anInt9533 - 1]) {
			local19 = this.aClass2_269;
			this.aClass2_269 = local19.aClass2_338;
			return local19;
		}
		while (this.anInt9530 > this.anInt9533) {
			local19 = this.aClass2Array1[this.anInt9533++].aClass2_338;
			if (this.aClass2Array1[this.anInt9533 - 1] != local19) {
				this.aClass2_269 = local19.aClass2_338;
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ZLclient!it;J)V")
	public void method8356(@OriginalArg(1) Class2 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass2_337 != null) {
			arg0.method9825();
		}
		@Pc(27) Class2 local27 = this.aClass2Array1[(int) ((long) (this.anInt9530 - 1) & arg1)];
		arg0.aClass2_337 = local27.aClass2_337;
		arg0.aClass2_338 = local27;
		arg0.aClass2_337.aClass2_338 = arg0;
		arg0.aClass2_338.aClass2_337 = arg0;
		arg0.aLong313 = arg1;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(JI)Lclient!it;")
	public Class2 method8357(@OriginalArg(0) long arg0) {
		this.aLong264 = arg0;
		@Pc(18) Class2 local18 = this.aClass2Array1[(int) ((long) (this.anInt9530 - 1) & arg0)];
		for (this.aClass2_268 = local18.aClass2_338; this.aClass2_268 != local18; this.aClass2_268 = this.aClass2_268.aClass2_338) {
			if (this.aClass2_268.aLong313 == arg0) {
				@Pc(32) Class2 local32 = this.aClass2_268;
				this.aClass2_268 = this.aClass2_268.aClass2_338;
				return local32;
			}
		}
		this.aClass2_268 = null;
		return null;
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(B)Lclient!it;")
	public Class2 method8358() {
		this.anInt9533 = 0;
		return this.method8355();
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I[Lclient!it;)I")
	public int method8360(@OriginalArg(1) Class2[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt9530; local9++) {
			@Pc(16) Class2 local16 = this.aClass2Array1[local9];
			for (@Pc(19) Class2 local19 = local16.aClass2_338; local19 != local16; local19 = local19.aClass2_338) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!si", name = "e", descriptor = "(I)I")
	public int method8361() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt9530; local9++) {
			@Pc(22) Class2 local22 = this.aClass2Array1[local9];
			@Pc(25) Class2 local25 = local22.aClass2_338;
			while (local25 != local22) {
				local25 = local25.aClass2_338;
				local7++;
			}
		}
		return local7;
	}
}
