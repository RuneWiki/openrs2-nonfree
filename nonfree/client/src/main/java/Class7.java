import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class7 {

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "Lclient!te;")
	private Class1 aClass1_21;

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "J")
	private long aLong12;

	@OriginalMember(owner = "client!bd", name = "x", descriptor = "Lclient!te;")
	private Class1 aClass1_22;

	@OriginalMember(owner = "client!bd", name = "z", descriptor = "I")
	private int anInt330 = 0;

	@OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
	private final int anInt324;

	@OriginalMember(owner = "client!bd", name = "s", descriptor = "[Lclient!te;")
	private final Class1[] aClass1Array1;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(I)V")
	public Class7(@OriginalArg(0) int arg0) {
		this.anInt324 = arg0;
		this.aClass1Array1 = new Class1[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_123 = local23;
			local23.aClass1_124 = local23;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)Lclient!te;")
	public Class1 method284() {
		@Pc(19) Class1 local19;
		if (this.anInt330 > 0 && this.aClass1Array1[this.anInt330 - 1] != this.aClass1_22) {
			local19 = this.aClass1_22;
			this.aClass1_22 = local19.aClass1_124;
			return local19;
		}
		while (this.anInt324 > this.anInt330) {
			local19 = this.aClass1Array1[this.anInt330++].aClass1_124;
			if (local19 != this.aClass1Array1[this.anInt330 - 1]) {
				this.aClass1_22 = local19.aClass1_124;
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(JB)Lclient!te;")
	public Class1 method287(@OriginalArg(0) long arg0) {
		this.aLong12 = arg0;
		@Pc(18) Class1 local18 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt324 - 1))];
		for (this.aClass1_21 = local18.aClass1_124; this.aClass1_21 != local18; this.aClass1_21 = this.aClass1_21.aClass1_124) {
			if (arg0 == this.aClass1_21.aLong95) {
				@Pc(40) Class1 local40 = this.aClass1_21;
				this.aClass1_21 = this.aClass1_21.aClass1_124;
				return local40;
			}
		}
		this.aClass1_21 = null;
		return null;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)Lclient!te;")
	public Class1 method288() {
		this.anInt330 = 0;
		return this.method284();
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)Lclient!te;")
	public Class1 method289() {
		if (this.aClass1_21 == null) {
			return null;
		}
		@Pc(21) Class1 local21 = this.aClass1Array1[(int) ((long) (this.anInt324 - 1) & this.aLong12)];
		while (local21 != this.aClass1_21) {
			if (this.aClass1_21.aLong95 == this.aLong12) {
				@Pc(36) Class1 local36 = this.aClass1_21;
				this.aClass1_21 = this.aClass1_21.aClass1_124;
				return local36;
			}
			this.aClass1_21 = this.aClass1_21.aClass1_124;
		}
		this.aClass1_21 = null;
		return null;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!te;J)V")
	public void method291(@OriginalArg(1) Class1 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass1_123 != null) {
			arg0.method2220();
		}
		@Pc(21) Class1 local21 = this.aClass1Array1[(int) (arg1 & (long) (this.anInt324 - 1))];
		arg0.aClass1_123 = local21.aClass1_123;
		arg0.aLong95 = arg1;
		arg0.aClass1_124 = local21;
		arg0.aClass1_123.aClass1_124 = arg0;
		arg0.aClass1_124.aClass1_123 = arg0;
	}
}
