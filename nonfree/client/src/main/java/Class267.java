import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class267 {

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "J")
	private long aLong245;

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "Lclient!uj;")
	private Class3 aClass3_241;

	@OriginalMember(owner = "client!sd", name = "t", descriptor = "Lclient!uj;")
	private Class3 aClass3_242;

	@OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
	private int anInt8042 = 0;

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
	public final int anInt8036;

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "[Lclient!uj;")
	public final Class3[] aClass3Array1;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(I)V")
	public Class267(@OriginalArg(0) int arg0) {
		this.anInt8036 = arg0;
		this.aClass3Array1 = new Class3[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class3 local23 = this.aClass3Array1[local13] = new Class3();
			local23.aClass3_284 = local23;
			local23.aClass3_283 = local23;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I[Lclient!uj;)I")
	public int method6639(@OriginalArg(1) Class3[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt8036; local9++) {
			@Pc(16) Class3 local16 = this.aClass3Array1[local9];
			for (@Pc(19) Class3 local19 = local16.aClass3_284; local19 != local16; local19 = local19.aClass3_284) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLclient!uj;J)V")
	public void method6640(@OriginalArg(1) Class3 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass3_283 != null) {
			arg0.method7820();
		}
		@Pc(25) Class3 local25 = this.aClass3Array1[(int) ((long) (this.anInt8036 - 1) & arg1)];
		arg0.aClass3_283 = local25.aClass3_283;
		arg0.aClass3_284 = local25;
		arg0.aClass3_283.aClass3_284 = arg0;
		arg0.aClass3_284.aClass3_283 = arg0;
		arg0.aLong285 = arg1;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)I")
	public int method6641() {
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt8036; local14++) {
			@Pc(21) Class3 local21 = this.aClass3Array1[local14];
			for (@Pc(24) Class3 local24 = local21.aClass3_284; local24 != local21; local24 = local24.aClass3_284) {
				local12++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)Lclient!uj;")
	public Class3 method6643() {
		this.anInt8042 = 0;
		return this.method6650();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BJ)Lclient!uj;")
	public Class3 method6644(@OriginalArg(1) long arg0) {
		this.aLong245 = arg0;
		@Pc(25) Class3 local25 = this.aClass3Array1[(int) ((long) (this.anInt8036 - 1) & arg0)];
		for (this.aClass3_241 = local25.aClass3_284; this.aClass3_241 != local25; this.aClass3_241 = this.aClass3_241.aClass3_284) {
			if (this.aClass3_241.aLong285 == arg0) {
				@Pc(40) Class3 local40 = this.aClass3_241;
				this.aClass3_241 = this.aClass3_241.aClass3_284;
				return local40;
			}
		}
		this.aClass3_241 = null;
		return null;
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)Lclient!uj;")
	public Class3 method6646() {
		if (this.aClass3_241 == null) {
			return null;
		}
		@Pc(28) Class3 local28 = this.aClass3Array1[(int) (this.aLong245 & (long) (this.anInt8036 - 1))];
		while (local28 != this.aClass3_241) {
			if (this.aLong245 == this.aClass3_241.aLong285) {
				@Pc(40) Class3 local40 = this.aClass3_241;
				this.aClass3_241 = this.aClass3_241.aClass3_284;
				return local40;
			}
			this.aClass3_241 = this.aClass3_241.aClass3_284;
		}
		this.aClass3_241 = null;
		return null;
	}

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "(I)V")
	public void method6648() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt8036; local7++) {
			@Pc(14) Class3 local14 = this.aClass3Array1[local7];
			while (true) {
				@Pc(17) Class3 local17 = local14.aClass3_284;
				if (local17 == local14) {
					break;
				}
				local17.method7820();
			}
		}
		this.aClass3_241 = null;
		this.aClass3_242 = null;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)I")
	public int method6649() {
		return this.anInt8036;
	}

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "(I)Lclient!uj;")
	public Class3 method6650() {
		@Pc(21) Class3 local21;
		if (this.anInt8042 > 0 && this.aClass3Array1[this.anInt8042 - 1] != this.aClass3_242) {
			local21 = this.aClass3_242;
			this.aClass3_242 = local21.aClass3_284;
			return local21;
		}
		while (this.anInt8036 > this.anInt8042) {
			local21 = this.aClass3Array1[this.anInt8042++].aClass3_284;
			if (this.aClass3Array1[this.anInt8042 - 1] != local21) {
				this.aClass3_242 = local21.aClass3_284;
				return local21;
			}
		}
		return null;
	}
}
