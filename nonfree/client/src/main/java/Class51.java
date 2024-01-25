import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cv")
public final class Class51 {

	@OriginalMember(owner = "client!cv", name = "k", descriptor = "J")
	private long aLong38;

	@OriginalMember(owner = "client!cv", name = "n", descriptor = "Lclient!oo;")
	private Class1 aClass1_44;

	@OriginalMember(owner = "client!cv", name = "r", descriptor = "Lclient!oo;")
	private Class1 aClass1_45;

	@OriginalMember(owner = "client!cv", name = "u", descriptor = "I")
	private int anInt1111 = 0;

	@OriginalMember(owner = "client!cv", name = "c", descriptor = "I")
	public final int anInt1098;

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "[Lclient!oo;")
	public final Class1[] aClass1Array1;

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(I)V")
	public Class51(@OriginalArg(0) int arg0) {
		this.anInt1098 = arg0;
		this.aClass1Array1 = new Class1[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_261 = local23;
			local23.aClass1_262 = local23;
		}
	}

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "(I)V")
	public void method921() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1098; local3++) {
			@Pc(10) Class1 local10 = this.aClass1Array1[local3];
			while (true) {
				@Pc(13) Class1 local13 = local10.aClass1_262;
				if (local10 == local13) {
					break;
				}
				local13.method5965();
			}
		}
		this.aClass1_44 = null;
		this.aClass1_45 = null;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "([Lclient!oo;B)I")
	public int method923(@OriginalArg(0) Class1[] arg0) {
		@Pc(5) int local5 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt1098; local14++) {
			@Pc(20) Class1 local20 = this.aClass1Array1[local14];
			for (@Pc(23) Class1 local23 = local20.aClass1_262; local23 != local20; local23 = local23.aClass1_262) {
				arg0[local5++] = local23;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!cv", name = "c", descriptor = "(I)I")
	public int method924() {
		return this.anInt1098;
	}

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "(I)Lclient!oo;")
	public Class1 method925() {
		if (this.aClass1_44 == null) {
			return null;
		}
		@Pc(23) Class1 local23 = this.aClass1Array1[(int) (this.aLong38 & (long) (this.anInt1098 - 1))];
		while (this.aClass1_44 != local23) {
			if (this.aClass1_44.aLong237 == this.aLong38) {
				@Pc(35) Class1 local35 = this.aClass1_44;
				this.aClass1_44 = this.aClass1_44.aClass1_262;
				return local35;
			}
			this.aClass1_44 = this.aClass1_44.aClass1_262;
		}
		this.aClass1_44 = null;
		return null;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)Lclient!oo;")
	public Class1 method926() {
		@Pc(21) Class1 local21;
		if (this.anInt1111 > 0 && this.aClass1Array1[this.anInt1111 - 1] != this.aClass1_45) {
			local21 = this.aClass1_45;
			this.aClass1_45 = local21.aClass1_262;
			return local21;
		}
		while (this.anInt1111 < this.anInt1098) {
			local21 = this.aClass1Array1[this.anInt1111++].aClass1_262;
			if (this.aClass1Array1[this.anInt1111 - 1] != local21) {
				this.aClass1_45 = local21.aClass1_262;
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cv", name = "e", descriptor = "(I)I")
	public int method927() {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1098; local7++) {
			@Pc(13) Class1 local13 = this.aClass1Array1[local7];
			for (@Pc(16) Class1 local16 = local13.aClass1_262; local16 != local13; local16 = local16.aClass1_262) {
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!cv", name = "f", descriptor = "(I)Lclient!oo;")
	public Class1 method928() {
		this.anInt1111 = 0;
		return this.method926();
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IJ)Lclient!oo;")
	public Class1 method930(@OriginalArg(1) long arg0) {
		this.aLong38 = arg0;
		@Pc(18) Class1 local18 = this.aClass1Array1[(int) ((long) (this.anInt1098 - 1) & arg0)];
		for (this.aClass1_44 = local18.aClass1_262; this.aClass1_44 != local18; this.aClass1_44 = this.aClass1_44.aClass1_262) {
			if (this.aClass1_44.aLong237 == arg0) {
				@Pc(39) Class1 local39 = this.aClass1_44;
				this.aClass1_44 = this.aClass1_44.aClass1_262;
				return local39;
			}
		}
		this.aClass1_44 = null;
		return null;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(ILclient!oo;J)V")
	public void method931(@OriginalArg(1) Class1 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass1_261 != null) {
			arg0.method5965();
		}
		@Pc(29) Class1 local29 = this.aClass1Array1[(int) (arg1 & (long) (this.anInt1098 - 1))];
		arg0.aClass1_261 = local29.aClass1_261;
		arg0.aClass1_262 = local29;
		arg0.aClass1_261.aClass1_262 = arg0;
		arg0.aClass1_262.aClass1_261 = arg0;
		arg0.aLong237 = arg1;
	}
}
