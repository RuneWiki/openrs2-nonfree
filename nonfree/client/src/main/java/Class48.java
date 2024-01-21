import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class48 {

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "Lclient!sc;")
	private Class1 aClass1_81;

	@OriginalMember(owner = "client!mc", name = "t", descriptor = "J")
	private long aLong109;

	@OriginalMember(owner = "client!mc", name = "y", descriptor = "Lclient!sc;")
	private Class1 aClass1_82;

	@OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
	private int anInt2050 = 0;

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
	private final int anInt2043;

	@OriginalMember(owner = "client!mc", name = "s", descriptor = "[Lclient!sc;")
	private final Class1[] aClass1Array1;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(I)V")
	public Class48(@OriginalArg(0) int arg0) {
		this.anInt2043 = arg0;
		this.aClass1Array1 = new Class1[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_127 = local23;
			local23.aClass1_128 = local23;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)Lclient!sc;")
	public Class1 method1335() {
		@Pc(19) Class1 local19;
		if (this.anInt2050 > 0 && this.aClass1Array1[this.anInt2050 - 1] != this.aClass1_82) {
			local19 = this.aClass1_82;
			this.aClass1_82 = local19.aClass1_128;
			return local19;
		}
		while (this.anInt2043 > this.anInt2050) {
			local19 = this.aClass1Array1[this.anInt2050++].aClass1_128;
			if (this.aClass1Array1[this.anInt2050 - 1] != local19) {
				this.aClass1_82 = local19.aClass1_128;
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(JLclient!sc;B)V")
	public void method1336(@OriginalArg(0) long arg0, @OriginalArg(1) Class1 arg1) {
		if (arg1.aClass1_127 != null) {
			arg1.method2039();
		}
		@Pc(21) Class1 local21 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt2043 - 1))];
		arg1.aClass1_128 = local21;
		arg1.aClass1_127 = local21.aClass1_127;
		arg1.aClass1_127.aClass1_128 = arg1;
		arg1.aClass1_128.aClass1_127 = arg1;
		arg1.aLong162 = arg0;
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)Lclient!sc;")
	public Class1 method1337() {
		this.anInt2050 = 0;
		return this.method1335();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BJ)Lclient!sc;")
	public Class1 method1340(@OriginalArg(1) long arg0) {
		this.aLong109 = arg0;
		@Pc(14) Class1 local14 = this.aClass1Array1[(int) ((long) (this.anInt2043 - 1) & arg0)];
		for (this.aClass1_81 = local14.aClass1_128; this.aClass1_81 != local14; this.aClass1_81 = this.aClass1_81.aClass1_128) {
			if (arg0 == this.aClass1_81.aLong162) {
				@Pc(43) Class1 local43 = this.aClass1_81;
				this.aClass1_81 = this.aClass1_81.aClass1_128;
				return local43;
			}
		}
		this.aClass1_81 = null;
		return null;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)Lclient!sc;")
	public Class1 method1341() {
		if (this.aClass1_81 == null) {
			return null;
		}
		@Pc(31) Class1 local31 = this.aClass1Array1[(int) (this.aLong109 & (long) (this.anInt2043 - 1))];
		while (local31 != this.aClass1_81) {
			if (this.aLong109 == this.aClass1_81.aLong162) {
				@Pc(42) Class1 local42 = this.aClass1_81;
				this.aClass1_81 = this.aClass1_81.aClass1_128;
				return local42;
			}
			this.aClass1_81 = this.aClass1_81.aClass1_128;
		}
		this.aClass1_81 = null;
		return null;
	}
}
