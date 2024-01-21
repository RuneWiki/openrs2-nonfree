import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class2 {

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "Lclient!sa;")
	private Class3 aClass3_1;

	@OriginalMember(owner = "client!ab", name = "y", descriptor = "J")
	private long aLong1;

	@OriginalMember(owner = "client!ab", name = "B", descriptor = "Lclient!sa;")
	private Class3 aClass3_2;

	@OriginalMember(owner = "client!ab", name = "D", descriptor = "I")
	private int anInt20 = 0;

	@OriginalMember(owner = "client!ab", name = "v", descriptor = "I")
	private final int anInt18;

	@OriginalMember(owner = "client!ab", name = "A", descriptor = "[Lclient!sa;")
	private final Class3[] aClass3Array1;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(I)V")
	public Class2(@OriginalArg(0) int arg0) {
		this.anInt18 = arg0;
		this.aClass3Array1 = new Class3[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class3 local23 = this.aClass3Array1[local13] = new Class3();
			local23.aClass3_115 = local23;
			local23.aClass3_116 = local23;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)Lclient!sa;")
	public Class3 method10() {
		this.anInt20 = 0;
		return this.method14();
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!sa;IJ)V")
	public void method12(@OriginalArg(0) Class3 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass3_115 != null) {
			arg0.method2055();
		}
		@Pc(21) Class3 local21 = this.aClass3Array1[(int) ((long) (this.anInt18 - 1) & arg1)];
		arg0.aLong94 = arg1;
		arg0.aClass3_116 = local21;
		arg0.aClass3_115 = local21.aClass3_115;
		arg0.aClass3_115.aClass3_116 = arg0;
		arg0.aClass3_116.aClass3_115 = arg0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)Lclient!sa;")
	public Class3 method13() {
		if (this.aClass3_1 == null) {
			return null;
		}
		@Pc(28) Class3 local28 = this.aClass3Array1[(int) (this.aLong1 & (long) (this.anInt18 - 1))];
		while (local28 != this.aClass3_1) {
			if (this.aClass3_1.aLong94 == this.aLong1) {
				@Pc(39) Class3 local39 = this.aClass3_1;
				this.aClass3_1 = this.aClass3_1.aClass3_116;
				return local39;
			}
			this.aClass3_1 = this.aClass3_1.aClass3_116;
		}
		this.aClass3_1 = null;
		return null;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)Lclient!sa;")
	public Class3 method14() {
		@Pc(19) Class3 local19;
		if (this.anInt20 > 0 && this.aClass3Array1[this.anInt20 - 1] != this.aClass3_2) {
			local19 = this.aClass3_2;
			this.aClass3_2 = local19.aClass3_116;
			return local19;
		}
		while (this.anInt18 > this.anInt20) {
			local19 = this.aClass3Array1[this.anInt20++].aClass3_116;
			if (local19 != this.aClass3Array1[this.anInt20 - 1]) {
				this.aClass3_2 = local19.aClass3_116;
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IJ)Lclient!sa;")
	public Class3 method17(@OriginalArg(1) long arg0) {
		this.aLong1 = arg0;
		@Pc(23) Class3 local23 = this.aClass3Array1[(int) ((long) (this.anInt18 - 1) & arg0)];
		for (this.aClass3_1 = local23.aClass3_116; this.aClass3_1 != local23; this.aClass3_1 = this.aClass3_1.aClass3_116) {
			if (this.aClass3_1.aLong94 == arg0) {
				@Pc(37) Class3 local37 = this.aClass3_1;
				this.aClass3_1 = this.aClass3_1.aClass3_116;
				return local37;
			}
		}
		this.aClass3_1 = null;
		return null;
	}
}
