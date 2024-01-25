import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gca")
public final class Class118 {

	@OriginalMember(owner = "client!gca", name = "g", descriptor = "Lclient!tq;")
	private Class2 aClass2_88;

	@OriginalMember(owner = "client!gca", name = "h", descriptor = "J")
	private long aLong92;

	@OriginalMember(owner = "client!gca", name = "s", descriptor = "Lclient!tq;")
	private Class2 aClass2_89;

	@OriginalMember(owner = "client!gca", name = "q", descriptor = "I")
	private int anInt3097 = 0;

	@OriginalMember(owner = "client!gca", name = "e", descriptor = "[Lclient!tq;")
	public final Class2[] aClass2Array1;

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "I")
	public final int anInt3085;

	@OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(I)V")
	public Class118(@OriginalArg(0) int arg0) {
		this.aClass2Array1 = new Class2[arg0];
		this.anInt3085 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local13] = new Class2();
			local23.aClass2_300 = local23;
			local23.aClass2_299 = local23;
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Z)I")
	public int method2593() {
		return this.anInt3085;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ZJ)Lclient!tq;")
	public Class2 method2595(@OriginalArg(1) long arg0) {
		this.aLong92 = arg0;
		@Pc(20) Class2 local20 = this.aClass2Array1[(int) ((long) (this.anInt3085 - 1) & arg0)];
		for (this.aClass2_88 = local20.aClass2_300; this.aClass2_88 != local20; this.aClass2_88 = this.aClass2_88.aClass2_300) {
			if (arg0 == this.aClass2_88.aLong280) {
				@Pc(40) Class2 local40 = this.aClass2_88;
				this.aClass2_88 = this.aClass2_88.aClass2_300;
				return local40;
			}
		}
		this.aClass2_88 = null;
		return null;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)Lclient!tq;")
	public Class2 method2596() {
		this.anInt3097 = 0;
		return this.method2597();
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(Z)Lclient!tq;")
	public Class2 method2597() {
		@Pc(27) Class2 local27;
		if (this.anInt3097 > 0 && this.aClass2Array1[this.anInt3097 - 1] != this.aClass2_89) {
			local27 = this.aClass2_89;
			this.aClass2_89 = local27.aClass2_300;
			return local27;
		}
		while (this.anInt3097 < this.anInt3085) {
			local27 = this.aClass2Array1[this.anInt3097++].aClass2_300;
			if (local27 != this.aClass2Array1[this.anInt3097 - 1]) {
				this.aClass2_89 = local27.aClass2_300;
				return local27;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(I[Lclient!tq;)I")
	public int method2598(@OriginalArg(1) Class2[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt3085; local9++) {
			@Pc(16) Class2 local16 = this.aClass2Array1[local9];
			for (@Pc(19) Class2 local19 = local16.aClass2_300; local19 != local16; local19 = local19.aClass2_300) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(B)V")
	public void method2599() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3085; local7++) {
			@Pc(14) Class2 local14 = this.aClass2Array1[local7];
			while (true) {
				@Pc(17) Class2 local17 = local14.aClass2_300;
				if (local14 == local17) {
					break;
				}
				local17.method8653();
			}
		}
		this.aClass2_88 = null;
		this.aClass2_89 = null;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!tq;JB)V")
	public void method2601(@OriginalArg(0) Class2 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass2_299 != null) {
			arg0.method8653();
		}
		@Pc(21) Class2 local21 = this.aClass2Array1[(int) (arg1 & (long) (this.anInt3085 - 1))];
		arg0.aClass2_299 = local21.aClass2_299;
		arg0.aClass2_300 = local21;
		arg0.aClass2_299.aClass2_300 = arg0;
		arg0.aLong280 = arg1;
		arg0.aClass2_300.aClass2_299 = arg0;
	}

	@OriginalMember(owner = "client!gca", name = "d", descriptor = "(Z)I")
	public int method2602() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt3085; local9++) {
			@Pc(16) Class2 local16 = this.aClass2Array1[local9];
			for (@Pc(19) Class2 local19 = local16.aClass2_300; local19 != local16; local19 = local19.aClass2_300) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(I)Lclient!tq;")
	public Class2 method2605() {
		if (this.aClass2_88 == null) {
			return null;
		}
		@Pc(23) Class2 local23 = this.aClass2Array1[(int) (this.aLong92 & (long) (this.anInt3085 - 1))];
		while (this.aClass2_88 != local23) {
			if (this.aLong92 == this.aClass2_88.aLong280) {
				@Pc(35) Class2 local35 = this.aClass2_88;
				this.aClass2_88 = this.aClass2_88.aClass2_300;
				return local35;
			}
			this.aClass2_88 = this.aClass2_88.aClass2_300;
		}
		this.aClass2_88 = null;
		return null;
	}
}
