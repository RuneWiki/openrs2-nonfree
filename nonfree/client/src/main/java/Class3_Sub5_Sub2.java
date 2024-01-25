import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rt")
public final class Class3_Sub5_Sub2 extends Class3_Sub5 implements Interface2 {

	@OriginalMember(owner = "client!rt", name = "C", descriptor = "Lclient!dj;")
	public final Class53 aClass53_1;

	@OriginalMember(owner = "client!rt", name = "v", descriptor = "Z")
	private final boolean aBoolean441;

	static {
		new Class134("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
	}

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Lclient!za;Lclient!pm;IIIIIZII)V")
	public Class3_Sub5_Sub2(@OriginalArg(0) Class163 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.anInt5330, arg1.aBoolean394, arg1.aBoolean398);
		this.aClass53_1 = new Class53(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean441 = arg1.anInt5357 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lclient!lb;IZIBILclient!za;)V")
	@Override
	public void method5281(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class163 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(I)V")
	@Override
	public void method5297() {
	}

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5285(@OriginalArg(0) Class163 arg0) {
		@Pc(21) Class59 local21 = this.aClass53_1.method1093(super.anInt6620, true, arg0, 262144, super.anInt6616, true);
		if (local21 != null) {
			@Pc(28) int local28 = super.anInt6616 >> 7;
			@Pc(33) int local33 = super.anInt6620 >> 7;
			this.aClass53_1.method1088(arg0, local33, local28, local28, false, local21, local33);
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)I")
	@Override
	public int method5292() {
		return this.aClass53_1.anInt1413;
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5294(@OriginalArg(0) Class163 arg0) {
		this.aClass53_1.method1100(arg0);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)I")
	@Override
	public int method5296() {
		return this.aClass53_1.anInt1391;
	}

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5277() {
		return false;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IBILclient!za;)Z")
	@Override
	public boolean method5282(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class163 arg2) {
		@Pc(21) Class59 local21 = this.aClass53_1.method1093(super.anInt6620, false, arg2, 131072, super.anInt6616, false);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class31 local28 = arg2.method5539();
			local28.U(super.anInt6616, super.anInt6617, super.anInt6620);
			return local21.method5748(arg1, arg0, local28, false);
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5293(@OriginalArg(0) Class163 arg0) {
		this.aClass53_1.method1087(arg0);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(BLclient!za;)Lclient!ql;")
	@Override
	public Class21_Sub6 method5280(@OriginalArg(1) Class163 arg0) {
		@Pc(16) Class59 local16 = this.aClass53_1.method1093(super.anInt6620, false, arg0, 2048, super.anInt6616, true);
		if (local16 == null) {
			return null;
		}
		@Pc(30) Class31 local30 = arg0.method5539();
		local30.U(super.anInt6616, super.anInt6617, super.anInt6620);
		@Pc(40) Class21_Sub6 local40 = null;
		if (this.aBoolean441) {
			local40 = Static209.method2805(1);
		}
		if (this.aClass53_1.aClass21_Sub2_2 == null) {
			local16.method5736(local30, local40 == null ? null : local40.aClass21_Sub7Array1[0], 0);
		} else {
			@Pc(56) Class256 local56 = this.aClass53_1.aClass21_Sub2_2.method634();
			arg0.method5551(local16, local56, local30, local40 == null ? null : local40.aClass21_Sub7Array1[0]);
		}
		@Pc(89) int local89 = super.anInt6616 >> 7;
		@Pc(94) int local94 = super.anInt6620 >> 7;
		this.aClass53_1.method1088(arg0, local94, local89, local89, true, local16, local94);
		return local40;
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5295() {
		return this.aClass53_1.method1090();
	}

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "(I)V")
	@Override
	public void method5284() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(ILclient!za;B)Lclient!e;")
	@Override
	public Class59 method5291(@OriginalArg(0) int arg0, @OriginalArg(1) Class163 arg1) {
		return this.aClass53_1.method1093(0, false, arg1, arg0, 0, false);
	}

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "(B)I")
	@Override
	public int method5298() {
		return this.aClass53_1.anInt1408;
	}
}
