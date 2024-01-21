import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class75 {

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "Lclient!s;")
	private Class4 aClass4_115;

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "J")
	private long aLong93;

	@OriginalMember(owner = "client!ud", name = "A", descriptor = "Lclient!s;")
	private Class4 aClass4_116;

	@OriginalMember(owner = "client!ud", name = "z", descriptor = "I")
	private int anInt2742 = 0;

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "[Lclient!s;")
	private final Class4[] aClass4Array1;

	@OriginalMember(owner = "client!ud", name = "x", descriptor = "I")
	private final int anInt2740;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(I)V")
	public Class75(@OriginalArg(0) int arg0) {
		this.aClass4Array1 = new Class4[arg0];
		this.anInt2740 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class4 local23 = this.aClass4Array1[local13] = new Class4();
			local23.aClass4_128 = local23;
			local23.aClass4_127 = local23;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)Lclient!s;")
	public Class4 method1891() {
		@Pc(21) Class4 local21;
		if (this.anInt2742 > 0 && this.aClass4_116 != this.aClass4Array1[this.anInt2742 - 1]) {
			local21 = this.aClass4_116;
			this.aClass4_116 = local21.aClass4_128;
			return local21;
		}
		while (this.anInt2740 > this.anInt2742) {
			local21 = this.aClass4Array1[this.anInt2742++].aClass4_128;
			if (this.aClass4Array1[this.anInt2742 - 1] != local21) {
				this.aClass4_116 = local21.aClass4_128;
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BJLclient!s;)V")
	public void method1892(@OriginalArg(1) long arg0, @OriginalArg(2) Class4 arg1) {
		if (arg1.aClass4_127 != null) {
			arg1.method1989();
		}
		@Pc(17) Class4 local17 = this.aClass4Array1[(int) ((long) (this.anInt2740 - 1) & arg0)];
		arg1.aClass4_128 = local17;
		arg1.aClass4_127 = local17.aClass4_127;
		arg1.aLong100 = arg0;
		arg1.aClass4_127.aClass4_128 = arg1;
		arg1.aClass4_128.aClass4_127 = arg1;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(JI)Lclient!s;")
	public Class4 method1896(@OriginalArg(0) long arg0) {
		this.aLong93 = arg0;
		@Pc(14) Class4 local14 = this.aClass4Array1[(int) (arg0 & (long) (this.anInt2740 - 1))];
		for (this.aClass4_115 = local14.aClass4_128; this.aClass4_115 != local14; this.aClass4_115 = this.aClass4_115.aClass4_128) {
			if (this.aClass4_115.aLong100 == arg0) {
				@Pc(36) Class4 local36 = this.aClass4_115;
				this.aClass4_115 = this.aClass4_115.aClass4_128;
				return local36;
			}
		}
		this.aClass4_115 = null;
		return null;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)Lclient!s;")
	public Class4 method1897() {
		this.anInt2742 = 0;
		return this.method1891();
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)Lclient!s;")
	public Class4 method1899() {
		if (this.aClass4_115 == null) {
			return null;
		}
		@Pc(27) Class4 local27 = this.aClass4Array1[(int) ((long) (this.anInt2740 - 1) & this.aLong93)];
		while (this.aClass4_115 != local27) {
			if (this.aClass4_115.aLong100 == this.aLong93) {
				@Pc(38) Class4 local38 = this.aClass4_115;
				this.aClass4_115 = this.aClass4_115.aClass4_128;
				return local38;
			}
			this.aClass4_115 = this.aClass4_115.aClass4_128;
		}
		this.aClass4_115 = null;
		return null;
	}
}
