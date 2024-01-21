import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class57 {

	@OriginalMember(owner = "client!l", name = "i", descriptor = "Lclient!rb;")
	private Class1 aClass1_107;

	@OriginalMember(owner = "client!l", name = "j", descriptor = "J")
	private long aLong79;

	@OriginalMember(owner = "client!l", name = "u", descriptor = "Lclient!rb;")
	private Class1 aClass1_108;

	@OriginalMember(owner = "client!l", name = "t", descriptor = "I")
	private int anInt2438 = 0;

	@OriginalMember(owner = "client!l", name = "b", descriptor = "I")
	private final int anInt2429;

	@OriginalMember(owner = "client!l", name = "m", descriptor = "[Lclient!rb;")
	private final Class1[] aClass1Array1;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(I)V")
	public Class57(@OriginalArg(0) int arg0) {
		this.anInt2429 = arg0;
		this.aClass1Array1 = new Class1[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_214 = local23;
			local23.aClass1_213 = local23;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(JB)Lclient!rb;")
	public Class1 method1872(@OriginalArg(0) long arg0) {
		this.aLong79 = arg0;
		@Pc(14) Class1 local14 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt2429 - 1))];
		for (this.aClass1_107 = local14.aClass1_214; this.aClass1_107 != local14; this.aClass1_107 = this.aClass1_107.aClass1_214) {
			if (arg0 == this.aClass1_107.aLong149) {
				@Pc(37) Class1 local37 = this.aClass1_107;
				this.aClass1_107 = this.aClass1_107.aClass1_214;
				return local37;
			}
		}
		this.aClass1_107 = null;
		return null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(B)Lclient!rb;")
	public Class1 method1873() {
		@Pc(29) Class1 local29;
		if (this.anInt2438 > 0 && this.aClass1Array1[this.anInt2438 - 1] != this.aClass1_108) {
			local29 = this.aClass1_108;
			this.aClass1_108 = local29.aClass1_214;
			return local29;
		}
		while (this.anInt2429 > this.anInt2438) {
			local29 = this.aClass1Array1[this.anInt2438++].aClass1_214;
			if (local29 != this.aClass1Array1[this.anInt2438 - 1]) {
				this.aClass1_108 = local29.aClass1_214;
				return local29;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!rb;JI)V")
	public void method1874(@OriginalArg(0) Class1 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass1_213 != null) {
			arg0.method3563();
		}
		@Pc(21) Class1 local21 = this.aClass1Array1[(int) ((long) (this.anInt2429 - 1) & arg1)];
		arg0.aClass1_214 = local21;
		arg0.aClass1_213 = local21.aClass1_213;
		arg0.aClass1_213.aClass1_214 = arg0;
		arg0.aClass1_214.aClass1_213 = arg0;
		arg0.aLong149 = arg1;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)Lclient!rb;")
	public Class1 method1876() {
		this.anInt2438 = 0;
		return this.method1873();
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)Lclient!rb;")
	public Class1 method1877() {
		if (this.aClass1_107 == null) {
			return null;
		}
		@Pc(21) Class1 local21 = this.aClass1Array1[(int) (this.aLong79 & (long) (this.anInt2429 - 1))];
		while (this.aClass1_107 != local21) {
			if (this.aLong79 == this.aClass1_107.aLong149) {
				@Pc(32) Class1 local32 = this.aClass1_107;
				this.aClass1_107 = this.aClass1_107.aClass1_214;
				return local32;
			}
			this.aClass1_107 = this.aClass1_107.aClass1_214;
		}
		this.aClass1_107 = null;
		return null;
	}
}
