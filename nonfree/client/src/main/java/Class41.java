import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class41 {

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "J")
	private long aLong45;

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "Lclient!lc;")
	private Class1 aClass1_51;

	@OriginalMember(owner = "client!mb", name = "B", descriptor = "Lclient!lc;")
	private Class1 aClass1_52;

	@OriginalMember(owner = "client!mb", name = "A", descriptor = "I")
	private int anInt1460 = 0;

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
	private final int anInt1453;

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "[Lclient!lc;")
	private final Class1[] aClass1Array1;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(I)V")
	public Class41(@OriginalArg(0) int arg0) {
		this.anInt1453 = arg0;
		this.aClass1Array1 = new Class1[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_96 = local23;
			local23.aClass1_95 = local23;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)Lclient!lc;")
	public Class1 method1017() {
		if (this.aClass1_51 == null) {
			return null;
		}
		@Pc(21) Class1 local21 = this.aClass1Array1[(int) (this.aLong45 & (long) (this.anInt1453 - 1))];
		while (local21 != this.aClass1_51) {
			if (this.aClass1_51.aLong83 == this.aLong45) {
				@Pc(36) Class1 local36 = this.aClass1_51;
				this.aClass1_51 = this.aClass1_51.aClass1_95;
				return local36;
			}
			this.aClass1_51 = this.aClass1_51.aClass1_95;
		}
		this.aClass1_51 = null;
		return null;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IJLclient!lc;)V")
	public void method1019(@OriginalArg(1) long arg0, @OriginalArg(2) Class1 arg1) {
		if (arg1.aClass1_96 != null) {
			arg1.method1825();
		}
		@Pc(17) Class1 local17 = this.aClass1Array1[(int) ((long) (this.anInt1453 - 1) & arg0)];
		arg1.aClass1_96 = local17.aClass1_96;
		arg1.aClass1_95 = local17;
		arg1.aClass1_96.aClass1_95 = arg1;
		arg1.aLong83 = arg0;
		arg1.aClass1_95.aClass1_96 = arg1;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IJ)Lclient!lc;")
	public Class1 method1020(@OriginalArg(1) long arg0) {
		this.aLong45 = arg0;
		@Pc(24) Class1 local24 = this.aClass1Array1[(int) ((long) (this.anInt1453 - 1) & arg0)];
		for (this.aClass1_51 = local24.aClass1_95; this.aClass1_51 != local24; this.aClass1_51 = this.aClass1_51.aClass1_95) {
			if (arg0 == this.aClass1_51.aLong83) {
				@Pc(42) Class1 local42 = this.aClass1_51;
				this.aClass1_51 = this.aClass1_51.aClass1_95;
				return local42;
			}
		}
		this.aClass1_51 = null;
		return null;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)Lclient!lc;")
	private Class1 method1023() {
		if (this.anInt1460 > 0 && this.aClass1Array1[this.anInt1460 - 1] != this.aClass1_52) {
			@Pc(24) Class1 local24 = this.aClass1_52;
			this.aClass1_52 = local24.aClass1_95;
			return local24;
		}
		while (this.anInt1453 > this.anInt1460) {
			@Pc(52) Class1 local52 = this.aClass1Array1[this.anInt1460++].aClass1_95;
			if (local52 != this.aClass1Array1[this.anInt1460 - 1]) {
				this.aClass1_52 = local52.aClass1_95;
				return local52;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)Lclient!lc;")
	public Class1 method1024() {
		this.anInt1460 = 0;
		return this.method1023();
	}
}
