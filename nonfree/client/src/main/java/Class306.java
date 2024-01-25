import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class306 {

	@OriginalMember(owner = "client!qr", name = "m", descriptor = "J")
	private long aLong232;

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "Lclient!ac;")
	private Class5 aClass5_257;

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "Lclient!ac;")
	private Class5 aClass5_258;

	@OriginalMember(owner = "client!qr", name = "q", descriptor = "I")
	private int anInt8031 = 0;

	@OriginalMember(owner = "client!qr", name = "g", descriptor = "[Lclient!ac;")
	public final Class5[] aClass5Array1;

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
	public final int anInt8020;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(I)V")
	public Class306(@OriginalArg(0) int arg0) {
		this.aClass5Array1 = new Class5[arg0];
		this.anInt8020 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class5 local23 = this.aClass5Array1[local13] = new Class5();
			local23.aClass5_337 = local23;
			local23.aClass5_338 = local23;
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)V")
	public void method6936() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt8020; local15++) {
			@Pc(24) Class5 local24 = this.aClass5Array1[local15];
			while (true) {
				@Pc(27) Class5 local27 = local24.aClass5_338;
				if (local24 == local27) {
					break;
				}
				local27.method9222();
			}
		}
		this.aClass5_258 = null;
		this.aClass5_257 = null;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)I")
	public int method6937() {
		return this.anInt8020;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(I[Lclient!ac;)I")
	public int method6938(@OriginalArg(1) Class5[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt8020; local9++) {
			@Pc(25) Class5 local25 = this.aClass5Array1[local9];
			for (@Pc(28) Class5 local28 = local25.aClass5_338; local28 != local25; local28 = local28.aClass5_338) {
				arg0[local7++] = local28;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(B)I")
	public int method6939() {
		@Pc(7) int local7 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt8020; local15++) {
			@Pc(22) Class5 local22 = this.aClass5Array1[local15];
			for (@Pc(25) Class5 local25 = local22.aClass5_338; local25 != local22; local25 = local25.aClass5_338) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)Lclient!ac;")
	public Class5 method6940() {
		@Pc(26) Class5 local26;
		if (this.anInt8031 > 0 && this.aClass5_258 != this.aClass5Array1[this.anInt8031 - 1]) {
			local26 = this.aClass5_258;
			this.aClass5_258 = local26.aClass5_338;
			return local26;
		}
		while (this.anInt8031 < this.anInt8020) {
			local26 = this.aClass5Array1[this.anInt8031++].aClass5_338;
			if (this.aClass5Array1[this.anInt8031 - 1] != local26) {
				this.aClass5_258 = local26.aClass5_338;
				return local26;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "(I)Lclient!ac;")
	public Class5 method6941() {
		this.anInt8031 = 0;
		return this.method6940();
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BJ)Lclient!ac;")
	public Class5 method6943(@OriginalArg(1) long arg0) {
		this.aLong232 = arg0;
		@Pc(28) Class5 local28 = this.aClass5Array1[(int) ((long) (this.anInt8020 - 1) & arg0)];
		for (this.aClass5_257 = local28.aClass5_338; this.aClass5_257 != local28; this.aClass5_257 = this.aClass5_257.aClass5_338) {
			if (this.aClass5_257.aLong312 == arg0) {
				@Pc(45) Class5 local45 = this.aClass5_257;
				this.aClass5_257 = this.aClass5_257.aClass5_338;
				return local45;
			}
		}
		this.aClass5_257 = null;
		return null;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!ac;JI)V")
	public void method6944(@OriginalArg(0) Class5 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		if (arg0.aClass5_337 != null) {
			arg0.method9222();
		}
		if (arg2 != -12002) {
			return;
		}
		@Pc(28) Class5 local28 = this.aClass5Array1[(int) (arg1 & (long) (this.anInt8020 - 1))];
		arg0.aClass5_337 = local28.aClass5_337;
		arg0.aClass5_338 = local28;
		arg0.aClass5_337.aClass5_338 = arg0;
		arg0.aClass5_338.aClass5_337 = arg0;
		arg0.aLong312 = arg1;
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(Z)Lclient!ac;")
	public Class5 method6945() {
		if (this.aClass5_257 == null) {
			return null;
		}
		@Pc(24) Class5 local24 = this.aClass5Array1[(int) ((long) (this.anInt8020 - 1) & this.aLong232)];
		while (local24 != this.aClass5_257) {
			if (this.aLong232 == this.aClass5_257.aLong312) {
				@Pc(42) Class5 local42 = this.aClass5_257;
				this.aClass5_257 = this.aClass5_257.aClass5_338;
				return local42;
			}
			this.aClass5_257 = this.aClass5_257.aClass5_338;
		}
		this.aClass5_257 = null;
		if (false) {
			this.method6944((Class5) null, 77L, 11);
		}
		return null;
	}
}
