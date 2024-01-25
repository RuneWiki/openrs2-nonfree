import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class354 {

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "J")
	private long aLong265;

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "Lclient!gga;")
	private Class3 aClass3_279;

	@OriginalMember(owner = "client!wa", name = "s", descriptor = "Lclient!gga;")
	private Class3 aClass3_280;

	@OriginalMember(owner = "client!wa", name = "r", descriptor = "I")
	private int anInt9288 = 0;

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
	public final int anInt9285;

	@OriginalMember(owner = "client!wa", name = "p", descriptor = "[Lclient!gga;")
	public final Class3[] aClass3Array1;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(I)V")
	public Class354(@OriginalArg(0) int arg0) {
		this.anInt9285 = arg0;
		this.aClass3Array1 = new Class3[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class3 local23 = this.aClass3Array1[local13] = new Class3();
			local23.aClass3_285 = local23;
			local23.aClass3_286 = local23;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
	public void method7687() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9285; local3++) {
			@Pc(10) Class3 local10 = this.aClass3Array1[local3];
			while (true) {
				@Pc(13) Class3 local13 = local10.aClass3_286;
				if (local10 == local13) {
					break;
				}
				local13.method7825();
			}
		}
		this.aClass3_280 = null;
		this.aClass3_279 = null;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)I")
	public int method7688() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt9285; local9++) {
			@Pc(16) Class3 local16 = this.aClass3Array1[local9];
			for (@Pc(19) Class3 local19 = local16.aClass3_286; local19 != local16; local19 = local19.aClass3_286) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(JI)Lclient!gga;")
	public Class3 method7689(@OriginalArg(0) long arg0) {
		this.aLong265 = arg0;
		@Pc(20) Class3 local20 = this.aClass3Array1[(int) (arg0 & (long) (this.anInt9285 - 1))];
		for (this.aClass3_279 = local20.aClass3_286; this.aClass3_279 != local20; this.aClass3_279 = this.aClass3_279.aClass3_286) {
			if (arg0 == this.aClass3_279.aLong273) {
				@Pc(35) Class3 local35 = this.aClass3_279;
				this.aClass3_279 = this.aClass3_279.aClass3_286;
				return local35;
			}
		}
		this.aClass3_279 = null;
		return null;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZLclient!gga;J)V")
	public void method7691(@OriginalArg(1) Class3 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass3_285 != null) {
			arg0.method7825();
		}
		@Pc(27) Class3 local27 = this.aClass3Array1[(int) (arg1 & (long) (this.anInt9285 - 1))];
		arg0.aClass3_285 = local27.aClass3_285;
		arg0.aClass3_286 = local27;
		arg0.aClass3_285.aClass3_286 = arg0;
		arg0.aClass3_286.aClass3_285 = arg0;
		arg0.aLong273 = arg1;
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)Lclient!gga;")
	public Class3 method7692() {
		@Pc(19) Class3 local19;
		if (this.anInt9288 > 0 && this.aClass3_280 != this.aClass3Array1[this.anInt9288 - 1]) {
			local19 = this.aClass3_280;
			this.aClass3_280 = local19.aClass3_286;
			return local19;
		}
		while (this.anInt9288 < this.anInt9285) {
			local19 = this.aClass3Array1[this.anInt9288++].aClass3_286;
			if (this.aClass3Array1[this.anInt9288 - 1] != local19) {
				this.aClass3_280 = local19.aClass3_286;
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)Lclient!gga;")
	public Class3 method7693() {
		if (this.aClass3_279 == null) {
			return null;
		}
		@Pc(28) Class3 local28 = this.aClass3Array1[(int) ((long) (this.anInt9285 - 1) & this.aLong265)];
		while (this.aClass3_279 != local28) {
			if (this.aClass3_279.aLong273 == this.aLong265) {
				@Pc(40) Class3 local40 = this.aClass3_279;
				this.aClass3_279 = this.aClass3_279.aClass3_286;
				return local40;
			}
			this.aClass3_279 = this.aClass3_279.aClass3_286;
		}
		this.aClass3_279 = null;
		return null;
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)Lclient!gga;")
	public Class3 method7694() {
		this.anInt9288 = 0;
		return this.method7692();
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "([Lclient!gga;B)I")
	public int method7695(@OriginalArg(0) Class3[] arg0) {
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt9285; local15++) {
			@Pc(22) Class3 local22 = this.aClass3Array1[local15];
			for (@Pc(25) Class3 local25 = local22.aClass3_286; local25 != local22; local25 = local25.aClass3_286) {
				arg0[local13++] = local25;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "(I)I")
	public int method7697() {
		return this.anInt9285;
	}
}
