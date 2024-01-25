import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class257 {

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "Lclient!kp;")
	private Class1 aClass1_253;

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "J")
	private long aLong218;

	@OriginalMember(owner = "client!wa", name = "p", descriptor = "Lclient!kp;")
	private Class1 aClass1_254;

	@OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
	private int anInt7284 = 0;

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
	public final int anInt7279;

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "[Lclient!kp;")
	public final Class1[] aClass1Array1;

	static {
		new Class151("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(I)V")
	public Class257(@OriginalArg(0) int arg0) {
		this.anInt7279 = arg0;
		this.aClass1Array1 = new Class1[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_262 = local23;
			local23.aClass1_261 = local23;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(B[Lclient!kp;)I")
	public int method5497(@OriginalArg(1) Class1[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt7279; local14++) {
			@Pc(21) Class1 local21 = this.aClass1Array1[local14];
			for (@Pc(24) Class1 local24 = local21.aClass1_262; local24 != local21; local24 = local24.aClass1_262) {
				arg0[local7++] = local24;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)I")
	public int method5498() {
		return this.anInt7279;
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
	public void method5499() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7279; local3++) {
			@Pc(10) Class1 local10 = this.aClass1Array1[local3];
			while (true) {
				@Pc(13) Class1 local13 = local10.aClass1_262;
				if (local13 == local10) {
					break;
				}
				local13.method5617();
			}
		}
		this.aClass1_253 = null;
		this.aClass1_254 = null;
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)I")
	public int method5500() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt7279; local9++) {
			@Pc(16) Class1 local16 = this.aClass1Array1[local9];
			for (@Pc(19) Class1 local19 = local16.aClass1_262; local19 != local16; local19 = local19.aClass1_262) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)Lclient!kp;")
	public Class1 method5501() {
		@Pc(19) Class1 local19;
		if (this.anInt7284 > 0 && this.aClass1_254 != this.aClass1Array1[this.anInt7284 - 1]) {
			local19 = this.aClass1_254;
			this.aClass1_254 = local19.aClass1_262;
			return local19;
		}
		while (this.anInt7279 > this.anInt7284) {
			local19 = this.aClass1Array1[this.anInt7284++].aClass1_262;
			if (local19 != this.aClass1Array1[this.anInt7284 - 1]) {
				this.aClass1_254 = local19.aClass1_262;
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZJ)Lclient!kp;")
	public Class1 method5503(@OriginalArg(1) long arg0) {
		this.aLong218 = arg0;
		@Pc(26) Class1 local26 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt7279 - 1))];
		for (this.aClass1_253 = local26.aClass1_262; this.aClass1_253 != local26; this.aClass1_253 = this.aClass1_253.aClass1_262) {
			if (arg0 == this.aClass1_253.aLong226) {
				@Pc(41) Class1 local41 = this.aClass1_253;
				this.aClass1_253 = this.aClass1_253.aClass1_262;
				return local41;
			}
		}
		this.aClass1_253 = null;
		return null;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!kp;JI)V")
	public void method5504(@OriginalArg(0) Class1 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass1_261 != null) {
			arg0.method5617();
		}
		@Pc(30) Class1 local30 = this.aClass1Array1[(int) ((long) (this.anInt7279 - 1) & arg1)];
		arg0.aClass1_261 = local30.aClass1_261;
		arg0.aClass1_262 = local30;
		arg0.aClass1_261.aClass1_262 = arg0;
		arg0.aLong226 = arg1;
		arg0.aClass1_262.aClass1_261 = arg0;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)Lclient!kp;")
	public Class1 method5506() {
		this.anInt7284 = 0;
		return this.method5501();
	}

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "(I)Lclient!kp;")
	public Class1 method5507() {
		if (this.aClass1_253 == null) {
			return null;
		}
		@Pc(31) Class1 local31 = this.aClass1Array1[(int) ((long) (this.anInt7279 - 1) & this.aLong218)];
		while (local31 != this.aClass1_253) {
			if (this.aClass1_253.aLong226 == this.aLong218) {
				@Pc(43) Class1 local43 = this.aClass1_253;
				this.aClass1_253 = this.aClass1_253.aClass1_262;
				return local43;
			}
			this.aClass1_253 = this.aClass1_253.aClass1_262;
		}
		this.aClass1_253 = null;
		return null;
	}
}
