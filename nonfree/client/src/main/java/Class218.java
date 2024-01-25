import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lba")
public final class Class218 {

	@OriginalMember(owner = "client!lba", name = "s", descriptor = "Lclient!hh;")
	private Class2 aClass2_169;

	@OriginalMember(owner = "client!lba", name = "t", descriptor = "J")
	private long aLong173;

	@OriginalMember(owner = "client!lba", name = "h", descriptor = "Lclient!hh;")
	private Class2 aClass2_170;

	@OriginalMember(owner = "client!lba", name = "k", descriptor = "I")
	private int anInt5663 = 0;

	@OriginalMember(owner = "client!lba", name = "e", descriptor = "I")
	public final int anInt5661;

	@OriginalMember(owner = "client!lba", name = "i", descriptor = "[Lclient!hh;")
	public final Class2[] aClass2Array1;

	@OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(I)V")
	public Class218(@OriginalArg(0) int arg0) {
		this.anInt5661 = arg0;
		this.aClass2Array1 = new Class2[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local13] = new Class2();
			local23.aClass2_346 = local23;
			local23.aClass2_345 = local23;
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)I")
	public int method5089() {
		return this.anInt5661;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "([Lclient!hh;I)I")
	public int method5091(@OriginalArg(0) Class2[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt5661; local9++) {
			@Pc(16) Class2 local16 = this.aClass2Array1[local9];
			for (@Pc(19) Class2 local19 = local16.aClass2_345; local19 != local16; local19 = local19.aClass2_345) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!lba", name = "d", descriptor = "(I)Lclient!hh;")
	public Class2 method5092() {
		this.anInt5663 = 0;
		return this.method5096();
	}

	@OriginalMember(owner = "client!lba", name = "e", descriptor = "(I)I")
	public int method5094() {
		@Pc(7) int local7 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt5661; local18++) {
			@Pc(25) Class2 local25 = this.aClass2Array1[local18];
			@Pc(28) Class2 local28 = local25.aClass2_345;
			while (local28 != local25) {
				local28 = local28.aClass2_345;
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(JI)Lclient!hh;")
	public Class2 method5095(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aLong173 = arg0;
		@Pc(20) Class2 local20 = this.aClass2Array1[(int) ((long) (this.anInt5661 - 1) & arg0)];
		for (this.aClass2_169 = local20.aClass2_345; this.aClass2_169 != local20; this.aClass2_169 = this.aClass2_169.aClass2_345) {
			if (arg0 == this.aClass2_169.aLong352) {
				@Pc(37) Class2 local37 = this.aClass2_169;
				this.aClass2_169 = this.aClass2_169.aClass2_345;
				return local37;
			}
		}
		if (arg1 == 0) {
			this.aClass2_169 = null;
			return null;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "(I)Lclient!hh;")
	public Class2 method5096() {
		@Pc(26) Class2 local26;
		if (this.anInt5663 > 0 && this.aClass2Array1[this.anInt5663 - 1] != this.aClass2_170) {
			local26 = this.aClass2_170;
			this.aClass2_170 = local26.aClass2_345;
			return local26;
		}
		while (this.anInt5663 < this.anInt5661) {
			local26 = this.aClass2Array1[this.anInt5663++].aClass2_345;
			if (this.aClass2Array1[this.anInt5663 - 1] != local26) {
				this.aClass2_170 = local26.aClass2_345;
				return local26;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "(B)V")
	public void method5097() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5661; local7++) {
			@Pc(16) Class2 local16 = this.aClass2Array1[local7];
			while (true) {
				@Pc(19) Class2 local19 = local16.aClass2_345;
				if (local19 == local16) {
					break;
				}
				local19.method9872();
			}
		}
		this.aClass2_170 = null;
		this.aClass2_169 = null;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(ILclient!hh;J)V")
	public void method5099(@OriginalArg(1) Class2 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass2_346 != null) {
			arg0.method9872();
		}
		@Pc(23) Class2 local23 = this.aClass2Array1[(int) (arg1 & (long) (this.anInt5661 - 1))];
		arg0.aClass2_345 = local23;
		arg0.aClass2_346 = local23.aClass2_346;
		arg0.aClass2_346.aClass2_345 = arg0;
		arg0.aClass2_345.aClass2_346 = arg0;
		arg0.aLong352 = arg1;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(B)Lclient!hh;")
	public Class2 method5100(@OriginalArg(0) byte arg0) {
		if (this.aClass2_169 == null) {
			return null;
		}
		@Pc(24) Class2 local24 = this.aClass2Array1[(int) ((long) (this.anInt5661 - 1) & this.aLong173)];
		while (local24 != this.aClass2_169) {
			if (this.aLong173 == this.aClass2_169.aLong352) {
				@Pc(38) Class2 local38 = this.aClass2_169;
				this.aClass2_169 = this.aClass2_169.aClass2_345;
				return local38;
			}
			this.aClass2_169 = this.aClass2_169.aClass2_345;
		}
		if (arg0 < 58) {
			Static354.method5093(26);
		}
		this.aClass2_169 = null;
		return null;
	}
}
