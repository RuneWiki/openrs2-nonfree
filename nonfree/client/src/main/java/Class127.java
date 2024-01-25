import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ica")
public final class Class127 {

	@OriginalMember(owner = "client!ica", name = "m", descriptor = "J")
	private long aLong102;

	@OriginalMember(owner = "client!ica", name = "q", descriptor = "Lclient!jd;")
	private Class2 aClass2_131;

	@OriginalMember(owner = "client!ica", name = "s", descriptor = "Lclient!jd;")
	private Class2 aClass2_132;

	@OriginalMember(owner = "client!ica", name = "r", descriptor = "I")
	private int anInt3599 = 0;

	@OriginalMember(owner = "client!ica", name = "k", descriptor = "[Lclient!jd;")
	public final Class2[] aClass2Array1;

	@OriginalMember(owner = "client!ica", name = "l", descriptor = "I")
	public final int anInt3596;

	@OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(I)V")
	public Class127(@OriginalArg(0) int arg0) {
		this.aClass2Array1 = new Class2[arg0];
		this.anInt3596 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local13] = new Class2();
			local23.aClass2_284 = local23;
			local23.aClass2_283 = local23;
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)Lclient!jd;")
	public Class2 method3203() {
		this.anInt3599 = 0;
		return this.method3212();
	}

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "(I)V")
	public void method3204() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3596; local3++) {
			@Pc(10) Class2 local10 = this.aClass2Array1[local3];
			while (true) {
				@Pc(13) Class2 local13 = local10.aClass2_284;
				if (local13 == local10) {
					break;
				}
				local13.method7802();
			}
		}
		this.aClass2_131 = null;
		this.aClass2_132 = null;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(JZ)Lclient!jd;")
	public Class2 method3205(@OriginalArg(0) long arg0) {
		this.aLong102 = arg0;
		@Pc(20) Class2 local20 = this.aClass2Array1[(int) ((long) (this.anInt3596 - 1) & arg0)];
		for (this.aClass2_131 = local20.aClass2_284; this.aClass2_131 != local20; this.aClass2_131 = this.aClass2_131.aClass2_284) {
			if (arg0 == this.aClass2_131.aLong241) {
				@Pc(35) Class2 local35 = this.aClass2_131;
				this.aClass2_131 = this.aClass2_131.aClass2_284;
				return local35;
			}
		}
		this.aClass2_131 = null;
		return null;
	}

	@OriginalMember(owner = "client!ica", name = "c", descriptor = "(I)I")
	public int method3206() {
		return this.anInt3596;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "([Lclient!jd;I)I")
	public int method3207(@OriginalArg(0) Class2[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt3596; local9++) {
			@Pc(16) Class2 local16 = this.aClass2Array1[local9];
			for (@Pc(19) Class2 local19 = local16.aClass2_284; local19 != local16; local19 = local19.aClass2_284) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ica", name = "e", descriptor = "(I)I")
	public int method3209() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt3596; local9++) {
			@Pc(16) Class2 local16 = this.aClass2Array1[local9];
			for (@Pc(19) Class2 local19 = local16.aClass2_284; local19 != local16; local19 = local19.aClass2_284) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ica", name = "f", descriptor = "(I)Lclient!jd;")
	public Class2 method3210() {
		if (this.aClass2_131 == null) {
			return null;
		}
		@Pc(23) Class2 local23 = this.aClass2Array1[(int) ((long) (this.anInt3596 - 1) & this.aLong102)];
		while (local23 != this.aClass2_131) {
			if (this.aClass2_131.aLong241 == this.aLong102) {
				@Pc(35) Class2 local35 = this.aClass2_131;
				this.aClass2_131 = this.aClass2_131.aClass2_284;
				return local35;
			}
			this.aClass2_131 = this.aClass2_131.aClass2_284;
		}
		this.aClass2_131 = null;
		return null;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(B)Lclient!jd;")
	public Class2 method3212() {
		if (this.anInt3599 > 0 && this.aClass2Array1[this.anInt3599 - 1] != this.aClass2_132) {
			@Pc(24) Class2 local24 = this.aClass2_132;
			this.aClass2_132 = local24.aClass2_284;
			return local24;
		}
		while (this.anInt3599 < this.anInt3596) {
			@Pc(52) Class2 local52 = this.aClass2Array1[this.anInt3599++].aClass2_284;
			if (local52 != this.aClass2Array1[this.anInt3599 - 1]) {
				this.aClass2_132 = local52.aClass2_284;
				return local52;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(Lclient!jd;BJ)V")
	public void method3213(@OriginalArg(0) Class2 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass2_283 != null) {
			arg0.method7802();
		}
		@Pc(29) Class2 local29 = this.aClass2Array1[(int) (arg1 & (long) (this.anInt3596 - 1))];
		arg0.aClass2_283 = local29.aClass2_283;
		arg0.aClass2_284 = local29;
		arg0.aClass2_283.aClass2_284 = arg0;
		arg0.aLong241 = arg1;
		arg0.aClass2_284.aClass2_283 = arg0;
	}
}
