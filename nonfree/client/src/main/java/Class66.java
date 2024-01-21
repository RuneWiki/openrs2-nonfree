import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class66 {

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "J")
	private long aLong88;

	@OriginalMember(owner = "client!sb", name = "v", descriptor = "Lclient!cb;")
	private Class4 aClass4_101;

	@OriginalMember(owner = "client!sb", name = "w", descriptor = "Lclient!cb;")
	private Class4 aClass4_102;

	@OriginalMember(owner = "client!sb", name = "A", descriptor = "I")
	private int anInt2534 = 0;

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "[Lclient!cb;")
	private final Class4[] aClass4Array1;

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
	private final int anInt2528;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(I)V")
	public Class66(@OriginalArg(0) int arg0) {
		this.aClass4Array1 = new Class4[arg0];
		this.anInt2528 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class4 local23 = this.aClass4Array1[local13] = new Class4();
			local23.aClass4_124 = local23;
			local23.aClass4_123 = local23;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!cb;BJ)V")
	public void method1830(@OriginalArg(0) Class4 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass4_124 != null) {
			arg0.method2124();
		}
		@Pc(21) Class4 local21 = this.aClass4Array1[(int) (arg1 & (long) (this.anInt2528 - 1))];
		arg0.aLong100 = arg1;
		arg0.aClass4_123 = local21;
		arg0.aClass4_124 = local21.aClass4_124;
		arg0.aClass4_124.aClass4_123 = arg0;
		arg0.aClass4_123.aClass4_124 = arg0;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)Lclient!cb;")
	public Class4 method1831() {
		@Pc(22) Class4 local22;
		if (this.anInt2534 > 0 && this.aClass4_102 != this.aClass4Array1[this.anInt2534 - 1]) {
			local22 = this.aClass4_102;
			this.aClass4_102 = local22.aClass4_123;
			return local22;
		}
		while (this.anInt2528 > this.anInt2534) {
			local22 = this.aClass4Array1[this.anInt2534++].aClass4_123;
			if (this.aClass4Array1[this.anInt2534 - 1] != local22) {
				this.aClass4_102 = local22.aClass4_123;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(JB)Lclient!cb;")
	public Class4 method1834(@OriginalArg(0) long arg0) {
		this.aLong88 = arg0;
		@Pc(23) Class4 local23 = this.aClass4Array1[(int) ((long) (this.anInt2528 - 1) & arg0)];
		for (this.aClass4_101 = local23.aClass4_123; this.aClass4_101 != local23; this.aClass4_101 = this.aClass4_101.aClass4_123) {
			if (arg0 == this.aClass4_101.aLong100) {
				@Pc(41) Class4 local41 = this.aClass4_101;
				this.aClass4_101 = this.aClass4_101.aClass4_123;
				return local41;
			}
		}
		this.aClass4_101 = null;
		return null;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)Lclient!cb;")
	public Class4 method1838() {
		this.anInt2534 = 0;
		return this.method1831();
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)Lclient!cb;")
	public Class4 method1839() {
		if (this.aClass4_101 == null) {
			return null;
		}
		@Pc(21) Class4 local21 = this.aClass4Array1[(int) (this.aLong88 & (long) (this.anInt2528 - 1))];
		while (this.aClass4_101 != local21) {
			if (this.aLong88 == this.aClass4_101.aLong100) {
				@Pc(32) Class4 local32 = this.aClass4_101;
				this.aClass4_101 = this.aClass4_101.aClass4_123;
				return local32;
			}
			this.aClass4_101 = this.aClass4_101.aClass4_123;
		}
		this.aClass4_101 = null;
		return null;
	}
}
