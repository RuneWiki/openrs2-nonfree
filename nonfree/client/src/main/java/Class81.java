import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class81 {

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "Lclient!v;")
	private Class4 aClass4_125;

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "J")
	private long aLong100;

	@OriginalMember(owner = "client!wc", name = "w", descriptor = "Lclient!v;")
	private Class4 aClass4_126;

	@OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
	private int anInt3117 = 0;

	@OriginalMember(owner = "client!wc", name = "t", descriptor = "[Lclient!v;")
	private final Class4[] aClass4Array1;

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
	private final int anInt3112;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(I)V")
	public Class81(@OriginalArg(0) int arg0) {
		this.aClass4Array1 = new Class4[arg0];
		this.anInt3112 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class4 local23 = this.aClass4Array1[local13] = new Class4();
			local23.aClass4_124 = local23;
			local23.aClass4_123 = local23;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(JB)Lclient!v;")
	public Class4 method2010(@OriginalArg(0) long arg0) {
		this.aLong100 = arg0;
		@Pc(24) Class4 local24 = this.aClass4Array1[(int) (arg0 & (long) (this.anInt3112 - 1))];
		for (this.aClass4_125 = local24.aClass4_124; this.aClass4_125 != local24; this.aClass4_125 = this.aClass4_125.aClass4_124) {
			if (arg0 == this.aClass4_125.aLong99) {
				@Pc(38) Class4 local38 = this.aClass4_125;
				this.aClass4_125 = this.aClass4_125.aClass4_124;
				return local38;
			}
		}
		this.aClass4_125 = null;
		return null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)Lclient!v;")
	public Class4 method2013() {
		@Pc(30) Class4 local30;
		if (this.anInt3117 > 0 && this.aClass4Array1[this.anInt3117 - 1] != this.aClass4_126) {
			local30 = this.aClass4_126;
			this.aClass4_126 = local30.aClass4_124;
			return local30;
		}
		while (this.anInt3117 < this.anInt3112) {
			local30 = this.aClass4Array1[this.anInt3117++].aClass4_124;
			if (local30 != this.aClass4Array1[this.anInt3117 - 1]) {
				this.aClass4_126 = local30.aClass4_124;
				return local30;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZJLclient!v;)V")
	public void method2015(@OriginalArg(1) long arg0, @OriginalArg(2) Class4 arg1) {
		if (arg1.aClass4_123 != null) {
			arg1.method1999();
		}
		@Pc(17) Class4 local17 = this.aClass4Array1[(int) ((long) (this.anInt3112 - 1) & arg0)];
		arg1.aClass4_124 = local17;
		arg1.aClass4_123 = local17.aClass4_123;
		arg1.aClass4_123.aClass4_124 = arg1;
		arg1.aClass4_124.aClass4_123 = arg1;
		arg1.aLong99 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)Lclient!v;")
	public Class4 method2016() {
		if (this.aClass4_125 == null) {
			return null;
		}
		@Pc(26) Class4 local26 = this.aClass4Array1[(int) ((long) (this.anInt3112 - 1) & this.aLong100)];
		while (this.aClass4_125 != local26) {
			if (this.aClass4_125.aLong99 == this.aLong100) {
				@Pc(37) Class4 local37 = this.aClass4_125;
				this.aClass4_125 = this.aClass4_125.aClass4_124;
				return local37;
			}
			this.aClass4_125 = this.aClass4_125.aClass4_124;
		}
		this.aClass4_125 = null;
		return null;
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(B)Lclient!v;")
	public Class4 method2017() {
		this.anInt3117 = 0;
		return this.method2013();
	}
}
