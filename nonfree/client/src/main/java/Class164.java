import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mt")
public final class Class164 {

	@OriginalMember(owner = "client!mt", name = "p", descriptor = "J")
	private long aLong140;

	@OriginalMember(owner = "client!mt", name = "s", descriptor = "Lclient!ea;")
	private Class7 aClass7_153;

	@OriginalMember(owner = "client!mt", name = "t", descriptor = "Lclient!ea;")
	private Class7 aClass7_154;

	@OriginalMember(owner = "client!mt", name = "u", descriptor = "I")
	private int anInt4410 = 0;

	@OriginalMember(owner = "client!mt", name = "h", descriptor = "I")
	public final int anInt4401;

	@OriginalMember(owner = "client!mt", name = "d", descriptor = "[Lclient!ea;")
	public final Class7[] aClass7Array1;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(I)V")
	public Class164(@OriginalArg(0) int arg0) {
		this.anInt4401 = arg0;
		this.aClass7Array1 = new Class7[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class7 local23 = this.aClass7Array1[local13] = new Class7();
			local23.aClass7_261 = local23;
			local23.aClass7_262 = local23;
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IJLclient!ea;)V")
	public void method3508(@OriginalArg(1) long arg0, @OriginalArg(2) Class7 arg1) {
		if (arg1.aClass7_261 != null) {
			arg1.method5802();
		}
		@Pc(26) Class7 local26 = this.aClass7Array1[(int) (arg0 & (long) (this.anInt4401 - 1))];
		arg1.aClass7_262 = local26;
		arg1.aClass7_261 = local26.aClass7_261;
		arg1.aClass7_261.aClass7_262 = arg1;
		arg1.aClass7_262.aClass7_261 = arg1;
		arg1.aLong230 = arg0;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Z)V")
	public void method3509() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4401; local7++) {
			@Pc(14) Class7 local14 = this.aClass7Array1[local7];
			while (true) {
				@Pc(17) Class7 local17 = local14.aClass7_262;
				if (local14 == local17) {
					break;
				}
				local17.method5802();
			}
		}
		this.aClass7_153 = null;
		this.aClass7_154 = null;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)Lclient!ea;")
	public Class7 method3510() {
		if (this.aClass7_153 == null) {
			return null;
		}
		@Pc(29) Class7 local29 = this.aClass7Array1[(int) (this.aLong140 & (long) (this.anInt4401 - 1))];
		while (local29 != this.aClass7_153) {
			if (this.aClass7_153.aLong230 == this.aLong140) {
				@Pc(45) Class7 local45 = this.aClass7_153;
				this.aClass7_153 = this.aClass7_153.aClass7_262;
				return local45;
			}
			this.aClass7_153 = this.aClass7_153.aClass7_262;
		}
		this.aClass7_153 = null;
		return null;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IJ)Lclient!ea;")
	public Class7 method3512(@OriginalArg(1) long arg0) {
		this.aLong140 = arg0;
		@Pc(27) Class7 local27 = this.aClass7Array1[(int) (arg0 & (long) (this.anInt4401 - 1))];
		for (this.aClass7_153 = local27.aClass7_262; this.aClass7_153 != local27; this.aClass7_153 = this.aClass7_153.aClass7_262) {
			if (arg0 == this.aClass7_153.aLong230) {
				@Pc(42) Class7 local42 = this.aClass7_153;
				this.aClass7_153 = this.aClass7_153.aClass7_262;
				return local42;
			}
		}
		this.aClass7_153 = null;
		return null;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(I[Lclient!ea;)I")
	public int method3513(@OriginalArg(1) Class7[] arg0) {
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt4401; local17++) {
			@Pc(24) Class7 local24 = this.aClass7Array1[local17];
			for (@Pc(27) Class7 local27 = local24.aClass7_262; local27 != local24; local27 = local27.aClass7_262) {
				arg0[local15++] = local27;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "(I)Lclient!ea;")
	public Class7 method3514() {
		this.anInt4410 = 0;
		return this.method3519();
	}

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "(I)I")
	public int method3515() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt4401; local9++) {
			@Pc(16) Class7 local16 = this.aClass7Array1[local9];
			@Pc(19) Class7 local19 = local16.aClass7_262;
			while (local16 != local19) {
				local19 = local19.aClass7_262;
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "(B)Lclient!ea;")
	public Class7 method3519() {
		@Pc(25) Class7 local25;
		if (this.anInt4410 > 0 && this.aClass7Array1[this.anInt4410 - 1] != this.aClass7_154) {
			local25 = this.aClass7_154;
			this.aClass7_154 = local25.aClass7_262;
			return local25;
		}
		while (this.anInt4401 > this.anInt4410) {
			local25 = this.aClass7Array1[this.anInt4410++].aClass7_262;
			if (local25 != this.aClass7Array1[this.anInt4410 - 1]) {
				this.aClass7_154 = local25.aClass7_262;
				return local25;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mt", name = "d", descriptor = "(I)I")
	public int method3520() {
		return this.anInt4401;
	}
}
