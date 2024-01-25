import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dea")
public final class Class68 {

	@OriginalMember(owner = "client!dea", name = "c", descriptor = "Lclient!ik;")
	private Class12 aClass12_43;

	@OriginalMember(owner = "client!dea", name = "l", descriptor = "J")
	private long aLong41;

	@OriginalMember(owner = "client!dea", name = "s", descriptor = "Lclient!ik;")
	private Class12 aClass12_44;

	@OriginalMember(owner = "client!dea", name = "w", descriptor = "I")
	private int anInt2085 = 0;

	@OriginalMember(owner = "client!dea", name = "p", descriptor = "[Lclient!ik;")
	public final Class12[] aClass12Array1;

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "I")
	public final int anInt2073;

	static {
		new Class88("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
	}

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(I)V")
	public Class68(@OriginalArg(0) int arg0) {
		this.aClass12Array1 = new Class12[arg0];
		this.anInt2073 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class12 local23 = this.aClass12Array1[local13] = new Class12();
			local23.aClass12_283 = local23;
			local23.aClass12_284 = local23;
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lclient!ik;JI)V")
	public void method1916(@OriginalArg(0) Class12 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass12_284 != null) {
			arg0.method7967();
		}
		@Pc(25) Class12 local25 = this.aClass12Array1[(int) ((long) (this.anInt2073 - 1) & arg1)];
		arg0.aClass12_284 = local25.aClass12_284;
		arg0.aClass12_283 = local25;
		arg0.aClass12_284.aClass12_283 = arg0;
		arg0.aLong248 = arg1;
		arg0.aClass12_283.aClass12_284 = arg0;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(IJ)Lclient!ik;")
	public Class12 method1917(@OriginalArg(1) long arg0) {
		this.aLong41 = arg0;
		@Pc(20) Class12 local20 = this.aClass12Array1[(int) (arg0 & (long) (this.anInt2073 - 1))];
		for (this.aClass12_43 = local20.aClass12_283; this.aClass12_43 != local20; this.aClass12_43 = this.aClass12_43.aClass12_283) {
			if (arg0 == this.aClass12_43.aLong248) {
				@Pc(39) Class12 local39 = this.aClass12_43;
				this.aClass12_43 = this.aClass12_43.aClass12_283;
				return local39;
			}
		}
		this.aClass12_43 = null;
		return null;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)Lclient!ik;")
	public Class12 method1918() {
		if (this.aClass12_43 == null) {
			return null;
		}
		@Pc(23) Class12 local23 = this.aClass12Array1[(int) (this.aLong41 & (long) (this.anInt2073 - 1))];
		while (local23 != this.aClass12_43) {
			if (this.aClass12_43.aLong248 == this.aLong41) {
				@Pc(35) Class12 local35 = this.aClass12_43;
				this.aClass12_43 = this.aClass12_43.aClass12_283;
				return local35;
			}
			this.aClass12_43 = this.aClass12_43.aClass12_283;
		}
		this.aClass12_43 = null;
		return null;
	}

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "(I)I")
	public int method1919() {
		return this.anInt2073;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(B)Lclient!ik;")
	public Class12 method1920() {
		@Pc(27) Class12 local27;
		if (this.anInt2085 > 0 && this.aClass12Array1[this.anInt2085 - 1] != this.aClass12_44) {
			local27 = this.aClass12_44;
			this.aClass12_44 = local27.aClass12_283;
			return local27;
		}
		while (this.anInt2085 < this.anInt2073) {
			local27 = this.aClass12Array1[this.anInt2085++].aClass12_283;
			if (this.aClass12Array1[this.anInt2085 - 1] != local27) {
				this.aClass12_44 = local27.aClass12_283;
				return local27;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "([Lclient!ik;I)I")
	public int method1921(@OriginalArg(0) Class12[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt2073; local14++) {
			@Pc(21) Class12 local21 = this.aClass12Array1[local14];
			for (@Pc(24) Class12 local24 = local21.aClass12_283; local24 != local21; local24 = local24.aClass12_283) {
				arg0[local7++] = local24;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!dea", name = "c", descriptor = "(I)V")
	public void method1922() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2073; local7++) {
			@Pc(14) Class12 local14 = this.aClass12Array1[local7];
			while (true) {
				@Pc(17) Class12 local17 = local14.aClass12_283;
				if (local14 == local17) {
					break;
				}
				local17.method7967();
			}
		}
		this.aClass12_43 = null;
		this.aClass12_44 = null;
	}

	@OriginalMember(owner = "client!dea", name = "d", descriptor = "(I)Lclient!ik;")
	public Class12 method1923() {
		this.anInt2085 = 0;
		return this.method1920();
	}

	@OriginalMember(owner = "client!dea", name = "f", descriptor = "(I)I")
	public int method1925() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt2073; local9++) {
			@Pc(16) Class12 local16 = this.aClass12Array1[local9];
			for (@Pc(19) Class12 local19 = local16.aClass12_283; local19 != local16; local19 = local19.aClass12_283) {
				local7++;
			}
		}
		return local7;
	}
}
