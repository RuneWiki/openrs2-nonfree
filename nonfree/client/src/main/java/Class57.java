import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class57 {

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "J")
	private long aLong89;

	@OriginalMember(owner = "client!rb", name = "y", descriptor = "Lclient!qc;")
	private Class5 aClass5_75;

	@OriginalMember(owner = "client!rb", name = "D", descriptor = "Lclient!qc;")
	private Class5 aClass5_76;

	@OriginalMember(owner = "client!rb", name = "C", descriptor = "I")
	private int anInt2295 = 0;

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "[Lclient!qc;")
	private final Class5[] aClass5Array1;

	@OriginalMember(owner = "client!rb", name = "u", descriptor = "I")
	private final int anInt2290;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(I)V")
	public Class57(@OriginalArg(0) int arg0) {
		this.aClass5Array1 = new Class5[arg0];
		this.anInt2290 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class5 local23 = this.aClass5Array1[local13] = new Class5();
			local23.aClass5_106 = local23;
			local23.aClass5_105 = local23;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(JZ)Lclient!qc;")
	public Class5 method1575(@OriginalArg(0) long arg0) {
		this.aLong89 = arg0;
		@Pc(23) Class5 local23 = this.aClass5Array1[(int) ((long) (this.anInt2290 - 1) & arg0)];
		for (this.aClass5_75 = local23.aClass5_106; this.aClass5_75 != local23; this.aClass5_75 = this.aClass5_75.aClass5_106) {
			if (this.aClass5_75.aLong118 == arg0) {
				@Pc(41) Class5 local41 = this.aClass5_75;
				this.aClass5_75 = this.aClass5_75.aClass5_106;
				return local41;
			}
		}
		this.aClass5_75 = null;
		return null;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)Lclient!qc;")
	public Class5 method1577() {
		if (this.aClass5_75 == null) {
			return null;
		}
		@Pc(26) Class5 local26 = this.aClass5Array1[(int) ((long) (this.anInt2290 - 1) & this.aLong89)];
		while (this.aClass5_75 != local26) {
			if (this.aLong89 == this.aClass5_75.aLong118) {
				@Pc(41) Class5 local41 = this.aClass5_75;
				this.aClass5_75 = this.aClass5_75.aClass5_106;
				return local41;
			}
			this.aClass5_75 = this.aClass5_75.aClass5_106;
		}
		this.aClass5_75 = null;
		return null;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)Lclient!qc;")
	public Class5 method1579() {
		this.anInt2295 = 0;
		return this.method1582();
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(JILclient!qc;)V")
	public void method1581(@OriginalArg(0) long arg0, @OriginalArg(2) Class5 arg1) {
		if (arg1.aClass5_105 != null) {
			arg1.method2002();
		}
		@Pc(27) Class5 local27 = this.aClass5Array1[(int) ((long) (this.anInt2290 - 1) & arg0)];
		arg1.aClass5_105 = local27.aClass5_105;
		arg1.aLong118 = arg0;
		arg1.aClass5_106 = local27;
		arg1.aClass5_105.aClass5_106 = arg1;
		arg1.aClass5_106.aClass5_105 = arg1;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)Lclient!qc;")
	public Class5 method1582() {
		@Pc(24) Class5 local24;
		if (this.anInt2295 > 0 && this.aClass5Array1[this.anInt2295 - 1] != this.aClass5_76) {
			local24 = this.aClass5_76;
			this.aClass5_76 = local24.aClass5_106;
			return local24;
		}
		while (this.anInt2295 < this.anInt2290) {
			local24 = this.aClass5Array1[this.anInt2295++].aClass5_106;
			if (this.aClass5Array1[this.anInt2295 - 1] != local24) {
				this.aClass5_76 = local24.aClass5_106;
				return local24;
			}
		}
		return null;
	}
}
