import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class30_Sub2_Sub3 extends Class30_Sub2 implements Interface19 {

	@OriginalMember(owner = "client!ut", name = "j", descriptor = "Lclient!nk;")
	private Class218 aClass218_6;

	@OriginalMember(owner = "client!ut", name = "p", descriptor = "Lclient!wc;")
	public final Class311 aClass311_4;

	@OriginalMember(owner = "client!ut", name = "v", descriptor = "Z")
	private final boolean aBoolean643;

	static {
		new Class88("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
	}

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lclient!qa;Lclient!ss;IIIIIZIII)V")
	public Class30_Sub2_Sub3(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class279 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static435.method6629(arg9, arg8));
		this.aClass311_4 = new Class311(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt9035, super.anInt9036, arg7, arg10);
		this.aBoolean643 = arg1.anInt8276 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!ut", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7901() {
		return false;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(BLclient!qa;I)Lclient!r;")
	@Override
	public Class26 method7917(@OriginalArg(1) Class42 arg0, @OriginalArg(2) int arg1) {
		return this.aClass311_4.method7859(0, arg1, false, arg0, 0, false);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!qa;III)Z")
	@Override
	public boolean method7907(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class26 local16 = this.aClass311_4.method7859(super.anInt9035, 131072, false, arg0, super.anInt9036, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class91 local23 = arg0.method5847();
			local23.oa(super.anInt9035, super.anInt9034, super.anInt9036);
			return local16.method8005(arg1, arg2, local23, false);
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method7916(@OriginalArg(1) Class42 arg0) {
		this.aClass311_4.method7861(arg0);
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(ZLclient!qa;)Lclient!vw;")
	@Override
	public Class7_Sub8 method7908(@OriginalArg(1) Class42 arg0) {
		@Pc(18) Class26 local18 = this.aClass311_4.method7859(super.anInt9035, 2048, true, arg0, super.anInt9036, false);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class91 local25 = arg0.method5847();
		local25.oa(super.anInt9035, super.anInt9034, super.anInt9036);
		@Pc(35) Class7_Sub8 local35 = null;
		if (this.aBoolean643) {
			local35 = Static196.method3703(1);
		}
		if (this.aClass311_4.aClass7_Sub3_7 == null) {
			local18.method8003(local25, local35 == null ? null : local35.aClass7_Sub4Array1[0], 0);
		} else {
			@Pc(65) Class136 local65 = this.aClass311_4.aClass7_Sub3_7.method4202();
			arg0.method5864(local18, local65, local25, local35 == null ? null : local35.aClass7_Sub4Array1[0]);
		}
		if (this.aClass218_6 == null) {
			this.aClass218_6 = Static368.method5722(super.anInt9034, local18, super.anInt9035, super.anInt9036);
		} else {
			Static261.method4419(local18, super.anInt9036, this.aClass218_6, super.anInt9035, super.anInt9034);
		}
		@Pc(111) int local111 = super.anInt9035 >> 7;
		@Pc(116) int local116 = super.anInt9036 >> 7;
		this.aClass311_4.method7850(local111, local116, local18, arg0, local116, true, local111);
		return local35;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ZLclient!qa;)Lclient!nk;")
	@Override
	public Class218 method7906(@OriginalArg(1) Class42 arg0) {
		return this.aClass218_6;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IZIILclient!jt;ILclient!qa;)V")
	@Override
	public void method7904(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class30 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class42 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7920() {
		return this.aClass311_4.method7860();
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Z)I")
	@Override
	public int method7915() {
		return this.aClass311_4.anInt9484;
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)I")
	@Override
	public int method7919() {
		return this.aClass311_4.anInt9488;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V")
	@Override
	public void method7914() {
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method7903(@OriginalArg(0) Class42 arg0) {
		@Pc(16) Class26 local16 = this.aClass311_4.method7859(super.anInt9035, 262144, true, arg0, super.anInt9036, true);
		if (local16 != null) {
			@Pc(28) int local28 = super.anInt9035 >> 7;
			@Pc(33) int local33 = super.anInt9036 >> 7;
			this.aClass311_4.method7850(local28, local33, local16, arg0, local33, false, local28);
		}
	}

	@OriginalMember(owner = "client!ut", name = "f", descriptor = "(I)V")
	@Override
	public void method7909() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method7921(@OriginalArg(1) Class42 arg0) {
		this.aClass311_4.method7851(arg0);
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(Z)I")
	@Override
	public int method7918() {
		return this.aClass311_4.anInt9474;
	}
}
