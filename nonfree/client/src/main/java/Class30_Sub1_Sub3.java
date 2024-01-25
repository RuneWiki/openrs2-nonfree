import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class30_Sub1_Sub3 extends Class30_Sub1 implements Interface19 {

	@OriginalMember(owner = "client!lq", name = "O", descriptor = "Lclient!nk;")
	private Class218 aClass218_3;

	@OriginalMember(owner = "client!lq", name = "P", descriptor = "Lclient!wc;")
	public final Class311 aClass311_2;

	@OriginalMember(owner = "client!lq", name = "G", descriptor = "Z")
	private final boolean aBoolean425;

	static {
		new Class88("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lclient!qa;Lclient!ss;IIIIIZIIIIIII)V")
	public Class30_Sub1_Sub3(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class279 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt8286 == 1, Static454.method6859(arg13, arg12));
		this.aClass311_2 = new Class311(arg0, arg1, arg12, arg13, super.aByte99, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean425 = arg1.anInt8276 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(ZLclient!qa;)Lclient!vw;")
	@Override
	public Class7_Sub8 method7908(@OriginalArg(1) Class42 arg0) {
		@Pc(18) Class26 local18 = this.aClass311_2.method7859(super.anInt9418, 2048, true, arg0, super.anInt9416, false);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class91 local25 = arg0.method5847();
		local25.oa(super.anInt9418, super.anInt9422, super.anInt9416);
		@Pc(35) Class7_Sub8 local35 = null;
		if (this.aBoolean425) {
			local35 = Static196.method3703(1);
		}
		if (this.aClass311_2.aClass7_Sub3_7 == null) {
			local18.method8003(local25, local35 == null ? null : local35.aClass7_Sub4Array1[0], 0);
		} else {
			@Pc(65) Class136 local65 = this.aClass311_2.aClass7_Sub3_7.method4202();
			arg0.method5864(local18, local65, local25, local35 == null ? null : local35.aClass7_Sub4Array1[0]);
		}
		if (this.aClass218_3 == null) {
			this.aClass218_3 = Static368.method5722(super.anInt9422, local18, super.anInt9418, super.anInt9416);
		} else {
			Static261.method4419(local18, super.anInt9416, this.aClass218_3, super.anInt9418, super.anInt9422);
		}
		this.aClass311_2.method7850(super.aShort115, super.aShort114, local18, arg0, super.aShort112, true, super.aShort113);
		return local35;
	}

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7901() {
		return false;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!qa;III)Z")
	@Override
	public boolean method7907(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(21) Class26 local21 = this.aClass311_2.method7859(super.anInt9418, 131072, false, arg0, super.anInt9416, false);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class91 local28 = arg0.method5847();
			local28.oa(super.anInt9418, super.anInt9422, super.anInt9416);
			return local21.method8005(arg1, arg2, local28, false);
		}
	}

	@OriginalMember(owner = "client!lq", name = "f", descriptor = "(I)V")
	@Override
	public void method7909() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lq", name = "h", descriptor = "(I)I")
	@Override
	public int method7815() {
		return this.aClass311_2.method7856();
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method7903(@OriginalArg(0) Class42 arg0) {
		@Pc(16) Class26 local16 = this.aClass311_2.method7859(super.anInt9418, 262144, true, arg0, super.anInt9416, true);
		if (local16 != null) {
			this.aClass311_2.method7850(super.aShort115, super.aShort114, local16, arg0, super.aShort112, false, super.aShort113);
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(BLclient!qa;I)Lclient!r;")
	@Override
	public Class26 method7917(@OriginalArg(1) Class42 arg0, @OriginalArg(2) int arg1) {
		return this.aClass311_2.method7859(0, arg1, false, arg0, 0, false);
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(Z)I")
	@Override
	public int method7918() {
		return this.aClass311_2.anInt9474;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Z)I")
	@Override
	public int method7915() {
		return this.aClass311_2.anInt9484;
	}

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7920() {
		return this.aClass311_2.method7860();
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method7921(@OriginalArg(1) Class42 arg0) {
		this.aClass311_2.method7851(arg0);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method7916(@OriginalArg(1) Class42 arg0) {
		this.aClass311_2.method7861(arg0);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V")
	@Override
	public void method7914() {
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)I")
	@Override
	public int method7919() {
		return this.aClass311_2.anInt9488;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IZIILclient!jt;ILclient!qa;)V")
	@Override
	public void method7904(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class30 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class42 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(ZLclient!qa;)Lclient!nk;")
	@Override
	public Class218 method7906(@OriginalArg(1) Class42 arg0) {
		return this.aClass218_3;
	}
}
