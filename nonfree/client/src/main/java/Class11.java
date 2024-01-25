import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class11 {

	@OriginalMember(owner = "client!an", name = "j", descriptor = "Lclient!qg;")
	private Class3 aClass3_11;

	@OriginalMember(owner = "client!an", name = "o", descriptor = "J")
	private long aLong8;

	@OriginalMember(owner = "client!an", name = "u", descriptor = "Lclient!qg;")
	private Class3 aClass3_12;

	@OriginalMember(owner = "client!an", name = "s", descriptor = "I")
	private int anInt406 = 0;

	@OriginalMember(owner = "client!an", name = "h", descriptor = "[Lclient!qg;")
	public final Class3[] aClass3Array1;

	@OriginalMember(owner = "client!an", name = "e", descriptor = "I")
	public final int anInt397;

	static {
		new Class189("Ok", "Okay", "OK", "Ok");
	}

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(I)V")
	public Class11(@OriginalArg(0) int arg0) {
		this.aClass3Array1 = new Class3[arg0];
		this.anInt397 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class3 local23 = this.aClass3Array1[local13] = new Class3();
			local23.aClass3_261 = local23;
			local23.aClass3_262 = local23;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V")
	public void method312() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt397; local1++) {
			@Pc(7) Class3 local7 = this.aClass3Array1[local1];
			while (true) {
				@Pc(10) Class3 local10 = local7.aClass3_261;
				if (local10 == local7) {
					break;
				}
				local10.method5977();
			}
		}
		this.aClass3_12 = null;
		this.aClass3_11 = null;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(B)Lclient!qg;")
	public Class3 method313() {
		this.anInt406 = 0;
		return this.method316();
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Z[Lclient!qg;)I")
	public int method314(@OriginalArg(1) Class3[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt397; local14++) {
			@Pc(21) Class3 local21 = this.aClass3Array1[local14];
			for (@Pc(24) Class3 local24 = local21.aClass3_261; local24 != local21; local24 = local24.aClass3_261) {
				arg0[local7++] = local24;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(B)I")
	public int method315() {
		return this.anInt397;
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(I)Lclient!qg;")
	public Class3 method316() {
		@Pc(22) Class3 local22;
		if (this.anInt406 > 0 && this.aClass3_12 != this.aClass3Array1[this.anInt406 - 1]) {
			local22 = this.aClass3_12;
			this.aClass3_12 = local22.aClass3_261;
			return local22;
		}
		while (this.anInt406 < this.anInt397) {
			local22 = this.aClass3Array1[this.anInt406++].aClass3_261;
			if (local22 != this.aClass3Array1[this.anInt406 - 1]) {
				this.aClass3_12 = local22.aClass3_261;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(B)Lclient!qg;")
	public Class3 method318() {
		if (this.aClass3_11 == null) {
			return null;
		}
		@Pc(27) Class3 local27 = this.aClass3Array1[(int) ((long) (this.anInt397 - 1) & this.aLong8)];
		while (this.aClass3_11 != local27) {
			if (this.aLong8 == this.aClass3_11.aLong234) {
				@Pc(38) Class3 local38 = this.aClass3_11;
				this.aClass3_11 = this.aClass3_11.aClass3_261;
				return local38;
			}
			this.aClass3_11 = this.aClass3_11.aClass3_261;
		}
		this.aClass3_11 = null;
		return null;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!qg;JI)V")
	public void method319(@OriginalArg(0) Class3 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass3_262 != null) {
			arg0.method5977();
		}
		@Pc(29) Class3 local29 = this.aClass3Array1[(int) ((long) (this.anInt397 - 1) & arg1)];
		arg0.aClass3_261 = local29;
		arg0.aClass3_262 = local29.aClass3_262;
		arg0.aClass3_262.aClass3_261 = arg0;
		arg0.aLong234 = arg1;
		arg0.aClass3_261.aClass3_262 = arg0;
	}

	@OriginalMember(owner = "client!an", name = "d", descriptor = "(I)I")
	public int method322() {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt397; local7++) {
			@Pc(13) Class3 local13 = this.aClass3Array1[local7];
			for (@Pc(16) Class3 local16 = local13.aClass3_261; local16 != local13; local16 = local16.aClass3_261) {
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(BJ)Lclient!qg;")
	public Class3 method324(@OriginalArg(1) long arg0) {
		this.aLong8 = arg0;
		@Pc(26) Class3 local26 = this.aClass3Array1[(int) (arg0 & (long) (this.anInt397 - 1))];
		for (this.aClass3_11 = local26.aClass3_261; this.aClass3_11 != local26; this.aClass3_11 = this.aClass3_11.aClass3_261) {
			if (this.aClass3_11.aLong234 == arg0) {
				@Pc(44) Class3 local44 = this.aClass3_11;
				this.aClass3_11 = this.aClass3_11.aClass3_261;
				return local44;
			}
		}
		this.aClass3_11 = null;
		return null;
	}
}
