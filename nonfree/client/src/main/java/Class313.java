import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class313 {

	@OriginalMember(owner = "client!qn", name = "h", descriptor = "Lclient!tfa;")
	private Class3 aClass3_269;

	@OriginalMember(owner = "client!qn", name = "p", descriptor = "J")
	private long aLong276;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "Lclient!tfa;")
	private Class3 aClass3_270;

	@OriginalMember(owner = "client!qn", name = "n", descriptor = "I")
	private int anInt8331 = 0;

	@OriginalMember(owner = "client!qn", name = "i", descriptor = "[Lclient!tfa;")
	public final Class3[] aClass3Array1;

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
	public final int anInt8324;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(I)V")
	public Class313(@OriginalArg(0) int arg0) {
		this.aClass3Array1 = new Class3[arg0];
		this.anInt8324 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class3 local23 = this.aClass3Array1[local13] = new Class3();
			local23.aClass3_345 = local23;
			local23.aClass3_346 = local23;
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Z)V")
	public void method7101() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt8324; local3++) {
			@Pc(12) Class3 local12 = this.aClass3Array1[local3];
			while (true) {
				@Pc(15) Class3 local15 = local12.aClass3_346;
				if (local12 == local15) {
					break;
				}
				local15.method9596();
			}
		}
		this.aClass3_270 = null;
		this.aClass3_269 = null;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)I")
	public int method7102() {
		return this.anInt8324;
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)Lclient!tfa;")
	public Class3 method7103() {
		this.anInt8331 = 0;
		return this.method7110();
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(JI)Lclient!tfa;")
	public Class3 method7104(@OriginalArg(0) long arg0) {
		this.aLong276 = arg0;
		@Pc(20) Class3 local20 = this.aClass3Array1[(int) (arg0 & (long) (this.anInt8324 - 1))];
		for (this.aClass3_269 = local20.aClass3_346; this.aClass3_269 != local20; this.aClass3_269 = this.aClass3_269.aClass3_346) {
			if (arg0 == this.aClass3_269.aLong345) {
				@Pc(43) Class3 local43 = this.aClass3_269;
				this.aClass3_269 = this.aClass3_269.aClass3_346;
				return local43;
			}
		}
		this.aClass3_269 = null;
		return null;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "([Lclient!tfa;B)I")
	public int method7105(@OriginalArg(0) Class3[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt8324; local17++) {
			@Pc(24) Class3 local24 = this.aClass3Array1[local17];
			for (@Pc(27) Class3 local27 = local24.aClass3_346; local27 != local24; local27 = local27.aClass3_346) {
				arg0[local7++] = local27;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "(I)Lclient!tfa;")
	public Class3 method7106() {
		if (this.aClass3_269 == null) {
			return null;
		}
		@Pc(24) Class3 local24 = this.aClass3Array1[(int) (this.aLong276 & (long) (this.anInt8324 - 1))];
		while (local24 != this.aClass3_269) {
			if (this.aClass3_269.aLong345 == this.aLong276) {
				@Pc(42) Class3 local42 = this.aClass3_269;
				this.aClass3_269 = this.aClass3_269.aClass3_346;
				return local42;
			}
			this.aClass3_269 = this.aClass3_269.aClass3_346;
		}
		this.aClass3_269 = null;
		return null;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IJLclient!tfa;)V")
	public void method7107(@OriginalArg(1) long arg0, @OriginalArg(2) Class3 arg1) {
		if (arg1.aClass3_345 != null) {
			arg1.method9596();
		}
		@Pc(23) Class3 local23 = this.aClass3Array1[(int) ((long) (this.anInt8324 - 1) & arg0)];
		arg1.aClass3_346 = local23;
		arg1.aClass3_345 = local23.aClass3_345;
		arg1.aClass3_345.aClass3_346 = arg1;
		arg1.aClass3_346.aClass3_345 = arg1;
		arg1.aLong345 = arg0;
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)I")
	public int method7108() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt8324; local9++) {
			@Pc(16) Class3 local16 = this.aClass3Array1[local9];
			for (@Pc(19) Class3 local19 = local16.aClass3_346; local19 != local16; local19 = local19.aClass3_346) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)Lclient!tfa;")
	public Class3 method7110() {
		@Pc(26) Class3 local26;
		if (this.anInt8331 > 0 && this.aClass3_270 != this.aClass3Array1[this.anInt8331 - 1]) {
			local26 = this.aClass3_270;
			this.aClass3_270 = local26.aClass3_346;
			return local26;
		}
		while (this.anInt8324 > this.anInt8331) {
			local26 = this.aClass3Array1[this.anInt8331++].aClass3_346;
			if (this.aClass3Array1[this.anInt8331 - 1] != local26) {
				this.aClass3_270 = local26.aClass3_346;
				return local26;
			}
		}
		return null;
	}
}
