import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class136 {

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "J")
	private long aLong142;

	@OriginalMember(owner = "client!gn", name = "j", descriptor = "Lclient!an;")
	private Class3 aClass3_134;

	@OriginalMember(owner = "client!gn", name = "s", descriptor = "Lclient!an;")
	private Class3 aClass3_135;

	@OriginalMember(owner = "client!gn", name = "n", descriptor = "I")
	private int anInt4267 = 0;

	@OriginalMember(owner = "client!gn", name = "g", descriptor = "I")
	public final int anInt4261;

	@OriginalMember(owner = "client!gn", name = "h", descriptor = "[Lclient!an;")
	public final Class3[] aClass3Array1;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(I)V")
	public Class136(@OriginalArg(0) int arg0) {
		this.anInt4261 = arg0;
		this.aClass3Array1 = new Class3[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class3 local23 = this.aClass3Array1[local13] = new Class3();
			local23.aClass3_341 = local23;
			local23.aClass3_342 = local23;
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(B[Lclient!an;)I")
	public int method3502(@OriginalArg(1) Class3[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt4261; local9++) {
			@Pc(16) Class3 local16 = this.aClass3Array1[local9];
			for (@Pc(19) Class3 local19 = local16.aClass3_341; local19 != local16; local19 = local19.aClass3_341) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(JZ)Lclient!an;")
	public Class3 method3503(@OriginalArg(0) long arg0) {
		this.aLong142 = arg0;
		@Pc(20) Class3 local20 = this.aClass3Array1[(int) ((long) (this.anInt4261 - 1) & arg0)];
		for (this.aClass3_134 = local20.aClass3_341; this.aClass3_134 != local20; this.aClass3_134 = this.aClass3_134.aClass3_341) {
			if (arg0 == this.aClass3_134.aLong382) {
				@Pc(43) Class3 local43 = this.aClass3_134;
				this.aClass3_134 = this.aClass3_134.aClass3_341;
				return local43;
			}
		}
		this.aClass3_134 = null;
		return null;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z)I")
	public int method3504() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt4261; local9++) {
			@Pc(16) Class3 local16 = this.aClass3Array1[local9];
			@Pc(19) Class3 local19 = local16.aClass3_341;
			while (local16 != local19) {
				local19 = local19.aClass3_341;
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)V")
	public void method3505() {
		for (@Pc(17) int local17 = 0; local17 < this.anInt4261; local17++) {
			@Pc(26) Class3 local26 = this.aClass3Array1[local17];
			while (true) {
				@Pc(29) Class3 local29 = local26.aClass3_341;
				if (local26 == local29) {
					break;
				}
				local29.method9446();
			}
		}
		this.aClass3_135 = null;
		this.aClass3_134 = null;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)Lclient!an;")
	public Class3 method3506() {
		@Pc(24) Class3 local24;
		if (this.anInt4267 > 0 && this.aClass3Array1[this.anInt4267 - 1] != this.aClass3_135) {
			local24 = this.aClass3_135;
			this.aClass3_135 = local24.aClass3_341;
			return local24;
		}
		while (this.anInt4267 < this.anInt4261) {
			local24 = this.aClass3Array1[this.anInt4267++].aClass3_341;
			if (local24 != this.aClass3Array1[this.anInt4267 - 1]) {
				this.aClass3_135 = local24.aClass3_341;
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)I")
	public int method3507() {
		return this.anInt4261;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(JLclient!an;B)V")
	public void method3508(@OriginalArg(0) long arg0, @OriginalArg(1) Class3 arg1) {
		if (arg1.aClass3_342 != null) {
			arg1.method9446();
		}
		@Pc(23) Class3 local23 = this.aClass3Array1[(int) ((long) (this.anInt4261 - 1) & arg0)];
		arg1.aClass3_342 = local23.aClass3_342;
		arg1.aClass3_341 = local23;
		arg1.aClass3_342.aClass3_341 = arg1;
		arg1.aClass3_341.aClass3_342 = arg1;
		arg1.aLong382 = arg0;
	}

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "(B)Lclient!an;")
	public Class3 method3509() {
		this.anInt4267 = 0;
		return this.method3506();
	}

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)Lclient!an;")
	public Class3 method3510() {
		if (this.aClass3_134 == null) {
			return null;
		}
		@Pc(34) Class3 local34 = this.aClass3Array1[(int) (this.aLong142 & (long) (this.anInt4261 - 1))];
		while (local34 != this.aClass3_134) {
			if (this.aClass3_134.aLong382 == this.aLong142) {
				@Pc(48) Class3 local48 = this.aClass3_134;
				this.aClass3_134 = this.aClass3_134.aClass3_341;
				return local48;
			}
			this.aClass3_134 = this.aClass3_134.aClass3_341;
		}
		this.aClass3_134 = null;
		return null;
	}
}
