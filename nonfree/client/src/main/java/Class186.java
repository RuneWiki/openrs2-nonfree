import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public final class Class186 {

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "J")
	private long aLong231;

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "Lclient!ec;")
	private Class1 aClass1_222;

	@OriginalMember(owner = "client!vl", name = "z", descriptor = "Lclient!ec;")
	private Class1 aClass1_223;

	@OriginalMember(owner = "client!vl", name = "x", descriptor = "I")
	private int anInt5971 = 0;

	@OriginalMember(owner = "client!vl", name = "u", descriptor = "[Lclient!ec;")
	public Class1[] aClass1Array1;

	@OriginalMember(owner = "client!vl", name = "i", descriptor = "I")
	public int anInt5960;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(I)V")
	public Class186(@OriginalArg(0) int arg0) {
		this.aClass1Array1 = new Class1[arg0];
		this.anInt5960 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(25) Class1 local25 = this.aClass1Array1[local13] = new Class1();
			local25.aClass1_232 = local25;
			local25.aClass1_233 = local25;
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)Lclient!ec;")
	public Class1 method4567() {
		this.anInt5971 = 0;
		return this.method4579();
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V")
	public void method4568() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5960; local3++) {
			@Pc(16) Class1 local16 = this.aClass1Array1[local3];
			while (true) {
				@Pc(19) Class1 local19 = local16.aClass1_233;
				if (local16 == local19) {
					break;
				}
				local19.method4767();
			}
		}
		this.aClass1_222 = null;
		this.aClass1_223 = null;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IJ)Lclient!ec;")
	public Class1 method4570(@OriginalArg(1) long arg0) {
		this.aLong231 = arg0;
		@Pc(20) Class1 local20 = this.aClass1Array1[(int) ((long) (this.anInt5960 - 1) & arg0)];
		for (this.aClass1_222 = local20.aClass1_233; this.aClass1_222 != local20; this.aClass1_222 = this.aClass1_222.aClass1_233) {
			if (arg0 == this.aClass1_222.aLong247) {
				@Pc(50) Class1 local50 = this.aClass1_222;
				this.aClass1_222 = this.aClass1_222.aClass1_233;
				return local50;
			}
		}
		this.aClass1_222 = null;
		return null;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I[Lclient!ec;)I")
	public int method4571(@OriginalArg(1) Class1[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt5960; local17++) {
			@Pc(26) Class1 local26 = this.aClass1Array1[local17];
			for (@Pc(29) Class1 local29 = local26.aClass1_233; local29 != local26; local29 = local29.aClass1_233) {
				arg0[local7++] = local29;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IJLclient!ec;)V")
	public void method4575(@OriginalArg(1) long arg0, @OriginalArg(2) Class1 arg1) {
		if (arg1.aClass1_232 != null) {
			arg1.method4767();
		}
		@Pc(23) Class1 local23 = this.aClass1Array1[(int) ((long) (this.anInt5960 - 1) & arg0)];
		arg1.aClass1_233 = local23;
		arg1.aClass1_232 = local23.aClass1_232;
		arg1.aClass1_232.aClass1_233 = arg1;
		arg1.aClass1_233.aClass1_232 = arg1;
		arg1.aLong247 = arg0;
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)I")
	public int method4576() {
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt5960; local17++) {
			@Pc(30) Class1 local30 = this.aClass1Array1[local17];
			@Pc(33) Class1 local33 = local30.aClass1_233;
			while (local33 != local30) {
				local33 = local33.aClass1_233;
				local15++;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(B)Lclient!ec;")
	public Class1 method4579() {
		@Pc(31) Class1 local31;
		if (this.anInt5971 > 0 && this.aClass1_223 != this.aClass1Array1[this.anInt5971 - 1]) {
			local31 = this.aClass1_223;
			this.aClass1_223 = local31.aClass1_233;
			return local31;
		}
		do {
			if (this.anInt5971 >= this.anInt5960) {
				return null;
			}
			local31 = this.aClass1Array1[this.anInt5971++].aClass1_233;
		} while (local31 == this.aClass1Array1[this.anInt5971 - 1]);
		this.aClass1_223 = local31.aClass1_233;
		return local31;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)I")
	public int method4580() {
		return this.anInt5960;
	}

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "(I)Lclient!ec;")
	public Class1 method4583() {
		if (this.aClass1_222 == null) {
			return null;
		}
		@Pc(31) Class1 local31 = this.aClass1Array1[(int) ((long) (this.anInt5960 - 1) & this.aLong231)];
		while (this.aClass1_222 != local31) {
			if (this.aLong231 == this.aClass1_222.aLong247) {
				@Pc(50) Class1 local50 = this.aClass1_222;
				this.aClass1_222 = this.aClass1_222.aClass1_233;
				return local50;
			}
			this.aClass1_222 = this.aClass1_222.aClass1_233;
		}
		this.aClass1_222 = null;
		return null;
	}
}
