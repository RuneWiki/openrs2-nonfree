import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jw")
public final class Class183 {

	@OriginalMember(owner = "client!jw", name = "e", descriptor = "J")
	private long aLong140;

	@OriginalMember(owner = "client!jw", name = "k", descriptor = "Lclient!rc;")
	private Class4 aClass4_134;

	@OriginalMember(owner = "client!jw", name = "r", descriptor = "Lclient!rc;")
	private Class4 aClass4_135;

	@OriginalMember(owner = "client!jw", name = "q", descriptor = "I")
	private int anInt5060 = 0;

	@OriginalMember(owner = "client!jw", name = "m", descriptor = "I")
	public final int anInt5057;

	@OriginalMember(owner = "client!jw", name = "b", descriptor = "[Lclient!rc;")
	public final Class4[] aClass4Array1;

	@OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(I)V")
	public Class183(@OriginalArg(0) int arg0) {
		this.anInt5057 = arg0;
		this.aClass4Array1 = new Class4[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class4 local23 = this.aClass4Array1[local13] = new Class4();
			local23.aClass4_287 = local23;
			local23.aClass4_288 = local23;
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(JLclient!rc;B)V")
	public void method4282(@OriginalArg(0) long arg0, @OriginalArg(1) Class4 arg1) {
		if (arg1.aClass4_288 != null) {
			arg1.method8013();
		}
		@Pc(21) Class4 local21 = this.aClass4Array1[(int) ((long) (this.anInt5057 - 1) & arg0)];
		arg1.aClass4_288 = local21.aClass4_288;
		arg1.aClass4_287 = local21;
		arg1.aClass4_288.aClass4_287 = arg1;
		arg1.aClass4_287.aClass4_288 = arg1;
		arg1.aLong307 = arg0;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(B)Lclient!rc;")
	public Class4 method4283() {
		@Pc(26) Class4 local26;
		if (this.anInt5060 > 0 && this.aClass4Array1[this.anInt5060 - 1] != this.aClass4_135) {
			local26 = this.aClass4_135;
			this.aClass4_135 = local26.aClass4_287;
			return local26;
		}
		while (this.anInt5057 > this.anInt5060) {
			local26 = this.aClass4Array1[this.anInt5060++].aClass4_287;
			if (this.aClass4Array1[this.anInt5060 - 1] != local26) {
				this.aClass4_135 = local26.aClass4_287;
				return local26;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "([Lclient!rc;I)I")
	public int method4284(@OriginalArg(0) Class4[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt5057; local9++) {
			@Pc(16) Class4 local16 = this.aClass4Array1[local9];
			for (@Pc(19) Class4 local19 = local16.aClass4_287; local19 != local16; local19 = local19.aClass4_287) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)Lclient!rc;")
	public Class4 method4286() {
		this.anInt5060 = 0;
		return this.method4283();
	}

	@OriginalMember(owner = "client!jw", name = "b", descriptor = "(B)V")
	public void method4287() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt5057; local11++) {
			@Pc(18) Class4 local18 = this.aClass4Array1[local11];
			while (true) {
				@Pc(21) Class4 local21 = local18.aClass4_287;
				if (local21 == local18) {
					break;
				}
				local21.method8013();
			}
		}
		this.aClass4_135 = null;
		this.aClass4_134 = null;
	}

	@OriginalMember(owner = "client!jw", name = "c", descriptor = "(B)I")
	public int method4288() {
		return this.anInt5057;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(JB)Lclient!rc;")
	public Class4 method4289(@OriginalArg(0) long arg0) {
		this.aLong140 = arg0;
		@Pc(20) Class4 local20 = this.aClass4Array1[(int) (arg0 & (long) (this.anInt5057 - 1))];
		for (this.aClass4_134 = local20.aClass4_287; this.aClass4_134 != local20; this.aClass4_134 = this.aClass4_134.aClass4_287) {
			if (arg0 == this.aClass4_134.aLong307) {
				@Pc(47) Class4 local47 = this.aClass4_134;
				this.aClass4_134 = this.aClass4_134.aClass4_287;
				return local47;
			}
		}
		this.aClass4_134 = null;
		return null;
	}

	@OriginalMember(owner = "client!jw", name = "d", descriptor = "(B)Lclient!rc;")
	public Class4 method4290() {
		if (this.aClass4_134 == null) {
			return null;
		}
		@Pc(28) Class4 local28 = this.aClass4Array1[(int) (this.aLong140 & (long) (this.anInt5057 - 1))];
		while (this.aClass4_134 != local28) {
			if (this.aLong140 == this.aClass4_134.aLong307) {
				@Pc(44) Class4 local44 = this.aClass4_134;
				this.aClass4_134 = this.aClass4_134.aClass4_287;
				return local44;
			}
			this.aClass4_134 = this.aClass4_134.aClass4_287;
		}
		this.aClass4_134 = null;
		return null;
	}

	@OriginalMember(owner = "client!jw", name = "b", descriptor = "(Z)I")
	public int method4291() {
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt5057; local17++) {
			@Pc(24) Class4 local24 = this.aClass4Array1[local17];
			for (@Pc(27) Class4 local27 = local24.aClass4_287; local27 != local24; local27 = local27.aClass4_287) {
				local15++;
			}
		}
		return local15;
	}
}
