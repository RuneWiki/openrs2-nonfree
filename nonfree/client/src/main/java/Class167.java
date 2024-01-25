import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class167 {

	@OriginalMember(owner = "client!mn", name = "f", descriptor = "Lclient!es;")
	private Class10 aClass10_155;

	@OriginalMember(owner = "client!mn", name = "p", descriptor = "J")
	private long aLong154;

	@OriginalMember(owner = "client!mn", name = "u", descriptor = "Lclient!es;")
	private Class10 aClass10_156;

	@OriginalMember(owner = "client!mn", name = "r", descriptor = "I")
	private int anInt4592 = 0;

	@OriginalMember(owner = "client!mn", name = "n", descriptor = "[Lclient!es;")
	public final Class10[] aClass10Array1;

	@OriginalMember(owner = "client!mn", name = "j", descriptor = "I")
	public final int anInt4588;

	static {
		new Class182("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
	}

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(I)V")
	public Class167(@OriginalArg(0) int arg0) {
		this.aClass10Array1 = new Class10[arg0];
		this.anInt4588 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class10 local23 = this.aClass10Array1[local13] = new Class10();
			local23.aClass10_263 = local23;
			local23.aClass10_264 = local23;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)I")
	public int method3698() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt4588; local9++) {
			@Pc(23) Class10 local23 = this.aClass10Array1[local9];
			@Pc(26) Class10 local26 = local23.aClass10_263;
			while (local26 != local23) {
				local26 = local26.aClass10_263;
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(B)V")
	public void method3701() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4588; local7++) {
			@Pc(14) Class10 local14 = this.aClass10Array1[local7];
			while (true) {
				@Pc(17) Class10 local17 = local14.aClass10_263;
				if (local17 == local14) {
					break;
				}
				local17.method6033();
			}
		}
		this.aClass10_156 = null;
		this.aClass10_155 = null;
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)Lclient!es;")
	public Class10 method3702() {
		this.anInt4592 = 0;
		return this.method3708();
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I[Lclient!es;)I")
	public int method3703(@OriginalArg(1) Class10[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt4588; local9++) {
			@Pc(16) Class10 local16 = this.aClass10Array1[local9];
			for (@Pc(19) Class10 local19 = local16.aClass10_263; local19 != local16; local19 = local19.aClass10_263) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(Z)I")
	public int method3704() {
		return this.anInt4588;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!es;JI)V")
	public void method3705(@OriginalArg(0) Class10 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass10_264 != null) {
			arg0.method6033();
		}
		@Pc(21) Class10 local21 = this.aClass10Array1[(int) ((long) (this.anInt4588 - 1) & arg1)];
		arg0.aClass10_264 = local21.aClass10_264;
		arg0.aClass10_263 = local21;
		arg0.aClass10_264.aClass10_263 = arg0;
		arg0.aLong264 = arg1;
		arg0.aClass10_263.aClass10_264 = arg0;
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)Lclient!es;")
	public Class10 method3707() {
		if (this.aClass10_155 == null) {
			return null;
		}
		@Pc(23) Class10 local23 = this.aClass10Array1[(int) ((long) (this.anInt4588 - 1) & this.aLong154)];
		while (this.aClass10_155 != local23) {
			if (this.aClass10_155.aLong264 == this.aLong154) {
				@Pc(39) Class10 local39 = this.aClass10_155;
				this.aClass10_155 = this.aClass10_155.aClass10_263;
				return local39;
			}
			this.aClass10_155 = this.aClass10_155.aClass10_263;
		}
		this.aClass10_155 = null;
		return null;
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(B)Lclient!es;")
	public Class10 method3708() {
		@Pc(27) Class10 local27;
		if (this.anInt4592 > 0 && this.aClass10_156 != this.aClass10Array1[this.anInt4592 - 1]) {
			local27 = this.aClass10_156;
			this.aClass10_156 = local27.aClass10_263;
			return local27;
		}
		while (this.anInt4588 > this.anInt4592) {
			local27 = this.aClass10Array1[this.anInt4592++].aClass10_263;
			if (this.aClass10Array1[this.anInt4592 - 1] != local27) {
				this.aClass10_156 = local27.aClass10_263;
				return local27;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(JI)Lclient!es;")
	public Class10 method3709(@OriginalArg(0) long arg0) {
		this.aLong154 = arg0;
		@Pc(28) Class10 local28 = this.aClass10Array1[(int) ((long) (this.anInt4588 - 1) & arg0)];
		for (this.aClass10_155 = local28.aClass10_263; this.aClass10_155 != local28; this.aClass10_155 = this.aClass10_155.aClass10_263) {
			if (arg0 == this.aClass10_155.aLong264) {
				@Pc(47) Class10 local47 = this.aClass10_155;
				this.aClass10_155 = this.aClass10_155.aClass10_263;
				return local47;
			}
		}
		this.aClass10_155 = null;
		return null;
	}
}
