import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class129 {

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "J")
	private long aLong142;

	@OriginalMember(owner = "client!pd", name = "q", descriptor = "Lclient!vb;")
	private Class8 aClass8_158;

	@OriginalMember(owner = "client!pd", name = "A", descriptor = "Lclient!vb;")
	private Class8 aClass8_159;

	@OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
	private int anInt3912 = 0;

	@OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
	public int anInt3910;

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "[Lclient!vb;")
	public Class8[] aClass8Array1;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(I)V")
	public Class129(@OriginalArg(0) int arg0) {
		this.anInt3910 = arg0;
		this.aClass8Array1 = new Class8[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(25) Class8 local25 = this.aClass8Array1[local13] = new Class8();
			local25.aClass8_229 = local25;
			local25.aClass8_228 = local25;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)Lclient!vb;")
	public Class8 method3035() {
		this.anInt3912 = 0;
		return this.method3048();
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)Lclient!vb;")
	public Class8 method3037() {
		if (this.aClass8_158 == null) {
			return null;
		}
		@Pc(30) Class8 local30 = this.aClass8Array1[(int) ((long) (this.anInt3910 - 1) & this.aLong142)];
		while (local30 != this.aClass8_158) {
			if (this.aLong142 == this.aClass8_158.aLong203) {
				@Pc(49) Class8 local49 = this.aClass8_158;
				this.aClass8_158 = this.aClass8_158.aClass8_229;
				return local49;
			}
			this.aClass8_158 = this.aClass8_158.aClass8_229;
		}
		this.aClass8_158 = null;
		return null;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!vb;IJ)V")
	public void method3039(@OriginalArg(0) Class8 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass8_228 != null) {
			arg0.method4273();
		}
		@Pc(21) Class8 local21 = this.aClass8Array1[(int) (arg1 & (long) (this.anInt3910 - 1))];
		arg0.aLong203 = arg1;
		arg0.aClass8_229 = local21;
		arg0.aClass8_228 = local21.aClass8_228;
		arg0.aClass8_228.aClass8_229 = arg0;
		arg0.aClass8_229.aClass8_228 = arg0;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)I")
	public int method3040() {
		@Pc(7) int local7 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt3910; local15++) {
			@Pc(28) Class8 local28 = this.aClass8Array1[local15];
			@Pc(31) Class8 local31 = local28.aClass8_229;
			while (local28 != local31) {
				local31 = local31.aClass8_229;
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(B)I")
	public int method3041() {
		return this.anInt3910;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(JB)Lclient!vb;")
	public Class8 method3043(@OriginalArg(0) long arg0) {
		this.aLong142 = arg0;
		@Pc(14) Class8 local14 = this.aClass8Array1[(int) (arg0 & (long) (this.anInt3910 - 1))];
		for (this.aClass8_158 = local14.aClass8_229; this.aClass8_158 != local14; this.aClass8_158 = this.aClass8_158.aClass8_229) {
			if (arg0 == this.aClass8_158.aLong203) {
				@Pc(39) Class8 local39 = this.aClass8_158;
				this.aClass8_158 = this.aClass8_158.aClass8_229;
				return local39;
			}
		}
		this.aClass8_158 = null;
		return null;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "([Lclient!vb;I)I")
	public int method3045(@OriginalArg(0) Class8[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt3910; local9++) {
			@Pc(22) Class8 local22 = this.aClass8Array1[local9];
			for (@Pc(25) Class8 local25 = local22.aClass8_229; local25 != local22; local25 = local25.aClass8_229) {
				arg0[local7++] = local25;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)V")
	public void method3047() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3910; local3++) {
			@Pc(16) Class8 local16 = this.aClass8Array1[local3];
			while (true) {
				@Pc(19) Class8 local19 = local16.aClass8_229;
				if (local19 == local16) {
					break;
				}
				local19.method4273();
			}
		}
		this.aClass8_159 = null;
		this.aClass8_158 = null;
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)Lclient!vb;")
	public Class8 method3048() {
		@Pc(29) Class8 local29;
		if (this.anInt3912 > 0 && this.aClass8Array1[this.anInt3912 - 1] != this.aClass8_159) {
			local29 = this.aClass8_159;
			this.aClass8_159 = local29.aClass8_229;
			return local29;
		}
		do {
			if (this.anInt3912 >= this.anInt3910) {
				return null;
			}
			local29 = this.aClass8Array1[this.anInt3912++].aClass8_229;
		} while (this.aClass8Array1[this.anInt3912 - 1] == local29);
		this.aClass8_159 = local29.aClass8_229;
		return local29;
	}
}
