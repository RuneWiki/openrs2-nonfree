import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fw")
public final class Class125 {

	@OriginalMember(owner = "client!fw", name = "j", descriptor = "J")
	private long aLong107;

	@OriginalMember(owner = "client!fw", name = "m", descriptor = "Lclient!wj;")
	private Class14 aClass14_113;

	@OriginalMember(owner = "client!fw", name = "h", descriptor = "Lclient!wj;")
	private Class14 aClass14_114;

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "I")
	private int anInt2911 = 0;

	@OriginalMember(owner = "client!fw", name = "i", descriptor = "[Lclient!wj;")
	public final Class14[] aClass14Array1;

	@OriginalMember(owner = "client!fw", name = "n", descriptor = "I")
	public final int anInt2905;

	@OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(I)V")
	public Class125(@OriginalArg(0) int arg0) {
		this.aClass14Array1 = new Class14[arg0];
		this.anInt2905 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class14 local23 = this.aClass14Array1[local13] = new Class14();
			local23.aClass14_340 = local23;
			local23.aClass14_339 = local23;
		}
	}

	@OriginalMember(owner = "client!fw", name = "d", descriptor = "(I)I")
	public int method2624() {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2905; local7++) {
			@Pc(13) Class14 local13 = this.aClass14Array1[local7];
			for (@Pc(16) Class14 local16 = local13.aClass14_339; local16 != local13; local16 = local16.aClass14_339) {
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lclient!wj;JB)V")
	public void method2626(@OriginalArg(0) Class14 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass14_340 != null) {
			arg0.method9513();
		}
		@Pc(23) Class14 local23 = this.aClass14Array1[(int) (arg1 & (long) (this.anInt2905 - 1))];
		arg0.aClass14_340 = local23.aClass14_340;
		arg0.aClass14_339 = local23;
		arg0.aClass14_340.aClass14_339 = arg0;
		arg0.aLong324 = arg1;
		arg0.aClass14_339.aClass14_340 = arg0;
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(B)Lclient!wj;")
	public Class14 method2627() {
		@Pc(21) Class14 local21;
		if (this.anInt2911 > 0 && this.aClass14_114 != this.aClass14Array1[this.anInt2911 - 1]) {
			local21 = this.aClass14_114;
			this.aClass14_114 = local21.aClass14_339;
			return local21;
		}
		while (this.anInt2905 > this.anInt2911) {
			local21 = this.aClass14Array1[this.anInt2911++].aClass14_339;
			if (local21 != this.aClass14Array1[this.anInt2911 - 1]) {
				this.aClass14_114 = local21.aClass14_339;
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Z)V")
	public void method2628() {
		for (@Pc(14) int local14 = 0; local14 < this.anInt2905; local14++) {
			@Pc(20) Class14 local20 = this.aClass14Array1[local14];
			while (true) {
				@Pc(23) Class14 local23 = local20.aClass14_339;
				if (local23 == local20) {
					break;
				}
				local23.method9513();
			}
		}
		this.aClass14_114 = null;
		this.aClass14_113 = null;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(B[Lclient!wj;)I")
	public int method2629(@OriginalArg(1) Class14[] arg0) {
		@Pc(5) int local5 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt2905; local15++) {
			@Pc(21) Class14 local21 = this.aClass14Array1[local15];
			for (@Pc(24) Class14 local24 = local21.aClass14_339; local24 != local21; local24 = local24.aClass14_339) {
				arg0[local5++] = local24;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(JB)Lclient!wj;")
	public Class14 method2630(@OriginalArg(0) long arg0) {
		this.aLong107 = arg0;
		@Pc(18) Class14 local18 = this.aClass14Array1[(int) ((long) (this.anInt2905 - 1) & arg0)];
		for (this.aClass14_113 = local18.aClass14_339; this.aClass14_113 != local18; this.aClass14_113 = this.aClass14_113.aClass14_339) {
			if (arg0 == this.aClass14_113.aLong324) {
				@Pc(44) Class14 local44 = this.aClass14_113;
				this.aClass14_113 = this.aClass14_113.aClass14_339;
				return local44;
			}
		}
		this.aClass14_113 = null;
		return null;
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(I)Lclient!wj;")
	public Class14 method2633() {
		this.anInt2911 = 0;
		return this.method2627();
	}

	@OriginalMember(owner = "client!fw", name = "c", descriptor = "(I)I")
	public int method2634() {
		return this.anInt2905;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(B)Lclient!wj;")
	public Class14 method2635() {
		if (this.aClass14_113 == null) {
			return null;
		}
		@Pc(28) Class14 local28 = this.aClass14Array1[(int) ((long) (this.anInt2905 - 1) & this.aLong107)];
		while (local28 != this.aClass14_113) {
			if (this.aLong107 == this.aClass14_113.aLong324) {
				@Pc(39) Class14 local39 = this.aClass14_113;
				this.aClass14_113 = this.aClass14_113.aClass14_339;
				return local39;
			}
			this.aClass14_113 = this.aClass14_113.aClass14_339;
		}
		this.aClass14_113 = null;
		return null;
	}
}
