import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class221 {

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "J")
	private long aLong173;

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "Lclient!tv;")
	private Class4 aClass4_171;

	@OriginalMember(owner = "client!mo", name = "t", descriptor = "Lclient!tv;")
	private Class4 aClass4_172;

	@OriginalMember(owner = "client!mo", name = "u", descriptor = "I")
	private int anInt6442 = 0;

	@OriginalMember(owner = "client!mo", name = "o", descriptor = "[Lclient!tv;")
	public final Class4[] aClass4Array1;

	@OriginalMember(owner = "client!mo", name = "m", descriptor = "I")
	public final int anInt6437;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(I)V")
	public Class221(@OriginalArg(0) int arg0) {
		this.aClass4Array1 = new Class4[arg0];
		this.anInt6437 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class4 local23 = this.aClass4Array1[local13] = new Class4();
			local23.aClass4_285 = local23;
			local23.aClass4_286 = local23;
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)Lclient!tv;")
	public Class4 method5067() {
		if (this.aClass4_171 == null) {
			return null;
		}
		@Pc(23) Class4 local23 = this.aClass4Array1[(int) ((long) (this.anInt6437 - 1) & this.aLong173)];
		while (local23 != this.aClass4_171) {
			if (this.aLong173 == this.aClass4_171.aLong295) {
				@Pc(39) Class4 local39 = this.aClass4_171;
				this.aClass4_171 = this.aClass4_171.aClass4_286;
				return local39;
			}
			this.aClass4_171 = this.aClass4_171.aClass4_286;
		}
		this.aClass4_171 = null;
		return null;
	}

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "(B)I")
	public int method5070() {
		@Pc(7) int local7 = 0;
		for (@Pc(16) int local16 = 0; local16 < this.anInt6437; local16++) {
			@Pc(23) Class4 local23 = this.aClass4Array1[local16];
			@Pc(26) Class4 local26 = local23.aClass4_286;
			while (local23 != local26) {
				local26 = local26.aClass4_286;
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)Lclient!tv;")
	public Class4 method5071() {
		@Pc(24) Class4 local24;
		if (this.anInt6442 > 0 && this.aClass4Array1[this.anInt6442 - 1] != this.aClass4_172) {
			local24 = this.aClass4_172;
			this.aClass4_172 = local24.aClass4_286;
			return local24;
		}
		while (this.anInt6437 > this.anInt6442) {
			local24 = this.aClass4Array1[this.anInt6442++].aClass4_286;
			if (this.aClass4Array1[this.anInt6442 - 1] != local24) {
				this.aClass4_172 = local24.aClass4_286;
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)Lclient!tv;")
	public Class4 method5072() {
		this.anInt6442 = 0;
		return this.method5071();
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!tv;JZ)V")
	public void method5073(@OriginalArg(0) Class4 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass4_285 != null) {
			arg0.method8193();
		}
		@Pc(26) Class4 local26 = this.aClass4Array1[(int) ((long) (this.anInt6437 - 1) & arg1)];
		arg0.aClass4_285 = local26.aClass4_285;
		arg0.aClass4_286 = local26;
		arg0.aClass4_285.aClass4_286 = arg0;
		arg0.aLong295 = arg1;
		arg0.aClass4_286.aClass4_285 = arg0;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(B[Lclient!tv;)I")
	public int method5074(@OriginalArg(1) Class4[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt6437; local9++) {
			@Pc(16) Class4 local16 = this.aClass4Array1[local9];
			for (@Pc(19) Class4 local19 = local16.aClass4_286; local19 != local16; local19 = local19.aClass4_286) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IJ)Lclient!tv;")
	public Class4 method5075(@OriginalArg(1) long arg0) {
		this.aLong173 = arg0;
		@Pc(20) Class4 local20 = this.aClass4Array1[(int) ((long) (this.anInt6437 - 1) & arg0)];
		for (this.aClass4_171 = local20.aClass4_286; this.aClass4_171 != local20; this.aClass4_171 = this.aClass4_171.aClass4_286) {
			if (arg0 == this.aClass4_171.aLong295) {
				@Pc(35) Class4 local35 = this.aClass4_171;
				this.aClass4_171 = this.aClass4_171.aClass4_286;
				return local35;
			}
		}
		this.aClass4_171 = null;
		return null;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)I")
	public int method5077() {
		return this.anInt6437;
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(I)V")
	public void method5078() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6437; local7++) {
			@Pc(21) Class4 local21 = this.aClass4Array1[local7];
			while (true) {
				@Pc(24) Class4 local24 = local21.aClass4_286;
				if (local21 == local24) {
					break;
				}
				local24.method8193();
			}
		}
		this.aClass4_171 = null;
		this.aClass4_172 = null;
	}
}
