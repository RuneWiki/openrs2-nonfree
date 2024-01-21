import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class99 {

	@OriginalMember(owner = "client!wh", name = "n", descriptor = "Lclient!ji;")
	private Class1 aClass1_211;

	@OriginalMember(owner = "client!wh", name = "s", descriptor = "J")
	private long aLong149;

	@OriginalMember(owner = "client!wh", name = "B", descriptor = "Lclient!ji;")
	private Class1 aClass1_212;

	@OriginalMember(owner = "client!wh", name = "z", descriptor = "I")
	private int anInt4436 = 0;

	@OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
	private final int anInt4432;

	@OriginalMember(owner = "client!wh", name = "x", descriptor = "[Lclient!ji;")
	private final Class1[] aClass1Array1;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(I)V")
	public Class99(@OriginalArg(0) int arg0) {
		this.anInt4432 = arg0;
		this.aClass1Array1 = new Class1[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_213 = local23;
			local23.aClass1_214 = local23;
		}
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)Lclient!ji;")
	public Class1 method3288() {
		this.anInt4436 = 0;
		return this.method3289();
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)Lclient!ji;")
	public Class1 method3289() {
		@Pc(22) Class1 local22;
		if (this.anInt4436 > 0 && this.aClass1_212 != this.aClass1Array1[this.anInt4436 - 1]) {
			local22 = this.aClass1_212;
			this.aClass1_212 = local22.aClass1_213;
			return local22;
		}
		while (this.anInt4432 > this.anInt4436) {
			local22 = this.aClass1Array1[this.anInt4436++].aClass1_213;
			if (this.aClass1Array1[this.anInt4436 - 1] != local22) {
				this.aClass1_212 = local22.aClass1_213;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BLclient!ji;J)V")
	public void method3290(@OriginalArg(1) Class1 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass1_214 != null) {
			arg0.method3295();
		}
		@Pc(29) Class1 local29 = this.aClass1Array1[(int) (arg1 & (long) (this.anInt4432 - 1))];
		arg0.aClass1_213 = local29;
		arg0.aLong150 = arg1;
		arg0.aClass1_214 = local29.aClass1_214;
		arg0.aClass1_214.aClass1_213 = arg0;
		arg0.aClass1_213.aClass1_214 = arg0;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(JB)Lclient!ji;")
	public Class1 method3292(@OriginalArg(0) long arg0) {
		this.aLong149 = arg0;
		@Pc(14) Class1 local14 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt4432 - 1))];
		for (this.aClass1_211 = local14.aClass1_213; this.aClass1_211 != local14; this.aClass1_211 = this.aClass1_211.aClass1_213) {
			if (arg0 == this.aClass1_211.aLong150) {
				@Pc(32) Class1 local32 = this.aClass1_211;
				this.aClass1_211 = this.aClass1_211.aClass1_213;
				return local32;
			}
		}
		this.aClass1_211 = null;
		return null;
	}

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "(I)Lclient!ji;")
	public Class1 method3293() {
		if (this.aClass1_211 == null) {
			return null;
		}
		@Pc(21) Class1 local21 = this.aClass1Array1[(int) (this.aLong149 & (long) (this.anInt4432 - 1))];
		while (local21 != this.aClass1_211) {
			if (this.aClass1_211.aLong150 == this.aLong149) {
				@Pc(36) Class1 local36 = this.aClass1_211;
				this.aClass1_211 = this.aClass1_211.aClass1_213;
				return local36;
			}
			this.aClass1_211 = this.aClass1_211.aClass1_213;
		}
		this.aClass1_211 = null;
		return null;
	}
}
