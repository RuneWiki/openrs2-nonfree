import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class26 {

	@OriginalMember(owner = "client!br", name = "h", descriptor = "Lclient!mh;")
	private Class1 aClass1_37;

	@OriginalMember(owner = "client!br", name = "i", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!br", name = "r", descriptor = "Lclient!mh;")
	private Class1 aClass1_38;

	@OriginalMember(owner = "client!br", name = "m", descriptor = "I")
	private int anInt799 = 0;

	@OriginalMember(owner = "client!br", name = "c", descriptor = "[Lclient!mh;")
	public final Class1[] aClass1Array1;

	@OriginalMember(owner = "client!br", name = "e", descriptor = "I")
	public final int anInt794;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(I)V")
	public Class26(@OriginalArg(0) int arg0) {
		this.aClass1Array1 = new Class1[arg0];
		this.anInt794 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_248 = local23;
			local23.aClass1_247 = local23;
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(BJ)Lclient!mh;")
	public Class1 method870(@OriginalArg(1) long arg0) {
		this.aLong32 = arg0;
		@Pc(20) Class1 local20 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt794 - 1))];
		for (this.aClass1_37 = local20.aClass1_247; this.aClass1_37 != local20; this.aClass1_37 = this.aClass1_37.aClass1_247) {
			if (this.aClass1_37.aLong215 == arg0) {
				@Pc(39) Class1 local39 = this.aClass1_37;
				this.aClass1_37 = this.aClass1_37.aClass1_247;
				return local39;
			}
		}
		this.aClass1_37 = null;
		return null;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(I)Lclient!mh;")
	public Class1 method871() {
		this.anInt799 = 0;
		return this.method878();
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "([Lclient!mh;B)I")
	public int method874(@OriginalArg(0) Class1[] arg0) {
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < this.anInt794; local16++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local16];
			for (@Pc(26) Class1 local26 = local23.aClass1_247; local26 != local23; local26 = local26.aClass1_247) {
				arg0[local14++] = local26;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(I)I")
	public int method875() {
		@Pc(7) int local7 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt794; local14++) {
			@Pc(21) Class1 local21 = this.aClass1Array1[local14];
			for (@Pc(24) Class1 local24 = local21.aClass1_247; local24 != local21; local24 = local24.aClass1_247) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(B)V")
	public void method876() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt794; local7++) {
			@Pc(21) Class1 local21 = this.aClass1Array1[local7];
			while (true) {
				@Pc(24) Class1 local24 = local21.aClass1_247;
				if (local21 == local24) {
					break;
				}
				local24.method5710();
			}
		}
		this.aClass1_38 = null;
		this.aClass1_37 = null;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(JILclient!mh;)V")
	public void method877(@OriginalArg(0) long arg0, @OriginalArg(2) Class1 arg1) {
		if (arg1.aClass1_248 != null) {
			arg1.method5710();
		}
		@Pc(21) Class1 local21 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt794 - 1))];
		arg1.aClass1_248 = local21.aClass1_248;
		arg1.aClass1_247 = local21;
		arg1.aClass1_248.aClass1_247 = arg1;
		arg1.aLong215 = arg0;
		arg1.aClass1_247.aClass1_248 = arg1;
	}

	@OriginalMember(owner = "client!br", name = "c", descriptor = "(B)Lclient!mh;")
	public Class1 method878() {
		@Pc(30) Class1 local30;
		if (this.anInt799 > 0 && this.aClass1_38 != this.aClass1Array1[this.anInt799 - 1]) {
			local30 = this.aClass1_38;
			this.aClass1_38 = local30.aClass1_247;
			return local30;
		}
		while (this.anInt799 < this.anInt794) {
			local30 = this.aClass1Array1[this.anInt799++].aClass1_247;
			if (this.aClass1Array1[this.anInt799 - 1] != local30) {
				this.aClass1_38 = local30.aClass1_247;
				return local30;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!br", name = "c", descriptor = "(I)Lclient!mh;")
	public Class1 method879() {
		if (this.aClass1_37 == null) {
			return null;
		}
		@Pc(23) Class1 local23 = this.aClass1Array1[(int) (this.aLong32 & (long) (this.anInt794 - 1))];
		while (local23 != this.aClass1_37) {
			if (this.aClass1_37.aLong215 == this.aLong32) {
				@Pc(35) Class1 local35 = this.aClass1_37;
				this.aClass1_37 = this.aClass1_37.aClass1_247;
				return local35;
			}
			this.aClass1_37 = this.aClass1_37.aClass1_247;
		}
		this.aClass1_37 = null;
		return null;
	}

	@OriginalMember(owner = "client!br", name = "d", descriptor = "(I)I")
	public int method881() {
		return this.anInt794;
	}
}
