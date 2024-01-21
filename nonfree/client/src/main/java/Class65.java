import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class65 {

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "J")
	private long aLong109;

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "Lclient!ce;")
	private Class1 aClass1_109;

	@OriginalMember(owner = "client!sb", name = "v", descriptor = "Lclient!ce;")
	private Class1 aClass1_110;

	@OriginalMember(owner = "client!sb", name = "u", descriptor = "I")
	private int anInt2559 = 0;

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
	private final int anInt2554;

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "[Lclient!ce;")
	private final Class1[] aClass1Array1;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(I)V")
	public Class65(@OriginalArg(0) int arg0) {
		this.anInt2554 = arg0;
		this.aClass1Array1 = new Class1[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_127 = local23;
			local23.aClass1_128 = local23;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZLclient!ce;J)V")
	public void method1797(@OriginalArg(1) Class1 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass1_128 != null) {
			arg0.method2050();
		}
		@Pc(21) Class1 local21 = this.aClass1Array1[(int) ((long) (this.anInt2554 - 1) & arg1)];
		arg0.aClass1_128 = local21.aClass1_128;
		arg0.aLong130 = arg1;
		arg0.aClass1_127 = local21;
		arg0.aClass1_128.aClass1_127 = arg0;
		arg0.aClass1_127.aClass1_128 = arg0;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)Lclient!ce;")
	public Class1 method1799() {
		if (this.aClass1_109 == null) {
			return null;
		}
		@Pc(29) Class1 local29 = this.aClass1Array1[(int) (this.aLong109 & (long) (this.anInt2554 - 1))];
		while (this.aClass1_109 != local29) {
			if (this.aLong109 == this.aClass1_109.aLong130) {
				@Pc(44) Class1 local44 = this.aClass1_109;
				this.aClass1_109 = this.aClass1_109.aClass1_127;
				return local44;
			}
			this.aClass1_109 = this.aClass1_109.aClass1_127;
		}
		this.aClass1_109 = null;
		return null;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)Lclient!ce;")
	public Class1 method1801() {
		@Pc(30) Class1 local30;
		if (this.anInt2559 > 0 && this.aClass1Array1[this.anInt2559 - 1] != this.aClass1_110) {
			local30 = this.aClass1_110;
			this.aClass1_110 = local30.aClass1_127;
			return local30;
		}
		while (this.anInt2559 < this.anInt2554) {
			local30 = this.aClass1Array1[this.anInt2559++].aClass1_127;
			if (local30 != this.aClass1Array1[this.anInt2559 - 1]) {
				this.aClass1_110 = local30.aClass1_127;
				return local30;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(JI)Lclient!ce;")
	public Class1 method1802(@OriginalArg(0) long arg0) {
		this.aLong109 = arg0;
		@Pc(23) Class1 local23 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt2554 - 1))];
		for (this.aClass1_109 = local23.aClass1_127; this.aClass1_109 != local23; this.aClass1_109 = this.aClass1_109.aClass1_127) {
			if (this.aClass1_109.aLong130 == arg0) {
				@Pc(41) Class1 local41 = this.aClass1_109;
				this.aClass1_109 = this.aClass1_109.aClass1_127;
				return local41;
			}
		}
		this.aClass1_109 = null;
		return null;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)Lclient!ce;")
	public Class1 method1803() {
		this.anInt2559 = 0;
		return this.method1801();
	}
}
