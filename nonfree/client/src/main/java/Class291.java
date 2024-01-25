import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qha")
public final class Class291 {

	@OriginalMember(owner = "client!qha", name = "n", descriptor = "J")
	private long aLong245;

	@OriginalMember(owner = "client!qha", name = "g", descriptor = "Lclient!me;")
	private Class5 aClass5_257;

	@OriginalMember(owner = "client!qha", name = "r", descriptor = "Lclient!me;")
	private Class5 aClass5_258;

	@OriginalMember(owner = "client!qha", name = "s", descriptor = "I")
	private int anInt8128 = 0;

	@OriginalMember(owner = "client!qha", name = "o", descriptor = "I")
	public final int anInt8120;

	@OriginalMember(owner = "client!qha", name = "d", descriptor = "[Lclient!me;")
	public final Class5[] aClass5Array1;

	@OriginalMember(owner = "client!qha", name = "<init>", descriptor = "(I)V")
	public Class291(@OriginalArg(0) int arg0) {
		this.anInt8120 = arg0;
		this.aClass5Array1 = new Class5[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class5 local23 = this.aClass5Array1[local13] = new Class5();
			local23.aClass5_338 = local23;
			local23.aClass5_337 = local23;
		}
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(BJLclient!me;)V")
	public void method6984(@OriginalArg(1) long arg0, @OriginalArg(2) Class5 arg1) {
		if (arg1.aClass5_337 != null) {
			arg1.method9327(1);
		}
		@Pc(30) Class5 local30 = this.aClass5Array1[(int) (arg0 & (long) (this.anInt8120 - 1))];
		arg1.aClass5_337 = local30.aClass5_337;
		arg1.aClass5_338 = local30;
		arg1.aClass5_337.aClass5_338 = arg1;
		arg1.aLong314 = arg0;
		arg1.aClass5_338.aClass5_337 = arg1;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(I)Lclient!me;")
	public Class5 method6985(@OriginalArg(0) int arg0) {
		if (this.aClass5_257 == null) {
			return null;
		}
		@Pc(24) Class5 local24 = this.aClass5Array1[(int) ((long) (this.anInt8120 - 1) & this.aLong245)];
		while (local24 != this.aClass5_257) {
			if (this.aLong245 == this.aClass5_257.aLong314) {
				@Pc(42) Class5 local42 = this.aClass5_257;
				this.aClass5_257 = this.aClass5_257.aClass5_338;
				return local42;
			}
			this.aClass5_257 = this.aClass5_257.aClass5_338;
		}
		this.aClass5_257 = null;
		if (arg0 > -15) {
			this.method6986(91);
		}
		return null;
	}

	@OriginalMember(owner = "client!qha", name = "c", descriptor = "(I)V")
	public void method6986(@OriginalArg(0) int arg0) {
		if (arg0 >= -89) {
			Static480.aClass102_51 = null;
		}
		for (@Pc(14) int local14 = 0; local14 < this.anInt8120; local14++) {
			@Pc(23) Class5 local23 = this.aClass5Array1[local14];
			while (true) {
				@Pc(26) Class5 local26 = local23.aClass5_338;
				if (local23 == local26) {
					break;
				}
				local26.method9327(1);
			}
		}
		this.aClass5_258 = null;
		this.aClass5_257 = null;
	}

	@OriginalMember(owner = "client!qha", name = "d", descriptor = "(I)Lclient!me;")
	public Class5 method6987() {
		this.anInt8128 = 0;
		return this.method6989();
	}

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "(Z)Lclient!me;")
	public Class5 method6989() {
		@Pc(26) Class5 local26;
		if (this.anInt8128 > 0 && this.aClass5Array1[this.anInt8128 - 1] != this.aClass5_258) {
			local26 = this.aClass5_258;
			this.aClass5_258 = local26.aClass5_338;
			return local26;
		}
		while (this.anInt8120 > this.anInt8128) {
			local26 = this.aClass5Array1[this.anInt8128++].aClass5_338;
			if (this.aClass5Array1[this.anInt8128 - 1] != local26) {
				this.aClass5_258 = local26.aClass5_338;
				return local26;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(I[Lclient!me;)I")
	public int method6990(@OriginalArg(1) Class5[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt8120; local9++) {
			@Pc(16) Class5 local16 = this.aClass5Array1[local9];
			for (@Pc(19) Class5 local19 = local16.aClass5_338; local19 != local16; local19 = local19.aClass5_338) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!qha", name = "e", descriptor = "(I)I")
	public int method6992() {
		return this.anInt8120;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(JI)Lclient!me;")
	public Class5 method6993(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aLong245 = arg0;
		@Pc(20) Class5 local20 = this.aClass5Array1[(int) ((long) (this.anInt8120 - arg1) & arg0)];
		for (this.aClass5_257 = local20.aClass5_338; this.aClass5_257 != local20; this.aClass5_257 = this.aClass5_257.aClass5_338) {
			if (arg0 == this.aClass5_257.aLong314) {
				@Pc(37) Class5 local37 = this.aClass5_257;
				this.aClass5_257 = this.aClass5_257.aClass5_338;
				return local37;
			}
		}
		this.aClass5_257 = null;
		return null;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Z)I")
	public int method6995() {
		@Pc(7) int local7 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt8120; local15++) {
			@Pc(22) Class5 local22 = this.aClass5Array1[local15];
			@Pc(25) Class5 local25 = local22.aClass5_338;
			while (local22 != local25) {
				local25 = local25.aClass5_338;
				local7++;
			}
		}
		return local7;
	}
}
