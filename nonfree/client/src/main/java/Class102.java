import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class102 {

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "Lclient!vu;")
	private Class4 aClass4_121;

	@OriginalMember(owner = "client!ib", name = "n", descriptor = "J")
	private long aLong111;

	@OriginalMember(owner = "client!ib", name = "s", descriptor = "Lclient!vu;")
	private Class4 aClass4_122;

	@OriginalMember(owner = "client!ib", name = "r", descriptor = "I")
	private int anInt3171 = 0;

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "[Lclient!vu;")
	public final Class4[] aClass4Array1;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
	public final int anInt3159;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(I)V")
	public Class102(@OriginalArg(0) int arg0) {
		this.aClass4Array1 = new Class4[arg0];
		this.anInt3159 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class4 local23 = this.aClass4Array1[local13] = new Class4();
			local23.aClass4_262 = local23;
			local23.aClass4_261 = local23;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)Lclient!vu;")
	public Class4 method2697() {
		if (this.aClass4_121 == null) {
			return null;
		}
		@Pc(23) Class4 local23 = this.aClass4Array1[(int) ((long) (this.anInt3159 - 1) & this.aLong111)];
		while (local23 != this.aClass4_121) {
			if (this.aLong111 == this.aClass4_121.aLong224) {
				@Pc(35) Class4 local35 = this.aClass4_121;
				this.aClass4_121 = this.aClass4_121.aClass4_262;
				return local35;
			}
			this.aClass4_121 = this.aClass4_121.aClass4_262;
		}
		this.aClass4_121 = null;
		return null;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)I")
	public int method2698() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt3159; local9++) {
			@Pc(16) Class4 local16 = this.aClass4Array1[local9];
			@Pc(19) Class4 local19 = local16.aClass4_262;
			while (local16 != local19) {
				local19 = local19.aClass4_262;
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
	public void method2699() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3159; local3++) {
			@Pc(10) Class4 local10 = this.aClass4Array1[local3];
			while (true) {
				@Pc(13) Class4 local13 = local10.aClass4_262;
				if (local13 == local10) {
					break;
				}
				local13.method5684();
			}
		}
		this.aClass4_121 = null;
		this.aClass4_122 = null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(JI)Lclient!vu;")
	public Class4 method2700(@OriginalArg(0) long arg0) {
		this.aLong111 = arg0;
		@Pc(20) Class4 local20 = this.aClass4Array1[(int) (arg0 & (long) (this.anInt3159 - 1))];
		for (this.aClass4_121 = local20.aClass4_262; this.aClass4_121 != local20; this.aClass4_121 = this.aClass4_121.aClass4_262) {
			if (arg0 == this.aClass4_121.aLong224) {
				@Pc(35) Class4 local35 = this.aClass4_121;
				this.aClass4_121 = this.aClass4_121.aClass4_262;
				return local35;
			}
		}
		this.aClass4_121 = null;
		return null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(JILclient!vu;)V")
	public void method2703(@OriginalArg(0) long arg0, @OriginalArg(2) Class4 arg1) {
		if (arg1.aClass4_261 != null) {
			arg1.method5684();
		}
		@Pc(26) Class4 local26 = this.aClass4Array1[(int) (arg0 & (long) (this.anInt3159 - 1))];
		arg1.aClass4_262 = local26;
		arg1.aClass4_261 = local26.aClass4_261;
		arg1.aClass4_261.aClass4_262 = arg1;
		arg1.aLong224 = arg0;
		arg1.aClass4_262.aClass4_261 = arg1;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)Lclient!vu;")
	public Class4 method2704() {
		@Pc(24) Class4 local24;
		if (this.anInt3171 > 0 && this.aClass4_122 != this.aClass4Array1[this.anInt3171 - 1]) {
			local24 = this.aClass4_122;
			this.aClass4_122 = local24.aClass4_262;
			return local24;
		}
		while (this.anInt3171 < this.anInt3159) {
			local24 = this.aClass4Array1[this.anInt3171++].aClass4_262;
			if (this.aClass4Array1[this.anInt3171 - 1] != local24) {
				this.aClass4_122 = local24.aClass4_262;
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(B)Lclient!vu;")
	public Class4 method2705() {
		this.anInt3171 = 0;
		return this.method2704();
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)I")
	public int method2706() {
		return this.anInt3159;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I[Lclient!vu;)I")
	public int method2708(@OriginalArg(1) Class4[] arg0) {
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt3159; local17++) {
			@Pc(24) Class4 local24 = this.aClass4Array1[local17];
			for (@Pc(27) Class4 local27 = local24.aClass4_262; local27 != local24; local27 = local27.aClass4_262) {
				arg0[local15++] = local27;
			}
		}
		return local15;
	}
}
