import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class196 {

	@OriginalMember(owner = "client!qo", name = "j", descriptor = "Lclient!vg;")
	private Class4 aClass4_194;

	@OriginalMember(owner = "client!qo", name = "q", descriptor = "J")
	private long aLong174;

	@OriginalMember(owner = "client!qo", name = "u", descriptor = "Lclient!vg;")
	private Class4 aClass4_195;

	@OriginalMember(owner = "client!qo", name = "t", descriptor = "I")
	private int anInt5810 = 0;

	@OriginalMember(owner = "client!qo", name = "m", descriptor = "[Lclient!vg;")
	public final Class4[] aClass4Array1;

	@OriginalMember(owner = "client!qo", name = "o", descriptor = "I")
	public final int anInt5807;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(I)V")
	public Class196(@OriginalArg(0) int arg0) {
		this.aClass4Array1 = new Class4[arg0];
		this.anInt5807 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class4 local23 = this.aClass4Array1[local13] = new Class4();
			local23.aClass4_262 = local23;
			local23.aClass4_261 = local23;
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
	public void method4471() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5807; local3++) {
			@Pc(10) Class4 local10 = this.aClass4Array1[local3];
			while (true) {
				@Pc(13) Class4 local13 = local10.aClass4_261;
				if (local10 == local13) {
					break;
				}
				local13.method5854();
			}
		}
		this.aClass4_194 = null;
		this.aClass4_195 = null;
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)Lclient!vg;")
	public Class4 method4472() {
		@Pc(30) Class4 local30;
		if (this.anInt5810 > 0 && this.aClass4_195 != this.aClass4Array1[this.anInt5810 - 1]) {
			local30 = this.aClass4_195;
			this.aClass4_195 = local30.aClass4_261;
			return local30;
		}
		while (this.anInt5807 > this.anInt5810) {
			local30 = this.aClass4Array1[this.anInt5810++].aClass4_261;
			if (this.aClass4Array1[this.anInt5810 - 1] != local30) {
				this.aClass4_195 = local30.aClass4_261;
				return local30;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)I")
	public int method4473() {
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt5807; local14++) {
			@Pc(21) Class4 local21 = this.aClass4Array1[local14];
			for (@Pc(24) Class4 local24 = local21.aClass4_261; local24 != local21; local24 = local24.aClass4_261) {
				local12++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(JILclient!vg;)V")
	public void method4474(@OriginalArg(0) long arg0, @OriginalArg(2) Class4 arg1) {
		if (arg1.aClass4_262 != null) {
			arg1.method5854();
		}
		@Pc(21) Class4 local21 = this.aClass4Array1[(int) ((long) (this.anInt5807 - 1) & arg0)];
		arg1.aClass4_261 = local21;
		arg1.aClass4_262 = local21.aClass4_262;
		arg1.aClass4_262.aClass4_261 = arg1;
		arg1.aLong225 = arg0;
		arg1.aClass4_261.aClass4_262 = arg1;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Z)I")
	public int method4476() {
		return this.anInt5807;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(JI)Lclient!vg;")
	public Class4 method4477(@OriginalArg(0) long arg0) {
		this.aLong174 = arg0;
		@Pc(20) Class4 local20 = this.aClass4Array1[(int) (arg0 & (long) (this.anInt5807 - 1))];
		for (this.aClass4_194 = local20.aClass4_261; this.aClass4_194 != local20; this.aClass4_194 = this.aClass4_194.aClass4_261) {
			if (arg0 == this.aClass4_194.aLong225) {
				@Pc(39) Class4 local39 = this.aClass4_194;
				this.aClass4_194 = this.aClass4_194.aClass4_261;
				return local39;
			}
		}
		this.aClass4_194 = null;
		return null;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(B[Lclient!vg;)I")
	public int method4478(@OriginalArg(1) Class4[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt5807; local14++) {
			@Pc(21) Class4 local21 = this.aClass4Array1[local14];
			for (@Pc(24) Class4 local24 = local21.aClass4_261; local24 != local21; local24 = local24.aClass4_261) {
				arg0[local7++] = local24;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(B)Lclient!vg;")
	public Class4 method4479() {
		if (this.aClass4_194 == null) {
			return null;
		}
		@Pc(30) Class4 local30 = this.aClass4Array1[(int) ((long) (this.anInt5807 - 1) & this.aLong174)];
		while (this.aClass4_194 != local30) {
			if (this.aClass4_194.aLong225 == this.aLong174) {
				@Pc(42) Class4 local42 = this.aClass4_194;
				this.aClass4_194 = this.aClass4_194.aClass4_261;
				return local42;
			}
			this.aClass4_194 = this.aClass4_194.aClass4_261;
		}
		this.aClass4_194 = null;
		return null;
	}

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "(I)Lclient!vg;")
	public Class4 method4482() {
		this.anInt5810 = 0;
		return this.method4472();
	}
}
