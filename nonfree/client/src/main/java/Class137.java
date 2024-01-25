import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class137 {

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "J")
	private long aLong108;

	@OriginalMember(owner = "client!ke", name = "l", descriptor = "Lclient!ol;")
	private Class6 aClass6_124;

	@OriginalMember(owner = "client!ke", name = "u", descriptor = "Lclient!ol;")
	private Class6 aClass6_125;

	@OriginalMember(owner = "client!ke", name = "s", descriptor = "I")
	private int anInt3547 = 0;

	@OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
	public final int anInt3544;

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "[Lclient!ol;")
	public final Class6[] aClass6Array1;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I)V")
	public Class137(@OriginalArg(0) int arg0) {
		this.anInt3544 = arg0;
		this.aClass6Array1 = new Class6[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class6 local23 = this.aClass6Array1[local13] = new Class6();
			local23.aClass6_252 = local23;
			local23.aClass6_251 = local23;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "([Lclient!ol;Z)I")
	public int method3172(@OriginalArg(0) Class6[] arg0) {
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt3544; local17++) {
			@Pc(24) Class6 local24 = this.aClass6Array1[local17];
			for (@Pc(27) Class6 local27 = local24.aClass6_252; local27 != local24; local27 = local27.aClass6_252) {
				arg0[local15++] = local27;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)I")
	public int method3173() {
		return this.anInt3544;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZJ)Lclient!ol;")
	public Class6 method3175(@OriginalArg(1) long arg0) {
		this.aLong108 = arg0;
		@Pc(20) Class6 local20 = this.aClass6Array1[(int) (arg0 & (long) (this.anInt3544 - 1))];
		for (this.aClass6_124 = local20.aClass6_252; this.aClass6_124 != local20; this.aClass6_124 = this.aClass6_124.aClass6_252) {
			if (this.aClass6_124.aLong217 == arg0) {
				@Pc(35) Class6 local35 = this.aClass6_124;
				this.aClass6_124 = this.aClass6_124.aClass6_252;
				return local35;
			}
		}
		this.aClass6_124 = null;
		return null;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)Lclient!ol;")
	public Class6 method3176() {
		if (this.aClass6_124 == null) {
			return null;
		}
		@Pc(29) Class6 local29 = this.aClass6Array1[(int) (this.aLong108 & (long) (this.anInt3544 - 1))];
		while (local29 != this.aClass6_124) {
			if (this.aLong108 == this.aClass6_124.aLong217) {
				@Pc(41) Class6 local41 = this.aClass6_124;
				this.aClass6_124 = this.aClass6_124.aClass6_252;
				return local41;
			}
			this.aClass6_124 = this.aClass6_124.aClass6_252;
		}
		this.aClass6_124 = null;
		return null;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)I")
	public int method3177() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt3544; local9++) {
			@Pc(16) Class6 local16 = this.aClass6Array1[local9];
			@Pc(19) Class6 local19 = local16.aClass6_252;
			while (local16 != local19) {
				local19 = local19.aClass6_252;
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V")
	public void method3178() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt3544; local11++) {
			@Pc(18) Class6 local18 = this.aClass6Array1[local11];
			while (true) {
				@Pc(21) Class6 local21 = local18.aClass6_252;
				if (local21 == local18) {
					break;
				}
				local21.method5977();
			}
		}
		this.aClass6_124 = null;
		this.aClass6_125 = null;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(JILclient!ol;)V")
	public void method3179(@OriginalArg(0) long arg0, @OriginalArg(2) Class6 arg1) {
		if (arg1.aClass6_251 != null) {
			arg1.method5977();
		}
		@Pc(21) Class6 local21 = this.aClass6Array1[(int) (arg0 & (long) (this.anInt3544 - 1))];
		arg1.aClass6_252 = local21;
		arg1.aClass6_251 = local21.aClass6_251;
		arg1.aClass6_251.aClass6_252 = arg1;
		arg1.aClass6_252.aClass6_251 = arg1;
		arg1.aLong217 = arg0;
	}

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(B)Lclient!ol;")
	public Class6 method3181() {
		this.anInt3547 = 0;
		return this.method3182();
	}

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "(B)Lclient!ol;")
	public Class6 method3182() {
		@Pc(27) Class6 local27;
		if (this.anInt3547 > 0 && this.aClass6_125 != this.aClass6Array1[this.anInt3547 - 1]) {
			local27 = this.aClass6_125;
			this.aClass6_125 = local27.aClass6_252;
			return local27;
		}
		while (this.anInt3547 < this.anInt3544) {
			local27 = this.aClass6Array1[this.anInt3547++].aClass6_252;
			if (this.aClass6Array1[this.anInt3547 - 1] != local27) {
				this.aClass6_125 = local27.aClass6_252;
				return local27;
			}
		}
		return null;
	}
}
