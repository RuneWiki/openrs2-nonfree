import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class30 {

	@OriginalMember(owner = "client!ge", name = "o", descriptor = "Lclient!jd;")
	private Class1 aClass1_91;

	@OriginalMember(owner = "client!ge", name = "p", descriptor = "J")
	private long aLong56;

	@OriginalMember(owner = "client!ge", name = "B", descriptor = "Lclient!jd;")
	private Class1 aClass1_92;

	@OriginalMember(owner = "client!ge", name = "C", descriptor = "I")
	private int anInt1957 = 0;

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
	private final int anInt1943;

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "[Lclient!jd;")
	private final Class1[] aClass1Array1;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(I)V")
	public Class30(@OriginalArg(0) int arg0) {
		this.anInt1943 = arg0;
		this.aClass1Array1 = new Class1[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_213 = local23;
			local23.aClass1_214 = local23;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)I")
	public int method1463() {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < this.anInt1943; local5++) {
			@Pc(12) Class1 local12 = this.aClass1Array1[local5];
			for (@Pc(15) Class1 local15 = local12.aClass1_213; local15 != local12; local15 = local15.aClass1_213) {
				local3++;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!jd;J)V")
	public void method1464(@OriginalArg(1) Class1 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass1_214 != null) {
			arg0.method3499();
		}
		@Pc(21) Class1 local21 = this.aClass1Array1[(int) ((long) (this.anInt1943 - 1) & arg1)];
		arg0.aClass1_214 = local21.aClass1_214;
		arg0.aClass1_213 = local21;
		arg0.aClass1_214.aClass1_213 = arg0;
		arg0.aLong147 = arg1;
		arg0.aClass1_213.aClass1_214 = arg0;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I[Lclient!jd;)I")
	public int method1465(@OriginalArg(1) Class1[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt1943; local14++) {
			@Pc(21) Class1 local21 = this.aClass1Array1[local14];
			for (@Pc(24) Class1 local24 = local21.aClass1_213; local24 != local21; local24 = local24.aClass1_213) {
				arg0[local7++] = local24;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)Lclient!jd;")
	public Class1 method1466() {
		if (this.aClass1_91 == null) {
			return null;
		}
		@Pc(21) Class1 local21 = this.aClass1Array1[(int) (this.aLong56 & (long) (this.anInt1943 - 1))];
		while (local21 != this.aClass1_91) {
			if (this.aLong56 == this.aClass1_91.aLong147) {
				@Pc(32) Class1 local32 = this.aClass1_91;
				this.aClass1_91 = this.aClass1_91.aClass1_213;
				return local32;
			}
			this.aClass1_91 = this.aClass1_91.aClass1_213;
		}
		this.aClass1_91 = null;
		return null;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(JB)Lclient!jd;")
	public Class1 method1467(@OriginalArg(0) long arg0) {
		this.aLong56 = arg0;
		@Pc(18) Class1 local18 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt1943 - 1))];
		for (this.aClass1_91 = local18.aClass1_213; this.aClass1_91 != local18; this.aClass1_91 = this.aClass1_91.aClass1_213) {
			if (arg0 == this.aClass1_91.aLong147) {
				@Pc(40) Class1 local40 = this.aClass1_91;
				this.aClass1_91 = this.aClass1_91.aClass1_213;
				return local40;
			}
		}
		this.aClass1_91 = null;
		return null;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)Lclient!jd;")
	public Class1 method1470() {
		this.anInt1957 = 0;
		return this.method1473();
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)Lclient!jd;")
	public Class1 method1473() {
		@Pc(24) Class1 local24;
		if (this.anInt1957 > 0 && this.aClass1_92 != this.aClass1Array1[this.anInt1957 - 1]) {
			local24 = this.aClass1_92;
			this.aClass1_92 = local24.aClass1_213;
			return local24;
		}
		while (this.anInt1957 < this.anInt1943) {
			local24 = this.aClass1Array1[this.anInt1957++].aClass1_213;
			if (local24 != this.aClass1Array1[this.anInt1957 - 1]) {
				this.aClass1_92 = local24.aClass1_213;
				return local24;
			}
		}
		return null;
	}
}
