import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class83 {

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "J")
	private long aLong82;

	@OriginalMember(owner = "client!ee", name = "r", descriptor = "Lclient!dba;")
	private Class3 aClass3_99;

	@OriginalMember(owner = "client!ee", name = "s", descriptor = "Lclient!dba;")
	private Class3 aClass3_100;

	@OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
	private int anInt2587 = 0;

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
	public final int anInt2576;

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "[Lclient!dba;")
	public final Class3[] aClass3Array1;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(I)V")
	public Class83(@OriginalArg(0) int arg0) {
		this.anInt2576 = arg0;
		this.aClass3Array1 = new Class3[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class3 local23 = this.aClass3Array1[local13] = new Class3();
			local23.aClass3_338 = local23;
			local23.aClass3_337 = local23;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I[Lclient!dba;)I")
	public int method2367(@OriginalArg(1) Class3[] arg0) {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2576; local7++) {
			@Pc(13) Class3 local13 = this.aClass3Array1[local7];
			for (@Pc(16) Class3 local16 = local13.aClass3_337; local16 != local13; local16 = local16.aClass3_337) {
				arg0[local5++] = local16;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(JI)Lclient!dba;")
	public Class3 method2368(@OriginalArg(0) long arg0) {
		this.aLong82 = arg0;
		@Pc(18) Class3 local18 = this.aClass3Array1[(int) (arg0 & (long) (this.anInt2576 - 1))];
		for (this.aClass3_99 = local18.aClass3_337; this.aClass3_99 != local18; this.aClass3_99 = this.aClass3_99.aClass3_337) {
			if (arg0 == this.aClass3_99.aLong311) {
				@Pc(41) Class3 local41 = this.aClass3_99;
				this.aClass3_99 = this.aClass3_99.aClass3_337;
				return local41;
			}
		}
		this.aClass3_99 = null;
		return null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)Lclient!dba;")
	public Class3 method2370() {
		@Pc(30) Class3 local30;
		if (this.anInt2587 > 0 && this.aClass3_100 != this.aClass3Array1[this.anInt2587 - 1]) {
			local30 = this.aClass3_100;
			this.aClass3_100 = local30.aClass3_337;
			return local30;
		}
		while (this.anInt2587 < this.anInt2576) {
			local30 = this.aClass3Array1[this.anInt2587++].aClass3_337;
			if (local30 != this.aClass3Array1[this.anInt2587 - 1]) {
				this.aClass3_100 = local30.aClass3_337;
				return local30;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)I")
	public int method2371() {
		return this.anInt2576;
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)Lclient!dba;")
	public Class3 method2373() {
		if (this.aClass3_99 == null) {
			return null;
		}
		@Pc(28) Class3 local28 = this.aClass3Array1[(int) ((long) (this.anInt2576 - 1) & this.aLong82)];
		while (local28 != this.aClass3_99) {
			if (this.aClass3_99.aLong311 == this.aLong82) {
				@Pc(44) Class3 local44 = this.aClass3_99;
				this.aClass3_99 = this.aClass3_99.aClass3_337;
				return local44;
			}
			this.aClass3_99 = this.aClass3_99.aClass3_337;
		}
		this.aClass3_99 = null;
		return null;
	}

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)V")
	public void method2374() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2576; local3++) {
			@Pc(10) Class3 local10 = this.aClass3Array1[local3];
			while (true) {
				@Pc(13) Class3 local13 = local10.aClass3_337;
				if (local13 == local10) {
					break;
				}
				local13.method9380();
			}
		}
		this.aClass3_100 = null;
		this.aClass3_99 = null;
	}

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)Lclient!dba;")
	public Class3 method2375() {
		this.anInt2587 = 0;
		return this.method2370();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(JLclient!dba;I)V")
	public void method2377(@OriginalArg(0) long arg0, @OriginalArg(1) Class3 arg1) {
		if (arg1.aClass3_338 != null) {
			arg1.method9380();
		}
		@Pc(21) Class3 local21 = this.aClass3Array1[(int) ((long) (this.anInt2576 - 1) & arg0)];
		arg1.aClass3_337 = local21;
		arg1.aClass3_338 = local21.aClass3_338;
		arg1.aClass3_338.aClass3_337 = arg1;
		arg1.aLong311 = arg0;
		arg1.aClass3_337.aClass3_338 = arg1;
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(B)I")
	public int method2378() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt2576; local9++) {
			@Pc(16) Class3 local16 = this.aClass3Array1[local9];
			for (@Pc(19) Class3 local19 = local16.aClass3_337; local19 != local16; local19 = local19.aClass3_337) {
				local7++;
			}
		}
		return local7;
	}
}
