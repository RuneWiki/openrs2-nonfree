import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class97 {

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "Lclient!si;")
	private Class4 aClass4_131;

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "J")
	private long aLong106;

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "Lclient!si;")
	private Class4 aClass4_132;

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
	private int anInt2995 = 0;

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
	public int anInt2982;

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "[Lclient!si;")
	public Class4[] aClass4Array1;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(I)V")
	public Class97(@OriginalArg(0) int arg0) {
		this.anInt2982 = arg0;
		this.aClass4Array1 = new Class4[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(29) Class4 local29 = this.aClass4Array1[local13] = new Class4();
			local29.aClass4_230 = local29;
			local29.aClass4_231 = local29;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
	public void method2356() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2982; local3++) {
			@Pc(16) Class4 local16 = this.aClass4Array1[local3];
			while (true) {
				@Pc(19) Class4 local19 = local16.aClass4_231;
				if (local16 == local19) {
					break;
				}
				local19.method4391();
			}
		}
		this.aClass4_131 = null;
		this.aClass4_132 = null;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)I")
	public int method2358() {
		return this.anInt2982;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([Lclient!si;I)I")
	public int method2359(@OriginalArg(0) Class4[] arg0) {
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt2982; local14++) {
			@Pc(27) Class4 local27 = this.aClass4Array1[local14];
			for (@Pc(30) Class4 local30 = local27.aClass4_231; local30 != local27; local30 = local30.aClass4_231) {
				arg0[local12++] = local30;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(JI)Lclient!si;")
	public Class4 method2360(@OriginalArg(0) long arg0) {
		this.aLong106 = arg0;
		@Pc(26) Class4 local26 = this.aClass4Array1[(int) (arg0 & (long) (this.anInt2982 - 1))];
		for (this.aClass4_131 = local26.aClass4_231; this.aClass4_131 != local26; this.aClass4_131 = this.aClass4_131.aClass4_231) {
			if (this.aClass4_131.aLong200 == arg0) {
				@Pc(48) Class4 local48 = this.aClass4_131;
				this.aClass4_131 = this.aClass4_131.aClass4_231;
				return local48;
			}
		}
		this.aClass4_131 = null;
		return null;
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)Lclient!si;")
	public Class4 method2361() {
		if (this.aClass4_131 == null) {
			return null;
		}
		@Pc(23) Class4 local23 = this.aClass4Array1[(int) (this.aLong106 & (long) (this.anInt2982 - 1))];
		while (local23 != this.aClass4_131) {
			if (this.aClass4_131.aLong200 == this.aLong106) {
				@Pc(37) Class4 local37 = this.aClass4_131;
				this.aClass4_131 = this.aClass4_131.aClass4_231;
				return local37;
			}
			this.aClass4_131 = this.aClass4_131.aClass4_231;
		}
		this.aClass4_131 = null;
		return null;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)I")
	public int method2362() {
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt2982; local17++) {
			@Pc(30) Class4 local30 = this.aClass4Array1[local17];
			for (@Pc(33) Class4 local33 = local30.aClass4_231; local33 != local30; local33 = local33.aClass4_231) {
				local15++;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)Lclient!si;")
	public Class4 method2363() {
		this.anInt2995 = 0;
		return this.method2367();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZLclient!si;J)V")
	public void method2364(@OriginalArg(1) Class4 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass4_230 != null) {
			arg0.method4391();
		}
		@Pc(21) Class4 local21 = this.aClass4Array1[(int) ((long) (this.anInt2982 - 1) & arg1)];
		arg0.aClass4_230 = local21.aClass4_230;
		arg0.aClass4_231 = local21;
		arg0.aClass4_230.aClass4_231 = arg0;
		arg0.aClass4_231.aClass4_230 = arg0;
		arg0.aLong200 = arg1;
	}

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "(I)Lclient!si;")
	public Class4 method2367() {
		if (this.anInt2995 > 0 && this.aClass4_132 != this.aClass4Array1[this.anInt2995 - 1]) {
			@Pc(24) Class4 local24 = this.aClass4_132;
			this.aClass4_132 = local24.aClass4_231;
			return local24;
		}
		@Pc(55) Class4 local55;
		do {
			if (this.anInt2982 <= this.anInt2995) {
				return null;
			}
			local55 = this.aClass4Array1[this.anInt2995++].aClass4_231;
		} while (local55 == this.aClass4Array1[this.anInt2995 - 1]);
		this.aClass4_132 = local55.aClass4_231;
		return local55;
	}
}
