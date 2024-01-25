import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class243 {

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "Lclient!pt;")
	private Class2 aClass2_231;

	@OriginalMember(owner = "client!wb", name = "v", descriptor = "J")
	private long aLong202;

	@OriginalMember(owner = "client!wb", name = "x", descriptor = "Lclient!pt;")
	private Class2 aClass2_232;

	@OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
	private int anInt6919 = 0;

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "[Lclient!pt;")
	public final Class2[] aClass2Array1;

	@OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
	public final int anInt6914;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(I)V")
	public Class243(@OriginalArg(0) int arg0) {
		this.aClass2Array1 = new Class2[arg0];
		this.anInt6914 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local13] = new Class2();
			local23.aClass2_244 = local23;
			local23.aClass2_243 = local23;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)I")
	public int method5964() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt6914; local9++) {
			@Pc(16) Class2 local16 = this.aClass2Array1[local9];
			for (@Pc(19) Class2 local19 = local16.aClass2_244; local19 != local16; local19 = local19.aClass2_244) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)I")
	public int method5966() {
		return this.anInt6914;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IJ)Lclient!pt;")
	public Class2 method5967(@OriginalArg(1) long arg0) {
		this.aLong202 = arg0;
		@Pc(28) Class2 local28 = this.aClass2Array1[(int) (arg0 & (long) (this.anInt6914 - 1))];
		for (this.aClass2_231 = local28.aClass2_244; this.aClass2_231 != local28; this.aClass2_231 = this.aClass2_231.aClass2_244) {
			if (arg0 == this.aClass2_231.aLong213) {
				@Pc(43) Class2 local43 = this.aClass2_231;
				this.aClass2_231 = this.aClass2_231.aClass2_244;
				return local43;
			}
		}
		this.aClass2_231 = null;
		return null;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IJLclient!pt;)V")
	public void method5968(@OriginalArg(1) long arg0, @OriginalArg(2) Class2 arg1) {
		if (arg1.aClass2_243 != null) {
			arg1.method6130();
		}
		@Pc(21) Class2 local21 = this.aClass2Array1[(int) (arg0 & (long) (this.anInt6914 - 1))];
		arg1.aClass2_244 = local21;
		arg1.aClass2_243 = local21.aClass2_243;
		arg1.aClass2_243.aClass2_244 = arg1;
		arg1.aClass2_244.aClass2_243 = arg1;
		arg1.aLong213 = arg0;
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V")
	public void method5970() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6914; local3++) {
			@Pc(10) Class2 local10 = this.aClass2Array1[local3];
			while (true) {
				@Pc(13) Class2 local13 = local10.aClass2_244;
				if (local13 == local10) {
					break;
				}
				local13.method6130();
			}
		}
		this.aClass2_231 = null;
		this.aClass2_232 = null;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)Lclient!pt;")
	public Class2 method5971() {
		if (this.aClass2_231 == null) {
			return null;
		}
		@Pc(28) Class2 local28 = this.aClass2Array1[(int) ((long) (this.anInt6914 - 1) & this.aLong202)];
		while (local28 != this.aClass2_231) {
			if (this.aClass2_231.aLong213 == this.aLong202) {
				@Pc(40) Class2 local40 = this.aClass2_231;
				this.aClass2_231 = this.aClass2_231.aClass2_244;
				return local40;
			}
			this.aClass2_231 = this.aClass2_231.aClass2_244;
		}
		this.aClass2_231 = null;
		return null;
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)Lclient!pt;")
	public Class2 method5973() {
		@Pc(20) Class2 local20;
		if (this.anInt6919 > 0 && this.aClass2_232 != this.aClass2Array1[this.anInt6919 - 1]) {
			local20 = this.aClass2_232;
			this.aClass2_232 = local20.aClass2_244;
			return local20;
		}
		while (this.anInt6919 < this.anInt6914) {
			local20 = this.aClass2Array1[this.anInt6919++].aClass2_244;
			if (this.aClass2Array1[this.anInt6919 - 1] != local20) {
				this.aClass2_232 = local20.aClass2_244;
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)Lclient!pt;")
	public Class2 method5975() {
		this.anInt6919 = 0;
		return this.method5973();
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I[Lclient!pt;)I")
	public int method5977(@OriginalArg(1) Class2[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt6914; local9++) {
			@Pc(16) Class2 local16 = this.aClass2Array1[local9];
			for (@Pc(19) Class2 local19 = local16.aClass2_244; local19 != local16; local19 = local19.aClass2_244) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}
}
