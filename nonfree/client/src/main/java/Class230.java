import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class Class230 {

	@OriginalMember(owner = "client!pt", name = "e", descriptor = "Lclient!wda;")
	private Class1 aClass1_221;

	@OriginalMember(owner = "client!pt", name = "h", descriptor = "J")
	private long aLong194;

	@OriginalMember(owner = "client!pt", name = "n", descriptor = "Lclient!wda;")
	private Class1 aClass1_222;

	@OriginalMember(owner = "client!pt", name = "j", descriptor = "I")
	private int anInt6812 = 0;

	@OriginalMember(owner = "client!pt", name = "f", descriptor = "I")
	public final int anInt6809;

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "[Lclient!wda;")
	public final Class1[] aClass1Array1;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(I)V")
	public Class230(@OriginalArg(0) int arg0) {
		this.anInt6809 = arg0;
		this.aClass1Array1 = new Class1[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_284 = local23;
			local23.aClass1_283 = local23;
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Z)Lclient!wda;")
	public Class1 method6137() {
		this.anInt6812 = 0;
		return this.method6140();
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)I")
	public int method6138() {
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt6809; local15++) {
			@Pc(22) Class1 local22 = this.aClass1Array1[local15];
			for (@Pc(25) Class1 local25 = local22.aClass1_283; local25 != local22; local25 = local25.aClass1_283) {
				local13++;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IJLclient!wda;)V")
	public void method6139(@OriginalArg(1) long arg0, @OriginalArg(2) Class1 arg1) {
		if (arg1.aClass1_284 != null) {
			arg1.method8239();
		}
		@Pc(21) Class1 local21 = this.aClass1Array1[(int) ((long) (this.anInt6809 - 1) & arg0)];
		arg1.aClass1_283 = local21;
		arg1.aClass1_284 = local21.aClass1_284;
		arg1.aClass1_284.aClass1_283 = arg1;
		arg1.aClass1_283.aClass1_284 = arg1;
		arg1.aLong251 = arg0;
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(I)Lclient!wda;")
	public Class1 method6140() {
		@Pc(26) Class1 local26;
		if (this.anInt6812 > 0 && this.aClass1_222 != this.aClass1Array1[this.anInt6812 - 1]) {
			local26 = this.aClass1_222;
			this.aClass1_222 = local26.aClass1_283;
			return local26;
		}
		while (this.anInt6809 > this.anInt6812) {
			local26 = this.aClass1Array1[this.anInt6812++].aClass1_283;
			if (local26 != this.aClass1Array1[this.anInt6812 - 1]) {
				this.aClass1_222 = local26.aClass1_283;
				return local26;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(Z)V")
	public void method6141() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt6809; local11++) {
			@Pc(18) Class1 local18 = this.aClass1Array1[local11];
			while (true) {
				@Pc(21) Class1 local21 = local18.aClass1_283;
				if (local21 == local18) {
					break;
				}
				local21.method8239();
			}
		}
		this.aClass1_222 = null;
		this.aClass1_221 = null;
	}

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "(I)I")
	public int method6142() {
		return this.anInt6809;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "([Lclient!wda;I)I")
	public int method6143(@OriginalArg(0) Class1[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt6809; local14++) {
			@Pc(21) Class1 local21 = this.aClass1Array1[local14];
			for (@Pc(24) Class1 local24 = local21.aClass1_283; local24 != local21; local24 = local24.aClass1_283) {
				arg0[local7++] = local24;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(JB)Lclient!wda;")
	public Class1 method6144(@OriginalArg(0) long arg0) {
		this.aLong194 = arg0;
		@Pc(25) Class1 local25 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt6809 - 1))];
		for (this.aClass1_221 = local25.aClass1_283; this.aClass1_221 != local25; this.aClass1_221 = this.aClass1_221.aClass1_283) {
			if (this.aClass1_221.aLong251 == arg0) {
				@Pc(40) Class1 local40 = this.aClass1_221;
				this.aClass1_221 = this.aClass1_221.aClass1_283;
				return local40;
			}
		}
		this.aClass1_221 = null;
		return null;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)Lclient!wda;")
	public Class1 method6145() {
		if (this.aClass1_221 == null) {
			return null;
		}
		@Pc(31) Class1 local31 = this.aClass1Array1[(int) (this.aLong194 & (long) (this.anInt6809 - 1))];
		while (this.aClass1_221 != local31) {
			if (this.aClass1_221.aLong251 == this.aLong194) {
				@Pc(47) Class1 local47 = this.aClass1_221;
				this.aClass1_221 = this.aClass1_221.aClass1_283;
				return local47;
			}
			this.aClass1_221 = this.aClass1_221.aClass1_283;
		}
		this.aClass1_221 = null;
		return null;
	}
}
