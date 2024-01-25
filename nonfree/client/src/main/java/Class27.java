import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class27 {

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "J")
	private long aLong20;

	@OriginalMember(owner = "client!bj", name = "o", descriptor = "Lclient!ki;")
	private Class1 aClass1_27;

	@OriginalMember(owner = "client!bj", name = "x", descriptor = "Lclient!ki;")
	private Class1 aClass1_28;

	@OriginalMember(owner = "client!bj", name = "z", descriptor = "I")
	private int anInt625 = 0;

	@OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
	public final int anInt622;

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "[Lclient!ki;")
	public final Class1[] aClass1Array1;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(I)V")
	public Class27(@OriginalArg(0) int arg0) {
		this.anInt622 = arg0;
		this.aClass1Array1 = new Class1[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_261 = local23;
			local23.aClass1_262 = local23;
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(BJ)Lclient!ki;")
	public Class1 method553(@OriginalArg(1) long arg0) {
		this.aLong20 = arg0;
		@Pc(18) Class1 local18 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt622 - 1))];
		for (this.aClass1_27 = local18.aClass1_261; this.aClass1_27 != local18; this.aClass1_27 = this.aClass1_27.aClass1_261) {
			if (this.aClass1_27.aLong227 == arg0) {
				@Pc(36) Class1 local36 = this.aClass1_27;
				this.aClass1_27 = this.aClass1_27.aClass1_261;
				return local36;
			}
		}
		this.aClass1_27 = null;
		return null;
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)Lclient!ki;")
	public Class1 method555() {
		this.anInt625 = 0;
		return this.method563();
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "([Lclient!ki;I)I")
	public int method558(@OriginalArg(0) Class1[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt622; local9++) {
			@Pc(19) Class1 local19 = this.aClass1Array1[local9];
			for (@Pc(22) Class1 local22 = local19.aClass1_261; local22 != local19; local22 = local22.aClass1_261) {
				arg0[local7++] = local22;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "(I)I")
	public int method561() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt622; local9++) {
			@Pc(16) Class1 local16 = this.aClass1Array1[local9];
			for (@Pc(19) Class1 local19 = local16.aClass1_261; local19 != local16; local19 = local19.aClass1_261) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "(I)I")
	public int method562() {
		return this.anInt622;
	}

	@OriginalMember(owner = "client!bj", name = "f", descriptor = "(I)Lclient!ki;")
	public Class1 method563() {
		@Pc(29) Class1 local29;
		if (this.anInt625 > 0 && this.aClass1_28 != this.aClass1Array1[this.anInt625 - 1]) {
			local29 = this.aClass1_28;
			this.aClass1_28 = local29.aClass1_261;
			return local29;
		}
		while (this.anInt622 > this.anInt625) {
			local29 = this.aClass1Array1[this.anInt625++].aClass1_261;
			if (local29 != this.aClass1Array1[this.anInt625 - 1]) {
				this.aClass1_28 = local29.aClass1_261;
				return local29;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(JBLclient!ki;)V")
	public void method564(@OriginalArg(0) long arg0, @OriginalArg(2) Class1 arg1) {
		if (arg1.aClass1_262 != null) {
			arg1.method6071();
		}
		@Pc(21) Class1 local21 = this.aClass1Array1[(int) ((long) (this.anInt622 - 1) & arg0)];
		arg1.aClass1_261 = local21;
		arg1.aClass1_262 = local21.aClass1_262;
		arg1.aClass1_262.aClass1_261 = arg1;
		arg1.aLong227 = arg0;
		arg1.aClass1_261.aClass1_262 = arg1;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)Lclient!ki;")
	public Class1 method565() {
		if (this.aClass1_27 == null) {
			return null;
		}
		@Pc(31) Class1 local31 = this.aClass1Array1[(int) (this.aLong20 & (long) (this.anInt622 - 1))];
		while (local31 != this.aClass1_27) {
			if (this.aClass1_27.aLong227 == this.aLong20) {
				@Pc(43) Class1 local43 = this.aClass1_27;
				this.aClass1_27 = this.aClass1_27.aClass1_261;
				return local43;
			}
			this.aClass1_27 = this.aClass1_27.aClass1_261;
		}
		this.aClass1_27 = null;
		return null;
	}

	@OriginalMember(owner = "client!bj", name = "g", descriptor = "(I)V")
	public void method566() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt622; local3++) {
			@Pc(10) Class1 local10 = this.aClass1Array1[local3];
			while (true) {
				@Pc(13) Class1 local13 = local10.aClass1_261;
				if (local10 == local13) {
					break;
				}
				local13.method6071();
			}
		}
		this.aClass1_28 = null;
		this.aClass1_27 = null;
	}
}
