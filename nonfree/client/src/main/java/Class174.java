import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class174 {

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "Lclient!kp;")
	private Class1 aClass1_162;

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "J")
	private long aLong136;

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "Lclient!kp;")
	private Class1 aClass1_163;

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
	private int anInt5192 = 0;

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "[Lclient!kp;")
	public final Class1[] aClass1Array1;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
	public final int anInt5180;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(I)V")
	public Class174(@OriginalArg(0) int arg0) {
		this.aClass1Array1 = new Class1[arg0];
		this.anInt5180 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_283 = local23;
			local23.aClass1_284 = local23;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!kp;J)V")
	public void method4420(@OriginalArg(1) Class1 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass1_284 != null) {
			arg0.method7983();
		}
		@Pc(29) Class1 local29 = this.aClass1Array1[(int) ((long) (this.anInt5180 - 1) & arg1)];
		arg0.aClass1_283 = local29;
		arg0.aClass1_284 = local29.aClass1_284;
		arg0.aClass1_284.aClass1_283 = arg0;
		arg0.aClass1_283.aClass1_284 = arg0;
		arg0.aLong244 = arg1;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)Lclient!kp;")
	public Class1 method4421() {
		this.anInt5192 = 0;
		return this.method4429();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(JZ)Lclient!kp;")
	public Class1 method4422(@OriginalArg(0) long arg0) {
		this.aLong136 = arg0;
		@Pc(18) Class1 local18 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt5180 - 1))];
		for (this.aClass1_162 = local18.aClass1_283; this.aClass1_162 != local18; this.aClass1_162 = this.aClass1_162.aClass1_283) {
			if (arg0 == this.aClass1_162.aLong244) {
				@Pc(36) Class1 local36 = this.aClass1_162;
				this.aClass1_162 = this.aClass1_162.aClass1_283;
				return local36;
			}
		}
		this.aClass1_162 = null;
		return null;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
	public void method4423() {
		for (@Pc(5) int local5 = 0; local5 < this.anInt5180; local5++) {
			@Pc(11) Class1 local11 = this.aClass1Array1[local5];
			while (true) {
				@Pc(14) Class1 local14 = local11.aClass1_283;
				if (local11 == local14) {
					break;
				}
				local14.method7983();
			}
		}
		this.aClass1_162 = null;
		this.aClass1_163 = null;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)Lclient!kp;")
	public Class1 method4424() {
		if (this.aClass1_162 == null) {
			return null;
		}
		@Pc(29) Class1 local29 = this.aClass1Array1[(int) (this.aLong136 & (long) (this.anInt5180 - 1))];
		while (local29 != this.aClass1_162) {
			if (this.aLong136 == this.aClass1_162.aLong244) {
				@Pc(40) Class1 local40 = this.aClass1_162;
				this.aClass1_162 = this.aClass1_162.aClass1_283;
				return local40;
			}
			this.aClass1_162 = this.aClass1_162.aClass1_283;
		}
		this.aClass1_162 = null;
		return null;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)I")
	public int method4426() {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt5180; local7++) {
			@Pc(13) Class1 local13 = this.aClass1Array1[local7];
			for (@Pc(16) Class1 local16 = local13.aClass1_283; local16 != local13; local16 = local16.aClass1_283) {
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z[Lclient!kp;)I")
	public int method4427(@OriginalArg(1) Class1[] arg0) {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt5180; local7++) {
			@Pc(19) Class1 local19 = this.aClass1Array1[local7];
			for (@Pc(22) Class1 local22 = local19.aClass1_283; local22 != local19; local22 = local22.aClass1_283) {
				arg0[local5++] = local22;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)I")
	public int method4428() {
		return this.anInt5180;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)Lclient!kp;")
	public Class1 method4429() {
		@Pc(22) Class1 local22;
		if (this.anInt5192 > 0 && this.aClass1Array1[this.anInt5192 - 1] != this.aClass1_163) {
			local22 = this.aClass1_163;
			this.aClass1_163 = local22.aClass1_283;
			return local22;
		}
		while (this.anInt5192 < this.anInt5180) {
			local22 = this.aClass1Array1[this.anInt5192++].aClass1_283;
			if (local22 != this.aClass1Array1[this.anInt5192 - 1]) {
				this.aClass1_163 = local22.aClass1_283;
				return local22;
			}
		}
		return null;
	}
}
