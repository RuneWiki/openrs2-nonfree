import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mp")
public final class Class222 {

	@OriginalMember(owner = "client!mp", name = "e", descriptor = "J")
	private long aLong186;

	@OriginalMember(owner = "client!mp", name = "f", descriptor = "Lclient!tq;")
	private Class2 aClass2_183;

	@OriginalMember(owner = "client!mp", name = "r", descriptor = "Lclient!tq;")
	private Class2 aClass2_184;

	@OriginalMember(owner = "client!mp", name = "n", descriptor = "I")
	private int anInt6506 = 0;

	@OriginalMember(owner = "client!mp", name = "g", descriptor = "I")
	public final int anInt6499;

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "[Lclient!tq;")
	public final Class2[] aClass2Array1;

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(I)V")
	public Class222(@OriginalArg(0) int arg0) {
		this.anInt6499 = arg0;
		this.aClass2Array1 = new Class2[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local13] = new Class2();
			local23.aClass2_299 = local23;
			local23.aClass2_300 = local23;
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(I[Lclient!tq;)I")
	public int method5466(@OriginalArg(1) Class2[] arg0) {
		@Pc(5) int local5 = 0;
		for (@Pc(13) int local13 = 0; local13 < this.anInt6499; local13++) {
			@Pc(19) Class2 local19 = this.aClass2Array1[local13];
			for (@Pc(22) Class2 local22 = local19.aClass2_300; local22 != local19; local22 = local22.aClass2_300) {
				arg0[local5++] = local22;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(ZJ)Lclient!tq;")
	public Class2 method5468(@OriginalArg(1) long arg0) {
		this.aLong186 = arg0;
		@Pc(23) Class2 local23 = this.aClass2Array1[(int) ((long) (this.anInt6499 - 1) & arg0)];
		for (this.aClass2_183 = local23.aClass2_300; this.aClass2_183 != local23; this.aClass2_183 = this.aClass2_183.aClass2_300) {
			if (arg0 == this.aClass2_183.aLong287) {
				@Pc(41) Class2 local41 = this.aClass2_183;
				this.aClass2_183 = this.aClass2_183.aClass2_300;
				return local41;
			}
		}
		this.aClass2_183 = null;
		return null;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)V")
	public void method5469() {
		for (@Pc(9) int local9 = 0; local9 < this.anInt6499; local9++) {
			@Pc(15) Class2 local15 = this.aClass2Array1[local9];
			while (true) {
				@Pc(18) Class2 local18 = local15.aClass2_300;
				if (local15 == local18) {
					break;
				}
				local18.method8599();
			}
		}
		this.aClass2_184 = null;
		this.aClass2_183 = null;
	}

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "(I)I")
	public int method5471() {
		return this.anInt6499;
	}

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "(I)Lclient!tq;")
	public Class2 method5472() {
		@Pc(22) Class2 local22;
		if (this.anInt6506 > 0 && this.aClass2_184 != this.aClass2Array1[this.anInt6506 - 1]) {
			local22 = this.aClass2_184;
			this.aClass2_184 = local22.aClass2_300;
			return local22;
		}
		while (this.anInt6499 > this.anInt6506) {
			local22 = this.aClass2Array1[this.anInt6506++].aClass2_300;
			if (this.aClass2Array1[this.anInt6506 - 1] != local22) {
				this.aClass2_184 = local22.aClass2_300;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(Z)I")
	public int method5473() {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt6499; local7++) {
			@Pc(17) Class2 local17 = this.aClass2Array1[local7];
			@Pc(20) Class2 local20 = local17.aClass2_300;
			while (local20 != local17) {
				local20 = local20.aClass2_300;
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "(Z)Lclient!tq;")
	public Class2 method5474() {
		this.anInt6506 = 0;
		return this.method5472();
	}

	@OriginalMember(owner = "client!mp", name = "d", descriptor = "(I)Lclient!tq;")
	public Class2 method5475() {
		if (this.aClass2_183 == null) {
			return null;
		}
		@Pc(27) Class2 local27 = this.aClass2Array1[(int) (this.aLong186 & (long) (this.anInt6499 - 1))];
		while (local27 != this.aClass2_183) {
			if (this.aLong186 == this.aClass2_183.aLong287) {
				@Pc(42) Class2 local42 = this.aClass2_183;
				this.aClass2_183 = this.aClass2_183.aClass2_300;
				return local42;
			}
			this.aClass2_183 = this.aClass2_183.aClass2_300;
		}
		this.aClass2_183 = null;
		return null;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lclient!tq;BJ)V")
	public void method5476(@OriginalArg(0) Class2 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass2_299 != null) {
			arg0.method8599();
		}
		@Pc(21) Class2 local21 = this.aClass2Array1[(int) ((long) (this.anInt6499 - 1) & arg1)];
		arg0.aClass2_299 = local21.aClass2_299;
		arg0.aClass2_300 = local21;
		arg0.aClass2_299.aClass2_300 = arg0;
		arg0.aLong287 = arg1;
		arg0.aClass2_300.aClass2_299 = arg0;
	}
}
