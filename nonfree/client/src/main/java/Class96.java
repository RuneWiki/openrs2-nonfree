import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class96 {

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "J")
	private long aLong103;

	@OriginalMember(owner = "client!hl", name = "o", descriptor = "Lclient!ha;")
	private Class4 aClass4_113;

	@OriginalMember(owner = "client!hl", name = "t", descriptor = "Lclient!ha;")
	private Class4 aClass4_114;

	@OriginalMember(owner = "client!hl", name = "s", descriptor = "I")
	private int anInt3145 = 0;

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "[Lclient!ha;")
	public final Class4[] aClass4Array1;

	@OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
	public final int anInt3135;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(I)V")
	public Class96(@OriginalArg(0) int arg0) {
		this.aClass4Array1 = new Class4[arg0];
		this.anInt3135 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class4 local23 = this.aClass4Array1[local13] = new Class4();
			local23.aClass4_270 = local23;
			local23.aClass4_269 = local23;
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)Lclient!ha;")
	public Class4 method2796() {
		@Pc(25) Class4 local25;
		if (this.anInt3145 > 0 && this.aClass4_114 != this.aClass4Array1[this.anInt3145 - 1]) {
			local25 = this.aClass4_114;
			this.aClass4_114 = local25.aClass4_269;
			return local25;
		}
		while (this.anInt3145 < this.anInt3135) {
			local25 = this.aClass4Array1[this.anInt3145++].aClass4_269;
			if (local25 != this.aClass4Array1[this.anInt3145 - 1]) {
				this.aClass4_114 = local25.aClass4_269;
				return local25;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZJ)Lclient!ha;")
	public Class4 method2797(@OriginalArg(1) long arg0) {
		this.aLong103 = arg0;
		@Pc(18) Class4 local18 = this.aClass4Array1[(int) (arg0 & (long) (this.anInt3135 - 1))];
		for (this.aClass4_113 = local18.aClass4_269; this.aClass4_113 != local18; this.aClass4_113 = this.aClass4_113.aClass4_269) {
			if (arg0 == this.aClass4_113.aLong228) {
				@Pc(36) Class4 local36 = this.aClass4_113;
				this.aClass4_113 = this.aClass4_113.aClass4_269;
				return local36;
			}
		}
		this.aClass4_113 = null;
		return null;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)Lclient!ha;")
	public Class4 method2798() {
		this.anInt3145 = 0;
		return this.method2796();
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(B)V")
	public void method2799() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt3135; local11++) {
			@Pc(18) Class4 local18 = this.aClass4Array1[local11];
			while (true) {
				@Pc(21) Class4 local21 = local18.aClass4_269;
				if (local18 == local21) {
					break;
				}
				local21.method6330();
			}
		}
		this.aClass4_113 = null;
		this.aClass4_114 = null;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(B[Lclient!ha;)I")
	public int method2800(@OriginalArg(1) Class4[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt3135; local14++) {
			@Pc(21) Class4 local21 = this.aClass4Array1[local14];
			for (@Pc(24) Class4 local24 = local21.aClass4_269; local24 != local21; local24 = local24.aClass4_269) {
				arg0[local7++] = local24;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "(B)I")
	public int method2802() {
		return this.anInt3135;
	}

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "(B)Lclient!ha;")
	public Class4 method2803() {
		if (this.aClass4_113 == null) {
			return null;
		}
		@Pc(29) Class4 local29 = this.aClass4Array1[(int) ((long) (this.anInt3135 - 1) & this.aLong103)];
		while (this.aClass4_113 != local29) {
			if (this.aClass4_113.aLong228 == this.aLong103) {
				@Pc(41) Class4 local41 = this.aClass4_113;
				this.aClass4_113 = this.aClass4_113.aClass4_269;
				return local41;
			}
			this.aClass4_113 = this.aClass4_113.aClass4_269;
		}
		this.aClass4_113 = null;
		return null;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(JLclient!ha;B)V")
	public void method2805(@OriginalArg(0) long arg0, @OriginalArg(1) Class4 arg1) {
		if (arg1.aClass4_270 != null) {
			arg1.method6330();
		}
		@Pc(27) Class4 local27 = this.aClass4Array1[(int) (arg0 & (long) (this.anInt3135 - 1))];
		arg1.aClass4_269 = local27;
		arg1.aClass4_270 = local27.aClass4_270;
		arg1.aClass4_270.aClass4_269 = arg1;
		arg1.aLong228 = arg0;
		arg1.aClass4_269.aClass4_270 = arg1;
	}

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "(B)I")
	public int method2807() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt3135; local9++) {
			@Pc(22) Class4 local22 = this.aClass4Array1[local9];
			@Pc(25) Class4 local25 = local22.aClass4_269;
			while (local25 != local22) {
				local25 = local25.aClass4_269;
				local7++;
			}
		}
		return local7;
	}
}
