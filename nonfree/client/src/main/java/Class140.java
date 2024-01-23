import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class140 {

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "J")
	private long aLong174;

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "Lclient!jg;")
	private Class1 aClass1_200;

	@OriginalMember(owner = "client!vd", name = "q", descriptor = "Lclient!jg;")
	private Class1 aClass1_201;

	@OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
	private int anInt5280 = 0;

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "[Lclient!jg;")
	public Class1[] aClass1Array1;

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
	public int anInt5276;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(I)V")
	public Class140(@OriginalArg(0) int arg0) {
		this.aClass1Array1 = new Class1[arg0];
		this.anInt5276 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_213 = local23;
			local23.aClass1_212 = local23;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)I")
	public int method4007() {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < this.anInt5276; local5++) {
			@Pc(12) Class1 local12 = this.aClass1Array1[local5];
			for (@Pc(15) Class1 local15 = local12.aClass1_213; local15 != local12; local15 = local15.aClass1_213) {
				local3++;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
	public void method4010() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5276; local3++) {
			@Pc(10) Class1 local10 = this.aClass1Array1[local3];
			while (true) {
				@Pc(13) Class1 local13 = local10.aClass1_213;
				if (local10 == local13) {
					break;
				}
				local13.method4186();
			}
		}
		this.aClass1_201 = null;
		this.aClass1_200 = null;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!jg;JI)V")
	public void method4011(@OriginalArg(0) Class1 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass1_212 != null) {
			arg0.method4186();
		}
		@Pc(21) Class1 local21 = this.aClass1Array1[(int) ((long) (this.anInt5276 - 1) & arg1)];
		arg0.aLong184 = arg1;
		arg0.aClass1_213 = local21;
		arg0.aClass1_212 = local21.aClass1_212;
		arg0.aClass1_212.aClass1_213 = arg0;
		arg0.aClass1_213.aClass1_212 = arg0;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)Lclient!jg;")
	public Class1 method4012() {
		this.anInt5280 = 0;
		return this.method4013();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)Lclient!jg;")
	public Class1 method4013() {
		@Pc(21) Class1 local21;
		if (this.anInt5280 > 0 && this.aClass1_201 != this.aClass1Array1[this.anInt5280 - 1]) {
			local21 = this.aClass1_201;
			this.aClass1_201 = local21.aClass1_213;
			return local21;
		}
		while (this.anInt5280 < this.anInt5276) {
			local21 = this.aClass1Array1[this.anInt5280++].aClass1_213;
			if (this.aClass1Array1[this.anInt5280 - 1] != local21) {
				this.aClass1_201 = local21.aClass1_213;
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IJ)Lclient!jg;")
	public Class1 method4014(@OriginalArg(1) long arg0) {
		this.aLong174 = arg0;
		@Pc(20) Class1 local20 = this.aClass1Array1[(int) ((long) (this.anInt5276 - 1) & arg0)];
		for (this.aClass1_200 = local20.aClass1_213; this.aClass1_200 != local20; this.aClass1_200 = this.aClass1_200.aClass1_213) {
			if (arg0 == this.aClass1_200.aLong184) {
				@Pc(35) Class1 local35 = this.aClass1_200;
				this.aClass1_200 = this.aClass1_200.aClass1_213;
				return local35;
			}
		}
		this.aClass1_200 = null;
		return null;
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)I")
	public int method4015() {
		return this.anInt5276;
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)Lclient!jg;")
	public Class1 method4017() {
		if (this.aClass1_200 == null) {
			return null;
		}
		@Pc(28) Class1 local28 = this.aClass1Array1[(int) (this.aLong174 & (long) (this.anInt5276 - 1))];
		while (this.aClass1_200 != local28) {
			if (this.aClass1_200.aLong184 == this.aLong174) {
				@Pc(44) Class1 local44 = this.aClass1_200;
				this.aClass1_200 = this.aClass1_200.aClass1_213;
				return local44;
			}
			this.aClass1_200 = this.aClass1_200.aClass1_213;
		}
		this.aClass1_200 = null;
		return null;
	}
}
