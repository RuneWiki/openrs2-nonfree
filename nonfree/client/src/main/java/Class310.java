import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class310 {

	@OriginalMember(owner = "client!sl", name = "f", descriptor = "Lclient!iga;")
	private Class3 aClass3_243;

	@OriginalMember(owner = "client!sl", name = "r", descriptor = "J")
	private long aLong224;

	@OriginalMember(owner = "client!sl", name = "u", descriptor = "Lclient!iga;")
	private Class3 aClass3_244;

	@OriginalMember(owner = "client!sl", name = "t", descriptor = "I")
	private int anInt7836 = 0;

	@OriginalMember(owner = "client!sl", name = "n", descriptor = "I")
	public final int anInt7832;

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "[Lclient!iga;")
	public final Class3[] aClass3Array1;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(I)V")
	public Class310(@OriginalArg(0) int arg0) {
		this.anInt7832 = arg0;
		this.aClass3Array1 = new Class3[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class3 local23 = this.aClass3Array1[local13] = new Class3();
			local23.aClass3_285 = local23;
			local23.aClass3_286 = local23;
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)I")
	public int method6598() {
		return this.anInt7832;
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)Lclient!iga;")
	public Class3 method6599() {
		@Pc(24) Class3 local24;
		if (this.anInt7836 > 0 && this.aClass3_244 != this.aClass3Array1[this.anInt7836 - 1]) {
			local24 = this.aClass3_244;
			this.aClass3_244 = local24.aClass3_285;
			return local24;
		}
		while (this.anInt7832 > this.anInt7836) {
			local24 = this.aClass3Array1[this.anInt7836++].aClass3_285;
			if (this.aClass3Array1[this.anInt7836 - 1] != local24) {
				this.aClass3_244 = local24.aClass3_285;
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)Lclient!iga;")
	public Class3 method6600() {
		if (this.aClass3_243 == null) {
			return null;
		}
		@Pc(23) Class3 local23 = this.aClass3Array1[(int) (this.aLong224 & (long) (this.anInt7832 - 1))];
		while (this.aClass3_243 != local23) {
			if (this.aClass3_243.aLong273 == this.aLong224) {
				@Pc(39) Class3 local39 = this.aClass3_243;
				this.aClass3_243 = this.aClass3_243.aClass3_285;
				return local39;
			}
			this.aClass3_243 = this.aClass3_243.aClass3_285;
		}
		this.aClass3_243 = null;
		return null;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(JI)Lclient!iga;")
	public Class3 method6601(@OriginalArg(0) long arg0) {
		this.aLong224 = arg0;
		@Pc(26) Class3 local26 = this.aClass3Array1[(int) ((long) (this.anInt7832 - 1) & arg0)];
		for (this.aClass3_243 = local26.aClass3_285; this.aClass3_243 != local26; this.aClass3_243 = this.aClass3_243.aClass3_285) {
			if (arg0 == this.aClass3_243.aLong273) {
				@Pc(45) Class3 local45 = this.aClass3_243;
				this.aClass3_243 = this.aClass3_243.aClass3_285;
				return local45;
			}
		}
		this.aClass3_243 = null;
		return null;
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(B)Lclient!iga;")
	public Class3 method6602() {
		this.anInt7836 = 0;
		return this.method6599();
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!iga;JB)V")
	public void method6603(@OriginalArg(0) Class3 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass3_286 != null) {
			arg0.method7812();
		}
		@Pc(23) Class3 local23 = this.aClass3Array1[(int) ((long) (this.anInt7832 - 1) & arg1)];
		arg0.aClass3_286 = local23.aClass3_286;
		arg0.aClass3_285 = local23;
		arg0.aClass3_286.aClass3_285 = arg0;
		arg0.aLong273 = arg1;
		arg0.aClass3_285.aClass3_286 = arg0;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I[Lclient!iga;)I")
	public int method6604(@OriginalArg(1) Class3[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt7832; local9++) {
			@Pc(19) Class3 local19 = this.aClass3Array1[local9];
			for (@Pc(22) Class3 local22 = local19.aClass3_285; local22 != local19; local22 = local22.aClass3_285) {
				arg0[local7++] = local22;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "(B)V")
	public void method6605() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7832; local7++) {
			@Pc(14) Class3 local14 = this.aClass3Array1[local7];
			while (true) {
				@Pc(17) Class3 local17 = local14.aClass3_285;
				if (local14 == local17) {
					break;
				}
				local17.method7812();
			}
		}
		this.aClass3_243 = null;
		this.aClass3_244 = null;
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(I)I")
	public int method6608() {
		@Pc(7) int local7 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt7832; local14++) {
			@Pc(21) Class3 local21 = this.aClass3Array1[local14];
			@Pc(24) Class3 local24 = local21.aClass3_285;
			while (local24 != local21) {
				local24 = local24.aClass3_285;
				local7++;
			}
		}
		return local7;
	}
}
