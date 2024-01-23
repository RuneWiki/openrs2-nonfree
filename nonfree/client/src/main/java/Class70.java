import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class70 {

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "Lclient!im;")
	private Class1 aClass1_120;

	@OriginalMember(owner = "client!ik", name = "q", descriptor = "J")
	private long aLong101;

	@OriginalMember(owner = "client!ik", name = "w", descriptor = "Lclient!im;")
	private Class1 aClass1_121;

	@OriginalMember(owner = "client!ik", name = "v", descriptor = "I")
	private int anInt2622 = 0;

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "[Lclient!im;")
	public Class1[] aClass1Array1;

	@OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
	public int anInt2613;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(I)V")
	public Class70(@OriginalArg(0) int arg0) {
		this.aClass1Array1 = new Class1[arg0];
		this.anInt2613 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(25) Class1 local25 = this.aClass1Array1[local13] = new Class1();
			local25.aClass1_230 = local25;
			local25.aClass1_231 = local25;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)Lclient!im;")
	public Class1 method2074() {
		this.anInt2622 = 0;
		return this.method2079();
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IJ)Lclient!im;")
	public Class1 method2075(@OriginalArg(1) long arg0) {
		this.aLong101 = arg0;
		@Pc(16) Class1 local16 = this.aClass1Array1[(int) ((long) (this.anInt2613 - 1) & arg0)];
		for (this.aClass1_120 = local16.aClass1_231; this.aClass1_120 != local16; this.aClass1_120 = this.aClass1_120.aClass1_231) {
			if (this.aClass1_120.aLong205 == arg0) {
				@Pc(50) Class1 local50 = this.aClass1_120;
				this.aClass1_120 = this.aClass1_120.aClass1_231;
				return local50;
			}
		}
		this.aClass1_120 = null;
		return null;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)I")
	public int method2077() {
		return this.anInt2613;
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)I")
	public int method2078() {
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt2613; local17++) {
			@Pc(26) Class1 local26 = this.aClass1Array1[local17];
			for (@Pc(29) Class1 local29 = local26.aClass1_231; local29 != local26; local29 = local29.aClass1_231) {
				local15++;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)Lclient!im;")
	public Class1 method2079() {
		@Pc(23) Class1 local23;
		if (this.anInt2622 > 0 && this.aClass1_121 != this.aClass1Array1[this.anInt2622 - 1]) {
			local23 = this.aClass1_121;
			this.aClass1_121 = local23.aClass1_231;
			return local23;
		}
		do {
			if (this.anInt2622 >= this.anInt2613) {
				return null;
			}
			local23 = this.aClass1Array1[this.anInt2622++].aClass1_231;
		} while (local23 == this.aClass1Array1[this.anInt2622 - 1]);
		this.aClass1_121 = local23.aClass1_231;
		return local23;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "([Lclient!im;B)I")
	public int method2081(@OriginalArg(0) Class1[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt2613; local17++) {
			@Pc(30) Class1 local30 = this.aClass1Array1[local17];
			for (@Pc(33) Class1 local33 = local30.aClass1_231; local33 != local30; local33 = local33.aClass1_231) {
				arg0[local7++] = local33;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V")
	public void method2082() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2613; local3++) {
			@Pc(20) Class1 local20 = this.aClass1Array1[local3];
			while (true) {
				@Pc(23) Class1 local23 = local20.aClass1_231;
				if (local20 == local23) {
					break;
				}
				local23.method4441();
			}
		}
		this.aClass1_121 = null;
		this.aClass1_120 = null;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(JLclient!im;I)V")
	public void method2084(@OriginalArg(0) long arg0, @OriginalArg(1) Class1 arg1) {
		if (arg1.aClass1_230 != null) {
			arg1.method4441();
		}
		@Pc(18) Class1 local18 = this.aClass1Array1[(int) ((long) (this.anInt2613 - 1) & arg0)];
		arg1.aClass1_230 = local18.aClass1_230;
		arg1.aLong205 = arg0;
		arg1.aClass1_231 = local18;
		arg1.aClass1_230.aClass1_231 = arg1;
		arg1.aClass1_231.aClass1_230 = arg1;
	}

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "(I)Lclient!im;")
	public Class1 method2085() {
		if (this.aClass1_120 == null) {
			return null;
		}
		@Pc(30) Class1 local30 = this.aClass1Array1[(int) (this.aLong101 & (long) (this.anInt2613 - 1))];
		while (local30 != this.aClass1_120) {
			if (this.aClass1_120.aLong205 == this.aLong101) {
				@Pc(44) Class1 local44 = this.aClass1_120;
				this.aClass1_120 = this.aClass1_120.aClass1_231;
				return local44;
			}
			this.aClass1_120 = this.aClass1_120.aClass1_231;
		}
		this.aClass1_120 = null;
		return null;
	}
}
