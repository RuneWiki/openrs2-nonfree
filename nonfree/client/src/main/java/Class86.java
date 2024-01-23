import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class Class86 {

	@OriginalMember(owner = "client!il", name = "f", descriptor = "J")
	private long aLong85;

	@OriginalMember(owner = "client!il", name = "q", descriptor = "Lclient!ak;")
	private Class1 aClass1_95;

	@OriginalMember(owner = "client!il", name = "v", descriptor = "Lclient!ak;")
	private Class1 aClass1_96;

	@OriginalMember(owner = "client!il", name = "u", descriptor = "I")
	private int anInt2422 = 0;

	@OriginalMember(owner = "client!il", name = "o", descriptor = "I")
	public int anInt2418;

	@OriginalMember(owner = "client!il", name = "p", descriptor = "[Lclient!ak;")
	public Class1[] aClass1Array1;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(I)V")
	public Class86(@OriginalArg(0) int arg0) {
		this.anInt2418 = arg0;
		this.aClass1Array1 = new Class1[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(29) Class1 local29 = this.aClass1Array1[local13] = new Class1();
			local29.aClass1_234 = local29;
			local29.aClass1_235 = local29;
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(I)Lclient!ak;")
	public Class1 method2134() {
		this.anInt2422 = 0;
		return this.method2141();
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)I")
	public int method2135() {
		@Pc(3) int local3 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt2418; local9++) {
			@Pc(22) Class1 local22 = this.aClass1Array1[local9];
			@Pc(25) Class1 local25 = local22.aClass1_235;
			while (local25 != local22) {
				local25 = local25.aClass1_235;
				local3++;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(JI)Lclient!ak;")
	public Class1 method2136(@OriginalArg(0) long arg0) {
		this.aLong85 = arg0;
		@Pc(16) Class1 local16 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt2418 - 1))];
		for (this.aClass1_95 = local16.aClass1_235; this.aClass1_95 != local16; this.aClass1_95 = this.aClass1_95.aClass1_235) {
			if (this.aClass1_95.aLong210 == arg0) {
				@Pc(49) Class1 local49 = this.aClass1_95;
				this.aClass1_95 = this.aClass1_95.aClass1_235;
				return local49;
			}
		}
		this.aClass1_95 = null;
		return null;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(I[Lclient!ak;)I")
	public int method2137(@OriginalArg(1) Class1[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt2418; local9++) {
			@Pc(24) Class1 local24 = this.aClass1Array1[local9];
			for (@Pc(27) Class1 local27 = local24.aClass1_235; local27 != local24; local27 = local27.aClass1_235) {
				arg0[local7++] = local27;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(Z)V")
	public void method2138() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2418; local3++) {
			@Pc(16) Class1 local16 = this.aClass1Array1[local3];
			while (true) {
				@Pc(19) Class1 local19 = local16.aClass1_235;
				if (local16 == local19) {
					break;
				}
				local19.method4573();
			}
		}
		this.aClass1_95 = null;
		this.aClass1_96 = null;
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(I)I")
	public int method2139() {
		return this.anInt2418;
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(I)Lclient!ak;")
	public Class1 method2141() {
		@Pc(28) Class1 local28;
		if (this.anInt2422 > 0 && this.aClass1_96 != this.aClass1Array1[this.anInt2422 - 1]) {
			local28 = this.aClass1_96;
			this.aClass1_96 = local28.aClass1_235;
			return local28;
		}
		do {
			if (this.anInt2422 >= this.anInt2418) {
				return null;
			}
			local28 = this.aClass1Array1[this.anInt2422++].aClass1_235;
		} while (local28 == this.aClass1Array1[this.anInt2422 - 1]);
		this.aClass1_96 = local28.aClass1_235;
		return local28;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ZLclient!ak;J)V")
	public void method2144(@OriginalArg(1) Class1 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass1_234 != null) {
			arg0.method4573();
		}
		@Pc(21) Class1 local21 = this.aClass1Array1[(int) (arg1 & (long) (this.anInt2418 - 1))];
		arg0.aClass1_234 = local21.aClass1_234;
		arg0.aClass1_235 = local21;
		arg0.aLong210 = arg1;
		arg0.aClass1_234.aClass1_235 = arg0;
		arg0.aClass1_235.aClass1_234 = arg0;
	}

	@OriginalMember(owner = "client!il", name = "e", descriptor = "(I)Lclient!ak;")
	public Class1 method2146() {
		if (this.aClass1_95 == null) {
			return null;
		}
		@Pc(24) Class1 local24 = this.aClass1Array1[(int) ((long) (this.anInt2418 - 1) & this.aLong85)];
		while (this.aClass1_95 != local24) {
			if (this.aClass1_95.aLong210 == this.aLong85) {
				@Pc(42) Class1 local42 = this.aClass1_95;
				this.aClass1_95 = this.aClass1_95.aClass1_235;
				return local42;
			}
			this.aClass1_95 = this.aClass1_95.aClass1_235;
		}
		this.aClass1_95 = null;
		return null;
	}
}
