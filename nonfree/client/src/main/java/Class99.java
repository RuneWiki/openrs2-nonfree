import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class99 {

	@OriginalMember(owner = "client!eq", name = "l", descriptor = "J")
	private long aLong75;

	@OriginalMember(owner = "client!eq", name = "p", descriptor = "Lclient!eh;")
	private Class2 aClass2_77;

	@OriginalMember(owner = "client!eq", name = "q", descriptor = "Lclient!eh;")
	private Class2 aClass2_78;

	@OriginalMember(owner = "client!eq", name = "r", descriptor = "I")
	private int anInt3336 = 0;

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "I")
	public final int anInt3326;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "[Lclient!eh;")
	public final Class2[] aClass2Array1;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(I)V")
	public Class99(@OriginalArg(0) int arg0) {
		this.anInt3326 = arg0;
		this.aClass2Array1 = new Class2[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local13] = new Class2();
			local23.aClass2_299 = local23;
			local23.aClass2_300 = local23;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)I")
	public int method3050() {
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt3326; local15++) {
			@Pc(22) Class2 local22 = this.aClass2Array1[local15];
			for (@Pc(25) Class2 local25 = local22.aClass2_299; local25 != local22; local25 = local25.aClass2_299) {
				local13++;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Z)I")
	public int method3051() {
		return this.anInt3326;
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(Z)Lclient!eh;")
	public Class2 method3052() {
		if (this.aClass2_77 == null) {
			return null;
		}
		@Pc(23) Class2 local23 = this.aClass2Array1[(int) ((long) (this.anInt3326 - 1) & this.aLong75)];
		while (this.aClass2_77 != local23) {
			if (this.aClass2_77.aLong278 == this.aLong75) {
				@Pc(41) Class2 local41 = this.aClass2_77;
				this.aClass2_77 = this.aClass2_77.aClass2_299;
				return local41;
			}
			this.aClass2_77 = this.aClass2_77.aClass2_299;
		}
		this.aClass2_77 = null;
		return null;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I[Lclient!eh;)I")
	public int method3053(@OriginalArg(1) Class2[] arg0) {
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt3326; local14++) {
			@Pc(21) Class2 local21 = this.aClass2Array1[local14];
			for (@Pc(24) Class2 local24 = local21.aClass2_299; local24 != local21; local24 = local24.aClass2_299) {
				arg0[local12++] = local24;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(JI)Lclient!eh;")
	public Class2 method3056(@OriginalArg(0) long arg0) {
		this.aLong75 = arg0;
		@Pc(20) Class2 local20 = this.aClass2Array1[(int) (arg0 & (long) (this.anInt3326 - 1))];
		for (this.aClass2_77 = local20.aClass2_299; this.aClass2_77 != local20; this.aClass2_77 = this.aClass2_77.aClass2_299) {
			if (this.aClass2_77.aLong278 == arg0) {
				@Pc(46) Class2 local46 = this.aClass2_77;
				this.aClass2_77 = this.aClass2_77.aClass2_299;
				return local46;
			}
		}
		this.aClass2_77 = null;
		return null;
	}

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "(I)V")
	public void method3057() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3326; local7++) {
			@Pc(14) Class2 local14 = this.aClass2Array1[local7];
			while (true) {
				@Pc(17) Class2 local17 = local14.aClass2_299;
				if (local17 == local14) {
					break;
				}
				local17.method9253();
			}
		}
		this.aClass2_77 = null;
		this.aClass2_78 = null;
	}

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "(I)Lclient!eh;")
	public Class2 method3058() {
		@Pc(20) Class2 local20;
		if (this.anInt3336 > 0 && this.aClass2_78 != this.aClass2Array1[this.anInt3336 - 1]) {
			local20 = this.aClass2_78;
			this.aClass2_78 = local20.aClass2_299;
			return local20;
		}
		while (this.anInt3336 < this.anInt3326) {
			local20 = this.aClass2Array1[this.anInt3336++].aClass2_299;
			if (this.aClass2Array1[this.anInt3336 - 1] != local20) {
				this.aClass2_78 = local20.aClass2_299;
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(BJLclient!eh;)V")
	public void method3059(@OriginalArg(1) long arg0, @OriginalArg(2) Class2 arg1) {
		if (arg1.aClass2_300 != null) {
			arg1.method9253();
		}
		@Pc(27) Class2 local27 = this.aClass2Array1[(int) (arg0 & (long) (this.anInt3326 - 1))];
		arg1.aClass2_299 = local27;
		arg1.aClass2_300 = local27.aClass2_300;
		arg1.aClass2_300.aClass2_299 = arg1;
		arg1.aClass2_299.aClass2_300 = arg1;
		arg1.aLong278 = arg0;
	}

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "(I)Lclient!eh;")
	public Class2 method3060() {
		this.anInt3336 = 0;
		return this.method3058();
	}
}
