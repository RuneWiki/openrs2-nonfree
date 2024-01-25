import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class25 {

	@OriginalMember(owner = "client!bn", name = "p", descriptor = "Lclient!tf;")
	private Class14 aClass14_25;

	@OriginalMember(owner = "client!bn", name = "q", descriptor = "J")
	private long aLong18;

	@OriginalMember(owner = "client!bn", name = "y", descriptor = "Lclient!tf;")
	private Class14 aClass14_26;

	@OriginalMember(owner = "client!bn", name = "z", descriptor = "I")
	private int anInt626 = 0;

	@OriginalMember(owner = "client!bn", name = "s", descriptor = "I")
	public final int anInt622;

	@OriginalMember(owner = "client!bn", name = "v", descriptor = "[Lclient!tf;")
	public final Class14[] aClass14Array1;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(I)V")
	public Class25(@OriginalArg(0) int arg0) {
		this.anInt622 = arg0;
		this.aClass14Array1 = new Class14[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class14 local23 = this.aClass14Array1[local13] = new Class14();
			local23.aClass14_247 = local23;
			local23.aClass14_248 = local23;
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)I")
	public int method684() {
		return this.anInt622;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V")
	public void method685() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt622; local3++) {
			@Pc(10) Class14 local10 = this.aClass14Array1[local3];
			while (true) {
				@Pc(13) Class14 local13 = local10.aClass14_248;
				if (local10 == local13) {
					break;
				}
				local13.method5986();
			}
		}
		this.aClass14_25 = null;
		this.aClass14_26 = null;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(JLclient!tf;I)V")
	public void method687(@OriginalArg(0) long arg0, @OriginalArg(1) Class14 arg1) {
		if (arg1.aClass14_247 != null) {
			arg1.method5986();
		}
		@Pc(29) Class14 local29 = this.aClass14Array1[(int) ((long) (this.anInt622 - 1) & arg0)];
		arg1.aClass14_248 = local29;
		arg1.aClass14_247 = local29.aClass14_247;
		arg1.aClass14_247.aClass14_248 = arg1;
		arg1.aLong217 = arg0;
		arg1.aClass14_248.aClass14_247 = arg1;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IJ)Lclient!tf;")
	public Class14 method691(@OriginalArg(1) long arg0) {
		this.aLong18 = arg0;
		@Pc(25) Class14 local25 = this.aClass14Array1[(int) ((long) (this.anInt622 - 1) & arg0)];
		for (this.aClass14_25 = local25.aClass14_248; this.aClass14_25 != local25; this.aClass14_25 = this.aClass14_25.aClass14_248) {
			if (this.aClass14_25.aLong217 == arg0) {
				@Pc(40) Class14 local40 = this.aClass14_25;
				this.aClass14_25 = this.aClass14_25.aClass14_248;
				return local40;
			}
		}
		this.aClass14_25 = null;
		return null;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z)Lclient!tf;")
	public Class14 method692() {
		if (this.aClass14_25 == null) {
			return null;
		}
		@Pc(28) Class14 local28 = this.aClass14Array1[(int) (this.aLong18 & (long) (this.anInt622 - 1))];
		while (local28 != this.aClass14_25) {
			if (this.aClass14_25.aLong217 == this.aLong18) {
				@Pc(44) Class14 local44 = this.aClass14_25;
				this.aClass14_25 = this.aClass14_25.aClass14_248;
				return local44;
			}
			this.aClass14_25 = this.aClass14_25.aClass14_248;
		}
		this.aClass14_25 = null;
		return null;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(B[Lclient!tf;)I")
	public int method693(@OriginalArg(1) Class14[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt622; local9++) {
			@Pc(16) Class14 local16 = this.aClass14Array1[local9];
			for (@Pc(19) Class14 local19 = local16.aClass14_248; local19 != local16; local19 = local19.aClass14_248) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)Lclient!tf;")
	public Class14 method694() {
		@Pc(22) Class14 local22;
		if (this.anInt626 > 0 && this.aClass14_26 != this.aClass14Array1[this.anInt626 - 1]) {
			local22 = this.aClass14_26;
			this.aClass14_26 = local22.aClass14_248;
			return local22;
		}
		while (this.anInt622 > this.anInt626) {
			local22 = this.aClass14Array1[this.anInt626++].aClass14_248;
			if (this.aClass14Array1[this.anInt626 - 1] != local22) {
				this.aClass14_26 = local22.aClass14_248;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(Z)Lclient!tf;")
	public Class14 method697() {
		this.anInt626 = 0;
		return this.method694();
	}

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "(I)I")
	public int method699() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt622; local9++) {
			@Pc(16) Class14 local16 = this.aClass14Array1[local9];
			for (@Pc(19) Class14 local19 = local16.aClass14_248; local19 != local16; local19 = local19.aClass14_248) {
				local7++;
			}
		}
		return local7;
	}
}
