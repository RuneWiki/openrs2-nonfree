import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class42 {

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "J")
	private long aLong71;

	@OriginalMember(owner = "client!jf", name = "w", descriptor = "Lclient!vd;")
	private Class4 aClass4_53;

	@OriginalMember(owner = "client!jf", name = "C", descriptor = "Lclient!vd;")
	private Class4 aClass4_54;

	@OriginalMember(owner = "client!jf", name = "A", descriptor = "I")
	private int anInt1566 = 0;

	@OriginalMember(owner = "client!jf", name = "u", descriptor = "I")
	private final int anInt1561;

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "[Lclient!vd;")
	private final Class4[] aClass4Array1;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(I)V")
	public Class42(@OriginalArg(0) int arg0) {
		this.anInt1561 = arg0;
		this.aClass4Array1 = new Class4[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class4 local23 = this.aClass4Array1[local13] = new Class4();
			local23.aClass4_123 = local23;
			local23.aClass4_124 = local23;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)Lclient!vd;")
	public Class4 method1049() {
		this.anInt1566 = 0;
		return this.method1054();
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)Lclient!vd;")
	public Class4 method1052() {
		if (this.aClass4_53 == null) {
			return null;
		}
		@Pc(27) Class4 local27 = this.aClass4Array1[(int) (this.aLong71 & (long) (this.anInt1561 - 1))];
		while (local27 != this.aClass4_53) {
			if (this.aLong71 == this.aClass4_53.aLong155) {
				@Pc(38) Class4 local38 = this.aClass4_53;
				this.aClass4_53 = this.aClass4_53.aClass4_123;
				return local38;
			}
			this.aClass4_53 = this.aClass4_53.aClass4_123;
		}
		this.aClass4_53 = null;
		return null;
	}

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)Lclient!vd;")
	public Class4 method1054() {
		@Pc(27) Class4 local27;
		if (this.anInt1566 > 0 && this.aClass4_54 != this.aClass4Array1[this.anInt1566 - 1]) {
			local27 = this.aClass4_54;
			this.aClass4_54 = local27.aClass4_123;
			return local27;
		}
		while (this.anInt1566 < this.anInt1561) {
			local27 = this.aClass4Array1[this.anInt1566++].aClass4_123;
			if (local27 != this.aClass4Array1[this.anInt1566 - 1]) {
				this.aClass4_54 = local27.aClass4_123;
				return local27;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IJ)Lclient!vd;")
	public Class4 method1055(@OriginalArg(1) long arg0) {
		this.aLong71 = arg0;
		@Pc(18) Class4 local18 = this.aClass4Array1[(int) ((long) (this.anInt1561 - 1) & arg0)];
		for (this.aClass4_53 = local18.aClass4_123; this.aClass4_53 != local18; this.aClass4_53 = this.aClass4_53.aClass4_123) {
			if (this.aClass4_53.aLong155 == arg0) {
				@Pc(36) Class4 local36 = this.aClass4_53;
				this.aClass4_53 = this.aClass4_53.aClass4_123;
				return local36;
			}
		}
		this.aClass4_53 = null;
		return null;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!vd;BJ)V")
	public void method1056(@OriginalArg(0) Class4 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass4_124 != null) {
			arg0.method2189();
		}
		@Pc(25) Class4 local25 = this.aClass4Array1[(int) ((long) (this.anInt1561 - 1) & arg1)];
		arg0.aClass4_124 = local25.aClass4_124;
		arg0.aClass4_123 = local25;
		arg0.aLong155 = arg1;
		arg0.aClass4_124.aClass4_123 = arg0;
		arg0.aClass4_123.aClass4_124 = arg0;
	}
}
