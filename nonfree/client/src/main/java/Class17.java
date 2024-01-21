import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class17 {

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "Lclient!ad;")
	private Class3 aClass3_33;

	@OriginalMember(owner = "client!ec", name = "B", descriptor = "Lclient!ad;")
	private Class3 aClass3_34;

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
	private int anInt995 = 0;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "[Lclient!ad;")
	private final Class3[] aClass3Array1;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
	private final int anInt987;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(I)V")
	public Class17(@OriginalArg(0) int arg0) {
		this.aClass3Array1 = new Class3[arg0];
		this.anInt987 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class3 local23 = this.aClass3Array1[local13] = new Class3();
			local23.aClass3_127 = local23;
			local23.aClass3_128 = local23;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!ad;JZ)V")
	public void method594(@OriginalArg(0) Class3 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass3_128 != null) {
			arg0.method2201();
		}
		@Pc(21) Class3 local21 = this.aClass3Array1[(int) (arg1 & (long) (this.anInt987 - 1))];
		arg0.aClass3_127 = local21;
		arg0.aClass3_128 = local21.aClass3_128;
		arg0.aLong100 = arg1;
		arg0.aClass3_128.aClass3_127 = arg0;
		arg0.aClass3_127.aClass3_128 = arg0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)Lclient!ad;")
	public Class3 method597() {
		@Pc(21) Class3 local21;
		if (this.anInt995 > 0 && this.aClass3_34 != this.aClass3Array1[this.anInt995 - 1]) {
			local21 = this.aClass3_34;
			this.aClass3_34 = local21.aClass3_127;
			return local21;
		}
		while (this.anInt995 < this.anInt987) {
			local21 = this.aClass3Array1[this.anInt995++].aClass3_127;
			if (this.aClass3Array1[this.anInt995 - 1] != local21) {
				this.aClass3_34 = local21.aClass3_127;
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)Lclient!ad;")
	public Class3 method598() {
		this.anInt995 = 0;
		return this.method597();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BJ)Lclient!ad;")
	public Class3 method599(@OriginalArg(1) long arg0) {
		this.aLong27 = arg0;
		@Pc(18) Class3 local18 = this.aClass3Array1[(int) (arg0 & (long) (this.anInt987 - 1))];
		for (this.aClass3_33 = local18.aClass3_127; this.aClass3_33 != local18; this.aClass3_33 = this.aClass3_33.aClass3_127) {
			if (arg0 == this.aClass3_33.aLong100) {
				@Pc(41) Class3 local41 = this.aClass3_33;
				this.aClass3_33 = this.aClass3_33.aClass3_127;
				return local41;
			}
		}
		this.aClass3_33 = null;
		return null;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)Lclient!ad;")
	public Class3 method602() {
		if (this.aClass3_33 == null) {
			return null;
		}
		@Pc(28) Class3 local28 = this.aClass3Array1[(int) ((long) (this.anInt987 - 1) & this.aLong27)];
		while (this.aClass3_33 != local28) {
			if (this.aClass3_33.aLong100 == this.aLong27) {
				@Pc(39) Class3 local39 = this.aClass3_33;
				this.aClass3_33 = this.aClass3_33.aClass3_127;
				return local39;
			}
			this.aClass3_33 = this.aClass3_33.aClass3_127;
		}
		this.aClass3_33 = null;
		return null;
	}
}
