import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class280 {

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "Lclient!qm;")
	private Class3 aClass3_232;

	@OriginalMember(owner = "client!qp", name = "n", descriptor = "J")
	private long aLong222;

	@OriginalMember(owner = "client!qp", name = "q", descriptor = "Lclient!qm;")
	private Class3 aClass3_233;

	@OriginalMember(owner = "client!qp", name = "p", descriptor = "I")
	private int anInt8264 = 0;

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "I")
	public final int anInt8254;

	@OriginalMember(owner = "client!qp", name = "e", descriptor = "[Lclient!qm;")
	public final Class3[] aClass3Array1;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(I)V")
	public Class280(@OriginalArg(0) int arg0) {
		this.anInt8254 = arg0;
		this.aClass3Array1 = new Class3[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class3 local23 = this.aClass3Array1[local13] = new Class3();
			local23.aClass3_300 = local23;
			local23.aClass3_299 = local23;
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V")
	public void method7100() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt8254; local3++) {
			@Pc(17) Class3 local17 = this.aClass3Array1[local3];
			while (true) {
				@Pc(20) Class3 local20 = local17.aClass3_300;
				if (local17 == local20) {
					break;
				}
				local20.method8769();
			}
		}
		this.aClass3_232 = null;
		this.aClass3_233 = null;
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)I")
	public int method7102() {
		return this.anInt8254;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "([Lclient!qm;I)I")
	public int method7104(@OriginalArg(0) Class3[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt8254; local9++) {
			@Pc(16) Class3 local16 = this.aClass3Array1[local9];
			for (@Pc(19) Class3 local19 = local16.aClass3_300; local19 != local16; local19 = local19.aClass3_300) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "(B)Lclient!qm;")
	public Class3 method7105() {
		if (this.aClass3_232 == null) {
			return null;
		}
		@Pc(28) Class3 local28 = this.aClass3Array1[(int) ((long) (this.anInt8254 - 1) & this.aLong222)];
		while (local28 != this.aClass3_232) {
			if (this.aLong222 == this.aClass3_232.aLong276) {
				@Pc(44) Class3 local44 = this.aClass3_232;
				this.aClass3_232 = this.aClass3_232.aClass3_300;
				return local44;
			}
			this.aClass3_232 = this.aClass3_232.aClass3_300;
		}
		this.aClass3_232 = null;
		return null;
	}

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "(I)I")
	public int method7106() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt8254; local9++) {
			@Pc(16) Class3 local16 = this.aClass3Array1[local9];
			for (@Pc(19) Class3 local19 = local16.aClass3_300; local19 != local16; local19 = local19.aClass3_300) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(JB)Lclient!qm;")
	public Class3 method7107(@OriginalArg(0) long arg0) {
		this.aLong222 = arg0;
		@Pc(20) Class3 local20 = this.aClass3Array1[(int) ((long) (this.anInt8254 - 1) & arg0)];
		for (this.aClass3_232 = local20.aClass3_300; this.aClass3_232 != local20; this.aClass3_232 = this.aClass3_232.aClass3_300) {
			if (arg0 == this.aClass3_232.aLong276) {
				@Pc(40) Class3 local40 = this.aClass3_232;
				this.aClass3_232 = this.aClass3_232.aClass3_300;
				return local40;
			}
		}
		this.aClass3_232 = null;
		return null;
	}

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "(B)Lclient!qm;")
	public Class3 method7108() {
		@Pc(29) Class3 local29;
		if (this.anInt8264 > 0 && this.aClass3Array1[this.anInt8264 - 1] != this.aClass3_233) {
			local29 = this.aClass3_233;
			this.aClass3_233 = local29.aClass3_300;
			return local29;
		}
		while (this.anInt8254 > this.anInt8264) {
			local29 = this.aClass3Array1[this.anInt8264++].aClass3_300;
			if (local29 != this.aClass3Array1[this.anInt8264 - 1]) {
				this.aClass3_233 = local29.aClass3_300;
				return local29;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!qm;IJ)V")
	public void method7109(@OriginalArg(0) Class3 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass3_299 != null) {
			arg0.method8769();
		}
		@Pc(29) Class3 local29 = this.aClass3Array1[(int) ((long) (this.anInt8254 - 1) & arg1)];
		arg0.aClass3_299 = local29.aClass3_299;
		arg0.aClass3_300 = local29;
		arg0.aClass3_299.aClass3_300 = arg0;
		arg0.aLong276 = arg1;
		arg0.aClass3_300.aClass3_299 = arg0;
	}

	@OriginalMember(owner = "client!qp", name = "e", descriptor = "(B)Lclient!qm;")
	public Class3 method7110() {
		this.anInt8264 = 0;
		return this.method7108();
	}
}
