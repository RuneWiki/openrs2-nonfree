import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pfa")
public final class Class253 {

	@OriginalMember(owner = "client!pfa", name = "e", descriptor = "Lclient!mc;")
	private Class8 aClass8_212;

	@OriginalMember(owner = "client!pfa", name = "h", descriptor = "J")
	private long aLong208;

	@OriginalMember(owner = "client!pfa", name = "p", descriptor = "Lclient!mc;")
	private Class8 aClass8_213;

	@OriginalMember(owner = "client!pfa", name = "o", descriptor = "I")
	private int anInt7956 = 0;

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "I")
	public final int anInt7945;

	@OriginalMember(owner = "client!pfa", name = "m", descriptor = "[Lclient!mc;")
	public final Class8[] aClass8Array1;

	@OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(I)V")
	public Class253(@OriginalArg(0) int arg0) {
		this.anInt7945 = arg0;
		this.aClass8Array1 = new Class8[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class8 local23 = this.aClass8Array1[local13] = new Class8();
			local23.aClass8_300 = local23;
			local23.aClass8_299 = local23;
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "([Lclient!mc;I)I")
	public int method6590(@OriginalArg(0) Class8[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt7945; local9++) {
			@Pc(16) Class8 local16 = this.aClass8Array1[local9];
			for (@Pc(19) Class8 local19 = local16.aClass8_300; local19 != local16; local19 = local19.aClass8_300) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Lclient!mc;IJ)V")
	public void method6591(@OriginalArg(0) Class8 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass8_299 != null) {
			arg0.method8640();
		}
		@Pc(27) Class8 local27 = this.aClass8Array1[(int) ((long) (this.anInt7945 - 1) & arg1)];
		arg0.aClass8_299 = local27.aClass8_299;
		arg0.aClass8_300 = local27;
		arg0.aClass8_299.aClass8_300 = arg0;
		arg0.aLong285 = arg1;
		arg0.aClass8_300.aClass8_299 = arg0;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(I)I")
	public int method6592() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt7945; local9++) {
			@Pc(16) Class8 local16 = this.aClass8Array1[local9];
			for (@Pc(19) Class8 local19 = local16.aClass8_300; local19 != local16; local19 = local19.aClass8_300) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!pfa", name = "b", descriptor = "(I)Lclient!mc;")
	public Class8 method6593() {
		this.anInt7956 = 0;
		return this.method6595();
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ZJ)Lclient!mc;")
	public Class8 method6594(@OriginalArg(1) long arg0) {
		this.aLong208 = arg0;
		@Pc(27) Class8 local27 = this.aClass8Array1[(int) (arg0 & (long) (this.anInt7945 - 1))];
		for (this.aClass8_212 = local27.aClass8_300; this.aClass8_212 != local27; this.aClass8_212 = this.aClass8_212.aClass8_300) {
			if (arg0 == this.aClass8_212.aLong285) {
				@Pc(42) Class8 local42 = this.aClass8_212;
				this.aClass8_212 = this.aClass8_212.aClass8_300;
				return local42;
			}
		}
		this.aClass8_212 = null;
		return null;
	}

	@OriginalMember(owner = "client!pfa", name = "c", descriptor = "(I)Lclient!mc;")
	public Class8 method6595() {
		@Pc(22) Class8 local22;
		if (this.anInt7956 > 0 && this.aClass8_213 != this.aClass8Array1[this.anInt7956 - 1]) {
			local22 = this.aClass8_213;
			this.aClass8_213 = local22.aClass8_300;
			return local22;
		}
		while (this.anInt7956 < this.anInt7945) {
			local22 = this.aClass8Array1[this.anInt7956++].aClass8_300;
			if (local22 != this.aClass8Array1[this.anInt7956 - 1]) {
				this.aClass8_213 = local22.aClass8_300;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!pfa", name = "d", descriptor = "(I)I")
	public int method6597() {
		return this.anInt7945;
	}

	@OriginalMember(owner = "client!pfa", name = "e", descriptor = "(I)V")
	public void method6598() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7945; local7++) {
			@Pc(14) Class8 local14 = this.aClass8Array1[local7];
			while (true) {
				@Pc(17) Class8 local17 = local14.aClass8_300;
				if (local17 == local14) {
					break;
				}
				local17.method8640();
			}
		}
		this.aClass8_213 = null;
		this.aClass8_212 = null;
	}

	@OriginalMember(owner = "client!pfa", name = "f", descriptor = "(I)Lclient!mc;")
	public Class8 method6599() {
		if (this.aClass8_212 == null) {
			return null;
		}
		@Pc(23) Class8 local23 = this.aClass8Array1[(int) (this.aLong208 & (long) (this.anInt7945 - 1))];
		while (local23 != this.aClass8_212) {
			if (this.aLong208 == this.aClass8_212.aLong285) {
				@Pc(35) Class8 local35 = this.aClass8_212;
				this.aClass8_212 = this.aClass8_212.aClass8_300;
				return local35;
			}
			this.aClass8_212 = this.aClass8_212.aClass8_300;
		}
		this.aClass8_212 = null;
		return null;
	}
}
